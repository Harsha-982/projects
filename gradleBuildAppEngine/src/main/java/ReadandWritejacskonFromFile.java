import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadandWritejacskonFromFile {
    public static void main(String[] args) {
        ReadandWritejacskonFromFile readandWrite = new ReadandWritejacskonFromFile();
        try {
            Student1 student1 = new Student1();
            student1.setAge(10);
            student1.setName("harsha");
            readandWrite.writeToJson(student1);

            Student1 student2 = readandWrite.readJson();
            System.out.println(student2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void writeToJson(Student1 student1) throws IOException {
        ObjectMapper mapper= new ObjectMapper();
        mapper.writeValue(new File("student1.json"), student1);
    }
    private Student1 readJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Student1 student1 = mapper.readValue(new File("student1.json"), Student1.class);
        return student1;
    }
}


class Student1 {
    private String name;
    private int age;
    public Student1(){}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "Student [ name: "+name+", age: "+ age+ " ]";
    }
}