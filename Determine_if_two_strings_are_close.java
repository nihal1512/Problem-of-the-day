if (word1.length() != word2.length()) {
            return false;
        }
        //Operation 1 allows us to move all characters freely
        //Opereration 2 allows us to reassign the characters
        //keep a frequency char of both word1 and word2
        int[] one = new int[26];
        int[] two = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            one[word1.charAt(i) - 'a']++;
            two[word2.charAt(i) - 'a']++;
        }
        //make sure the characters are the same in order to reassign letters
        for (int i = 0; i < 26; i++) {
            if ((one[i] > 0 && two[i] == 0) || (one[i] == 0 && two[i] > 0)) {
                return false;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        //see if there are frequencies that match up in both words
        for (int i = 0; i < 26; i++) {
            if (one[i] != 0) {
                map.put(one[i], map.getOrDefault(one[i], 0) + 1);
            }
            if (two[i] != 0) {
                map.put(two[i], map.getOrDefault(two[i], 0) - 1);
            }
        }
        //all frequences should be 0 so that means we can reassign the frequencies
        for (int key : map.keySet()) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
