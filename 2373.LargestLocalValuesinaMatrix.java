class Solution {  // Define a public class named Solution.

    // Method to find the largest local values in a grid.
    public int[][] largestLocal(int[][] grid) {  

        // Create a new matrix to store the largest local values.
        // The size is reduced by 2 for both dimensions because we are looking at 3x3 grids.
        int[][] matrix = new int[grid.length - 2][grid.length - 2];  

        // Initialize indices for iterating through the grid.
        int i = 0, j = 0;  

        // Outer loop to iterate through the rows of the grid.
        while (i < grid.length - 2) {  
            j = 0;  // Reset column index for each new row.
            
            // Inner loop to iterate through the columns of the grid.
            while (j < grid.length - 2) {  
                // Call the helper function to find the maximum value in the current 3x3 grid.
                matrix[i][j] = soln(grid, i, j);  
                j++;  // Move to the next column.
            }
            i++;  // Move to the next row.
        }
        
        // Return the matrix containing the largest local values.
        return matrix;  
    }

    // Helper method to find the maximum value in a 3x3 grid starting from (a, b).
    static int soln(int[][] grid, int a, int b) {  
        int max = 0;  // Initialize the maximum value to zero.

        // Loop through the 3x3 grid starting from the given top-left corner (a, b).
        for (int i = a; i < a + 3; i++) {  
            for (int j = b; j < b + 3; j++) {  
                // Update max if the current value is greater than the current max.
                max = Math.max(max, grid[i][j]);  
            }
        }

        // Return the maximum value found in the 3x3 grid.
        return max;  
    }
}
