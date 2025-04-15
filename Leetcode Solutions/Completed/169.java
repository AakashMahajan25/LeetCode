import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = -1;
        int frequency = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()>frequency) {
                majorityElement = entry.getKey();
                frequency = entry.getValue();
            }
        }
        return majorityElement;
    }
}