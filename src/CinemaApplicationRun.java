public class CinemaApplicationRun {
    public static void main(String[] args) {
        Viewer[] viewers = new Viewer[]{
                new Viewer("Ivan", 15, 6),
                new Viewer("Oleg", 22, 3),
                new Viewer("Petr", 30, 15),
                new Viewer("Olga", 16, 10),
                new Viewer("Anna", 35, 26)};
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
