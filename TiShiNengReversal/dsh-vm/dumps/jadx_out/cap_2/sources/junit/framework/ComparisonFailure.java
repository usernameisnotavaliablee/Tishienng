package junit.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class ComparisonFailure extends junit.framework.AssertionFailedError {
    private static final int MAX_CONTEXT_LENGTH = 20;
    private static final long serialVersionUID = 1;
    private java.lang.String fActual;
    private java.lang.String fExpected;

    public ComparisonFailure(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.fExpected = r2
            r0.fActual = r3
            return
    }

    public java.lang.String getActual() {
            r1 = this;
            java.lang.String r0 = r1.fActual
            return r0
    }

    public java.lang.String getExpected() {
            r1 = this;
            java.lang.String r0 = r1.fExpected
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r4 = this;
            junit.framework.b r0 = new junit.framework.b
            java.lang.String r1 = r4.fExpected
            java.lang.String r2 = r4.fActual
            r3 = 20
            r0.<init>(r3, r1, r2)
            java.lang.String r1 = super.getMessage()
            java.lang.String r0 = r0.b(r1)
            return r0
    }
}
