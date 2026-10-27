package z4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a extends org.apache.commons.net.g {
    public static final int v = 13;
    private final char[] u;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 64
            char[] r0 = new char[r0]
            r1.u = r0
            r0 = 13
            r1.N(r0)
            return
    }

    public java.lang.String Z() throws java.io.IOException {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            char[] r1 = r5.u
            int r1 = r1.length
            r0.<init>(r1)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.InputStream r3 = r5.h
            java.nio.charset.Charset r4 = r5.q()
            r2.<init>(r3, r4)
            r1.<init>(r2)
        L18:
            char[] r2 = r5.u
            int r3 = r2.length
            r4 = 0
            int r2 = r1.read(r2, r4, r3)
            if (r2 > 0) goto L27
            java.lang.String r0 = r0.toString()
            return r0
        L27:
            char[] r3 = r5.u
            r0.append(r3, r4, r2)
            goto L18
    }
}
