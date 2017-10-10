package adapterPattern;

public class DollarCalculate extends Calculate implements GlobalCalculate {

	public int globalCalculate() {
		calculate();
		return 100;
	}
}