public class Viewer {
    private String nickName;
    private int age;
    private int filmsNumber;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFilmsNumber() {
        return filmsNumber;
    }

    public void setFilmsNumber(int filmsNumber) {
        this.filmsNumber = filmsNumber;
    }

    public Viewer(String nickName, int age, int filmsNumber) {
        setNickName(nickName);
        setAge(age);
        setFilmsNumber(filmsNumber);
    }
}
