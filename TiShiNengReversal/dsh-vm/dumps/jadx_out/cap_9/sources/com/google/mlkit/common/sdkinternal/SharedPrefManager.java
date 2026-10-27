package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class SharedPrefManager {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.firebase.components.Component<?> COMPONENT = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String PREF_FILE = "com.google.mlkit.internal";

    @androidx.annotation.NonNull
    protected final android.content.Context zza;

    static {
            java.lang.Class<com.google.mlkit.common.sdkinternal.SharedPrefManager> r0 = com.google.mlkit.common.sdkinternal.SharedPrefManager.class
            com.google.firebase.components.Component$Builder r0 = com.google.firebase.components.Component.builder(r0)
            java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitContext> r1 = com.google.mlkit.common.sdkinternal.MlKitContext.class
            com.google.firebase.components.Dependency r1 = com.google.firebase.components.Dependency.required(r1)
            com.google.firebase.components.Component$Builder r0 = r0.add(r1)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            com.google.firebase.components.Dependency r1 = com.google.firebase.components.Dependency.required(r1)
            com.google.firebase.components.Component$Builder r0 = r0.add(r1)
            com.google.mlkit.common.sdkinternal.zzs r1 = new com.google.mlkit.common.sdkinternal.zzs
            r1.<init>()
            com.google.firebase.components.Component$Builder r0 = r0.factory(r1)
            com.google.firebase.components.Component r0 = r0.build()
            com.google.mlkit.common.sdkinternal.SharedPrefManager.COMPONENT = r0
            return
    }

    public SharedPrefManager(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.common.sdkinternal.SharedPrefManager getInstance(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.MlKitContext r1) {
            java.lang.Class<com.google.mlkit.common.sdkinternal.SharedPrefManager> r0 = com.google.mlkit.common.sdkinternal.SharedPrefManager.class
            java.lang.Object r1 = r1.get(r0)
            com.google.mlkit.common.sdkinternal.SharedPrefManager r1 = (com.google.mlkit.common.sdkinternal.SharedPrefManager) r1
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized void clearDownloadingModelInfo(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r7) {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = r6.getDownloadingModelHash(r7)     // Catch: java.lang.Throwable -> L6a
            android.content.SharedPreferences r1 = r6.zza()     // Catch: java.lang.Throwable -> L6a
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = r7.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L6a
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6a
            r5 = 0
            r4[r5] = r2     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "downloading_model_id_%s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch: java.lang.Throwable -> L6a
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = r7.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6a
            r4[r5] = r2     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "downloading_model_hash_%s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch: java.lang.Throwable -> L6a
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6a
            r2[r5] = r0     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "downloading_model_type_%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch: java.lang.Throwable -> L6a
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = r7.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6a
            r2[r5] = r1     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "downloading_begin_time_%s"
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L6a
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = r7.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6a
            r1[r5] = r7     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = "model_first_use_time_%s"
            java.lang.String r7 = java.lang.String.format(r7, r1)     // Catch: java.lang.Throwable -> L6a
            android.content.SharedPreferences$Editor r7 = r0.remove(r7)     // Catch: java.lang.Throwable -> L6a
            r7.apply()     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r6)
            return
        L6a:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6a
            throw r7
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized void clearIncompatibleModelInfo(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L28
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L28
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "bad_hash_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L28
            android.content.SharedPreferences$Editor r4 = r0.remove(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = "app_version"
            android.content.SharedPreferences$Editor r4 = r4.remove(r0)     // Catch: java.lang.Throwable -> L28
            r4.apply()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)
            return
        L28:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public synchronized void clearLatestModelHash(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L22
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "current_model_hash_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences$Editor r4 = r0.remove(r4)     // Catch: java.lang.Throwable -> L22
            r4.commit()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            return
        L22:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized java.lang.String getDownloadingModelHash(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "downloading_model_hash_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            java.lang.String r4 = r0.getString(r4, r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r3)
            return r4
        L1c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized java.lang.Long getDownloadingModelId(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r5) {
            r4 = this;
            monitor-enter(r4)
            android.content.SharedPreferences r0 = r4.zza()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r5.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L2a
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = "downloading_model_id_%s"
            java.lang.String r5 = java.lang.String.format(r5, r1)     // Catch: java.lang.Throwable -> L2a
            r1 = -1
            long r0 = r0.getLong(r5, r1)     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L24
            monitor-exit(r4)
            r5 = 0
            return r5
        L24:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return r5
        L2a:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r5
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized java.lang.String getIncompatibleModelHash(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "bad_hash_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            java.lang.String r4 = r0.getString(r4, r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r3)
            return r4
        L1c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized java.lang.String getLatestModelHash(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "current_model_hash_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            java.lang.String r4 = r0.getString(r4, r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r3)
            return r4
        L1c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized java.lang.String getMlSdkInstanceId() {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "ml_sdk_instance_id"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L10
            monitor-exit(r3)
            return r0
        L10:
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2b
            android.content.SharedPreferences r1 = r3.zza()     // Catch: java.lang.Throwable -> L2b
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "ml_sdk_instance_id"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r0)     // Catch: java.lang.Throwable -> L2b
            r1.apply()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r3)
            return r0
        L2b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized long getModelDownloadBeginTimeMs(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L1d
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = "downloading_begin_time_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            long r0 = r0.getLong(r4, r1)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r0
        L1d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized long getModelFirstUseTimeMs(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L1d
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = "model_first_use_time_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            long r0 = r0.getLong(r4, r1)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r0
        L1d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized java.lang.String getPreviousAppVersion() {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "app_version"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r3)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized void setDownloadingModelInfo(long r7, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelInfo r9) {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = r9.getModelNameForPersist()     // Catch: java.lang.Throwable -> L46
            java.lang.String r9 = r9.getModelHash()     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences r1 = r6.zza()     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L46
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L46
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = "downloading_model_hash_%s"
            java.lang.String r3 = java.lang.String.format(r5, r3)     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r9 = r1.putString(r3, r9)     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L46
            r1[r4] = r0     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "downloading_model_id_%s"
            java.lang.String r1 = java.lang.String.format(r3, r1)     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r7 = r9.putLong(r1, r7)     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L46
            r8[r4] = r0     // Catch: java.lang.Throwable -> L46
            java.lang.String r9 = "downloading_begin_time_%s"
            java.lang.String r8 = java.lang.String.format(r9, r8)     // Catch: java.lang.Throwable -> L46
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r7 = r7.putLong(r8, r0)     // Catch: java.lang.Throwable -> L46
            r7.apply()     // Catch: java.lang.Throwable -> L46
            monitor-exit(r6)
            return
        L46:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L46
            throw r7
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized void setIncompatibleModelInfo(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull java.lang.String r6) {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L28
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L28
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "bad_hash_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L28
            android.content.SharedPreferences$Editor r4 = r0.putString(r4, r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = "app_version"
            android.content.SharedPreferences$Editor r4 = r4.putString(r5, r6)     // Catch: java.lang.Throwable -> L28
            r4.apply()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)
            return
        L28:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized void setLatestModelHash(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r4, @androidx.annotation.NonNull java.lang.String r5) {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L22
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "current_model_hash_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences$Editor r4 = r0.putString(r4, r5)     // Catch: java.lang.Throwable -> L22
            r4.apply()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            return
        L22:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public synchronized void setModelFirstUseTimeMs(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r4, long r5) {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L22
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "model_first_use_time_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences$Editor r4 = r0.putLong(r4, r5)     // Catch: java.lang.Throwable -> L22
            r4.apply()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            return
        L22:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    @androidx.annotation.NonNull
    protected final android.content.SharedPreferences zza() {
            r3 = this;
            android.content.Context r0 = r3.zza
            java.lang.String r1 = "com.google.mlkit.internal"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public final synchronized java.lang.String zzb(@androidx.annotation.NonNull java.lang.String r3, long r4) {
            r2 = this;
            monitor-enter(r2)
            android.content.SharedPreferences r0 = r2.zza()     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L23
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L23
            r1 = 0
            r5[r1] = r3     // Catch: java.lang.Throwable -> L23
            r3 = 1
            r5[r3] = r4     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "cached_local_model_hash_%1s_%2s"
            java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch: java.lang.Throwable -> L23
            r4 = 0
            java.lang.String r3 = r0.getString(r3, r4)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return r3
        L23:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    public final synchronized void zzc(@androidx.annotation.NonNull java.lang.String r3, long r4, @androidx.annotation.NonNull java.lang.String r6) {
            r2 = this;
            monitor-enter(r2)
            android.content.SharedPreferences r0 = r2.zza()     // Catch: java.lang.Throwable -> L29
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L29
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L29
            r1 = 0
            r5[r1] = r3     // Catch: java.lang.Throwable -> L29
            r3 = 1
            r5[r3] = r4     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "cached_local_model_hash_%1s_%2s"
            java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch: java.lang.Throwable -> L29
            android.content.SharedPreferences$Editor r3 = r0.putString(r3, r6)     // Catch: java.lang.Throwable -> L29
            r3.apply()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)
            return
        L29:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            throw r3
    }
}
