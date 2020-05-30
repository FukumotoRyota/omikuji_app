package screens;
import javax.swing.*;
import java.awt.*;
import components.*;
import others.*;

/*
メインページ
*/

public class MainScreen extends JPanel {
  public MainScreen(JFrame frame) {
    this.setLayout(null); // レイアウトマネージャーを無効にする
    ResultCompoent resultLabel = new ResultCompoent();
    this.add(new OmikujiBtnComponent(resultLabel, new Omikuji(), new Miko())); // おみくじボタン
    this.add(new TransitionBtnComponent(frame));
    this.add(resultLabel); // 結果を表示するラベル
    this.add(new MikoCompoent()); // 巫女画像
    this.add(new FukidashiComponent()); // 吹き出し画像
    this.add(new HaikeiComponent()); // 背景画像
  }
}