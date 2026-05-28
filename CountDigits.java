public class CountDigits {
    

    static void printDigits(int n){
        int sum = 0;

        while(n > 0)
        {

            int remainder = n%10;
            sum = sum + remainder;

            n = n/10;


        }

        System.out.println(sum);
    }

    public static void main(String[] args)
    {

        int n = 12345;
        printDigits(n);

        

    }
    
}
