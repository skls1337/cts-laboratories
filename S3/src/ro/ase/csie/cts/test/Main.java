package ro.ase.csie.cts.test;

import ro.ase.csie.cts.command.ProcessRequestSomething;
import ro.ase.csie.cts.command.RequestCommand;
import ro.ase.csie.cts.command.RequestManager;
import ro.ase.csie.cts.singleton.Robot;
import ro.ase.csie.cts.sources.TipCerere;
import ro.ase.csie.cts.state.SoftwareRobot;

public class Main {
	public static void main(String[] args) {
		Robot robot1 = Robot.getInstance();
		Robot robot2 = Robot.getInstance();
		if (robot1 == robot2) {
			System.out.println("Same");
		}

		robot1.getIdRobot();
		robot1.prelucrareCerere("da");

		SoftwareRobot softRobot1 = new SoftwareRobot();
		softRobot1.viewRequestStatus();
		softRobot1.sendRequest(9);

		SoftwareRobot softRobot2 = new SoftwareRobot();
		softRobot2.viewRequestStatus();
		softRobot2.sendRequest(10);

		RequestManager manager = new RequestManager();
		manager.addRequests(new RequestCommand("Req 1", TipCerere.URGENTA, new ProcessRequestSomething()));
		manager.addRequests(new RequestCommand("Req 2", TipCerere.NORMALA, new ProcessRequestSomething()));
		manager.addRequests(new RequestCommand("Req 3", TipCerere.URGENTA, new ProcessRequestSomething()));

		manager.process();
		manager.process();
		manager.process();

	}
}
