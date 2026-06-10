class Recursion{
    public static void main(String[] args) {
        // generate1toN(50);
        // generateNto1(50);
        // sumoffirstnnumbers(100, 0);
        // factorial(10,1);

    }

    public static void factorial(int num, long fact){
        if(num==1 || num==0){
            System.out.println(fact);
            return;
        }
        factorial(num-1, fact*num);
    }

    public static void sumoffirstnnumbers(int num, long sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        sumoffirstnnumbers(num-1, sum+num);
    }

    public static void generateNto1(int num){
        if(num==0){
            System.out.println();
            return;
        }
        System.out.print(num+",");
        generateNto1(num-1);
    }

    public static void generate1toN(int num){
        if(num==0){
            System.out.println();
            return;
        }
        generate1toN(num-1);
        System.out.print(num+",");
    }
}
