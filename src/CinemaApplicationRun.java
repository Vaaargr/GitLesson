public class CinemaApplicationRun {
    public static void main(String[] args) {
        Viewer[] viewers = new Viewer[]{
                new Viewer("Ivan", 15),
                new Viewer("Oleg", 22),
                new Viewer("Petr", 30),
                new Viewer("Olga", 16),
                new Viewer("Anna", 35)};
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
