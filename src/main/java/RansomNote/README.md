Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

<code>Input: ransomNote = "a", magazine = "b"<br>
Output: false
</code>

Example 2:

<code>Input: ransomNote = "aa", magazine = "ab"<br>
Output: false
</code>

Example 3:

<code>
Input: ransomNote = "aa", magazine = "aab"
Output: true
</code>

Constraints:

<code>
1 <= ransomNote.length, magazine.length <= 10^5<br></code>
ransomNote and magazine consist of lowercase English letters.