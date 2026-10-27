package com.umeng.socialize.net.dplus.cache1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class IReader<T> {
    private java.lang.String a;
    public T result;

    public IReader(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static double formatSize(long r2) {
            double r2 = (double) r2
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r2 = r2 / r0
            double r2 = r2 / r0
            return r2
    }

    public abstract void create(java.lang.String r1);

    public java.lang.String getLogFileName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
