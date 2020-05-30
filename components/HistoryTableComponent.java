package components;

import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

import java.awt.*;
import enums.OmikujiType;
import others.OmikujiResult;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/*
履歴テーブル
*/


public class HistoryTableComponent extends JScrollPane {

  private static final String[] columns = {"くじ名", "日付"};

  private static final Map<OmikujiType, String> names = new HashMap<OmikujiType, String>() {
    {
        put(OmikujiType.DAIKICHI, "大吉");
        put(OmikujiType.KICHI, "吉");
        put(OmikujiType.CHUKICHI, "中吉");
        put(OmikujiType.SYOKICHI, "小吉");
        put(OmikujiType.SUEKICHI, "末吉");
        put(OmikujiType.KYO, "凶");
        put(OmikujiType.DAIKYO, "大凶");
    }
  };

  private static JTable createTable(OmikujiResult[] results) {
    String[][] data = new String[results.length][2];
    for (int i = results.length-1; i >= 0; i--) {
      data[i][0] = names.get(results[i].getType());
      data[i][1] = new SimpleDateFormat("yyyy年MM月dd日hh時mm分ss秒").format(results[i].getDate());
    }
    JTable table = new JTable(data, columns);
    DefaultTableColumnModel columnModel = (DefaultTableColumnModel)table.getColumnModel();
    columnModel.getColumn(0).setPreferredWidth(50);
    columnModel.getColumn(1).setPreferredWidth(230);
    table.setAutoCreateRowSorter(true);
    return table;
  }

  public HistoryTableComponent(OmikujiResult[] results) {
    super(createTable(results));
    this.setBounds(10, 30, 280, 140);
  }
}