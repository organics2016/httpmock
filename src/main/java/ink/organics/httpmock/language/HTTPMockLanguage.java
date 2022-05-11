package ink.organics.httpmock.language;

import com.intellij.lang.Language;
import ink.organics.httpmock.HTTPMockBundle;

public class HTTPMockLanguage extends Language {

    public static final HTTPMockLanguage INSTANCE = new HTTPMockLanguage();

    private HTTPMockLanguage() {
        super(HTTPMockBundle.message("httpmock.id"));
    }
}
