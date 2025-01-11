public class LC_1400 {

    public static boolean  canConstruct(String s, int k) {

        if(s.length() < k) return false;

        if(s.length() ==  k) return true;

        int[] arr = new int[26];


        int count = 0;

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;

        }

        for(int i=0;i<26;i++){
            if(arr[i] % 2 != 0) count++;
        }

        return count > k;

        
    }
    
}
