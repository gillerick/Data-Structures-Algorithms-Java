package Examples;
//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures


class IsUnique {
    boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) { //Already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        IsUnique u = new IsUnique();
        System.out.println(u.isUniqueChars("Hey"));
    }
}
