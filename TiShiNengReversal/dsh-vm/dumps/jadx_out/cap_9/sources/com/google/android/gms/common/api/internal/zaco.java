package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zaco {
    private static final java.util.concurrent.ExecutorService zaa = null;

    static {
            com.google.android.gms.internal.base.zaq r0 = com.google.android.gms.internal.base.zat.zaa()
            com.google.android.gms.common.util.concurrent.NumberedThreadFactory r1 = new com.google.android.gms.common.util.concurrent.NumberedThreadFactory
            java.lang.String r2 = "GAC_Transform"
            r1.<init>(r2)
            r2 = 1
            java.util.concurrent.ExecutorService r0 = r0.zaa(r1, r2)
            com.google.android.gms.common.api.internal.zaco.zaa = r0
            return
    }

    public zaco() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.concurrent.ExecutorService zaa() {
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.common.api.internal.zaco.zaa
            return r0
    }
}
