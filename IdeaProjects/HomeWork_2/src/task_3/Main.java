package task_3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    static boolean[] expectancy = {
            true,
            true,
            true,
            true,
            false,
            false,
            true,
            true,
            false,
            true,
            true
    };
    static int i = 0;
    public static void main(String[] args) {
        LinkedHashMap<String, String> strings = new LinkedHashMap<>();
        strings.put("car", "ca6$$#_rtwheel");
        strings.put("cwhl", "cartwheel");
        strings.put("cwhee", "cartwheel");
        strings.put("cartwheel", "cartwheel");
        strings.put("cwheeel", "cartwheel");
        strings.put("lw", "cartwheel");
        strings.put("463", "jsin53jdk4k4fm5m63");
        strings.put("r", "cas_rtwheel");
        strings.put("tree", "cas_rtwheel");
        strings.put("c1r", "ca111s_rtwheel");
        strings.put("crd", "cas_rtwdecrdel");
        tests(strings);
    }

    public static boolean fuzzySearch(String targetString, String inputString) {
        int indexLetter = 0;
        int counterTargetStringLetters = 0;
        for (int i = 0; i < inputString.length(); i++) {
                if (targetString.charAt(indexLetter) == inputString.charAt(i)) {
                    indexLetter = indexLetter + 1;
                    counterTargetStringLetters++;
                }
                if(indexLetter == targetString.length()){
                    break;
                }
        }
        return counterTargetStringLetters == targetString.length();
    }

    public static void tests(LinkedHashMap<String, String> strings) {
        strings.forEach((key, value) -> {
            System.out.println("\"" + key + "\"" + " -> \"" + value + "\"" + " result:" + fuzzySearch(key, value));
            assert fuzzySearch(key, value) == expectancy[i];
            i++;
        });
    }
}
