package gc.jenkins;

public class Main {
    public static double fahrenheitParaCelsius(double temperaturaF) {
        return (temperaturaF - 32) * 5.0 / 9.0;
    }

    public static double celsiusParaFahrenheit(double temperaturaC) {
        return (temperaturaC * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        // Casos de teste para conversão de Fahrenheit para Celsius
        double temperatura1F = 32.0;
        double resultado1C = fahrenheitParaCelsius(temperatura1F);
        System.out.println(temperatura1F + "°F é igual a " + resultado1C + "°C");

        double temperatura2F = 100.0;
        double resultado2C = fahrenheitParaCelsius(temperatura2F);
        System.out.println(temperatura2F + "°F é igual a " + resultado2C + "°C");

        double temperatura3F = 212.0;
        double resultado3C = fahrenheitParaCelsius(temperatura3F);
        System.out.println(temperatura3F + "°F é igual a " + resultado3C + "°C");
    }
}