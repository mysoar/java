package org.javaro.lecture;

public class Ex7_9 {
	public static void main(String[] args) {
		Student stud1 = new Student("20151613", "��ο�", 3);
		stud1.exam[0].setExamScore("�ڹ�", 88);
		stud1.exam[1].setExamScore("C", 91);
		stud1.exam[2].setExamScore("C++", 92);
		stud1.printGPA();
	}
}

class Student {
	String studNo, name;
	int totSubject;
	Exam[] exam;

	public Student(String studNo, String name, int totSubject) {
		this.studNo = studNo;
		this.name = name;
		this.totSubject = totSubject;
		exam = new Exam[totSubject];
		for (int i = 0; i < exam.length; i++)
			exam[i] = new Exam();
	}

	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getGPA() {
		int sum = 0;
		for (int i = 0; i < exam.length; i++)
			sum = sum + this.exam[i].getScore();
		return sum;
	}

	public void printGPA() {
		for (int i = 0; i < exam.length; i++) {
			System.out.println("����� : " + this.exam[i].getSubject() + ",���� = " + this.exam[i].getScore());
		}
		System.out.println("�����հ� = " + this.getGPA());
	}
}

class Exam {
	String subject;
	int score;

	public void setExamScore(String subject, int score) {
		this.subject = subject;
		this.score = score;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}