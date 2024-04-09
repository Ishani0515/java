class StudDet
  {
     String name,city;
     static String cname;
     public static void main(String args[])
     {
          StudDet.cname="KIIT";
         StudDet s1=new StudDet();
         s1.name="Ishani";
         s1.city="Cuttak";
         StudDet s2=new StudDet();
         s2.name="Simran";
         s2.city="Bhubaneswar";
         System.out.println(s1.name+"   "+s1.city+"  "+cname);
         System.out.println(s2.name+"   "+s2.city+"  "+cname);
     }
  }