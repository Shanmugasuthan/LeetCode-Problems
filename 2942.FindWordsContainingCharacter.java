class Solution {
    public int findPermutationDifference(String s, String t) {
        // Initialize the sum variable to accumulate the differences
        int sum = 0;
        // Variable to store the index of the character in string t
        int value = 0;

        // Loop through each character in string s
        for (int i = 0; i < s.length(); i++) {
            // Find the index of the character s.charAt(i) in string t
            value = t.indexOf(s.charAt(i));
            // Add the absolute difference between the indices to the sum
            sum += Math.abs(value - i);
        }
        // Return the total sum of differences
        return sum;
    }
}
