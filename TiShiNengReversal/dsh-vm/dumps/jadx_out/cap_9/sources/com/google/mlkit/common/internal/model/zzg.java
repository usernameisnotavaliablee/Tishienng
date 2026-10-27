package com.google.mlkit.common.internal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzg implements com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface {
    private final com.google.mlkit.common.sdkinternal.MlKitContext zza;
    private final com.google.android.gms.internal.mlkit_common.zzsh zzb;

    public zzg(com.google.mlkit.common.sdkinternal.MlKitContext r2) {
            r1 = this;
            java.lang.String r0 = "common"
            com.google.android.gms.internal.mlkit_common.zzsh r0 = com.google.android.gms.internal.mlkit_common.zzss.zzb(r0)
            r1.<init>()
            r1.zza = r2
            r1.zzb = r0
            return
    }

    private final com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager zze(com.google.mlkit.common.model.CustomRemoteModel r7) {
            r6 = this;
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r0 = new com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r4 = new com.google.mlkit.common.sdkinternal.model.ModelFileHelper
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = r6.zza
            r4.<init>(r1)
            com.google.mlkit.common.internal.model.zza r5 = new com.google.mlkit.common.internal.model.zza
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = r6.zza
            java.lang.String r2 = r7.getUniqueModelNameForPersist()
            r5.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = r6.zza
            r3 = 0
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r7 = new com.google.mlkit.common.sdkinternal.model.ModelFileHelper
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = r6.zza
            r7.<init>(r1)
            java.lang.Class<com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop> r3 = com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop.class
            java.lang.Object r1 = r1.get(r3)
            com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop r1 = (com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop) r1
            com.google.mlkit.common.sdkinternal.MlKitContext r3 = r6.zza
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r7 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.getInstance(r3, r2, r7, r0, r1)
            return r7
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* bridge */ /* synthetic */ com.google.android.gms.tasks.Task deleteDownloadedModel(com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            com.google.mlkit.common.model.CustomRemoteModel r4 = (com.google.mlkit.common.model.CustomRemoteModel) r4
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            java.util.concurrent.Executor r1 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            com.google.mlkit.common.internal.model.zzb r2 = new com.google.mlkit.common.internal.model.zzb
            r2.<init>(r3, r4, r0)
            r1.execute(r2)
            com.google.android.gms.tasks.Task r4 = r0.getTask()
            com.google.mlkit.common.internal.model.zzc r0 = new com.google.mlkit.common.internal.model.zzc
            r0.<init>(r3)
            com.google.android.gms.tasks.Task r4 = r4.addOnCompleteListener(r0)
            return r4
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* bridge */ /* synthetic */ com.google.android.gms.tasks.Task download(com.google.mlkit.common.model.RemoteModel r3, com.google.mlkit.common.model.DownloadConditions r4) {
            r2 = this;
            com.google.mlkit.common.model.CustomRemoteModel r3 = (com.google.mlkit.common.model.CustomRemoteModel) r3
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r3 = r2.zze(r3)
            r3.setDownloadConditions(r4)
            r4 = 0
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.forResult(r4)
            java.util.concurrent.Executor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            com.google.mlkit.common.internal.model.zzd r1 = new com.google.mlkit.common.internal.model.zzd
            r1.<init>(r3)
            com.google.android.gms.tasks.Task r3 = r4.onSuccessTask(r0, r1)
            return r3
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final com.google.android.gms.tasks.Task<java.util.Set<com.google.mlkit.common.model.CustomRemoteModel>> getDownloadedModels() {
            r3 = this;
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Custom Remote model does not support listing downloaded models"
            r2 = 12
            r0.<init>(r1, r2)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r0)
            return r0
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* bridge */ /* synthetic */ com.google.android.gms.tasks.Task isModelDownloaded(com.google.mlkit.common.model.RemoteModel r3) {
            r2 = this;
            com.google.mlkit.common.model.CustomRemoteModel r3 = (com.google.mlkit.common.model.CustomRemoteModel) r3
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            com.google.mlkit.common.internal.model.zze r1 = new com.google.mlkit.common.internal.model.zze
            r1.<init>(r2, r3)
            com.google.android.gms.tasks.Task r3 = r0.scheduleCallable(r1)
            com.google.mlkit.common.internal.model.zzf r0 = new com.google.mlkit.common.internal.model.zzf
            r0.<init>(r2)
            com.google.android.gms.tasks.Task r3 = r3.addOnCompleteListener(r0)
            return r3
    }

    final /* synthetic */ java.lang.Boolean zza(com.google.mlkit.common.model.CustomRemoteModel r1) throws java.lang.Exception {
            r0 = this;
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r0.zze(r1)
            boolean r1 = r1.isModelDownloadedAndValid()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    final /* synthetic */ void zzb(com.google.mlkit.common.model.CustomRemoteModel r4, com.google.android.gms.tasks.TaskCompletionSource r5) {
            r3 = this;
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r0 = new com.google.mlkit.common.sdkinternal.model.ModelFileHelper     // Catch: java.lang.RuntimeException -> L1b
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = r3.zza     // Catch: java.lang.RuntimeException -> L1b
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L1b
            com.google.mlkit.common.sdkinternal.ModelType r1 = com.google.mlkit.common.sdkinternal.ModelType.CUSTOM     // Catch: java.lang.RuntimeException -> L1b
            java.lang.String r4 = r4.getModelName()     // Catch: java.lang.RuntimeException -> L1b
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.RuntimeException -> L1b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.RuntimeException -> L1b
            r0.deleteAllModels(r1, r4)     // Catch: java.lang.RuntimeException -> L1b
            r4 = 0
            r5.setResult(r4)
            return
        L1b:
            r4 = move-exception
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Internal error has occurred when executing ML Kit tasks"
            r2 = 13
            r0.<init>(r1, r2, r4)
            r5.setException(r0)
            return
    }

    final /* synthetic */ void zzc(com.google.android.gms.tasks.Task r4) {
            r3 = this;
            boolean r4 = r4.isSuccessful()
            com.google.android.gms.internal.mlkit_common.zzmw r0 = new com.google.android.gms.internal.mlkit_common.zzmw
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzlm r1 = new com.google.android.gms.internal.mlkit_common.zzlm
            r1.<init>()
            com.google.android.gms.internal.mlkit_common.zzne r2 = com.google.android.gms.internal.mlkit_common.zzne.zzb
            r1.zzb(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.zza(r4)
            com.google.android.gms.internal.mlkit_common.zzlo r4 = r1.zzc()
            r0.zze(r4)
            com.google.android.gms.internal.mlkit_common.zzry r4 = com.google.android.gms.internal.mlkit_common.zzsk.zzf(r0)
            com.google.android.gms.internal.mlkit_common.zzsh r0 = r3.zzb
            com.google.android.gms.internal.mlkit_common.zzmv r1 = com.google.android.gms.internal.mlkit_common.zzmv.zzaZ
            r0.zzd(r4, r1)
            return
    }

    final /* synthetic */ void zzd(com.google.android.gms.tasks.Task r4) {
            r3 = this;
            java.lang.Object r4 = r4.getResult()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            com.google.android.gms.internal.mlkit_common.zzmw r0 = new com.google.android.gms.internal.mlkit_common.zzmw
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzmh r1 = new com.google.android.gms.internal.mlkit_common.zzmh
            r1.<init>()
            com.google.android.gms.internal.mlkit_common.zzne r2 = com.google.android.gms.internal.mlkit_common.zzne.zzb
            r1.zzb(r2)
            r1.zza(r4)
            com.google.android.gms.internal.mlkit_common.zzmj r4 = r1.zzc()
            r0.zzg(r4)
            com.google.android.gms.internal.mlkit_common.zzry r4 = com.google.android.gms.internal.mlkit_common.zzsk.zzf(r0)
            com.google.android.gms.internal.mlkit_common.zzsh r0 = r3.zzb
            com.google.android.gms.internal.mlkit_common.zzmv r1 = com.google.android.gms.internal.mlkit_common.zzmv.zzaY
            r0.zzd(r4, r1)
            return
    }
}
