package Examples;

import java.util.Arrays;

public class IsAnagram {
        static boolean checkIsAnagram(String s1, String s2){
        String copyOfs1 = s1.replace(" ", "");
        String copyOfs2 = s2.replace(" ", "");
        if (copyOfs1.length() != copyOfs2.length()){
            return false;
        }

        else {
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            return Arrays.equals(s1Array, s2Array);
        }

    }

    public static void main(String[] args) {
        System.out.println(checkIsAnagram("listen", "silent"));
        System.out.println(checkIsAnagram("hey", "rabbit"));
    }
}
