package com.gulsufindik.controller;

import com.gulsufindik.service.TahminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.gulsufindik.constants.EndPoints.*;

@RestController
@RequestMapping(tahmin)
@RequiredArgsConstructor
public class TahminController {
    private final TahminService tahminService;

}
