package com.creambing.offer;

public class JZ1 {

    public static boolean Find(int target, int [][] array) {
        //选取右上角的数字
        boolean flag = false;
        if(array.length==0||array[0].length==0){
            return flag;
        }
        int colSize = array[0].length;
        int rowSize = array.length;
        int row=0,col=colSize-1;
        while (row<rowSize&&col>=0){
            int val = array[row][col];
            if(target<val){
                col=col-1;
            }else if(target>val){
                row = row+1;
            }else if(target==val){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        array[0] = new int[]{1,2,8,9};
        array[1] = new int[]{2,4,9,12};
        array[2] = new int[]{4,7,10,13};
        array[3] = new int[]{6,8,11,15};
        System.out.println(JZ1.Find(5,array));

    }
}
