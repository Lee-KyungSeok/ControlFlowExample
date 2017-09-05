
public class Test036 {
	
public void run(String mark, int lines) {
		
		for(int index=0 ; index<lines-1 ; index=index+1) {
			
			for(int innerSpaceIndex=0 ; innerSpaceIndex < lines-index-1 ; innerSpaceIndex++) {
				
				System.out.print(" ");
			}
			
			System.out.print(mark);
			
			for(int innerMarkIndex=0 ; innerMarkIndex<index ; innerMarkIndex++) {
				System.out.print(" ");
			}
			
			
			for(int innerIndex=1 ; innerIndex<index ; innerIndex++) {
				System.out.print(" ");
			}
			
			if(index==0) {
				System.out.println("");
			} else {
				System.out.println(mark);				
			}			
		}
		
		for(int finalIndex=0 ; finalIndex < lines*2-1 ; finalIndex++) {
			System.out.print(mark);
		}
	}

}
