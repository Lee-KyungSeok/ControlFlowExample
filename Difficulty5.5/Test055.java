
public class Test055 {
	public void run(String mark, int lines) {
		
		for(int lineIndex =0 ; lineIndex<lines*2-1 ; lineIndex=lineIndex+1) {
			
			//위의 빈 트리 작성
			if(lineIndex<lines) {
				
				//처음 공백 출력
				for(int outerSpaceIndex=0 ; outerSpaceIndex<lineIndex ; outerSpaceIndex=outerSpaceIndex+1) {
					System.out.print(" ");
				}
				
				// 처음 mark 찍기
				System.out.print(mark); 
				
				//가운데 공백 출력1
				for(int innerSpaceIndex1=0 ; innerSpaceIndex1<lines-lineIndex-1 ; innerSpaceIndex1=innerSpaceIndex1+1) {
					System.out.print(" ");
				}
				//가운데 공백 출력2
				for(int innerSpaceIndex2=0 ; innerSpaceIndex2<lines-lineIndex-2 ; innerSpaceIndex2=innerSpaceIndex2+1) {
					System.out.print(" ");
				}
				//마지막 mark 찍기
				if(lineIndex==lines-1) {
					System.out.println("");
				} else {
					System.out.println(mark); 					
				}
			}
			
			//아래 빈 트리 작성
			else {
				
				//처음 공백 출력
				for(int downOuterSpaceIndex=0 ; downOuterSpaceIndex<2*lines-lineIndex-2 ; downOuterSpaceIndex=downOuterSpaceIndex+1) {
					System.out.print(" ");
				}
				
				//처음 mark 출력
				System.out.print(mark);
				
				//가운데 공백 출력1
				for(int downInnerSpaceIndex=0 ; downInnerSpaceIndex<lineIndex-lines+1 ; downInnerSpaceIndex=downInnerSpaceIndex+1) {
					System.out.print(" ");
				}
				
				//가운데 공백 출력2
				for(int downInnerSpaceIndex=0 ; downInnerSpaceIndex<lineIndex-lines ; downInnerSpaceIndex=downInnerSpaceIndex+1) {
					System.out.print(" ");
				}
				
				//마지막 mark 출력
				System.out.println(mark);
				
			}

			
		}
		
	}

}