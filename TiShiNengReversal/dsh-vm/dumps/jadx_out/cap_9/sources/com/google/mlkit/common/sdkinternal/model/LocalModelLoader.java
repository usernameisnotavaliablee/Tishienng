package com.google.mlkit.common.sdkinternal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class LocalModelLoader {
    private java.nio.MappedByteBuffer zza;
    private final android.content.Context zzb;
    private final com.google.mlkit.common.model.LocalModel zzc;

    @com.google.android.gms.common.annotation.KeepForSdk
    public LocalModelLoader(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.google.mlkit.common.model.LocalModel r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.mlkit.common.model.LocalModel getLocalModel() {
            r1 = this;
            com.google.mlkit.common.model.LocalModel r0 = r1.zzc
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public java.nio.MappedByteBuffer load() throws com.google.mlkit.common.MlKitException {
            r11 = this;
            android.content.Context r0 = r11.zzb
            java.lang.String r1 = "Context can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.mlkit.common.model.LocalModel r0 = r11.zzc
            java.lang.String r1 = "Model source can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            java.nio.MappedByteBuffer r0 = r11.zza
            if (r0 == 0) goto L13
            return r0
        L13:
            com.google.mlkit.common.model.LocalModel r0 = r11.zzc
            java.lang.String r1 = r0.getAbsoluteFilePath()
            java.lang.String r2 = r0.getAssetFilePath()
            android.net.Uri r3 = r0.getUri()
            java.lang.String r0 = "r"
            r4 = 14
            if (r1 == 0) goto L77
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L46
            r2.<init>(r1, r0)     // Catch: java.io.IOException -> L46
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch: java.lang.Throwable -> L48
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4b
            long r9 = r5.size()     // Catch: java.lang.Throwable -> L4b
            r7 = 0
            java.nio.MappedByteBuffer r0 = r5.map(r6, r7, r9)     // Catch: java.lang.Throwable -> L4b
            r11.zza = r0     // Catch: java.lang.Throwable -> L4b
            r5.close()     // Catch: java.lang.Throwable -> L48
            r2.close()     // Catch: java.io.IOException -> L46
            goto L106
        L46:
            r0 = move-exception
            goto L61
        L48:
            r0 = move-exception
            r1 = r0
            goto L58
        L4b:
            r0 = move-exception
            r1 = r0
            if (r5 == 0) goto L57
            r5.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L48
        L57:
            throw r1     // Catch: java.lang.Throwable -> L48
        L58:
            r2.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.io.IOException -> L46
        L60:
            throw r1     // Catch: java.io.IOException -> L46
        L61:
            com.google.mlkit.common.model.LocalModel r1 = r11.zzc
            com.google.mlkit.common.MlKitException r2 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = r1.getAbsoluteFilePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Can not open the local file: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1, r4, r0)
            throw r2
        L77:
            if (r2 == 0) goto Le0
            android.content.Context r0 = r11.zzb     // Catch: java.io.IOException -> La7
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.io.IOException -> La7
            android.content.res.AssetFileDescriptor r1 = r0.openFd(r2)     // Catch: java.io.IOException -> La7
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> La9
            java.io.FileDescriptor r3 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> La9
            r0.<init>(r3)     // Catch: java.lang.Throwable -> La9
            java.nio.channels.FileChannel r5 = r0.getChannel()     // Catch: java.lang.Throwable -> La9
            long r7 = r1.getStartOffset()     // Catch: java.lang.Throwable -> Lac
            long r9 = r1.getDeclaredLength()     // Catch: java.lang.Throwable -> Lac
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> Lac
            java.nio.MappedByteBuffer r0 = r5.map(r6, r7, r9)     // Catch: java.lang.Throwable -> Lac
            r11.zza = r0     // Catch: java.lang.Throwable -> Lac
            r5.close()     // Catch: java.lang.Throwable -> La9
            r1.close()     // Catch: java.io.IOException -> La7
            goto L106
        La7:
            r0 = move-exception
            goto Lc4
        La9:
            r0 = move-exception
            r3 = r0
            goto Lb9
        Lac:
            r0 = move-exception
            r3 = r0
            if (r5 == 0) goto Lb8
            r5.close()     // Catch: java.lang.Throwable -> Lb4
            goto Lb8
        Lb4:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> La9
        Lb8:
            throw r3     // Catch: java.lang.Throwable -> La9
        Lb9:
            if (r1 == 0) goto Lc3
            r1.close()     // Catch: java.lang.Throwable -> Lbf
            goto Lc3
        Lbf:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.io.IOException -> La7
        Lc3:
            throw r3     // Catch: java.io.IOException -> La7
        Lc4:
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Can not load the file from asset: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r4, r0)
            throw r1
        Le0:
            if (r3 == 0) goto L136
            android.content.Context r1 = r11.zzb     // Catch: java.io.IOException -> L109
            android.content.res.AssetFileDescriptor r1 = com.google.android.gms.internal.mlkit_common.zzi.zza(r1, r3, r0)     // Catch: java.io.IOException -> L109
            java.io.FileInputStream r0 = r1.createInputStream()     // Catch: java.lang.Throwable -> L10b
            java.nio.channels.FileChannel r5 = r0.getChannel()     // Catch: java.lang.Throwable -> L10b
            long r7 = r1.getStartOffset()     // Catch: java.lang.Throwable -> L10e
            long r9 = r1.getLength()     // Catch: java.lang.Throwable -> L10e
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L10e
            java.nio.MappedByteBuffer r0 = r5.map(r6, r7, r9)     // Catch: java.lang.Throwable -> L10e
            r11.zza = r0     // Catch: java.lang.Throwable -> L10e
            r5.close()     // Catch: java.lang.Throwable -> L10b
            r1.close()     // Catch: java.io.IOException -> L109
        L106:
            java.nio.MappedByteBuffer r0 = r11.zza
            return r0
        L109:
            r0 = move-exception
            goto L126
        L10b:
            r0 = move-exception
            r2 = r0
            goto L11b
        L10e:
            r0 = move-exception
            r2 = r0
            if (r5 == 0) goto L11a
            r5.close()     // Catch: java.lang.Throwable -> L116
            goto L11a
        L116:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L10b
        L11a:
            throw r2     // Catch: java.lang.Throwable -> L10b
        L11b:
            if (r1 == 0) goto L125
            r1.close()     // Catch: java.lang.Throwable -> L121
            goto L125
        L121:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.io.IOException -> L109
        L125:
            throw r2     // Catch: java.io.IOException -> L109
        L126:
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "Can not load the file from URI: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2, r4, r0)
            throw r1
        L136:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Can not load the model. One of filePath, assetFilePath or URI must be set for the model."
            r0.<init>(r1, r4)
            throw r0
    }
}
