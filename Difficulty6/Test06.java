
//���� �Է°���ŭ
//�� ���� ������ �Է°�-1 ���� ����
//ó�� ������ 0,  8*0+6 ,7*1+5, 6*2+4 
//21,21-1,21-3,21-6,21-10,21-15,21-21
//21 20 18 15 11 6 0
//0, 6, 6+5, 6+5+4...

public class Test06 {
	
	public void run(String mark, int lines) {
		
		//��+������ �Ѽ�Ʈ
		
		for(int lineIndex=0; lineIndex<lines ; lineIndex=lineIndex+1) {
			
			//ó�� ���� ���
			for(int firstSpaceIndex=0 ; firstSpaceIndex<lineIndex ; firstSpaceIndex++) {
				
				for(int i=0 ; i<lines-firstSpaceIndex-1 ; i++)
				{
					System.out.print(" ");
				}
			}
			
			for(int setIndex=0;setIndex<lines-lineIndex; setIndex=setIndex+1) {
				
				//mark�ϰ�
				System.out.print(mark);
				
				//��� ���� ���
				for(int middleSpaceIndex=0; middleSpaceIndex<lines-lineIndex-1 ; middleSpaceIndex=middleSpaceIndex+1) {
					System.out.print(" ");
				}
				
			}
				System.out.println("");

		}
	}

}
