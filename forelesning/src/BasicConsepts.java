public class BasicConsepts {
    public static void main(String[] args) {
        System.out.println("");
        int number = 5;
        if (number < 5) {
            System.out.println("smaller");
        }
        else if (number > 15){
            System.out.println("bigger");
        }
        else{
            System.out.println("Bingus!");
        }
        //while
        int iteration = 0;
        while(iteration < 5){
            System.out.println(iteration);
            iteration++;
        }

        //for
        System.out.println();
        for (int x = 0; x < 5;x++){
            System.out.println(x);
        }

        System.out.println();
        for (int x = 5; x > 0; x--){
            System.out.println(x);
        }

        System.out.println();
        for(int x = 0; x < 10; x+=3){
            System.out.println(x);
        }

        System.out.println();
        printSmt();

        System.out.println();
        printNumber(7);

        System.out.println();
        printNumber(3);
        
        System.out.println();
        double pI = returnPI();
        System.out.println(pI);
    }

    public static void printSmt(){
        System.out.println("smt");
    }

    public static void printNumber(int endNumber){
        for (int x = 1; x <= endNumber; x++){
            System.out.println(x);
        }
    }

    public static double returnPI(){
        return 3.14;

    }
}


