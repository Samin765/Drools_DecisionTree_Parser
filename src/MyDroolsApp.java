import org.kie.api.KieServices;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MyDroolsApp {

    public static void main(String[] args) {
        try {
            System.out.println("Starting Drools rules.");

            // Initialize KieServices and create a KieFileSystem to add the .drl file directly
            KieServices ks = KieServices.Factory.get();
            KieFileSystem kfs = ks.newKieFileSystem();
            kfs.write(ResourceFactory.newFileResource("./drools_rules_complicated.drl"));

            // Build all and get the KieModule
            KieBuilder kb = ks.newKieBuilder(kfs);
            kb.buildAll();
            KieModule km = kb.getKieModule();

            // Create KieContainer from KieModule
            KieContainer kContainer = ks.newKieContainer(km.getReleaseId());
            KieSession kSession = kContainer.newKieSession();

            // Load data and test accuracy
            List<FactClass> facts = loadData("./X_drools.csv");
            //List<FactClass> facts = loadData("./X_drools_test.csv");
            int correctPredictions = 0;
            int totalProcessed = 0;

            for (FactClass fact : facts) {
                // Insert fact into Drools session and fire rules
                kSession.insert(fact);
                kSession.fireAllRules();

                // Compare the predicted classification with the actual label
                //System.out.println("Expected Classification: " + fact.getExpectedClassification()); // Ensure expected classification is not null
                //System.out.println("Classification: " + fact.getClassification()); // Ensure classification is not null
                if (fact.getClassification() == fact.getExpectedClassification()) {
                    correctPredictions++;
                    //System.out.println(correctPredictions);
                }

                totalProcessed++;

                 // Print accuracy every 5000 examples
                if (totalProcessed % 5000 == 0) {
                    double accuracy = (double) correctPredictions / totalProcessed * 100;
                    System.out.println("Processed: " + totalProcessed + " examples");
                    System.out.println("Accuracy so far: " + accuracy + "%");
                }

                kSession.delete(kSession.getFactHandle(fact));  // Clear fact after processing
            }

            kSession.dispose();

            // Calculate and print accuracy
            double accuracy = (double) correctPredictions / facts.size() * 100;
            System.out.println("Final Accuracy: " + accuracy + "%");
            System.out.println("Drools rules executed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<FactClass> loadData(String filePath) {
        List<FactClass> facts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            line = br.readLine();  
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");

                // Map CSV data to FactClass attributes
                FactClass fact = new FactClass();
                fact.setL4_SRC_PORT(Integer.parseInt(fields[0]));
                fact.setL4_DST_PORT(Integer.parseInt(fields[1]));
                fact.setPROTOCOL(Double.parseDouble(fields[2]));
                fact.setL7_PROTO(Double.parseDouble(fields[3]));
                fact.setIN_BYTES(Integer.parseInt(fields[4]));
                fact.setIN_PKTS(Double.parseDouble(fields[5]));
                fact.setOUT_BYTES(Integer.parseInt(fields[6]));
                fact.setOUT_PKTS(Double.parseDouble(fields[7]));
                fact.setTCP_FLAGS(Double.parseDouble(fields[8]));
                fact.setCLIENT_TCP_FLAGS(Double.parseDouble(fields[9]));
                fact.setSERVER_TCP_FLAGS(Double.parseDouble(fields[10]));
                fact.setFLOW_DURATION_MILLISECONDS(Integer.parseInt(fields[11]));
                fact.setDURATION_IN(Double.parseDouble(fields[12]));
                fact.setDURATION_OUT(Double.parseDouble(fields[13]));
                fact.setMIN_TTL(Double.parseDouble(fields[14]));
                fact.setMAX_TTL(Double.parseDouble(fields[15]));
                fact.setLONGEST_FLOW_PKT(Double.parseDouble(fields[16]));
                fact.setSHORTEST_FLOW_PKT(Double.parseDouble(fields[17]));
                fact.setMIN_IP_PKT_LEN(Double.parseDouble(fields[18]));
                fact.setMAX_IP_PKT_LEN(Double.parseDouble(fields[19]));
                fact.setSRC_TO_DST_SECOND_BYTES(Double.parseDouble(fields[20]));
                fact.setDST_TO_SRC_SECOND_BYTES(Double.parseDouble(fields[21]));
                fact.setRETRANSMITTED_IN_BYTES(Integer.parseInt(fields[22]));
                fact.setRETRANSMITTED_IN_PKTS(Double.parseDouble(fields[23]));
                fact.setRETRANSMITTED_OUT_BYTES(Integer.parseInt(fields[24]));
                fact.setRETRANSMITTED_OUT_PKTS(Double.parseDouble(fields[25]));
                fact.setSRC_TO_DST_AVG_THROUGHPUT(Double.parseDouble(fields[26]));
                fact.setDST_TO_SRC_AVG_THROUGHPUT(Double.parseDouble(fields[27]));
                fact.setNUM_PKTS_UP_TO_128_BYTES(Double.parseDouble(fields[28]));
                fact.setNUM_PKTS_128_TO_256_BYTES(Double.parseDouble(fields[29]));
                fact.setNUM_PKTS_256_TO_512_BYTES(Double.parseDouble(fields[30]));
                fact.setNUM_PKTS_512_TO_1024_BYTES(Double.parseDouble(fields[31]));
                fact.setNUM_PKTS_1024_TO_1514_BYTES(Double.parseDouble(fields[32]));
                fact.setTCP_WIN_MAX_IN(Integer.parseInt(fields[33]));
                fact.setTCP_WIN_MAX_OUT(Integer.parseInt(fields[34]));
                fact.setICMP_TYPE(Integer.parseInt(fields[35]));
                fact.setICMP_IPV4_TYPE(Double.parseDouble(fields[36]));
                fact.setDNS_QUERY_ID(Integer.parseInt(fields[37]));
                fact.setDNS_QUERY_TYPE(Integer.parseInt(fields[38]));
                fact.setDNS_TTL_ANSWER(Double.parseDouble(fields[39]));
                fact.setFTP_COMMAND_RET_CODE(Double.parseDouble(fields[40]));

                // Expected label is assumed to be the last field
                fact.setExpectedClassification(Integer.parseInt(fields[fields.length - 1]));

                facts.add(fact);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return facts;
    }
}