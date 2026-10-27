package javax.mail.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class SearchTerm implements java.io.Serializable {
    private static final long serialVersionUID = -6652358452205992789L;

    public SearchTerm() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean match(javax.mail.Message r1);
}
