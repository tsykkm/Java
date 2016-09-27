package Janken;

public class RandomHandTacticsImpl implements InterfaceTactics{

	public RandomHandTacticsImpl(){
		// コンストラクタ
	}

	/* (非 Javadoc)
	 * @see Janken.InterfaceTactics#readTactics()
	 * 戦略を読みジャンケンの手を得る
	 */
	public String readTactics(){
		double hand = Math.random() * 3;
		String janHand = null;

		if(hand  < 1){
			janHand = PlayerBase.GU;
		}else if(hand  < 2){
			janHand = PlayerBase.CHOKI;
		}else if(hand  < 3){
			janHand = PlayerBase.PA;
		}

		return janHand;
	}
}
