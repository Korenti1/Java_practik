package Cars.professions;

public class Driver extends Person {

    private String name;

    private String surName;

    private String parentName;

    private int driveExperiens;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "Водитель: \n" +
                "Имя: " + name + '\'' +
                ", Фамилия: " + surName + '\'' +
                ", Отчество: " + parentName + '\'' +
                "Возраст: " + getAge() +
                ", Опыт вождения: " + driveExperiens;
    }

    public int getDriveExperiens() {
        return driveExperiens;
    }

    public void setDriveExperiens(int driveExperiens) {
        this.driveExperiens = driveExperiens;
    }

    public Driver(String name, String surName, String parentName, int driveExperiens, int age) {
        super(age);
        this.name = name;
        this.surName = surName;
        this.parentName = parentName;
        this.driveExperiens = driveExperiens;
    }

}
