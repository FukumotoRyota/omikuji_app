package others;

import java.util.*;
import enums.OmikujiType;

/*
巫女
*/

public class Miko {
  private static final Map<OmikujiType, String> messages = new HashMap<OmikujiType, String>() {
    {
        put(OmikujiType.DAIKICHI, "おめでとう！大吉だよ！");
        put(OmikujiType.KICHI, "よかったね！吉だよ！");
        put(OmikujiType.CHUKICHI, "中吉でした！やったね！");
        put(OmikujiType.SYOKICHI, "小吉でした！いいことあるかな？");
        put(OmikujiType.SUEKICHI, "末吉でした！いいことあるといいね");
        put(OmikujiType.KYO, "凶でした！ぴえーん...");
        put(OmikujiType.DAIKYO, "ざんねん！大凶！");
    }
  };

  // OmikujiResultを受け取ってメッセージを返す
  public String speak(OmikujiResult result) {
    return messages.get(result.getType());
  }
}