package testFXSpock

import javaFXSimpleApp.Main
import javafx.stage.Stage
import org.testfx.api.FxToolkit;
import org.testfx.framework.spock.ApplicationSpec
import org.testfx.util.WaitForAsyncUtils

class TestFXSpockAppRunner extends ApplicationSpec {

    def setup() {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(Main.class);
        FxToolkit.showStage();
        WaitForAsyncUtils.waitForFxEvents(100);
    }

    @Override
    void start(Stage stage) throws Exception {
        stage.toFront();
    }

    def stopApp() {
        FxToolkit.cleanupStages();
    }
}
