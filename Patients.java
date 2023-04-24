package manytomany_DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Patients
{
	@Id
	private int id;
	private String name;
	private int mobno;
	private String address;
	@ManyToMany(cascade=CascadeType.ALL)
	List<Doctor> d;
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
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Doctor> getD() {
		return d;
	}
	public void setD(List<Doctor> d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Patients [id=" + id + ", name=" + name + ", mobno=" + mobno + ", address=" + address + ", d=" + d + "]";
	}
	


}
