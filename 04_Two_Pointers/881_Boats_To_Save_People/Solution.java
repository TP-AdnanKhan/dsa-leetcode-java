import java.util.*;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0;
        int r = people.length - 1;
        int count = 0;
        Arrays.sort(people);
        while (l <= r) {
            if (l == r) {
                count++;
                break;
            }
            if (people[l] + people[r] <= limit) {
                count++;
                l++;
                r--;
            } else {
                count++;
                r--;
            }
        }
        return count;
    }
}
