package lotto.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LottoGameTest {

    @Test
    public void create() {
        LottoGame game = new LottoGame(14000);
        assertThat(game).isEqualTo(new LottoGame(14000));
    }

    @Test
    public void buyHowMany() {
        LottoGame game = new LottoGame(14001);
        assertThat(game.possibleNumberBuy()).isEqualTo(14);
    }
}
