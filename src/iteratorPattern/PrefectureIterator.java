package iteratorPattern;

public class PrefectureIterator implements SortIterator {
	private PrefectureList prefectureList;
	private int index;
	
	public PrefectureIterator(PrefectureList prefectureList) {
		this.prefectureList = prefectureList;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (index < prefectureList.getNumber()){
			return true;
		} else {
			return false;
		}
	}

	@Override
	//Objectで返すとダウンクラスしなければいけない？
	public Prefecture next() {
		Prefecture prefecture = prefectureList.getPrefectures(index);
		index++;
		return prefecture;
	} 
}
