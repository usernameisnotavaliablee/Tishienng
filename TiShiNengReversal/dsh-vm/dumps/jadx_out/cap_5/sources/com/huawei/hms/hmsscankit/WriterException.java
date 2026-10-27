package com.huawei.hms.hmsscankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class WriterException extends java.lang.Exception {
    public WriterException() {
            r0 = this;
            r0.<init>()
            return
    }

    public WriterException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public WriterException(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " Format | "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            return
    }

    public WriterException(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
