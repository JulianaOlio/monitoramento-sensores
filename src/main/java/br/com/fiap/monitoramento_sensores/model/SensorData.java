package br.com.fiap.monitoramento_sensores.model;

public class SensorData {

    private Double temperature;

    // Construtor
    public SensorData(Double temperature) {
        this.temperature = temperature;
    }

    // Getter e Setter
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}

