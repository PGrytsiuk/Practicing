package StringOperations;

public class VowelsConsonantsCount {
    public static void main(String[] args) {
            String str = "Pavlo";
            int Vowels = 0;
            int Consonant =0;

            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if("eoaiuEOAIU".indexOf(c)!=-1){
                    Vowels++;

                }else if(Character.isLetter(c)) {
                    Consonant++;
                }
            }
        System.out.println("Amount of Vowels " + Vowels + "\n"+ "Amount of Consonant " + Consonant);

        }
    }

