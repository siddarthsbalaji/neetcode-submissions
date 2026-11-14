class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int s = 0, surplus = 0, current = 0;
        for (int i = 0; i < gas.length; i++) {
            int difference = gas[i] - cost[i];
            surplus += difference;
            current += difference;
            if (current < 0) {
                s = i + 1;
                current = 0;
            }
        }
        return (surplus >= 0) ? s : -1;
    }
}
