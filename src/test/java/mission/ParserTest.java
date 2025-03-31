package mission;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import mission.utils.Parser;
import org.junit.jupiter.api.Test;

public class ParserTest {
    @Test
    void jamoTest() {
        List<Character> result = Parser.splitJamo("갉아먹다");
        List<Character> cpr = List.of('ᄀ', 'ᅡ', 'ᆰ', 'ᄋ', 'ᅡ', 'ᄆ', 'ᅥ', 'ᆨ', 'ᄃ', 'ᅡ');
        assertEquals(result, cpr);
    }
}
