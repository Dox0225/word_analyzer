import java.util.ArrayList;

public class word_analyzer {
    ArrayList <String> list = new ArrayList<>();
}
public String longestWord(ArrayList<String> list){
    String longestWord=list.get(0);
    for(int i=1;i<list.size();i++){
        if(list.get(i).length()>longestWord.length()){
            longestWord=list.get(i);
        }
    }
    return longestWord;
}