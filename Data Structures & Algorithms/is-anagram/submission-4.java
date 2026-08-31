class Solution {
    public boolean isAnagram(String s, String t) {
        /// Soln 1 Sorting
        // boolean flag = false ;
        // if(s.length()!=t.length()){
        // flag = false ; 
        // } else{
        //     char[] sArr = s.toCharArray();
        //     char[] tArr = t.toCharArray();

        //     Arrays.sort(sArr);
        //     Arrays.sort(tArr);

        //     if(Arrays.equals(sArr,tArr)){
        //         flag = true;
        //     }

        // }

        ///Soln 2 HashMap
        // if(s.length()!=t.length()){
        //     return false ; 
        // }

        // Map<Character,Integer> sfreq = new HashMap<>();
        // Map<Character,Integer> tfreq = new HashMap<>();

        // for(int i = 0 ; i<s.length(); i++){
        //     char chs = s.charAt(i);
        //     char cht = t.charAt(i); 

        //     if(!sfreq.containsKey(chs)){
        //         sfreq.put(chs,1);
        //     }else{
        //         sfreq.put(chs,sfreq.get(chs)+1);
        //     }

        //     if(!tfreq.containsKey(cht)){
        //         tfreq.put(cht,1);
        //     }else{
        //         tfreq.put(cht,tfreq.get(cht)+1);
        //     }
        // }

        // if(sfreq.equals(tfreq)){
        //     return true;
        // }

        if(s.length()!=t.length()){
            return false;
        }

        Map<Character,Integer> s_freq= new HashMap<>();
        Map<Character,Integer> t_freq= new HashMap<>();

        for(int i = 0 ; i<s.length() ; i++){
           char s_ch = s.charAt(i);
           char t_ch = t.charAt(i);

            if(!s_freq.containsKey(s_ch)){
                s_freq.put(s_ch,1);
            } else{
                s_freq.put(s_ch,s_freq.get(s_ch)+1);
            }

            if(!t_freq.containsKey(t_ch)){
                t_freq.put(t_ch,1);
            }else{
                t_freq.put(t_ch,t_freq.get(t_ch)+1);
            }
        }

        if(s_freq.equals(t_freq)){
            return true;
        }
        return false;
    }
}

