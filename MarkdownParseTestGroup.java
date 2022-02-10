import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class MarkdownParseTestGroup {
    /**@Test
    public void testEmpty() throws IOException {
        assertLinks(List.of(), "emptyGroup.md");
    }
    */
    @Test
    public void testExtraSpace() throws IOException {
        assertLinks(List.of(), "C:/Users/mrmus/OneDrive/Desktop/Github projects/MarkDownParseGroup/extraSpaceGroup.md");
    }

    @Test
    public void testEscape() throws IOException {
        assertLinks(List.of("https://somethingelse.com"), "C:/Users/mrmus/OneDrive/Desktop/Github projects/MarkDownParseGroup/escapeGroup.md");
    }

    @Test
    public void testJustEscape() throws IOException {
        assertLinks(List.of(), "C:/Users/mrmus/OneDrive/Desktop/Github projects/MarkDownParseGroup/justEscapeGroup.md");
    }

    @Test
    public void testImage() throws IOException {
        assertLinks(List.of(), "C:/Users/mrmus/OneDrive/Desktop/Github projects/MarkDownParseGroup/imageGroup.md");
    }

    @Test
    public void testJustBrackets() throws IOException {
        assertLinks(List.of(), "C:/Users/mrmus/OneDrive/Desktop/Github projects/MarkDownParseGroup/justBracketsGroup.md");
    }

    @Test
    public void testJustParentheses() throws IOException {
        assertLinks(List.of(), "C:/Users/mrmus/OneDrive/Desktop/Github projects/MarkDownParseGroup/justParenthesesGroup.md");
    }

    @Test
    public void testMultiline() throws IOException {
        assertLinks(List.of("https://isthisfound.com"), "C:/Users/mrmus/OneDrive/Desktop/Github projects/MarkDownParseGroup/multilineGroup.md");
    }

    @Test
    public void testLastLine() throws IOException {
        assertLinks(List.of("last line link should be found"), "C:/Users/mrmus/OneDrive/Desktop/Github projects/MarkDownParseGroup/lastLineGroup.md");
    }

    public static void assertLinks(List<String> expectedLinks, String fileName) throws IOException {
        Path filePath = Path.of(fileName);
        String contents = Files.readString(filePath);
        ArrayList<String> links = MarkdownParseGroup.getLinks(contents);

        assertEquals(expectedLinks, links);
    }
}
