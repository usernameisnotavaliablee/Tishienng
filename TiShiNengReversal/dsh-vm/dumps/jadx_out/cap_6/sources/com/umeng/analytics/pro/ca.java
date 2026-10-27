package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ca {
    private final java.io.ByteArrayOutputStream a;
    private final com.umeng.analytics.pro.dc b;
    private com.umeng.analytics.pro.cq c;

    public ca() {
            r1 = this;
            com.umeng.analytics.pro.ck$a r0 = new com.umeng.analytics.pro.ck$a
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public ca(com.umeng.analytics.pro.cs r3) {
            r2 = this;
            r2.<init>()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r2.a = r0
            com.umeng.analytics.pro.dc r1 = new com.umeng.analytics.pro.dc
            r1.<init>(r0)
            r2.b = r1
            com.umeng.analytics.pro.cq r3 = r3.a(r1)
            r2.c = r3
            return
    }

    public java.lang.String a(com.umeng.analytics.pro.br r3, java.lang.String r4) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> La
            byte[] r3 = r2.a(r3)     // Catch: java.io.UnsupportedEncodingException -> La
            r0.<init>(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> La
            return r0
        La:
            com.umeng.analytics.pro.bx r3 = new com.umeng.analytics.pro.bx
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JVM DOES NOT SUPPORT ENCODING: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public byte[] a(com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            java.io.ByteArrayOutputStream r0 = r1.a
            r0.reset()
            com.umeng.analytics.pro.cq r0 = r1.c
            r2.write(r0)
            java.io.ByteArrayOutputStream r2 = r1.a
            byte[] r2 = r2.toByteArray()
            return r2
    }

    public java.lang.String b(com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r2 = r1.a(r2)
            r0.<init>(r2)
            return r0
    }
}
