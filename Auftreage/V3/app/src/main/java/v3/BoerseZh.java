package v3;

public class BoerseZh implements StockExchange {
  double nvidia = 106.63;
  double microsoft = 390.12;

  @Override
  public double getPrice(String aktie) {
    switch (aktie) {
      case "nvidia" -> {
          return this.nvidia;
          }
      case "microsoft" -> {
          return this.microsoft;
          }
      default -> throw new AssertionError();
    }
  }

}