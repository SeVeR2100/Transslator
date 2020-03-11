import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sentenceRuss = getSentenceRuss();
        String sentenceEng = getSentenceEng(sentenceRuss);
        System.out.println("Poluchayte: \n" + sentenceEng);

    }

    public static String getSentenceRuss(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово или предложение : ");
        String s = scan.nextLine();
        return s;
    }


    public static String getSentenceEng(String sentenceRuss) {
        Transslater trans = new Transslater();
        char[] charArray = sentenceRuss.toCharArray();
        int k = charArray.length;
        StringBuilder strTrans = new StringBuilder();
        String Letter;
        for (int i = 0; i < k; i++) {
            Letter = Character.toString(charArray[i]);
            if (Letter.matches("[А-Я[Ё]]")) {
                strTrans.append(trans.transslateBig(Letter));
            }
            else if (Letter.matches("[а-я[ё]]")){
                strTrans.append(trans.transslateLittle(Letter));
            }
            else{
                strTrans.append(Letter);
            }
        }
        return strTrans.toString();
    }
}
