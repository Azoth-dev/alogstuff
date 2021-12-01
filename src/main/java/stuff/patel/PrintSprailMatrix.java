package stuff.patel;

import java.util.LinkedList;
import java.util.Queue;

class PrintMatrixInSpiralForm {

    public static void main(String[] args) {
        new PrintMatrixInSpiralForm();
    }

    public PrintMatrixInSpiralForm() {
        int[][] matrix = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        printMatrixInSpiralWay(matrix);
    }

    private void printMatrixInSpiralWay(int[][] matrix) {
        Queue queue= new LinkedList();
        int maxRowlenght = matrix.length;
        int maxColLenght=matrix[0].length;
        int size = maxColLenght*maxRowlenght;
        int rowPointer=0;
        int colPointer=0;

        for(int i=0;i<size;i++){

            //we will fillflop row and colm pointer so that we cant increase them beyound 5

            //rowPointer increase/decrease
            if(rowPointer<maxRowlenght &&colPointer==maxColLenght-1){
                rowPointer++;
            }else if(rowPointer==maxRowlenght-1 &&colPointer==maxColLenght-1){

            }

            //colPoint increase/decrease

            //select the element from array to queue

        }

    }



}
