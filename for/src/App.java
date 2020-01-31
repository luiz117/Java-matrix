import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		//Random r = new Random();
		
//		int w,x,y,z;
//		int a,b,c;		
//		int matrix[][][] = new int [7][8][9];
//		int min=1;
//		int max=9999;
//		matrix m = new matrix();
//		for(w=0;w<matrix.length ;w++) {
//			c=m.geraNum(min, max);
//			//c = r.nextInt((9000 - 1000) + 1) + 1000;
//			matrix[w][0][0]=c;			
//			for(x=0;x<matrix[w].length;x++) {
//				b=m.geraNum(min, max);
//				//b = r.nextInt((9000 - 1000) + 1) + 1000;
//				matrix[w][x][0]=b;
//				for(y=0;y<matrix[w][x].length;y++) {
//					a=m.geraNum(min, max);
//					//a = r.nextInt((9000 - 1000) + 1) + 1000;
//					matrix[w][x][y]=a;
//				}				
//			}			
//		}
//		
//		
//		
//		for(w=0;w<matrix.length ;w++) {							
//			for(x=0;x<matrix[0].length;x++) {				
//				for(y=0;y<matrix[0][0].length ;y++) {					
//					System.out.print(matrix[w][x][y] + " ");
//				}
//				
//				System.out.print("\t \t");
//			}	
//			
//			System.out.println("\t");
//		}
//		
		
		matrix m = new matrix(-11111,99999);
		//m.geraMatriz(7, 5, 3);		
		m.showMatrix(m.geraMatriz(5, 2, 7));

	}

}
