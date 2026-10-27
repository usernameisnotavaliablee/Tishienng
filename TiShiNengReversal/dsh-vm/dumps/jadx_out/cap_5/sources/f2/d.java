package f2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.xmlpull.v1.XmlPullParserFactory a() throws org.xmlpull.v1.XmlPullParserException {
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r2 = 1
            r0.setFeature(r1, r2)
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes"
            r2 = 0
            r0.setFeature(r1, r2)
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-docdecl"
            r0.setFeature(r1, r2)
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#validation"
            r0.setFeature(r1, r2)
            return r0
    }
}
