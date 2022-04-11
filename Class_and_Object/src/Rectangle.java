
class Rectangle { // 추상클래스를 상속받으려면 추상 메소드를 구현 해 주어야한다.
	double width;
	double height;
	Rectangle(){
		
	}
	double calcArea() {return width * height;}
	Boolean isSquare() {
		return width * height != 0 && width == height
	}
}
