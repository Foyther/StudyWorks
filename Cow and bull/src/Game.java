
import java.util.ArrayList;

public class Game {

    private char[] correct;
    private char[] verification;
    private int bull, cow, length, run, score, scoreOfOneGame;
    
    private String word;
    private String finWord;
    private ArrayList<String> selectWord;
    private Record rec;
    private DB refresh = new DB("save.txt");

    public void setScore(Integer score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    
    public void useDB(DB db){
        selectWord = db.read();
    }
    
    public void setRefresh(DB refresh) {
        this.refresh = refresh;
    }

    public DB getRefresh() {
        return refresh;
    }

    public void length(int length) {
        this.correct = new char[length];
        this.verification = new char[length];
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
        return this.selectWord.get(a);
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
    
    public ArrayList getSelectWord(){
        return selectWord;
    }

    public void begin(String words, int length) { // начало игры
        try {
            if (words.length() != length) {        //проверка на совпадения длины
                throw new LengthException();
            }
            word = selectWord.get(run);
            for (int i = 0; i < correct.length; i++) {
                correct[i] = this.word.charAt(i);    //перевод нашего слова в массив из чар
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
        run = (int) Math.round(Math.random() * (this.selectWord.size()- 1) - 0);
        this.word = selectWord.get(run);
        this.finWord = this.word;
    }

    public void toString(String words) {
        if (bull == this.length) {
            this.score += this.scoreOfOneGame;
            System.out.println("YOU WIN!");
            this.refresh.write("YOU WIN!");
            System.out.println("THIS WORD: " + this.finWord);
            this.refresh.write("THIS WORD: " + this.finWord);
            System.out.println("YOUR SCORE THIS PART OF GAME = " + this.scoreOfOneGame);
            this.refresh.write("YOUR SCORE THIS PART OF GAME = " + this.scoreOfOneGame);
            System.out.println("ALL SCORE = " + this.score);
            this.refresh.write("ALL SCORE = " + this.score);
            this.refresh.write(this.score);
            rec = new Record(this.score, new DB("record.txt"));
            System.out.println("RECORD OF THIS GAME - " + rec.getCurRec());
        } else {
            System.out.println("Bull is " + this.bull);
            this.refresh.write("Bull is " + this.bull);
            System.out.println("Cow is " + this.cow);
            this.refresh.write("Cow is " + this.cow);
        }
        System.out.println("_______________________________");
    }
}
