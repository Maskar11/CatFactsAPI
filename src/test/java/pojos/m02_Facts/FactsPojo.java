package pojos.m02_Facts;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FactsPojo {

    private String fact;
    private int length;
    private int limit;




    public FactsPojo(int length, int limit) {
        this.length = length;
        this.limit = limit;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }


    @Override
    public String toString() {
        return "FactsPojo{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                ", limit=" + limit +
                '}';
    }

}
