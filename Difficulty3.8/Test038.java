
public class Test038 {
	
	public void run(String mark, int lines) {
		for(int index=0 ; index<lines*2-1 ; index=index+1) {
			
			if(index<lines){
				for(int innerSpaceIndex=0 ; innerSpaceIndex < lines-index-1 ; innerSpaceIndex++) {
					
					System.out.print(" ");
				}
				
				for(int innerMarkIndex=0 ; innerMarkIndex<index+1 ; innerMarkIndex++) {
					System.out.print(mark);
				}
				
				for(int innerIndex=0 ; innerIndex<index ; innerIndex++) {
					System.out.print(mark);
				}
				System.out.println("");
			}
			else {
				for(int downSpaceIndex=0 ; downSpaceIndex < index-lines+1 ; downSpaceIndex++) {
					
					System.out.print(" ");
				}
				
				for(int downMarkIndex=0 ; downMarkIndex<2*lines-index-1 ; downMarkIndex++) {
					System.out.print(mark);
				}
				
				for(int downIndex=0 ; downIndex<2*lines-index-2 ; downIndex++) {
					System.out.print(mark);
				}

				System.out.println("");
			}
		}
	}

}
