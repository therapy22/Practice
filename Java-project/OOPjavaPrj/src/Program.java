import part3.ex4.UI코드분리하기.Exam;

public class Program {
	
	public static void main(String[] args) {
		NewlecExam exam = new NewlecExam();
		exam.setEng(10);
		
		System.out.println(exam.total());
	}
}
