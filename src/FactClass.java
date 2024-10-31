public class FactClass {
    private double L4_SRC_PORT;
    private double L4_DST_PORT;
    private double PROTOCOL;
    private double L7_PROTO;
    private double IN_BYTES;
    private double IN_PKTS;
    private double OUT_BYTES;
    private double OUT_PKTS;
    private double TCP_FLAGS;
    private double CLIENT_TCP_FLAGS;
    private double SERVER_TCP_FLAGS;
    private double FLOW_DURATION_MILLISECONDS;
    private double DURATION_IN;
    private double DURATION_OUT;
    private double MIN_TTL;
    private double MAX_TTL;
    private double LONGEST_FLOW_PKT;
    private double SHORTEST_FLOW_PKT;
    private double MIN_IP_PKT_LEN;
    private double MAX_IP_PKT_LEN;
    private double SRC_TO_DST_SECOND_BYTES;
    private double DST_TO_SRC_SECOND_BYTES;
    private double RETRANSMITTED_IN_BYTES;
    private double RETRANSMITTED_IN_PKTS;
    private double RETRANSMITTED_OUT_BYTES;
    private double RETRANSMITTED_OUT_PKTS;
    private double SRC_TO_DST_AVG_THROUGHPUT;
    private double DST_TO_SRC_AVG_THROUGHPUT;
    private double NUM_PKTS_UP_TO_128_BYTES;
    private double NUM_PKTS_128_TO_256_BYTES;
    private double NUM_PKTS_256_TO_512_BYTES;
    private double NUM_PKTS_512_TO_1024_BYTES;
    private double NUM_PKTS_1024_TO_1514_BYTES;
    private double TCP_WIN_MAX_IN;
    private double TCP_WIN_MAX_OUT;
    private double ICMP_TYPE;
    private double ICMP_IPV4_TYPE;
    private double DNS_QUERY_ID;
    private double DNS_QUERY_TYPE;
    private double DNS_TTL_ANSWER;
    private double FTP_COMMAND_RET_CODE;

    private double classification; // Classification result
    private double expectedClassification; // Expected classification

    public double getClassification() {
        return classification;
    }

    public void setClassification(double classification) {
        this.classification = classification;
    }

    public double getExpectedClassification() {
        return expectedClassification;
    }

    public void setExpectedClassification(double expectedClassification) {
        this.expectedClassification = expectedClassification;
    }

    // Getters and setters for each field
    public double getL4_SRC_PORT() { return L4_SRC_PORT; }
    public void setL4_SRC_PORT(double L4_SRC_PORT) { this.L4_SRC_PORT = L4_SRC_PORT; }

    public double getL4_DST_PORT() { return L4_DST_PORT; }
    public void setL4_DST_PORT(double L4_DST_PORT) { this.L4_DST_PORT = L4_DST_PORT; }

    public double getPROTOCOL() { return PROTOCOL; }
    public void setPROTOCOL(double PROTOCOL) { this.PROTOCOL = PROTOCOL; }

    public double getL7_PROTO() { return L7_PROTO; }
    public void setL7_PROTO(double L7_PROTO) { this.L7_PROTO = L7_PROTO; }

    public double getIN_BYTES() { return IN_BYTES; }
    public void setIN_BYTES(double IN_BYTES) { this.IN_BYTES = IN_BYTES; }

    public double getIN_PKTS() { return IN_PKTS; }
    public void setIN_PKTS(double IN_PKTS) { this.IN_PKTS = IN_PKTS; }

    public double getOUT_BYTES() { return OUT_BYTES; }
    public void setOUT_BYTES(double OUT_BYTES) { this.OUT_BYTES = OUT_BYTES; }

    public double getOUT_PKTS() { return OUT_PKTS; }
    public void setOUT_PKTS(double OUT_PKTS) { this.OUT_PKTS = OUT_PKTS; }

    public double getTCP_FLAGS() { return TCP_FLAGS; }
    public void setTCP_FLAGS(double TCP_FLAGS) { this.TCP_FLAGS = TCP_FLAGS; }

    public double getCLIENT_TCP_FLAGS() { return CLIENT_TCP_FLAGS; }
    public void setCLIENT_TCP_FLAGS(double CLIENT_TCP_FLAGS) { this.CLIENT_TCP_FLAGS = CLIENT_TCP_FLAGS; }

    public double getSERVER_TCP_FLAGS() { return SERVER_TCP_FLAGS; }
    public void setSERVER_TCP_FLAGS(double SERVER_TCP_FLAGS) { this.SERVER_TCP_FLAGS = SERVER_TCP_FLAGS; }

    public double getFLOW_DURATION_MILLISECONDS() { return FLOW_DURATION_MILLISECONDS; }
    public void setFLOW_DURATION_MILLISECONDS(double FLOW_DURATION_MILLISECONDS) { this.FLOW_DURATION_MILLISECONDS = FLOW_DURATION_MILLISECONDS; }

    public double getDURATION_IN() { return DURATION_IN; }
    public void setDURATION_IN(double DURATION_IN) { this.DURATION_IN = DURATION_IN; }

    public double getDURATION_OUT() { return DURATION_OUT; }
    public void setDURATION_OUT(double DURATION_OUT) { this.DURATION_OUT = DURATION_OUT; }

    public double getMIN_TTL() { return MIN_TTL; }
    public void setMIN_TTL(double MIN_TTL) { this.MIN_TTL = MIN_TTL; }

    public double getMAX_TTL() { return MAX_TTL; }
    public void setMAX_TTL(double MAX_TTL) { this.MAX_TTL = MAX_TTL; }

    public double getLONGEST_FLOW_PKT() { return LONGEST_FLOW_PKT; }
    public void setLONGEST_FLOW_PKT(double LONGEST_FLOW_PKT) { this.LONGEST_FLOW_PKT = LONGEST_FLOW_PKT; }

    public double getSHORTEST_FLOW_PKT() { return SHORTEST_FLOW_PKT; }
    public void setSHORTEST_FLOW_PKT(double SHORTEST_FLOW_PKT) { this.SHORTEST_FLOW_PKT = SHORTEST_FLOW_PKT; }

    public double getMIN_IP_PKT_LEN() { return MIN_IP_PKT_LEN; }
    public void setMIN_IP_PKT_LEN(double MIN_IP_PKT_LEN) { this.MIN_IP_PKT_LEN = MIN_IP_PKT_LEN; }

    public double getMAX_IP_PKT_LEN() { return MAX_IP_PKT_LEN; }
    public void setMAX_IP_PKT_LEN(double MAX_IP_PKT_LEN) { this.MAX_IP_PKT_LEN = MAX_IP_PKT_LEN; }

    public double getSRC_TO_DST_SECOND_BYTES() { return SRC_TO_DST_SECOND_BYTES; }
    public void setSRC_TO_DST_SECOND_BYTES(double SRC_TO_DST_SECOND_BYTES) { this.SRC_TO_DST_SECOND_BYTES = SRC_TO_DST_SECOND_BYTES; }

    public double getDST_TO_SRC_SECOND_BYTES() { return DST_TO_SRC_SECOND_BYTES; }
    public void setDST_TO_SRC_SECOND_BYTES(double DST_TO_SRC_SECOND_BYTES) { this.DST_TO_SRC_SECOND_BYTES = DST_TO_SRC_SECOND_BYTES; }

    public double getRETRANSMITTED_IN_BYTES() { return RETRANSMITTED_IN_BYTES; }
    public void setRETRANSMITTED_IN_BYTES(double RETRANSMITTED_IN_BYTES) { this.RETRANSMITTED_IN_BYTES = RETRANSMITTED_IN_BYTES; }

    public double getRETRANSMITTED_IN_PKTS() { return RETRANSMITTED_IN_PKTS; }
    public void setRETRANSMITTED_IN_PKTS(double RETRANSMITTED_IN_PKTS) { this.RETRANSMITTED_IN_PKTS = RETRANSMITTED_IN_PKTS; }

    public double getRETRANSMITTED_OUT_BYTES() { return RETRANSMITTED_OUT_BYTES; }
    public void setRETRANSMITTED_OUT_BYTES(double RETRANSMITTED_OUT_BYTES) { this.RETRANSMITTED_OUT_BYTES = RETRANSMITTED_OUT_BYTES; }

    public double getRETRANSMITTED_OUT_PKTS() { return RETRANSMITTED_OUT_PKTS; }
    public void setRETRANSMITTED_OUT_PKTS(double RETRANSMITTED_OUT_PKTS) { this.RETRANSMITTED_OUT_PKTS = RETRANSMITTED_OUT_PKTS; }

    public double getSRC_TO_DST_AVG_THROUGHPUT() { return SRC_TO_DST_AVG_THROUGHPUT; }
    public void setSRC_TO_DST_AVG_THROUGHPUT(double SRC_TO_DST_AVG_THROUGHPUT) { this.SRC_TO_DST_AVG_THROUGHPUT = SRC_TO_DST_AVG_THROUGHPUT; }

    public double getDST_TO_SRC_AVG_THROUGHPUT() { return DST_TO_SRC_AVG_THROUGHPUT; }
    public void setDST_TO_SRC_AVG_THROUGHPUT(double DST_TO_SRC_AVG_THROUGHPUT) { this.DST_TO_SRC_AVG_THROUGHPUT = DST_TO_SRC_AVG_THROUGHPUT; }

    public double getNUM_PKTS_UP_TO_128_BYTES() { return NUM_PKTS_UP_TO_128_BYTES; }
    public void setNUM_PKTS_UP_TO_128_BYTES(double NUM_PKTS_UP_TO_128_BYTES) { this.NUM_PKTS_UP_TO_128_BYTES = NUM_PKTS_UP_TO_128_BYTES; }

    public double getNUM_PKTS_128_TO_256_BYTES() { return NUM_PKTS_128_TO_256_BYTES; }
    public void setNUM_PKTS_128_TO_256_BYTES(double NUM_PKTS_128_TO_256_BYTES) { this.NUM_PKTS_128_TO_256_BYTES = NUM_PKTS_128_TO_256_BYTES; }

    public double getNUM_PKTS_256_TO_512_BYTES() { return NUM_PKTS_256_TO_512_BYTES; }
    public void setNUM_PKTS_256_TO_512_BYTES(double NUM_PKTS_256_TO_512_BYTES) { this.NUM_PKTS_256_TO_512_BYTES = NUM_PKTS_256_TO_512_BYTES; }

    public double getNUM_PKTS_512_TO_1024_BYTES() { return NUM_PKTS_512_TO_1024_BYTES; }
    public void setNUM_PKTS_512_TO_1024_BYTES(double NUM_PKTS_512_TO_1024_BYTES) { this.NUM_PKTS_512_TO_1024_BYTES = NUM_PKTS_512_TO_1024_BYTES; }

    public double getNUM_PKTS_1024_TO_1514_BYTES() { return NUM_PKTS_1024_TO_1514_BYTES; }
    public void setNUM_PKTS_1024_TO_1514_BYTES(double NUM_PKTS_1024_TO_1514_BYTES) { this.NUM_PKTS_1024_TO_1514_BYTES = NUM_PKTS_1024_TO_1514_BYTES; }

    public double getTCP_WIN_MAX_IN() { return TCP_WIN_MAX_IN; }
    public void setTCP_WIN_MAX_IN(double TCP_WIN_MAX_IN) { this.TCP_WIN_MAX_IN = TCP_WIN_MAX_IN; }

    public double getTCP_WIN_MAX_OUT() { return TCP_WIN_MAX_OUT; }
    public void setTCP_WIN_MAX_OUT(double TCP_WIN_MAX_OUT) { this.TCP_WIN_MAX_OUT = TCP_WIN_MAX_OUT; }

    public double getICMP_TYPE() { return ICMP_TYPE; }
    public void setICMP_TYPE(double ICMP_TYPE) { this.ICMP_TYPE = ICMP_TYPE; }

    public double getICMP_IPV4_TYPE() { return ICMP_IPV4_TYPE; }
    public void setICMP_IPV4_TYPE(double ICMP_IPV4_TYPE) { this.ICMP_IPV4_TYPE = ICMP_IPV4_TYPE; }

    public double getDNS_QUERY_ID() { return DNS_QUERY_ID; }
    public void setDNS_QUERY_ID(double DNS_QUERY_ID) { this.DNS_QUERY_ID = DNS_QUERY_ID; }

    public double getDNS_QUERY_TYPE() { return DNS_QUERY_TYPE; }
    public void setDNS_QUERY_TYPE(double DNS_QUERY_TYPE) { this.DNS_QUERY_TYPE = DNS_QUERY_TYPE; }

    public double getDNS_TTL_ANSWER() { return DNS_TTL_ANSWER; }
    public void setDNS_TTL_ANSWER(double DNS_TTL_ANSWER) { this.DNS_TTL_ANSWER = DNS_TTL_ANSWER; }

    public double getFTP_COMMAND_RET_CODE() { return FTP_COMMAND_RET_CODE; }
    public void setFTP_COMMAND_RET_CODE(double FTP_COMMAND_RET_CODE) { this.FTP_COMMAND_RET_CODE = FTP_COMMAND_RET_CODE; }
}
