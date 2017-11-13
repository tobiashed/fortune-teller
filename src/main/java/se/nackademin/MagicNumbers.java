package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        int count = 0;
        count += getName().length() - getName().replaceAll(" ", "").length();
        count = count + 1 + getAge();
        do {
            count = count - 7;
        } while (count >= 10);
        return count;
    }

    public int calculateB() {
        String givenLocation = getLocation();
        int givenIncome = getIncome();
        int count = givenLocation.length() + givenIncome;
        do {
            count = count - 7;
        } while (count >= 10);

        return count;
    }

    public int calculateC() {
        int count = calculateA() + calculateB();
        count = count - getHeight();
        do {
            count = count + 10;
        } while (count <= 0);

        return count;
    }

    public int calculateD() {
        int count = 0;
        if (calculateA() > 5) {
            count = calculateA() + calculateB();
        } else {
            count = calculateA() + calculateC();
        }
        count = count - getIncome();
        do {
            count = count + 10;
        } while (count <= 0);

        return count;
    }

    public int calculateE() {
        int result = 0;
        double count = getAge();
        count = count * getIncome() * getIncome() * getHeight();
        count = Math.sqrt(count);

        do {
            count = count / 2;
        } while (count > 10.0);

        result = Math.round((float) count);
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getIncome() {
        return this.income;
    }

    public String getLocation() {
        return this.location;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

}
