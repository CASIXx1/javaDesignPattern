package デザインパターン;

public class Main {
	public static void main(String[] args) {
		PrefectureList prefectureList = new PrefectureList();
		prefectureList.appendPrefectures(new Prefecture("北海道"));		
		prefectureList.appendPrefectures(new Prefecture("東京都"));
		prefectureList.appendPrefectures(new Prefecture("大阪"));
		prefectureList.appendPrefectures(new Prefecture("福岡"));
		Iterator iterator = prefectureList.iterator();
		
		while(iterator.hasNext()) {
			Prefecture prefecture = (Prefecture) iterator.next();
			System.out.println(prefecture.getName());
		}
		
		Prefecture prefecture = new Prefecture("千葉");
		prefecture.appendCities(new City("松戸市"));
		prefecture.appendCities(new City("柏市"));
		prefecture.appendCities(new City("千葉市"));
		Iterator iterator2 = prefecture.iterator();
		
		while(iterator2.hasNext()) {
			City city = (City)iterator2.next();
			System.out.println(city.getName());
		}
	}
}
