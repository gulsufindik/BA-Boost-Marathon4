package com.gulsufindik.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;

@SuperBuilder // bir sınıftan nesne türetmeyi sağlar.
@Data //get set metodlarını otomatik tanımlar.
@NoArgsConstructor //boş constructor oluşturur.
@AllArgsConstructor //dolu constructor oluşturur.
@ToString
@Entity
@Table(name = "tblsehir")
public class Sehir extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String blurluResim;
    String netResim;
}
