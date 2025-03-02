package main.tasks.reverseString;

public class ReverseStringSolution {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        for (char c : s) {
            System.out.print(c);
        }
    }

    public static void reverseString(char[] s) {
        int indexLeft = 0;
        int indexRight = s.length - 1;

        while (indexLeft < indexRight) {
            char left = s[indexLeft];
            char right = s[indexRight];
            s[indexLeft] = right;
            s[indexRight] = left;
            indexLeft += 1;
            indexRight -= 1;
        }
    }

}
