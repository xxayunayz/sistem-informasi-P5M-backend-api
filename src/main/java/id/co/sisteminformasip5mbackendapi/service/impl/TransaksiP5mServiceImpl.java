package id.co.sisteminformasip5mbackendapi.service.impl;

import id.co.sisteminformasip5mbackendapi.repository.PolmanAstraRepository;
import id.co.sisteminformasip5mbackendapi.service.TransaksiP5mService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TransaksiP5mServiceImpl implements TransaksiP5mService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;
    @Override
    public String getDataTransaksi(Map<String, Object> data) {
        return null;
    }

    @Override
    public String createTransaksi(Map<String, Object> data) {
        return null;
    }

    @Override
    public String updateTransaksi(Map<String, Object> data) {
        return null;
    }

    @Override
    public String deleteTransaksi(Map<String, Object> data) {
        return null;
    }
}
