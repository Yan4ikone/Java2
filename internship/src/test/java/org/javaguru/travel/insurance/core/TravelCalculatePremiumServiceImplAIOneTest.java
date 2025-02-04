package org.javaguru.travel.insurance.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.dto.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class TravelCalculatePremiumServiceImplAIOneTest {


    @Nested
    @ExtendWith(MockitoExtension.class)
    class TravelCalculatePremiumServiceImplTest {

        @Mock
        private TravelCalculatePremiumRequest mockDependency;
        private TravelCalculatePremiumResponse mockDep;

        @InjectMocks
        private TravelCalculatePremiumServiceImpl service;

        @BeforeEach
        void setUp() {
            // Здесь можно инициализировать объект service, если не используете @InjectMocks
        }

        @Test
        public void answerFirstName() {
            TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
            request.setPersonFirstName("Андрей");

            TravelCalculatePremiumResponse expectedResponse = new TravelCalculatePremiumResponse();
            expectedResponse.setPersonFirstName(request.getPersonFirstName());

            when(service.calculatePremium(request)).thenReturn(expectedResponse);

            TravelCalculatePremiumResponse response = service.calculatePremium(request);
            assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
        }
    }
}
