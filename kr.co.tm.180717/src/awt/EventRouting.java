package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	public EventRouting() {

		// 윈도우의 시작 좌표와 크기를 설정
		setBounds(200, 200, 400, 400);
		// 윈도우의 제목을 설정
		setTitle("이벤트 라우팅");
		setBackground(Color.WHITE);
		setForeground(Color.BLACK);

		Button btn1 = new Button("한국어");
		Button btn2 = new Button("영어");
		Button btn3 = new Button("종료");

		Label label = new Label();

		Panel centerPanel = new Panel();

		centerPanel.add(btn1);
		centerPanel.add(btn2);
		centerPanel.add(btn3);

		add("Center", centerPanel);

		add("South", label);

		/*
		 * // ActionEvent를 처리할 수 있는 인스턴스 만들기 ActionListener listener1 = new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * label.setText("안녕하세요"); } }; // 컴포넌트와 이벤트를 처리할 수 있는 리스너를 연결
		 * btn1.addActionListener(listener1);
		 * 
		 * // ActionEvent를 처리할 수 있는 인스턴스 만들기 ActionListener listener2 = new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * label.setText("Hello"); } }; // 컴포넌트와 이벤트를 처리할 수 있는 리스너를 연결
		 * btn2.addActionListener(listener2);
		 * 
		 * // ActionEvent를 처리할 수 있는 인스턴스 만들기 ActionListener listener3 = new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { System.exit(0); } };
		 * // 컴포넌트와 이벤트를 처리할 수 있는 리스너를 연결 btn3.addActionListener(listener3);
		 */
		
		ActionListener listener = new ActionListener() {
			
			// 이벤트가 발생한 컴포넌트의 문자열을 가지고 분기
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (e.getActionCommand()) {
				case "한국어":
					label.setText("안녕하세요");
					break;
				case "영어":
					label.setText("Hello");
					break;
				case "종료":
					System.exit(0);
					break;
				}
			}
		};
		// 3개 버튼의 액션 이벤트를 listener가 모두 처리
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);

		// 윈도우를 화면에 출력
		setVisible(true);
	}
}
