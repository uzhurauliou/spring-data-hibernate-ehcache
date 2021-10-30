package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Cache(
    usage = CacheConcurrencyStrategy.READ_WRITE
)
public class Address {

  @Id
  @GeneratedValue(generator = "address_seq", strategy = GenerationType.SEQUENCE)
  private Long id;

  private String value;

  @Override
  public String toString() {
    return "Address{" +
        "id=" + id +
        ", value='" + value + '\'' +
        '}';
  }
}
