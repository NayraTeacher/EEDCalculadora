
public class Operaciones {
	public int sumar(int sumando1, int sumando2){
		return sumando1 + sumando2;
	}
	public int restar(int minuendo, int sustraendo){
		return minuendo - sustraendo;
	}
	public int multiplicar(int factor1, int factor2){
		return factor1 * factor2;
	}
	public int dividir(int dividendo, int divisor){
		if (divisor==0) {
			return -1;
		}else
			return dividendo / divisor;
		
	}
}
