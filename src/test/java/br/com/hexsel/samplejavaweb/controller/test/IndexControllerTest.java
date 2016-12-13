package br.com.hexsel.samplejavaweb.controller.test;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.Assert.assertEquals;

import javax.faces.context.FacesContext;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.hexsel.samplejavaweb.controller.IndexController;

public class IndexControllerTest {

	@InjectMocks
	private IndexController indexController;

	@Mock
	private FacesContext facesContext;

	@BeforeMethod
	public void setup() {
		initMocks(this);
	}

	@Test
	public void shouldEmbraceInputWithBrackets() {
		indexController.setInputContent("test");
		indexController.doAction();
		assertEquals(indexController.getInputContent(), "[test]");
	}

}
