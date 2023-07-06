package az.ingress.msfilemanagement.service;

import az.ingress.msfilemanagement.model.InformationDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.Arrays;

/**
 * @author caci
 */

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadImage(MultipartFile file, InformationDto info) {
        System.out.println(file.getOriginalFilename());
        System.out.println("info: " + info.getInformation());
        return file.getOriginalFilename() + " : " + info.getInformation();
    }

    @Override
    public String getInformation(String info) {
        return info;
    }
}
