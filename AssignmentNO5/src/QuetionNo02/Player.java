package QuetionNo02;

import java.util.ArrayList;


public class Player {
int Score ;
String Name ;
public Player(int score, String name) {
	super();
	this.Score = score;
	this.Name = name;
}

public Integer getScore() {
	return Score;
}
public void setScore(Integer score) {
	Score = score;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}

@Override
public String toString() {
	return "Player [Score=" + Score + ", Name=" + Name + "]";
}

}
