    public class Student {
        private String name;
        private int rollNumber;
        private static String universityName;

        public Student (int rollNumber, String name, String universityName) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.universityName = universityName;
        }

        static void changeUniversity (String newUniversity) {
            universityName = newUniversity;
        }

        public void displayStudentInfo () {

            System.out.println("Roll number: "  + rollNumber + ", Name " + name + ", University: " + universityName);
        }
    }

