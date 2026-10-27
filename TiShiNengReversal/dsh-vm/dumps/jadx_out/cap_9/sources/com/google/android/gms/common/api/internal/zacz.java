package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zacz extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zada zaa;

    public zacz(com.google.android.gms.common.api.internal.zada r1, android.os.Looper r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r5) {
            r4 = this;
            int r0 = r5.what
            if (r0 == 0) goto L1a
            r1 = 1
            if (r0 == r1) goto L8
            return
        L8:
            java.lang.Object r5 = r5.obj
            java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
            java.lang.String r0 = r5.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Runtime exception on the transformation worker thread: "
            r1.concat(r0)
            throw r5
        L1a:
            java.lang.Object r5 = r5.obj
            com.google.android.gms.common.api.PendingResult r5 = (com.google.android.gms.common.api.PendingResult) r5
            com.google.android.gms.common.api.internal.zada r0 = r4.zaa
            java.lang.Object r0 = com.google.android.gms.common.api.internal.zada.zad(r0)
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zada r1 = r4.zaa     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.common.api.internal.zada r1 = com.google.android.gms.common.api.internal.zada.zac(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.common.api.internal.zada r1 = (com.google.android.gms.common.api.internal.zada) r1     // Catch: java.lang.Throwable -> L40
            if (r5 != 0) goto L42
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "Transform returned null"
            r3 = 13
            r5.<init>(r3, r2)     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.common.api.internal.zada.zag(r1, r5)     // Catch: java.lang.Throwable -> L40
            goto L53
        L40:
            r5 = move-exception
            goto L55
        L42:
            boolean r2 = r5 instanceof com.google.android.gms.common.api.internal.zacp     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L50
            com.google.android.gms.common.api.internal.zacp r5 = (com.google.android.gms.common.api.internal.zacp) r5     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.common.api.Status r5 = r5.zaa()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.common.api.internal.zada.zag(r1, r5)     // Catch: java.lang.Throwable -> L40
            goto L53
        L50:
            r1.zai(r5)     // Catch: java.lang.Throwable -> L40
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r5
    }
}
