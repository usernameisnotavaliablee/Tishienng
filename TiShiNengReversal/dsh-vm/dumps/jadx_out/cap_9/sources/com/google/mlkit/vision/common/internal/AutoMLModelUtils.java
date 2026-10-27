package com.google.mlkit.vision.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@androidx.annotation.WorkerThread
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AutoMLModelUtils {
    private AutoMLModelUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String[] getModelAndLabelFilePaths(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull com.google.mlkit.common.model.LocalModel r4, boolean r5) throws java.io.IOException {
            if (r5 == 0) goto Ld
            java.lang.String r0 = r4.getAssetFilePath()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L17
        Ld:
            java.lang.String r0 = r4.getAbsoluteFilePath()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
        L17:
            boolean r4 = r4.isManifestFile()
            if (r4 == 0) goto L6d
            com.google.mlkit.common.internal.model.ModelUtils$AutoMLManifest r3 = com.google.mlkit.common.internal.model.ModelUtils.parseManifestFile(r0, r5, r3)
            if (r3 == 0) goto L65
            java.lang.String r4 = r3.getModelType()
            java.lang.String r5 = "IMAGE_LABELING"
            boolean r4 = r5.equals(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            java.lang.String r5 = "Model type should be: %s."
            com.google.android.gms.common.internal.Preconditions.checkState(r4, r5, r1)
            java.io.File r4 = new java.io.File
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            java.lang.String r5 = r5.getParent()
            java.lang.String r0 = r3.getModelFile()
            r4.<init>(r5, r0)
            java.lang.String r0 = r4.toString()
            java.io.File r4 = new java.io.File
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            java.lang.String r5 = r5.getParent()
            java.lang.String r3 = r3.getLabelsFile()
            r4.<init>(r5, r3)
            java.lang.String r3 = r4.toString()
            goto L6f
        L65:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Failed to parse manifest file."
            r3.<init>(r4)
            throw r3
        L6d:
            java.lang.String r3 = ""
        L6f:
            java.lang.String[] r3 = new java.lang.String[]{r0, r3}
            return r3
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.util.List<java.lang.String> readLabelsFile(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.lang.String r5, boolean r6) throws java.io.IOException {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r6 == 0) goto L12
            android.content.res.AssetManager r4 = r4.getAssets()
            java.io.InputStream r4 = r4.open(r5)
            goto L1c
        L12:
            java.io.FileInputStream r4 = new java.io.FileInputStream
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            r4.<init>(r6)
        L1c:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "UTF-8"
            r6.<init>(r4, r2)     // Catch: java.lang.Throwable -> L36
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L36
        L2c:
            if (r6 == 0) goto L38
            r1.add(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L36
            goto L2c
        L36:
            r5 = move-exception
            goto L3e
        L38:
            if (r4 == 0) goto L3d
            r4.close()
        L3d:
            return r1
        L3e:
            if (r4 == 0) goto L58
            r4.close()     // Catch: java.lang.Throwable -> L44
            goto L58
        L44:
            r4 = move-exception
            java.lang.String r6 = "addSuppressed"
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L58
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Exception -> L58
            java.lang.reflect.Method r6 = r0.getDeclaredMethod(r6, r2)     // Catch: java.lang.Exception -> L58
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L58
            r0[r3] = r4     // Catch: java.lang.Exception -> L58
            r6.invoke(r5, r0)     // Catch: java.lang.Exception -> L58
        L58:
            throw r5
    }
}
