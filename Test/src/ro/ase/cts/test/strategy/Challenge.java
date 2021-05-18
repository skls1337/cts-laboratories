package ro.ase.cts.test.strategy;

import ro.ase.cts.test.sources.IChallenge;

public class Challenge implements IChallenge {

	private StrategyChallengeInterface strategyChallenge = null;

	public Challenge(StrategyChallengeInterface strategyChallenge) {
		super();
		this.strategyChallenge = strategyChallenge;
	}

	public void setStrategyChallenge(StrategyChallengeInterface strategyChallenge) {
		this.strategyChallenge = strategyChallenge;
	}

	@Override
	public void startExercitiu(int nrRepetitii) {
		for (int i = 0; i < nrRepetitii; i++) {
			strategyChallenge.doExercise();
		}
	}

}
