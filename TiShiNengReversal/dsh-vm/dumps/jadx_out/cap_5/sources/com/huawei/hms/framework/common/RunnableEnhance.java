package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RunnableEnhance implements java.lang.Runnable {
    static final java.lang.String TRANCELOGO = " -->";
    private java.lang.Runnable a;
    private java.lang.String b;

    RunnableEnhance(java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r1.b = r0
            r1.a = r2
            return
    }

    public java.lang.String getParentName() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
            java.lang.Runnable r0 = r1.a
            r0.run()
            return
    }
}
