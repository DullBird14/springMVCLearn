package spittr.data;

import spittr.entity.Spitter;


public class SpitterRepositoryImp implements SpitterRepository{

	@Override
	public void save(Spitter spitter) {
		System.out.println(spitter.toString() + "::saved");
	}
	
	
}
