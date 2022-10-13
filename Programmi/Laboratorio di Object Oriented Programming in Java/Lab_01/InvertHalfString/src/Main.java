public class Main {
    public static void main(String[] args) {
        String[] words = {"c","ac","ciao","pippo"};

        for (String word : words) {
            String result;

            if( word.length() < 2)
            {
                result = "Stringa corta";
            }
            else
            {
                String firstHalf;
                String secondHalf;

                firstHalf = word.substring(0, word.length() / 2);
                secondHalf = word.substring(word.length() / 2, word.length());

                result = secondHalf.concat(firstHalf);
            }
            System.out.println(result);
        }
    }
}