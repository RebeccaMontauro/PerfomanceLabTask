package sort10numbers;

import java.util.*;

public class Api {
    public Api() {
        super();
    }
    
    public void run(){
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        in.close();
        String[] args=str.split(",");
        if (args.length!=10){System.out.println("¬ведите 10 чисел"); return;}
        int[] nums=new int[10];
        try{
            for(int i=0;i<10;i++){ nums[i]=Integer.parseInt(args[i]);}
        }catch(NumberFormatException ex){System.out.println("¬ведите 10 чисел"); return;}    
        Arrays.sort(nums); 
        for(int i=0;i <nums.length; i++)System.out.println(nums[i]);
       
        
        /*in.useDelimiter("[\\, ,\n+,\\p{javaWhitespace}+]");      
        int[] nums = new int[10];
        for(int i=0;i <10; i++){ 
            if(in.hasNextInt()) nums[i]=in.nextInt();
            else  break;
        }
        in.close();
        */
       
        
    }

    public static void main(String[] args) {
        Api api = new Api();
        api.run();
    }
}
