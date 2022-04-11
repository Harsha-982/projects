import java.io.IOException;
import java.text.ParseException;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonProperty1 {
    public static void main(String args[]) throws ParseException{
        String json = "{\"id\":1,\"theName\":\"Mark\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            Student4 student = mapper
                    .readerFor(Student4.class)
                    .readValue(json);
            System.out.println(student.rollNo +", " + student.name);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Student4 {
    public String name;
    public int rollNo;

    @JsonCreator
    public Student4(@JsonProperty("theName") String name, @JsonProperty("id") int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
}

