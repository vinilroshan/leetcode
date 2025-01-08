// https://leetcode.com/problems/valid-parentheses/description
public class _0020 {
    public boolean isValid(String s) {
        char[] tracker = new char[s.length() + 1];
        int pointer = 0;
        boolean result = true;
        for (char bracket : s.toCharArray()) {
            switch(bracket) {
                case '(':
                case '{':
                case '[': tracker[++pointer] = bracket; break;
                case ')': {
                    if (tracker[pointer] == '(') {
                        pointer --;
                    } else {
                        result = false;
                    }
                    break;
                }
                case ']': {
                    if (tracker[pointer] == '[') {
                        pointer --;
                    } else {
                        result = false;
                    }
                    break;
                }
                case '}': {
                    if (tracker[pointer] == '{') {
                        pointer --;
                    } else {
                        result = false;
                    }
                    break;
                }
            }
        }
        if (pointer != 0) {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        _0020 solution = new _0020();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("(()"));
        System.out.println(solution.isValid("(())"));
        System.out.println(solution.isValid("(()))"));
        System.out.println(solution.isValid("(()){}[]"));
    }
}
