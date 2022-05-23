package Game;

public class Engine {
	int EventNum = 1;
	int Life = 3;
	
	public void lifeChecker() {
		// if (Life == 0) 게임오버 페이지로 전환
	}
	
	// http://mwultong.blogspot.com/2008/04/html-txt-to-html.html
	// 위 링크에서 이벤트 대본 넣고, 헤더 없이 본문만 간단히 변환 하고 앞뒤로 <html></html> 넣어주면 됩니다
	public String eventScript() {
		if (EventNum == 1) {
			return "<html>아직 이 사실이 믿기지 않는다... 영화 주인공이 이런 기분일까?<br>\r\n"
					+ "다행히 좀비들이 영화만큼 적극적이진 않은 것 같다. 강의실 안에서 잘 숨으면 안전할 것 같다.<br>\r\n"
					+ "밖은 아직도 많이 소란스럽고 내가 숨어있는 강의실 문 앞도 소란스럽다<br>\r\n"
					+ "창문 밖은 말 그대로 난장판이다. 가끔 사람 비명 소리가 들리기도 하지만 대부분 나처럼 숨어있거나 이미 도망가거나 아니면... 생각하기 싫다<br>\r\n"
					+ "</body>\r\n"
					+ "\r\n"
					+ "</html>";
		}
		else if (EventNum == 2) {
			return "<html>자고 일어나면 집 침대에서 편히 일어났으면 좋겠다고 생각했다. 지금이라도 눈을 뜨면 일상이었으면 좋겠다<br>\r\n"
					+ "그래도 다행히 지금 밖은 조용한 것 같다. 가끔 이상한 소리가 들리는 것만 빼면...<br>\r\n"
					+ "<br>\r\n"
					+ "이게 꿈이던 현실이던 지금 나는 배가 고프다<br>\r\n"
					+ "어제 싸온 도시락이 있긴 하지만, 너무 놀라서 먹을 생각을 못 했다.<br>\r\n"
					+ "언제 밖으로 나갈지, 아니면 언제 꿈에서 깰지 모르니 최대한 아껴먹어야겠지...<br>\r\n"
					+ "<br>\r\n"
					+ "그나저나 밖에서 수상한 소리가 들린다. 문 앞으로 가니 사람 같은 실루엣이 보인다. 자세히 들으니 살려달라는 말이 들린다.</html><br>";
		}
		else if (EventNum == 3) {
			return "이벤트3";
		}
		else return "";
	}
	
	public String select1Text() {
		if (EventNum == 1) {
			return "이벤트1의 1번 선택지";
		}
		else if (EventNum == 2) {
			return "이벤트2의 1번 선택지";
		}
		else if (EventNum == 3) {
			return "이벤트3의 1번 선택지";
		}
		else return "";
	}
	
	public String select2Text() {
		if (EventNum == 1) {
			return "이벤트1의 1번 선택지";
		}
		else if (EventNum == 2) {
			return "이벤트2의 2번 선택지";
		}
		else if (EventNum == 3) {
			return "이벤트3의 3번 선택지";
		}
		else return "";
	}
	
	public String select1Script() {
		if (EventNum == 1) {
			return "이벤트1, 1번 누른 후 대사";
		}
		else if (EventNum == 2) {
			return "이벤트2, 1번 누른 후 대사";
		}
		else if (EventNum == 3) {
			return "이벤트3, 1번 누른 후 대사";
		}
		else return "";
	}
	
	public String select2Script() {
		if (EventNum == 1) {
			return "이벤트1, 2번 누른 후 대사";
		}
		else if (EventNum == 2) {
			return "이벤트2, 2번 누른 후 대사";
		}
		else if (EventNum == 3) {
			return "이벤트3, 2번 누른 후 대사";
		}
		else return "";
	}
}
