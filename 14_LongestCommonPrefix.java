class Q9 {
    public String longestCommonPrefix(String[] strs) {

        String string = "";
        boolean flag = true;
        for (int i = 0; i < strs[0].length(); i++ ) {
        	char digit = strs[0].charAt(i);
        	for (int j = 1; j < strs.length; j++) {
        		if (strs[j].length() <= i + 1 || digit != strs[j].charAt(i)) {
        			flag = false;
        			break;
        		}
        	}
        	if (flag == false) {
        		break;
        	}	
    		string +=digit;
        }
		return string; 
    }
    public static void main(String []args) {
        Q9 solu = new Q9(); 
        String[] nums = new String[]{"flower", "flow", "flight"};
        String result = solu.longestCommonPrefix(nums);
        System.out.println(result);
    }
}
