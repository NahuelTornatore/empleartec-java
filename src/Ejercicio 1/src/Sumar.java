
public class Sumar extends Operacion {
    public Sumar (int num1, int num2) {
	this.num1 = num2;
    this.num2 = num2;
    
    }
    
    public Sumar(){
    	
    }
    
	@Override
	public int calcular() {
		return num1 + num2;
		
	}

}
