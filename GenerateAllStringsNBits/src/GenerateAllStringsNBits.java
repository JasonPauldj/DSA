import java.util.Scanner;

public class GenerateAllStringsNBits {

    static int array[];
    static int callTimes =0;
    public static void main(String[] args) {

        int noOfBits;
        Scanner scanner = new Scanner(System.in);
        noOfBits = scanner.nextInt();
        array = new int[noOfBits];

        printNBits(noOfBits);
        System.out.println(callTimes);
    }

    static void printNBits(int n)
    {
        callTimes++;
        if(n < 1)
        {
            for (int k: array
                 ) {
                System.out.print(k);
            }
            System.out.println();
        }
else {
            array[n - 1] = 0;
            printNBits(n - 1);

            array[n - 1] = 1;
            printNBits(n - 1);
        }
    }

}
