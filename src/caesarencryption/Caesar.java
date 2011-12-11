package caesarencryption;

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
            //Replace special chars
            inputText = this.replaceSpecialChars(inputText);  
            //Length of text 
            int textChars = inputText.length();
            //Encryption
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
    private char encryptSingleChar(char textChar) {
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
       return newChar;
    }
    
    
    public String decryptText(String inputText) {
        if(inputText.length() > 0) {
            //Replace special chars
            inputText = this.replaceSpecialChars(inputText);  
            //Length of text 
            int textChars = inputText.length();
            //Encryption
            String resultText = "";
            for(int i = 0; i < textChars; i++) {
              resultText = resultText + String.valueOf(this.decryptSingleChar(inputText.charAt(i)));
            }
            return resultText;
        }
        else return null;
    }
    
    
    private char decryptSingleChar(char textChar) {
       textChar = Character.toUpperCase(textChar);
       char newChar = textChar;
       //Replcae characters
       if(textChar == 'A') newChar = 'X';
       else if(textChar == 'B') newChar = 'Y';
       else if(textChar == 'C') newChar = 'Z';
       else if(textChar == 'D') newChar = 'A';
       else if(textChar == 'E') newChar = 'B';
       else if(textChar == 'F') newChar = 'C';
       else if(textChar == 'G') newChar = 'D';
       else if(textChar == 'H') newChar = 'E';
       else if(textChar == 'I') newChar = 'F';
       else if(textChar == 'J') newChar = 'G';
       else if(textChar == 'K') newChar = 'H';
       else if(textChar == 'L') newChar = 'I';
       else if(textChar == 'M') newChar = 'J';
       else if(textChar == 'N') newChar = 'K';
       else if(textChar == 'O') newChar = 'L';
       else if(textChar == 'P') newChar = 'M';
       else if(textChar == 'Q') newChar = 'N';
       else if(textChar == 'R') newChar = 'O';
       else if(textChar == 'S') newChar = 'P';
       else if(textChar == 'T') newChar = 'Q';
       else if(textChar == 'U') newChar = 'R';
       else if(textChar == 'V') newChar = 'S';
       else if(textChar == 'W') newChar = 'T';
       else if(textChar == 'X') newChar = 'U';
       else if(textChar == 'Y') newChar = 'V';
       else if(textChar == 'Z') newChar = 'W';
       return newChar;        
    }
    
    
    /*
     * 
     */
    private String replaceSpecialChars(String inputText) {
        inputText = inputText.toUpperCase();
        //Replacement
        inputText = inputText.replaceAll(String.valueOf("Ä"), "AE");
        inputText = inputText.replaceAll(String.valueOf("Ö"), "OE");
        inputText = inputText.replaceAll(String.valueOf("Ü"), "UE");
        inputText = inputText.replaceAll(String.valueOf("ß"), "SS");
        //Return new text 
        return inputText;
    }
}
