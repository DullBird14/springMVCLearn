package spittr.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import spittr.Spittle;

public class SpittleRepositoryImp implements SpittleRepository {

	
	@Override
	public List<Spittle> findSpittles(long max, int count) {
		return createSpittles(count);
	}
	
	private List<Spittle> createSpittles(int count){
		ArrayList<Spittle> spittleList = new ArrayList<Spittle>();
		for(int i = 0 ; i<count ; i++){
			spittleList.add(new Spittle("spittle" + i, new Date()));
		}
		return spittleList;
	}
	
	
}
