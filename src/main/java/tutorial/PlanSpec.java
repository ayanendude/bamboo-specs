package tutorial;

import com.atlassian.bamboo.specs.api.BambooSpec;
import com.atlassian.bamboo.specs.api.builders.project.Project;
import com.atlassian.bamboo.specs.util.BambooServer;
import com.atlassian.bamboo.specs.util.SimpleUserPasswordCredentials;
import com.atlassian.bamboo.specs.util.UserPasswordCredentials;
import com.microsoft.azure.keyvault.KeyVaultClient;

@BambooSpec
public class PlanSpec {

    public static final String PROJECT_KEY="TEST";

    /**
     * Run main to publish plan on Bamboo
     */
    public static void main(final String[] args) throws Exception {

        BambooServer bambooServer = new BambooServer("http://localhost:8085");

        new TESThello(bambooServer, keyvaultClient);

    }

    public static Project project() {
        return new Project()
            .name("TEST-1")
            .key("TEST");
    }
}