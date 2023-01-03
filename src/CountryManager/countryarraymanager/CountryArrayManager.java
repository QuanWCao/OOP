package CountryManager.countryarraymanager;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];

        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getPopulation() > newArray[inLoop2].getPopulation()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }

        // show list

        /* TODO *

         */
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getPopulation() < newArray[inLoop2].getPopulation()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getArea() > newArray[inLoop2].getArea()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getArea() < newArray[inLoop2].getArea()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getGdp() > newArray[inLoop2].getGdp()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getGdp() < newArray[inLoop2].getGdp()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }
        /* TODO */

        return newArray;
    }


    public AfricaCountry[] filterAfricaCountry() {
        AfricaCountry[] newArray = new AfricaCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countries[i] instanceof AfricaCountry) {
                newArray[count] = (AfricaCountry) this.countries[i];
                count++;
            }
        }

        AfricaCountry[] result = new AfricaCountry[count];
        System.arraycopy(newArray, 0, result, 0, count);
        return result;
    }

    public AsiaCountry[] filterAsiaCountry() {
        AsiaCountry[] newArray = new AsiaCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countries[i] instanceof AsiaCountry) {
                newArray[count] = (AsiaCountry) this.countries[i];
                count++;
            }
        }

        AsiaCountry[] result = new AsiaCountry[count];
        System.arraycopy(newArray, 0, result, 0, count);
        return result;
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] newArray = new EuropeCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countries[i] instanceof EuropeCountry) {
                newArray[count] = (EuropeCountry) this.countries[i];
                count++;
            }
        }

        EuropeCountry[] result = new EuropeCountry[count];
        System.arraycopy(newArray, 0, result, 0, count);
        return result;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        NorthAmericaCountry[] newArray = new NorthAmericaCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countries[i] instanceof NorthAmericaCountry) {
                newArray[count] = (NorthAmericaCountry) this.countries[i];
                count++;
            }
        }

        NorthAmericaCountry[] result = new NorthAmericaCountry[count];
        System.arraycopy(newArray, 0, result, 0, count);
        return result;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        OceaniaCountry[] newArray = new OceaniaCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countries[i] instanceof OceaniaCountry) {
                newArray[count] = (OceaniaCountry) this.countries[i];
                count++;
            }
        }

        OceaniaCountry[] result = new OceaniaCountry[count];
        System.arraycopy(newArray, 0, result, 0, count);
        return result;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        SouthAmericaCountry[] newArray = new SouthAmericaCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (this.countries[i] instanceof SouthAmericaCountry) {
                newArray[count] = (SouthAmericaCountry) this.countries[i];
                count++;
            }
        }

        SouthAmericaCountry[] result = new SouthAmericaCountry[count];
        System.arraycopy(newArray, 0, result, 0, count);
        return result;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] result = new Country[howMany];
        this.countries = this.sortByDecreasingPopulation();
        for (int i = 0; i < howMany; i++) {
            result[i] = countries[i];

        }
        return result;
        /* TODO */
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] result = new Country[howMany];
        this.countries = this.sortByDecreasingPopulation();
        for (int i = 0; i < howMany; i++) {
            result[i] = countries[i];

        }
        return result;
        /* TODO */
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] result = new Country[howMany];
        this.countries = this.sortByIncreasingArea();
        for (int i = 0; i < howMany; i++) {
            result[i] = countries[i];

        }
        return result;
        /* TODO */
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] result = new Country[howMany];
        this.countries = this.sortByDecreasingArea();
        for (int i = 0; i < howMany; i++) {
            result[i] = countries[i];

        }
        return result;
        /* TODO */
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] result = new Country[howMany];
        this.countries = this.sortByIncreasingGdp();
        for (int i = 0; i < howMany; i++) {
            result[i] = countries[i];

        }
        return result;
        /* TODO */
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] result = new Country[howMany];
        this.countries = this.sortByDecreasingArea();
        for (int i = 0; i < howMany; i++) {
            result[i] = countries[i];

        }
        return result;
        /* TODO */
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
