
//값은 입력값만큼
//그 사이 공백은 입력값-1 부터 감소
//처음 공백은 0,  8*0+6 ,7*1+5, 6*2+4 
//21,21-1,21-3,21-6,21-10,21-15,21-21
//21 20 18 15 11 6 0
//0, 6, 6+5, 6+5+4...

public class Test06 {
	
	public void run(String mark, int lines) {
		
		//값+공백이 한세트
		
		for(int lineIndex=0; lineIndex<lines ; lineIndex=lineIndex+1) {
			
			//처음 공백 출력
			for(int firstSpaceIndex=0 ; firstSpaceIndex<lineIndex ; firstSpaceIndex++) {
				
				for(int i=0 ; i<lines-firstSpaceIndex-1 ; i++)
				{
					System.out.print(" ");
				}
			}
			
			for(int setIndex=0;setIndex<lines-lineIndex; setIndex=setIndex+1) {
				
				//mark하고
				System.out.print(mark);
				
				//가운데 공백 출력
				for(int middleSpaceIndex=0; middleSpaceIndex<lines-lineIndex-1 ; middleSpaceIndex=middleSpaceIndex+1) {
					System.out.print(" ");
				}
				
			}
				System.out.println("");

		}
	}

}
