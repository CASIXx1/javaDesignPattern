package デザインパターン;

public class Prefecture implements Aggregate{
	private String name;
	private int last = 0;
	private City[] cities = new City[100];

	public Prefecture(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public City getCities(int index) {
		return cities[index];
	}
	
	public int getNumber() {
		return this.last;
	}
	
	public void appendCities(City city) {
		this.cities[last] = city;
		last++;
	}

	@Override
	public Iterator iterator() {
		return new CityIterator(this);
	}
}
