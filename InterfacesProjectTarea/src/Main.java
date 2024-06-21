
public class Main implements FiguraGeometrica{

	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Bermudas",20,10,15);
		Triangulo t = new Triangulo ("TriánguloTE",250,175,145);
		Cuadrado cuadri = new Cuadrado ("CuadradoTE",50);
		Rectangulo rectan = new Rectangulo ("RectanguloTE",30,12);
		Trapecio trapi = new Trapecio ("TrapecioTE",100,70,40,60);
		Rombo rombi = new Rombo ("RomboTE",13,27,12);
		Romboide rombidete = new Romboide ("RomboideTE",20,11);
		
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(cuadri);
		imprimirCalculo(rectan);
		imprimirCalculo(trapi);
		imprimirCalculo(rombi);
		imprimirCalculo(rombidete);
		
	}//main
	
	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("| El área de ["+ f.getNombre()
				+ "] es :"+ f.calcularArea()+"|");
		System.out.println("| El perímetro de ["+ f.getNombre()
		+ "] es :"+ f.calcularPerimetro()+"|");
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

}//class
