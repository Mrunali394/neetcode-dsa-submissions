class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag = false ;
        if(s.length() != s.length()){
            flag = false;
            
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if(Arrays.equals(sArr , tArr)){
            flag = true ; 
        }

        return flag;

    }
}

