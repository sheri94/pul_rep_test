package com.pulkovo.pulkovo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
public class Divisions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String name;

    @NonNull
    @OneToMany
    @JoinColumn(name = "ref_to_parent_division_id")
    private List<Divisions> refToParentDivision;

    @NonNull
    private Date dateFrom;

    private Date dateTill;

    @NonNull
    private Date dateCreation;

    private Date dateCorrection;
}
