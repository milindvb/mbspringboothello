package com.mibelhe.mbjavajib;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.microsoft.azure.AzureEnvironment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.microsoft.azure.credentials.AppServiceMSICredentials;

import com.microsoft.azure.keyvault.KeyVaultClient;
import com.microsoft.azure.keyvault.models.KeyBundle;

import java.util.HashMap;

import java.util.Map;

import java.util.Optional;



import org.springframework.core.env.ConfigurableEnvironment;

import org.springframework.core.env.MutablePropertySources;

import org.springframework.core.env.StandardEnvironment;

import org.springframework.core.io.DefaultResourceLoader;

import org.springframework.core.io.Resource;

import org.springframework.util.Assert;

import org.springframework.util.ClassUtils;



import java.util.HashMap;

import java.util.Map;

import java.util.Optional;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@RestController
public class PublishController {

	@RequestMapping(value = "/publishMessage", method = RequestMethod.GET)

	public String message(@RequestBody String name){
            return name;
	}

        @RequestMapping(value="/hello")
        @ResponseBody

        public String method9(@RequestParam("text") String txt){
	   return "Hello  "+txt;
        }

}

