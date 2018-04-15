package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spittr.dataBase.ImpCacheRepository;
import spittr.dataBase.JdbcSpitterRepository;
import spittr.dataBase.SpittleRepository;
import spittr.entity.Spittle;
import spittr.jms.AlertService;

@Controller
public class HomeController {
	@Autowired
	private EhCacheCacheManager manager;
	@Autowired
	private JdbcSpitterRepository repository;
	@Autowired
	private SpittleRepository repository2;
	
	@Autowired
	private AlertService alertService;
	
	@Autowired
	private ImpCacheRepository impCacheRepository;
	
	@RequestMapping(value = "/home", method=GET)
	public String home(){
		repository.findOne(1+"");
		return "home";
	}
	
	@RequestMapping(value = "/test", method=GET)
	public String test(){
		repository2.findOne(1);
		return "home";
	}
	
	@RequestMapping(value = "/jms", method=GET)
	public String testJms(){
		Spittle spittle = Spittle.newInstance();
		alertService.sendSpittleAlert(spittle);
		return "home";
	}
	
	@RequestMapping(value = "/jms/receive", method=GET)
	public String receiveJms(){
		alertService.receiveMessage();
		return "home";
	}
	
	@RequestMapping(value = "/testImp", method=GET)
	public String testImp(){
		net.sf.ehcache.Cache cache = manager.getCacheManager().getCache("spittleCache");
		System.out.println(cache.get(2l));
		impCacheRepository.findOne(2);
		return "home";
	}
}
