import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class JsonAnygetter {
    public static void main(String args[]){
        ObjectMapper mapper = new ObjectMapper();
        try{
            Student3 student = new Student3();
            student.add("Name", "Mark");
            student.add("RollNo", "1");
            String jsonString = mapper
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(student);
            System.out.println(jsonString);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Student3 {
    private Map<String, String> properties;
    public Student3(){
        properties = new HashMap<>();
    }
    public Map<String, String> getProperhj(){
        return properties;
    }
    @JsonAnyGetter
    public Map<String, String > shushu(){
        return properties;
    }
    public void add(String property, String value){
        properties.put(property, value);
    }
}