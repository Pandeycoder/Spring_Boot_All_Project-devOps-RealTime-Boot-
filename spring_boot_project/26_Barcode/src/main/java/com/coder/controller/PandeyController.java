package com.coder.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coder.pandey.Pandey;

@RestController
public class PandeyController {

    @Autowired
    private Pandey barcodeService;

    @GetMapping("/generate-barcode")
    public ResponseEntity<byte[]> generateBarcode(@RequestParam String studentId, @RequestParam int math,
            @RequestParam int science, @RequestParam int english) {
        int total = math + science + english;
        String data = String.format("ID:%s, Math:%d, Science:%d, English:%d, Total:%d",
                studentId, math, science, english, total);

        byte[] barcodeImage = barcodeService.generateBarcode(data);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "image/png");
        headers.set("Content-Disposition", "inline; filename=student_marksheet_barcode.png");

        return new ResponseEntity<>(barcodeImage, headers, HttpStatus.OK);
    }
}
