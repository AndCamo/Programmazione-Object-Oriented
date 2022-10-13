public class Main {
    public static void main(String[] args) {
        String[] words = {"c","ac","pippo"};

        for (String word : words) {
            String result;
            if(word.length() < 2)
            {
                result = "Stringa corta";
            }
            else
            {
                String first = word.substring(0, 1);
                String last = word.substring(word.length() - 1, word.length());
                result = last + word.substring(1, word.length() - 1) + first;
            }
            System.out.println(result);
        }
    }
}