package Examples;

import java.util.ArrayList;

public class Merge {
    ArrayList<String> merge(String[] words, String[] more){
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w: words) sentence.add(w);
        for (String w: more) sentence.add(w);
        return sentence;
    }

    public static void main(String[] args) {

    }
}

