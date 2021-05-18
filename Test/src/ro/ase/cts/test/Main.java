package ro.ase.cts.test;

import java.util.HashSet;
import java.util.Set;

import ro.ase.cts.test.builder.CursFitness;

import ro.ase.cts.test.builder.DificultateCurs;
import ro.ase.cts.test.chain.AccidentareGrava;
import ro.ase.cts.test.chain.AccidentareNormala;
import ro.ase.cts.test.chain.AccidentareUsoara;
import ro.ase.cts.test.chain.Cursant;
import ro.ase.cts.test.chain.HandlerAccidentare;
import ro.ase.cts.test.chain.Medic;
import ro.ase.cts.test.chain.StareAccidentare;
import ro.ase.cts.test.strategy.Challenge;
import ro.ase.cts.test.strategy.NoStrategyExercise;
import ro.ase.cts.test.strategy.StrategyFlotary;
import ro.ase.cts.test.strategy.StrategySalturi;

public class Main {

	public static void main(String[] args) {
		Challenge challenge1 = new Challenge(new NoStrategyExercise());

		challenge1.startExercitiu(1);

		challenge1.setStrategyChallenge(new StrategySalturi());
		challenge1.startExercitiu(20);
		challenge1.setStrategyChallenge(new StrategyFlotary());
		challenge1.startExercitiu(20);

		Challenge challenge2 = new Challenge(new StrategySalturi());

		challenge2.startExercitiu(1);

		challenge2.setStrategyChallenge(new NoStrategyExercise());
		challenge2.startExercitiu(20);
		challenge2.setStrategyChallenge(new StrategyFlotary());
		challenge2.startExercitiu(20);

		Set<String> exercitii = new HashSet<>();
		exercitii.add("Flotari");
		exercitii.add("Flotari");
		exercitii.add("Salturi");
		exercitii.add("Ghemuieri");

		final CursFitness curs1 = new CursFitness.CursFitnessBuilder().setAntrenor("Dorel")
				.setDificultateCurs(DificultateCurs.AVANSAT).setDuratra(150).build();
		final CursFitness curs2 = new CursFitness.CursFitnessBuilder().setPret(500).setNrMaximParticipanti(20)
				.setAntrenor("Marcel").build();
		final CursFitness curs3 = new CursFitness.CursFitnessBuilder().setExercitii(exercitii)
				.setDificultateCurs(DificultateCurs.INCEPATOR).setAntrenor("Ionel").build();
		final CursFitness curs4 = new CursFitness.CursFitnessBuilder().setAntrenor("Giani").setNrMaximParticipanti(34)
				.setPret(250).build();

		System.out.println(curs1);
		System.out.println(curs2);
		System.out.println(curs3);
		System.out.println(curs4);
		
		HandlerAccidentare accidentareUsoara=new AccidentareUsoara();
		HandlerAccidentare accidentareNormala=new AccidentareNormala();
		HandlerAccidentare accidentareGrava=new AccidentareGrava();
		
		Cursant cursant=new Cursant("Gelu", StareAccidentare.ACCIDENTAT);
		
		accidentareUsoara.setNext(accidentareNormala);
		accidentareNormala.setNext(accidentareGrava);
		
		HandlerAccidentare executareProcess=accidentareUsoara;
		executareProcess.tratareAccidentare(cursant, new Medic("Mirel"));
	
		
		

	}

}
