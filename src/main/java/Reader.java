import model.Student;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Map;

/**
 * @author Taimoor Choudhary
 */
public class Reader {

    public void ReadYaml(){
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("student.yml");
        Map<String, Object> obj = yaml.load(inputStream);
        System.out.println(obj);
    }

    public void readYamlWithCollection(){
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("student_with_courses.yml");
        Map<String, Object> obj = yaml.load(inputStream);
        System.out.println(obj);
    }

    public void ReadYamlAsBean(){
        Yaml yaml = new Yaml(new Constructor(Student.class));
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("student.yml");
        Student obj = yaml.load(inputStream);
        System.out.println(obj);
    }

    public void ReadYamlAsBeanWithNestedClass(){
        Yaml yaml = new Yaml(new Constructor(Student.class));
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("student_with_courses.yml");
        Student obj = yaml.load(inputStream);
        System.out.println(obj);
    }
}
