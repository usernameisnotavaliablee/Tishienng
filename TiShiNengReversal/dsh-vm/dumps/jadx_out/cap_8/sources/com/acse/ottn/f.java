package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    public static final java.lang.String a = "AES/ECB/PKCS5Padding";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f2310b = "VbZFjAoPF6LCCQm6RgDs1g13mnJ8nAAA";

    /* renamed from: c, reason: collision with root package name */
    public static com.acse.ottn.f f2311c;

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(byte[] r2) {
            java.lang.String r0 = new java.lang.String
            r1 = 0
            byte[] r2 = android.util.Base64.encode(r2, r1)
            r0.<init>(r2)
            return r0
    }

    public static java.lang.String a(byte[] r2, int r3) {
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 1
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.toString(r3)
            return r2
    }

    public static java.lang.String a(byte[] r3, java.lang.String r4) throws java.lang.Exception {
            java.lang.String r0 = "AES"
            javax.crypto.KeyGenerator r1 = javax.crypto.KeyGenerator.getInstance(r0)
            r2 = 128(0x80, float:1.8E-43)
            r1.init(r2)
            java.lang.String r1 = "AES/ECB/PKCS5Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            byte[] r4 = r4.getBytes()
            r2.<init>(r4, r0)
            r4 = 2
            r1.init(r4, r2)
            byte[] r3 = r1.doFinal(r3)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            return r4
    }

    public static com.acse.ottn.f b() {
            com.acse.ottn.f r0 = com.acse.ottn.f.f2311c
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.f> r0 = com.acse.ottn.f.class
            monitor-enter(r0)
            com.acse.ottn.f r1 = com.acse.ottn.f.f2311c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.f r1 = new com.acse.ottn.f     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.f.f2311c = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.f r0 = com.acse.ottn.f.f2311c
            return r0
    }

    public static byte[] b(java.lang.String r1) throws java.lang.Exception {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    public static byte[] c(java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            java.lang.String r0 = "AES"
            javax.crypto.KeyGenerator r1 = javax.crypto.KeyGenerator.getInstance(r0)
            r2 = 128(0x80, float:1.8E-43)
            r1.init(r2)
            java.lang.String r1 = "AES/ECB/PKCS5Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            byte[] r4 = r4.getBytes()
            r2.<init>(r4, r0)
            r4 = 1
            r1.init(r4, r2)
            java.lang.String r4 = "utf-8"
            byte[] r3 = r3.getBytes(r4)
            byte[] r3 = r1.doFinal(r3)
            return r3
    }

    public java.lang.String a() {
            r2 = this;
            java.lang.String r0 = "HjXtKBoW7DcEoK3ea3il4OtHgf+gL9OSK5ocDH6/z6U="
            byte[] r0 = b(r0)     // Catch: java.lang.Exception -> Ld
            java.lang.String r1 = "VbZFjAoPF6LCCQm6RgDs1g13mnJ8nAAA"
            java.lang.String r0 = a(r0, r1)     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public java.lang.String a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "VbZFjAoPF6LCCQm6RgDs1g13mnJ8nAAA"
            java.lang.String r2 = r1.b(r2, r0)     // Catch: java.lang.Exception -> L7
            return r2
        L7:
            java.lang.String r2 = ""
            return r2
    }

    public java.lang.String a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L18
            r1.<init>(r3)     // Catch: java.lang.Exception -> L18
            org.json.JSONObject r3 = r1.getJSONObject(r0)     // Catch: java.lang.Exception -> L18
            java.lang.String r3 = r3.getString(r0)     // Catch: java.lang.Exception -> L18
            byte[] r3 = b(r3)     // Catch: java.lang.Exception -> L18
            java.lang.String r3 = a(r3, r4)     // Catch: java.lang.Exception -> L18
            return r3
        L18:
            java.lang.String r3 = ""
            return r3
    }

    public java.lang.String a(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = "VbZFjAoPF6LCCQm6RgDs1g13mnJ8nAAA"
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L9
            return r2
        L9:
            java.lang.String r2 = r1.a(r2, r3)     // Catch: java.lang.Exception -> Le
            return r2
        Le:
            java.lang.String r2 = ""
            return r2
    }

    public java.lang.String b(java.lang.String r1, java.lang.String r2) throws java.lang.Exception {
            r0 = this;
            byte[] r1 = c(r1, r2)
            java.lang.String r1 = a(r1)
            return r1
    }

    public final java.lang.Object c() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.f r0 = com.acse.ottn.f.f2311c
            return r0
    }
}
