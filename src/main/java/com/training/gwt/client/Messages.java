package com.training.gwt.client;

import com.google.gwt.i18n.client.Constants;
import com.google.gwt.i18n.client.LocalizableResource.Generate;

@Generate(format = "com.google.gwt.i18n.server.PropertyCatalogFactory")
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  @DefaultMessage("Enter first name")
  String firstNameField();

  @DefaultMessage("Enter last name")
  String lastNameField();

  @DefaultMessage("Enter phone number")
  String phoneNumberField();

  @DefaultMessage("Enter your address")
  String addressField();

  @DefaultMessage("Enter the city name")
  String cityNameField();

  @DefaultMessage("Enter the postal code")
  String postalCodeField();

  @DefaultMessage("Send")
  String sendButton();
}
