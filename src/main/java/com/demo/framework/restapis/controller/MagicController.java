package com.demo.framework.restapis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Krishan Shukla on 19/07/2018.
 */
@RestController
@RequestMapping("/magic")
public class MagicController {
    final static Logger logger = LoggerFactory.getLogger(MagicController.class);

    @RequestMapping(value = "find/{input}/{output}",
            method = {RequestMethod.GET})
    public String getWandOfHarryPotter(@RequestParam(defaultValue = "This is input parameter of restapi" ,required = false, value="input") String input , @RequestParam(defaultValue="This is expected output of restapi",required = false, value="output") String output) {

        logger.info("input " + input + "   " + "output " + output);
        return null;
    }


}
