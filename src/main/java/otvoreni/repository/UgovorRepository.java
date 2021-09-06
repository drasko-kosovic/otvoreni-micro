package otvoreni.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import otvoreni.domain.Ugovor;

/**
 * Spring Data SQL repository for the Ugovor entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UgovorRepository extends JpaRepository<Ugovor, Long> {}
