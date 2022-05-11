package ink.organics.httpmock.language;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class HTTPMockPsiFile extends PsiFileBase {

    public HTTPMockPsiFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, HTTPMockLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return HTTPMockFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + this.getName();
    }
}
