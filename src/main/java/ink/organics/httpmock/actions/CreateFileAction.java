package ink.organics.httpmock.actions;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.psi.PsiDirectory;
import com.intellij.xml.XmlBundle;
import ink.organics.httpmock.HTTPMockBundle;
import ink.organics.httpmock.HTTPMockFileType;
import ink.organics.httpmock.icons.HTTPMockIcons;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;


public class CreateFileAction extends CreateFileFromTemplateAction {


    public CreateFileAction() {
        super(HTTPMockBundle.message("httpmock.action.new.file.name"),
                HTTPMockBundle.message("httpmock.action.new.file.description"),
                HTTPMockIcons.HTTP_REQUESTS_FILETYPE);
    }


    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory directory, CreateFileFromTemplateDialog.@NotNull Builder builder) {
        HTTPMockFileType fileType = HTTPMockFileType.INSTANCE;
        builder.setTitle(HTTPMockBundle.message("httpmock.action.new.file.dialog.title"))
                .addKind(fileType.getName(),
                        HTTPMockIcons.HTTP_REQUESTS_FILETYPE,
                        fileType.getName() + "." + fileType.getDefaultExtension());
    }

    @Override
    protected @NlsContexts.Command String getActionName(PsiDirectory directory, @NonNls @NotNull String newName, @NonNls String templateName) {
        return HTTPMockBundle.message("httpmock.action.new.file.name");
    }
}
