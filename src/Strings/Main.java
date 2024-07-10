package Strings;

public class Main {
    public static void main(String[] args) {
//        String str = "Anumidha";
//        String str1 = "Anumidha Saravanakumar";
////        String str = new String("Anumidha");
////        System.out.println(str);
//        for(int i=0;i<str.length();i++)
//        {
//            System.out.print(str.charAt(i));
//        }
        
         String s = "hello";
         int sum = 0;

         for(int i=0;i<s.length()-1;i++)
         {
             sum = sum + Math.abs((s.charAt(i)) - (s.charAt(i+1)));
         }

        System.out.println(sum);
    }
}
