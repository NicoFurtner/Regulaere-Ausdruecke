public class TestKlasse {
    public static void main(String[] args) {
        Regex regex = new Regex();
        String[] testfaelle = {
                "www.ibm.com",
                "www.java.sun.com",
                "www.zend.com",
                "java.sun.com",
                "www.php.net",
                "www.IBM.com",
                "www.ris.bka.gv.at",
                "www.Web addresses can't have spaces.com",
                "www..com",
                "192.168.1.0",
                "192.168.1.256",
                "256.1.1.1",
                "172.435.123.123",
                "192.192.258.192"
        };
        regex.addStrings(testfaelle);
        int zaehler = 1;
        for (int i = 0; i < regex.getStrings().size(); i++) {
            System.out.println("Testfall Nr. " + zaehler + ": " + regex.getString(i) + ": " + regex.match(i));
            zaehler++;
        }
    }
}
