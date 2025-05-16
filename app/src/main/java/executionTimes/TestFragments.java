package executionTimes; //???

public class TestFragments {
    public static void main(String[] args) {
     
        // Start time measurement           
        //It's more efficient than System.currentTimeMillis() 
        long t1 = System.nanoTime();

        int sum = 0;
        long steps= 0;
        int n = 1000000;


        //Beginn of Fragments//
        /*// Fragment #1
        for (int i = 0; i < n; i++) {
            //steps++;

            sum++;

           steps++;
        }*/
         

         //Fragment #2
        /*for ( int i = 0; i < n; i ++){
            //steps++;
            for ( int j = 0; j < n; j ++){
                sum++;
                    steps++;
            }
        }*/
        /*// Fragment #3
        for ( int i = 0; i < n; i ++){
            for ( int j = i; j < n; j ++){
                sum++;
                    steps++;
            }
        }*/
        // Fragment #4
        for ( int i = 0; i < n; i ++){
            sum ++;
                steps++;
            for ( int j = 0; j < n; j ++){
                sum ++;
                    steps++;
            }
        }

        long t2 = System.nanoTime();   // End time measurement

        System.out.println("Fragment #4: " + (t2 - t1) + " ns");
        System.out.println("Schritte: " + steps);
        System.out.println("In Sekunden: " + (t2 - t1) / 1000000000.0 + " s");
    }
}
