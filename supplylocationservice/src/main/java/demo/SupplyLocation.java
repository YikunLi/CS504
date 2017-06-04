package demo;

import lombok.Data;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by liyikun on 2017/6/4.
 */
@Data
@Document
public class SupplyLocation {

    private String id;
    private String address1;
    private String address2;
    private String city;

    private Point location;
    private String state;
    private String zip;
    private String type;

    public SupplyLocation(double latitude, double longitude) {
        this.location = new Point(longitude, latitude);
    }

    public SupplyLocation() {
        this.location = new Point(0.0, 0.0);
    }

    public double getLongitude() {
        return this.location.getX();
    }

    public double getLaitude() {
        return this.location.getY();
    }
}
