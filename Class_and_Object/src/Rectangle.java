
class Rectangle { // �߻�Ŭ������ ��ӹ������� �߻� �޼ҵ带 ���� �� �־���Ѵ�.
	double width;
	double height;
	Rectangle(){
		
	}
	double calcArea() {return width * height;}
	Boolean isSquare() {
		return width * height != 0 && width == height
	}
}
