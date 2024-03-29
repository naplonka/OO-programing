package collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("ogórek", 13, "ananas", 10, "śmietana", 2, "chleb", 5);
        //Nie możemy nic dodać do naszej mampy ponieważ wszystko co jest tworzone przez of, jest niemutowalne
        HashMap<String, Integer> hashMap = new HashMap<>(map);
        System.out.println("hashMap" + hashMap);// nie posotrowane

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(map);
        System.out.println("linkedMap" + linkedHashMap);

        TreeMap<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println("treeMap" + treeMap);//posortowane

//        Object some = new Object([AtaEntryDto(chapterName=252, numberOfEntries=231), AtaEntryDto(chapterName=253, numberOfEntries=35), AtaEntryDto(chapterName=254, numberOfEntries=11), AtaEntryDto(chapterName=383, numberOfEntries=9), AtaEntryDto(chapterName=381, numberOfEntries=2)]);

    }
}
