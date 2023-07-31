package com.gulsufindik.mapper;

import com.gulsufindik.dto.request.KayitDto;
import com.gulsufindik.repository.entity.Kullanici;
import org.mapstruct.factory.Mappers;

public interface IKullaniciMapper {
    IKullaniciMapper INSTANCE = Mappers.getMapper(IKullaniciMapper.class);
    Kullanici toKullanici(final KayitDto dto);
}
