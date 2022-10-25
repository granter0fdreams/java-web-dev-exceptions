package org.launchcode.exercises;

import java.util.HashMap;

public class Main{

    public static void main(String[] args) {

        // Test out your Divide() function!
//        System.out.println(Divide(1,0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String file : studentFiles.values()){
            System.out.println(CheckFileExtension(file));
        }
    }

    public static int Divide(int x, int y)
    {
        // Write code here!
        if (y == 0){
            try {
                throw new java.lang.ArithmeticException("Cannot divide by zero");
            } catch (java.lang.ArithmeticException e){
                e.printStackTrace();
            }
        }

        return x/y;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        if (fileName.endsWith(".java")){
            return 1;
        } else if (fileName.equals("") || fileName == null){
            try {
                throw new FileExtensionException("Please confirm file is a .java file type.");
            } catch (FileExtensionException e){
                e.printStackTrace();
            }
            return -1;
        } else {
            return 0;
        }
    }

}
