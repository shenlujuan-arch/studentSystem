

public class Student implements Comparable {
    public int id;
    public String name;
    public String gender;


    public Student(int id,String name,String gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
        String[] studentInfo = {this.name,this.gender};
        StudentManagement.studentHashMap.put(this.id,studentInfo);
    }

    @Override
    public String toString(){
        return "学号："+this.id+",姓名："+this.name+",性别："+this.gender;
    }

    public int compareTo(Object o) {
        Student s = (Student) o;
        return this.id-s.id;
    }
}
