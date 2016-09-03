
public class Main {

	public static void main(String[] args) {
		Operacion operacion = new Sumar() ;
		operacion.setNum1(6);
		operacion.setNum2(4);
		
		System.out.println("La suma 1+1= " + operacion.calcular());
		
		
}

}
