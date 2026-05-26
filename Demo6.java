public class Demo6 {

    static boolean reverse(String str)
    {

        // char N[] = str.toCharArray();

        int start = 0;
        int end = str.length() -1;

        str = str.toLowerCase();

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){

                return false;
            }
                start++;
                end--;

            
        }



        return true;
    }

    public static void main(String[] args)
    {
        String str = "racEcAr";
        // madbaam
        //maabdam
        if(reverse(str) == true){
            System.out.println("yes it is palindrom");
        }else{
            System.out.println("no it is not palindrome");
        }

    }
    
}
