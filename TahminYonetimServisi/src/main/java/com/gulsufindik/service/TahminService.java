package com.gulsufindik.service;

import com.gulsufindik.repository.ITahminRepository;
import com.gulsufindik.repository.entity.Tahmin;
import com.gulsufindik.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class TahminService extends ServiceManager<Tahmin, Long> {
    private final ITahminRepository repository;

    public TahminService(ITahminRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
