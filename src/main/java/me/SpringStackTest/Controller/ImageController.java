package me.SpringStackTest.Controller;

import lombok.RequiredArgsConstructor;
import me.SpringStackTest.Service.ImageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequiredArgsConstructor
public class ImageController {
    private final ImageService imageService;

    @PostMapping("test")
    public String fileUpload(@RequestParam("file") MultipartFile file) throws Exception {
        imageService.fileUpload(file);
        return "true";
    }
}
