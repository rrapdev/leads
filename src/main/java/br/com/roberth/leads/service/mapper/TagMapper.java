package br.com.roberth.leads.service.mapper;

import br.com.roberth.leads.domain.Tag;
import br.com.roberth.leads.service.dto.TagDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Tag} and its DTO {@link TagDTO}.
 */
@Mapper(componentModel = "spring")
public interface TagMapper extends EntityMapper<TagDTO, Tag> {}
