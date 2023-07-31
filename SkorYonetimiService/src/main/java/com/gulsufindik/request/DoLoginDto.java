package com.gulsufindik.request;

import lombok.*;

@Builder // bir sınıftan nesne türetmeyi sağlar
@Data //get set metodlarını otomatik tanımlar
@NoArgsConstructor // boş constructor
@AllArgsConstructor // dolu constructor oluştur
public class DoLoginDto {
    String username;
    String password;
}
