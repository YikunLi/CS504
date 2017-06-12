package demo.service.impl;

import demo.domain.Location;
import demo.domain.LocationRepository;
import demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liyikun on 2017/6/6.
 */
@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepositor) {
        this.locationRepository = locationRepositor;
    }

    @Override
    public List<Location> saveRunningLocations(List<Location> runningLocations) {
        return this.locationRepository.save(runningLocations);
    }

    @Override
    public void deleteAll() {
        this.locationRepository.deleteAll();
    }

    @Override
    public Page<Location> findByRunnerMovementType(String movementType, Pageable pageable) {
        return this.locationRepository.findByRunnerMovementType(Location.RunnerMovementType.valueOf(movementType), pageable);
    }

    @Override
    public Page<Location> findByRunningId(String runningId, Pageable pageable) {
        return null;
    }
}