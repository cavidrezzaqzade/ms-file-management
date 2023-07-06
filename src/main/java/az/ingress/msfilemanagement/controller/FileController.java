package az.ingress.msfilemanagement.controller;

import az.ingress.msfilemanagement.model.InformationDto;
import az.ingress.msfilemanagement.service.FileService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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

    @PostMapping
    @Operation(summary = "upload files", description = "upload files", tags = {"File"})
    public ResponseEntity<?> uploadImage(@RequestPart("files") MultipartFile[] file, @RequestPart("info") InformationDto info){
        String uploadImage = service.uploadImage(file, info);
        return ResponseEntity.status(HttpStatus.OK)
                .body(uploadImage);
    }

    @GetMapping("/{info}")
    @Operation(summary = "get information", description = "get information ", tags = {"File"})
    @ResponseStatus(HttpStatus.OK)
    public String getInfo(@PathVariable(name = "info") String info){
        if(true)
            throw new RuntimeException("feign test exception was thrown");
        return service.getInformation(info);
    }

}
