/*
* Java made text blocks in Java 15 as a standard feature to handle multiline strings like JSON/XML/HTML etc.
* It was introduced in Java 13 as a preview feature.
*
*/

package com.javafeature.java13;

public class TextBlock {

    public static void main(String[] args) {

        String textBlock = """
        {
            "name":"Tejas",
            "RollNo" : "32"
        }
        """;
        System.out.println(textBlock);

        //old way
        String stringJSON = "{\r\n"
                + "   \"Name\" : \"Mahesh\",\r\n"
                + "   \"RollNO\" : \"45\"\r\n"
                + "}";
        System.out.println(stringJSON);

        String textBlockTest = """
        {
            "name":"%s",
            "RollNo" : "%s"
        }
        """.formatted("Test","25");
        System.out.println(textBlockTest);

        String textBlockTest1 = """
                    {
                        "name":"%s",
                        "RollNo" : "%s"
                    }
        """.formatted("John","89");
        System.out.println(textBlockTest1);
        //stripIndent() - removes incidental white spaces from the start and end of the string.
        //translateEscapes() - translate the escape sequences as per the string syntax.







    }
}
