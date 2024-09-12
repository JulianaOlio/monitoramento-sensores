package br.com.fiap.monitoramento_sensores.model;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SensorChannels {
    String TEMPERATURE_INPUT= "temperatureInput";

    @Input(TEMPERATURE_INPUT)
    SubscribableChannel temperatureInput();

}
