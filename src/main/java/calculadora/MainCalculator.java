package calculadora;

import upm.jbb.IO;

public class MainCalculator {
	private CommandManager commandManager;

	public MainCalculator() {
		Calculator calculator = new Calculator();
		this.commandManager = new CommandManager();
		this.commandManager.add(new Suma(calculator));
		this.commandManager.add(new Resta(calculator));
		this.commandManager.add(new Reseteo(calculator));
		this.commandManager.add(new Total(calculator));
	}

	public void execute() {
		String key = (String) IO.getIO().select(this.commandManager.keys());
		this.commandManager.execute(key);
	}

	public static void main(String[] args) {
		IO.getIO().addView(new MainCalculator());
	}
}
