package com.gulsufindik.controller;

import com.gulsufindik.service.SkorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.gulsufindik.constants.EndPoints.*;

@RestController
@RequestMapping(skor)
@RequiredArgsConstructor
public class SkorController {
    private final SkorService skorService;

}
