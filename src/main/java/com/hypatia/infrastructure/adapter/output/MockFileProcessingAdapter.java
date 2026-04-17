package com.hypatia.infrastructure.adapter.output;

import com.hypatia.application.port.output.FileProcessingPort;
import org.springframework.stereotype.Component;

@Component
public class MockFileProcessingAdapter implements FileProcessingPort {
    @Override
    public String extractText(byte[] fileContent) {
        // Mock - substituir depois por Tika, OCR, etc.
        return "Texto extraído mock: " + new String(fileContent).substring(0, Math.min(100, fileContent.length));
    }
}
