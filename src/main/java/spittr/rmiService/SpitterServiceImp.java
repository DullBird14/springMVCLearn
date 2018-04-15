package spittr.rmiService;

public class SpitterServiceImp implements SpitterService {

	@Override
	public String tryRmi(String content) {
		return "try rmi" + content + " Successful";
	}

}
