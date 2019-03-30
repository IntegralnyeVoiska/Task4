package by.bntu.fitr.poisit.integralnyevoiska.task4.test;

import by.bntu.fitr.poisit.integralnyevoiska.task4.model.logic.LocMinCounter;
import by.bntu.fitr.poisit.integralnyevoiska.task4.model.entity.Matrix;
import org.junit.Test;
import org.junit.Assert;
public class MyClassTest {

    @Test
    public void testLocMinInAllTheSame()
    {
        Matrix matrix = new Matrix(new int[][]{
                {0,0,0},
                {0,0,0},
                {0,0,0}}
        );
        int expected = 0;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testLocMinInTheCentre()
    {
        Matrix matrix = new Matrix(new int[][]{
                {0,0,0},
                {0,-1,0},
                {0,0,0}}
        );
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testLocMinInTheRightUpCorner()
    {
        Matrix matrix = new Matrix(new int[][]{
                {-1,0,0},
                {0,0,0},
                {0,0,0}}
        );
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testLocMinInTheMiddleUp()
    {
        Matrix matrix = new Matrix(new int [][] {
                {0,-1,0},
                {0,0,0},
                {0,0,0}}
        );
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testLocMinInTheLeftUpCorner()
    {
        Matrix matrix = new Matrix(new int[][] {
                {0,0,-1},
                {0,0,0},
                {0,0,0}}
        );
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testLocMinInTheMiddleLeft()
    {
        Matrix matrix = new Matrix(new int[][]{
                {0,0,0},
                {-1,0,0},
                {0,0,0}}
        );
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testLocMinInTheMiddleRight()
    {
        Matrix matrix = new Matrix(new int[][] {
                {0,0,0},
                {0,0,-1},
                {0,0,0}}
        );
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testLocMinInTheLeftDownCorner()
    {
        Matrix matrix = new Matrix(new int[][] {
                {0,0,0},
                {0,0,0},
                {-1,0,0}}
        );
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testLocMinInTheMiddleDown()
    {
        Matrix matrix = new Matrix(new int[][]{
                {0,0,0},
                {0,0,0},
                {0,-1,0}}
        );
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testLocMinInTheRightDownCorner()
    {
        Matrix matrix = new Matrix(new int[][] {
                {0,0,0},
                {0,0,0},
                {0,0,-1}}
        );
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testLocMinInAllDifferent()
    {
        Matrix matrix = new Matrix(new int[][]{
                {5,-8,4},
                {2,3,-9},
                {-6,-12,-1}}
        );
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testOneNumber()
    {
        Matrix matrix = new Matrix(new int[][] {{2}});
        int expected = 0;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }

    @Test
    public void testOnEmpty()
    {
        Matrix matrix = new Matrix(new int[][] {});
        int expected = 0;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(matrix));
    }
}