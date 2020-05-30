package services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import enums.OmikujiType;
import others.OmikujiResult;

/*
CSVとのやりとりをするクラス
*/

public class ResultService {
  // OmikujiResultをCSVに追加
  public static void write(OmikujiResult res) {
    try {
      FileWriter f = new FileWriter("./data.csv", true);
      PrintWriter p = new PrintWriter(new BufferedWriter(f));
      p.print(res.getType().toString());
      p.print(',');
      p.print(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(res.getDate()));
      p.println();
      p.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  // csvを読み込んで、OmikujiResult配列にする
  public static OmikujiResult[] readAll() {
    ArrayList<OmikujiResult> results = new ArrayList<OmikujiResult>();
    try {
      File f = new File("data.csv");
      BufferedReader br = new BufferedReader(new FileReader(f));
      String line;
      while ((line = br.readLine()) != null) {
        String[] data = line.split(",", 0);
        OmikujiType type = OmikujiType.valueOf(data[0]);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        results.add(new OmikujiResult(type, sdf.parse(data[1])));
      }
      br.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    OmikujiResult[] retval = new OmikujiResult[results.size()];
    results.toArray(retval);
    return retval;
  }
}