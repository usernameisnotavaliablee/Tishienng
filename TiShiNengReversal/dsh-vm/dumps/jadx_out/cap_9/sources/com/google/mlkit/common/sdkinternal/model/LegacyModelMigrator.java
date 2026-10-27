package com.google.mlkit.common.sdkinternal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class LegacyModelMigrator {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    protected final com.google.mlkit.common.sdkinternal.model.ModelFileHelper modelFileHelper;
    private final com.google.android.gms.tasks.TaskCompletionSource zza;
    private final android.content.Context zzb;
    private final java.util.concurrent.Executor zzc;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected LegacyModelMigrator(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.model.ModelFileHelper r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            r1.modelFileHelper = r3
            java.util.concurrent.Executor r2 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            r1.zzc = r2
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected static void deleteIfEmpty(@androidx.annotation.NonNull java.io.File r1) {
            java.io.File[] r0 = r1.listFiles()
            if (r0 == 0) goto L9
            int r0 = r0.length
            if (r0 != 0) goto L18
        L9:
            boolean r0 = r1.delete()
            if (r0 != 0) goto L18
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Error deleting model directory "
            r0.concat(r1)
        L18:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected static boolean isValidFirebasePersistenceKey(@androidx.annotation.NonNull java.lang.String r3) {
            java.lang.String r0 = "\\+"
            r1 = -1
            java.lang.String[] r3 = r3.split(r0, r1)
            int r0 = r3.length
            r1 = 2
            r2 = 0
            if (r0 == r1) goto Ld
            return r2
        Ld:
            r0 = r3[r2]     // Catch: java.lang.IllegalArgumentException -> L19
            com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(r0)     // Catch: java.lang.IllegalArgumentException -> L19
            r0 = 1
            r3 = r3[r0]     // Catch: java.lang.IllegalArgumentException -> L19
            com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(r3)     // Catch: java.lang.IllegalArgumentException -> L19
            return r0
        L19:
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.VisibleForTesting
    public static void migrateFile(@androidx.annotation.NonNull java.io.File r1, @androidx.annotation.NonNull java.io.File r2) {
            boolean r0 = r1.exists()
            if (r0 != 0) goto L7
            goto L2e
        L7:
            boolean r0 = r2.exists()
            if (r0 != 0) goto L19
            boolean r0 = r1.renameTo(r2)
            if (r0 != 0) goto L19
            java.lang.String.valueOf(r1)
            java.lang.String.valueOf(r2)
        L19:
            boolean r2 = r1.exists()
            if (r2 == 0) goto L2e
            boolean r2 = r1.delete()
            if (r2 != 0) goto L2e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Error deleting model file "
            r2.concat(r1)
        L2e:
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.VisibleForTesting
    protected abstract java.lang.String getLegacyModelDirName();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.VisibleForTesting
    public java.io.File getLegacyRootDir() {
            r3 = this;
            android.content.Context r0 = r3.zzb
            java.lang.String r1 = r3.getLegacyModelDirName()
            java.io.File r2 = new java.io.File
            java.io.File r0 = r0.getNoBackupFilesDir()
            r2.<init>(r0, r1)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.tasks.Task<java.lang.Void> getMigrationTask() {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zza
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract void migrateAllModelDirs(@androidx.annotation.NonNull java.io.File r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    public void start() {
            r2 = this;
            com.google.mlkit.common.sdkinternal.model.zza r0 = new com.google.mlkit.common.sdkinternal.model.zza
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = r2.zzc
            r1.execute(r0)
            return
    }

    final /* synthetic */ void zza() {
            r4 = this;
            java.io.File r0 = r4.getLegacyRootDir()
            java.io.File[] r1 = r0.listFiles()
            if (r1 == 0) goto L19
            r2 = 0
        Lb:
            int r3 = r1.length
            if (r2 >= r3) goto L16
            r3 = r1[r2]
            r4.migrateAllModelDirs(r3)
            int r2 = r2 + 1
            goto Lb
        L16:
            deleteIfEmpty(r0)
        L19:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r4.zza
            r1 = 0
            r0.setResult(r1)
            return
    }
}
