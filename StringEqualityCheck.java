public class StringEqualityCheck {

    public static void main(String[] args)
    {
        String str = "Love";
        String str1 = new String("Greffin");
        // System.out.print(str + " " + str1);

        // String str2 = "LoVe";

        String str2 = new String("Love");

        if(str.equals(str2)){
             System.out.println( "They both are same");

        }else{
            System.out.println("They are not same");
        }

        if(str == str2)
        {
            System.out.println( "They both are same");
        }else{
            System.out.println("They are not same");
        }

        System.out.println(str.charAt(3));
    }
    
}
