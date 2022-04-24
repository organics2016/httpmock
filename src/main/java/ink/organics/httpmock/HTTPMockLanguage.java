package ink.organics.httpmock;

import com.intellij.lang.Language;

public class HTTPMockLanguage extends Language {

    public static final HTTPMockLanguage INSTANCE = new HTTPMockLanguage();

    private HTTPMockLanguage() {
        super(HTTPMockBundle.message("httpmock.id"));
    }
}
