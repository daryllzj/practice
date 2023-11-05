package leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

    public static void main(String[] args) {


        System.out.println(getRow(0));
    }

    public static List<Integer> getRow(int rowIndex) {

        List<List<Integer>> triangle = generate(rowIndex + 1);

        return triangle.get(rowIndex);

    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> arr = new ArrayList<>();

        if (numRows == 1){
            ArrayList<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            arr.add(firstRow);
            return arr;
        }

        arr = generate(numRows - 1);
        List<Integer> newRow = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            newRow.add(1);
        }

        for (int i = 1; i < numRows -1; i++) {
            newRow.set(i, arr.get(numRows -2).get(i-1) + arr.get(numRows-2).get(i));
        }

        arr.add(newRow);

        return arr;

    }



}
