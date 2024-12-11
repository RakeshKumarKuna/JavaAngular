package hibernate.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Animal {
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + "]";
	}
	@Id
	int id;

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
    @Column(name = "animalname")
	String name;
}
