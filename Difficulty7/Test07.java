

//0, 0+1, 0+1+2, 0+1+2+3, 
//마지막 문제 풀장~

public class Test07 {

	public void run(String mark, int lines) {
		
		for(int lineIndex=0; lineIndex<lines ; lineIndex=lineIndex+1) {
			
			//처음 공백 출력
			for(int firstSpaceIndex=0 ; firstSpaceIndex<lines-lineIndex-1 ; firstSpaceIndex++) {
				
				for(int i=0 ; i<firstSpaceIndex+1 ; i++)
				{
					System.out.print(" ");
				}
			}
			
			//mark하고
			System.out.print(mark);
			
			//가운데 공백 출력
			for(int innerSpaceIndex=0 ; innerSpaceIndex<lines ; innerSpaceIndex=innerSpaceIndex+1) {
				System.out.print(" ");

			}
			
			//추가 공백 출력
			for(int innerSpaceIndex2=0 ; innerSpaceIndex2<lineIndex ; innerSpaceIndex2++) {
				
				for(int i=0 ; i<2*(lines-innerSpaceIndex2)-2 ; i++)
				{
					System.out.print(" ");
				}	
			}
			
			//마무리 mark
				System.out.println(mark);

		}
	}

}