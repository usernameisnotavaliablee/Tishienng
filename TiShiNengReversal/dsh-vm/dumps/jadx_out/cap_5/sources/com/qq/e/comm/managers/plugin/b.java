package com.qq.e.comm.managers.plugin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    static void a(android.content.Context r12, java.io.File r13, java.io.File r14) throws java.lang.Throwable {
            android.content.res.AssetManager r0 = r12.getAssets()
            r1 = 0
            java.lang.String r2 = com.qq.e.comm.managers.plugin.h.a()     // Catch: java.lang.Throwable -> L3a
            java.lang.String[] r2 = r0.list(r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = com.qq.e.comm.managers.plugin.h.b()     // Catch: java.lang.Throwable -> L3a
            int r3 = java.util.Arrays.binarySearch(r2, r3)     // Catch: java.lang.Throwable -> L3a
            if (r3 < 0) goto Le1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = com.qq.e.comm.managers.plugin.h.a()     // Catch: java.lang.Throwable -> L3a
            r2.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L3a
            r2.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = com.qq.e.comm.managers.plugin.h.b()     // Catch: java.lang.Throwable -> L3a
            r2.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = com.qq.e.comm.constants.Sig.ASSET_PLUGIN_SIG     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L3e
            java.lang.String r3 = ""
            goto L3e
        L3a:
            r12 = move-exception
            r0 = r1
            goto L10a
        L3e:
            com.qq.e.comm.managers.plugin.h.a(r12)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r4.<init>()     // Catch: java.lang.Throwable -> L3a
            int r5 = com.qq.e.comm.managers.status.SDKStatus.getBuildInPluginVersion()     // Catch: java.lang.Throwable -> L3a
            r4.append(r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = "#####"
            r4.append(r5)     // Catch: java.lang.Throwable -> L3a
            r4.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L3a
            com.qq.e.comm.managers.plugin.h.a(r3, r14)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r14 = com.qq.e.comm.constants.CustomPkgConstants.getAssetPluginXorKey()     // Catch: java.lang.Throwable -> L3a
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L3a
            if (r14 == 0) goto L70
            java.io.InputStream r14 = r0.open(r2)     // Catch: java.lang.Throwable -> L3a
            boolean r14 = com.qq.e.comm.managers.plugin.h.a(r14, r13)     // Catch: java.lang.Throwable -> L3a
            r0 = r1
            goto Lc7
        L70:
            java.io.InputStream r14 = r0.open(r2)     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r13.canWrite()     // Catch: java.lang.Throwable -> L7f
            r2 = 1
            if (r0 != 0) goto L84
            r13.setWritable(r2)     // Catch: java.lang.Throwable -> L7f
            goto L84
        L7f:
            r12 = move-exception
            r0 = r1
            r1 = r14
            goto L10a
        L84:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7f
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = com.qq.e.comm.constants.CustomPkgConstants.getAssetPluginXorKey()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch: java.lang.Throwable -> Lbf
            byte[] r1 = r1.getBytes(r3)     // Catch: java.lang.Throwable -> Lbf
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> Lbf
            int r4 = r1.length     // Catch: java.lang.Throwable -> Lbf
            r5 = 0
            r6 = 0
            r7 = 0
        L9f:
            int r8 = r14.read(r3)     // Catch: java.lang.Throwable -> Lbf
            if (r8 <= 0) goto Lc5
            r9 = 0
        La6:
            if (r9 >= r8) goto Lc1
            int r10 = r7 + 1
            r11 = 64
            if (r7 >= r11) goto Laf
            goto Lbb
        Laf:
            r7 = r3[r9]     // Catch: java.lang.Throwable -> Lbf
            int r11 = r6 + 1
            int r6 = r6 % r4
            r6 = r1[r6]     // Catch: java.lang.Throwable -> Lbf
            r6 = r6 ^ r7
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> Lbf
            r3[r9] = r6     // Catch: java.lang.Throwable -> Lbf
            r6 = r11
        Lbb:
            int r9 = r9 + 1
            r7 = r10
            goto La6
        Lbf:
            r12 = move-exception
            goto L10b
        Lc1:
            r0.write(r3, r5, r8)     // Catch: java.lang.Throwable -> Lbf
            goto L9f
        Lc5:
            r1 = r14
            r14 = 1
        Lc7:
            if (r14 == 0) goto Ld0
            boolean r14 = com.qq.e.comm.managers.plugin.h.a(r13, r12)     // Catch: java.lang.Throwable -> Lce
            goto Ld0
        Lce:
            r12 = move-exception
            goto L10a
        Ld0:
            a(r1)
            a(r0)
            if (r14 == 0) goto Ld9
            return
        Ld9:
            java.lang.Exception r12 = new java.lang.Exception
            java.lang.String r13 = "Plugin prepare failed"
            r12.<init>(r13)
            throw r12
        Le1:
            if (r2 == 0) goto Lee
            int r12 = r2.length     // Catch: java.lang.Throwable -> L3a
            if (r12 > 0) goto Le7
            goto Lee
        Le7:
            java.lang.String r12 = ","
            java.lang.String r12 = android.text.TextUtils.join(r12, r2)     // Catch: java.lang.Throwable -> L3a
            goto Lf0
        Lee:
            java.lang.String r12 = "no asset"
        Lf0:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r13.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r14 = "Asset Error "
            r13.append(r14)     // Catch: java.lang.Throwable -> L3a
            r13.append(r12)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L3a
            com.qq.e.comm.util.GDTLogger.e(r12)     // Catch: java.lang.Throwable -> L3a
            java.lang.Exception r13 = new java.lang.Exception     // Catch: java.lang.Throwable -> L3a
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L3a
            throw r13     // Catch: java.lang.Throwable -> L3a
        L10a:
            r14 = r1
        L10b:
            java.lang.String r13 = "插件加载失败"
            com.qq.e.comm.util.GDTLogger.e(r13, r12)     // Catch: java.lang.Throwable -> L111
            throw r12     // Catch: java.lang.Throwable -> L111
        L111:
            r12 = move-exception
            a(r14)
            a(r0)
            throw r12
    }

    private static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }
}
