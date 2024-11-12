package StringOperations;

public class ReverseString {

    public static void main(String[] args) {

        String str1 = "Test";
        String str2 = "Automation";
        String str3 = "Pavlo";

        reverseViaMethod(str1);
        reverseViaLoop(str2);
        System.out.println(reverseViaRecursion(str3));
    }

    public static void reverseViaMethod(String str1){
        StringBuilder reverseString = new StringBuilder(str1);
        reverseString.reverse();
        System.out.println(reverseString);
    }

    public static void reverseViaLoop(String str2){
        String reversed = "";
        for (int i = str2.length() - 1; i >= 0; i--){
           reversed += str2.charAt(i);
        }
        System.out.println(reversed);
    }

    public static String reverseViaRecursion(String str3){
        if (str3.isEmpty()){
            return str3;
        }
        return reverseViaRecursion(str3.substring(1))+str3.charAt(0);
    }

}
