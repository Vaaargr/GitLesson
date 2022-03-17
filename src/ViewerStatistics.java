public class ViewerStatistics {
    public static double averageAge(Viewer[] viewers) {
        double middleAge = 0;
        for (Viewer current : viewers) {
            middleAge += current.getAge();
        }
        return middleAge / viewers.length;
    }
}
