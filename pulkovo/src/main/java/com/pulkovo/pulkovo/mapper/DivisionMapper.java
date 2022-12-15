package com.pulkovo.pulkovo.mapper;

import com.pulkovo.pulkovo.dto.DivisionDto;
import com.pulkovo.pulkovo.model.Divisions;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ProjectWin
 * \* Date: Andrey Volsky
 * \* Time: 17:29
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface DivisionMapper {

    DivisionMapper INSTANCE = Mappers.getMapper(DivisionMapper.class);


    DivisionDto divisionToDivisionDto(Divisions divisions);
}