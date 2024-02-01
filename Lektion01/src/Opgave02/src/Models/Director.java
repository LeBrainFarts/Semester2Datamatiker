package Models;

import java.time.LocalDate;

public class Director {
    private String name;
    private LocalDate birthday;

    public Director(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
