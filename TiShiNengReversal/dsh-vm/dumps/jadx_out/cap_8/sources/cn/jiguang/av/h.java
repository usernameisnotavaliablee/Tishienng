package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h {
    private static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f694b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f695c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f696d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f697e = null;

    public static class a {
        public final byte[] a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f698b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.String f699c;

        public a(byte[] r1, java.lang.String r2, byte[] r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f699c = r2
                r0.f698b = r3
                return
        }
    }

    static {
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [77, 85} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.av.h.a = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0034: FILL_ARRAY_DATA , data: [84, 115, 100, 81} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.av.h.f694b = r0
            r0 = 9
            byte[] r0 = new byte[r0]
            r0 = {x003a: FILL_ARRAY_DATA , data: [101, 116, 83, 80, 43, 61, 32, 99, 1} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.av.h.f695c = r0
            java.lang.String r0 = cn.jiguang.av.t.f719d
            cn.jiguang.av.h.f696d = r0
            java.lang.String r0 = cn.jiguang.av.t.f720e
            cn.jiguang.av.h.f697e = r0
            return
    }

    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.security.KeyPair a() {
            java.lang.String r0 = cn.jiguang.av.h.f695c
            java.security.KeyPair r0 = a(r0)
            return r0
    }

    public static java.security.KeyPair a(java.lang.String r4) {
            r0 = 0
            java.lang.String r1 = "ECCUtils"
            if (r4 == 0) goto L3e
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto Lc
            goto L3e
        Lc:
            java.lang.String r2 = cn.jiguang.av.h.a     // Catch: java.lang.Throwable -> L24
            java.security.KeyPairGenerator r2 = java.security.KeyPairGenerator.getInstance(r2)     // Catch: java.lang.Throwable -> L24
            java.security.spec.ECGenParameterSpec r3 = new java.security.spec.ECGenParameterSpec     // Catch: java.lang.Throwable -> L24
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L24
            java.security.SecureRandom r4 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L24
            r4.<init>()     // Catch: java.lang.Throwable -> L24
            r2.initialize(r3, r4)     // Catch: java.lang.Throwable -> L24
            java.security.KeyPair r4 = r2.generateKeyPair()     // Catch: java.lang.Throwable -> L24
            return r4
        L24:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to generate ECC key pair: "
            r2.append(r3)
            java.lang.String r3 = r4.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.b(r1, r2, r4)
            return r0
        L3e:
            java.lang.String r4 = "Curve name cannot be null or empty"
            cn.jiguang.w.f.i(r1, r4)
            return r0
    }

    public static byte[] a(java.security.PrivateKey r3, java.security.PublicKey r4) {
            r0 = 0
            java.lang.String r1 = "ECCUtils"
            if (r3 == 0) goto L34
            if (r4 != 0) goto L8
            goto L34
        L8:
            java.lang.String r2 = cn.jiguang.av.h.f694b     // Catch: java.lang.Throwable -> L1a
            javax.crypto.KeyAgreement r2 = javax.crypto.KeyAgreement.getInstance(r2)     // Catch: java.lang.Throwable -> L1a
            r2.init(r3)     // Catch: java.lang.Throwable -> L1a
            r3 = 1
            r2.doPhase(r4, r3)     // Catch: java.lang.Throwable -> L1a
            byte[] r3 = r2.generateSecret()     // Catch: java.lang.Throwable -> L1a
            return r3
        L1a:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "Failed to generate shared secret: "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.b(r1, r4, r3)
            return r0
        L34:
            java.lang.String r3 = "Private key and public key cannot be null"
            cn.jiguang.w.f.i(r1, r3)
            return r0
    }

    public static java.security.PublicKey b(java.lang.String r4) {
            r0 = 0
            java.lang.String r1 = "ECCUtils"
            if (r4 == 0) goto L3b
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto Lc
            goto L3b
        Lc:
            r2 = 2
            byte[] r4 = android.util.Base64.decode(r4, r2)     // Catch: java.lang.Throwable -> L21
            java.security.spec.X509EncodedKeySpec r2 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.Throwable -> L21
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = cn.jiguang.av.h.a     // Catch: java.lang.Throwable -> L21
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4)     // Catch: java.lang.Throwable -> L21
            java.security.PublicKey r4 = r4.generatePublic(r2)     // Catch: java.lang.Throwable -> L21
            return r4
        L21:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to restore public key from Base64: "
            r2.append(r3)
            java.lang.String r3 = r4.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.b(r1, r2, r4)
            return r0
        L3b:
            java.lang.String r4 = "Public key string cannot be null or empty"
            cn.jiguang.w.f.i(r1, r4)
            return r0
    }

    public static cn.jiguang.av.h.a c(java.lang.String r5) {
            r0 = 0
            java.security.KeyPair r1 = a()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "ECCUtils"
            if (r1 != 0) goto Lf
            java.lang.String r5 = "Failed to generate temporary key pair"
            cn.jiguang.w.f.i(r2, r5)     // Catch: java.lang.Throwable -> L39
            return r0
        Lf:
            java.security.PrivateKey r3 = r1.getPrivate()     // Catch: java.lang.Throwable -> L39
            java.security.PublicKey r1 = r1.getPublic()     // Catch: java.lang.Throwable -> L39
            byte[] r1 = r1.getEncoded()     // Catch: java.lang.Throwable -> L39
            r4 = 2
            java.lang.String r4 = android.util.Base64.encodeToString(r1, r4)     // Catch: java.lang.Throwable -> L39
            java.security.PublicKey r5 = b(r5)     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L2c
            java.lang.String r5 = "Failed to restore public key from Base64"
            cn.jiguang.w.f.i(r2, r5)     // Catch: java.lang.Throwable -> L39
            return r0
        L2c:
            byte[] r5 = a(r3, r5)     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L33
            return r0
        L33:
            cn.jiguang.av.h$a r2 = new cn.jiguang.av.h$a     // Catch: java.lang.Throwable -> L39
            r2.<init>(r5, r4, r1)     // Catch: java.lang.Throwable -> L39
            return r2
        L39:
            return r0
    }
}
