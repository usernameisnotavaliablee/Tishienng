package com.google.mlkit.common.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class RemoteModelManager {
    private final java.util.Map zza;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class RemoteModelManagerRegistration {
        private final java.lang.Class zza;
        private final com.google.firebase.inject.Provider zzb;

        @com.google.android.gms.common.annotation.KeepForSdk
        public <RemoteT extends com.google.mlkit.common.model.RemoteModel> RemoteModelManagerRegistration(@androidx.annotation.NonNull java.lang.Class<RemoteT> r1, @androidx.annotation.NonNull com.google.firebase.inject.Provider<? extends com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface<RemoteT>> r2) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                return
        }

        final com.google.firebase.inject.Provider zza() {
                r1 = this;
                com.google.firebase.inject.Provider r0 = r1.zzb
                return r0
        }

        final java.lang.Class zzb() {
                r1 = this;
                java.lang.Class r0 = r1.zza
                return r0
        }
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public RemoteModelManager(@androidx.annotation.NonNull java.util.Set<com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration> r4) {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.zza = r0
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r4.next()
            com.google.mlkit.common.model.RemoteModelManager$RemoteModelManagerRegistration r0 = (com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration) r0
            java.util.Map r1 = r3.zza
            java.lang.Class r2 = r0.zzb()
            com.google.firebase.inject.Provider r0 = r0.zza()
            r1.put(r2, r0)
            goto Le
        L28:
            return
    }

    @androidx.annotation.NonNull
    public static synchronized com.google.mlkit.common.model.RemoteModelManager getInstance() {
            java.lang.Class<com.google.mlkit.common.model.RemoteModelManager> r0 = com.google.mlkit.common.model.RemoteModelManager.class
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()     // Catch: java.lang.Throwable -> L11
            java.lang.Class<com.google.mlkit.common.model.RemoteModelManager> r2 = com.google.mlkit.common.model.RemoteModelManager.class
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L11
            com.google.mlkit.common.model.RemoteModelManager r1 = (com.google.mlkit.common.model.RemoteModelManager) r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    private final com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface zza(java.lang.Class r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            com.google.firebase.inject.Provider r2 = (com.google.firebase.inject.Provider) r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.firebase.inject.Provider r2 = (com.google.firebase.inject.Provider) r2
            java.lang.Object r2 = r2.get()
            com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface r2 = (com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface) r2
            return r2
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<java.lang.Void> deleteDownloadedModel(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r2) {
            r1 = this;
            java.lang.String r0 = "RemoteModel cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.Class r0 = r2.getClass()
            com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface r0 = r1.zza(r0)
            com.google.android.gms.tasks.Task r2 = r0.deleteDownloadedModel(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<java.lang.Void> download(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r3, @androidx.annotation.NonNull com.google.mlkit.common.model.DownloadConditions r4) {
            r2 = this;
            java.lang.String r0 = "RemoteModel cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "DownloadConditions cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            java.util.Map r0 = r2.zza
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L23
            java.lang.Class r0 = r3.getClass()
            com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface r0 = r2.zza(r0)
            com.google.android.gms.tasks.Task r3 = r0.download(r3, r4)
            return r3
        L23:
            com.google.mlkit.common.MlKitException r4 = new com.google.mlkit.common.MlKitException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Feature model '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "' doesn't have a corresponding modelmanager registered."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 13
            r4.<init>(r3, r0)
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forException(r4)
            return r3
    }

    @androidx.annotation.NonNull
    public <T extends com.google.mlkit.common.model.RemoteModel> com.google.android.gms.tasks.Task<java.util.Set<T>> getDownloadedModels(@androidx.annotation.NonNull java.lang.Class<T> r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            com.google.firebase.inject.Provider r2 = (com.google.firebase.inject.Provider) r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.firebase.inject.Provider r2 = (com.google.firebase.inject.Provider) r2
            java.lang.Object r2 = r2.get()
            com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface r2 = (com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface) r2
            com.google.android.gms.tasks.Task r2 = r2.getDownloadedModels()
            return r2
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<java.lang.Boolean> isModelDownloaded(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r2) {
            r1 = this;
            java.lang.String r0 = "RemoteModel cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.Class r0 = r2.getClass()
            com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface r0 = r1.zza(r0)
            com.google.android.gms.tasks.Task r2 = r0.isModelDownloaded(r2)
            return r2
    }
}
