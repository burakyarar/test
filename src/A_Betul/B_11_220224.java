package A_Betul;

public class B_11_220224 {

    public static void main(String[] args) {

        int LastResult1;
        LastResult1 = Adding1(7, 13);
        System.out.println("Result of adding = " + LastResult1);

        int LastResult2;
        LastResult2 = Subtract1(25, 2);
        System.out.println("Result of int value subtraction = " + LastResult2);

        double LastResult3;
        LastResult3 = Subtract1(25.5, 2.2);
        System.out.println("Result of double value subtraction = " + LastResult3);

        int LastResultE1;
        LastResult1 = GetExponent(3, 4);
        System.out.println("The result of the exponent "+ LastResult1);
    }

    public static int Adding1(int value1, int value2) {
        int resultA1;
        resultA1 = (value1 + value2);
        return resultA1;
    }

    public static int Subtract1(int value1, int value2) {
        int resultS1;
        resultS1 = (value1 - value2);
        return resultS1;
    }

    public static double Subtract1 (double value1, double value2) {
        double resultS2;
        resultS2=(value1-value2);
        return resultS2;
    }

    public static int GetExponent(int base, int exponent) {
        int resultE1 =0;
        if (base>0 && exponent == 0 ) resultE1= 1;
        if (base>0 && exponent == 1 ) resultE1= base;
        if (base>0 && exponent > 0 ) resultE1 = GetExponent(base, exponent-1) * base;
        return resultE1;
    }

    public static int GetTheFactor1() {
        int value1=6;
        int resultF1=1; // initial value
        for (int i =1; i <= value1; i++) {
            resultF1= resultF1*i;
        }
        return resultF1;
    }
}

