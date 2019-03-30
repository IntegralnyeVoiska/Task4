package by.bntu.fitr.poisit.integralnyevoiska.task4.model.logic;

import by.bntu.fitr.poisit.integralnyevoiska.task4.model.entity.Matrix;

public class LocMinCounter {

    public static boolean isLocalMinimum(Matrix matr, int i, int j) {
        boolean flag = false;

        int value = matr.getElement(i,j);

        if ((i > 0  && value < matr.getElement(i - 1, j)&&
                (j > 0 && value < matr.getElement(i,j - 1)) &&
                (i < matr.getAmountOfRows() - 1 && value < matr.getElement(i + 1,j) &&
                (j < matr.getAmountOfColumns() - 1 && value < matr.getElement(i,j + 1) &&
                value < matr.getElement(i - 1, j - 1) && value < matr.getElement(i + 1, j + 1)&&
                value < matr.getElement(i - 1, j + 1) && value < matr.getElement(i + 1, j - 1))))) {
            flag = true;
        }

        else if (matr.getAmountOfRows() == 1 && matr.getAmountOfColumns() == 1)
        {
            flag = false;
        }



        else if (matr.getAmountOfRows() > 1 && matr.getAmountOfColumns() == 1)
        {
            if(i == 0 && value < matr.getElement(i + 1,j))
            {
                flag = true;
            }
            else if(i == matr.getAmountOfRows() - 1 && value < matr.getElement(i - 1,j))
            {
                flag = true;
            }
        }



        else if (i == 0) {
            if (j == 0 && value < matr.getElement(i,j + 1) &&
                    value < matr.getElement(i + 1,j) &&
                    value < matr.getElement(i + 1,j + 1))
            {
                flag = true;
            }
            else if (j > 0 && j < matr.getAmountOfColumns() - 1 &&
                    value < matr.getElement(i,j - 1) &&
                    value < matr.getElement(i,j + 1) &&
                    value < matr.getElement(i + 1,j) &&
                    value < matr.getElement(i + 1,j - 1)&&
                    value < matr.getElement(i + 1,j + 1))
            {
                flag = true;
            }
            else if (j == matr.getAmountOfColumns() - 1 &&
                    value < matr.getElement(i,j - 1) &&
                    value < matr.getElement(i + 1,j)) {
                flag = true;
            }
        }



        else if (i == matr.getAmountOfRows() - 1)
        {
            if (j == 0 && value < matr.getElement(i - 1,j) &&
                    value < matr.getElement(i,j + 1) &&
                    value < matr.getElement(i - 1,j + 1))
            {
                flag = true;
            }
            else if (j > 0 && j < matr.getAmountOfColumns() - 1 &&
                    value < matr.getElement(i,j - 1) &&
                    value < matr.getElement(i,j + 1) &&
                    value < matr.getElement(i - 1,j) &&
                    value < matr.getElement(i - 1,j - 1) &&
                    value < matr.getElement(i - 1,j + 1))
            {
                flag = true;
            }
            else if (j == matr.getAmountOfColumns() - 1 &&
                    value < matr.getElement(i,j - 1) &&
                    value < matr.getElement(i - 1,j) &&
                    value < matr.getElement(i - 1,j - 1)) {
                flag = true;
            }
        }


        else if (j == 0 && i < matr.getAmountOfRows() - 1)
        {
            if (value < matr.getElement(i - 1,j) &&
                    value < matr.getElement(i + 1,j) &&
                    value < matr.getElement(i,j + 1) &&
                    value < matr.getElement(i - 1,j + 1)&&
                    value < matr.getElement(i + 1,j + 1))
            {
                flag = true;
            }
        }




        else if (j == matr.getAmountOfColumns() - 1 && i < matr.getAmountOfRows() - 1)
        {
            if (value < matr.getElement(i - 1,j) &&
                    value < matr.getElement(i + 1,j) &&
                    value < matr.getElement(i,j - 1) &&
                    value < matr.getElement(i - 1,j - 1)&&
                    value < matr.getElement(i + 1,j - 1)) {
                flag = true;
            }
        }
        return flag;
    }



    public static int countLocalMinimums(Matrix matr) {
        int count = 0;
        for (int i = 0; i < matr.getAmountOfRows(); i++) {
            for (int j = 0; j < matr.getAmountOfColumns(); j++) {
                if (isLocalMinimum(matr, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
}

