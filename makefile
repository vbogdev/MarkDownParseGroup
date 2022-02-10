test: MarkdownParseGroup.class MarkdownParseTestGroup.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTestGroup
MarkdownParseGroup.class: MarkdownParseGroup.java
	javac MarkdownParseGroup.java
MarkdownParseTestGroup.class: MarkdownParseTestGroup.java
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTestGroup.java
