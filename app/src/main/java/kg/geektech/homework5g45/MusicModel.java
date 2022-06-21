package kg.geektech.homework5g45;

public class MusicModel {
    private String name, secondName, time;

    public MusicModel(String name, String secondName, String time) {
        this.name = name;
        this.secondName = secondName;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
