package StringOperations;

public class CheckEmptyString {

    public static void main(String[] args) {
        String str ="";
        checkIfStringIsEmpty(str);

    }
    public static void checkIfStringIsEmpty(String str){
        System.out.println("Is String empty : " + str.isEmpty());
    }
}
