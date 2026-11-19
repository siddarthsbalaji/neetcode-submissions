class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length, c = matrix[0].length;
        int low = 0;
        int high = (r * c) - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int i = mid / c;
            int j = mid % c;
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
