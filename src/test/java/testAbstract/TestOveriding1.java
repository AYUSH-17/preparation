package testAbstract;


public class TestOveriding1 {
    public static void main(String[] args) {
        Student student = new Student();
        SchoolStudent schoolStudent = new SchoolStudent();
        CollegeStudent collegeStudent = new CollegeStudent();
        student.read();
        schoolStudent.read("Paytm ko kaise doobna hai");
        collegeStudent.read("bank ko doobna hai" ,"bank doob gya");
    }
}

class Student {
    public void read() {
        System.out.println("The student is reading");
    }
}
class SchoolStudent extends Student {
    public void read(String book) {
        System.out.println("the student is reading "+ book);
    }
}
class CollegeStudent extends Student {
    public void read(String researchPaper , String labJournal) {
        System.out.println("the student is reading "+researchPaper +" and "+ labJournal);
    }
}