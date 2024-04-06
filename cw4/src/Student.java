
public class Student {
        public String fname;
        public String lname;
        public int indexNumber;
        public String email;
        public String adress;
        public double[] grades;

        public Student (String fname, String lname, int indexNumber, String email, String adress, double[] grades){
            this.fname = fname;
            this.lname= lname;
            this.indexNumber = indexNumber;
            this.email = email;
            this.adress = adress;
            this.grades= grades;
        }
    public double AverageGrade(){
        if(this.grades.length == 0) throw new IllegalArgumentException("Brak ocen");
        else if(this.grades.length >20) throw new IllegalArgumentException("Za dużo ocen");
        else{
            double sum = 0;
            for (int i = 0; i < this.grades.length; i++){
                sum = sum + this.grades[i];
            }
            return sum / this.grades.length;
        }
    }

}



