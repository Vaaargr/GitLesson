public class Viewer {
    private String nickName;
    private int age;
    private int filmsNumber;
    private Cinema[] moviesWatched;

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

    public void setFilmsNumber() {
        if (moviesWatched != null){
         filmsNumber = moviesWatched.length;
        }
    }

    public Viewer(String nickName, int age) {
        setNickName(nickName);
        setAge(age);
    }
}
