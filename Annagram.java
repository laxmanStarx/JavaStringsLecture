import java.util.Arrays;

public class Annagram {
    static boolean isAnnagram(String str1, String str2)
    {

       

       if(str1.length() != str2.length())
       {

        return false;
       

       }
       char name[] = str1.toCharArray();
       char name2[] = str2.toCharArray();


       Arrays.sort(name);
       Arrays.sort(name2);


     return Arrays.equals(name,name2);



    }

    public static void main(String[] args)
    {
        String str1 = "listen";
        String str2 = "silent";

    System.out.println(isAnnagram(str1,str2));

    }
    
}
