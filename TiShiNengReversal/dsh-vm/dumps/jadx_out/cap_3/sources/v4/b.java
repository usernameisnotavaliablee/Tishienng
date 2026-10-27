package v4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.io.InputStream r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static void b(java.io.OutputStream r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static byte[] c(java.io.InputStream r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L1d
            r0.<init>()     // Catch: java.io.IOException -> L1d
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L1d
        L9:
            int r2 = r4.read(r1)     // Catch: java.io.IOException -> L1d
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.io.IOException -> L1d
            goto L9
        L15:
            r4.close()     // Catch: java.io.IOException -> L1d
            byte[] r4 = r0.toByteArray()     // Catch: java.io.IOException -> L1d
            return r4
        L1d:
            r4 = 0
            return r4
    }

    public static java.lang.String d(java.io.InputStream r1) {
            byte[] r1 = c(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }
}
