package model;

import org.yaml.snakeyaml.Yaml;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Taimoor Choudhary
 */
public class Writer {

    public void WriteYaml(){
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("id", 19);
        dataMap.put("name", "John");
        dataMap.put("address", "Star City");
        dataMap.put("year", 2019);
        dataMap.put("department", "Medical");

        Yaml yaml = new Yaml();
        StringWriter writer = new StringWriter();
        yaml.dump(dataMap, writer);
        System.out.println(writer.toString());
    }

    public void WriteYamlBasic(){
        Yaml yaml = new Yaml();
        StringWriter writer = new StringWriter();
        yaml.dump(basicStudentObject(), writer);
        System.out.println(writer.toString());
    }

    public void WriteYamlBasicWithCollection(){
        Yaml yaml = new Yaml();
        StringWriter writer = new StringWriter();
        yaml.dump(studentObject(), writer);
        System.out.println(writer.toString());
    }

    private Student basicStudentObject(){
        Student student = new Student();

        student.setId(21);
        student.setName("Tim");
        student.setAddress("Night City");
        student.setYear(2077);
        student.setDepartment("Cyberware");

        return student;
    }

    private Student studentObject(){
        Student student = new Student();

        student.setId(21);
        student.setName("Tim");
        student.setAddress("Night City");
        student.setYear(2077);
        student.setDepartment("Cyberware");

        Course courseOne = new Course();
        courseOne.setName("Intelligence");
        courseOne.setCredits(5);

        Course courseTwo = new Course();
        courseTwo.setName("Crafting");
        courseTwo.setCredits(2);

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseOne);
        courseList.add(courseTwo);

        student.setCourses(courseList);

        return student;
    }
}
