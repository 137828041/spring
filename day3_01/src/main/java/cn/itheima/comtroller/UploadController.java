package cn.itheima.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/load")
public class UploadController {
    //    指定允许上传的文件类型
   private String[] allowType={"image/jpeg","application/octet-stream"};
    @RequestMapping("/test1")
    public String test1(MultipartFile photo, HttpServletRequest request) throws IOException {
        System.out.println(photo.getOriginalFilename() + "文件名");
        System.out.println("文件类型:"+photo.getContentType());
        //1.设定上传位置
        String realPath = request.getServletContext().getRealPath("/pic/");
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        //2.组装文件上传路径
        //获取文件名称
        String photoname = photo.getOriginalFilename();
        photoname = realPath + photoname;

        //3.实现文件上传
        photo.transferTo(new File(photoname));
        return "success";
    }
}
