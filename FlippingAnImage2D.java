class Solution {
	public int[][] flipAndInvertImage(int[][] image) {
	int n = image.length;

        for (int i = 0; i < n; i++) {
            reverseRow(image[i]);
        }

        for (int i = 0; i < n; i++) {
            invertRow(image[i]);
        }

        return image;
    }

    private void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;

        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;

            left++;
            right--;
        }
    }

    private void invertRow(int[] row) {
        for (int i = 0; i < row.length; i++) {
            row[i] = (row[i] == 0) ? 1 : 0;
        }
    }
}
