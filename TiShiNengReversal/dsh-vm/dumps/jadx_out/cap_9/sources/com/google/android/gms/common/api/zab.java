package com.google.android.gms.common.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zab implements com.google.android.gms.common.api.PendingResult.StatusListener {
    final /* synthetic */ com.google.android.gms.common.api.Batch zaa;

    zab(com.google.android.gms.common.api.Batch r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status r5) {
            r4 = this;
            com.google.android.gms.common.api.Batch r0 = r4.zaa
            java.lang.Object r0 = com.google.android.gms.common.api.Batch.zab(r0)
            monitor-enter(r0)
            com.google.android.gms.common.api.Batch r1 = r4.zaa     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.isCanceled()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r5 = move-exception
            goto L68
        L13:
            boolean r1 = r5.isCanceled()     // Catch: java.lang.Throwable -> L11
            r2 = 1
            if (r1 == 0) goto L20
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.common.api.Batch.zad(r5, r2)     // Catch: java.lang.Throwable -> L11
            goto L2b
        L20:
            boolean r5 = r5.isSuccess()     // Catch: java.lang.Throwable -> L11
            if (r5 != 0) goto L2b
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.common.api.Batch.zac(r5, r2)     // Catch: java.lang.Throwable -> L11
        L2b:
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L11
            int r1 = com.google.android.gms.common.api.Batch.zaa(r5)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + (-1)
            com.google.android.gms.common.api.Batch.zae(r5, r1)     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L11
            int r1 = com.google.android.gms.common.api.Batch.zaa(r5)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L66
            boolean r1 = com.google.android.gms.common.api.Batch.zah(r5)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L48
            com.google.android.gms.common.api.Batch.zaf(r5)     // Catch: java.lang.Throwable -> L11
            goto L66
        L48:
            boolean r5 = com.google.android.gms.common.api.Batch.zag(r5)     // Catch: java.lang.Throwable -> L11
            if (r5 == 0) goto L56
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> L11
            r1 = 13
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L11
            goto L58
        L56:
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L11
        L58:
            com.google.android.gms.common.api.Batch r1 = r4.zaa     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.common.api.BatchResult r2 = new com.google.android.gms.common.api.BatchResult     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.common.api.PendingResult[] r3 = com.google.android.gms.common.api.Batch.zai(r1)     // Catch: java.lang.Throwable -> L11
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L11
            r1.setResult(r2)     // Catch: java.lang.Throwable -> L11
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r5
    }
}
