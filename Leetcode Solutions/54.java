import java.util.ArrayList;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Optimal Solution TC=O(m*n) SC=O(m*n)
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = columns-1;
        int top = 0;
        int bottom = rows-1;
        while (top<=bottom && left<=right) {
            for (int i=left; i<=right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i=top; i<=bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top<=bottom) {
                for (int i=right; i>=left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left<=right) {
                for (int i=bottom; i>=top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }
}