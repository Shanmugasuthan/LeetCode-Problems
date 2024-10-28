class Solution {
    // Main function to find the largest local values in each 3x3 subgrid of the given grid
    public int[][] largestLocal(int[][] grid) {

        // Calculate the size of the output matrix (reduced by 2 in each dimension for valid 3x3 subgrids)
        int n = grid.length - 2;

        // Initialize the output matrix to store the maximum values for each 3x3 subgrid
        int[][] matrix = new int[n][n];

        // Iterate over each possible starting row index for a 3x3 subgrid
        for(int i = 0; i < n; i++) {
            // Iterate over each possible starting column index for a 3x3 subgrid
            for(int j = 0; j < n; j++) {
                // Calculate the maximum value within the 3x3 subgrid starting at (i, j) in the original grid
                matrix[i][j] = soln(grid, i, j);
            }
        }
        
        // Return the completed matrix with the largest local values
        return matrix;
    }

    // Helper function to find the maximum value in a 3x3 subgrid of `grid` starting at (a, b)
    int soln(int[][] grid, int a, int b) {
        // Initialize `max` to the smallest possible integer to ensure any grid value will be larger
        int max = Integer.MIN_VALUE;

        // Iterate over the rows in the 3x3 subgrid starting from row index `a`
        for(int i = a; i < a + 3; i++) {
            // Iterate over the columns in the 3x3 subgrid starting from column index `b`
            for(int j = b; j < b + 3; j++) {
                // Update `max` to the largest value found within the 3x3 subgrid
                max = Math.max(max, grid[i][j]);
            }
        }

        // Return the maximum value found in this 3x3 subgrid
        return max;
    }
}
