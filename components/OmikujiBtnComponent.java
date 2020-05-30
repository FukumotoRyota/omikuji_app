package components;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import others.Miko;
import others.Omikuji;
import others.OmikujiResult;
import services.ResultService;

/*
おみくじボタン
*/

public class OmikujiBtnComponent extends JButton implements ActionListener {
  private JLabel resultLabel;
  private Omikuji omikuji;
  private Miko miko;

  public OmikujiBtnComponent(JLabel resultLabel, Omikuji omikuji, Miko miko) {
    super("<html><span style='font-weight: bold;'>おみくじを引く</span></html>");
    this.resultLabel = resultLabel;
    this.omikuji = omikuji;
    this.miko = miko;
    this.setForeground(Color.BLUE);
    this.addActionListener(this);
    this.setBounds(50, 140, 200, 30);
  }

  public void actionPerformed(ActionEvent ev) {
    OmikujiResult res = omikuji.lot(); // 抽選
    String labelText = miko.speak(res); // 巫女のメッセージ取得
    resultLabel.setText("<html><span style='font-weight: bold'>" + labelText + "</span></html>");
    ResultService.write(res); // csvに書き込み
  }
}