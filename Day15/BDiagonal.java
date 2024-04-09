class BDiagonal
{
 public static void main(String args[])
  {
     int mat[][]={{11,22,33},{44,55,66},{77,88,99}};
     for(int i=0;i<mat.length;i++)
     {
       for(int j=0;j<mat[i].length;j++)
          System.out.print((i==j||i+j==2)?mat[i][j]:"  ");
        System.out.println();
     }
  }
}