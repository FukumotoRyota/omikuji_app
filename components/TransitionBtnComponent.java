package components;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import screens.HistoryScreen;

/*
履歴ページに遷移するボタン
*/

public class TransitionBtnComponent extends JButton implements ActionListener {
  JFrame frame;
  public TransitionBtnComponent(JFrame frame) {
    super("<html><span>履歴</span></html>");
    this.frame = frame;
    this.setForeground(Color.BLACK);
    this.addActionListener(this);
    this.setBounds(225, 5, 70, 20);
  }

  public void actionPerformed(ActionEvent ev) {
    // HistoryScreenに遷移
    frame.setContentPane(new HistoryScreen(frame));
    frame.validate();
  }
}