package com.gulsufindik.controller;

import com.gulsufindik.service.SehirService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.gulsufindik.constants.EndPoints.sehir;

@RestController
@RequestMapping(sehir)
@RequiredArgsConstructor
public class SehirController {
    private final SehirService sehirService;

}
