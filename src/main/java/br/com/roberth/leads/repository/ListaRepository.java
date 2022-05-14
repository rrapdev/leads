package br.com.roberth.leads.repository;

import br.com.roberth.leads.domain.Lista;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Lista entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ListaRepository extends JpaRepository<Lista, Long>, JpaSpecificationExecutor<Lista> {}
