package com.huawei.hms.feature.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AssetLoadManager {
    public static final java.lang.String a = "AssetLoadManager";
    public static final java.lang.String b = "dynamic_modules";
    public static final java.lang.String c = ".apk";
    public static final java.lang.String d = "com.huawei.hms.feature.dynamic.descriptors.";
    public static final java.lang.String e = ".AssetModuleDescriptor";

    public AssetLoadManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            java.lang.String r1 = "AssetLoadManager"
            if (r4 == 0) goto L52
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto Lc
            goto L52
        Lc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L3d
            r2.<init>()     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L3d
            java.lang.String r3 = "com.huawei.hms.feature.dynamic.descriptors."
            r2.append(r3)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L3d
            r2.append(r5)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L3d
            java.lang.String r3 = ".AssetModuleDescriptor"
            r2.append(r3)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L3d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L3d
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L3d
            java.lang.Class r4 = r4.loadClass(r2)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L3d
            java.lang.String r2 = "MODULE_VERSION"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r2)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L3d
            r2 = 0
            int r4 = r4.getInt(r2)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L3d
            return r4
        L36:
            r4 = move-exception
            java.lang.String r5 = "Get local asset module info failed."
            com.huawei.hms.common.util.Logger.w(r1, r5, r4)
            goto L51
        L3d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "Cannot get the class of module descriptor for "
            r4.append(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.huawei.hms.common.util.Logger.w(r1, r4)
        L51:
            return r0
        L52:
            java.lang.String r4 = "Invalid context or moduleName."
            com.huawei.hms.common.util.Logger.e(r1, r4)
            return r0
    }

    public static android.os.Bundle a(android.content.Context r6, java.io.File r7, java.lang.String r8) {
            java.lang.String[] r0 = r7.list()
            java.lang.String r1 = "AssetLoadManager"
            if (r0 == 0) goto Ld1
            int r2 = r0.length
            if (r2 != 0) goto Ld
            goto Ld1
        Ld:
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L10:
            if (r3 >= r2) goto L1f
            r5 = r0[r3]
            int r5 = java.lang.Integer.parseInt(r5)
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = r3 + 1
            goto L10
        L1f:
            if (r4 != 0) goto L2c
            java.lang.String r6 = "Cannot get module version path."
            com.huawei.hms.common.util.Logger.w(r1, r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            return r6
        L2c:
            java.lang.String r7 = r7.getCanonicalPath()     // Catch: java.io.IOException -> Lb2
            com.huawei.hms.feature.dynamic.ModuleCopy.clearLowVersionModule(r4, r7, r0, r1)
            int r6 = a(r6, r8)
            if (r6 <= r4) goto L44
            java.lang.String r6 = "There is a higher loader version in assets."
            com.huawei.hms.common.util.Logger.i(r1, r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            return r6
        L44:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            java.lang.String r7 = java.io.File.separator
            r6.append(r7)
            r6.append(r4)
            r6.append(r7)
            r6.append(r8)
            java.lang.String r7 = ".apk"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            boolean r7 = r7.exists()
            if (r7 != 0) goto L79
            java.lang.String r6 = "Cannot find module apk in asset decompressed path."
            com.huawei.hms.common.util.Logger.w(r1, r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            return r6
        L79:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r0 = "module_name"
            r7.putString(r0, r8)
            java.lang.String r0 = "module_path"
            r7.putString(r0, r6)
            java.lang.String r0 = "local_asset_module_version"
            r7.putInt(r0, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Get module info from decompressed asset path success: ModuleName:"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = ", ModuleVersion:"
            r0.append(r8)
            r0.append(r4)
            java.lang.String r8 = ", ModulePath:"
            r0.append(r8)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.huawei.hms.common.util.Logger.i(r1, r6)
            return r7
        Lb2:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "request modulePath error: "
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.huawei.hms.common.util.Logger.w(r1, r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            return r6
        Ld1:
            java.lang.String r6 = "No version in module path."
            com.huawei.hms.common.util.Logger.w(r1, r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            return r6
    }

    public static java.lang.String a(android.content.Context r8, java.lang.String r9, int r10, java.lang.String r11) {
            java.lang.String r0 = "dynamic_modules"
            java.lang.String r1 = "AssetLoadManager"
            r2 = 0
            android.content.res.AssetManager r3 = r8.getAssets()     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            r4.<init>()     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            r4.append(r0)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            java.lang.String r5 = java.io.File.separator     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            r4.append(r5)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            r4.append(r9)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            r4.append(r5)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            r4.append(r11)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            java.io.InputStream r11 = r3.open(r11)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld0
            r3.<init>(r11)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r4.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            java.lang.String r8 = com.huawei.hms.feature.dynamic.ModuleCopy.getProtectedPath(r8)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r4.append(r8)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r4.append(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r4.append(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r4.append(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r4.append(r9)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r4.append(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r4.append(r10)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            boolean r10 = r10.exists()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            if (r10 != 0) goto L78
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            boolean r10 = r10.mkdirs()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            if (r10 != 0) goto L78
            java.lang.String r8 = "mkdirs local loaderPath failed."
            com.huawei.hms.common.util.Logger.w(r1, r8)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            com.huawei.hms.feature.dynamic.ModuleCopy.closeQuietly(r3)
            com.huawei.hms.feature.dynamic.ModuleCopy.closeQuietly(r2)
        L6f:
            com.huawei.hms.feature.dynamic.ModuleCopy.closeQuietly(r11)
            return r2
        L73:
            r8 = move-exception
            goto Lfd
        L76:
            r8 = move-exception
            goto Lcc
        L78:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r10.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r10.append(r8)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r10.append(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r10.append(r9)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            java.lang.String r8 = ".apk"
            r10.append(r8)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r0]     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La7
        L98:
            r5 = 0
            int r6 = r3.read(r4, r5, r0)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La7
            r7 = -1
            if (r6 == r7) goto La9
            r10.write(r4, r5, r6)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La7
            goto L98
        La4:
            r8 = move-exception
            r2 = r10
            goto Lfd
        La7:
            r8 = move-exception
            goto Ldc
        La9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La7
            r0.<init>()     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La7
            java.lang.String r4 = "Decompress module:"
            r0.append(r4)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La7
            r0.append(r9)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La7
            java.lang.String r4 = " from assets success."
            r0.append(r4)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La7
            com.huawei.hms.common.util.Logger.i(r1, r0)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La7
            com.huawei.hms.feature.dynamic.ModuleCopy.closeQuietly(r3)
            com.huawei.hms.feature.dynamic.ModuleCopy.closeQuietly(r10)
            com.huawei.hms.feature.dynamic.ModuleCopy.closeQuietly(r11)
            return r8
        Lcc:
            r10 = r2
            goto Ldc
        Lce:
            r8 = move-exception
            goto Ld8
        Ld0:
            r8 = move-exception
            goto Lda
        Ld2:
            r8 = move-exception
            r11 = r2
            goto Ld8
        Ld5:
            r8 = move-exception
            r11 = r2
            goto Lda
        Ld8:
            r3 = r2
            goto Lfd
        Lda:
            r10 = r2
            r3 = r10
        Ldc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4
            r0.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.String r4 = "Cannot find module:"
            r0.append(r4)     // Catch: java.lang.Throwable -> La4
            r0.append(r9)     // Catch: java.lang.Throwable -> La4
            java.lang.String r9 = " in assets."
            r0.append(r9)     // Catch: java.lang.Throwable -> La4
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.common.util.Logger.w(r1, r9, r8)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.feature.dynamic.ModuleCopy.closeQuietly(r3)
            com.huawei.hms.feature.dynamic.ModuleCopy.closeQuietly(r10)
            goto L6f
        Lfd:
            com.huawei.hms.feature.dynamic.ModuleCopy.closeQuietly(r3)
            com.huawei.hms.feature.dynamic.ModuleCopy.closeQuietly(r2)
            com.huawei.hms.feature.dynamic.ModuleCopy.closeQuietly(r11)
            throw r8
    }

    public static android.os.Bundle b(android.content.Context r6, java.lang.String r7) {
            java.lang.String r0 = "AssetLoadManager"
            r1 = 0
            android.content.res.AssetManager r2 = r6.getAssets()     // Catch: java.lang.Exception -> L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L64
            r3.<init>()     // Catch: java.lang.Exception -> L64
            java.lang.String r4 = "dynamic_modules"
            r3.append(r4)     // Catch: java.lang.Exception -> L64
            java.lang.String r4 = java.io.File.separator     // Catch: java.lang.Exception -> L64
            r3.append(r4)     // Catch: java.lang.Exception -> L64
            r3.append(r7)     // Catch: java.lang.Exception -> L64
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L64
            java.lang.String[] r2 = r2.list(r3)     // Catch: java.lang.Exception -> L64
            if (r2 == 0) goto Laa
            int r3 = r2.length     // Catch: java.lang.Exception -> L64
            if (r3 != 0) goto L28
            goto Laa
        L28:
            r2 = r2[r1]     // Catch: java.lang.Exception -> L64
            int r3 = a(r6, r7)     // Catch: java.lang.Exception -> L64
            java.lang.String r2 = a(r6, r7, r3, r2)     // Catch: java.lang.Exception -> L64
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L64
            if (r4 != 0) goto L9f
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L64
            r4.<init>(r2)     // Catch: java.lang.Exception -> L64
            boolean r4 = r4.exists()     // Catch: java.lang.Exception -> L64
            if (r4 != 0) goto L44
            goto L9f
        L44:
            boolean r6 = com.huawei.hms.common.util.ExtractNativeUtils.d(r6, r2)     // Catch: java.lang.Exception -> L64
            if (r6 == 0) goto L66
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L64
            r6.<init>(r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r4 = com.huawei.hms.feature.dynamic.ModuleCopy.trimLastSection(r2)     // Catch: java.lang.Exception -> L64
            int r6 = com.huawei.hms.common.util.ExtractNativeUtils.a(r6, r4)     // Catch: java.lang.Exception -> L64
            if (r6 == 0) goto L66
            java.lang.String r6 = "Extract native to current dir failed."
            com.huawei.hms.common.util.Logger.w(r0, r6)     // Catch: java.lang.Exception -> L64
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Exception -> L64
            r6.<init>()     // Catch: java.lang.Exception -> L64
            return r6
        L64:
            r6 = move-exception
            goto Lb5
        L66:
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Exception -> L64
            r6.<init>()     // Catch: java.lang.Exception -> L64
            java.lang.String r4 = "module_name"
            r6.putString(r4, r7)     // Catch: java.lang.Exception -> L64
            java.lang.String r4 = "module_path"
            r6.putString(r4, r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r4 = "local_asset_module_version"
            r6.putInt(r4, r3)     // Catch: java.lang.Exception -> L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L64
            r4.<init>()     // Catch: java.lang.Exception -> L64
            java.lang.String r5 = "Get dynamic module info from asset success: ModuleName:"
            r4.append(r5)     // Catch: java.lang.Exception -> L64
            r4.append(r7)     // Catch: java.lang.Exception -> L64
            java.lang.String r7 = ", ModuleVersion:"
            r4.append(r7)     // Catch: java.lang.Exception -> L64
            r4.append(r3)     // Catch: java.lang.Exception -> L64
            java.lang.String r7 = ", ModulePath:"
            r4.append(r7)     // Catch: java.lang.Exception -> L64
            r4.append(r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Exception -> L64
            com.huawei.hms.common.util.Logger.i(r0, r7)     // Catch: java.lang.Exception -> L64
            return r6
        L9f:
            java.lang.String r6 = "Decompress module from assets failed."
            com.huawei.hms.common.util.Logger.w(r0, r6)     // Catch: java.lang.Exception -> L64
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Exception -> L64
            r6.<init>()     // Catch: java.lang.Exception -> L64
            return r6
        Laa:
            java.lang.String r6 = "No module apk in asset path."
            com.huawei.hms.common.util.Logger.w(r0, r6)     // Catch: java.lang.Exception -> L64
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Exception -> L64
            r6.<init>()     // Catch: java.lang.Exception -> L64
            return r6
        Lb5:
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r6
            java.lang.String r6 = "getModuleFromAsset failed."
            com.huawei.hms.common.util.Logger.i(r0, r6, r7)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            return r6
    }

    public static android.os.Bundle getAssetModuleInfo(android.content.Context r4, java.lang.String r5) {
            java.lang.String r0 = "AssetLoadManager"
            if (r4 == 0) goto L6b
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto Lb
            goto L6b
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L48
            r1.<init>()     // Catch: java.lang.Exception -> L48
            java.lang.String r2 = com.huawei.hms.feature.dynamic.ModuleCopy.getProtectedPath(r4)     // Catch: java.lang.Exception -> L48
            r1.append(r2)     // Catch: java.lang.Exception -> L48
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Exception -> L48
            r1.append(r2)     // Catch: java.lang.Exception -> L48
            java.lang.String r3 = "dynamic_modules"
            r1.append(r3)     // Catch: java.lang.Exception -> L48
            r1.append(r2)     // Catch: java.lang.Exception -> L48
            r1.append(r5)     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L48
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L48
            r2.<init>(r1)     // Catch: java.lang.Exception -> L48
            boolean r1 = r2.exists()     // Catch: java.lang.Exception -> L48
            java.lang.String r3 = "local_asset_module_version"
            if (r1 == 0) goto L4a
            android.os.Bundle r1 = a(r4, r2, r5)     // Catch: java.lang.Exception -> L48
            int r2 = r1.getInt(r3)     // Catch: java.lang.Exception -> L48
            if (r2 <= 0) goto L4a
            java.lang.String r4 = "Successfully get module info from decompressed asset path."
            com.huawei.hms.common.util.Logger.i(r0, r4)     // Catch: java.lang.Exception -> L48
            return r1
        L48:
            r4 = move-exception
            goto L5a
        L4a:
            android.os.Bundle r4 = b(r4, r5)     // Catch: java.lang.Exception -> L48
            int r5 = r4.getInt(r3)     // Catch: java.lang.Exception -> L48
            if (r5 <= 0) goto L65
            java.lang.String r5 = "Successfully get module info from asset."
            com.huawei.hms.common.util.Logger.i(r0, r5)     // Catch: java.lang.Exception -> L48
            return r4
        L5a:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r1 = 0
            r5[r1] = r4
            java.lang.String r4 = "getDataModuleInfo failed."
            com.huawei.hms.common.util.Logger.i(r0, r4, r5)
        L65:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            return r4
        L6b:
            java.lang.String r4 = "The context or moduleName is null."
            com.huawei.hms.common.util.Logger.w(r0, r4)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            return r4
    }
}
