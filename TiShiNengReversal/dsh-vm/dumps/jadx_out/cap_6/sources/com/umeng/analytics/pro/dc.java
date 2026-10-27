package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class dc extends com.umeng.analytics.pro.de {
    protected java.io.InputStream a;
    protected java.io.OutputStream b;

    protected dc() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            return
    }

    public dc(java.io.InputStream r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.a = r2
            return
    }

    public dc(java.io.InputStream r1, java.io.OutputStream r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public dc(java.io.OutputStream r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r2
            return
    }

    @Override // com.umeng.analytics.pro.de
    public int a(byte[] r2, int r3, int r4) throws com.umeng.analytics.pro.df {
            r1 = this;
            java.io.InputStream r0 = r1.a
            if (r0 == 0) goto L1a
            int r2 = r0.read(r2, r3, r4)     // Catch: java.io.IOException -> L12
            if (r2 < 0) goto Lb
            return r2
        Lb:
            com.umeng.analytics.pro.df r2 = new com.umeng.analytics.pro.df
            r3 = 4
            r2.<init>(r3)
            throw r2
        L12:
            r2 = move-exception
            com.umeng.analytics.pro.df r3 = new com.umeng.analytics.pro.df
            r4 = 0
            r3.<init>(r4, r2)
            throw r3
        L1a:
            com.umeng.analytics.pro.df r2 = new com.umeng.analytics.pro.df
            r3 = 1
            java.lang.String r4 = "Cannot read from null inputStream"
            r2.<init>(r3, r4)
            throw r2
    }

    @Override // com.umeng.analytics.pro.de
    public boolean a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.umeng.analytics.pro.de
    public void b() throws com.umeng.analytics.pro.df {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.de
    public void b(byte[] r2, int r3, int r4) throws com.umeng.analytics.pro.df {
            r1 = this;
            java.io.OutputStream r0 = r1.b
            if (r0 == 0) goto L10
            r0.write(r2, r3, r4)     // Catch: java.io.IOException -> L8
            return
        L8:
            r2 = move-exception
            com.umeng.analytics.pro.df r3 = new com.umeng.analytics.pro.df
            r4 = 0
            r3.<init>(r4, r2)
            throw r3
        L10:
            com.umeng.analytics.pro.df r2 = new com.umeng.analytics.pro.df
            r3 = 1
            java.lang.String r4 = "Cannot write to null outputStream"
            r2.<init>(r3, r4)
            throw r2
    }

    @Override // com.umeng.analytics.pro.de
    public void c() {
            r2 = this;
            java.io.InputStream r0 = r2.a
            r1 = 0
            if (r0 == 0) goto La
            r0.close()     // Catch: java.io.IOException -> L8
        L8:
            r2.a = r1
        La:
            java.io.OutputStream r0 = r2.b
            if (r0 == 0) goto L13
            r0.close()     // Catch: java.io.IOException -> L11
        L11:
            r2.b = r1
        L13:
            return
    }

    @Override // com.umeng.analytics.pro.de
    public void d() throws com.umeng.analytics.pro.df {
            r3 = this;
            java.io.OutputStream r0 = r3.b
            if (r0 == 0) goto L10
            r0.flush()     // Catch: java.io.IOException -> L8
            return
        L8:
            r0 = move-exception
            com.umeng.analytics.pro.df r1 = new com.umeng.analytics.pro.df
            r2 = 0
            r1.<init>(r2, r0)
            throw r1
        L10:
            com.umeng.analytics.pro.df r0 = new com.umeng.analytics.pro.df
            r1 = 1
            java.lang.String r2 = "Cannot flush null outputStream"
            r0.<init>(r1, r2)
            throw r0
    }
}
