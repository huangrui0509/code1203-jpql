package com.example.jpql.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Table(name="department")
@Data
@NamedQueries({
	@NamedQuery(name="findAll",query="select d from Department d"),
	@NamedQuery(name ="findById", query = "select d from Department d where d.id=?1") })
public class Department {

	@Id
	private long id;
	private String name;
}
