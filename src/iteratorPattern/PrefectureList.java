package iteratorPattern;

public class PrefectureList implements Aggregate{
	private Prefecture[] prefectures = new Prefecture[47];
	private int last = 0;
	
	public Prefecture getPrefectures(int index) {
		return prefectures[index];
	}
	
	public void appendPrefectures(Prefecture prefecture) {
		this.prefectures[last] = prefecture;
		last++;
	}
	
	public int getNumber() {
		return last;
	}
	
	@Override
	public Iterator iterator() {
		return new PrefectureIterator(this);
	}
}
