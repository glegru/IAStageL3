import structs.Key;

public class AttackState extends State {
	/**
	 * Constructor
	 * @param client, aka our IA
	 */
	public AttackState(IAstageState client) {
		super(client);
	}
	
	/**
	 * Overriding State.doYourStuff.
	 * This method does the character to do an attack randomly chosen.
	 */
	@Override
	public void doYourStuff() {
		Key inputKey = new Key();
		
		inputKey.U = false;
		inputKey.D = false;
		inputKey.R = false;
		inputKey.L = false;
		
		
		inputKey.A = (rand.nextInt(10) > 4) ? true : false;
		inputKey.B = (rand.nextInt(10) > 4) ? true : false;
		inputKey.C = (rand.nextInt(10) > 4) ? true : false;
		
		client_.setInputKey(inputKey);
		
		//The probability has not been already chosen.
		nextState(25, 25, 25);	
	}
}
