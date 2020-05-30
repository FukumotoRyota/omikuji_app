package others;
import java.util.Date;
import enums.OmikujiType;

public class Omikuji {
  // 抽選してOmikujiResultを返す
  public OmikujiResult lot() {
    double r = Math.random();
    OmikujiType type;
    if (r > 0.95) {
      type = OmikujiType.DAIKICHI;
    } else if (r > 0.8) {
      type = OmikujiType.KICHI;
    } else if (r > 0.6) {
      type = OmikujiType.CHUKICHI;
    } else if (r > 0.4) {
      type = OmikujiType.SYOKICHI;
    } else if (r > 0.25) {
      type = OmikujiType.SUEKICHI;
    } else if (r > 0.1) {
      type = OmikujiType.KYO;
    } else {
      type = OmikujiType.DAIKYO;
    }
    return new OmikujiResult(type, new Date());
  }
}