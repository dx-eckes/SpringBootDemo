package com.example.SpringBootDemo.rest;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "测试API接口,rest接口1111111111",description = "测试接口描述")
public class TestRestController {

    @ApiOperation(value="测试rest接口", notes="测试rest接口，测试get接口")
    @ApiModelProperty
    @PostMapping(value = "v1/test")
    public String test(@ApiParam("字符串参数，用于返回") @RequestParam("testStr") String testStr, @ApiParam("日期参数，打印") @RequestParam("date") String date,@ApiParam("实体参数，打印") @RequestBody TestUser user){
        System.out.println(date);
        System.out.println(user);
        return testStr;
    }
}
