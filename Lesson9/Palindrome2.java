public class Palindrome2 {
    public static void main(String[] args) {
        System.out.println();

        String word = "aba";
        char front = ' ';
        char back = ' ';

        for(int frontIndex = 0, backIndex = word.length() - 1; frontIndex < backIndex; frontIndex++, backIndex--) {
            front = word.charAt(frontIndex);
            back = word.charAt(backIndex);
        }

        if(front == back) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome");
        }

        System.out.println();
    }
}
