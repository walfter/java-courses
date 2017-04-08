/**
 * Класс реализует калькулятор
 */
public class Calculator {

	/**
	 * Результат вычисления
	 */
	private float result;

	/**
	 * Конструктор класса для нуления начального значения
	 */
	Calculator (){
		this.result = 0;
	}

	/**
	 * Суммируем аргументы
	 * @param params Аргументы суммирования
	 */
	public void plus (float ... params) {
		for ( Float param : params ) {
			this.result += param;
		}
	}

	/**
	 * Возвращает результат действий
	 * @return результаты вычеслений
	 */
	public float getResult () {
		return this.result;
	}

	/**
	 * Очищает результаты вычеслений
	 */
	public void clearRes() {
		this.result = 0;
	}

	/**
	 * Вычитает параметры
	 * @param params Аргументы вычитания
	 */
	public void minus (float ... params) {
		for ( Float param : params )
			if (this.result != 0.0)
				this.result -= param;
			else
				this.result = param;
	}

	/**
	 * Делит аргументы
	 * @param params Аргументы для деления
	 */
	public void div ( float ... params ) {
		for ( Float param : params )
			if (this.result != 0.0)
				this.result /= param;
			else
				this.result = param;
	}

	/**
	 * Умножение параметров
	 * @param params Аргументы для умножения
	 */
	public void mult (float ... params ){
		for ( Float param : params )
			if (this.result != 0.0)
				this.result *= param;
			else
				this.result = param;
	}

	/**
	 * Деление по модулю
	 * @param params аргументы для деления по модулю
	 */
	public void mod (float ... params) {
		for (Float param : params )
			if (this.result != 0.0)
				this.result %= param;
			else
				this.result = param;
	}

}