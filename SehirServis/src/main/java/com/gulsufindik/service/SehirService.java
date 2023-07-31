package com.gulsufindik.service;

import com.gulsufindik.repository.ISehirRepository;
import com.gulsufindik.repository.entity.Sehir;
import com.gulsufindik.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class SehirService extends ServiceManager<Sehir, Long> {
    private final ISehirRepository repository;

    public SehirService(ISehirRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
