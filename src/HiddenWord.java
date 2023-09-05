public class HiddenWord {

    public String hiddenWord;
    public String guess;

    public HiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord.toUpperCase();
        System.out.println("The length of the hidden word is " + hiddenWord.length());
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public String getHint(String guess){
        this.guess = guess;
        String hint = "";
        for(int i = 0; i<guess.length();i++){
            if(Character.isLowerCase(guess.charAt(i))){
                throw new IllegalArgumentException("Your guess ( " +guess+ " ) does not contain all uppercase letters. Your guess must contain all uppercase letters!");
            }

        }
        if(guess.length()>hiddenWord.length() || guess.length()<hiddenWord.length()){
            throw new IllegalArgumentException("Your guess ( "+ guess +" ) has "+guess.length()+ " characters. The hidden word has " +hiddenWord.length()+ " characters. Your guess must be a word with " + hiddenWord.length()+ " characters!");
        }


        for (int i = 0; i < hiddenWord.length(); i++) {
            String letter = "" + guess.charAt(i);
            if (hiddenWord.charAt(i) == guess.charAt(i)) {
                hint = hint + hiddenWord.charAt(i);
            } else if (hiddenWord.contains(letter)) {
                hint = hint + "+";
            } else {
                hint = hint + "*";
            }
        }

        return hint;

    }

}


      /*      for (int i = 0; i < hiddenWord.length(); i++) {
                String guessLetter = guess.substring(i, i + 1);
                if (hiddenWord.substring(i, i + 1).equals(guessLetter)) {
                    hint += guessLetter;
                } else if (hiddenWord.indexOf(guessLetter) != -1) {
                    hint += "+";
                } else {
                    hint += "*";
                    }
                }

                return hint;
            }


        public String HiddenWord;

        public String guess;

    public HiddenWord(String word) {
        this.word = word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));
    }
}

    */