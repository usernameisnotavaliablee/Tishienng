package com.google.android.gms.internal.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zas implements com.google.android.gms.internal.base.zaq {
    private zas() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ zas(com.google.android.gms.internal.base.zar r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final java.util.concurrent.ExecutorService zaa(java.util.concurrent.ThreadFactory r1, int r2) {
            r0 = this;
            r2 = 1
            java.util.concurrent.ExecutorService r1 = r0.zac(r2, r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final java.util.concurrent.ExecutorService zab(int r2, int r3) {
            r1 = this;
            java.util.concurrent.ThreadFactory r2 = java.util.concurrent.Executors.defaultThreadFactory()
            r3 = 2
            r0 = 4
            java.util.concurrent.ExecutorService r2 = r1.zac(r0, r2, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final java.util.concurrent.ExecutorService zac(int r9, java.util.concurrent.ThreadFactory r10, int r11) {
            r8 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r3 = 60
            r2 = r9
            r1 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r9 = 1
            r0.allowCoreThreadTimeOut(r9)
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            return r9
    }
}
