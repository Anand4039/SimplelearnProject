package com.sl.JavaException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class JavaException {
    public static void main(String[] args) {  
        
        
        PrintWriter pw;  
        try {  
            pw = new PrintWriter("jtp.txt"); //may throw exception   
            pw.println("saved");  
        }  
// providing the checked exception handler  
 catch (FileNotFoundException e) {  
              
            System.out.println(e);  
        }         
    System.out.println("File saved successfully");  
    } 

}
