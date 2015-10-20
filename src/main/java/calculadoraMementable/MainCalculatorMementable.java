package calculadoraMementable;

import calculadora.CommandManager;
import calculadora.Reseteo;
import calculadora.Resta;
import calculadora.Suma;
import calculadora.Total;
import upm.jbb.IO;

public class MainCalculatorMementable {
	private CommandManager commandManager;

	public MainCalculatorMementable() {

		GestorMementos<MementoCalculadora> gm = new GestorMementos<MementoCalculadora>();
		Originador o = new Originador(666);
		CalculadoraMementable calculadoraMementable = new CalculadoraMementable(gm, o);
		this.commandManager = new CommandManager();
		this.commandManager.add(new Suma(calculadoraMementable));
		this.commandManager.add(new Resta(calculadoraMementable));
		this.commandManager.add(new Reseteo(calculadoraMementable));
		this.commandManager.add(new Total(calculadoraMementable));
		this.commandManager.add(new Guarda(calculadoraMementable));
		this.commandManager.add(new Deshace(calculadoraMementable));
	}

	public void execute() {
		String key = (String) IO.getIO().select(this.commandManager.keys());
		this.commandManager.execute(key);
	}

	public static void main(String[] args) {
		IO.getIO().addView(new MainCalculatorMementable());
	}
}
