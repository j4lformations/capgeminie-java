package fr.m2i.capgemini.java.exception.test;

import fr.m2i.capgemini.java.exception.PointConstructException;
import fr.m2i.capgemini.java.exception.PointTranslateException;
import fr.m2i.capgemini.java.exception.classe.Point;

public class Lanceur {

	public static void main(String[] args) {
		// System.out.println(4 / 0); // Leve une exception en Java

		// Une exception est un comportement inattendu de la JVM.

//		try {
//			Point a = new Point(5, 3);
//			System.out.println(a);
//
//			System.out.println(4/ 0);
//
//			Point b = new Point(-2.1, 3);
//			System.out.println(b);
//		} catch (Exception e) {
//			// Ici on met le code à executer en cas de pb
//			System.out.println(e);
//			//System.out.println(e.getCause().getMessage());
//		}
//		System.out.println("La suite du prog");
		
		
	
		try {
			Point a = new Point(5, .3);
			System.out.println(a);

			System.out.println(3 / 0);
			
			Point b = new Point(-2, 0);
			System.out.println(b);

			a.translater(-6, 1);
			System.out.println(a);
		}
//		catch (PointConstructException e) {
//			System.out.println(e);
//		} catch (PointTranslateException e) {
//			System.out.println(e);
//		}
		catch (PointConstructException | PointTranslateException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			// Le code ici s'execute toujours qu'il advienne
			System.out.println("Je suis dans le bloc finally");
		}
		System.out.println("Suite du code");
		
	}
}