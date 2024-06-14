package com.coder.pandey;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.springframework.stereotype.Service;

@Service
public class Pandey {

    public byte[] generateBarcode(String data) {
        Code128Bean barcodeBean = new Code128Bean();
        final int dpi = 150;

        barcodeBean.setModuleWidth(0.21);
        barcodeBean.doQuietZone(false);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        BitmapCanvasProvider canvasProvider = new BitmapCanvasProvider(out, "image/png", dpi,
                BufferedImage.TYPE_BYTE_BINARY, false, 0);

        barcodeBean.generateBarcode(canvasProvider, data);

        try {
            canvasProvider.finish();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return out.toByteArray();
    }
}
