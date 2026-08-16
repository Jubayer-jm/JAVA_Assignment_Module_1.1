public class Student {
    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
    }
    public static void main(String[]args){
        Student s = new Student();//create a class for std object

        s.setAge(20);//called method
        //which set 20 at the student object s

        System.out.println(s.getAge());
    }
}
