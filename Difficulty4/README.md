# 난이도 4 문제
* 그림</br>
![](https://github.com/Lee-KyungSeok/ControlFlowExample/blob/master/Difficulty4/difficulty_4.PNG)

## __풀이__

1. "라인수(입력값*2-1)" 만큼 반복
2. 라인수가 입력값보다 작은 경우 3~4 번 실행
3. 시작할 때 공백 ("입력값-line번호-1" 개)
4. 값+공백 표시 ("line번호" 개)
5. 라인수가 입력값보다 크거나 같은 경우 6~7 번 실행
6. 시작할 때 공백 ("line번호-입력값+1" 개)
7. 값 표시 ("4*입력값-2*line번호-3" 개)</br>- 개수 : 2(line번호)+(-3-4(line번호-입력값))

#### __소스 코드__
``` java
public class Test04 {

	public void run(String mark, int lines) {

		//라인수 만큼 반복
		for(int index=0 ; index<lines*2-1 ; index=index+1) {

			//라인수가 입력값보다 작은 경우 실행
			if(index<lines){

				// 시작 공백 표시
				for(int innerSpaceIndex=0 ; innerSpaceIndex < lines-index-1 ; innerSpaceIndex++) {
					System.out.print(" ");
				}

				//mark + 공백 표시
				for(int innerMarkIndex=0 ; innerMarkIndex<index+1 ; innerMarkIndex++) {
					if(innerMarkIndex!=index) {
						System.out.print(mark+" ");
					} else {
						System.out.print(mark);
					}
				}

				System.out.println("");

			}
			// 라인수가 입력값보다 크거나 같은 경우 실행
			else {

				// 시작할 때 공백
				for(int downSpaceIndex=0 ; downSpaceIndex < index-lines+1 ; downSpaceIndex++) {
					System.out.print(" ");
				}

				// mark 표시
				for(int downMarkIndex=0 ; downMarkIndex<4*lines-2*index-3 ; downMarkIndex++) {
					System.out.print(mark);
				}
				System.out.println("");
			}
		}
	}
}
```
