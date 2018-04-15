package spittr.dataBase;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Component;

import spittr.Spittle;


@Component
public class ImpCacheRepository {
	
	@Cacheable("spittleCache")
	public Spittle findOne(long id) {
		System.out.println("create" + id);
		return  new Spittle("only ONE", new Date());
	}
}
