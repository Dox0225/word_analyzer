import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public String longestWord(ArrayList<String> list) {
        String longestWord = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > longestWord.length()) {
                longestWord = list.get(i);
            }
        }
        return longestWord;
    }

    public String findVowels(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0)==('a')|| list.get(i).charAt(0)==('e')||list.get(i).charAt(0)==('i')||list.get(i).charAt(0)==('o')||list.get(i).charAt(0)==('i')){
                return list.get(i);
            }
        }
    }
}