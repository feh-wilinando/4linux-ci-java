package br.com.dexter.controller;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
@AutoConfigureMockMvc
public class CalculadoraControllerTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	ObjectMapper mapper;

	@Test
	public void shouldSumReturnResult() throws Exception {
		MvcResult result = this.mvc.perform(post("/calculadora/soma/10/10")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();

		String resultado = result.getResponse().getContentAsString();
		assertThat(resultado, is("20"));

	}
	
	@Test
	public void shouldSubtractReturnResult() throws Exception {
		MvcResult result = this.mvc.perform(post("/calculadora/sub/20/5")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();

		String resultado = result.getResponse().getContentAsString();
		assertThat(resultado, is("15"));

	}
	
	@Test
	public void shouldReturnBadRequest() throws Exception {
		this.mvc.perform(post("/calculadora/sub/20")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isBadRequest());

	}

}
