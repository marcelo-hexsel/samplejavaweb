package br.com.hexsel.samplejavaweb.controller;

import static java.lang.String.format;
import static javax.faces.application.FacesMessage.SEVERITY_INFO;

import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class IndexController extends BaseController {

	private static final long serialVersionUID = 1L;

	private String inputContent;

	public void doAction() {
		inputContent = format("[%s]", inputContent);
		facesContext.addMessage(null,
				new FacesMessage(SEVERITY_INFO, getResource("strActionPerformed"), format(getResource("strActionPerformedDetail"), inputContent)));
	}

	public String getInputContent() {
		return inputContent;
	}

	public void setInputContent(String inputContent) {
		this.inputContent = inputContent;
	}

}
