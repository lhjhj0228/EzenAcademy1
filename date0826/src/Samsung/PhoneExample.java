package Samsung;

public class PhoneExample {
	public static void main(String[] args) {
		GalaxyS galaxyS = new GalaxyS("자바폰","검정",10);
		GalaxyNote galaxyNote = new GalaxyNote("자바폰","검정",3);
		
		System.out.println("model : " + galaxyS.model);
		System.out.println("color : " + galaxyS.color);
		
		System.out.println("channel : " + galaxyS.channel);
		System.out.println("draw : " + galaxyNote.draw);
		
		galaxyS.powerOn();
		galaxyS.bell();
		galaxyS.sendVoice("여보세요?");
		galaxyS.receiveVoice("안녕하세요. 홍길동입니다.");
		galaxyS.sendVoice("네, 반갑습니다");
		galaxyS.hangUp();
		galaxyS.turnOnDmb();
		galaxyS.changeChannelDmb(12);
		galaxyS.turnOffDmb();
		galaxyS.receiveRadio();
		
		galaxyNote.powerOn();
		galaxyNote.bell();
		galaxyNote.sendVoice("여보세요?");
		galaxyNote.receiveVoice("안녕하세요. 홍길동입니다.");
		galaxyNote.sendVoice("네, 반갑습니다");
		galaxyNote.hangUp();
		galaxyNote.draw();
		galaxyNote.receiveRadio();


	}

}
