package com.google.mlkit.common.sdkinternal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@androidx.annotation.WorkerThread
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ModelLoader {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public final com.google.mlkit.common.sdkinternal.model.LocalModelLoader localModelLoader;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    protected com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState modelLoadingState;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.VisibleForTesting
    public final com.google.mlkit.common.sdkinternal.model.RemoteModelLoader remoteModelLoader;

    @androidx.annotation.NonNull
    private final com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingLogger zzb;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface ModelContentHandler {
        @com.google.android.gms.common.annotation.KeepForSdk
        void constructModel(@androidx.annotation.NonNull java.nio.MappedByteBuffer r1) throws com.google.mlkit.common.MlKitException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface ModelLoadingLogger {
        @com.google.android.gms.common.annotation.KeepForSdk
        void logErrorCodes(@androidx.annotation.NonNull java.util.List<java.lang.Integer> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    protected enum ModelLoadingState extends java.lang.Enum<com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState> {

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static final com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState LOCAL_MODEL_LOADED = null;

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static final com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState NO_MODEL_LOADED = null;

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static final com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState REMOTE_MODEL_LOADED = null;
        private static final /* synthetic */ com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState[] zza = null;

        static {
                com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState r0 = new com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState
                java.lang.String r1 = "NO_MODEL_LOADED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.NO_MODEL_LOADED = r0
                com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState r1 = new com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState
                java.lang.String r3 = "REMOTE_MODEL_LOADED"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.REMOTE_MODEL_LOADED = r1
                com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState r3 = new com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState
                java.lang.String r5 = "LOCAL_MODEL_LOADED"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.LOCAL_MODEL_LOADED = r3
                r5 = 3
                com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState[] r5 = new com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.zza = r5
                return
        }

        ModelLoadingState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @androidx.annotation.NonNull
        public static com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState[] values() {
                com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState[] r0 = com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.zza
                java.lang.Object r0 = r0.clone()
                com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState[] r0 = (com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState[]) r0
                return r0
        }
    }

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "ModelLoader"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.model.ModelLoader.zza = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public ModelLoader(@androidx.annotation.Nullable com.google.mlkit.common.sdkinternal.model.RemoteModelLoader r3, @androidx.annotation.Nullable com.google.mlkit.common.sdkinternal.model.LocalModelLoader r4, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingLogger r5) {
            r2 = this;
            r2.<init>()
            com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState r0 = com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.NO_MODEL_LOADED
            r2.modelLoadingState = r0
            r0 = 1
            if (r3 != 0) goto Le
            if (r4 == 0) goto Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r1 = "At least one of RemoteModelLoader or LocalModelLoader must be non-null."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            r2.remoteModelLoader = r3
            r2.localModelLoader = r4
            r2.zzb = r5
            return
    }

    private final java.lang.String zza() {
            r4 = this;
            com.google.mlkit.common.sdkinternal.model.LocalModelLoader r0 = r4.localModelLoader
            r1 = 0
            if (r0 == 0) goto L51
            com.google.mlkit.common.model.LocalModel r0 = r0.getLocalModel()
            java.lang.String r0 = r0.getAssetFilePath()
            if (r0 == 0) goto L1a
            com.google.mlkit.common.sdkinternal.model.LocalModelLoader r0 = r4.localModelLoader
            com.google.mlkit.common.model.LocalModel r0 = r0.getLocalModel()
            java.lang.String r1 = r0.getAssetFilePath()
            goto L51
        L1a:
            com.google.mlkit.common.sdkinternal.model.LocalModelLoader r0 = r4.localModelLoader
            com.google.mlkit.common.model.LocalModel r0 = r0.getLocalModel()
            java.lang.String r0 = r0.getAbsoluteFilePath()
            if (r0 == 0) goto L31
            com.google.mlkit.common.sdkinternal.model.LocalModelLoader r0 = r4.localModelLoader
            com.google.mlkit.common.model.LocalModel r0 = r0.getLocalModel()
            java.lang.String r1 = r0.getAbsoluteFilePath()
            goto L51
        L31:
            com.google.mlkit.common.sdkinternal.model.LocalModelLoader r0 = r4.localModelLoader
            com.google.mlkit.common.model.LocalModel r0 = r0.getLocalModel()
            android.net.Uri r0 = r0.getUri()
            if (r0 == 0) goto L51
            com.google.mlkit.common.sdkinternal.model.LocalModelLoader r0 = r4.localModelLoader
            com.google.mlkit.common.model.LocalModel r0 = r0.getLocalModel()
            android.net.Uri r0 = r0.getUri()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r1 = r0.toString()
        L51:
            com.google.mlkit.common.sdkinternal.model.RemoteModelLoader r0 = r4.remoteModelLoader
            if (r0 != 0) goto L58
            java.lang.String r0 = "unspecified"
            goto L60
        L58:
            com.google.mlkit.common.model.RemoteModel r0 = r0.getRemoteModel()
            java.lang.String r0 = r0.getUniqueModelNameForPersist()
        L60:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r0
            java.lang.String r0 = "Local model path: %s. Remote model name: %s. "
            java.lang.String r0 = java.lang.String.format(r0, r2)
            return r0
    }

    private final synchronized boolean zzb(com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelContentHandler r2, java.util.List r3) throws com.google.mlkit.common.MlKitException {
            r1 = this;
            monitor-enter(r1)
            com.google.mlkit.common.sdkinternal.model.LocalModelLoader r0 = r1.localModelLoader     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L27
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L27
            r2.constructModel(r0)     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L1c
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.mlkit.common.sdkinternal.model.ModelLoader.zza     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "ModelLoader"
            java.lang.String r0 = "Local model source is loaded successfully"
            r2.d(r3, r0)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            r2 = 1
            return r2
        L1a:
            r2 = move-exception
            goto L2a
        L1c:
            r2 = move-exception
            r0 = 18
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1a
            r3.add(r0)     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L27:
            monitor-exit(r1)
            r2 = 0
            return r2
        L2a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    private final synchronized boolean zzc(com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelContentHandler r4, java.util.List r5) throws com.google.mlkit.common.MlKitException {
            r3 = this;
            monitor-enter(r3)
            com.google.mlkit.common.sdkinternal.model.RemoteModelLoader r0 = r3.remoteModelLoader     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L4e
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch: java.lang.Throwable -> L1a com.google.mlkit.common.MlKitException -> L3a
            if (r0 == 0) goto L27
            r4.constructModel(r0)     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L1c
            com.google.android.gms.common.internal.GmsLogger r4 = com.google.mlkit.common.sdkinternal.model.ModelLoader.zza     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "ModelLoader"
            java.lang.String r0 = "Remote model source is loaded successfully"
            r4.d(r5, r0)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r3)
            r4 = 1
            return r4
        L1a:
            r4 = move-exception
            goto L51
        L1c:
            r4 = move-exception
            r0 = 19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1a
            r5.add(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        L27:
            com.google.android.gms.common.internal.GmsLogger r4 = com.google.mlkit.common.sdkinternal.model.ModelLoader.zza     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = "ModelLoader"
            java.lang.String r1 = "Remote model source can NOT be loaded, try local model."
            r4.d(r0, r1)     // Catch: java.lang.Throwable -> L1a
            r4 = 21
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1a
            r5.add(r4)     // Catch: java.lang.Throwable -> L1a
            goto L4e
        L3a:
            r4 = move-exception
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.ModelLoader.zza     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "ModelLoader"
            java.lang.String r2 = "Remote model source can NOT be loaded, try local model."
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L1a
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1a
            r5.add(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        L4e:
            monitor-exit(r3)
            r4 = 0
            return r4
        L51:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized boolean isRemoteModelLoaded() {
            r2 = this;
            monitor-enter(r2)
            com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState r0 = r2.modelLoadingState     // Catch: java.lang.Throwable -> Lc
            com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState r1 = com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.REMOTE_MODEL_LOADED     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized void loadWithModelContentHandler(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelContentHandler r6) throws com.google.mlkit.common.MlKitException {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            r2 = 0
            boolean r3 = r5.zzc(r6, r0)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r4 = r2
            goto L14
        Le:
            r6 = move-exception
            goto L88
        L11:
            r3 = move-exception
            r4 = r3
            r3 = 0
        L14:
            if (r3 == 0) goto L21
            com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingLogger r6 = r5.zzb     // Catch: java.lang.Throwable -> Le
            r6.logErrorCodes(r0)     // Catch: java.lang.Throwable -> Le
            com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState r6 = com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.REMOTE_MODEL_LOADED     // Catch: java.lang.Throwable -> Le
            r5.modelLoadingState = r6     // Catch: java.lang.Throwable -> Le
            monitor-exit(r5)
            return
        L21:
            boolean r1 = r5.zzb(r6, r0)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L26
            goto L27
        L26:
            r2 = move-exception
        L27:
            if (r1 == 0) goto L34
            com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingLogger r6 = r5.zzb     // Catch: java.lang.Throwable -> Le
            r6.logErrorCodes(r0)     // Catch: java.lang.Throwable -> Le
            com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState r6 = com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.LOCAL_MODEL_LOADED     // Catch: java.lang.Throwable -> Le
            r5.modelLoadingState = r6     // Catch: java.lang.Throwable -> Le
            monitor-exit(r5)
            return
        L34:
            r6 = 17
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Le
            r0.add(r6)     // Catch: java.lang.Throwable -> Le
            com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingLogger r6 = r5.zzb     // Catch: java.lang.Throwable -> Le
            r6.logErrorCodes(r0)     // Catch: java.lang.Throwable -> Le
            com.google.mlkit.common.sdkinternal.model.ModelLoader$ModelLoadingState r6 = com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.NO_MODEL_LOADED     // Catch: java.lang.Throwable -> Le
            r5.modelLoadingState = r6     // Catch: java.lang.Throwable -> Le
            r6 = 14
            if (r4 != 0) goto L74
            if (r2 == 0) goto L60
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r5.zza()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "Local model load failed with the model options: "
            java.lang.String r1 = r3.concat(r1)     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1, r6, r2)     // Catch: java.lang.Throwable -> Le
            throw r0     // Catch: java.lang.Throwable -> Le
        L60:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r5.zza()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "Cannot load any model with the model options: "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> Le
            throw r0     // Catch: java.lang.Throwable -> Le
        L74:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r5.zza()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "Remote model load failed with the model options: "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1, r6, r4)     // Catch: java.lang.Throwable -> Le
            throw r0     // Catch: java.lang.Throwable -> Le
        L88:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            throw r6
    }
}
