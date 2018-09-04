package frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class ComponentTest extends Frame {
	public ComponentTest() {
		setTitle("체크박스 테스트");
		setLocation(100, 100);
		setSize(500, 500);

		setVisible(true);

		Panel p = new Panel();

		Checkbox ch1 = new Checkbox("독서");
		Checkbox ch2 = new Checkbox("음악감상");
		Checkbox ch3 = new Checkbox("게임");
		Checkbox ch4 = new Checkbox("영화");
		Checkbox ch5 = new Checkbox("운동");
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		p.add(ch4);
		p.add(ch5);
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("남자", group, true);
		Checkbox woman = new Checkbox("여자", group, false);

		Choice ci1 = new Choice();
		ci1.add("봄");
		ci1.add("여름");
		ci1.add("가을");
		ci1.add("겨울");
		p.add(ci1);

		p.add(man);
		p.add(woman);

		
		List list = new List(5, true);
		list.add("Java");
		list.add("Oracle");
		list.add("Front-End");
		list.add("Back-End");
		list.add("Python");
		list.add("Swift");
		list.add("Java-Script");
		p.add(list);
		
		list.remove(4);
		list.remove(0);

		add(p);
		setVisible(true);

	}

}
