class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_list = list(s)
        t_list = list(t)

        for char in s_list:
            if char in t_list:
             t_list.remove(char)   # remove only first match
            else:
               return False          # char in s not found in t

        return len(t_list) == 0       # t should be empty



