package collection.Map;

import java.util.HashMap;

public class MapExRunner {
    public static void main(String[] args) {
        // Wyświetlić ile razy dane słowo pojawia się w stringu
        //Wyświetlić ile razy słowo się pojawia
        String string = "To będzie dobry dzień. Zrobimy zakupy i pójdziemy na spacer, będzie pięknie";

        char[] characters = string.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char character: characters){
            Integer integer = hashMap.get(character);
            if(integer==null){
                hashMap.put(character, 1);
            }
            else {
                hashMap.put(character, integer+1);
            }
        }
        System.out.println(hashMap);

        String[] words = string.split(" ");
        HashMap<String, Integer> wordsOccurance = new HashMap<>();

        for(String word: words) {
            Integer integer = wordsOccurance.get(word);
            if(integer==null){
                wordsOccurance.put(word, 1);
            }
            else {
                wordsOccurance.put(word, integer+1);
            }
        }
        System.out.println(wordsOccurance);
    }
}
