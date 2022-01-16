import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Student {
    int studId;
    String studName;
    String schoolName;
    public void setStudId(int studId) {
        this.studId = studId;
    }
    public int getStudId() {
        return studId;
    }
    public void setStudName(String studName) {
        this.studName = studName;
    }
    public String getStudName() {
        return studName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public String getSchoolName() {
        return schoolName;
    }
}

public class TestMain {

    public static HashMap<String, ArrayList<String>> retrieveStudentInfo(ArrayList<Student> al) {
        ArrayList<String> li = null;
        String name = null;
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(Student s: al) {
            name = s.getSchoolName();
            if(map.containsKey(s.getSchoolName())) {
                li = map.get(name);
                li.add(s.getStudName());
            } else {
                li = new ArrayList<>();
                li.add(s.getStudName());
                map.put(name, li);
            }
        }
        return map;
    }

    public static void main(String args[]) {
        ArrayList<Student> al = new ArrayList<>();
        int count;
        Scanner sc = new Scanner(System.in);
        count = Integer.parseInt(sc.nextLine());
        for(int i=0; i<count; i++) {
            Student s = new Student();
            s.setStudId(Integer.parseInt(sc.nextLine()));
            s.setStudName(sc.nextLine());
            s.setSchoolName(sc.nextLine());
            al.add(s);
        }
        sc.close();
        System.out.println(retrieveStudentInfo(al).toString());
    }
    
}
