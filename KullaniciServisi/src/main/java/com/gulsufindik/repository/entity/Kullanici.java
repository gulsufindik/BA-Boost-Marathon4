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
@Table(name = "tblkullanici")
public class Kullanici extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(unique = true)
    String username;
    String password;
    String email;
    Long skor;
    @Builder.Default
    Long tahminHakki=5L;

}
