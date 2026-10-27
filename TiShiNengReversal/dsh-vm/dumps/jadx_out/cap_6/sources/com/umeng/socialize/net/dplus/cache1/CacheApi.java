package com.umeng.socialize.net.dplus.cache1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CacheApi {
    private static java.lang.String a = "CacheApi";
    private static com.umeng.socialize.net.dplus.cache1.CacheApi e;
    private android.os.Handler b;
    private com.umeng.socialize.net.dplus.cache1.CacheExector c;
    private android.content.Context d;

    static {
            return
    }

    private CacheApi(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.d = r2
            com.umeng.socialize.net.dplus.cache1.CacheExector r2 = new com.umeng.socialize.net.dplus.cache1.CacheExector
            java.lang.String r0 = r1.a()
            r2.<init>(r0)
            r1.c = r2
            return
    }

    private java.lang.String a() {
            r1 = this;
            android.content.Context r0 = r1.d
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r0 = r0.getPath()
            return r0
    }

    public static com.umeng.socialize.net.dplus.cache1.CacheApi get(android.content.Context r1) {
            com.umeng.socialize.net.dplus.cache1.CacheApi r0 = com.umeng.socialize.net.dplus.cache1.CacheApi.e
            if (r0 != 0) goto Lb
            com.umeng.socialize.net.dplus.cache1.CacheApi r0 = new com.umeng.socialize.net.dplus.cache1.CacheApi
            r0.<init>(r1)
            com.umeng.socialize.net.dplus.cache1.CacheApi.e = r0
        Lb:
            com.umeng.socialize.net.dplus.cache1.CacheApi r1 = com.umeng.socialize.net.dplus.cache1.CacheApi.e
            return r1
    }

    public double checkSize(java.lang.String r3) {
            r2 = this;
            com.umeng.socialize.net.dplus.cache1.CacheExector r0 = r2.c
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            double r0 = r0.checkSize(r3)
            return r0
    }

    public boolean delete(java.lang.String r2) {
            r1 = this;
            com.umeng.socialize.net.dplus.cache1.CacheExector r0 = r1.c
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r0.deleteFile(r2)
            return r2
    }

    public com.umeng.socialize.net.dplus.cache1.IReader read(java.lang.String r2, java.lang.Class r3) {
            r1 = this;
            com.umeng.socialize.net.dplus.cache1.CacheExector r0 = r1.c
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.umeng.socialize.net.dplus.cache1.IReader r2 = r0.readFile(r2, r3)
            return r2
    }

    public boolean save(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.umeng.socialize.net.dplus.cache1.CacheExector r0 = r1.c
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r0.save(r2, r3)
            return r2
    }
}
