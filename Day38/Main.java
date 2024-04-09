class DivNum
  {
        void div(int n1,int n2)
        {
            try
             {
                 System.out.println("Result="+n1/n2);
             }
             catch(ArithmeticException e)
             {
                throw e;     //rethorw
             }
        }

  }
  class Main
  {
public static void main(String args[])
       {
            DivNum ob=new DivNum();
           try{
            ob.div(10,2);
             ob.div(10,0);
            }
            catch(ArithmeticException e)
            {
               System.out.println("Number can not be divided by zero");
            }
       }
  }