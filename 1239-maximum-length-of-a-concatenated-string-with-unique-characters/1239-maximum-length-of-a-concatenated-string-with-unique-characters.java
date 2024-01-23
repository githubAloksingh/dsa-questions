class Solution 
{
    public int maxLength(List<String> arr) 
    {
        int max_len = 0; 
        List<Integer> unique = new ArrayList<>();
        for (String s : arr)
        {
            Integer bin = 0;
            for (char ch : s.toCharArray()) bin += 1 << (ch - 'a');
            if (Integer.bitCount(bin) == s.length()) unique.add(bin);
        }
        ArrayList<Integer> concat = new ArrayList<>(List.of(0));
        for (Integer u : unique)
            for (int i = concat.size() - 1; i >= 0; i--)
                if ((concat.get(i) & u) == 0)
                {
                    Integer cc = concat.get(i) | u;
                    concat.add(cc);
                    max_len = Math.max(max_len, Integer.bitCount(cc));
                }

        return max_len;
    }
}