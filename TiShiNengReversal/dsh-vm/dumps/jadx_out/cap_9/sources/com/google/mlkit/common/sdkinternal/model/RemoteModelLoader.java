package com.google.mlkit.common.sdkinternal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class RemoteModelLoader {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;

    @androidx.annotation.GuardedBy("RemoteModelLoader.class")
    private static final java.util.Map zzb = null;
    private final com.google.mlkit.common.sdkinternal.MlKitContext zzc;
    private final com.google.mlkit.common.model.RemoteModel zzd;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager zze;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager zzf;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelLoaderHelper zzg;
    private final com.google.android.gms.internal.mlkit_common.zzsh zzh;
    private boolean zzi;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "RemoteModelLoader"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.model.RemoteModelLoader.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.mlkit.common.sdkinternal.model.RemoteModelLoader.zzb = r0
            return
    }

    private RemoteModelLoader(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.MlKitContext r7, @androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r8, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.model.ModelValidator r9, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.model.RemoteModelLoaderHelper r10, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover r11) {
            r6 = this;
            r6.<init>()
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r0 = new com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r4 = new com.google.mlkit.common.sdkinternal.model.ModelFileHelper
            r4.<init>(r7)
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.zzf = r0
            r7 = 1
            r6.zzi = r7
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r7 = new com.google.mlkit.common.sdkinternal.model.ModelFileHelper
            r7.<init>(r1)
            java.lang.Class<com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop> r8 = com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop.class
            java.lang.Object r8 = r1.get(r8)
            com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop r8 = (com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop) r8
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r7 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.getInstance(r1, r2, r7, r0, r8)
            r6.zze = r7
            r6.zzg = r10
            r6.zzc = r1
            r6.zzd = r2
            java.lang.String r7 = "common"
            com.google.android.gms.internal.mlkit_common.zzsh r7 = com.google.android.gms.internal.mlkit_common.zzss.zzb(r7)
            r6.zzh = r7
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static synchronized com.google.mlkit.common.sdkinternal.model.RemoteModelLoader getInstance(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.MlKitContext r10, @androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r11, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.model.ModelValidator r12, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.model.RemoteModelLoaderHelper r13, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover r14) {
            java.lang.Class<com.google.mlkit.common.sdkinternal.model.RemoteModelLoader> r1 = com.google.mlkit.common.sdkinternal.model.RemoteModelLoader.class
            monitor-enter(r1)
            java.lang.String r0 = r11.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L1d
            java.util.Map r2 = com.google.mlkit.common.sdkinternal.model.RemoteModelLoader.zzb     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r2.containsKey(r0)     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L20
            com.google.mlkit.common.sdkinternal.model.RemoteModelLoader r4 = new com.google.mlkit.common.sdkinternal.model.RemoteModelLoader     // Catch: java.lang.Throwable -> L1d
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1d
            r2.put(r0, r4)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r0 = move-exception
            r10 = r0
            goto L28
        L20:
            java.lang.Object r10 = r2.get(r0)     // Catch: java.lang.Throwable -> L1d
            com.google.mlkit.common.sdkinternal.model.RemoteModelLoader r10 = (com.google.mlkit.common.sdkinternal.model.RemoteModelLoader) r10     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            return r10
        L28:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r10
    }

    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    private final java.nio.MappedByteBuffer zza(@androidx.annotation.NonNull java.lang.String r2) throws com.google.mlkit.common.MlKitException {
            r1 = this;
            com.google.mlkit.common.sdkinternal.model.RemoteModelLoaderHelper r0 = r1.zzg
            java.nio.MappedByteBuffer r2 = r0.loadModelAtPath(r2)
            return r2
    }

    private final java.nio.MappedByteBuffer zzb(java.io.File r4) throws com.google.mlkit.common.MlKitException {
            r3 = this;
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Exception -> L9
            java.nio.MappedByteBuffer r4 = r3.zza(r0)     // Catch: java.lang.Exception -> L9
            return r4
        L9:
            r0 = move-exception
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r1 = r3.zzf
            r1.zzc(r4)
            com.google.mlkit.common.MlKitException r4 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Failed to load newly downloaded model."
            r2 = 14
            r4.<init>(r1, r2, r0)
            throw r4
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.mlkit.common.model.RemoteModel getRemoteModel() {
            r1 = this;
            com.google.mlkit.common.model.RemoteModel r0 = r1.zzd
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public synchronized java.nio.MappedByteBuffer load() throws com.google.mlkit.common.MlKitException {
            r10 = this;
            monitor-enter(r10)
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.RemoteModelLoader.zza     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "RemoteModelLoader"
            java.lang.String r2 = "Try to load newly downloaded model file."
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r10.zze     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r10.zzi     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r3 = r1.getDownloadingId()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.getDownloadingModelHash()     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r5 = 0
            if (r3 == 0) goto La8
            if (r1 != 0) goto L1e
            goto La8
        L1e:
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r6 = r10.zze     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r6 = r6.getDownloadingModelStatusCode()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L31
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r10.zze     // Catch: java.lang.Throwable -> L2e
            r1.removeOrCancelDownload()     // Catch: java.lang.Throwable -> L2e
        L2b:
            r6 = r5
            goto Lb6
        L2e:
            r0 = move-exception
            goto Lf9
        L31:
            java.lang.String r7 = "Download Status code: "
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = r7.concat(r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = "RemoteModelLoader"
            r0.d(r8, r7)     // Catch: java.lang.Throwable -> L2e
            int r7 = r6.intValue()     // Catch: java.lang.Throwable -> L2e
            r8 = 8
            if (r7 != r8) goto L89
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r3 = r10.zze     // Catch: java.lang.Throwable -> L2e
            java.io.File r3 = r3.zzi(r1)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L51
            goto L2b
        L51:
            java.nio.MappedByteBuffer r6 = r10.zzb(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = r3.getParent()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = "Moved the downloaded model to private folder successfully: "
            java.lang.String r9 = "RemoteModelLoader"
            java.lang.String r7 = r8.concat(r7)     // Catch: java.lang.Throwable -> L2e
            r0.d(r9, r7)     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r7 = r10.zze     // Catch: java.lang.Throwable -> L2e
            r7.updateLatestModelHashAndType(r1)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto Lb6
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r1 = r10.zzf     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.zzd(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Lb6
            java.lang.String r1 = "RemoteModelLoader"
            java.lang.String r2 = "All old models are deleted."
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r1 = r10.zzf     // Catch: java.lang.Throwable -> L2e
            java.io.File r1 = r1.zza(r3)     // Catch: java.lang.Throwable -> L2e
            java.nio.MappedByteBuffer r6 = r10.zzb(r1)     // Catch: java.lang.Throwable -> L2e
            goto Lb6
        L89:
            int r1 = r6.intValue()     // Catch: java.lang.Throwable -> L2e
            r2 = 16
            if (r1 != r2) goto L2b
            com.google.android.gms.internal.mlkit_common.zzsh r1 = r10.zzh     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.model.RemoteModel r2 = r10.zzd     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r6 = r10.zze     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.mlkit_common.zzry r7 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: java.lang.Throwable -> L2e
            int r3 = r6.getFailureReason(r3)     // Catch: java.lang.Throwable -> L2e
            r1.zze(r7, r2, r4, r3)     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r10.zze     // Catch: java.lang.Throwable -> L2e
            r1.removeOrCancelDownload()     // Catch: java.lang.Throwable -> L2e
            goto L2b
        La8:
            java.lang.String r1 = "RemoteModelLoader"
            java.lang.String r2 = "No new model is downloading."
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r10.zze     // Catch: java.lang.Throwable -> L2e
            r1.removeOrCancelDownload()     // Catch: java.lang.Throwable -> L2e
            goto L2b
        Lb6:
            if (r6 != 0) goto Lf4
            java.lang.String r1 = "RemoteModelLoader"
            java.lang.String r2 = "Loading existing model file."
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r1 = r10.zzf     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.zzb()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto Lcf
            java.lang.String r1 = "RemoteModelLoader"
            java.lang.String r2 = "No existing model file"
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L2e
            goto Lf7
        Lcf:
            java.nio.MappedByteBuffer r5 = r10.zza(r1)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> Ld4
            goto Lf7
        Ld4:
            r0 = move-exception
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r2 = r10.zzf     // Catch: java.lang.Throwable -> L2e
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L2e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r2.zzc(r3)     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = r10.zzc     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.model.RemoteModel r2 = r10.zzd     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.sdkinternal.SharedPrefManager r1 = com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(r1)     // Catch: java.lang.Throwable -> L2e
            r1.clearLatestModelHash(r2)     // Catch: java.lang.Throwable -> L2e
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Failed to load an already downloaded model."
            r3 = 14
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> L2e
            throw r1     // Catch: java.lang.Throwable -> L2e
        Lf4:
            r10.zzi = r4     // Catch: java.lang.Throwable -> L2e
            r5 = r6
        Lf7:
            monitor-exit(r10)
            return r5
        Lf9:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L2e
            throw r0
    }
}
