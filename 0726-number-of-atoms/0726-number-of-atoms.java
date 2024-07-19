class Solution {

    // Global variable
    int index = 0;

    public String countOfAtoms(String formula) {
        // Recursively parse the formula
        Map<String, Integer> finalMap = parseFormula(formula);

        // Sort the final map
        TreeMap<String, Integer> sortedMap = new TreeMap<>(finalMap);

        // Generate the answer string
        StringBuilder ans = new StringBuilder();
        for (String atom : sortedMap.keySet()) {
            ans.append(atom);
            if (sortedMap.get(atom) > 1) {
                ans.append(sortedMap.get(atom));
            }
        }

        return ans.toString();
    }

    // Recursively parse the formula
    private Map<String, Integer> parseFormula(String formula) {
        // Local variable
        Map<String, Integer> currMap = new HashMap<>();
        String currAtom = new String();
        String currCount = new String();

        // Iterate until the end of the formula
        while (index < formula.length()) {
            // UPPERCASE LETTER
            if (Character.isUpperCase(formula.charAt(index))) {
                if (!currAtom.isEmpty()) {
                    if (currCount.isEmpty()) {
                        currMap.put(
                            currAtom,
                            currMap.getOrDefault(currAtom, 0) + 1
                        );
                    } else {
                        currMap.put(
                            currAtom,
                            currMap.getOrDefault(currAtom, 0) +
                            Integer.parseInt(currCount)
                        );
                    }
                }

                currAtom = String.valueOf(formula.charAt(index));
                currCount = "";
                index++;
            }
            // lowercase letter
            else if (Character.isLowerCase(formula.charAt(index))) {
                currAtom += formula.charAt(index);
                index++;
            }
            // Digit. Concatenate the count
            else if (Character.isDigit(formula.charAt(index))) {
                currCount += formula.charAt(index);
                index++;
            }
            // Left Parenthesis
            else if (formula.charAt(index) == '(') {
                index++;
                Map<String, Integer> nestedMap = parseFormula(formula);
                for (String atom : nestedMap.keySet()) {
                    currMap.put(
                        atom,
                        currMap.getOrDefault(atom, 0) + nestedMap.get(atom)
                    );
                }
            }
            // Right Parenthesis
            else if (formula.charAt(index) == ')') {
                // Save the last atom and count of nested formula
                if (!currAtom.isEmpty()) {
                    if (currCount.isEmpty()) {
                        currMap.put(
                            currAtom,
                            currMap.getOrDefault(currAtom, 0) + 1
                        );
                    } else {
                        currMap.put(
                            currAtom,
                            currMap.getOrDefault(currAtom, 0) +
                            Integer.parseInt(currCount)
                        );
                    }
                }

                index++;
                StringBuilder multiplier = new StringBuilder();
                while (
                    index < formula.length() &&
                    Character.isDigit(formula.charAt(index))
                ) {
                    multiplier.append(formula.charAt(index));
                    index++;
                }
                if (multiplier.length() > 0) {
                    int mult = Integer.parseInt(multiplier.toString());
                    for (String atom : currMap.keySet()) {
                        currMap.put(atom, currMap.get(atom) * mult);
                    }
                }

                return currMap;
            }
        }

        // Save the last atom and count
        if (!currAtom.isEmpty()) {
            if (currCount.isEmpty()) {
                currMap.put(currAtom, currMap.getOrDefault(currAtom, 0) + 1);
            } else {
                currMap.put(
                    currAtom,
                    currMap.getOrDefault(currAtom, 0) +
                    Integer.parseInt(currCount)
                );
            }
        }

        return currMap;
    }
}