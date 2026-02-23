public class StringMagic2 {
    public String reverseWordInSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }
        String[] words = sentence.split(" ");
        String reversedSentence = "";
        for (String word : words) {
            reversedSentence = word + " " + reversedSentence;
        }
        return reversedSentence.trim();
    }
}