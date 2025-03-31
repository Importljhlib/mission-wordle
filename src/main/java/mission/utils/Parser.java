package mission.utils;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static List<Character> splitJamo(String text) {
        List<Character> result = new ArrayList<>();

        for (char ch : text.toCharArray()) {
            if (ch >= 0xAC00 && ch <= 0xD7A3) {
                int base = ch - 0xAC00;
                char cho = (char) (0x1100 + base / (21 * 28)); // 초성 (한글 자모 영역)
                char jung = (char) (0x1161 + (base % (21 * 28)) / 28); // 중성
                int jongIndex = base % 28;
                result.add(cho);
                result.add(jung);
                if (jongIndex != 0) {
                    char jong = (char) (0x11A7 + jongIndex); // 종성 (0은 없음)
                    result.add(jong);
                }
            }
        }

        return result;
    }

}
