package demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Embeddable;

/**
 * Created by liyikun on 2017/6/4.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Embeddable
@Data
public class UnitInfo {

    private String runningId;
    private String bandMake;
    private String customerName;
    private String unitNumber;

    public UnitInfo() {
        this.runningId = "";
    }

    public UnitInfo(String runningId) {
        this.runningId = runningId;
    }

    public UnitInfo(String runningId, String bandMake, String customerName, String unitNumber) {
        this.runningId = runningId;
        this.bandMake = bandMake;
        this.customerName = customerName;
        this.unitNumber = unitNumber;
    }
}
