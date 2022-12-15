package com.pulkovo.pulkovo.dto;

import com.pulkovo.pulkovo.model.Divisions;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ProjectWin
 * \* Date: Andrey Volsky
 * \* Time: 17:08
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Data
public class DivisionDto {

    private Long id;
    private String name;
    private Divisions refToParentDivision;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTill;
    private LocalDateTime dateCreation;
    private LocalDateTime dateCorrection;
}