package com.pulkovo.pulkovo.mapper;

import com.pulkovo.pulkovo.dto.DivisionDto;
import com.pulkovo.pulkovo.model.Divisions;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;


class DivisionMapperTest {

    @Test
    public void shouldMapCarToDto() {
        Divisions divisions = new Divisions("divisions",
                LocalDateTime.of(1994, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00));

        DivisionDto divisionDto = DivisionMapper.INSTANCE.divisionToDivisionDto(divisions);


//        assertThat(divisionDto).isNotNull();
//        assertThat(divisionDto.getName()).isEqualTo("divisions");
//        assertThat(divisionDto.getDateFrom()).isEqualTo(LocalDateTime.of(1994, 12, 15, 16, 00));
//        assertThat(divisionDto.getDateCreation()).isEqualTo(LocalDateTime.of(1993, 12, 15, 16, 00));
    }

}