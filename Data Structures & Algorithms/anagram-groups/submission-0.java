
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store grouped anagrams
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
           
            String sortedKey = new String(chars);
            
            // Add the original string to the corresponding group in the map
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }
            map.get(sortedKey).add(s);
        }
        
        // Return the values of the map as a list of lists
        return new ArrayList<>(map.values());
    }
}
