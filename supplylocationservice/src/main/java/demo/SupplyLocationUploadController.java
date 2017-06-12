package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by liyikun on 2017/6/8.
 */
@RestController
public class SupplyLocationUploadController {

    private SupplyLocationRepository supplyLocationRepository;

    @Autowired
    public SupplyLocationUploadController(SupplyLocationRepository supplyLocationRepository) {
        this.supplyLocationRepository = supplyLocationRepository;
    }

    @RequestMapping(value = "/bulk/supplyLocations", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void upload(@RequestBody List<SupplyLocation> locations) {
        this.supplyLocationRepository.save(locations);
    }
}
