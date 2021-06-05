package io.adminapplication.Admin_Application.resource;

import io.adminapplication.Admin_Application.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminResources {
    @RequestMapping("/{adminId}")
    public AdminInfo getAdminInfo(@PathVariable("adminId")String adminId){
            return  new AdminInfo(adminId,"paridamanisha1449@gmail.com","hellousers");
    }
}
