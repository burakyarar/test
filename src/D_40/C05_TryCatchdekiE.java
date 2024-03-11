package D_40;

public class C05_TryCatchdekiE {

    public static void main(String[] args) {

        /*
            try/catch blogundaki e
            yakalanan exception'in atandigi variable'dir
         */
        int a = 20;
        int b = 5;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {

            // e.printStackTrace();
            // e.getMessage(); // / by zero
            System.out.println(e.toString());

        }
    }
}
