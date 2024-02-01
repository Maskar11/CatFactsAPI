package pojos.m01_Breeds;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BreedsPojo {

    private String breed;
    private String country;
    private String origin;
    private String coat;
    private String pattern;
    private int limit;


    public BreedsPojo(int limit) {
        this.limit = limit;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "BreedsPojo{" +
                "breed='" + breed + '\'' +
                ", country='" + country + '\'' +
                ", origin='" + origin + '\'' +
                ", coat='" + coat + '\'' +
                ", pattern='" + pattern + '\'' +
                ", limit=" + limit +
                '}';
    }
}
