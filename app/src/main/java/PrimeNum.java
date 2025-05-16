import java.util.Random;

public class PrimeNum {
    public static boolean isPrime(long n) {
        //if n is equal to 0 and 1
        if (n == 0 || n == 1)
            return false;
        //if n is equal to 2
        if (n == 2)
            return true;
        //if n is an even number
        if (n % 2 == 0)
            return false;
        //for the rest
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }


        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int limit = 100;//number of samples
        Random random = new Random();//random generator
        //test case for the 20-bit
        double start = System.nanoTime();//starts measuring time

        while (count < limit) {
            long n = 524288L + random.nextLong(524288L);//to generate a random between 2^19 and 2^20
            isPrime(n);
            count++;
        }
        double end = System.nanoTime();
        double time = (end - start) / 1000000;//in mili seconds

        System.out.println("The time needed for a 100 20-Bits random numbers is: " + time + " mili seconds . ");
        //test case for the 40-bit
        int count2 = 0;

        double start2 = System.nanoTime();

        while (count2 < limit) {
            long n2 = 549755813888L + random.nextLong(549755813888L);//between 2^39 -2^40
            ;
            isPrime(n2);
            count2++;
        }
        double end2 = System.nanoTime();
        double time2 = (end2 - start2) / 1000000;//in mili seconds

        System.out.println("The time needed for a 100 40-Bits random numbers is: " + time2 + " mili seconds . ");
        if (time < time2) {
            System.out.println("The 20-bit random numbers are faster than the 40-bit random numbers . ");
        } else {
            System.out.println("The 40-bit random numbers are faster than the 20-bit random numbers . ");
        }
    }
}


