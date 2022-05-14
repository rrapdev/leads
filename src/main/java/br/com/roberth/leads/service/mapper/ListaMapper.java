package br.com.roberth.leads.service.mapper;

import br.com.roberth.leads.domain.Lista;
import br.com.roberth.leads.service.dto.ListaDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Lista} and its DTO {@link ListaDTO}.
 */
@Mapper(componentModel = "spring")
public interface ListaMapper extends EntityMapper<ListaDTO, Lista> {}
