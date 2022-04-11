
public class Student {
	String name;
	int ban;
	int number;
	int score_kor = 3;
	int score_eng = 3;
	int score_math = 2;
	
	int getTotal() {
		return this.score_kor + this.score_eng + this.score_math;
	}
	
	float getAverage() {
		return (float)this.getTotal() / 3.0f;
	}
	
}