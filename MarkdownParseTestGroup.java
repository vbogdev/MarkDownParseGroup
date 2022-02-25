import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;

public class MarkdownParseTestGroup {
    @Test
    public void testFileOne() throws IOException{
        String contents = Files.readString(Path.of("./test1.md"));
        ArrayList<String> testResults = new ArrayList<>();
        testResults.add("google.com");
        testResults.add("google.com");
        testResults.add("ucsd.edu");
        assertEquals(testResults, MarkdownParseGroup.getLinks(contents));
    }

    @Test
    public void testFileTwo() throws IOException{
        String contents = Files.readString(Path.of("./test2.md"));
        ArrayList<String> testResults = new ArrayList<>();
        testResults.add("a.com");
        testResults.add("a.com(())");
        testResults.add("example.com");
        assertEquals(testResults, MarkdownParseGroup.getLinks(contents));
    }

    @Test
    public void testFileThree() throws IOException{
        String contents = Files.readString(Path.of("./test3.md"));
        ArrayList<String> testResults = new ArrayList<>();
        testResults.add("https://www.twitter.com");
        testResults.add("https://ucsd-cse15l-w22.github.io/");
        testResults.add("https://cse.ucsd.edu/");
        assertEquals(testResults, MarkdownParseGroup.getLinks(contents));
    }
}
