import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest request) {

        Label label = new Label("Pozdro 600");
        setContent(new VerticalLayout(label));

    }
}
