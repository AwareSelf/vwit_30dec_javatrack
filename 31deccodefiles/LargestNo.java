public class LargestNo {


    public static void main(String[] args) {

       //from static method/block you cant access instance attibutes/methods
        //directly
       // System.out.println(n1);
      //  System.out.println(this.n1);
       // System.out.println(findLargest(10,20,30));

        //you can access instance member after creating instance using dot opertor
        LargestNo ob = new LargestNo();
        System.out.println("largest no is:"+ob.findLargest(10.0,20.0,30.0)); //-->jump 2000

        int r = ob.findLargest(500,50,5000);//-->jump 1000
        System.out.println("largest no is:"+r);



    }

    //one if->multiple else if->only one else

   int  findLargest(int no1,int no2,int no3) //1000 address
   {
       System.out.println("int-wala findLargest func");
       //code to find the largest no
      // System.out.println("no1:"+no1+",no2="+no2+",no3="+no3);
       if((no1 > no2) && (no2 > no3))
       {
       //    System.out.println("if block entered,no1is largest");
           return no1;
       }
       else if(no2 >  no3)
       {
         //  System.out.println("else if block entered, no2 is largest");
           return no2;
       }
       else
       {
           System.out.println("else block entered,no3 is largest");
          return no3;
       }

    }//end of findlargest func



    double findLargest(double no1,double no2,double no3) //address 2000
    {
        System.out.println("double-wala findLarfest func");

         double largest = (no1>no2?(no1>no3?no1:no3):(no2>no3?no2:no3));


         return largest;

         /*
         if(no1>no2)
         {
             if(no1>no3)
             {
                 return no1;
             }
             else
             {
                 return no3;
             }
         }
         else if(no2 > no3)
         {
             return no2;
         }
         else
         {
             return no3;
         }
          */
    }



    boolean isPrime(int no)
   {
       return true;
   }
}
