class Proverb {
    private String[] wordList;

    Proverb(String[] words) {
        this.wordList = words;
    }

    String recite() {
        if (wordList.length == 0) {
            return "";
        }
        StringBuilder proverb = new StringBuilder();
        for (int i = 1; i < wordList.length; i++) {
            proverb.append("For want of a " + wordList[i - 1] + " the " + wordList[i] + " was lost.\n");
        }
        proverb.append("And all for the want of a " + wordList[0] + ".");
        return proverb.toString();
    }

}
