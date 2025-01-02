package corejavabasic;

public class DataTypesEx {

    public static void main(String[] args) {

        byte b1 = 11; //implicit type casting
        byte b = (byte) 300; //explicit type casting is req in case of data loss/narrowing conversions

        short s = (short)300000;

        char ch =12;
        System.out.println(ch);
        int no = 'A'; //char and int are interconvertible or compatible with implicit conversion

        double no1 =12.2;
        int no2 = (int)12.2;
        System.out.println(no2);

       // boolean flag = (boolean)1; //incompatible types cant be casted

        boolean x = 12>3;
        System.out.println(x);

        x = no1==12.2;
        System.out.println(x);
        if(no1!=12.2)
        {
            System.out.println("no1 not equal to 12.2");
        }
        else
        {
            System.out.println("no1 is equal to 12.2");
        }

        no2 = 8;
        if(no1==3 || no2==8)
        {

        }

    }

    public static class ArrayEx {

        public static void main(String[] args) {

        }
    }
}
