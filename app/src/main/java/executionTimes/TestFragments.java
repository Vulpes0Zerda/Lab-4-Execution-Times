package executionTimes; //???

public class TestFragments {
    public static void main(String[] args) {
     
        // Start time measurement           
        //It's more efficient than System.currentTimeMillis() 
        long t1 = System.nanoTime();

        int sum = 0;
        int n = 999999999;


        //Beginn of Fragments//
        // Fragment #1
        for (int i = 0; i < n; i++) {
            sum++;
        }


        long t2 = System.nanoTime();   // End time measurement

        System.out.println("Fragment #1: " + (t2 - t1) + " ns");
        System.out.println("In Sekunden: " + (t2 - t1) / 1000000000.0 + " s");
    }
}
