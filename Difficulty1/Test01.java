
public class Test01 {
	
	//�Է� 1 : ��ũ�� �Ǵ� ���ڿ�
	//�Է� 2 : ����� �� ��
	
	//<���>
	//A
	//AA
	//AAA
	//AAAA
	//AAAAA
	
	//run("A",5)
	
	public void run(String mark, int lines) {
		for(int index=0 ; index<lines ; index=index+1) {
			for(int innerIndex=0 ; innerIndex<index+1 ; innerIndex++) {
				System.out.print(mark);
			}
			System.out.println("");
		}
	}
}