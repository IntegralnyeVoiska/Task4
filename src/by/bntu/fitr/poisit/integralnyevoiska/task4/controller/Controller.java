package by.bntu.fitr.poisit.integralnyevoiska.task4.controller;

import by.bntu.fitr.poisit.integralnyevoiska.task4.model.logic.LocMinCounter;
import by.bntu.fitr.poisit.integralnyevoiska.task4.view.Printer;
import by.bntu.fitr.poisit.integralnyevoiska.task4.util.UserInput;
import by.bntu.fitr.poisit.integralnyevoiska.task4.model.entity.Matrix;
public class Controller {
    public static void main(String[] args) {
        int row = UserInput.inputInt("Input the number of rows:");
        int col = UserInput.inputInt("Input the number of columns:");
        int value;
        if (row <= 0 || col <= 0) {
            Printer.print("Wrong values of columns and rows!");
        } else {
            Matrix matr = new Matrix(row,col);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    value = UserInput.inputInt("array[" + i + "][" + j + "] = ");
                    matr.setElement(i,j,value);
                }
            }
            Printer.print("The number of local minimums is " + LocMinCounter.countLocalMinimums(matr));
        }
    }
}
