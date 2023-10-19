import java.util.*;


public class StudentManagement {
    static public HashMap<Integer,String[]> studentHashMap = new HashMap<Integer, String[]>();
    public static void main(String[] args) {


        new Student(1001,"张三","男");
        new Student(1002,"莉丝","女");
        new Student(1003,"王武","男");

        System.out.println("添加的学员信息：");




        for(Integer id:studentHashMap.keySet()){
            System.out.println("学号："+id+",姓名："+studentHashMap.get(id)[0] + "，性别："+studentHashMap.get(id)[1] );
        }

        studentHashMap.remove(1002);
        System.out.println("删除后的学员信息：");
        for(Integer id:studentHashMap.keySet()){
            System.out.println("学号："+id+",姓名："+studentHashMap.get(id)[0] + "，性别："+studentHashMap.get(id)[1] );
        }









    }
}
