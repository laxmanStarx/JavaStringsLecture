public class Task {
    public static void main(String[] args)
    {
        String str = "HiellaoWoruld!";
        System.out.println(str.charAt(0));

        int count = 0;



        // for( char ch: str.toCharArray()){
        //     count++;
        // }

        System.out.println(count);

        System.out.println(str.length());

        char name[] = str.toCharArray();



        for(int i = 0; i< str.length(); i++){
            if(name[i] == 'a' || name[i] == 'e' || name[i] == 'i' || name[i] == 'o'|| name[i] == 'u'){
                System.out.println(name[i]);
                count++;
            }

        }
        System.out.println(count);

    }
    
}
