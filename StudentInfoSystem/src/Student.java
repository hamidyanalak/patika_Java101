public class Student {

    //Nitelikler
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote (int note1, int verbal1, double verbalPercent1,
                          int note2, int verbal2, double verbalPercent2,
                          int note3, int verbal3, double verbalPercent3) {

        if (note1 >=0 && note1 <=100) {
            this.c1.note = note1;
        }
        if (note2 >=0 && note2 <=100) {
            this.c2.note = note2;
        }
        if (note3 >=0 && note3 <=100) {
            this.c3.note = note3;
        }
        if (verbal1 >=0 && verbal1 <=100) {
            this.c1.verbal = verbal1;
        }
        if (verbal2 >=0 && verbal2 <=100) {
            this.c2.verbal = verbal2;
        }
        if (verbal3 >=0 && verbal3 <=100) {
            this.c3.verbal = verbal3;
        }
        if (verbalPercent1 >=0 && verbalPercent1 <=1) {
            this.c1.percentEffect = verbalPercent1;
        }
        if (verbalPercent2 >=0 && verbalPercent2 <=1) {
            this.c2.percentEffect = verbalPercent2;
        }
        if (verbalPercent3 >=0 && verbalPercent3 <=1) {
            this.c3.percentEffect = verbalPercent3;
        }
    }

    void printNotes() {
        System.out.println(this.c1.name + " Notu :\t" + this.c1.note);
        System.out.println(this.c2.name + " Notu :\t" + this.c2.note);
        System.out.println(this.c3.name + " Notu :\t" + this.c3.note);

        System.out.println(this.c1.name + " Sözlü Notu :\t" + this.c1.verbal);
        System.out.println(this.c2.name + " Sözlü Notu :\t" + this.c2.verbal);
        System.out.println(this.c3.name + " Sözlü Notu :\t" + this.c3.verbal);

        System.out.println("Ortalama : " + this.average);
    }

    void isPass() {
        this.average = ((this.c1.note*(1-this.c1.percentEffect) + this.c1.verbal*this.c1.percentEffect) +
                        (this.c2.note*(1-this.c2.percentEffect) + this.c2.verbal*this.c2.percentEffect) +
                        (this.c3.note*(1-this.c3.percentEffect) + this.c3.verbal*this.c3.percentEffect)) /3.0;

        if(this.average > 55) {
            this.isPass = true;
            System.out.println("Sınıfı geçtiniz!");
        }
        else {
            this.isPass = false;
            System.out.println("Sınıfı geçemediniz.");
        }
        printNotes();
    }

}
