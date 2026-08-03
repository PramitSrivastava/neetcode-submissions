
class Solution {
    public String minWindow(String s, String t) {
        // Frequency map for characters in `t`
        HashMap<Character, Integer> freqmap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            freqmap.put(ch, freqmap.getOrDefault(ch, 0) + 1);
        }

        int counter = freqmap.size(); // Number of unique characters needed
        int left = 0, start = 0; // `start` keeps track of the smallest window's starting index
        int minLen = Integer.MAX_VALUE; // Initialize with maximum value

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            // If rightChar is in the frequency map, decrement its count
            if (freqmap.containsKey(rightChar)) {
                freqmap.put(rightChar, freqmap.get(rightChar) - 1);
                if (freqmap.get(rightChar) == 0) {
                    counter--; // A required character is fully matched
                }
            }

            // Shrink the window from the left when all characters are matched
            while (counter == 0) {
                char leftChar = s.charAt(left);

                // Update the minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Remove the leftmost character from the window
                if (freqmap.containsKey(leftChar)) {
                    freqmap.put(leftChar, freqmap.get(leftChar) + 1);
                    if (freqmap.get(leftChar) > 0) {
                        counter++; // A required character is now missing
                    }
                }
                left++; // Move the left pointer
            }
        }

        // Return the result
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
