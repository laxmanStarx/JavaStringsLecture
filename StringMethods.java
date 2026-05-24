public class StringMethods {

    public static void main(String[] args)
    {
        String str = "Sun rises in the east";
        System.out.println(str.length());

        System.out.println(str.charAt(5));

        System.out.println(str.substring(2,11));

        System.out.println(str.startsWith("Sun r"));
         System.out.println(str.endsWith("the east"));

         String str2 = "Mangoes";

         String modify = str2.replace('M', 'D');

         System.out.println(modify);

    }
    
}
