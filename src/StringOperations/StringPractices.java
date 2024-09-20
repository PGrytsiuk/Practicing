package StringOperations;


public class StringPractices {

    public static void main(String[] args) {

        String str = "Automation is a simply way to get rid of repetitive testing";
        StringBuilder strOperation = new StringBuilder(str);
       /* strOperation.reverse();
        System.out.println(strOperation);

     strOperation.append(" Five");
        strOperation.append(" Six");

        System.out.println(str+strOperation);*/

        strOperation.insert(11, "Testing ");
        System.out.println(strOperation);


       /* strOperation.delete(11,18);
        System.out.println(strOperation);*/

        strOperation.replace(11, 18, "Standing");
        System.out.println(strOperation);

        strOperation.deleteCharAt(11);
        System.out.println(strOperation);
    }

}
