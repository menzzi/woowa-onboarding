package lotto;

import lotto.controller.LottoGame;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        LottoGame lottoGame = new LottoGame(inputView,outputView);
        lottoGame.run();
    }
}
