import java.util.*;


public class StudentManagement {
    static public HashMap<Integer,String[]> studentHashMap = new HashMap<Integer, String[]>();
    static Scanner studentScanner = new Scanner(System.in);
    static String str ;
    public static void printHello(){
        System.out.println("--------欢迎来到学员信息管理系统--------");
        System.out.println("1 根据学号查看学员信息\n2 添加学员\n3 根据学号删除学员后，查看所有学员信息\n4 退出系统");
        System.out.println("请输入你的选择：");
        str = studentScanner.next();

    }

    public static void printAllInfo(){
        for(Integer id:studentHashMap.keySet()){
            System.out.println("学号："+id+",姓名："+studentHashMap.get(id)[0] + "，性别："+studentHashMap.get(id)[1] );
        }
    }

    public static void addStudent() throws MyException{
        System.out.println("请输入学员编号：");
        Integer id= Integer.valueOf(studentScanner.next());

        if(studentHashMap.keySet().contains(id)){
            throw new MyException("有相同的学员编号");
        }
        System.out.println("请输入学员姓名：");
        String name = studentScanner.next();
        System.out.println("请输入学员性别：");
        String gender = studentScanner.next();
        new Student(id,name,gender);
        System.out.println("添加学员成功");

    }

    public static void delStudent(){
        System.out.println("根据学号删除学员信息后，查看所有学员信息");
        System.out.println("请输入要删除的学员编号：");

        Integer studentId=Integer.valueOf(studentScanner.next());
        if(studentHashMap.keySet().contains(studentId)){
           studentHashMap.remove(studentId);
        }else{
            System.out.println("未查到学员信息：");
        }
        System.out.println("删除后的学员信息为：");
        printAllInfo();
    }

    public static void getStudent(){
        System.out.println("根据学号查看学员信息");
        System.out.println("请输入要查找的学员编号：");

        Integer studentId=Integer.valueOf(studentScanner.next());
        if(studentHashMap.keySet().contains(studentId)){
            System.out.println("查找的学员信息：");
            System.out.println("学号："+studentId+",姓名："+studentHashMap.get(studentId)[0] + "，性别："+studentHashMap.get(studentId)[1] );

        }else{
            System.out.println("未查到学员信息：");
        }
    }

    public static void main(String[] args) throws MyException {


        new Student(1001,"张三","男");
        new Student(1002,"莉丝","女");
        new Student(1003,"王武","男");

        studentHashMap.remove(1002);

        printHello();

        while(true){

            if(str.equals("1")){
                getStudent();
            }else if(str.equals("2")){
                addStudent();
            }else if(str.equals("3")){
                delStudent();
            } else if (str.equals("4")){
                System.out.println("拜拜！");
                break;
            }else{
                System.out.println("非法输入，请输入1或2或3或4！");
            }

          printHello();
        }













    }
}
