package sailpoint;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import sailpoint.server.IdnRuleUtil;
import sailpoint.rdk.Utils.RuleXmlUtils;
import sailpoint.tools.Util;
import java.io.File;
import jave.util.*;
import sailpoint.tools.GeneralException;




public class SAmAccountNameTest {


    Logger log = LogManager.getLogger(SAmAccountNameTest.class);

    private static final String RULE_FILENAME = "src/main/resources/rules/Rule - AttributeGenerator - sAmAccountName.xml";

    public void testGenerateSamAccountName() throws GeneralException{


        Interpreter i = new Interpreter();
        i.set("firstName", "Veera");
        i.set("lastName", "Bhamidipati");
        i.set("log", log);

        String result = "";

        String source = RuleXmlUtils.readRuleSourceFromFilePath(RULE_FILENAME);
        result = (String) i.eval(source);

        log.info("returning bean shell");
        log.info("result = " + result);

    }



}