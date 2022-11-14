package com.gio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "I am a string, Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";

        // . - all of them
        System.out.println(alphanumeric.replaceAll(".","y"));

        // ^ - starts with
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));
        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        // should match exactly
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiijkl99z"));

        // $ - ends with
        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));

        // [text] - replace wrapped string (each of them)
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
        // [text][text] - replace wrapped string (each of them) followed by another wrapped string (each of them)
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";

        // [^text] - all except text (each of them)
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));

        // - range
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));

        // (?i) - ignoring case sensitivity
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));

        // \\d - all digits
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));

        // \\D - all non-digit
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        String hasWhiteSpae = "I have blanks and\t a tab, and also a new line\n";
        System.out.println(hasWhiteSpae);

        // \\s - all spaces
        System.out.println(hasWhiteSpae.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpae.replaceAll("\t", "X"));

        // \\S - non-whitespace characters
        System.out.println(hasWhiteSpae.replaceAll("\\S", ""));

        // \\w - all characters (including nums)
        System.out.println(hasWhiteSpae.replaceAll("\\w", "X"));

        // \\b - wraps all targets with replacement
        System.out.println(hasWhiteSpae.replaceAll("\\b", "X"));



        /* Quantifying */
        String thirdAlphanumericString = "abcDeeeF12GhhabcDeeeiiiijkl99z";

        // {number} - how many of them
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY"));

        // + - one or more
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY"));

        // * - match in either case
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY"));

        // {2,5} - between 2 and 5
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading<h2>");
        htmlText.append("<h2>Summary<h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?<h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);
        while(h2TextMatcher.find()){
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

        /* Logical Operators */
        // [Hh]arry ->
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        // [^abc]
        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)"; // the same as above
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while(tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        // t(?=v) - positive look ahead
    }
}
