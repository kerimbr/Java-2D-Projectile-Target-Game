import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    private int width = 1024;
    private int height = 768;

    public App(){
        add(new Game(width,height));
        setSize(width,height);
        setTitle("Hedefe Kilitlenme");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                App app = new App();
                app.setVisible(true);
            }
        });
    }

}
