package spring.mvc;

import org.junit.Test;
import org.springframework.ui.ModelMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class HelloControllerTest {
    @Test
    public void should_render_hello_page_contains_the_message_value() {
        ModelMap model = new ModelMap();
        String message = new HelloController().printWelcome(model);
        assertThat(message, is("hello"));
        assertThat(model.get("message").toString(), is("Hello,world!"));
    }
}
