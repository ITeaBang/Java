package datastructure;

import java.util.HashSet;

public class SetMain {

	public static void main(String[] args) {
		
		//TreeSet : 정렬형태, LinkedHashSet : 저장순서형태, HashSet : 알수없는형태
		HashSet<String> song = new HashSet<>();
		song.add("BAAM");
		song.add("장마");
		song.add("소나기");
		song.add("빨간 맛");
		song.add("빨간 맛");
		song.add("바람기억");
		song.add("바람기억");
		song.add("GEE");
		for (String s : song) {
			System.out.println(s);
		}
	}

}
