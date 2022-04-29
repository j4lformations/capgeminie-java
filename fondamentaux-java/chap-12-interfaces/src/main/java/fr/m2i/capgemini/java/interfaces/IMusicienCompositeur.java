package fr.m2i.capgemini.java.interfaces;

public interface IMusicienCompositeur extends IMusicien, ICompositeur {

	default void getAgeLegal() {
		System.out.println("J'ai 45 ans");
	};
}