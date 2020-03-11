public class Transslater {
    String [] russLittle = {"а","б","в","г","д","е","ё","ж","з","и",
                         "й","к","л","м","н","о","п","р","с","т",
                         "у","ф","х","ц","ч","ш","щ","ъ","ы","ь",
                         "э","ю","я" };
    String [] engLittle = { "a","b","v","g","d","e","yo","zh","z","i",
                         "j","k","l","m","n","o","p","r","s","t",
                         "u","f","x","cz","ch","sh","shh","","y","",
                         "e","yu","ya"};
    String [] russBig   = {"А","Б","В","Г","Д","Е","Ё","Ж","З","И",
                        "Й","К","Л","М","Н","О","П","Р","С","Т",
                        "У","Ф","Х","Ц","Ч","Ш","Щ","Ъ","Ы","Ь",
                        "Э","Ю","Я" };
    String [] engBig    = { "A","B","V","G","D","E","Yo","Zh","Z","I",
                        "J","K","L","M","N","O","P","R","S","T",
                        "U","F","X","Cz","Ch","Sh","Shh","","Y","",
                        "E","Yu","Ya"};

    public String transslateLittle(String Letter){
        int pos1 = 0;
        while (true){
            if (Letter.equals(russLittle[pos1]) == true){
                break;
            }
            pos1++;
        }
        return engLittle[pos1];

    }
    public String transslateBig (String Letter){
        int pos1 = 0;
        while (true){
            if (Letter.equals(russBig[pos1]) == true){
                break;
            }
            pos1++;
        }
        return engBig[pos1];
    }

}





