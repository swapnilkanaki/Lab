package comPack.labWork27_4;

public class StrManipulation {
    public static void main(String[] args) {
        String str="Welcome to Java World";
        // Returns the character at 5th position and display it.
        System.out.println("Returns the character at 5th position and display it. = "+str.charAt(4));

        // Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
        System.out.println("Compares the above String with “Welcome” lexicographically ignoring case differences and display the result. = "+str.equalsIgnoreCase("Welcome"));

        // Concatenates “- Let us learn” to the above string and display it
        str+=" - Let us learn";
        System.out.println("concate '- Let us learn' = " +str);

        // Returns the position of the first occurrence of character ‘a’ and display it.
        System.out.println("Returns the position of the first occurrence of character ‘a’ and display it. = "+str.indexOf('a'));

        // Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it
        System.out.println("Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it = "+str.replace('a','e'));

        // Returns string between 4th position and 10th position and display it.
        System.out.println("Returns string between 4th position and 10th position and display it. = "+str.substring(4,10));

        // Returns the lowercase of the string and display it.
        System.out.println("Returns the lowercase of the string and display it. = "+str.toLowerCase());

    }
}
