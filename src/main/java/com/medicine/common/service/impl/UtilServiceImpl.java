package com.medicine.common.service.impl;

import com.medicine.common.service.UtilService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UtilServiceImpl implements UtilService{

    @Override
    public String getUuid() {
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString().replace("-", "");
        return id;
    }
}
