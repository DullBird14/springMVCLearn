package spittr.config;

import net.sf.ehcache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableCaching
public class CacheConfig {
	
	@Bean
	public EhCacheCacheManager cacheManager(CacheManager cm) {
	  return new EhCacheCacheManager(cm);
	}

	@Bean
	public EhCacheManagerFactoryBean ehcache() {
	  EhCacheManagerFactoryBean ehCacheFactoryBean = new EhCacheManagerFactoryBean();
//	  ehCacheFactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
	  ehCacheFactoryBean.setConfigLocation(new ClassPathResource("spittr/cache/ehcache.xml"));
	  return ehCacheFactoryBean;
	}
//	@Bean
//	public CacheManager cacheMangaer(){
//		ConcurrentMapCacheManager concurrentMapCacheManager = new ConcurrentMapCacheManager();
//		ArrayList<String> arrayList = new ArrayList<String>();
//		arrayList.add("spittleCache");
//		concurrentMapCacheManager.setCacheNames(arrayList);
//		return concurrentMapCacheManager;
////		return new ConcurrentMapCacheManager();
//	}
}
