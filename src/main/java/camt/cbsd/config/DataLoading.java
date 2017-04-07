package camt.cbsd.config;

import camt.cbsd.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by CAMT on 4/7/2017.
 */
@ConfigurationProperties(prefix = "server")
@Component
public class DataLoading implements ApplicationRunner {
    StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    String baseUrl;
    String imageUrl;
    String imageBaseUrl;
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
    public void 
}
