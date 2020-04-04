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
		//e= 123.45; não da para inicializar após a declaração. somente no ato da declaração
	}
}
