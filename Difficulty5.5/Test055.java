
public class Test055 {
	public void run(String mark, int lines) {
		
		for(int lineIndex =0 ; lineIndex<lines*2-1 ; lineIndex=lineIndex+1) {
			
			//���� �� Ʈ�� �ۼ�
			if(lineIndex<lines) {
				
				//ó�� ���� ���
				for(int outerSpaceIndex=0 ; outerSpaceIndex<lineIndex ; outerSpaceIndex=outerSpaceIndex+1) {
					System.out.print(" ");
				}
				
				// ó�� mark ���
				System.out.print(mark); 
				
				//��� ���� ���1
				for(int innerSpaceIndex1=0 ; innerSpaceIndex1<lines-lineIndex-1 ; innerSpaceIndex1=innerSpaceIndex1+1) {
					System.out.print(" ");
				}
				//��� ���� ���2
				for(int innerSpaceIndex2=0 ; innerSpaceIndex2<lines-lineIndex-2 ; innerSpaceIndex2=innerSpaceIndex2+1) {
					System.out.print(" ");
				}
				//������ mark ���
				if(lineIndex==lines-1) {
					System.out.println("");
				} else {
					System.out.println(mark); 					
				}
			}
			
			//�Ʒ� �� Ʈ�� �ۼ�
			else {
				
				//ó�� ���� ���
				for(int downOuterSpaceIndex=0 ; downOuterSpaceIndex<2*lines-lineIndex-2 ; downOuterSpaceIndex=downOuterSpaceIndex+1) {
					System.out.print(" ");
				}
				
				//ó�� mark ���
				System.out.print(mark);
				
				//��� ���� ���1
				for(int downInnerSpaceIndex=0 ; downInnerSpaceIndex<lineIndex-lines+1 ; downInnerSpaceIndex=downInnerSpaceIndex+1) {
					System.out.print(" ");
				}
				
				//��� ���� ���2
				for(int downInnerSpaceIndex=0 ; downInnerSpaceIndex<lineIndex-lines ; downInnerSpaceIndex=downInnerSpaceIndex+1) {
					System.out.print(" ");
				}
				
				//������ mark ���
				System.out.println(mark);
				
			}

			
		}
		
	}

}