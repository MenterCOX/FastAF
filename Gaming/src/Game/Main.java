package Game;

import javax.swing.*;

public class Main {
    public static Writer writer = new Writer();
    public static JFrame frame = new JFrame("FastAF");
    public static int xBackGround = 0;
    public static int xPlayer = 0;
    public static int yPlayer = 200;
    public static int speedPlayer = 0;
    public static int health = 3;
    public static int score = 0;
    public static int scoreTime = 30;
    public static final int wallCount = 5;
    public static int xwall[] = new int[wallCount];
    public static int ywall[] = new int[wallCount];
    public static int speedwall= 0;
    public static int xCoin = (int) (Math.random() * 10000 + 1000);
    public static int yCoin = (int) (Math.random() * 350 + 50);
    public static boolean dead = false;
    public static boolean go = false;
    public static boolean stop = false;
    public static boolean left = false;
    public static boolean right = false;

    private static void startGame() {

       //установка координат врагов
        for (int i = 0; i < Main.wallCount; ++i) {
            xwall[i] = (int) ((Math.random() * 5000) + 5000);
            ywall[i] = (int) (50+(Math.random() * 330) );
        }
        //рисвание окна
        FrameController.drawFrame();
        //запуск цикла игры
        GameLoop.loop();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        startGame();
    }
}