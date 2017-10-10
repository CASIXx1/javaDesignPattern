package iteratorPattern;

public class CityIterator implements Iterator{
	private Prefecture cityList;
	private int index;
	
	public CityIterator(Prefecture cityList) {
		this.cityList = cityList;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (index < cityList.getNumber()){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public City next() {
		City city = cityList.getCities(index);
		index++;
		return city;
	} 
}
