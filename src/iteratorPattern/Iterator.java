package iteratorPattern;

public interface Iterator {
	//並び替えなどの機能を足したいが、このインターフェースに足すべきなのか
	public boolean hasNext();
	public Object next();
}
