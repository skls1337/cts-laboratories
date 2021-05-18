package ro.ase.cts.test.builder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CursFitness {
	private String numeAntrenor;
	private int durata;
	private DificultateCurs dificultateCurs;
	private int nrMaximParticipanti;
	private double pret;
	private Set<String> exercitii = new HashSet<>(4);

	private CursFitness() {

	}

	
	
	@Override
	public String toString() {
		return "CursFitness [numeAntrenor=" + numeAntrenor + ", durata=" + durata + ", dificultateCurs="
				+ dificultateCurs + ", nrMaximParticipanti=" + nrMaximParticipanti + ", pret=" + pret + ", exercitii="
				+ exercitii + "]";
	}



	public static class CursFitnessBuilder {
		CursFitness cursFitness = null;

		public CursFitnessBuilder() {
			cursFitness = new CursFitness();

		}

		public CursFitnessBuilder setAntrenor(String numeAntrenor) {
			cursFitness.numeAntrenor = numeAntrenor;
			return this;
		}
		
		public CursFitnessBuilder setDuratra(int durata) {
			cursFitness.durata = durata;
			return this;
		}

		public CursFitnessBuilder setDificultateCurs(DificultateCurs dificultateCurs) {
			cursFitness.dificultateCurs = dificultateCurs;
			return this;
		}
		
		public CursFitnessBuilder setNrMaximParticipanti(int nrMaximParticipanti) {
			cursFitness.nrMaximParticipanti = nrMaximParticipanti;
			return this;
		}
		
		public CursFitnessBuilder setPret(double pret) {
			cursFitness.pret = pret;
			return this;
		}
		
		public CursFitnessBuilder setExercitii(Set<String> exercitii) {
			cursFitness.exercitii = exercitii;
			return this;
		}
		
		public CursFitness build() {
			return this.cursFitness;
		}

	}

}
