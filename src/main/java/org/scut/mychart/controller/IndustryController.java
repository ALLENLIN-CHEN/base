package org.scut.mychart.controller;

import com.github.abel533.echarts.json.GsonUtil;
import org.codehaus.jackson.map.ObjectMapper;
import org.scut.mychart.redis.RedisBaseDao;
import org.scut.mychart.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping(value="/charts/industry", produces="application/json;charset=UTF-8")
public class IndustryController {

	@Autowired
	private IndustryService industryService;
	@Autowired
	private RedisBaseDao redisBaseDao;
	private ObjectMapper mapper=new ObjectMapper();

	@RequestMapping("/getIndustryNameList")
    @ResponseBody
    public Map<String, Object> getIndustryNameList(){
//		Map<String, Object> result = new HashMap<String, Object>();
//		result.put("data", this.industryService.getIndustryNameList());
//		return  result;
		Map<String, Object> result =null;
		String json=null;
		try {
			json=redisBaseDao.getRedisData("/charts/industry/getIndustryNameList");
			if(json != null && !json.isEmpty()) {
				return mapper.readValue(json,Map.class);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		result = new HashMap<String, Object>();
		result.put("data", this.industryService.getIndustryNameList());
		try {
			json = mapper.writeValueAsString(result);
			redisBaseDao.setRedisData("/charts/industry/getIndustryNameList", json);
		}catch (IOException e){
			e.printStackTrace();
		}
		return  result;
    }

	@RequestMapping("/getFunnelOption")
	@ResponseBody
	public Map<String, Object> getFunnelOption( String industry_code){

//		Map<String, Object> result = new HashMap<String, Object>();
//		result.put("type","INDUSTRY_FUNNEL");
//		result.put("industry_code",industry_code);
//		result.put("data",industryService.getIndustry_FunnelOption(industry_code));
//		return result;
		Map<String, Object> result =null;
		String json=null;
		try {
			json=redisBaseDao.getRedisData("/charts/industry/getFunnelOption"+industry_code);
			if(json != null && !json.isEmpty()) {
				return mapper.readValue(json,Map.class);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		result = new HashMap<String, Object>();
		result.put("type","INDUSTRY_FUNNEL");
		result.put("industry_code",industry_code);
		result.put("data",industryService.getIndustry_FunnelOption(industry_code));
		try {
			json = mapper.writeValueAsString(result);
			redisBaseDao.setRedisData("/charts/industry/getFunnelOption"+industry_code, json);
		}catch (IOException e){
			e.printStackTrace();
		}
		return  result;
	}
	@RequestMapping("/getLineOption")
	@ResponseBody
	public Map<String, Object> getLineOption( String industry_code){
//		Map<String, Object> result = new HashMap<String, Object>();
//		result.put("type","INDUSTRY_LINE");
//		result.put("industry_code",industry_code);
//		result.put("data", industryService.getIndustry_LineOption(industry_code));
//		return result;
		Map<String, Object> result =null;
		String json=null;
		try {
			json=redisBaseDao.getRedisData("/charts/industry/getLineOption"+industry_code);
			if(json != null && !json.isEmpty()) {
				return mapper.readValue(json,Map.class);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		result = new HashMap<String, Object>();
		result.put("type","INDUSTRY_LINE");
		result.put("industry_code",industry_code);
		result.put("data", industryService.getIndustry_LineOption(industry_code));
		try {
			json = mapper.writeValueAsString(result);
			redisBaseDao.setRedisData("/charts/industry/getLineOption"+industry_code, json);
		}catch (IOException e){
			e.printStackTrace();
		}
		return  result;
	}
	@RequestMapping("/getBarOption")
	@ResponseBody
	public Map<String, Object> getBarOption(){
//		Map<String, Object> result = new HashMap<String, Object>();
//		result.put("type","INDUSTRY_BAR");
//		result.put("data",industryService.getIndustry_BarOption());
//		return result;
		Map<String, Object> result =null;
		String json=null;
		try {
			json=redisBaseDao.getRedisData("/charts/industry/getBarOption");
			if(json != null && !json.isEmpty()) {
				return mapper.readValue(json,Map.class);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		result = new HashMap<String, Object>();
		result.put("type","INDUSTRY_BAR");
		result.put("data",industryService.getIndustry_BarOption());
		try {
			json = mapper.writeValueAsString(result);
			redisBaseDao.setRedisData("/charts/industry/getBarOption", json);
		}catch (IOException e){
			e.printStackTrace();
		}
		return  result;
	}
	@RequestMapping("/getThemeOption")
	@ResponseBody
	public Map<String, Object> getThemeOption(){
//		Map<String, Object> result = new HashMap<String, Object>();
//		result.put("type","ThemeOption");
//		result.put("data",industryService.getIndustryThemeOption());
//		return result;
		Map<String, Object> result =null;
		String json=null;
		try {
			json=redisBaseDao.getRedisData("/charts/industry/getThemeOption");
			if(json != null && !json.isEmpty()) {
				return mapper.readValue(json,Map.class);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		result = new HashMap<String, Object>();
		result.put("type","ThemeOption");
		result.put("data",industryService.getIndustryThemeOption());
		try {
			json = mapper.writeValueAsString(result);
			redisBaseDao.setRedisData("/charts/industry/getThemeOption", json);
		}catch (IOException e){
			e.printStackTrace();
		}
		return  result;
	}
}
