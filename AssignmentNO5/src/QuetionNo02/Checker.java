package QuetionNo02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Checker implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b) {
		// TODO Auto-generated method stub
		int Scorecompare =a.getScore().compareTo(b.getScore());
		int NameCompare =a.getName().compareTo(b.getName());
		return (Scorecompare ==0) ? NameCompare :Scorecompare;
	}
}
