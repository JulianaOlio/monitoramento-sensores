package br.com.fiap.monitoramento_sensores.service;

import br.com.fiap.monitoramento_sensores.model.SensorChannels;
import br.com.fiap.monitoramento_sensores.model.SensorData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

@EnableBinding(SensorChannels.class)
public class SensorMonitoringService {

    @Autowired
    private EmailService emailService;

    @StreamListener(SensorChannels.TEMPERATURE_INPUT)
    public void processTemperature(@Payload SensorData data) {
        if (data.getTemperature() > 40) {
            System.out.println("Alert: High temperature detected!");
            // Enviar e-mail de alerta
            emailService.sendAlertEmail(
                    "alert@example.com",
                    "High Temperature Alert",
                    "A high temperature of " + data.getTemperature() + "°C was detected."
            );
        }
    }
}