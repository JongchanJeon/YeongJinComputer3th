package Game;

public class Engine {
	int EventNum = 1;
	int Life = 3;
	
	public void lifeChecker() {
		// if (Life == 0) ���ӿ��� �������� ��ȯ
	}
	
	public String eventScript() {
		if (EventNum == 1) {
			return "�ٹٲ��� ���߿� �����ϰ� �����̳� ����ô�";
		}
		else if (EventNum == 2) {
			return "�̺�Ʈ2";
		}
		else if (EventNum == 3) {
			return "�̺�Ʈ3";
		}
		else return "";
	}
	
	public String select1Text() {
		if (EventNum == 1) {
			return "�̺�Ʈ1�� 1�� ������";
		}
		else if (EventNum == 2) {
			return "�̺�Ʈ2�� 1�� ������";
		}
		else if (EventNum == 3) {
			return "�̺�Ʈ3�� 1�� ������";
		}
		else return "";
	}
	
	public String select2Text() {
		if (EventNum == 1) {
			return "�̺�Ʈ1�� 1�� ������";
		}
		else if (EventNum == 2) {
			return "�̺�Ʈ2�� 2�� ������";
		}
		else if (EventNum == 3) {
			return "�̺�Ʈ3�� 3�� ������";
		}
		else return "";
	}
	
	public String select1Script() {
		if (EventNum == 1) {
			return "�̺�Ʈ1, 1�� ���� �� ���";
		}
		else if (EventNum == 2) {
			return "�̺�Ʈ2, 1�� ���� �� ���";
		}
		else if (EventNum == 3) {
			return "�̺�Ʈ3, 1�� ���� �� ���";
		}
		else return "";
	}
	
	public String select2Script() {
		if (EventNum == 1) {
			return "�̺�Ʈ1, 2�� ���� �� ���";
		}
		else if (EventNum == 2) {
			return "�̺�Ʈ2, 2�� ���� �� ���";
		}
		else if (EventNum == 3) {
			return "�̺�Ʈ3, 2�� ���� �� ���";
		}
		else return "";
	}
}
