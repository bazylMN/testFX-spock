package testFXSpock.spockTests

import javafx.scene.control.Labeled
import testFXSpock.TestFXSpockAppRunner

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

class SimpleTestFXSpockTest extends TestFXSpockAppRunner{

    final String LABEL_FOR_BUTTON = ".button";
    final String TEXT_LABEL_BEFORE_CLICK = "click me!";
    final String TEXT_LABEL_AFTER_CLICK = "clicked!";

    def "should_click_button_and_see_clicked_text"() {

        Labeled label = lookup(LABEL_FOR_BUTTON).query();

        expect:
        verifyThat(label, hasText(TEXT_LABEL_BEFORE_CLICK));

        when:
        clickOn(label);

        then:
        verifyThat(label, hasText(TEXT_LABEL_AFTER_CLICK));
    }

    def "should_verify_text_click_me_before_click"() {

        Labeled label = lookup(LABEL_FOR_BUTTON).query();

        expect:
        verifyThat(label, hasText(TEXT_LABEL_BEFORE_CLICK));
    }
}
