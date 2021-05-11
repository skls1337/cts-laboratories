package ro.ase.csie.cts.g1092.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		TaskManager manager=new TaskManager();
		
		manager.addAsyncTask(new AsyncCommand("Auto-save", new BackupModule()));
		manager.addAsyncTask(new AsyncCommand("Update 3D Models", new UpdateModule()));

		manager.execute();
		manager.execute();
		manager.execute();
		
	}

}
