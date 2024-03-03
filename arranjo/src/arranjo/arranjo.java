package arranjo;

public class arranjo {
	
	private int[] arranjo;

	public arranjo(int[] arranjo) {
		
		this.arranjo = arranjo;
		
	}
	
	public int encotreMenor() {
		int menor = arranjo[0];
		
		for (int i =1; 1 < arranjo.length; i++) {
			if (arranjo[i] < menor) {
				menor = arranjo[i];
			}
		}
		return menor;
	}
	
	public int encontreMaior() {
		int maior = arranjo[0];
		
		for (int i=1; 1 < arranjo.length; i++) {
			if (arranjo[i] > maior) {
				maior = arranjo[i];
			}
		}
		return maior;
	}
	
	
	public int somaArray() {
		int soma = 0;
		
		for (int i : arranjo) {
			soma += i;
		}
		return soma;
	}
	


	public int Count( int x) {
		int count = 0;
		for (int i : arranjo) {
			if (x == i) {
				count += 1;
			}		
		}	
	return count;
	}

}