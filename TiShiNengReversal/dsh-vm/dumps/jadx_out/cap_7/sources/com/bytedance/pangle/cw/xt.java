package com.bytedance.pangle.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {



    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int j(java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = com.bytedance.pangle.up.cw.j(r6)
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            com.bytedance.pangle.cw.xt$1 r0 = new com.bytedance.pangle.cw.xt$1
            r0.<init>()
            java.io.File[] r0 = r2.listFiles(r0)
            if (r0 == 0) goto L52
            int r2 = r0.length
            if (r2 <= 0) goto L52
            int r2 = r0.length
            r3 = 0
        L24:
            if (r3 >= r2) goto L52
            r4 = r0[r3]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "-"
            java.lang.String[] r4 = r4.split(r5)
            r5 = 1
            r4 = r4[r5]
            int r4 = java.lang.Integer.parseInt(r4)
            if (r4 <= r1) goto L4f
            com.bytedance.pangle.util.jy r5 = com.bytedance.pangle.util.jy.j()
            boolean r5 = r5.r(r6, r4)
            if (r5 == 0) goto L4f
            java.io.File[] r5 = com.bytedance.pangle.up.cw.qv(r6, r4)
            if (r5 == 0) goto L4f
            int r5 = r5.length
            if (r5 <= 0) goto L4f
            r1 = r4
        L4f:
            int r3 = r3 + 1
            goto L24
        L52:
            return r1
    }

    public static com.bytedance.pangle.cw.j j(java.io.File r7, java.util.List<java.io.File> r8) throws java.io.IOException, org.json.JSONException {
            java.lang.String r0 = "Zeus/install_pangle"
            r1 = 0
            if (r7 == 0) goto La8
            if (r8 == 0) goto La8
            int r2 = r8.size()
            if (r2 <= 0) goto La8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L79
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L79
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L75
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L75
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L72
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L72
        L21:
            java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L2d
            r2.append(r6)     // Catch: java.lang.Throwable -> L2b
            goto L21
        L2b:
            r7 = move-exception
            goto L7d
        L2d:
            com.bytedance.pangle.oq r6 = com.bytedance.pangle.oq.j()     // Catch: java.lang.Throwable -> L2b
            com.bytedance.pangle.ZeusPluginDecodeCallback r6 = r6.r()     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L63
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r6.decode(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L2b
            if (r6 != 0) goto L5d
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "DexPluginUtils parse dex config json success"
            com.bytedance.pangle.log.ZeusLogger.i(r0, r2)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.pangle.cw.j r7 = com.bytedance.pangle.cw.j.j(r6, r7, r8)     // Catch: java.lang.Throwable -> L2b
            r3.close()
            r4.close()
            r5.close()
            return r7
        L5d:
            java.lang.String r7 = "DexPluginUtils parse dex config fail decode content is empty"
            com.bytedance.pangle.log.ZeusLogger.w(r0, r7)     // Catch: java.lang.Throwable -> L2b
            goto L68
        L63:
            java.lang.String r7 = "DexPluginUtils parse dex config fail decode callback is null"
            com.bytedance.pangle.log.ZeusLogger.w(r0, r7)     // Catch: java.lang.Throwable -> L2b
        L68:
            r3.close()
            r4.close()
        L6e:
            r5.close()
            goto La8
        L72:
            r7 = move-exception
            r5 = r1
            goto L7d
        L75:
            r7 = move-exception
            r4 = r1
        L77:
            r5 = r4
            goto L7d
        L79:
            r7 = move-exception
            r3 = r1
            r4 = r3
            goto L77
        L7d:
            java.lang.String r8 = "DexPluginUtils parse dex config fail throw error "
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = r8.concat(r7)     // Catch: java.lang.Throwable -> L97
            com.bytedance.pangle.log.ZeusLogger.w(r0, r7)     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L8f
            r3.close()
        L8f:
            if (r4 == 0) goto L94
            r4.close()
        L94:
            if (r5 == 0) goto La8
            goto L6e
        L97:
            r7 = move-exception
            if (r3 == 0) goto L9d
            r3.close()
        L9d:
            if (r4 == 0) goto La2
            r4.close()
        La2:
            if (r5 == 0) goto La7
            r5.close()
        La7:
            throw r7
        La8:
            return r1
    }

    public static void j(java.lang.String r2, int r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            goto L28
        L7:
            java.lang.String r0 = com.bytedance.pangle.up.cw.j(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L28
            java.lang.String r1 = "version-"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            com.bytedance.pangle.cw.xt$2 r0 = new com.bytedance.pangle.cw.xt$2
            r0.<init>(r3, r2)
            r1.listFiles(r0)
        L28:
            return
    }

    public static boolean j(com.bytedance.pangle.cw.j r16, long r17) {
            if (r16 == 0) goto Lb
            java.util.List r0 = r16.r()
            java.io.File r1 = r16.up()
            goto Ld
        Lb:
            r0 = 0
            r1 = r0
        Ld:
            r2 = 0
            java.lang.String r3 = "Zeus/install_pangle"
            if (r1 == 0) goto L1c1
            if (r0 == 0) goto L1c1
            int r4 = r0.size()
            if (r4 <= 0) goto L1c1
            int r8 = r16.cw()
            java.lang.String r7 = r16.xt()
            r4 = 11
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.bytedance.pangle.ZeusPluginStateListener.postStateChange(r7, r4, r5)
            java.lang.String r5 = com.bytedance.pangle.r.xt.r
            int r6 = com.bytedance.pangle.r.xt.j.w
            r9 = -1
            r11 = 0
            com.bytedance.pangle.plugin.cw.j(r5, r6, r7, r8, r9, r11)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DexPluginUtils install dex start packageName = "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r5 = " version is "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.bytedance.pangle.log.ZeusLogger.i(r3, r4)
            com.bytedance.pangle.util.jy r4 = com.bytedance.pangle.util.jy.j()
            java.lang.String r4 = r4.qv(r7)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r12 = "DexPluginUtils "
            if (r5 != 0) goto L75
            int r5 = j(r4)
            if (r5 < r8) goto L75
            java.lang.String r5 = com.bytedance.pangle.r.xt.up
            int r6 = com.bytedance.pangle.r.xt.j.kt
            r9 = -1
            java.lang.String r11 = "dex installed version more than download version can no install new dex zip"
            com.bytedance.pangle.plugin.cw.j(r5, r6, r7, r8, r9, r11)
            java.lang.String r0 = r12.concat(r11)
            com.bytedance.pangle.log.ZeusLogger.w(r3, r0)
            return r2
        L75:
            java.lang.String r5 = r16.ae()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L81
            r13 = r7
            goto L86
        L81:
            java.lang.String r5 = r16.ae()
            r13 = r5
        L86:
            boolean r5 = com.bytedance.pangle.up.cw.oq(r13, r8)
            java.lang.String r14 = " version = "
            r15 = 1
            if (r5 != 0) goto L19a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le9
            java.lang.String r6 = "DexPluginUtils install dex no dir need install packageName="
            r5.<init>(r6)     // Catch: java.lang.Exception -> Le9
            r5.append(r7)     // Catch: java.lang.Exception -> Le9
            java.lang.String r6 = " version="
            r5.append(r6)     // Catch: java.lang.Exception -> Le9
            r5.append(r8)     // Catch: java.lang.Exception -> Le9
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Le9
            com.bytedance.pangle.log.ZeusLogger.i(r3, r5)     // Catch: java.lang.Exception -> Le9
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Le9
        Lac:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Exception -> Le9
            if (r5 == 0) goto Lec
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Exception -> Le9
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Exception -> Le9
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Exception -> Le9
            java.lang.String r9 = ".dex"
            boolean r6 = r6.endsWith(r9)     // Catch: java.lang.Exception -> Le9
            if (r6 == 0) goto Lac
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Exception -> Le9
            java.lang.String r6 = com.bytedance.pangle.up.cw.j(r13, r8, r6)     // Catch: java.lang.Exception -> Le9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le9
            java.lang.String r10 = "DexPluginUtils install dex = "
            r9.<init>(r10)     // Catch: java.lang.Exception -> Le9
            java.lang.String r10 = r5.getName()     // Catch: java.lang.Exception -> Le9
            r9.append(r10)     // Catch: java.lang.Exception -> Le9
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> Le9
            com.bytedance.pangle.log.ZeusLogger.i(r3, r9)     // Catch: java.lang.Exception -> Le9
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Exception -> Le9
            com.bytedance.pangle.util.tl.j(r5, r6)     // Catch: java.lang.Exception -> Le9
            goto Lac
        Le9:
            r0 = move-exception
            goto L17e
        Lec:
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Exception -> Le9
            java.lang.String r5 = ".json"
            boolean r0 = r0.endsWith(r5)     // Catch: java.lang.Exception -> Le9
            if (r0 == 0) goto L118
            java.lang.String r0 = com.bytedance.pangle.up.cw.vl(r13, r8)     // Catch: java.lang.Exception -> Le9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le9
            java.lang.String r6 = "DexPluginUtils install dex config = "
            r5.<init>(r6)     // Catch: java.lang.Exception -> Le9
            java.lang.String r6 = r1.getName()     // Catch: java.lang.Exception -> Le9
            r5.append(r6)     // Catch: java.lang.Exception -> Le9
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Le9
            com.bytedance.pangle.log.ZeusLogger.i(r3, r5)     // Catch: java.lang.Exception -> Le9
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> Le9
            com.bytedance.pangle.util.tl.j(r1, r0)     // Catch: java.lang.Exception -> Le9
        L118:
            boolean r0 = com.bytedance.pangle.up.cw.oq(r13, r8)     // Catch: java.lang.Exception -> Le9
            if (r0 == 0) goto L16b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le9
            java.lang.String r1 = "DexPluginUtils install dex success packageName = "
            r0.<init>(r1)     // Catch: java.lang.Exception -> Le9
            r0.append(r7)     // Catch: java.lang.Exception -> Le9
            r0.append(r14)     // Catch: java.lang.Exception -> Le9
            r0.append(r8)     // Catch: java.lang.Exception -> Le9
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Le9
            com.bytedance.pangle.log.ZeusLogger.i(r3, r0)     // Catch: java.lang.Exception -> Le9
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Le9
            r1 = 12
            com.bytedance.pangle.ZeusPluginStateListener.postStateChange(r7, r1, r0)     // Catch: java.lang.Exception -> Le9
            java.lang.String r5 = com.bytedance.pangle.r.xt.up     // Catch: java.lang.Exception -> Le9
            int r6 = com.bytedance.pangle.r.xt.j.mi     // Catch: java.lang.Exception -> Le9
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> Le9
            long r9 = r0 - r17
            java.lang.String r11 = "install success"
            com.bytedance.pangle.plugin.cw.j(r5, r6, r7, r8, r9, r11)     // Catch: java.lang.Exception -> Le9
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Exception -> Le9
            r0.xt(r13, r8, r15)     // Catch: java.lang.Exception -> Le9
            java.lang.String r0 = r16.ae()     // Catch: java.lang.Exception -> Le9
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Le9
            if (r0 != 0) goto L16a
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Exception -> Le9
            r0.cw(r7, r13)     // Catch: java.lang.Exception -> Le9
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Exception -> Le9
            r0.r(r7, r4)     // Catch: java.lang.Exception -> Le9
        L16a:
            return r15
        L16b:
            java.lang.String r11 = "install dir not exists"
            java.lang.String r5 = com.bytedance.pangle.r.xt.up     // Catch: java.lang.Exception -> Le9
            int r6 = com.bytedance.pangle.r.xt.j.kt     // Catch: java.lang.Exception -> Le9
            r9 = -1
            com.bytedance.pangle.plugin.cw.j(r5, r6, r7, r8, r9, r11)     // Catch: java.lang.Exception -> Le9
            java.lang.String r0 = r12.concat(r11)     // Catch: java.lang.Exception -> Le9
            com.bytedance.pangle.log.ZeusLogger.w(r3, r0)     // Catch: java.lang.Exception -> Le9
            goto L1c6
        L17e:
            java.lang.String r5 = com.bytedance.pangle.r.xt.up
            int r6 = com.bytedance.pangle.r.xt.j.kt
            java.lang.String r1 = "throw exception: "
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r11 = r1.concat(r4)
            r9 = -1
            com.bytedance.pangle.plugin.cw.j(r5, r6, r7, r8, r9, r11)
            java.lang.String r1 = "DexPluginUtils install dex fail throw exception"
            com.bytedance.pangle.log.ZeusLogger.w(r3, r1)
            com.bytedance.sdk.openadsdk.api.m.j(r0)
            goto L1c6
        L19a:
            java.lang.String r5 = com.bytedance.pangle.r.xt.up
            int r6 = com.bytedance.pangle.r.xt.j.mi
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r9 = r0 - r17
            java.lang.String r11 = "install success 已经安装完成"
            com.bytedance.pangle.plugin.cw.j(r5, r6, r7, r8, r9, r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DexPluginUtils install dex already install packageName = "
            r0.<init>(r1)
            r0.append(r7)
            r0.append(r14)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.bytedance.pangle.log.ZeusLogger.i(r3, r0)
            return r15
        L1c1:
            java.lang.String r0 = "DexPluginUtils install dex fail config is null"
            com.bytedance.pangle.log.ZeusLogger.w(r3, r0)
        L1c6:
            return r2
    }

    public static boolean j(com.bytedance.pangle.plugin.Plugin r8, java.lang.StringBuilder r9) {
            java.lang.String r0 = "hostPackageName"
            r1 = 0
            if (r8 != 0) goto Le
            java.lang.String r8 = "loadDexPlugin fail, plugin == null;"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r8 = move-exception
            goto L162
        Le:
            boolean r2 = r8.isInstalled()     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L1a
            java.lang.String r8 = "loadDexPlugin fail, plugin is not installed"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L1a:
            boolean r2 = r8 instanceof com.bytedance.pangle.plugin.j     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L24
            java.lang.String r8 = "loadDexPlugin fail, plugin must be dexPlugin"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L24:
            com.bytedance.pangle.util.jy r2 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = r8.mPkgName     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = r2.qv(r3)     // Catch: java.lang.Throwable -> Lb
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto L36
            java.lang.String r2 = r8.mPkgName     // Catch: java.lang.Throwable -> Lb
        L36:
            int r3 = j(r2)     // Catch: java.lang.Throwable -> Lb
            r4 = -1
            if (r3 != r4) goto L43
            java.lang.String r8 = "loadDexPlugin fail, get Plugin version is -1"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L43:
            java.io.File[] r4 = com.bytedance.pangle.up.cw.qv(r2, r3)     // Catch: java.lang.Throwable -> Lb
            if (r4 == 0) goto L15c
            int r5 = r4.length     // Catch: java.lang.Throwable -> Lb
            if (r5 != 0) goto L4e
            goto L15c
        L4e:
            java.lang.String r2 = com.bytedance.pangle.up.cw.vl(r2, r3)     // Catch: java.lang.Throwable -> Lb
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto L5e
            java.lang.String r8 = "loadDexPlugin fail, configFileString is empty"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L5e:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> Lb
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            boolean r2 = r3.exists()     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto L156
            boolean r2 = r3.isFile()     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L71
            goto L156
        L71:
            java.util.List r2 = java.util.Arrays.asList(r4)     // Catch: java.lang.Throwable -> Lb
            com.bytedance.pangle.cw.j r2 = j(r3, r2)     // Catch: java.lang.Throwable -> Lb
            r3 = r8
            com.bytedance.pangle.plugin.j r3 = (com.bytedance.pangle.plugin.j) r3     // Catch: java.lang.Throwable -> Lb
            r3.j(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L87
            java.lang.String r8 = "loadDexPlugin fail, config is null"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L87:
            boolean r2 = r2.j()     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L93
            java.lang.String r8 = "loadDexPlugin fail, check dex fail"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L93:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r2.<init>()     // Catch: java.lang.Throwable -> Lb
            int r3 = r4.length     // Catch: java.lang.Throwable -> Lb
            r5 = 0
        L9a:
            if (r5 >= r3) goto Lb3
            r6 = r4[r5]     // Catch: java.lang.Throwable -> Lb
            boolean r7 = r6.isFile()     // Catch: java.lang.Throwable -> Lb
            if (r7 == 0) goto Lb0
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> Lb
            r2.append(r6)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r6 = ":"
            r2.append(r6)     // Catch: java.lang.Throwable -> Lb
        Lb0:
            int r5 = r5 + 1
            goto L9a
        Lb3:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = xt(r2)     // Catch: java.lang.Throwable -> Lb
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto Lc7
            java.lang.String r8 = "loadDexPlugin fail, dexPath is empty"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lc7:
            com.bytedance.pangle.oq r3 = com.bytedance.pangle.oq.j()     // Catch: java.lang.Throwable -> Lb
            java.util.Map r3 = r3.up()     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto L150
            int r4 = r3.size()     // Catch: java.lang.Throwable -> Lb
            if (r4 != 0) goto Ld9
            goto L150
        Ld9:
            java.lang.String r8 = r8.mPkgName     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r8 = r3.get(r8)     // Catch: java.lang.Throwable -> Lb
            org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch: java.lang.Throwable -> Lb
            if (r8 == 0) goto L14a
            boolean r3 = r8.has(r0)     // Catch: java.lang.Throwable -> Lb
            if (r3 != 0) goto Lea
            goto L14a
        Lea:
            java.lang.String r8 = r8.optString(r0)     // Catch: java.lang.Throwable -> Lb
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Lfa
            java.lang.String r8 = "loadDexPlugin fail, hostPackageName is empty"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lfa:
            com.bytedance.pangle.plugin.Plugin r0 = com.bytedance.pangle.Zeus.getPlugin(r8)     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L141
            boolean r8 = com.bytedance.pangle.util.g.qv()     // Catch: java.lang.Throwable -> Lb
            if (r8 == 0) goto L11a
            java.lang.String r8 = "loadDexPlugin addDexPath success dexPath="
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r8 = r8.concat(r3)     // Catch: java.lang.Throwable -> Lb
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            com.bytedance.pangle.PluginClassLoader r8 = r0.mClassLoader     // Catch: java.lang.Throwable -> Lb
            boolean r8 = com.bytedance.pangle.plugin.r.j(r8, r2)     // Catch: java.lang.Throwable -> Lb
            return r8
        L11a:
            com.bytedance.pangle.PluginClassLoader r8 = r0.mClassLoader     // Catch: java.lang.Throwable -> Lb
            if (r8 == 0) goto L13b
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb
            r3 = 1
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lb
            com.bytedance.pangle.PluginClassLoader r4 = new com.bytedance.pangle.PluginClassLoader     // Catch: java.lang.Throwable -> Lb
            r5 = 0
            r4.<init>(r2, r5, r5, r5)     // Catch: java.lang.Throwable -> Lb
            r8.add(r4)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r4 = "loadDexPlugin setOtherPluginClassLoader success dexPath="
            r9.append(r4)     // Catch: java.lang.Throwable -> Lb
            r9.append(r2)     // Catch: java.lang.Throwable -> Lb
            com.bytedance.pangle.PluginClassLoader r0 = r0.mClassLoader     // Catch: java.lang.Throwable -> Lb
            r0.setOtherPluginClassLoader(r8)     // Catch: java.lang.Throwable -> Lb
            return r3
        L13b:
            java.lang.String r8 = "loadDexPlugin fail classLoader is null"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L141:
            java.lang.String r0 = "loadDexPlugin fail, hostPlugin is null hostPackageName="
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L14a:
            java.lang.String r8 = "loadDexPlugin fail, dex config can not get hostPackageName"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L150:
            java.lang.String r8 = "loadDexPlugin fail, getPackageDexManager is empty"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L156:
            java.lang.String r8 = "loadDexPlugin fail, config file is not exists or is not file"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L15c:
            java.lang.String r8 = "loadDexPlugin fail, get dex files is null or length is 0"
            r9.append(r8)     // Catch: java.lang.Throwable -> Lb
            return r1
        L162:
            java.lang.String r0 = "loadDexPlugin fail, throw error "
            r9.append(r0)
            r9.append(r8)
            return r1
    }

    private static java.lang.String xt(java.lang.String r2) {
            if (r2 == 0) goto L15
            java.lang.String r0 = ":"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L15
            int r0 = r2.length()
            int r0 = r0 + (-1)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L15:
            return r2
    }
}
