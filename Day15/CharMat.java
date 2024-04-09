class CharMat
{
 public static void main(String args[])
  {
    char mat[][]={{'A'},{'B','C','D'},{'E','F','G','H','I'}};
   for(int i=0;i<mat.length;i++)
     {
       for(int j=0;j<mat[i].length;j++)
         System.out.print("  "+mat[i][j]);
      System.out.println();
     }
  }
}