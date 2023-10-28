public class Main {

    public static void main(String[] args) {
        String[] words = {"flower","flow","flight"};

        String prefix = commonPrefix(words);

        System.out.println(prefix);  // Outputs "fl"
    }

    private static String commonPrefix(String[] words) {
        int counter = 0;

        for (int i = 0; i < words[0].length(); i++) {
            char letter = words[0].charAt(i);

            for (int j = 1; j < words.length; j++) {
                if (words[j].length() <= i || letter != words[j].charAt(i)) {
                    return words[0].substring(0, counter);
                }
            }

            counter++;
        }

        return words[0].substring(0, counter);
    }
}
