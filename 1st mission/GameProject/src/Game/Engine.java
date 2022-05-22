package Game;

public class Engine {
	int EventNum = 1;
	int Life = 3;
	
	public void lifeChecker() {
		// if (Life == 0) 게임오버 페이지로 전환
	}
	
	public String eventScript() {
		if (EventNum == 1) {
			return "줄바꿈은 나중에 생각하고 엔진이나 만듭시다";
		}
		else if (EventNum == 2) {
			return "이벤트2";
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
