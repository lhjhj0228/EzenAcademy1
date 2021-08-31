package Samsung;

public class GalaxyNote extends SamsungPhone {
	int draw;
	
	GalaxyNote(String model, String color, int draw) {
		this.model = model;
		this.color = color;
		this.draw = draw;
	}
	
	void draw() {
		System.out.println("draw " + draw + "Ω√¿€");
	}	
}