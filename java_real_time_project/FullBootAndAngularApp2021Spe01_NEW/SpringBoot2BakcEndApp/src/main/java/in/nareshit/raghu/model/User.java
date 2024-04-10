package in.nareshit.raghu.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(
		name="user_tab",
		uniqueConstraints = {
				@UniqueConstraint(columnNames = "username"),
				@UniqueConstraint(columnNames = "email")
		})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max=20)
	@NonNull
	@Column(name="username",length = 20)
	private String username;
	
	@NonNull
	@NotBlank
	@Email
	@Size(max=50)
	@Column(name="email",length = 50)
	private String email;
	
	@NonNull
	@NotBlank
	@Size(max=120)
	@Column(name="password",length = 120)
	private String password;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="user_roles_tab",
	joinColumns = @JoinColumn(name="uidFk"),
	inverseJoinColumns = @JoinColumn(name="roleIdFk"))
	private Set<Role> roles;
}
