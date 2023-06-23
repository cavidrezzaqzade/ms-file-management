package az.ingress.msfilemanagement.service;

import az.ingress.msfilemanagement.model.InformationDto;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author caci
 */

public interface FileService {

    String uploadImage(MultipartFile[] files, InformationDto info);

}
