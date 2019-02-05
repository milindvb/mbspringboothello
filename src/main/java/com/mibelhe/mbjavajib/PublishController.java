package com.mibelhe.mbjavajib;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class PublishController {

	@RequestMapping(value = "/publishMessage", method = RequestMethod.GET)

	public String message(@RequestBody String name){

		return name;

	}


@RequestMapping(value="/echo")
@ResponseBody
public String method9(@RequestParam("text") String txt){
	return "Hello  "+txt;
}

}

