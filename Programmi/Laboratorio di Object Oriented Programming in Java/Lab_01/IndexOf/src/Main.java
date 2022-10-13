public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "sasso", "pippo", "test"};

        for (String word : words) {
            int position = -1;
            if (!word.isEmpty()) {
                char firstChar = word.charAt(0);
                for (int i = 1; i < word.length(); i++) {
                    if (word.charAt(i) == firstChar) {
                        position = i;
                        break;
                    }
                }
            }
            System.out.println(position);
        }
    }
}