package caesarencryption;

import java.io.*;
import java.lang.*;
import java.util.*;
/**
 * Caesar Class - The main class for en- and decryption
 * 
 * @author Florian Nitschmann
 * @version 0.1
 */
public class Caesar {
    
    //Encryption
    public String encryptText(String inputText) {
        if(inputText.length() > 0) {
            //Length of text 
            Integer textChars = inputText.length();
            //Turn text to upper case
            inputText = inputText.toUpperCase();
            for(int i = 0; i < textChars; i++) {
                //Replace all special german characters
                char textChar = inputText.charAt(i);
                if(textChar == 'ä' || textChar == 'Ä') {
                  inputText = inputText.replaceAll(String.valueOf(textChar), "AE");
                }
                else if(textChar == 'ö' || textChar == 'Ö') {
                  inputText = inputText.replaceAll(String.valueOf(textChar), "OE");
                }
                else if(textChar == 'ü' || textChar == 'Ü') {
                  inputText = inputText.replaceAll(String.valueOf(textChar), "UE");
                }
                else if(textChar == 'ß') {
                  inputText = inputText.replaceAll(String.valueOf(textChar), "SS");
                }
            }
            
           String resultText = "";
           for(int i = 0; i < textChars; i++) {
               resultText = resultText + String.valueOf(this.encryptSingleChar(inputText.charAt(i)));
           }
           
           return resultText;
        }
        else return null;
    }
    
    /*
     * 
     */
    private char encryptSingleChar(Character textChar) {
       textChar = Character.toUpperCase(textChar);
       char newChar = textChar;
       //Replcae characters
       if(textChar == 'A') newChar = 'D';
       else if(textChar == 'B') newChar = 'E';
       else if(textChar == 'C') newChar = 'F';
       else if(textChar == 'D') newChar = 'G';
       else if(textChar == 'E') newChar = 'H';
       else if(textChar == 'F') newChar = 'I';
       else if(textChar == 'G') newChar = 'J';
       else if(textChar == 'H') newChar = 'K';
       else if(textChar == 'I') newChar = 'L';
       else if(textChar == 'J') newChar = 'M';
       else if(textChar == 'K') newChar = 'N';
       else if(textChar == 'L') newChar = 'O';
       else if(textChar == 'M') newChar = 'P';
       else if(textChar == 'N') newChar = 'Q';
       else if(textChar == 'O') newChar = 'R';
       else if(textChar == 'P') newChar = 'S';
       else if(textChar == 'Q') newChar = 'T';
       else if(textChar == 'R') newChar = 'U';
       else if(textChar == 'S') newChar = 'V';
       else if(textChar == 'T') newChar = 'W';
       else if(textChar == 'U') newChar = 'X';
       else if(textChar == 'V') newChar = 'Y';
       else if(textChar == 'W') newChar = 'Z';
       else if(textChar == 'X') newChar = 'A';
       else if(textChar == 'Y') newChar = 'B';
       else if(textChar == 'Z') newChar = 'C';
       //Return the character
       return newChar;
    }
}
