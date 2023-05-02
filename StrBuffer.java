package comPack.labWork27_4;

public class StrBuffer {
    public static void main(String[] args) {

        StringBuffer str=new StringBuffer("This is StringBuffer");
        System.out.println("Origin Str = "+str);

        // Adds the string”- This is a sample program” to existing string and display it
        str.append("- This is a sample program");
        System.out.println("Adds the string-' This is a sample program' to existing string and display it = "+str);

        //  Inserts the string “Object” into the existing string at 21st postion and display it.
        str.insert(21,"Object");
        System.out.println("Inserts the string “Object” into the existing string at 21st postion and display it. = "+str);

        // Replaces the word “Buffer” with “Builder” and display it.
        int strIndx= str.indexOf("Buffer");
        System.out.println("Replaces the word “Buffer” with “Builder” and display it. = "+str.replace(strIndx, strIndx+"Buffer".length(), "Builder"));

        // Reverses the entire string and displays it.
        System.out.println("Reverses the entire string and displays it. = "+str.reverse());
    
    }
}
