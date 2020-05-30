package components;
import javax.swing.*;
import java.awt.*;

/*
巫女のメッセージ
*/

public class ResultCompoent extends  JLabel {
  public ResultCompoent() {
    super("<html><span style='font-weight: bold'>何が出るかな？</span></html>", JLabel.CENTER);
    this.setBounds(20, 30, 200, 60);
  }
}