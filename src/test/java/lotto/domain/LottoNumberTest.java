package lotto.domain;

import lotto.exception.NumberRangeException;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LottoNumberTest {

    @Test
    public void create() {
        LottoNumber number1 = LottoNumber.of(7);
        LottoNumber number2 = LottoNumber.of(7);
        assertThat(number1 == number2).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {46, 47})
    public void validateNumberRangeUpper(int number) {
        assertThatThrownBy(() -> {
            LottoNumber.of(number);
        }).isInstanceOf(NumberRangeException.class);
    }

    @Test
    public void validateNumberRangeLower() {
        assertThatThrownBy(() -> {
            LottoNumber.of(0);
        }).isInstanceOf(NumberRangeException.class);
    }

    @Test
    public void intToString() {
        LottoNumber lottoNumber = LottoNumber.of(7);
        assertThat(lottoNumber.getNumberToString()).isEqualTo("7");
    }
}
