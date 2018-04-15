package spittr.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spittr.Spittle;
import spittr.dataBase.SpittleRepository;
@Controller
@RequestMapping("/spittles")
public class SpittleController {
	
	private static final String MAX_LONG_AS_STRING = Long.toString(Long.MAX_VALUE);
	private SpittleRepository repository;
	@Autowired
	public SpittleController(SpittleRepository repository){
		this.repository = repository;
	}
	
	
//	@RequestMapping(method=RequestMethod.GET)
//	public String spittles(Model model){
//		model.addAttribute(
//				repository.findSpittles(
//						Long.MAX_VALUE, 20));
//		return "spittles";
//	}
	
	@RequestMapping(value = "/one", method = RequestMethod.GET)
	public String findOne(
//			@RequestParam(value="max", defaultValue=MAX_LONG_AS_STRING) long max
			@RequestParam(value="spittleID", defaultValue="0") long id
			, Model model){
		List<Spittle> tem = new ArrayList<Spittle>();
		Spittle spittle = this.findOne(id);
		tem.add(spittle);
		model.addAttribute(tem);
		return "spittles";
	}
	
	@Cacheable("spittleCache")
	public Spittle findOne(long id) {
		System.out.println("create " + id);
		return  new Spittle("only ONE", new Date());
	}
//	@Cacheable("spittleCache")
////	@Cacheable(value = "spittleCache", key ="#id")
//	public Spittle createOne(long id){
//		System.out.println("ceate " + id);
//		Spittle spittle = new Spittle("only ONE", new Date());
//		spittle.setId(id);
//		return spittle;
//	}
}
