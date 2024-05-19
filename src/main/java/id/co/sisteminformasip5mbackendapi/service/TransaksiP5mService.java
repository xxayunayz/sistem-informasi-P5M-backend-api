package id.co.sisteminformasip5mbackendapi.service;

import java.util.Map;

public interface TransaksiP5mService {
    String getDataTransaksi(Map<String, Object> data);
    String createTransaksi(Map<String, Object> data);
    String updateTransaksi(Map<String, Object> data);
    String deleteTransaksi(Map<String, Object> data);
}
