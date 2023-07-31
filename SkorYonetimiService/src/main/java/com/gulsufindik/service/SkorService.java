package com.gulsufindik.service;

import com.gulsufindik.repository.ISkorRepository;
import com.gulsufindik.repository.entity.Skor;
import com.gulsufindik.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class SkorService extends ServiceManager<Skor, Long> {

    private final ISkorRepository repository;

    public SkorService(ISkorRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
