public class StringReverse {

    static boolean reversing(String str)
    {


        char name[] = str.toCharArray();

                int start = 0;
             

        int end = name.length- 1;

        while(start < end){
            // char temp = name[start];
            // name[start] = name[end];
            // name[end] = temp;

            if(str.charAt(start)!= str.charAt(end))
                return false;

            start++;
            end--;

        }
        // for(int ch = 0; ch<name.length; ch++){
        //     System.out.print(name[ch] + " ");;
        // }

        return true;


   
    }

    public static void main(String[] args)
    {

        String str = "racescar";

  System.out.println(reversing(str));



    

       
        

      
       

    }
    
}
