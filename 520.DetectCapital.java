class Solution {  // Define a public class named Solution.
    
    // Method to detect if the usage of capitals in the given word is correct.
    public boolean detectCapitalUse(String word) {  
        
        // Initialize counters for uppercase and lowercase letters.
        int upper = 0, lower = 0;  

        // Loop through each character in the string 'word'.
        for (int i = 0; i < word.length(); i++) {  
            
            // Get the character at the current index.
            Character c = word.charAt(i);  
            
            // Check if the character is lowercase.
            if (Character.isLowerCase(c))  
                lower++;  // Increment the lowercase counter.
            // Check if the character is uppercase.
            else if (Character.isUpperCase(c))  
                upper++;  // Increment the uppercase counter.
        }

        // Get the first character of the word for further checks.
        Character c = word.charAt(0);  

        // Check if all characters are lowercase.
        if (lower == word.length() || upper == word.length())  
            return true;  // Return true if the entire word is lowercase or uppercase.
        // Check if the first character is uppercase and all other characters are lowercase.
        else if (Character.isUpperCase(c) && lower == word.length() - 1)  
            return true;  // Return true for correct capital use in this case.
        
        // If none of the above conditions are met, return false.
        return false;  
    }
}
