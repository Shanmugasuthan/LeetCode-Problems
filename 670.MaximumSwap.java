import java.util.Arrays;  // Import the Arrays class for array operations.

class Solution {  // Define a public class named Solution.

    // Method to find the maximum number after at most one swap of two digits in the number.
    public int maximumSwap(int num) {  

        // Initialize a variable to keep track of the maximum number found.
        int max = 0;  

        // Convert the number to a String to facilitate digit manipulation.
        String str = String.valueOf(num);  

        // Create an array to store the individual digits of the number.
        int[] arr = new int[str.length()];  

        // Loop through each character in the string representation of the number.
        for (int i = 0; i < str.length(); i++) {  
            
            // Get the character at the current index.
            char c = str.charAt(i);  
            
            // Convert the character to its integer value and store it in the array.
            arr[i] = c - '0';  
        }

        // Loop through the array of digits to consider each digit for swapping.
        for (int i = 0; i < arr.length; i++) {  
            // Loop again through the array to find a digit to swap with.
            for (int j = 0; j < arr.length; j++) {  
                
                // Create a copy of the original array to manipulate during swapping.
                int[] tarr = Arrays.copyOf(arr, arr.length);  

                // Swap the digits at index i and j.
                int temp = tarr[i];  
                tarr[i] = tarr[j];  
                tarr[j] = temp;  

                // Convert the modified array back to a string for comparison.
                String comp = Arrays.toString(tarr);  
                
                // Remove unwanted characters (commas, brackets, spaces) to get the pure number string.
                comp = comp.replaceAll("[\\[\\], ]", "");  

                // Parse the cleaned string back to an integer.
                int icomp = Integer.parseInt(comp);  

                // Update max if the newly formed number is greater than the current max.
                max = Math.max(icomp, max);  
            }
        }
        
        // Return the maximum number found after all possible swaps.
        return max;  
    }
}
