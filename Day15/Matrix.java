class Matrix
  {
     public static void main(String args[])
     {
      int mat[][]={{11,22,33},{44,55,66},{10,20},{5,6,7,8},{100}};
      for(int row=0;row<mat.length;row++)   //1 2 3 4
      {
        for(int col=0;col<mat[row].length;col++)   //0 1 2
         System.out.print(mat[row][col]+"   ");
       System.out.println();
     }
  }
}