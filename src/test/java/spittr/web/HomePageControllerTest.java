package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HomePageControllerTest {
//	@Test
	public void testHomePage(){
		HomeController controller = new HomeController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		try {
			MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/");
			System.out.println(null == mockHttpServletRequestBuilder);
			mockMvc.perform(
					mockHttpServletRequestBuilder)
					.andExpect(MockMvcResultMatchers.view().name("home"));
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}
