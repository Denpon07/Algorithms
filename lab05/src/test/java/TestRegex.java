import org.example.Regex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRegex {
    @Test
    public void testPhone() {
        Regex number = new Regex();
        Assertions.assertTrue(number.telephoneNumber("(+380)50-531-13-44"));
        Assertions.assertTrue(number.telephoneNumber("(+380)98-025-66-18"));
        Assertions.assertTrue(number.telephoneNumber("(+380)67-574-92-13"));
        Assertions.assertTrue(number.telephoneNumber("(+380)98-505-48-39"));
        Assertions.assertFalse(number.telephoneNumber("(+380)505311344"));
        Assertions.assertFalse(number.telephoneNumber("0505311344"));
        Assertions.assertFalse(number.telephoneNumber("sdfsdfhjks"));
        Assertions.assertFalse(number.telephoneNumber(" 380 50 531 13 44"));
    }

    @Test
    public void testBlank() {
        Regex str = new Regex();
        Assertions.assertEquals("Я хочу бути програмістом",str.replaceBlanks("Я хочу  бути     програмістом"));
    }

    @Test
    public void testHtml() {
        String correctStr = "\n" + "Символы круглых скобок '(' и ')'. Эти символы\n" + "позволяют получить из искомой строки дополнительную информацию.\n" + "Обычно, если парсер регулярных выражений ищет в тексте информацию\n" + "по заданному выражению и находит ее - он просто возвращает\n" + "найденную строку.\n" + "А вот тут ссылка, чтоб жизнь медом не казалась.\n" + "";

        Regex str = new Regex();

        Assertions.assertEquals(correctStr,str.replaceHtml("<div>\n" +
                "<p>Символы круглых скобок <code>'('</code> и <code>')'</code>. Эти символы\n" +
                "позволяют получить из искомой строки дополнительную информацию.\n" +
                "<br/>Обычно, если парсер регулярных выражений ищет в тексте информацию\n" +
                "по заданному выражению и находит ее - он просто возвращает\n" +
                "найденную строку.</p>\n" +
                "<p align=\"right\">А вот тут <a href=\"google.com\">ссылка</a>, чтоб жизнь медом не казалась.</p>\n" +
                "</div>"));
    }
}
