package screens;
import javax.swing.*;
import java.awt.*;
import components.BackBtnComponent;
import components.HaikeiComponent;
import components.HistoryTableComponent;
import others.OmikujiResult;
import services.ResultService;

/*
履歴ページ
*/

public class HistoryScreen extends JPanel {
  public HistoryScreen(JFrame frame) {
    this.setLayout(null); // レイアウトマネージャーを無効にする
    this.add(new BackBtnComponent(frame)); // 戻るボタン
    OmikujiResult[] results = ResultService.readAll(); // csvから読み込む
    this.add(new HistoryTableComponent(results)); // 履歴テーブル
    this.add(new HaikeiComponent()); // 背景画像
  }
}