class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChart = t.charAt(i);

            //countS HashMap
            if(!countS.containsKey(sChar)) {
                countS.put(sChar, 1);
            } else {
                countS.put(sChar, countS.get(sChar) + 1);
            }

            //countT HashMap
            if(!countT.containsKey(tChart)) {
                countT.put(tChart, 1);
            } else {
                countT.put(tChart, countT.get(tChart) + 1);
            }
        }
        return countS.equals(countT);
    }
}
