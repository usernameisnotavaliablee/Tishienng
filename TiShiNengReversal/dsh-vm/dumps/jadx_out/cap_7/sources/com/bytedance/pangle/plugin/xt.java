package com.bytedance.pangle.plugin;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class xt implements java.lang.Runnable {
    private java.io.File j;
    private final java.lang.String xt;

    xt(java.lang.String r1, java.io.File r2) {
            r0 = this;
            r0.<init>()
            r0.j = r2
            r0.xt = r1
            return
    }

    private com.bytedance.pangle.ae.j.up cw() {
            r10 = this;
            java.io.File r0 = r10.j
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            r2.<init>()     // Catch: java.lang.Exception -> L2f
            java.io.File r3 = r10.j     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> L2f
            r2.append(r3)     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = "_unzip"
            r2.append(r3)     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2f
            r0.<init>(r2)     // Catch: java.lang.Exception -> L2f
            boolean r2 = r0.exists()     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L32
            com.bytedance.pangle.util.ae.j(r0)     // Catch: java.lang.Exception -> L2f
            r0.mkdirs()     // Catch: java.lang.Exception -> L2f
            goto L32
        L2f:
            r0 = move-exception
            goto La5
        L32:
            java.io.File r2 = r10.j     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L2f
            com.bytedance.pangle.util.ae.xt(r2, r3)     // Catch: java.lang.Exception -> L2f
            java.io.File[] r2 = r0.listFiles()     // Catch: java.lang.Exception -> L2f
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch: java.lang.Exception -> L2f
            r3.<init>()     // Catch: java.lang.Exception -> L2f
            int r4 = r2.length     // Catch: java.lang.Exception -> L2f
            r5 = 0
            r6 = r1
        L4b:
            if (r5 >= r4) goto L6f
            r7 = r2[r5]     // Catch: java.lang.Exception -> L2f
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Exception -> L2f
            java.lang.String r9 = "config.json"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Exception -> L2f
            if (r8 == 0) goto L5d
            r6 = r7
            goto L6c
        L5d:
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Exception -> L2f
            java.lang.String r9 = ".dex"
            boolean r8 = r8.endsWith(r9)     // Catch: java.lang.Exception -> L2f
            if (r8 == 0) goto L6c
            r3.add(r7)     // Catch: java.lang.Exception -> L2f
        L6c:
            int r5 = r5 + 1
            goto L4b
        L6f:
            java.io.File r2 = r10.j     // Catch: java.lang.Exception -> L2f
            com.bytedance.pangle.util.ae.j(r2)     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = "Zeus/install_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            java.lang.String r5 = "PluginInstallRunnable Dex deleting downloadFile apkFile="
            r4.<init>(r5)     // Catch: java.lang.Exception -> L2f
            java.io.File r5 = r10.j     // Catch: java.lang.Exception -> L2f
            r4.append(r5)     // Catch: java.lang.Exception -> L2f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L2f
            com.bytedance.pangle.log.ZeusLogger.i(r2, r4)     // Catch: java.lang.Exception -> L2f
            r10.j = r0     // Catch: java.lang.Exception -> L2f
            int r0 = r3.size()     // Catch: java.lang.Exception -> L2f
            if (r0 <= 0) goto La8
            if (r6 == 0) goto La8
            boolean r0 = r6.isFile()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto La8
            com.bytedance.pangle.cw.j r0 = com.bytedance.pangle.cw.xt.j(r6, r3)     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto La8
            com.bytedance.pangle.ae.j.up r2 = new com.bytedance.pangle.ae.j.up     // Catch: java.lang.Exception -> L2f
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2f
            return r2
        La5:
            com.bytedance.sdk.openadsdk.api.m.j(r0)
        La8:
            return r1
    }

    private java.io.File j(java.io.File r7) {
            r6 = this;
            boolean r0 = r7.exists()
            if (r0 != 0) goto L3c
            java.lang.String r0 = r7.getParent()
            if (r0 == 0) goto L3c
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r7.getParent()
            r0.<init>(r1)
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L3b
            int r1 = r0.length
            if (r1 != 0) goto L1f
            goto L3b
        L1f:
            int r1 = r0.length
            r2 = 0
        L21:
            if (r2 >= r1) goto L3c
            r3 = r0[r2]
            boolean r4 = r3.exists()
            if (r4 == 0) goto L38
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = ".apk"
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto L38
            return r3
        L38:
            int r2 = r2 + 1
            goto L21
        L3b:
            r7 = 0
        L3c:
            return r7
    }

    private static void j(java.lang.String r4, int r5, @androidx.annotation.NonNull java.lang.String r6, int r7, long r8, java.lang.String r10) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "status_code"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = com.bytedance.pangle.log.xt.j(r5)     // Catch: org.json.JSONException -> L4d
            r0.putOpt(r3, r5)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "plugin_package_name"
            java.lang.String r6 = com.bytedance.pangle.log.xt.j(r6)     // Catch: org.json.JSONException -> L4d
            r0.putOpt(r5, r6)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "version_code"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: org.json.JSONException -> L4d
            java.lang.String r6 = com.bytedance.pangle.log.xt.j(r6)     // Catch: org.json.JSONException -> L4d
            r0.putOpt(r5, r6)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "duration"
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch: org.json.JSONException -> L4d
            int r6 = com.bytedance.pangle.log.xt.xt(r6)     // Catch: org.json.JSONException -> L4d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: org.json.JSONException -> L4d
            r2.putOpt(r5, r6)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "message"
            java.lang.String r6 = com.bytedance.pangle.log.xt.j(r10)     // Catch: org.json.JSONException -> L4d
            r1.putOpt(r5, r6)     // Catch: org.json.JSONException -> L4d
            goto L51
        L4d:
            r5 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r5)
        L51:
            com.bytedance.pangle.r.xt r5 = com.bytedance.pangle.r.xt.j()
            r5.j(r4, r0, r2, r1)
            return
    }

    private void xt() {
            r4 = this;
            r0 = 3
        L1:
            if (r0 <= 0) goto L7e
            int r0 = r0 + (-1)
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
            r2.<init>()     // Catch: java.lang.Exception -> L2e
            java.io.File r3 = r4.j     // Catch: java.lang.Exception -> L2e
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> L2e
            r2.append(r3)     // Catch: java.lang.Exception -> L2e
            java.lang.String r3 = "_unzip"
            r2.append(r3)     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2e
            r1.<init>(r2)     // Catch: java.lang.Exception -> L2e
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L30
            r1.delete()     // Catch: java.lang.Exception -> L2e
            r1.mkdirs()     // Catch: java.lang.Exception -> L2e
            goto L30
        L2e:
            r1 = move-exception
            goto L73
        L30:
            java.io.File r2 = r4.j     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> L2e
            java.lang.String r3 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L2e
            com.bytedance.pangle.util.ae.xt(r2, r3)     // Catch: java.lang.Exception -> L2e
            java.io.File[] r1 = r1.listFiles()     // Catch: java.lang.Exception -> L2e
            java.io.File r2 = r4.j     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L4b
            int r3 = r1.length     // Catch: java.lang.Exception -> L2e
            if (r3 <= 0) goto L4b
            r2 = 0
            r2 = r1[r2]     // Catch: java.lang.Exception -> L2e
        L4b:
            java.io.File r1 = r4.j(r2)     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L1
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L1
            boolean r2 = r1.isFile()     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L1
            r4.j = r1     // Catch: java.lang.Exception -> L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = "Plugin install : unZip count : "
            r1.<init>(r2)     // Catch: java.lang.Exception -> L2e
            int r2 = 3 - r0
            r1.append(r2)     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2e
            com.bytedance.pangle.log.ZeusLogger.d(r1)     // Catch: java.lang.Exception -> L2e
            goto L7e
        L73:
            java.lang.String r2 = "Zeus/init_pangle"
            java.lang.String r3 = "Plugin install : unZip file failed !!!"
            com.bytedance.pangle.log.ZeusLogger.errReport(r2, r3, r1)
            com.bytedance.sdk.openadsdk.api.m.j(r1)
            goto L1
        L7e:
            return
    }

    boolean j() {
            r10 = this;
            java.io.File r0 = r10.j
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = ".dex.zip"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L3d
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r2 = "Plugin install : start unDexZip file ~~~~"
            com.bytedance.pangle.log.ZeusLogger.d(r2)
            com.bytedance.pangle.ae.j.up r2 = r10.cw()
            if (r2 == 0) goto L37
            java.lang.String r3 = com.bytedance.pangle.r.xt.ae
            int r4 = com.bytedance.pangle.r.xt.j.mi
            java.lang.String r5 = r10.xt
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r0
            java.lang.String r9 = ""
            r7 = r6
            r6 = 0
            j(r3, r4, r5, r6, r7, r9)
            java.lang.String r0 = "Plugin install : finish install from unDexZip success ~~~~"
            com.bytedance.pangle.log.ZeusLogger.d(r0)
            goto L74
        L37:
            java.lang.String r0 = "Plugin install : finish install from unDexZip fail ~~~~"
            com.bytedance.pangle.log.ZeusLogger.d(r0)
            goto L74
        L3d:
            java.io.File r0 = r10.j
            boolean r0 = com.bytedance.pangle.util.ae.xt(r0)
            if (r0 == 0) goto L69
            java.lang.String r0 = "Plugin install : start unZip file ~~~~"
            com.bytedance.pangle.log.ZeusLogger.d(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.xt()
            java.lang.String r2 = com.bytedance.pangle.r.xt.ae
            int r3 = com.bytedance.pangle.r.xt.j.rn
            java.lang.String r4 = r10.xt
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r0
            java.lang.String r8 = ""
            r6 = r5
            r5 = 0
            j(r2, r3, r4, r5, r6, r8)
            java.lang.String r0 = "Plugin install : start install from unZip ~~~~"
            com.bytedance.pangle.log.ZeusLogger.d(r0)
            goto L6e
        L69:
            java.lang.String r0 = "Plugin install : start install without unZip ~~~~"
            com.bytedance.pangle.log.ZeusLogger.d(r0)
        L6e:
            java.io.File r0 = r10.j
            com.bytedance.pangle.ae.j.up r2 = com.bytedance.pangle.ae.j.r.j(r0)
        L74:
            r0 = 1
            java.lang.String r1 = "Zeus/install_pangle"
            r3 = 0
            r4 = 7
            if (r2 != 0) goto Lb6
            java.lang.String r2 = r10.xt
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = " read local file package info failed !!! pluginPkg = "
            r5.<init>(r6)
            java.lang.String r6 = r10.xt
            r5.append(r6)
            java.lang.String r6 = " mApkFile.exists = "
            r5.append(r6)
            java.io.File r6 = r10.j
            boolean r6 = r6.exists()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r5
            com.bytedance.pangle.ZeusPluginStateListener.postStateChange(r2, r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "PluginInstallRunnable read local file package info failed !!! pluginPkg = "
            r0.<init>(r2)
            java.lang.String r2 = r10.xt
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
            return r3
        Lb6:
            com.bytedance.pangle.plugin.PluginManager r5 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            java.lang.String r6 = r2.j
            com.bytedance.pangle.plugin.Plugin r5 = r5.getPlugin(r6)
            if (r5 != 0) goto Lef
            java.lang.String r5 = r10.xt
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = " plugin == null !!! pluginPkg = "
            r6.<init>(r7)
            java.lang.String r7 = r10.xt
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r6
            com.bytedance.pangle.ZeusPluginStateListener.postStateChange(r5, r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "PluginInstallRunnable cannot query valid plugin !!! packageName = "
            r0.<init>(r4)
            java.lang.String r2 = r2.j
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
            return r3
        Lef:
            java.io.File r1 = r10.j
            boolean r1 = r5.install(r1, r2)
            if (r1 == 0) goto L100
            java.lang.String r0 = r2.j
            r2 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.bytedance.pangle.ZeusPluginStateListener.postStateChange(r0, r2, r3)
            return r1
        L100:
            java.lang.String r2 = r2.j
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r5 = "Internal error."
            r0[r3] = r5
            com.bytedance.pangle.ZeusPluginStateListener.postStateChange(r2, r4, r0)
            return r1
    }

    @Override // java.lang.Runnable
    public void run() {
            r0 = this;
            r0.j()
            return
    }
}
