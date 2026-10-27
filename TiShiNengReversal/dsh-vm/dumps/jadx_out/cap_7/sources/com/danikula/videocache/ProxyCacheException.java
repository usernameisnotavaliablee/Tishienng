package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ProxyCacheException extends java.lang.Exception {
    private static final java.lang.String LIBRARY_VERSION = ". Version: 2.7.0";

    public ProxyCacheException(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ". Version: 2.7.0"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            return
    }

    public ProxyCacheException(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ". Version: 2.7.0"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2, r3)
            return
    }

    public ProxyCacheException(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "No explanation error. Version: 2.7.0"
            r1.<init>(r0, r2)
            return
    }
}
