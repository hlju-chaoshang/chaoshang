package hlju.chaoshang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@SpringBootApplication

@MapperScan("hlju.chaoshang.mapper")
@ComponentScan("hlju.chaoshang.config")
public class ChaoshangApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChaoshangApplication.class, args);
    }

}

