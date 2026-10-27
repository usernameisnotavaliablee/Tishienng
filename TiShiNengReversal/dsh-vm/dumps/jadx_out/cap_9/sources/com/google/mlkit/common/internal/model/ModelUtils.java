package com.google.mlkit.common.internal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@androidx.annotation.WorkerThread
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ModelUtils {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static abstract class AutoMLManifest {
        public AutoMLManifest() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public abstract java.lang.String getLabelsFile();

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public abstract java.lang.String getModelFile();

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public abstract java.lang.String getModelType();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static abstract class ModelLoggingInfo {
        public ModelLoggingInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        static com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo zza(long r1, @androidx.annotation.Nullable java.lang.String r3, boolean r4) {
                java.lang.String r3 = com.google.android.gms.internal.mlkit_common.zzu.zzb(r3)
                com.google.mlkit.common.internal.model.AutoValue_ModelUtils_ModelLoggingInfo r0 = new com.google.mlkit.common.internal.model.AutoValue_ModelUtils_ModelLoggingInfo
                r0.<init>(r1, r3, r4)
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public abstract java.lang.String getHash();

        @com.google.android.gms.common.annotation.KeepForSdk
        public abstract long getSize();

        @com.google.android.gms.common.annotation.KeepForSdk
        public abstract boolean isManifestModel();
    }

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "ModelUtils"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.common.internal.model.ModelUtils.zza = r0
            return
    }

    private ModelUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo getModelLoggingInfo(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull com.google.mlkit.common.model.LocalModel r12) {
            java.lang.String r0 = r12.getAssetFilePath()
            java.lang.String r1 = r12.getAbsoluteFilePath()
            android.net.Uri r2 = r12.getUri()
            java.lang.String r3 = "Failed to open model file"
            java.lang.String r4 = "ModelUtils"
            r5 = 0
            if (r0 == 0) goto L46
            boolean r6 = r12.isManifestFile()
            if (r6 == 0) goto L22
            r6 = 1
            java.lang.String r0 = zzb(r11, r0, r6)
            if (r0 == 0) goto L21
            goto L22
        L21:
            return r5
        L22:
            android.content.res.AssetManager r6 = r11.getAssets()     // Catch: java.io.IOException -> L32
            android.content.res.AssetFileDescriptor r6 = r6.openFd(r0)     // Catch: java.io.IOException -> L32
            long r7 = r6.getLength()     // Catch: java.lang.Throwable -> L34
            r6.close()     // Catch: java.io.IOException -> L32
            goto L70
        L32:
            r11 = move-exception
            goto L40
        L34:
            r11 = move-exception
            if (r6 == 0) goto L3f
            r6.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch: java.io.IOException -> L32
        L3f:
            throw r11     // Catch: java.io.IOException -> L32
        L40:
            com.google.android.gms.common.internal.GmsLogger r12 = com.google.mlkit.common.internal.model.ModelUtils.zza
            r12.e(r4, r3, r11)
            return r5
        L46:
            if (r1 == 0) goto L61
            boolean r6 = r12.isManifestFile()
            if (r6 == 0) goto L57
            r6 = 0
            java.lang.String r1 = zzb(r11, r1, r6)
            if (r1 == 0) goto L56
            goto L57
        L56:
            return r5
        L57:
            java.io.File r6 = new java.io.File
            r6.<init>(r1)
            long r7 = r6.length()
            goto L70
        L61:
            if (r2 == 0) goto L128
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r6 = com.google.android.gms.internal.mlkit_common.zzi.zza(r11, r2, r6)     // Catch: java.io.IOException -> L114
            long r7 = r6.getLength()     // Catch: java.lang.Throwable -> L116
            r6.close()     // Catch: java.io.IOException -> L114
        L70:
            com.google.mlkit.common.sdkinternal.MlKitContext r6 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()
            java.lang.Class<com.google.mlkit.common.sdkinternal.SharedPrefManager> r9 = com.google.mlkit.common.sdkinternal.SharedPrefManager.class
            java.lang.Object r6 = r6.get(r9)
            com.google.mlkit.common.sdkinternal.SharedPrefManager r6 = (com.google.mlkit.common.sdkinternal.SharedPrefManager) r6
            if (r0 == 0) goto L80
            r9 = r0
            goto L8e
        L80:
            if (r1 == 0) goto L84
            r9 = r1
            goto L8e
        L84:
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r9 = r9.toString()
        L8e:
            java.lang.String r10 = r6.zzb(r9, r7)
            if (r10 == 0) goto L9d
            boolean r11 = r12.isManifestFile()
            com.google.mlkit.common.internal.model.ModelUtils$ModelLoggingInfo r11 = com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo.zza(r7, r10, r11)
            return r11
        L9d:
            java.lang.String r10 = "Failed to close model file"
            if (r0 == 0) goto Lae
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            java.io.InputStream r11 = r11.open(r0)     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            goto Lc9
        Laa:
            r11 = move-exception
            goto Lf1
        Lac:
            r11 = move-exception
            goto Lf3
        Lae:
            if (r1 == 0) goto Lbb
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            goto Lc9
        Lbb:
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            int r1 = com.google.android.gms.internal.mlkit_common.zzi.zza     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            com.google.android.gms.internal.mlkit_common.zzh r1 = com.google.android.gms.internal.mlkit_common.zzh.zza     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            java.io.InputStream r11 = com.google.android.gms.internal.mlkit_common.zzi.zzb(r11, r0, r1)     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
        Lc9:
            if (r11 == 0) goto Ld4
            java.lang.String r0 = zzc(r11)     // Catch: java.lang.Throwable -> Ld0 java.io.IOException -> Ld2
            goto Ld5
        Ld0:
            r12 = move-exception
            goto Lef
        Ld2:
            r12 = move-exception
            goto Lf5
        Ld4:
            r0 = r5
        Ld5:
            if (r0 == 0) goto Lda
            r6.zzc(r9, r7, r0)     // Catch: java.lang.Throwable -> Ld0 java.io.IOException -> Ld2
        Lda:
            boolean r12 = r12.isManifestFile()     // Catch: java.lang.Throwable -> Ld0 java.io.IOException -> Ld2
            com.google.mlkit.common.internal.model.ModelUtils$ModelLoggingInfo r12 = com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo.zza(r7, r0, r12)     // Catch: java.lang.Throwable -> Ld0 java.io.IOException -> Ld2
            if (r11 == 0) goto Lee
            r11.close()     // Catch: java.io.IOException -> Le8
            return r12
        Le8:
            r11 = move-exception
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.internal.model.ModelUtils.zza
            r0.e(r4, r10, r11)
        Lee:
            return r12
        Lef:
            r5 = r11
            goto L107
        Lf1:
            r12 = r11
            goto L107
        Lf3:
            r12 = r11
            r11 = r5
        Lf5:
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.internal.model.ModelUtils.zza     // Catch: java.lang.Throwable -> Ld0
            r0.e(r4, r3, r12)     // Catch: java.lang.Throwable -> Ld0
            if (r11 == 0) goto L106
            r11.close()     // Catch: java.io.IOException -> L100
            goto L106
        L100:
            r11 = move-exception
            com.google.android.gms.common.internal.GmsLogger r12 = com.google.mlkit.common.internal.model.ModelUtils.zza
            r12.e(r4, r10, r11)
        L106:
            return r5
        L107:
            if (r5 == 0) goto L113
            r5.close()     // Catch: java.io.IOException -> L10d
            goto L113
        L10d:
            r11 = move-exception
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.internal.model.ModelUtils.zza
            r0.e(r4, r10, r11)
        L113:
            throw r12
        L114:
            r11 = move-exception
            goto L122
        L116:
            r11 = move-exception
            if (r6 == 0) goto L121
            r6.close()     // Catch: java.lang.Throwable -> L11d
            goto L121
        L11d:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch: java.io.IOException -> L114
        L121:
            throw r11     // Catch: java.io.IOException -> L114
        L122:
            com.google.android.gms.common.internal.GmsLogger r12 = com.google.mlkit.common.internal.model.ModelUtils.zza
            r12.e(r4, r3, r11)
            return r5
        L128:
            com.google.android.gms.common.internal.GmsLogger r11 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r12 = "Local model doesn't have any valid path."
            r11.e(r4, r12)
            return r5
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getSHA256(@androidx.annotation.NonNull java.io.File r2) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L17
            r0.<init>(r2)     // Catch: java.io.IOException -> L17
            java.lang.String r2 = zzc(r0)     // Catch: java.lang.Throwable -> Ld
            r0.close()     // Catch: java.io.IOException -> L17
            return r2
        Ld:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.io.IOException -> L17
        L16:
            throw r2     // Catch: java.io.IOException -> L17
        L17:
            r2 = move-exception
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "Failed to create FileInputStream for model: "
            java.lang.String r2 = r1.concat(r2)
            java.lang.String r1 = "ModelUtils"
            r0.e(r1, r2)
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest parseManifestFile(@androidx.annotation.NonNull java.lang.String r5, boolean r6, @androidx.annotation.NonNull android.content.Context r7) {
            java.lang.String r0 = java.lang.String.valueOf(r5)
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r2 = "Manifest file path: "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "ModelUtils"
            r1.d(r2, r0)
            r0 = 0
            if (r6 == 0) goto L22
            android.content.res.AssetManager r3 = r7.getAssets()     // Catch: java.io.IOException -> L2d
            java.io.InputStream r3 = r3.open(r5)     // Catch: java.io.IOException -> L2d
            if (r3 == 0) goto L35
            r3.close()     // Catch: java.io.IOException -> L2d
            goto L35
        L22:
            java.io.File r3 = new java.io.File
            r3.<init>(r5)
            boolean r3 = r3.exists()
            if (r3 != 0) goto L35
        L2d:
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r6 = "Manifest file does not exist."
            r5.e(r2, r6)
            return r0
        L35:
            boolean r3 = r5.isEmpty()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r4 = 0
            if (r3 == 0) goto L43
            byte[] r5 = new byte[r4]     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            goto L66
        L3f:
            r5 = move-exception
            goto Laa
        L41:
            r5 = move-exception
            goto Laa
        L43:
            if (r6 == 0) goto L4e
            android.content.res.AssetManager r6 = r7.getAssets()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.io.InputStream r5 = r6.open(r5)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            goto L59
        L4e:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.io.File r7 = new java.io.File     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r7.<init>(r5)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r6.<init>(r7)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r5 = r6
        L59:
            int r6 = r5.available()     // Catch: java.lang.Throwable -> L9e
            byte[] r7 = new byte[r6]     // Catch: java.lang.Throwable -> L9e
            r5.read(r7, r4, r6)     // Catch: java.lang.Throwable -> L9e
            r5.close()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r5 = r7
        L66:
            java.lang.String r6 = new java.lang.String     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r7 = "UTF-8"
            r6.<init>(r5, r7)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r5.<init>()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r7 = "Json string from the manifest file: "
            r5.append(r7)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r5.append(r6)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r1.d(r2, r5)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r5.<init>(r6)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r6 = "modelType"
            java.lang.String r6 = r5.getString(r6)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r7 = "modelFile"
            java.lang.String r7 = r5.getString(r7)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r1 = "labelsFile"
            java.lang.String r5 = r5.getString(r1)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest r1 = new com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r1.<init>(r6, r7, r5)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            return r1
        L9e:
            r6 = move-exception
            if (r5 == 0) goto La9
            r5.close()     // Catch: java.lang.Throwable -> La5
            goto La9
        La5:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
        La9:
            throw r6     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
        Laa:
            com.google.android.gms.common.internal.GmsLogger r6 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r7 = "Error parsing the manifest file."
            r6.e(r2, r7, r5)
            return r0
    }

    public static boolean zza(@androidx.annotation.NonNull java.io.File r4, @androidx.annotation.NonNull java.lang.String r5) {
            java.lang.String r4 = getSHA256(r4)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r2 = "ModelUtils"
            java.lang.String r3 = "Calculated hash value is: "
            java.lang.String r0 = r3.concat(r0)
            r1.d(r2, r0)
            boolean r4 = r5.equals(r4)
            return r4
    }

    @androidx.annotation.Nullable
    private static java.lang.String zzb(android.content.Context r1, java.lang.String r2, boolean r3) {
            com.google.mlkit.common.internal.model.ModelUtils$AutoMLManifest r1 = parseManifestFile(r2, r3, r1)
            if (r1 != 0) goto L11
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r2 = "ModelUtils"
            java.lang.String r3 = "Failed to parse manifest file."
            r1.e(r2, r3)
            r1 = 0
            return r1
        L11:
            java.io.File r3 = new java.io.File
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.lang.String r2 = r0.getParent()
            java.lang.String r1 = r1.getModelFile()
            r3.<init>(r2, r1)
            java.lang.String r1 = r3.toString()
            return r1
    }

    @androidx.annotation.Nullable
    private static java.lang.String zzc(java.io.InputStream r6) {
            java.lang.String r0 = "ModelUtils"
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            r2 = 1048576(0x100000, float:1.469368E-39)
            byte[] r2 = new byte[r2]     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
        Lc:
            int r3 = r6.read(r2)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L18
            r1.update(r2, r5, r3)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            goto Lc
        L18:
            byte[] r6 = r1.digest()     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            r1.<init>()     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
        L21:
            int r2 = r6.length     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            if (r5 >= r2) goto L3e
            r2 = r6[r5]     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            int r3 = r2.length()     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            r4 = 1
            if (r3 != r4) goto L38
            r3 = 48
            r1.append(r3)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
        L38:
            r1.append(r2)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            int r5 = r5 + 1
            goto L21
        L3e:
            java.lang.String r6 = r1.toString()     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            return r6
        L43:
            com.google.android.gms.common.internal.GmsLogger r6 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r1 = "Failed to read model file"
            r6.e(r0, r1)
            goto L52
        L4b:
            com.google.android.gms.common.internal.GmsLogger r6 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r1 = "Do not have SHA-256 algorithm"
            r6.e(r0, r1)
        L52:
            r6 = 0
            return r6
    }
}
