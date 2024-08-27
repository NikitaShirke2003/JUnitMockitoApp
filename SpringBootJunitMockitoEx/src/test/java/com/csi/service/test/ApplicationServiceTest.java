package com.csi.service.test;

import com.csi.service.ApplicationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationServiceTest {
    ApplicationService applicationService = new ApplicationService();

    @Test

    public void addTest() {
        Assertions.assertEquals(15, applicationService.add(12, 3));
    }
    @Test
    public void  subTest()
    {
        Assertions.assertEquals(3,applicationService.sub(10,7));
    }

}
