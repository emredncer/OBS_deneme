public class Student {
    String name;
    String stuNo;
    String classes;
    Course matematik;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course matematik, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.matematik = matematik;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    void addBulkExamNote(int matematik, int fizik, int kimya, int matSzl, int fzkSzl, int kmySzl) {
        if (matematik >= 0 && matematik <= 100) {
            this.matematik.note = matematik;
        }
        if (matSzl >= 0 && matSzl <= 100) {
            this.matematik.verbalGrade = matSzl;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (fzkSzl >= 0 && fzkSzl <= 100) {
            this.fizik.verbalGrade = fzkSzl;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (kmySzl >= 0 && kmySzl <= 100) {
            this.kimya.verbalGrade = kmySzl;
        }
    }

    public void calculateAverage() {
        this.average = ((this.fizik.note * 0.60) + (this.fizik.verbalGrade * 0.40) + (this.kimya.note * 0.60) + (this.kimya.verbalGrade * 0.40) + (this.matematik.note * 0.60) + (this.matematik.verbalGrade * 0.40)) / 3;
    }

    public void printNote() {
        System.out.println("=========");
        System.out.println("Öğrencinin adı: \t " + this.name);
        System.out.println("Öğrencinin numarası: \t\t" + this.stuNo);
        System.out.println("Öğrencinin sınıfı: \t\t");
        System.out.println("Öğrencinin Matematik sınav notu:  \t" + this.matematik.note +"\tÖğrencinin Matematik sözlü notu: \t" + this.matematik.verbalGrade);
        System.out.println("Öğrencinin Fizik sınav notu:  \t" + this.fizik.note +"\tÖğrencinin Fizik sözlü notu: \t" + this.fizik.verbalGrade);
        System.out.println("Öğrencinin Kimya sınav notu:  \t" + this.kimya.note +"\tÖğrencinin Kimya sözlü notu: \t" + this.kimya.verbalGrade);
    }
    public boolean isPassCheck(){
        calculateAverage();
        return this.average>=55;
    }
    public void isPass() {
        if (this.fizik.note == 0 && this.fizik.verbalGrade == 0 && this.kimya.note == 0 && this.kimya.verbalGrade == 0 && this.matematik.note == 0 && this.matematik.verbalGrade == 0) {
            System.out.println("Notlar Henüz girilmemiştir!");
        } else {
            this.isPass=isPassCheck();
            printNote();
            if (this.isPass){
                System.out.println("Sınıfı geçtin dostum!");
            }else {
                System.out.println("Fazla uzaklaşma seneye de buradasın!");
            }
        }
    }
}
