package f2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static javax.xml.parsers.SAXParserFactory a() throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException, java.lang.NullPointerException {
            javax.xml.parsers.SAXParserFactory r0 = javax.xml.parsers.SAXParserFactory.newInstance()
            java.lang.String r1 = "http://xml.org/sax/features/namespaces"
            r2 = 1
            r0.setFeature(r1, r2)
            java.lang.String r1 = "http://xml.org/sax/features/namespace-prefixes"
            r3 = 0
            r0.setFeature(r1, r3)
            java.lang.String r1 = "http://xml.org/sax/features/validation"
            r0.setFeature(r1, r3)
            java.lang.String r1 = "http://xml.org/sax/features/external-general-entities"
            r0.setFeature(r1, r3)
            java.lang.String r1 = "http://xml.org/sax/features/external-parameter-entities"
            r0.setFeature(r1, r3)
            java.lang.String r1 = "http://xml.org/sax/features/string-interning"
            r0.setFeature(r1, r2)
            return r0
    }
}
