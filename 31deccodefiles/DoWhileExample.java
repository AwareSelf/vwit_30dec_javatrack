public class DoWhileExample {
    /*
      take two nos and a choice from user to perform add/sub/mul/div operation
      Allow him to repeat the operation asking his choice

      use switch case
     */

    public static void main(String[] args) {
        int no1 = 20, no2 = 10;
        performOperation(no1, no2);


    }

    static void performOperation(int no1, int no2) {
        char ch = 'n';
        java.util.Scanner sc = new java.util.Scanner(System.in);

        do {
            System.out.println("****menu*****");
            System.out.println("1.Add\n 2.Sub \n 3. Mul \n 4. Div");
            System.out.println("Enter choice:");
            int choice = sc.nextInt();
            int r = calcOp(no1, no2, choice);
            if(r!=-1)
               System.out.println("result is:" + r);
            else
                System.out.println("you entered wrong choice!");

            System.out.println("do u wish to continue: (y/Y)");
            //read input into ch variable
            String yesno = sc.next(); // "y" / "yes" /"Y"/"Yes"   "No"/"N"

            ch = yesno.charAt(0);
        } while (ch == 'y' || ch == 'Y');

        sc.close();
    }


    static int calcOp(int no1, int no2, int choice) {
        switch (choice) {
            case 1:
                return no1 + no2;
            case 2:
                return no1 - no2;
            case 3:
                return no1 * no2;
            case 4:
                return no1 / no2;
            default:
                System.out.println("wrong choice!");
                return -1;
        }//end of switch
    }
}






