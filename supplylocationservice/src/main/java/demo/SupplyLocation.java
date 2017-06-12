package demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by liyikun on 2017/6/4.
 */
@Data
@Document
@RequiredArgsConstructor(onConstructor = @__(@PersistenceConstructor))
public class SupplyLocation {

    @Id
    private String id;
    private String address1;
    private String address2;
    private String city;

    @GeoSpatialIndexed
    private final Point location;
    private String state;
    private String zip;
    private String type;

    @JsonCreator
    public SupplyLocation(@JsonProperty("latitude") double latitude, @JsonProperty("longitude") double longitude) {
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
