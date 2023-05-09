public class Alfajor {
	private String color;
	private String tamano;
	private String relleno;

	public String getColor() {
		return color;
	}

	public String getTamano() {
		return tamano;
	}

	public String getRelleno() {
		return relleno;
	}

	public Alfajor(String color, String tamano, String relleno) {
		this.color = color;
		this.tamano = tamano;
		this.relleno = relleno;
	}

	public Alfajor() {

	}

	@Override
	public String toString() {
		return "Alfajor{" +
				"color='" + color + '\'' +
				", tamano='" + tamano + '\'' +
				", relleno='" + relleno + '\'' +
				'}';
	}
}