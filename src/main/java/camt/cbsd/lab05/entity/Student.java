package camt.cbsd.lab05.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class Student {
    @ManyToMany
    List<Course> enrolledCourse;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NonNull long id;
    @NonNull String studentId;
    @NonNull String name;
    @NonNull String surname;
    @NonNull double gpa;
    @NonNull String image;
    @NonNull boolean feature;
    @NonNull int penAmount;
    @NonNull String description;

//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getStudentId() {
//        return studentId;
//    }
//
//    public double getGpa() {
//        return gpa;
//    }
//
//    public String getImage() {
//        return image;
//    }

    public boolean isFeature() {
        return feature;
    }

//    public int getPenAmount() {
//        return penAmount;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }

//    public Student(){
//
//    }
//    public Student(long id, String studentId, String name, String surname, double gpa, String image, boolean feature, int penAmount, String description) {
//        this.id = id;
//        this.studentId = studentId;
//        this.name = name;
//        this.surname = surname;
//
//        this.gpa = gpa;
//        this.image = image;
//        this.feature = feature;
//        this.penAmount = penAmount;
//        this.description = description;
//    }
}
