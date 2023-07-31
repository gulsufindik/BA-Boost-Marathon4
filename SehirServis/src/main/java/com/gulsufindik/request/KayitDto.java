package com.gulsufindik.request;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder // bir sınıftan nesne türetmeyi sağlar
@Data //get set metodlarını otomatik tanımlar
@NoArgsConstructor // boş constructor
@AllArgsConstructor // dolu constructor oluştur
public class KayitDto {
    Long kullaniciid;
    String username;
    String email;
}
