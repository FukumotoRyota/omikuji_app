import javax.swing.*;
import java.awt.*;
import screens.MainScreen;

class OmikujiApp extends JFrame {
  public OmikujiApp() {
    this.setSize(300, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    MainScreen mainScreen = new MainScreen(this);
    this.setContentPane(mainScreen);

    this.setVisible(true);
  }
  public static void main(String[] args) {
    new OmikujiApp();
  }
}