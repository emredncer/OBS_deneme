import java.awt.*;

public class Main {
    public static void main(String[] args) {
    Course matematik = new Course("Matematik","101","MAT101");
    Course fizik = new Course("Fizik","101","PHY101");
    Course kimya = new Course("Kimya","101","CHM101");

    Teacher t1 = new Teacher("Kıllı Şebnem","0523443525","MAT101");
    matematik.addTeacher(t1);
    Teacher t2 = new Teacher("Kel Kerim","0512432543","PHY101");
    fizik.addTeacher(t2);
    Teacher t3 = new Teacher("Şişman Alper", "05446546655","CHM101");
    kimya.addTeacher(t3);

    Student s1 = new Student("İri Bihter","000000","1",matematik,fizik,kimya);
    s1.addBulkExamNote(10,0,25,20,10,20);
    s1.isPass();
    Student s2 = new Student("Tüysüz Necati","0000","2",matematik,fizik,kimya);
    s2.addBulkExamNote(70,80,90,100,100,100);
    s2.isPass();
    Student s3 = new Student("iri Mustafa","333","2",matematik,fizik,kimya);
    s3.addBulkExamNote(50,50,50,80,70,70);
    s3.isPass();
    }
}