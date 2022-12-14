package com.pulkovo.pulkovo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ProjectWin
 * \* Date: Andrey Volsky
 * \* Time: 2:29
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 * таблица:
 * divisions #Справочник подразделений
 * --
 * id int identity PK
 * name nvarchar(150) #Наименование подразделения
 * parent_id int FK >- divisions.id NULL #Ссылка на родительское подразделение
 * dt_from datetime #Дата-время начала действия
 * dt_till datetime NULL #Дата-время завершения действия. Null = бессрочно
 * is_system bit=0 #Признак Системный (только для подразд. верхнего уровня). Системная запись должна быть неудаляемой. Опциональное условие, можно не рассматривать к выполнению.
 * creation_date datetime #Дата создания
 * correction_date datetime NULL #Дата последнего редактирования
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Divisions {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150)
    @NonNull
    private String name;

    @ManyToOne
    @JoinColumn(name = "ref_to_parent_division_id")
    private Divisions refToParentDivision;

    @NonNull
    @Column
    private LocalDateTime dateFrom;

    private LocalDateTime dateTill;

    @NonNull
    @Column
    private LocalDateTime dateCreation;

    @Column
    private LocalDateTime dateCorrection;
}
