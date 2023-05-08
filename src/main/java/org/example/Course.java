package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Course {
    private ProgrammingLanguages programmingLanguages;
    private int duration;
    private int price;

    @Override
    public String toString() {
        return "Course{" +
               // "programmingLanguages=" + programmingLanguages +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}
