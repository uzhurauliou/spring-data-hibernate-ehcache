package com.example.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Table(name = "users")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Cache(
    usage = CacheConcurrencyStrategy.READ_WRITE
)
public class User {

  @Id
  @GeneratedValue(generator = "user_seq", strategy = GenerationType.SEQUENCE)
  private Long id;

  private String name;

  @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<Address> addressList;

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", addressList=" + addressList +
        '}';
  }
}
