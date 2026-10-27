package b5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends org.apache.commons.net.g {
    public static final int v = 79;
    private static final java.lang.String w = "/W ";
    private transient char[] u;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 1024(0x400, float:1.435E-42)
            char[] r0 = new char[r0]
            r1.u = r0
            r0 = 79
            r1.N(r0)
            return
    }

    public java.io.InputStream Z(boolean r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = ""
            java.io.InputStream r2 = r1.a0(r2, r0)
            return r2
    }

    public java.io.InputStream a0(boolean r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.InputStream r2 = r1.b0(r2, r3, r0)
            return r2
    }

    public java.io.InputStream b0(boolean r3, java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            if (r3 == 0) goto Le
            java.lang.String r3 = "/W "
            r0.append(r3)
        Le:
            r0.append(r4)
            java.lang.String r3 = "\r\n"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.nio.charset.Charset r4 = org.apache.commons.net.util.b.a(r5)
            java.lang.String r4 = r4.name()
            byte[] r3 = r3.getBytes(r4)
            java.io.DataOutputStream r4 = new java.io.DataOutputStream
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream
            java.io.OutputStream r0 = r2.i
            r1 = 1024(0x400, float:1.435E-42)
            r5.<init>(r0, r1)
            r4.<init>(r5)
            r5 = 0
            int r0 = r3.length
            r4.write(r3, r5, r0)
            r4.flush()
            java.io.InputStream r3 = r2.h
            return r3
    }

    public java.lang.String query(boolean r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r2 = r1.query(r2, r0)
            return r2
    }

    public java.lang.String query(boolean r4, java.lang.String r5) throws java.io.IOException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            char[] r1 = r3.u
            int r1 = r1.length
            r0.<init>(r1)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.InputStream r4 = r3.a0(r4, r5)
            java.nio.charset.Charset r5 = r3.q()
            r2.<init>(r4, r5)
            r1.<init>(r2)
        L1a:
            char[] r4 = r3.u     // Catch: java.lang.Throwable -> L32
            int r5 = r4.length     // Catch: java.lang.Throwable -> L32
            r2 = 0
            int r4 = r1.read(r4, r2, r5)     // Catch: java.lang.Throwable -> L32
            if (r4 > 0) goto L2c
            r1.close()
            java.lang.String r4 = r0.toString()
            return r4
        L2c:
            char[] r5 = r3.u     // Catch: java.lang.Throwable -> L32
            r0.append(r5, r2, r4)     // Catch: java.lang.Throwable -> L32
            goto L1a
        L32:
            r4 = move-exception
            r1.close()
            throw r4
    }
}
