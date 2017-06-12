package demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyikun on 2017/6/8.
 */
@Service
public class SupplyLocationSerivceImpl implements SupplyLocationService {

    private UserService userService;


    @Override
    public List<SupplyLocation> saveSupplyLocationsZipContains504(List<SupplyLocation> locations) {
        userService.getAvailableUsers();
        List<SupplyLocation> result = new ArrayList<>();
        for (SupplyLocation supplyLocation : locations) {
            if (supplyLocation.getZip().contains("504")) {
                result.add(supplyLocation);
            }
        }
        return result;
    }
}
