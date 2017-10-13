package iteratorPattern;

public class CitizenIterator implements Iterator {
	private City citizenList;
	private int index;

	public CitizenIterator(City citizenList) {
		this.citizenList = citizenList;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < citizenList.getNumber()){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Citizen next() {
		Citizen citizen = citizenList.getCitizen(index);
		index++;
		return citizen;
	}
}
