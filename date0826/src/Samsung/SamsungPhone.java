package Samsung;

public class SamsungPhone {
	String model;
	String color;
	
	public void powerOn() {
		System.out.println("Power On");
	}
	
	public void powerOff() {
		System.out.println("Power Off");
	}
	public void bell() {
			System.out.println("Bell ring");
			}
			
	public void sendVoice(String message) {
				System.out.println("Send Message :" + message);
			}
			
	public void receiveVoice(String message) {
				System.out.println("Receive Message :" + message);
			}
			
	public void hangUp() {
						System.out.println("Hang Up");
				}
	public void receiveRadio() {
		System.out.println("phone : Radio");
	}
			}

