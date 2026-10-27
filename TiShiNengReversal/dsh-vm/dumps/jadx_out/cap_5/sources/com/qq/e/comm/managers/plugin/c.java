package com.qq.e.comm.managers.plugin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class c {
    private static final byte[] c = null;
    private java.security.PublicKey a;
    private final boolean b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b {
        public static final com.qq.e.comm.managers.plugin.c a = null;

        static {
                com.qq.e.comm.managers.plugin.c r0 = new com.qq.e.comm.managers.plugin.c
                r1 = 0
                r0.<init>(r1)
                com.qq.e.comm.managers.plugin.c.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            r0 = 20
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [82, 83, 65, 47, 69, 67, 66, 47, 80, 75, 67, 83, 49, 80, 97, 100, 100, 105, 110, 103} // fill-array
            com.qq.e.comm.managers.plugin.c.c = r0
            return
    }

    private c() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDKta2b5Vw5YkWHCAj4rJCwS227\r/35FZ29e4I6pS2B8zSq2RgBpXUuMg7oZF1Qt3x0iyg8PeyblyNeCRB6gIMehFThe\r1Y7m1FaQyaZp+CJYOTLM4/THKp9UndrEgJ/5a83vP1375YCV2lMvWARrNlBep4RN\rnESUJhQz58Gr/F39TwIDAQAB"
            java.security.PublicKey r0 = r1.b(r0)     // Catch: java.lang.Throwable -> Ld
            r1.a = r0     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.b = r0
            return
    }

    /* synthetic */ c(com.qq.e.comm.managers.plugin.c.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.qq.e.comm.managers.plugin.c a() {
            com.qq.e.comm.managers.plugin.c r0 = com.qq.e.comm.managers.plugin.c.b.a
            return r0
    }

    private java.lang.String a(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "UTF-8"
            java.security.PublicKey r1 = r4.a
            if (r1 == 0) goto L2a
            r1 = 0
            byte[] r5 = android.util.Base64.decode(r5, r1)
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L2a
            byte[] r2 = com.qq.e.comm.managers.plugin.c.c     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L2a
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L2a
            java.security.PublicKey r2 = r4.a     // Catch: java.lang.Throwable -> L2a
            r3 = 2
            r1.init(r3, r2)     // Catch: java.lang.Throwable -> L2a
            byte[] r5 = r1.doFinal(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r1.trim()     // Catch: java.lang.Throwable -> L2a
            return r5
        L2a:
            r5 = 0
            return r5
    }

    private java.security.PublicKey b(java.lang.String r3) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            byte[] r3 = android.util.Base64.decode(r3, r0)     // Catch: java.lang.NullPointerException -> L15 java.security.spec.InvalidKeySpecException -> L1d java.security.NoSuchAlgorithmException -> L25
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch: java.lang.NullPointerException -> L15 java.security.spec.InvalidKeySpecException -> L1d java.security.NoSuchAlgorithmException -> L25
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.NullPointerException -> L15 java.security.spec.InvalidKeySpecException -> L1d java.security.NoSuchAlgorithmException -> L25
            r1.<init>(r3)     // Catch: java.lang.NullPointerException -> L15 java.security.spec.InvalidKeySpecException -> L1d java.security.NoSuchAlgorithmException -> L25
            java.security.PublicKey r3 = r0.generatePublic(r1)     // Catch: java.lang.NullPointerException -> L15 java.security.spec.InvalidKeySpecException -> L1d java.security.NoSuchAlgorithmException -> L25
            return r3
        L15:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r0 = "公钥数据为空"
            r3.<init>(r0)
            throw r3
        L1d:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r0 = "公钥非法"
            r3.<init>(r0)
            throw r3
        L25:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r0 = "无此算法"
            r3.<init>(r0)
            throw r3
    }

    public boolean a(java.lang.String r2, java.io.File r3) {
            r1 = this;
            if (r3 == 0) goto L12
            boolean r0 = r3.exists()
            if (r0 != 0) goto L9
            goto L12
        L9:
            java.lang.String r3 = com.qq.e.comm.managers.plugin.d.a(r3)
            boolean r2 = r1.a(r2, r3)
            return r2
        L12:
            r2 = 0
            return r2
    }

    public boolean a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r0 = r1.b
            if (r0 != 0) goto Le
            r2 = 1
            return r2
        Le:
            java.lang.String r2 = r1.a(r2)
            boolean r2 = r3.equals(r2)
            return r2
    }
}
