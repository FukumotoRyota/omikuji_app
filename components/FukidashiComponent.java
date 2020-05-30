package components;
import javax.swing.*;
import java.awt.*;

/*
吹き出し
*/

public class FukidashiComponent extends JLabel {
  public FukidashiComponent(){
    super("<html><img src='file:assets/fukidashi.png' " + "width='230' height='100'/></html>", JLabel.CENTER);
    this.setBounds(10, 10, 230, 100);
  }
}