package com.atce.entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import org.hibernate.annotations.NaturalId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
@Entity
@Table(name = "student_table")
@Data
public class Student  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_seq")
	@SequenceGenerator(name = "student_seq",sequenceName ="student_seq",initialValue = 500,allocationSize = 2 )
	private int studentId;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", schoolName=" + schoolName
				+ ", birthDay=" + birthDay + ", updatedAt=" + updatedAt + "]";
	}

	private String studentName;
	private String schoolName;
	@Enumerated(EnumType.STRING)
	private DayOfWeek birthDay;
	@Version
	private LocalDateTime updatedAt;	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public DayOfWeek getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(DayOfWeek birthDay) {
		this.birthDay = birthDay;
	}

	
}
