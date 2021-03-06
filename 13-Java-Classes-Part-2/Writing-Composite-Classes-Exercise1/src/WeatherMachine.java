public class WeatherMachine {
	Thermometer thermometer;

	public WeatherMachine() {
		thermometer = new Thermometer();
	}

	private double[] getPastTemperatures() {
		double[] result = new double[24];

		for(int i = 0; i < result.length; i++) {
			result[i] = thermometer.getTemperature();
		}
		return result;
	}

	public void getWeatherReport() {
		System.out.println("Your last 24 hours:");

		double[] temps = getPastTemperatures();

		for(int i = 0; i < temps.length; i++) {
			System.out.println(i + ":00 " + temps[i] + " degrees");
		}
	}
}
