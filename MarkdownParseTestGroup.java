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
        assertLinks(List.of(), "extraSpaceGroup.md");
    }

    @Test
    public void testEscape() throws IOException {
        assertLinks(List.of("https://somethingelse.com"), "escapeGroup.md");
    }

    @Test
    public void testJustEscape() throws IOException {
        assertLinks(List.of(), "justEscapeGroup.md");
    }

    @Test
    public void testImage() throws IOException {
        assertLinks(List.of(), "imageGroup.md");
    }

    @Test
    public void testJustBrackets() throws IOException {
        assertLinks(List.of(), "justBracketsGroup.md");
    }

    @Test
    public void testJustParentheses() throws IOException {
        assertLinks(List.of(), "justParenthesesGroup.md");
    }

    @Test
    public void testMultiline() throws IOException {
        assertLinks(List.of("https://isthisfound.com"), "multilineGroup.md");
    }

    @Test
    public void testLastLine() throws IOException {
        assertLinks(List.of("last line link should be found"), "lastLineGroup.md");
    }

    public static void assertLinks(List<String> expectedLinks, String fileName) throws IOException {
        Path filePath = Path.of(fileName);
        String contents = Files.readString(filePath);
        ArrayList<String> links = MarkdownParseGroup.getLinks(contents);

        assertEquals(expectedLinks, links);
    }
}
