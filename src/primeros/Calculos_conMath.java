package primeros;

public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int raiz = (int)Math.sqrt(9);

		System.out.println(raiz);
		
		double mun1=5.85;
		
		int result= (int)Math.round(mun1);
		
		System.out.println(result);
		
		double base=5;
		double exponente=3;
		int resultado=(int)Math.pow(base, exponente);
		
		System.out.println("el resultado es de "+resultado);
		
	}

}
