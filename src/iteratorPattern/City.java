package iteratorPattern;

public class City implements Aggregate{
	private String name;
	private int last = 0;
	private Citizen[] citizens = new Citizen[100];

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public Citizen getCitizen(int index) {
		return this.citizens[index];
	}

	public int getNumber() {
		return this.last;
	}

	public void appendCitizen(Citizen citizen) {
		this.citizens[last] = citizen;
		last++;
	}

	@Override
	public Iterator iterator() {
		return new CitizenIterator(this);
	}
}