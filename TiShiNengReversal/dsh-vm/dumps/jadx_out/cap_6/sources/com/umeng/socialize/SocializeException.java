package com.umeng.socialize;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocializeException extends java.lang.RuntimeException {
    private static final long b = 1;
    protected int a;
    private java.lang.String c;

    public SocializeException(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.a = r1
            r0.c = r2
            return
    }

    public SocializeException(java.lang.String r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 5000(0x1388, float:7.006E-42)
            r1.a = r0
            r1.c = r2
            return
    }

    public SocializeException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 5000(0x1388, float:7.006E-42)
            r0.a = r2
            r0.c = r1
            return
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }
}
