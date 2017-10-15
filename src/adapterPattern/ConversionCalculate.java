package adapterPattern;

public class ConversionCalculate extends Calculate implements GlobalCalculate {
	private double rate;
	private String currencyCode;

	public double getRate() {
		return rate;
	}

	public ConversionCalculate(double rate, String currencyCode) {
		//スクレイピングとかで自動取得出来たらより良い
		//データベースにアクセス？
		//WebAPIを使用
		//https://www.gaitameonline.com/rateaj/getrate
		this.rate = rate;
		this.currencyCode = currencyCode;
	}

	public double globalCalculate() {
		//adapterパターンにはなっている
		return calculate() / this.rate;
	}
}