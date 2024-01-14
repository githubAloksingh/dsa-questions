class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] s1 = new int[26];
        int[] s2 = new int[26];
        int[] s3 = new int[26];
        int[] s4 = new int[26];

        for (char x : word1.toCharArray()) {
            s1[x - 'a']++;
            s3[x - 'a'] = 1;
        }

        for (char x : word2.toCharArray()) {
            s2[x - 'a']++;
            s4[x - 'a'] = 1;
        }

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2) && Arrays.equals(s3, s4);
    }
}