package ro.ase.csie.cts.g1092.dp.command;

public class AsyncCommand extends AsyncTask {

	String taskName;
	GameModuleInterface module = null;

	public AsyncCommand(String taskName, GameModuleInterface module) {
		this.taskName = taskName;
		this.module = module;
	}

	@Override
	public void asyncExecute() {
		module.doTask(taskName);
	}

}
