package br.com.fiap.monitoramento_sensores.model;

public class SensorData {

    private double temperature;

    // Construtor
    public SensorData(double temperature) {
        this.temperature = temperature;
    }

    // Getter e Setter
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

