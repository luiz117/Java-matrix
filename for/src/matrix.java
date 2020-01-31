import java.util.Random;

public class matrix {	
	
	private int min;
	private int max;
	
	public matrix(int min, int max) {
		this.min=min;
		this.max=max;
	}
	
	
	
	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}


	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}


	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}


	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}


	public static int geraNum(int min, int max) {		
		Random random = new Random();
		int a = random.nextInt((max - min) + 1) + min;
		return a;
	}
	
	
	//L = LINHA /C1 = COLUNA 1 / C2 = COLUNA2
	public int[][][] geraMatriz(int l, int c1, int c2){ 
		int w , x , y , a, b, c;
		//matrix m = new matrix();
		int matrix[][][] = new int [l][c1][c2];
		for(w=0;w<matrix.length ;w++) {
			c=geraNum(min, max);
			//c = r.nextInt((9000 - 1000) + 1) + 1000;
			matrix[w][0][0]=c;			
			for(x=0;x<matrix[w].length;x++) {
				b=geraNum(min, max);
				//b = r.nextInt((9000 - 1000) + 1) + 1000;
				matrix[w][x][0]=b;
				for(y=0;y<matrix[w][x].length;y++) {
					a=geraNum(min, max);
					//a = r.nextInt((9000 - 1000) + 1) + 1000;
					matrix[w][x][y]=a;
				}				
			}			
		}
		return matrix;		
	}
	
	public void showMatrix(int[][][] matrix) {
		int w , x , y;
		
		for(w=0;w<matrix.length ;w++) {							
			for(x=0;x<matrix[0].length;x++) {				
				for(y=0;y<matrix[0][0].length ;y++) {					
					System.out.print(matrix[w][x][y] + " ");
				}
				
				System.out.print("\t \t");
			}	
			
			System.out.println("\t");
		}
	}
	
	
	

}
