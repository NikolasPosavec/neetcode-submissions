class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String s : strs) {
            int temp = 0;
            for(char c : s.toCharArray()) {
                temp += c;
            }
            map.put(s, temp);
        }

        List<List<String>> result = new ArrayList<>();
        for(String t : strs) {
            if(map.containsKey(t)) {
                List<String> temp = new ArrayList<>();
                int curr = map.get(t);
                for(String k : strs) {
                    if(map.containsKey(k) && map.get(k) == curr) {
                        temp.add(k);
                        map.remove(k);
                    }
                }
                result.add(temp);
            }
        }

        return result;
    }
}

// add up all char values
// make map that uses char value as key and original str as value
// we have list that is fully populated with the pairs -> ex. abc : 54
// for each string in strs check if there are others with same int val

