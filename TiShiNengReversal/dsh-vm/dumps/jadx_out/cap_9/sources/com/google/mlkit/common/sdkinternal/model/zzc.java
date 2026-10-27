package com.google.mlkit.common.sdkinternal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.WorkerThread
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzc extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager zza;
    private final long zzb;
    private final com.google.android.gms.tasks.TaskCompletionSource zzc;

    /* synthetic */ zzc(com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1, long r2, com.google.android.gms.tasks.TaskCompletionSource r4, com.google.mlkit.common.sdkinternal.model.zzb r5) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r4
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
            r6 = this;
            java.lang.String r7 = "extra_download_id"
            r0 = -1
            long r7 = r8.getLongExtra(r7, r0)
            long r0 = r6.zzb
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto Lf
            return
        Lf:
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r6.zza
            java.lang.Integer r1 = r0.getDownloadingModelStatusCode()
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r2 = r6.zza     // Catch: java.lang.Throwable -> L28 java.lang.IllegalArgumentException -> L2b
            com.google.mlkit.common.sdkinternal.MlKitContext r2 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zzf(r2)     // Catch: java.lang.Throwable -> L28 java.lang.IllegalArgumentException -> L2b
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L28 java.lang.IllegalArgumentException -> L2b
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L28 java.lang.IllegalArgumentException -> L2b
            r2.unregisterReceiver(r6)     // Catch: java.lang.Throwable -> L28 java.lang.IllegalArgumentException -> L2b
            goto L37
        L28:
            r7 = move-exception
            goto Le1
        L2b:
            r2 = move-exception
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zzc()     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "ModelDownloadManager"
            java.lang.String r5 = "Exception thrown while trying to unregister the broadcast receiver for the download"
            r3.w(r4, r5, r2)     // Catch: java.lang.Throwable -> L28
        L37:
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r2 = r6.zza     // Catch: java.lang.Throwable -> L28
            android.util.LongSparseArray r2 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza(r2)     // Catch: java.lang.Throwable -> L28
            long r3 = r6.zzb     // Catch: java.lang.Throwable -> L28
            r2.remove(r3)     // Catch: java.lang.Throwable -> L28
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r2 = r6.zza     // Catch: java.lang.Throwable -> L28
            android.util.LongSparseArray r2 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zzb(r2)     // Catch: java.lang.Throwable -> L28
            long r3 = r6.zzb     // Catch: java.lang.Throwable -> L28
            r2.remove(r3)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            r0 = 0
            if (r1 == 0) goto Lc1
            int r2 = r1.intValue()
            r3 = 16
            if (r2 != r3) goto L7e
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r6.zza
            com.google.android.gms.internal.mlkit_common.zzsh r2 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zzh(r1)
            com.google.android.gms.internal.mlkit_common.zzry r3 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()
            com.google.mlkit.common.model.RemoteModel r4 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zze(r1)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r8 = r1.getFailureReason(r7)
            r2.zze(r3, r4, r0, r8)
            com.google.android.gms.tasks.TaskCompletionSource r8 = r6.zzc
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r6.zza
            com.google.mlkit.common.MlKitException r7 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zzd(r0, r7)
            r8.setException(r7)
            return
        L7e:
            int r7 = r1.intValue()
            r8 = 8
            if (r7 != r8) goto Lc1
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r7 = r6.zza
            com.google.android.gms.internal.mlkit_common.zzsh r8 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zzh(r7)
            com.google.android.gms.internal.mlkit_common.zzry r0 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()
            com.google.mlkit.common.model.RemoteModel r7 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zze(r7)
            com.google.android.gms.internal.mlkit_common.zzsi r1 = com.google.android.gms.internal.mlkit_common.zzsj.zzh()
            com.google.android.gms.internal.mlkit_common.zzmu r2 = com.google.android.gms.internal.mlkit_common.zzmu.zza
            r1.zzb(r2)
            r2 = 1
            r1.zze(r2)
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r2 = r6.zza
            com.google.mlkit.common.model.RemoteModel r2 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zze(r2)
            com.google.mlkit.common.sdkinternal.ModelType r2 = r2.getModelType()
            r1.zzd(r2)
            com.google.android.gms.internal.mlkit_common.zzna r2 = com.google.android.gms.internal.mlkit_common.zzna.zzh
            r1.zza(r2)
            com.google.android.gms.internal.mlkit_common.zzsj r1 = r1.zzh()
            r8.zzg(r0, r7, r1)
            com.google.android.gms.tasks.TaskCompletionSource r7 = r6.zzc
            r8 = 0
            r7.setResult(r8)
            return
        Lc1:
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r7 = r6.zza
            com.google.android.gms.internal.mlkit_common.zzsh r8 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zzh(r7)
            com.google.android.gms.internal.mlkit_common.zzry r1 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()
            com.google.mlkit.common.model.RemoteModel r7 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zze(r7)
            r8.zze(r1, r7, r0, r0)
            com.google.android.gms.tasks.TaskCompletionSource r7 = r6.zzc
            com.google.mlkit.common.MlKitException r8 = new com.google.mlkit.common.MlKitException
            java.lang.String r0 = "Model downloading failed"
            r1 = 13
            r8.<init>(r0, r1)
            r7.setException(r8)
            return
        Le1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r7
    }
}
