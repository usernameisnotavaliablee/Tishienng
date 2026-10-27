package com.bytedance.pangle.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class jy {
    private static volatile com.bytedance.pangle.util.jy j;
    private android.content.SharedPreferences xt;

    private jy() {
            r3 = this;
            r3.<init>()
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r1 = "pangle_meta_data_sp"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.xt = r0
            return
    }

    public static com.bytedance.pangle.util.jy j() {
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.pangle.util.jy> r0 = com.bytedance.pangle.util.jy.class
            monitor-enter(r0)
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.pangle.util.jy r1 = new com.bytedance.pangle.util.jy     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.pangle.util.jy.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j
            return r0
    }

    public void ae(java.lang.String r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "UNINSTALL__"
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r2)
            r2 = 1
            r0.putBoolean(r1, r2)
            r0.apply()
            java.lang.String r0 = "ZeusSpUtils markUnInstallFlag packageName="
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r0 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r0, r4)
            return
    }

    public boolean ae(java.lang.String r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "dex_opt_state_"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "_"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            android.content.SharedPreferences r4 = r2.xt
            r0 = 0
            boolean r3 = r4.getBoolean(r3, r0)
            return r3
    }

    public int cw(java.lang.String r4, int r5) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.xt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "API_MAX_"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "_"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r4 = r0.getInt(r4, r5)
            if (r4 != 0) goto L22
            return r5
        L22:
            return r4
    }

    public void cw(java.lang.String r4, int r5, boolean r6) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "dex_opt_state_"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "_"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.putBoolean(r4, r6)
            r0.apply()
            return
    }

    public void cw(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L20
            java.lang.String r3 = com.bytedance.pangle.util.m.j(r3)
            android.content.SharedPreferences r0 = r2.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "ALIAS_"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            r0.putString(r3, r4)
            r0.apply()
        L20:
            return
    }

    public boolean cw(java.lang.String r6) {
            r5 = this;
            android.content.SharedPreferences r0 = r5.xt
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r2 = "HOST_ABI_"
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r1, r3)
            java.lang.String r1 = com.bytedance.pangle.Zeus.getHostAbi()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r0 = r0 ^ 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "ZeusSpUtils isHostAbiUpdate HOST_ABI="
            r1.<init>(r4)
            android.content.SharedPreferences r4 = r5.xt
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r2.concat(r6)
            java.lang.String r6 = r4.getString(r6, r3)
            r1.append(r6)
            java.lang.String r6 = ", "
            r1.append(r6)
            java.lang.String r6 = com.bytedance.pangle.Zeus.getHostAbi()
            r1.append(r6)
            java.lang.String r6 = ", result="
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r1, r6)
            return r0
    }

    public int g(java.lang.String r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "remove_entry_flag_"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "_"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            android.content.SharedPreferences r4 = r2.xt
            r0 = 0
            int r3 = r4.getInt(r3, r0)
            return r3
    }

    public boolean g(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.xt
            java.lang.String r1 = "UNINSTALL__"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            r1 = 0
            boolean r3 = r0.getBoolean(r3, r1)
            return r3
    }

    public void j(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "ROM_LAST_"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL
            r0.putString(r3, r1)
            r0.apply()
            return
    }

    public void j(java.lang.String r4, int r5) {
            r3 = this;
            int r0 = r3.up(r4)
            if (r0 == r5) goto L1c
            android.content.SharedPreferences r1 = r3.xt
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "PLUGIN_API_VERSION_"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r2.concat(r4)
            r1.putInt(r4, r5)
            r1.apply()
        L1c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "ZeusSpUtils setPluginApiVersion "
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r0 = " --> "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r5, r4)
            return
    }

    public void j(java.lang.String r4, int r5, int r6) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "remove_entry_flag_"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "_"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.putInt(r4, r6)
            r0.apply()
            return
    }

    public void j(java.lang.String r4, int r5, int r6, int r7) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "API_MIN_"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = "_"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.putInt(r1, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "API_MAX_"
            r6.<init>(r1)
            r6.append(r4)
            r6.append(r2)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r0.putInt(r4, r7)
            r0.apply()
            return
    }

    public void j(java.lang.String r4, int r5, java.lang.String r6) {
            r3 = this;
            int r0 = r3.xt(r4, r5, r6)
            android.content.SharedPreferences r1 = r3.xt
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "_failed_count_when_rm_entry_"
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = "_"
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            int r0 = r0 + 1
            r1.putInt(r4, r0)
            r1.apply()
            return
    }

    public void j(java.lang.String r4, int r5, boolean r6) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DISABLE_DOWNLOAD_"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = "_"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            if (r6 == 0) goto L23
            r2 = 0
            r0.putInt(r1, r2)
            goto L26
        L23:
            r0.remove(r1)
        L26:
            r0.apply()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ZeusSpUtils markAllowDownloadFlag packageName="
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " version="
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = " disable="
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r5, r4)
            return
    }

    public void j(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = r4.m(r5)
            boolean r1 = android.text.TextUtils.equals(r0, r6)
            if (r1 != 0) goto L20
            android.content.SharedPreferences r1 = r4.xt
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "HOST_IDENTITY_"
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r2 = r2.concat(r3)
            r1.putString(r2, r6)
            r1.apply()
        L20:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ZeusSpUtils setHostIdentity("
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = ") "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = " --> "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r6, r5)
            return
    }

    public java.util.List<java.lang.String> jy(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L2d
            java.lang.String r3 = com.bytedance.pangle.util.m.j(r3)
            android.content.SharedPreferences r0 = r2.xt
            java.lang.String r1 = "ALIAS_LAST_TIME_"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = ""
            java.lang.String r3 = r0.getString(r3, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L2d
            java.lang.String r0 = "_"
            java.lang.String[] r3 = r3.split(r0)
            java.util.List r3 = java.util.Arrays.asList(r3)
            return r3
        L2d:
            r3 = 0
            return r3
    }

    public java.lang.String m(java.lang.String r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.xt
            java.lang.String r1 = "HOST_IDENTITY_"
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r2)
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ZeusSpUtils getHostIdentity pluginPKg = "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", hostIdentity = "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r1, r4)
            return r0
    }

    public boolean m(java.lang.String r6, int r7) {
            r5 = this;
            android.content.SharedPreferences r0 = r5.xt
            java.util.Locale r1 = java.util.Locale.getDefault()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r6
            java.lang.String r6 = "OFFLINE_INTERNAL_%s"
            java.lang.String r6 = java.lang.String.format(r1, r6, r3)
            r1 = -1
            int r6 = r0.getInt(r6, r1)
            if (r6 != r7) goto L1a
            return r2
        L1a:
            return r4
    }

    public java.lang.String oq(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.xt
            java.lang.String r1 = "IDENTITY_"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = ""
            java.lang.String r3 = r0.getString(r3, r1)
            return r3
    }

    public java.lang.String qv(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1d
            java.lang.String r3 = com.bytedance.pangle.util.m.j(r3)
            android.content.SharedPreferences r0 = r2.xt
            java.lang.String r1 = "ALIAS_"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = ""
            java.lang.String r3 = r0.getString(r3, r1)
            return r3
        L1d:
            r3 = 0
            return r3
    }

    public void r(java.lang.String r5) {
            r4 = this;
            android.content.SharedPreferences r0 = r4.xt
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "HOST_ABI_"
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r1, r3)
            android.content.SharedPreferences r1 = r4.xt
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r2.concat(r5)
            java.lang.String r2 = com.bytedance.pangle.Zeus.getHostAbi()
            r1.putString(r5, r2)
            r1.apply()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "ZeusSpUtils setHostAbiUpdated HOST_ABI="
            r5.<init>(r1)
            r5.append(r0)
            java.lang.String r0 = " --> "
            r5.append(r0)
            java.lang.String r0 = com.bytedance.pangle.Zeus.getHostAbi()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r0, r5)
            return
    }

    public void r(java.lang.String r4, int r5, boolean r6) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "dex_remove_state_"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "_"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.putBoolean(r4, r6)
            r0.apply()
            return
    }

    public void r(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            android.content.SharedPreferences r0 = r5.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L56
            java.lang.String r6 = com.bytedance.pangle.util.m.j(r6)
            android.content.SharedPreferences r1 = r5.xt
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "ALIAS_LAST_TIME_"
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r4 = ""
            java.lang.String r1 = r1.getString(r2, r4)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L34
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r3.concat(r6)
            r0.putString(r6, r7)
            goto L53
        L34:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r3.concat(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "_"
            r2.append(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.putString(r6, r7)
        L53:
            r0.apply()
        L56:
            return
    }

    public boolean r(java.lang.String r5, int r6) {
            r4 = this;
            android.content.SharedPreferences r0 = r4.xt
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            java.lang.String r5 = "INSTALLED_%s-%d"
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            boolean r5 = r0.getBoolean(r5, r3)
            return r5
    }

    public void tl(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "UNINSTALL__"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            r0.remove(r3)
            r0.apply()
            return
    }

    public boolean tl(java.lang.String r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "dex_remove_state_"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "_"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            android.content.SharedPreferences r4 = r2.xt
            r0 = 0
            boolean r3 = r4.getBoolean(r3, r0)
            return r3
    }

    public int up(java.lang.String r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.xt
            java.lang.String r1 = "PLUGIN_API_VERSION_"
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r2)
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ZeusSpUtils getPluginApiVersion pluginPKg = "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", pluginApiVersion = "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r1, r4)
            return r0
    }

    public void up(java.lang.String r3, int r4) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "OFFLINE_INTERNAL_"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            r0.putInt(r3, r4)
            r0.apply()
            return
    }

    public void vl(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L20
            java.lang.String r3 = com.bytedance.pangle.util.m.j(r3)
            android.content.SharedPreferences r0 = r2.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "ALIAS_"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            r0.remove(r3)
            r0.apply()
        L20:
            return
    }

    public void ws(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L20
            java.lang.String r3 = com.bytedance.pangle.util.m.j(r3)
            android.content.SharedPreferences r0 = r2.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "ALIAS_LAST_TIME_"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            r0.remove(r3)
            r0.apply()
        L20:
            return
    }

    public int xt(java.lang.String r4, int r5) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.xt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "API_MIN_"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "_"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r5 = 0
            int r4 = r0.getInt(r4, r5)
            return r4
    }

    public int xt(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "_failed_count_when_rm_entry_"
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = "_"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            android.content.SharedPreferences r3 = r1.xt
            r4 = 0
            int r2 = r3.getInt(r2, r4)
            return r2
    }

    public void xt(java.lang.String r4, int r5, boolean r6) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "INSTALLED_"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "-"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            if (r6 == 0) goto L23
            r5 = 1
            r0.putBoolean(r4, r5)
            goto L26
        L23:
            r0.remove(r4)
        L26:
            r0.apply()
            return
    }

    public void xt(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.xt
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "IDENTITY_"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            r0.putString(r3, r4)
            r0.apply()
            return
    }

    public boolean xt(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.xt
            java.lang.String r1 = "HOST_ABI_"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = ""
            java.lang.String r3 = r0.getString(r3, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }
}
