package components;
import javax.swing.*;
import java.awt.*;

/*
背景
*/

public class HaikeiComponent extends JLabel {
  public HaikeiComponent() {
    super("<html><img src='file:assets/jinja.jpg' width='300' height='200'/></html>", JLabel.CENTER);
    this.setBounds(0, 0, 300, 200);
  }
}