package Game;

public class Engine {
	int EventNum = 1;
	int Life = 3;
	
	public void lifeChecker() {
		// if (Life == 0) ���ӿ��� �������� ��ȯ
	}
	
	// http://mwultong.blogspot.com/2008/04/html-txt-to-html.html
	// �� ��ũ���� �̺�Ʈ �뺻 �ְ�, ��� ���� ������ ������ ��ȯ �ϰ� �յڷ� <html></html> �־��ָ� �˴ϴ�
	public String eventScript() {
		if (EventNum == 1) {
			return "<html>���� �� ����� �ϱ��� �ʴ´�... ��ȭ ���ΰ��� �̷� ����ϱ�?<br>\r\n"
					+ "������ ������� ��ȭ��ŭ ���������� ���� �� ����. ���ǽ� �ȿ��� �� ������ ������ �� ����.<br>\r\n"
					+ "���� ������ ���� �Ҷ������� ���� �����ִ� ���ǽ� �� �յ� �Ҷ�������<br>\r\n"
					+ "â�� ���� �� �״�� �������̴�. ���� ��� ��� �Ҹ��� �鸮�⵵ ������ ��κ� ��ó�� �����ְų� �̹� �������ų� �ƴϸ�... �����ϱ� �ȴ�<br>\r\n"
					+ "</body>\r\n"
					+ "\r\n"
					+ "</html>";
		}
		else if (EventNum == 2) {
			return "<html>�ڰ� �Ͼ�� �� ħ�뿡�� ���� �Ͼ���� ���ڴٰ� �����ߴ�. �����̶� ���� �߸� �ϻ��̾����� ���ڴ�<br>\r\n"
					+ "�׷��� ������ ���� ���� ������ �� ����. ���� �̻��� �Ҹ��� �鸮�� �͸� ����...<br>\r\n"
					+ "<br>\r\n"
					+ "�̰� ���̴� �����̴� ���� ���� �谡 ������<br>\r\n"
					+ "���� �ο� ���ö��� �ֱ� ������, �ʹ� ��� ���� ������ �� �ߴ�.<br>\r\n"
					+ "���� ������ ������, �ƴϸ� ���� �޿��� ���� �𸣴� �ִ��� �Ʋ��Ծ�߰���...<br>\r\n"
					+ "<br>\r\n"
					+ "�׳����� �ۿ��� ������ �Ҹ��� �鸰��. �� ������ ���� ��� ���� �Ƿ翧�� ���δ�. �ڼ��� ������ ����޶�� ���� �鸰��.</html><br>";
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
