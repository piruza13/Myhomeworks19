public class MainApp {
        public static void main(String[] args) {
            Student student1 = new Student(1, "Vazgen", "YSU");
            Student student2 = new Student (2, "Vazgenuhi", "Oxford");
            Student.changeUniversity("Mankavarjakan");
            student1.displayStudentInfo();
            student2.displayStudentInfo();
        }
    }

