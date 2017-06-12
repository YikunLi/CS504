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
public class MedicalInfo {

    private Long bfn;

    private Long fmi;

    public MedicalInfo() {

    }

    public MedicalInfo(Long bfn, Long fmi) {
        this.bfn = bfn;
        this.fmi = fmi;
    }
}
