package components;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import screens.MainScreen;

/*
戻るボタン
*/

public class BackBtnComponent extends JButton implements ActionListener {
  JFrame frame;
  public BackBtnComponent(JFrame frame) {
    super("<html><span>戻る</span></html>");
    this.frame = frame;
    this.setForeground(Color.BLACK);
    this.addActionListener(this);
    this.setBounds(225, 5, 70, 20);
  }

  public void actionPerformed(ActionEvent ev) {
    // MainScreenへ遷移
    frame.setContentPane(new MainScreen(frame));
    frame.validate();
  }
}