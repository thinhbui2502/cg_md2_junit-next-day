public class NextDayCalculator {
    public static int showNextDay(int day, int month, int year) {
        if (day > 0 && day < 31) {
            if (isMonthHas31Days(month)) return day + 1;
            return 1;
        }
        return 1;
    }

    private static boolean isMonthHas31Days(int month) {
        switch (month) {
                case 1:
                case 3:
                case 5:
                case 6:
                case 7:
                case 10:
                case 12:
                    return true;
        }
        return false;
    }
}
