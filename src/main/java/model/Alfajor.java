package model;

public class Alfajor extends Producto {
	private String color;
	private String relleno;

	public Alfajor(String color, Size size, String relleno) {
		super(size,Categoria.ALFAJOR);
		this.color = color;
		this.relleno = relleno;
	}

	public Alfajor() {
		super(null, Categoria.ALFAJOR);
	}

	public String getTipo(){
		return "model.Alfajor";
	}

	public String getColor() {
		return color;
	}

	public String getSize() {
		return size.getSize();
	}

	public String getRelleno() {
		return relleno;
	}


	@Override
	public String toString() {
		return "model.Alfajor{" +
				"color='" + color + '\'' +
				", tamano='" + size + '\'' +
				", relleno='" + relleno + '\'' +
				'}';
	}

	public int getPrecio() {
		return switch (size.getSize()) {
			case "Pequeño" -> 5;
			case "Mediano" -> 10;
			case "Grande" -> 15;
			default -> 0;
		};
	}
}