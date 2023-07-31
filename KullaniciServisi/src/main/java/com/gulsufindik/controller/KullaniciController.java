package com.gulsufindik.controller;

import static com.gulsufindik.constants.EndPoints.*;
import com.gulsufindik.dto.request.DoLoginDto;
import com.gulsufindik.dto.request.KayitDto;
import com.gulsufindik.exception.EerrorType;
import com.gulsufindik.exception.KullaniciServiceException;
import com.gulsufindik.repository.entity.Kullanici;
import com.gulsufindik.service.KullaniciService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(kullanici)
@RequiredArgsConstructor
public class KullaniciController {

        private final KullaniciService kullaniciService;

        /**
         * register işlemleri
         */
        @PostMapping(REGISTER)
        public ResponseEntity<Kullanici> register(@RequestBody @Valid KayitDto dto) {
            if (!dto.getPassword().equals(dto.getRepassword()))
                throw new KullaniciServiceException(EerrorType.REGISTER_PASSWORD_MISMATCH);
            return ResponseEntity.ok(kullaniciService.kayit(dto));
        }

        /**
         * login işlemleri
         */
        @PostMapping(LOGIN)
        public ResponseEntity<String> dologin(@RequestBody DoLoginDto dto) {
            return ResponseEntity.ok(kullaniciService.doLogin(dto));
        }

        @GetMapping(GETALL)
        public ResponseEntity<List<Kullanici>> findAll() {
            return ResponseEntity.ok(kullaniciService.findAll());
        }


}
