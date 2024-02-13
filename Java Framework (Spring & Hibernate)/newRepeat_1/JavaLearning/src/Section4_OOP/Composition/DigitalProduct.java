package Section4_OOP.Composition;

import java.util.Date;

public class DigitalProduct extends Product {
    private String version;
    private Date date;

    public DigitalProduct(String model, String manufacturer, String version, Date date) {
        super(model, manufacturer);
        this.version = version;
        this.date = date;
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
