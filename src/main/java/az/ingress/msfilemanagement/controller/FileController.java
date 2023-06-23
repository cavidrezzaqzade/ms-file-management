package az.ingress.msfilemanagement.controller;

import az.ingress.msfilemanagement.model.InformationDto;
import az.ingress.msfilemanagement.service.FileService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author caci
 */

@RestController
@RequestMapping("/v1/files")
@RequiredArgsConstructor
@Tag(name = "File", description = "file management api")
public class FileController {

    private final FileService service;

    @PostMapping(/*consumes = {"multipart/form-data"*//*, "application/json"*//*}*/)
    @Operation(summary = "upload images", description = "upload images", tags = {"File"})
    public ResponseEntity<?> uploadImage(@RequestPart("images") MultipartFile[] file, @RequestPart("info") InformationDto info){
        String uploadImage = service.uploadImage(file, info);
        return ResponseEntity.status(HttpStatus.OK)
                .body(uploadImage);
    }

}
