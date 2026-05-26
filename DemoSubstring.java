public class DemoSubstring {

    static void substrings(String str)
    {
        boolean visited[] = new boolean[256];
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right<str.length(); right++){

            while(visited[str.charAt(right)]){
                visited[str.charAt(left)] = false;
                left++;

            }
            visited[str.charAt(right)] = true;

            maxLen = Math.max(maxLen, right - left +1);


    }

    System.out.println(maxLen);


    }

    public static void main(String[] args){

        String str = "abaabbcc";

        substrings(str);



    }
    
}
