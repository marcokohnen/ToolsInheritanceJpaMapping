package be.qnh.tools.repository;

import be.qnh.tools.domain.Hamer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HammerRepository extends ToolRepository<Hamer> {

}
