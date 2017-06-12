package demo.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by liyikun on 2017/6/4.
 */
@RepositoryRestResource(path = "locations")
public interface LocationRepository extends JpaRepository<Location, Long> {

    @RestResource(path = "runners")
    Page<Location> findByRunnerMovementType(@Param("movementType") Location.RunnerMovementType movementType, Pageable pageable);

    //localhost:8080/locations/search/customers
    @RestResource(path = "customers")
    Page<Location> findByUnitInfoCustomerName(@Param("customerName") String customerName, Pageable pageable);
}
