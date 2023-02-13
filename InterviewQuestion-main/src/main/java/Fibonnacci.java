public class Fibonnacci {
    public static void main(String[] args) {
        System.out.println(fibonacciRekursive(1));
        System.out.println(fibonacciRekursive(2));
        System.out.println(fibonacciRekursive(3));
        System.out.println(fibonacciRekursive(4));
    }private static void fiboncci(int count){
        int first=0;
        int second=0;
        int sum=0;
        for (int i=1;i<=count;i++){
            System.out.println(first+", ");
            first=second;
            second=sum;
            sum=first+second;
        }
    }private static int   fibonacciRekursive(int count){

        if (count<=1){
        return count;
        }
        return fibonacciRekursive(count)+fibonacciRekursive(count);
    }
}
