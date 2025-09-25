class emp{
 int d;
 double ad;
   emp(int d){
   this.d=d;
   System.out.println(" First constructor.");
   }
   emp(double d){
   this.d=d;
   System.out.println(" Second constructor.");
   }
   }
   public class testemp{
   public static void main(String [] ags){
    emp e=new emp();
   }
   
   }