/*
Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
Sözlü notlarını da ortalamaya etkileme yüzdesi ile dahil edin.
Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
*/

public class Main {
    public static void main(String[] args) {

        //Öğretmenleri oluşturduk.

        Teacher t1 = new Teacher("Osman", "MATH", "555");
        Teacher t2 = new Teacher("Ebubekir", "PHYS", "666");
        Teacher t3 = new Teacher("Ali", "HIST", "777");

        //Dersleri oluşturduk.

        Course math = new Course("Math", "101", "MATH");
        Course phys = new Course("Phys", "102", "PHYS");
        Course hist = new Course("Hist", "103", "HIST");

        //Derslere öğretmen ataması yaptık.

        math.addTeacher(t1);
        phys.addTeacher(t2);
        hist.addTeacher(t3);

        //Öğrenci oluşturduk.

        Student s1 = new Student("Hamit","123", "4", math, phys, hist);

        //Öğrenci notlarını girdik ve sınıfı geçme durumunu kontrol edip ekrana yazdırdık.

        s1.addBulkExamNote(100,80,0.5,80,50,0.8,70,70,0.3);
        s1.isPass();

    }
}