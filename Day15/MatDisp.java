class MatDisp
{
  public static void main(String args[])
  {
   int mat[][]={{11},{22,33,44},{55,66},{10,20,30,40,50}};
   for(int i=0;i<mat.length;i++)
     {
       for(int j=0;j<mat[i].length;j++)
         System.out.print("  "+mat[i][j]);
      System.out.println();
     }
  }
}
