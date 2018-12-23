package com.paulzhangcc.swagger2;

import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by paul on 2018/12/9.
 */
@Controller
@RequestMapping("/user")
@Api("用户信息")
public class UserController {

    @PostMapping(value = "/create")
    @ResponseBody
    @ApiOperation("创建用户")
    public String create(@RequestHeader String token,
                       GatewayInfo gatewayInfo,
                       @RequestBody User user
    ) {
        return null;
    }


}
