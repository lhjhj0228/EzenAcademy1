package Samsung;

public class GalaxyS extends SamsungPhone {
	int channel;
	
	GalaxyS(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("channel " + channel + "�� DMB ��� ���� ����");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel " + channel + "������ ����");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ���� ����");


		
	}

}
