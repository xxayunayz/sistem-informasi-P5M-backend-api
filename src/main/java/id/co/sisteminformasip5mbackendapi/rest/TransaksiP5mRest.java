package id.co.sisteminformasip5mbackendapi.rest;


import id.co.sisteminformasip5mbackendapi.config.EncodeData;
import id.co.sisteminformasip5mbackendapi.service.TransaksiP5mService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/TransaksiP5m")
public class TransaksiP5mRest {

    @Autowired
    private TransaksiP5mService transaksiP5mService;

    @Autowired
    private EncodeData encodeData;

    @PostMapping("/GetDataTransaksi")
    public ResponseEntity<String> getDataTransaksi(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = transaksiP5mService.getDataTransaksi(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get transaction data", e);
        }
    }

    @PostMapping("/CreateTransaksi")
    public ResponseEntity<String> createTransaksi(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = transaksiP5mService.createTransaksi(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to create transaction", e);
        }
    }

    @PostMapping("/UpdateTransaksi")
    public ResponseEntity<String> updateTransaksi(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = transaksiP5mService.updateTransaksi(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to update transaction", e);
        }
    }

    @PostMapping("/DeleteTransaksi")
    public ResponseEntity<String> deleteTransaksi(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = transaksiP5mService.deleteTransaksi(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to delete transaction", e);
        }
    }
}
