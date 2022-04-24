package ink.organics.httpmock;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import ink.organics.httpmock.icons.HTTPMockIcons;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class HTTPMockFileType extends LanguageFileType {

    public static final HTTPMockFileType INSTANCE = new HTTPMockFileType();

    private HTTPMockFileType() {
        super(HTTPMockLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return HTTPMockBundle.message("httpmock.name");
    }

    @NotNull
    @Override
    public String getDescription() {
        return HTTPMockBundle.message("httpmock.description");
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "http";
    }

    @NotNull
    @Override
    public Icon getIcon() {
        return HTTPMockIcons.HTTP_REQUESTS_FILETYPE;
    }
}