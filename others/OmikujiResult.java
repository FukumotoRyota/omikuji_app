package others;

import java.util.Date;
import enums.OmikujiType;

/*
おみくじの結果クラス
くじの種類と引いた日付を持つ
*/

public class OmikujiResult {
  private OmikujiType type;
  private Date date;

  public OmikujiResult(OmikujiType type, Date date) {
    this.type = type;
    this.date = date;
  }

  public OmikujiType getType() {
    return type;
  }

  public Date getDate() {
    return date;
  }
}