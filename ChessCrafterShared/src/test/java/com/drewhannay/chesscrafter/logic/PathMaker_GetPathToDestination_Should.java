package com.drewhannay.chesscrafter.logic;

import com.drewhannay.chesscrafter.models.BoardCoordinate;
import com.drewhannay.chesscrafter.models.PieceType;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PathMaker_GetPathToDestination_Should {
    @Test
    public void return7Spaces() {
        PathMaker target = new PathMaker(BoardCoordinate.at(1, 1), BoardCoordinate.at(8, 1));
        assertEquals(7, target.getPathToDestination(PieceType.UNLIMITED).size());
    }

    @Test
    public void returnEmptyListFor1_1And2_3() {
        PathMaker target = new PathMaker(BoardCoordinate.at(1, 1), BoardCoordinate.at(2, 3));
        assertTrue(target.getPathToDestination(PieceType.UNLIMITED).isEmpty());
    }

    @Test
    public void notReturn1_1Given1_1And8_1() {
        PathMaker target = new PathMaker(BoardCoordinate.at(1, 1), BoardCoordinate.at(8, 1));
        List<BoardCoordinate> moves = target.getPathToDestination(PieceType.UNLIMITED);
        assertFalse(moves.contains(BoardCoordinate.at(1, 1)));
    }
}