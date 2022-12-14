package my.task.SpringHTMLJS.repository;

import my.task.SpringHTMLJS.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findById(long id);
}
