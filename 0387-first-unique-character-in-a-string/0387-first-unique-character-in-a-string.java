class Solution {
    public int firstUniqChar(String s) {
        // define Hashing
        HashMap<Character, Integer> arr = new HashMap<>();
        // add frequency of each character in hashmap
        for(int i = 0; i < s.length(); i++){
            arr.put(s.charAt(i), arr.getOrDefault(s.charAt(i), 0) + 1);
            // if (arr.containsKey(ch)) {
            // arr.put(ch, arr.get(ch) + 1); // If it exists, get the value and add 1
            // } else {
            // arr.put(ch, 1);               // If it doesn't exist, start the count at 1
            // }
        }
        //identify first unique char in word
        for(int i = 0; i < s.length(); i++){
            if(arr.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}