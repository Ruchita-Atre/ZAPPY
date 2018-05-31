package hibernetee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PojoBeanOne {
	@Id
String id ;
	String name ;
	String sallary;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSallary() {
	return sallary;
}

public void setSallary(String sallary) {
	this.sallary = sallary;
} 
}
