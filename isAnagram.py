# This may be a lot of code, but I am currently re learning python and do not know the available python methods quite yet.

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hashMap1 = {}
        hashMap2 = {}

        for char in s:
            if(char not in hashMap1):
                hashMap1[char] = 1
            else:
                hashMap1[char] = hashMap1[char]+1

        for char in t:
            if(char not in hashMap2):
                hashMap2[char] = 1
            else:
                hashMap2[char] = hashMap2[char]+1   

        if len(hashMap1) != len(hashMap2):
            return False

        for key in hashMap1:
            if key not in hashMap2 or hashMap1[key] != hashMap2[key]:
                return False
        
        return True