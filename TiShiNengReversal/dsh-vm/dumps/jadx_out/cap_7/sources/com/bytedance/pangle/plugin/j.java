package com.bytedance.pangle.plugin;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j extends com.bytedance.pangle.plugin.Plugin {
    private com.bytedance.pangle.cw.j j;

    public j(org.json.JSONObject r1) throws org.json.JSONException {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void cw() {
            r3 = this;
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r1 = r3.mPkgName
            java.lang.String r0 = r0.qv(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2f
            java.lang.String r0 = com.bytedance.pangle.up.cw.j(r0)
            com.bytedance.pangle.util.ae.j(r0)
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()
            java.lang.String r2 = r3.mPkgName
            r1.vl(r2)
            java.lang.String r1 = "DexPlugin deleteA_PackageName dir="
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
        L2f:
            return
    }

    private void j(int r3) {
            r2 = this;
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            boolean r0 = com.bytedance.pangle.up.r.xt(r0)
            if (r0 == 0) goto L26
            r2.xt()
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r1 = r2.mPkgName
            java.lang.String r0 = r0.qv(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L21
            com.bytedance.pangle.cw.xt.j(r0, r3)
            return
        L21:
            java.lang.String r0 = r2.mPkgName
            com.bytedance.pangle.cw.xt.j(r0, r3)
        L26:
            return
    }

    private void xt() {
            r6 = this;
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r1 = r6.mPkgName
            java.util.List r0 = r0.jy(r1)
            if (r0 == 0) goto L57
            int r1 = r0.size()
            if (r1 <= 0) goto L57
            java.util.Iterator r1 = r0.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L16
            int r3 = com.bytedance.pangle.cw.xt.j(r2)
            r4 = -1
            if (r3 == r4) goto L37
            com.bytedance.pangle.util.jy r4 = com.bytedance.pangle.util.jy.j()
            r5 = 0
            r4.xt(r2, r3, r5)
        L37:
            java.lang.String r2 = com.bytedance.pangle.up.cw.j(r2)
            com.bytedance.pangle.util.ae.j(r2)
            goto L16
        L3f:
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()
            java.lang.String r2 = r6.mPkgName
            r1.ws(r2)
            java.lang.String r1 = "DexPlugin deleteAliasLastTimePackageName list="
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
        L57:
            return
    }

    @Override // com.bytedance.pangle.plugin.Plugin
    protected void deleteIfNeeded() {
            r3 = this;
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            boolean r0 = com.bytedance.pangle.up.r.xt(r0)
            if (r0 == 0) goto L4b
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r1 = r3.mPkgName
            boolean r0 = r0.g(r1)
            if (r0 == 0) goto L4b
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r1 = r3.mPkgName
            r0.tl(r1)
            java.lang.String r0 = r3.mPkgName
            java.lang.String r0 = com.bytedance.pangle.up.cw.j(r0)
            com.bytedance.pangle.util.ae.j(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DexPlugin deleteIfNeeded "
            r1.<init>(r2)
            java.lang.String r2 = r3.mPkgName
            r1.append(r2)
            java.lang.String r2 = " dir="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
            r3.xt()
            r3.cw()
        L4b:
            return
    }

    @Override // com.bytedance.pangle.plugin.Plugin
    public org.json.JSONObject getJsonConfig() {
            r1 = this;
            com.bytedance.pangle.cw.j r0 = r1.j
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            org.json.JSONObject r0 = r0.m()
            return r0
    }

    @Override // com.bytedance.pangle.plugin.Plugin
    void init() {
            r8 = this;
            boolean r0 = r8.mInitialized
            if (r0 == 0) goto L6
            goto Ld6
        L6:
            java.lang.Object r0 = r8.initializeLock
            monitor-enter(r0)
            boolean r1 = r8.mInitialized     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            goto Ld7
        L12:
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> Lf
            boolean r1 = com.bytedance.pangle.up.r.xt(r1)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Lcf
            r8.deleteIfNeeded()     // Catch: java.lang.Throwable -> Lf
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r8.mPkgName     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r1.qv(r2)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L31
            java.lang.String r1 = r8.mPkgName     // Catch: java.lang.Throwable -> Lf
        L31:
            int r2 = com.bytedance.pangle.cw.xt.j(r1)     // Catch: java.lang.Throwable -> Lf
            r3 = -1
            if (r2 == r3) goto Lcb
            java.io.File[] r3 = com.bytedance.pangle.up.cw.qv(r1, r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = com.bytedance.pangle.up.cw.vl(r1, r2)     // Catch: java.lang.Throwable -> Lf
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Lf
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L57
            int r1 = r3.length     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L55
            if (r1 <= 0) goto L57
            java.util.List r1 = java.util.Arrays.asList(r3)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L55
            com.bytedance.pangle.cw.j r1 = com.bytedance.pangle.cw.xt.j(r4, r1)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L55
            r8.j = r1     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L55
            goto L71
        L55:
            r1 = move-exception
            goto L5f
        L57:
            java.lang.String r1 = "Zeus/install_pangle"
            java.lang.String r5 = "DexPlugin initDexPlugins unDexZip fail throw exception"
            com.bytedance.pangle.log.ZeusLogger.w(r1, r5)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L55
            goto L71
        L5f:
            java.lang.String r5 = "Zeus/install_pangle"
            java.lang.String r6 = "DexPlugin initDexPlugins fail throw exception "
            java.lang.String r7 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r6 = r6.concat(r7)     // Catch: java.lang.Throwable -> Lf
            com.bytedance.pangle.log.ZeusLogger.w(r5, r6)     // Catch: java.lang.Throwable -> Lf
            com.bytedance.sdk.openadsdk.api.m.j(r1)     // Catch: java.lang.Throwable -> Lf
        L71:
            if (r3 == 0) goto L8a
            int r1 = r3.length     // Catch: java.lang.Throwable -> Lf
            if (r1 <= 0) goto L8a
            boolean r1 = r4.isFile()     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L8a
            com.bytedance.pangle.cw.j r1 = r8.j     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L8a
            boolean r1 = r1.j()     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L8a
            r8.updateToInstalled(r2)     // Catch: java.lang.Throwable -> Lf
            goto L8b
        L8a:
            r2 = 0
        L8b:
            r8.j(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "Zeus/init_pangle"
            java.lang.String r2 = "DexPlugin initDexPlugins result="
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> Lf
            com.bytedance.pangle.log.ZeusLogger.i(r1, r2)     // Catch: java.lang.Throwable -> Lf
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r8.mPkgName     // Catch: java.lang.Throwable -> Lf
            r1.j(r2)     // Catch: java.lang.Throwable -> Lf
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r8.mPkgName     // Catch: java.lang.Throwable -> Lf
            r1.r(r2)     // Catch: java.lang.Throwable -> Lf
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r8.mPkgName     // Catch: java.lang.Throwable -> Lf
            android.app.Application r3 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = com.bytedance.pangle.util.xt.j(r3)     // Catch: java.lang.Throwable -> Lf
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> Lf
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r8.mPkgName     // Catch: java.lang.Throwable -> Lf
            int r3 = r8.mApiVersionCode     // Catch: java.lang.Throwable -> Lf
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> Lf
        Lcb:
            r8.j()     // Catch: java.lang.Throwable -> Lf
            goto Ld2
        Lcf:
            r8.updateInstallStateFromMainProcess()     // Catch: java.lang.Throwable -> Lf
        Ld2:
            r1 = 1
            r8.mInitialized = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
        Ld6:
            return
        Ld7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // com.bytedance.pangle.plugin.Plugin
    boolean install(java.io.File r8, com.bytedance.pangle.ae.j.up r9) {
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L135
            com.bytedance.pangle.cw.j r9 = r9.cw     // Catch: java.lang.Throwable -> L12d
            if (r9 == 0) goto L135
            java.lang.String r1 = "Zeus/install_pangle"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12d
            java.lang.String r3 = "DexPlugin thread name="
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12d
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L12d
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L12d
            r2.append(r3)     // Catch: java.lang.Throwable -> L12d
            java.lang.String r3 = " install dex from config "
            r2.append(r3)     // Catch: java.lang.Throwable -> L12d
            r2.append(r9)     // Catch: java.lang.Throwable -> L12d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L12d
            com.bytedance.pangle.log.ZeusLogger.i(r1, r2)     // Catch: java.lang.Throwable -> L12d
            java.lang.String r1 = r9.xt()     // Catch: java.lang.Throwable -> L12d
            int r2 = r9.cw()     // Catch: java.lang.Throwable -> L12d
            java.lang.Object r3 = r7.installLock     // Catch: java.lang.Throwable -> L12d
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L12d
            java.lang.String r4 = "Zeus/install_pangle"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = "DexPlugin synchronized begin, packageName="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7c
            r5.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = " plugin="
            r5.append(r6)     // Catch: java.lang.Throwable -> L7c
            r5.append(r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7c
            com.bytedance.pangle.log.ZeusLogger.i(r4, r5)     // Catch: java.lang.Throwable -> L7c
            boolean r4 = r9.j()     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto L7f
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L7c
            boolean r0 = com.bytedance.pangle.cw.xt.j(r9, r5)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7f
            java.lang.String r9 = "Zeus/install_pangle"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = "DexPlugin markPluginInstalled, packageName="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7c
            r5.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = " version="
            r5.append(r6)     // Catch: java.lang.Throwable -> L7c
            r5.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7c
            com.bytedance.pangle.log.ZeusLogger.i(r9, r5)     // Catch: java.lang.Throwable -> L7c
            goto L7f
        L7c:
            r8 = move-exception
            goto L12b
        L7f:
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto Le5
            int r9 = r7.mLifeCycle     // Catch: java.lang.Throwable -> La8
            r4 = 3
            if (r9 == r4) goto Lc7
            if (r0 == 0) goto Lab
            r7.updateToInstalled(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r9 = "Zeus/install_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "DexPlugin Dex INSTALLED_SUCCESS "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La8
            r4.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch: java.lang.Throwable -> La8
            r4.append(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La8
            com.bytedance.pangle.log.ZeusLogger.i(r9, r4)     // Catch: java.lang.Throwable -> La8
            goto L100
        La8:
            r8 = move-exception
            goto L129
        Lab:
            java.lang.String r9 = "Zeus/install_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "DexPlugin Dex INSTALL_FAILED "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La8
            r4.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch: java.lang.Throwable -> La8
            r4.append(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La8
            com.bytedance.pangle.log.ZeusLogger.w(r9, r4)     // Catch: java.lang.Throwable -> La8
            goto L100
        Lc7:
            java.lang.String r9 = "Zeus/install_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "DexPlugin Dex LIFE_LOADED "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La8
            r4.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch: java.lang.Throwable -> La8
            int r5 = r7.mVersionCode     // Catch: java.lang.Throwable -> La8
            r4.append(r5)     // Catch: java.lang.Throwable -> La8
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La8
            com.bytedance.pangle.log.ZeusLogger.w(r9, r4)     // Catch: java.lang.Throwable -> La8
            goto L100
        Le5:
            java.lang.String r9 = "Zeus/install_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "DexPlugin Dex invalid "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La8
            r4.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch: java.lang.Throwable -> La8
            r4.append(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La8
            com.bytedance.pangle.log.ZeusLogger.w(r9, r4)     // Catch: java.lang.Throwable -> La8
        L100:
            com.bytedance.pangle.util.ae.j(r8)     // Catch: java.lang.Throwable -> La8
            java.lang.String r9 = "Zeus/install_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "DexPlugin Dex deleting unDexZip pkgName="
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La8
            r4.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = " version="
            r4.append(r1)     // Catch: java.lang.Throwable -> La8
            r4.append(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = " apkFile="
            r4.append(r1)     // Catch: java.lang.Throwable -> La8
            r4.append(r8)     // Catch: java.lang.Throwable -> La8
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> La8
            com.bytedance.pangle.log.ZeusLogger.i(r9, r8)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            return r0
        L129:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La8
            throw r8     // Catch: java.lang.Throwable -> L7c
        L12b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            throw r8     // Catch: java.lang.Throwable -> L12d
        L12d:
            r8 = move-exception
            java.lang.String r9 = "Zeus/install_pangle"
            java.lang.String r1 = "DexPlugin DEX ZIP IMPOSSIBLE!!!"
            com.bytedance.pangle.log.ZeusLogger.errReport(r9, r1, r8)
        L135:
            return r0
    }

    public void j() {
            r3 = this;
            java.lang.String r0 = r3.mPkgName
            java.lang.String r0 = com.bytedance.pangle.up.cw.j(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3a
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.File[] r1 = r1.listFiles()
            if (r1 == 0) goto L1a
            int r1 = r1.length
            if (r1 != 0) goto L3a
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DexPlugin clear install file, packageName="
            r1.<init>(r2)
            java.lang.String r2 = r3.mPkgName
            r1.append(r2)
            java.lang.String r2 = " no children files,need delete dir="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Zeus/load_pangle"
            com.bytedance.pangle.log.ZeusLogger.d(r2, r1)
            com.bytedance.pangle.util.ae.j(r0)
        L3a:
            return
    }

    public void j(com.bytedance.pangle.cw.j r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // com.bytedance.pangle.plugin.Plugin
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DexPlugin{pkg="
            r0.<init>(r1)
            java.lang.String r1 = r2.mPkgName
            r0.append(r1)
            java.lang.String r1 = ", ver="
            r0.append(r1)
            int r1 = r2.mVersionCode
            r0.append(r1)
            java.lang.String r1 = ", life="
            r0.append(r1)
            int r1 = r2.mLifeCycle
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
