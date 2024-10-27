public class Explore {

    static String[] countries;
    static int[] totalWasteKgPerCapitaPerYear;
    static int[] householdEstimatesKgPerCapitaPerYear;
    static int[] householdEstimatesTonnesPerYear;
    static int[] retailEstimatesKgPerCapitaPerYear;
    static int[] retailEstimatesTonnesPerYear;
    static int[] foodServiceEstimatesKgPerCapitaPerYear;
    static int[] foodServiceEstimatesTonnesPerYear;
    static String[] confidences;
    static String[] regions;
    static String[] years;
    static double[] percentagesShareInPoverty;

    public static void main(String[] args) {
        setUp();
        System.out.println(getCountriesWithStartingAlphabet(countries, 'a'));
    }


    public static void setUp()
    {
        CSVReader.populateArrays();

        countries = CSVReader.countries.toArray(new String[CSVReader.countries.size()]);
        totalWasteKgPerCapitaPerYear = CSVReader.totalWasteKgPerCapitaPerYear.stream().mapToInt(i -> i).toArray();
        householdEstimatesKgPerCapitaPerYear = CSVReader.householdEstimatesKgPerCapitaPerYear.stream().mapToInt(i -> i).toArray();
        householdEstimatesTonnesPerYear = CSVReader.householdEstimateTonnesPerYear.stream().mapToInt(i -> i).toArray();
        retailEstimatesKgPerCapitaPerYear = CSVReader.retailEstimateKgPerCapitaPerYear.stream().mapToInt(i -> i).toArray();
        retailEstimatesTonnesPerYear = CSVReader.retailEstimateTonnesPerYear.stream().mapToInt(i -> i).toArray();
        foodServiceEstimatesKgPerCapitaPerYear = CSVReader.foodServiceEstimateKgPerCapitaPerYear.stream().mapToInt(i -> i).toArray();
        foodServiceEstimatesTonnesPerYear = CSVReader.foodServiceEstimateTonnesPerYear.stream().mapToInt(i -> i).toArray();
        confidences = CSVReader.confidence.toArray(new String[CSVReader.confidence.size()]);
        regions = CSVReader.region.toArray(new String[CSVReader.region.size()]);
        years = CSVReader.year.toArray(new String[CSVReader.year.size()]);
        percentagesShareInPoverty = CSVReader.percentageShareInPoverty.stream().mapToDouble(i -> i).toArray();
    }

    // Place your own method(s) here!
    //Amount of countries with alphabet starting as their name
    public static int getCountriesWithStartingAlphabet(String[] countries, char starting) {
        int count = 0;
        for(String country: countries) {
            if (Character.toLowerCase(country.charAt(0)) == Character.toLowerCase(starting)) {
                count ++;
            }
        }
        return count;
    }
}
