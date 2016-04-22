public class Game {

    private char[] correct;
    private char[] verification;
    private int bull, cow, length, run, score, scoreOfOneGame;
    private String word;
    private String finWord;
    private String[] selectWord = {"stay", "branch", "home", "bread", "with", "acrobatic", "string", "pencil", "run", "realy", "private", "exception", "score", "phone", "pine", "line", "rabbit"};

    public void length(int length) {
        this.correct = new char[length];
        this.scoreOfOneGame = length * 100;
        this.length = length;
    }

    public void setScoreOfOneGame(int scoreOfOneGame) {
        this.scoreOfOneGame = scoreOfOneGame;
    }

    public int getScoreOfOneGame() {
        return this.scoreOfOneGame;
    }
    
    public String getSelectWord(int a) {
        return this.selectWord[a];
    }
    
    public String getFinWord() {
        return this.finWord;
    }

    public int getBull() {
        return this.bull;
    }

    public int getLength() {
        return this.length;
    }
    
    public String[] getSelectWord(){
        return selectWord;
    }

    public void begin(String words, int length) { // начало игры
        try {
            if (words.length() != length) {        //проверка на совпадения длины
                throw new LengthException();
            }
            word = selectWord[run];
            this.verification = new char[length];
            for (int i = 0; i < correct.length; i++) {
                correct[i] = this.word.charAt(i);    //перевод нашего слова в массив из чар
            }
            for (int i = 0; i < correct.length; i++) {
                verification[i] = words.charAt(i);   //перевод слова пользователя в массив из чар   
            }
            this.check(words);                                                           //проверка на совпадение
            this.toString(words);                                                        //вывод 
        } catch (LengthException e) {
            e.printStackTrace();
        }
    }

    public void refreshWord() {          // Обновление слова, после нахождения одинаковых букв с одним индексом
        this.word = "";
        for (int i = 0; i < this.length; i++) {
            this.word += correct[i];
        }
    }

    public void check(String words) {
        bull = 0;
        cow = 0;
        try {
            if (scoreOfOneGame < 0) {
                throw new ScoreException();
            }
        } catch (ScoreException ex) {
            ex.printStackTrace();
            System.out.println("THIS WORD = " + this.finWord);
            System.exit(0);
        }
        for (int i = 0; i < correct.length; i++) {
            if (correct[i] == verification[i]) {
                bull++;
                correct[i] = '-';
            }
        }
        for (int i = 0; i < correct.length; i++) {
            this.refreshWord();
            if (this.word.indexOf(verification[i]) >= 0) {
                cow++;
                correct[i] = '-';
            }
        }
    }

    public void randomize() {
        this.finWord = " ";
        while (this.finWord.length() != length) {
            run = (int) Math.round(Math.random() * (this.selectWord.length - 1) - 0);
            this.finWord = selectWord[run];
        }
        this.word = this.finWord;
    }

    public void toString(String words) {

        if (bull == this.length) {
            this.score += this.scoreOfOneGame;
            System.out.println("YOU WIN!");
            System.out.println("THIS WORD: " + this.finWord);
            System.out.println("YOUR SCORE THIS GAME = " + this.scoreOfOneGame);
            System.out.println("ALL SCORE = " + this.score);
        } else {
            System.out.println("Bull is " + this.bull);
            System.out.println("Cow is " + this.cow);
        }
        System.out.println("_______________________________");
    }
}
