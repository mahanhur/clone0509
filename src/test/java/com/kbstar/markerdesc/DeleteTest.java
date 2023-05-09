package com.kbstar.markerdesc;

import com.kbstar.service.MarkerDescService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class DeleteTest {
    @Autowired
    MarkerDescService service;

    @Test
    void contextLoads() throws Exception {
        try {
            service.remove(13);
            log.info("삭제 정상");
        } catch (Exception e) {
            log.info("삭제 에러..");
        }
    }
}

