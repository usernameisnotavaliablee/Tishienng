package com.google.mlkit.common.sdkinternal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ModelFileHelper {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int INVALID_INDEX = -1;

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public static final java.lang.String zza = null;

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public static final java.lang.String zzb = null;

    @androidx.annotation.VisibleForTesting
    static final java.lang.String zzc = null;
    private static final com.google.android.gms.common.internal.GmsLogger zzd = null;
    private final com.google.mlkit.common.sdkinternal.MlKitContext zze;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "ModelFileHelper"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd = r0
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r3 = "translate"
            r1[r2] = r3
            java.lang.String r3 = "com.google.mlkit.%s.models"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zza = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r4 = "custom"
            r1[r2] = r4
            java.lang.String r1 = java.lang.String.format(r3, r1)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzb = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "base"
            r0[r2] = r1
            java.lang.String r0 = java.lang.String.format(r3, r0)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzc = r0
            return
    }

    public ModelFileHelper(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.MlKitContext r1) {
            r0 = this;
            r0.<init>()
            r0.zze = r1
            return
    }

    @androidx.annotation.WorkerThread
    private final java.io.File zzc(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r4, boolean r5) throws com.google.mlkit.common.MlKitException {
            r2 = this;
            java.io.File r3 = r2.getModelDirUnsafe(r3, r4, r5)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L38
            com.google.android.gms.common.internal.GmsLogger r4 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd
            java.lang.String r5 = r3.getAbsolutePath()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "ModelFileHelper"
            java.lang.String r1 = "model folder does not exist, creating one: "
            java.lang.String r5 = r1.concat(r5)
            r4.d(r0, r5)
            boolean r4 = r3.mkdirs()
            if (r4 == 0) goto L26
            goto L3e
        L26:
            com.google.mlkit.common.MlKitException r4 = new com.google.mlkit.common.MlKitException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "Failed to create model folder: "
            java.lang.String r3 = r5.concat(r3)
            r5 = 13
            r4.<init>(r3, r5)
            throw r4
        L38:
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L3f
        L3e:
            return r3
        L3f:
            com.google.mlkit.common.MlKitException r4 = new com.google.mlkit.common.MlKitException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "Can not create model folder, since an existing file has the same name: "
            java.lang.String r3 = r5.concat(r3)
            r5 = 6
            r4.<init>(r3, r5)
            throw r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public synchronized void deleteAllModels(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            java.io.File r0 = r1.getModelDirUnsafe(r3, r2, r0)     // Catch: java.lang.Throwable -> L13
            r1.deleteRecursively(r0)     // Catch: java.lang.Throwable -> L13
            r0 = 1
            java.io.File r2 = r1.getModelDirUnsafe(r3, r2, r0)     // Catch: java.lang.Throwable -> L13
            r1.deleteRecursively(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public boolean deleteRecursively(@androidx.annotation.Nullable java.io.File r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            boolean r1 = r8.isDirectory()
            r2 = 1
            if (r1 == 0) goto L2c
            java.io.File[] r1 = r8.listFiles()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.io.File[] r1 = (java.io.File[]) r1
            int r3 = r1.length
            r4 = 0
            r5 = 1
        L18:
            if (r4 >= r3) goto L2a
            r6 = r1[r4]
            if (r5 == 0) goto L26
            boolean r5 = r7.deleteRecursively(r6)
            if (r5 == 0) goto L26
            r5 = 1
            goto L27
        L26:
            r5 = 0
        L27:
            int r4 = r4 + 1
            goto L18
        L2a:
            if (r5 == 0) goto L33
        L2c:
            boolean r8 = r8.delete()
            if (r8 == 0) goto L33
            return r2
        L33:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public void deleteTempFilesInPrivateFolder(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r4) throws com.google.mlkit.common.MlKitException {
            r2 = this;
            r0 = 1
            java.io.File r3 = r2.zzc(r3, r4, r0)
            boolean r4 = r2.deleteRecursively(r3)
            if (r4 != 0) goto L24
            com.google.android.gms.common.internal.GmsLogger r4 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd
            if (r3 == 0) goto L14
            java.lang.String r3 = r3.getAbsolutePath()
            goto L15
        L14:
            r3 = 0
        L15:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "ModelFileHelper"
            java.lang.String r1 = "Failed to delete the temp labels file directory: "
            java.lang.String r3 = r1.concat(r3)
            r4.e(r0, r3)
        L24:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public int getLatestCachedModelVersion(@androidx.annotation.NonNull java.io.File r8) {
            r7 = this;
            java.io.File[] r8 = r8.listFiles()
            r0 = -1
            if (r8 == 0) goto L34
            int r1 = r8.length
            if (r1 == 0) goto L34
            r2 = 0
        Lb:
            if (r2 >= r1) goto L34
            r3 = r8[r2]
            java.lang.String r4 = r3.getName()     // Catch: java.lang.NumberFormatException -> L1c
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L1c
            int r0 = java.lang.Math.max(r0, r4)     // Catch: java.lang.NumberFormatException -> L1c
            goto L31
        L1c:
            com.google.android.gms.common.internal.GmsLogger r4 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "ModelFileHelper"
            java.lang.String r6 = "Contains non-integer file name "
            java.lang.String r3 = r6.concat(r3)
            r4.d(r5, r3)
        L31:
            int r2 = r2 + 1
            goto Lb
        L34:
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public java.io.File getModelDir(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r3) throws com.google.mlkit.common.MlKitException {
            r1 = this;
            r0 = 0
            java.io.File r2 = r1.zzc(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public java.io.File getModelDirUnsafe(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r4, boolean r5) {
            r2 = this;
            com.google.mlkit.common.sdkinternal.ModelType r0 = com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN
            int r0 = r4.ordinal()
            r1 = 1
            if (r0 == r1) goto L35
            r1 = 2
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 != r1) goto L12
            java.lang.String r4 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzb
            goto L37
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.name()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unknown model type "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = ". Cannot find a dir to store the downloaded model."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L32:
            java.lang.String r4 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zza
            goto L37
        L35:
            java.lang.String r4 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzc
        L37:
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = r2.zze
            java.io.File r1 = new java.io.File
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.io.File r0 = r0.getNoBackupFilesDir()
            r1.<init>(r0, r4)
            if (r5 == 0) goto L54
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "temp"
            r4.<init>(r1, r5)
            r1 = r4
        L54:
            java.io.File r4 = new java.io.File
            r4.<init>(r1, r3)
            return r4
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public java.io.File getModelTempDir(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r3) throws com.google.mlkit.common.MlKitException {
            r1 = this;
            r0 = 1
            java.io.File r2 = r1.zzc(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public java.io.File getTempFileInPrivateFolder(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r6, @androidx.annotation.NonNull java.lang.String r7) throws com.google.mlkit.common.MlKitException {
            r4 = this;
            r0 = 1
            java.io.File r5 = r4.zzc(r5, r6, r0)
            boolean r6 = r5.exists()
            r0 = 13
            if (r6 == 0) goto L2e
            boolean r6 = r5.isFile()
            if (r6 == 0) goto L2e
            boolean r6 = r5.delete()
            if (r6 == 0) goto L1a
            goto L2e
        L1a:
            com.google.mlkit.common.MlKitException r6 = new com.google.mlkit.common.MlKitException
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r7 = "Failed to delete the temp labels file: "
            java.lang.String r5 = r7.concat(r5)
            r6.<init>(r5, r0)
            throw r6
        L2e:
            boolean r6 = r5.exists()
            if (r6 != 0) goto L58
            com.google.android.gms.common.internal.GmsLogger r6 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd
            java.lang.String r1 = r5.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "ModelFileHelper"
            java.lang.String r3 = "Temp labels folder does not exist, creating one: "
            java.lang.String r1 = r3.concat(r1)
            r6.d(r2, r1)
            boolean r6 = r5.mkdirs()
            if (r6 == 0) goto L50
            goto L58
        L50:
            com.google.mlkit.common.MlKitException r5 = new com.google.mlkit.common.MlKitException
            java.lang.String r6 = "Failed to create a directory to hold the AutoML model's labels file."
            r5.<init>(r6, r0)
            throw r5
        L58:
            java.io.File r6 = new java.io.File
            r6.<init>(r5, r7)
            return r6
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public boolean modelExistsLocally(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r5) throws com.google.mlkit.common.MlKitException {
            r3 = this;
            com.google.mlkit.common.sdkinternal.ModelType r0 = com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN
            if (r5 != r0) goto L5
            goto L37
        L5:
            java.lang.String r4 = r3.zzb(r4, r5)
            if (r4 == 0) goto L37
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r4 = r5.exists()
            if (r4 == 0) goto L37
            java.io.File r4 = new java.io.File
            java.lang.String r0 = "model.tflite"
            r4.<init>(r5, r0)
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd
            java.lang.String r0 = r4.getAbsolutePath()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "ModelFileHelper"
            java.lang.String r2 = "Model file path: "
            java.lang.String r0 = r2.concat(r0)
            r5.i(r1, r0)
            boolean r4 = r4.exists()
            return r4
        L37:
            r4 = 0
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    public final java.io.File zza(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r3) throws com.google.mlkit.common.MlKitException {
            r1 = this;
            r0 = 1
            java.io.File r2 = r1.zzc(r2, r3, r0)
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    public final java.lang.String zzb(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r3) throws com.google.mlkit.common.MlKitException {
            r1 = this;
            java.io.File r2 = r1.getModelDir(r2, r3)
            int r3 = r1.getLatestCachedModelVersion(r2)
            r0 = -1
            if (r3 != r0) goto Ld
            r2 = 0
            return r2
        Ld:
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "/"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
