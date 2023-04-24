package manytomany_DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Doctor 
{
	@Id
	private int id;
	private String name;
	private int phoneno;
	@ManyToMany(cascade = CascadeType.ALL)
    List<Patients> p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public List<Patients> getP() {
		return p;
	}
	public void setP(List<Patients> p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", p=" + p + "]";
	}
	
	
}
