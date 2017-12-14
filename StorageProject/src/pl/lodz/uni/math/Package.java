package pl.lodz.uni.math;

import java.sql.Date;

public class Package {
	public
	int priority, number, movesCount;
	String opis;
	Date data;

	Package (int _number,int _priority, String _opis) //Dodaæ date
	{

		this.opis=_opis;
		this.priority=_priority;
		this.number=_number;
		movesCount=0;
	}
	
	public void setMovesCount(){
		movesCount++;
	}
	
}
