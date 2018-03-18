package be.qnh.tools.repository;

import be.qnh.tools.domain.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ToolRepository<T extends Tool> extends JpaRepository<T, Long> {

    Iterable<T> findByNameLike(String name);

    Iterable<T> findByElectric(boolean electric);
}
