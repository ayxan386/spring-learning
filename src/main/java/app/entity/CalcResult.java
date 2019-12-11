package app.entity;

public class CalcResult {
  private final int x, y, res;
  private final String op;

  public CalcResult(int x, int y, int res, String op) {
    this.x = x;
    this.y = y;
    this.res = res;
    this.op = op;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getRes() {
    return res;
  }

  public String getOp() {
    return op;
  }
}
