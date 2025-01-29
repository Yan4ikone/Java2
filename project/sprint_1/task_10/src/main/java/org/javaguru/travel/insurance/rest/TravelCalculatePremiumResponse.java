package org.javaguru.travel.insurance.rest;

import java.util.Date;

public class TravelCalculatePremiumResponse {

    private String personFirstName;
    private String personLastName;
    private Date agreementDateFrom;
    private Date agreementDateTo;

    public TravelCalculatePremiumResponse() {}

    public TravelCalculatePremiumResponse(String personFirstName,
                                          String personLastName,
                                          Date agreementDateFrom,
                                          Date agreementDateTo) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.agreementDateFrom = agreementDateFrom;
        this.agreementDateTo = agreementDateTo;
    }

    private String getPersonFirstName() {
        return personFirstName;
    }

    private void setPersonFirstName(String personFirstName) {
    this.personFirstName = personFirstName;
    }

    private String getPersonLastName() {
        return personLastName;
    }

    private void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    private Date getAgreementDateFrom() {
        return agreementDateFrom;
    }

    private void setAgreementDateFrom(Date agreementDateFrom) {
        this.agreementDateFrom = agreementDateFrom;
    }

    private Date getAgreementDateTo() {
        return agreementDateTo;
    }

    private void setAgreementDateTo(Date agreementDateTo) {
        this.agreementDateTo = agreementDateTo;
    }
}

