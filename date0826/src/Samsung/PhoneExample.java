package Samsung;

public class PhoneExample {
	public static void main(String[] args) {
		GalaxyS galaxyS = new GalaxyS("�ڹ���","����",10);
		GalaxyNote galaxyNote = new GalaxyNote("�ڹ���","����",3);
		
		System.out.println("model : " + galaxyS.model);
		System.out.println("color : " + galaxyS.color);
		
		System.out.println("channel : " + galaxyS.channel);
		System.out.println("draw : " + galaxyNote.draw);
		
		galaxyS.powerOn();
		galaxyS.bell();
		galaxyS.sendVoice("��������?");
		galaxyS.receiveVoice("�ȳ��ϼ���. ȫ�浿�Դϴ�.");
		galaxyS.sendVoice("��, �ݰ����ϴ�");
		galaxyS.hangUp();
		galaxyS.turnOnDmb();
		galaxyS.changeChannelDmb(12);
		galaxyS.turnOffDmb();
		galaxyS.receiveRadio();
		
		galaxyNote.powerOn();
		galaxyNote.bell();
		galaxyNote.sendVoice("��������?");
		galaxyNote.receiveVoice("�ȳ��ϼ���. ȫ�浿�Դϴ�.");
		galaxyNote.sendVoice("��, �ݰ����ϴ�");
		galaxyNote.hangUp();
		galaxyNote.draw();
		galaxyNote.receiveRadio();


	}

}
