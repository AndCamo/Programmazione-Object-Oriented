public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            String result = "";
            if (!word.isEmpty()) {

                String initial = String.valueOf(word.charAt(0));
                String upperCaseInitial = initial.toUpperCase();
                String secondString = word.substring(1, word.length());
                result = upperCaseInitial.concat(secondString);
            }
            System.out.println(result);
        }
    }
}