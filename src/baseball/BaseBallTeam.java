package baseball;

public class BaseBallTeam {
    //カプセル化したフィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    // 引数なしのコンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
    this.name = name;
    this.win = win;
    this.lose = lose;
    this.draw = draw;
    }
    // 勝率を返すメソットの定義
    public double getRate() {
        double rate = (double)win / (win + lose);
        return rate;
    }
    public void report() {
        System.out.println(getName() + " の2022年の成績は " + getWin() + "勝 " + getLose() + "敗 " + getDraw() + "分、勝率は " + getRate() + "です。");
    }
    // getメソットを用いて値を設定
    public String getName() {
        return name;
    }
    public int getWin() {
        return win;
    }
    public int getLose() {
        return lose;
    }
    public int getDraw() {
        return draw;
    }
}



