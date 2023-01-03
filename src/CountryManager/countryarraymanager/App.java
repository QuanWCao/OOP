package CountryManager.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {

        init();

        testOriginalData();
        testFilterAfricaCountry();
        testFilterAsiaCountry();
        testFilterEuropeCountry();
        testFilterSouthAmericaCountry();
        testFilterOceaniaCountry();
        testFilterNorthAmericaCountry();

        testFilterHighestGdpCountries();
        testFilterLowestGdpCountries();
        testFilterLargestAreaCountries();
        testFilterSmallestAreaCountries();
        testFilterLeastPopulousCountries();
        testFilterMostPopulousCountries();

        testSortDecreasingByArea();
        testSortDecreasingByGdp();
        testSortDecreasingByPopulation();
        testSortIncreasingByArea();
        testSortIncreasingByGdp();
        testSortIncreasingByPopulation();

        /* TODO: write code to test program */
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }
                if (dataList.get(5).equals("Asia")) {
                    countryManager.append(new AsiaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4))));

                }
                if (dataList.get(5).equals("Oceania")) {
                    countryManager.append(new AsiaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4))));

                }
                if (dataList.get(5).equals("Africa")) {
                    countryManager.append(new AsiaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4))));

                }
                if (dataList.get(5).equals("Europe")) {
                    countryManager.append(new AsiaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4))));

                }
                if (dataList.get(5).equals("North America")) {
                    countryManager.append(new AsiaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4))));

                }
                if (dataList.get(5).equals("South America")) {
                    countryManager.append(new AsiaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4))));

                }




                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "src/CountryManager/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {

        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {

        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {

        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);

        /* TODO */
    }

    public static void testSortIncreasingByArea() {

        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testSortDecreasingByArea() {

        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testSortIncreasingByGdp() {

        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testSortDecreasingByGdp() {

        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterAfricaCountry() {

        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterAsiaCountry() {

        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterEuropeCountry() {

        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterNorthAmericaCountry() {

        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterOceaniaCountry() {

        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterSouthAmericaCountry() {

        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterLeastPopulousCountries() {

        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterLargestAreaCountries() {

        Country[] countries = countryManager.filterLargestAreaCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterSmallestAreaCountries() {

        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterHighestGdpCountries() {

        Country[] countries = countryManager.filterHighestGdpCountries(4);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }

    public static void testFilterLowestGdpCountries() {

        Country[] countries = countryManager.filterLowestGdpCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        /* TODO */
    }
}
