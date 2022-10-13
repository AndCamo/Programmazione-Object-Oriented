public class Main {
    public static void main(String[] args) {
        String sentence = "Hello, World!";
        StringBuilder newSentence = new StringBuilder();
        char sentenceArray[] = sentence.toCharArray();
        for (int i=0; i<sentence.length(); i++)
        {
            if(sentenceArray[i] == 'e')
                newSentence.append('o');
            else if(sentenceArray[i] == 'o')
                newSentence.append('e');
            else
                newSentence.append(sentenceArray[i]);
        }
        System.out.println(newSentence);
    }
}