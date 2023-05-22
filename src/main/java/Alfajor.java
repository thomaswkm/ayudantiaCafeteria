public class Alfajor {
	private String color;
	private Size size;
	private String relleno;

	public String getColor() {
		return color;
	}

	public String getSize() {
		return size.getSize();
	}

	public String getRelleno() {
		return relleno;
	}

	public Alfajor(String color, Size size, String relleno) {
		this.color = color;
		this.size = size;
		this.relleno = relleno;
	}

	public Alfajor() {

	}

	@Override
	public String toString() {
		return "Alfajor{" +
				"color='" + color + '\'' +
				", tamano='" + size + '\'' +
				", relleno='" + relleno + '\'' +
				'}';
	}

	public int getCosto() {
		return switch (size.getSize()) {
			case "Pequeño" -> 5;
			case "Mediano" -> 10;
			case "Grande" -> 15;
			default -> 0;
		};
	}
}