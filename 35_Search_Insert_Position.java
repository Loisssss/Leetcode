class Solution {
    public int searchInsert(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
        	list.add(nums[i]);
        }
        if (!list.contains(target)) {
			list.add(target);
		}
        Collections.sort(list);
        int result=list.indexOf(target);

        return result;  
    }
}



class Solution {
    public int searchInsert(int[] nums, int target) {
    	int result = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] >= target) {
				result = i;
				break;
			}else if (nums[nums.length - 1] < target) {
				result = nums.length;
			}
        }
        return result;
    }
}
