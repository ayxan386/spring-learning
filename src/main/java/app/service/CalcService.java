package app.service;

import app.entity.CalcResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalcService {


  private final ArrayList<CalcResult> history = new ArrayList<>();

  public CalcResult calc(int x, int y, String op) {
    int res = 0;
    switch (op) {
      case "plus":
        res = x + y;
        break;
      case "div":
        res = x / y;
        break;
      case "mult":
        res = x * y;
        break;
      case "minus":
        res = x - y;
        break;
      default:
        throw new IllegalArgumentException("operation not found");
    }
    CalcResult calcRes = new CalcResult(x, y, res, op);
    history.add(calcRes);
    return calcRes;
  }

  public List<CalcResult> getAll() {
    return history;
  }

}
