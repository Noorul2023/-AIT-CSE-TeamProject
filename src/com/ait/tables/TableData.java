package com.ait.tables;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TableData {
	private ArrayList<Name> names;
	
	@PostConstruct
	public void init() {
		names = new ArrayList<Name>();
		Name firstName = new Name("William","Dupont");
		names.add(firstName);
		Name secondName = new Name("Harry", "Styles");
		names.add(secondName);
		Name thirdName = new Name("Jon", "BonJovi");
		names.add(thirdName);
	}
	
	public ArrayList<Name> getNames() {
		return names;
	}
}
