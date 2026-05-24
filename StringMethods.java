public class StringMethods {

    public static void main(String[] args)
    {
        String str = "Sun rises in the east";
        System.out.println(str.length());

        System.out.println(str.charAt(5));

        System.out.println(str.substring(2,11));

        System.out.println(str.startsWith("Sun rises"));
         System.out.println(str.endsWith("in the east"));

         String str2 = "Mangoes";

         String modify = str2.replace('M', 'D');

         System.out.println(modify);

         String str3 = "  ";
         System.out.println(str3.length());
         System.out.println(str3.isEmpty());

    }
    
}
