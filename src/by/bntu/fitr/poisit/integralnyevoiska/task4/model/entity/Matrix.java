package by.bntu.fitr.poisit.integralnyevoiska.task4.model.entity;

public class Matrix {

    public static final int DEFAULT_NUMBER_OF_ROWS = 5;
    public static final int DEFAULT_NUMBER_OF_COLUMNS = 4;

    private int[][] matr;

    public Matrix() {
        matr = new int[DEFAULT_NUMBER_OF_ROWS][DEFAULT_NUMBER_OF_COLUMNS];
    }

    public Matrix(int[][] matr) {
        this.matr = matr;
    }

    public Matrix(int rows, int columns) {
        matr = new int[rows][columns];
    }

    public Matrix(Matrix matrix) {
        this(matrix.matr.length, matrix.matr[0].length);

        for (int i = 0; i < matrix.matr.length; i++) {
            for (int j = 0; j < matrix.matr[i].length; j++) {
                matr[i][j] = matrix.matr[i][j];
            }
        }
    }

    public int getAmountOfRows() {
        return matr.length;
    }

    public int getAmountOfColumns() {
        return matr[0].length;
    }

    public int getElement(int i, int j) {
        return matr[i][j];
    }

    public void setElement(int i, int j, int value) {
        matr[i][j] = value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                builder.append(matr[i][j]);
            }
            builder.append("\n");

        }
      return builder.toString();
    }

}
