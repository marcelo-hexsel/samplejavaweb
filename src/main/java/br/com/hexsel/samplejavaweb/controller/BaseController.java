package br.com.hexsel.samplejavaweb.controller;

import static java.util.ResourceBundle.getBundle;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.context.FacesContext;
import javax.inject.Inject;

public class BaseController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	protected FacesContext facesContext;

	public String getResource(String key) {
		try {
			String messageBundleName = facesContext.getApplication().getMessageBundle();
			Locale locale = facesContext.getViewRoot().getLocale();
			ResourceBundle bundle = getBundle(messageBundleName, locale);
			return bundle.getString(key);
		} catch (Exception e) {
			return "";
		}
	}

}
