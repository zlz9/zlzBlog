package com.zlzBlog.util;

import com.google.gson.Gson;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class QiniuUtils {
   public static final String url = "http://ratzoxh34.hn-bkt.clouddn.com/";
//   密钥
String accessKey = "jvrdvQS1dJifEhk_QHfmGI4WcbLQRYmyeAE5tLdb";
String secretKey = "iZ8hSrAA6BEfUsUFDOvDvemkfTmCTqEJup-Fi9yG";
    public boolean upload(MultipartFile file,String fileName){
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.huanan());
        UploadManager uploadManager = new UploadManager(cfg);
        String bucket = "zlz9";
        try {
            byte[] uploadBytes =file.getBytes();
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            Response response = uploadManager.put(uploadBytes,fileName,upToken);
//            解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
