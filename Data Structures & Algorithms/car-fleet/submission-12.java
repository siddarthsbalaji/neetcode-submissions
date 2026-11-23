class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
        int count = 0;
        double last = -1.0;
        for (int i = 0; i < n; i++) {
            double reach = (double) (target - cars[i][0]) / cars[i][1];
            if (reach > last) {
                last = reach;
                count++;
            }
        }
        return count;
    }
}
