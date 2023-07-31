package com.gulsufindik.service;

import com.gulsufindik.dto.request.DoLoginDto;
import com.gulsufindik.dto.request.KayitDto;
import com.gulsufindik.exception.KullaniciServiceException;
import com.gulsufindik.mapper.IKullaniciMapper;
import com.gulsufindik.repository.IKullaniciRepository;
import com.gulsufindik.repository.entity.Kullanici;
import com.gulsufindik.utility.ServiceManager;
import org.springframework.stereotype.Service;
import javax.lang.model.type.ErrorType;
import java.util.List;
import java.util.Optional;

@Service
public class KullaniciService extends ServiceManager<Kullanici, Long> {
    private final IKullaniciRepository repository;

    public KullaniciService(IKullaniciRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Kullanici kayit(KayitDto dto) {
        if (repository.existsByUsername(dto.getUsername())) {
            throw new KullaniciServiceException(ErrorType.REGISTER_USERNAME_EXIST);
        }
        Kullanici kullanici = IKullaniciMapper.INSTANCE.toKullanici(dto);
        save(kullanici);

        return kullanici;
    }

    public String doLogin(DoLoginDto dto) {
        Optional<Kullanici> kullanici= repository.findOptionalByUsernameAndPassword(dto.getUsername(),dto.getPassword());
        if (kullanici.isEmpty()) throw new KullaniciServiceException(ErrorType.DOLOGIN_USERNAMEORPASSWORD_NOTEXISTS);

        return "Kullanıcı girişi gerçekleşti";
    }

    public List<Kullanici> kullaniciList() {
        return repository.findAll();
    }

}
