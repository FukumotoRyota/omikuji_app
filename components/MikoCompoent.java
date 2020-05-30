package components;
import javax.swing.*;
import java.awt.*;

/*
巫女
*/

public class MikoCompoent extends JLabel {
  public MikoCompoent() {
    super("<html><img src='file:assets/miko.png' " + "width='70' height='100'/></html>", JLabel.CENTER);
    this.setBounds(230, 40, 70, 100);
  }
}