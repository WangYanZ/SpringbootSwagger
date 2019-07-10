package io.transwarp.esb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.transwarp.esb.service.DataFormatUtil;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
@Api(description = "EsbRequestController")
@RequestMapping(value = "/base")
public class EsbController {

//    @Autowired
//    private DataFormatUtil dataFormatUtil;

    @ApiOperation(value = "esbRequestUnifiedInterface",notes = "参数类型为标准xml格式")
    @RequestMapping(value = "/esb",method= RequestMethod.POST)
    public String esb() throws IOException {
        return "esb";
    }
    @ApiOperation(value = "testValue")
    @RequestMapping(value = "/test",method= RequestMethod.GET)
    public String test() throws IOException {
        return "test";
    }
}
