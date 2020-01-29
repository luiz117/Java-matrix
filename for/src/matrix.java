import java.util.Random;

public class matrix {
	
	
//	
//	public int[][][] showMatriz(int[][][] matriz) {
//		
//				
//		return matriz;
//	}

	
	
	
	public int geraNum(int min, int max) {	
		Random random = new Random();
		int a = random.nextInt((max - min) + 1) + min;
		return a;
	}
	
	

}
