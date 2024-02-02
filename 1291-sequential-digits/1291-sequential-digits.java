class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        String digits = "123456789";

        int lowLength = String.valueOf(low).length();
        int highLength = String.valueOf(high).length();

        for (int length = lowLength; length <= highLength; length++) {
            for (int start = 0; start <= 9 - length; start++) {
                String subString = digits.substring(start, start + length);
                int num = Integer.parseInt(subString);

                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }

        return result;
    }
}

   