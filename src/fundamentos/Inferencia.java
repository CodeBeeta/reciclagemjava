package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		c = "outro texto";
		System.out.println(c);
		
		double d;
		d = 123.65;
		System.out.println(d);
		
		//var e; [erro]
		//e= 123.45; n�o da para inicializar ap�s a declara��o. somente no ato da declara��o
	}
}
