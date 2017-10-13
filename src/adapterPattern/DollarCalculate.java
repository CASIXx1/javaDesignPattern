package adapterPattern;

public class DollarCalculate extends Calculate implements GlobalCalculate {
	private double rate;

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		//スクレイピングとかで自動取得出来たらより良い
		this.rate = rate;
	}

	public double globalCalculate() {
		return calculate() / this.rate;
	}
}