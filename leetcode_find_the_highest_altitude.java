public class leetcode_find_the_highest_altitude {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int highest = 0;

        for (int change : gain) {
            altitude += change;
            highest = Math.max(highest, altitude);
        }
        return highest;
    }

    public static void main(String[] args) {
        leetcode_find_the_highest_altitude solution = new leetcode_find_the_highest_altitude();
        System.out.println(solution.largestAltitude(new int[]{-5, 1, 5, 0, -7})); // 1
    }
}
