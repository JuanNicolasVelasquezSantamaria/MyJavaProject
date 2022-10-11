package Taller1Corte3;

public class Punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original[][]={{11,12,13},{21,22,23}};     
		
		int traspuesta[][]=new int[3][2];   
		    
		
		for(int i=0;i<3;i++){    
		for(int j=0;j<2;j++){   
			
			traspuesta[i][j]= original[j][i];
		}   
		}    
		  
		System.out.println("Matriz sin trasponer:");  
		for(int i=0;i<2;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(original[i][j]+" ");   
		
		}    
		System.out.println(); 
		}    
		System.out.println("Matriz traspuesta:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<2;j++){    
		System.out.print(traspuesta[i][j]+" ");    
		}    
		System.out.println();   
		}    
		}  
	}

