public class AboutMe {
    public static void main(String[] args) {
        System.out.println();

        String firstName = "Mohamed";
        String middleName = "Alie";
        String lastName = "Pussah";
        String suffix = "II";
        String favoriteSport = "Football (Soccer)";
        String favoriteSportTeam = "Manchester United";
        int yearInWhichIStartedSupportingMyFavoriteSportTeam = 1997;
        int currentYear = 2021;
        int numberOfYearsIHaveSupportedMyFavoriteSportTeam = currentYear - yearInWhichIStartedSupportingMyFavoriteSportTeam;

        System.out.println("Hi,");
        System.out.println();
        System.out.println("I am " + firstName + " " + middleName + " " + lastName + ", " + suffix + ".");
        System.out.print("My favorite sport is " + favoriteSport + ". ");
        System.out.println("My favorite sport team is " + favoriteSportTeam + ".");
        System.out.println();
        System.out.println("I love " + favoriteSportTeam + " because when I first started watching " + favoriteSport + ", they were the most diverse team, with players from different continents.");
        System.out.println();
        System.out.println("I started supporting " + favoriteSportTeam + " in " + yearInWhichIStartedSupportingMyFavoriteSportTeam + ". Since we are in " + currentYear + ", I have now supported " + favoriteSportTeam + " for " + numberOfYearsIHaveSupportedMyFavoriteSportTeam + " years. Wow!");
        System.out.println();
        System.out.println("Thanks for reading.");


        System.out.println();
    }
}
