package com.bytedance.pangle.plugin;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    private static final com.bytedance.pangle.oq j = null;



    public static class j extends java.io.IOException {
        private j(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ j(java.lang.String r1, com.bytedance.pangle.plugin.cw.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private j(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ j(java.lang.String r1, java.lang.Throwable r2, com.bytedance.pangle.plugin.cw.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    static {
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            com.bytedance.pangle.plugin.cw.j = r0
            return
    }

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.util.Map<java.lang.String, java.util.List<java.util.zip.ZipEntry>> ae(java.io.File r21, java.lang.String r22, int r23, java.lang.StringBuffer r24) throws com.bytedance.pangle.plugin.cw.j {
            r1 = r24
            java.lang.String r2 = ";"
            java.lang.String r3 = "checkMatchHostAbi cost:"
            java.lang.String r4 = "插件包包含so不符合宿主ABI类型"
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            boolean r0 = r0.checkMatchHostAbi()
            r5 = 0
            if (r0 == 0) goto L72
            long r6 = java.lang.System.currentTimeMillis()
            com.bytedance.pangle.util.up r0 = com.bytedance.pangle.up.xt.j(r21)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            T r8 = r0.j     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            U r0 = r0.xt     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            if (r8 == 0) goto L38
            r1.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r6
            r1.append(r3)
            r1.append(r2)
            return r0
        L38:
            com.bytedance.pangle.plugin.cw$j r0 = new com.bytedance.pangle.plugin.cw$j     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            throw r0     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
        L3e:
            r0 = move-exception
            goto L63
        L40:
            r0 = move-exception
            r13 = r0
            java.lang.String r14 = com.bytedance.pangle.r.xt.up     // Catch: java.lang.Throwable -> L3e
            int r15 = com.bytedance.pangle.r.xt.j.a     // Catch: java.lang.Throwable -> L3e
            r18 = -1
            r20 = 0
            r16 = r22
            r17 = r23
            j(r14, r15, r16, r17, r18, r20)     // Catch: java.lang.Throwable -> L3e
            com.bytedance.pangle.oq r8 = com.bytedance.pangle.plugin.cw.j     // Catch: java.lang.Throwable -> L3e
            r9 = 1100(0x44c, float:1.541E-42)
            r10 = -5
            r11 = r22
            r12 = r23
            r8.j(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L3e
            com.bytedance.pangle.plugin.cw$j r0 = new com.bytedance.pangle.plugin.cw$j     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r4, r13, r5)     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L63:
            r1.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r6
            r1.append(r3)
            r1.append(r2)
            throw r0
        L72:
            return r5
    }

    static /* synthetic */ void cw(java.io.File r0, java.lang.String r1, int r2, java.lang.StringBuffer r3) throws com.bytedance.pangle.plugin.cw.j {
            tl(r0, r1, r2, r3)
            return
    }

    private static void cw(java.lang.String r8, int r9) throws com.bytedance.pangle.plugin.cw.j {
            boolean r0 = com.bytedance.pangle.util.g.ae()     // Catch: java.lang.Exception -> Le
            if (r0 != 0) goto L10
            boolean r0 = com.bytedance.pangle.util.g.g()     // Catch: java.lang.Exception -> Le
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            return
        Le:
            r0 = move-exception
            goto L2f
        L10:
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Exception -> Le
            r1 = 0
            r0.cw(r8, r9, r1)     // Catch: java.lang.Exception -> Le
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> Le
            android.content.SharedPreferences r0 = com.bytedance.pangle.m.xt.j(r0)     // Catch: java.lang.Exception -> Le
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Exception -> Le
            android.content.SharedPreferences$Editor r0 = r0.putInt(r8, r9)     // Catch: java.lang.Exception -> Le
            r0.apply()     // Catch: java.lang.Exception -> Le
            com.bytedance.pangle.m.m.j()     // Catch: java.lang.Exception -> Le
            return
        L2f:
            java.lang.String r1 = com.bytedance.pangle.r.xt.up
            int r2 = com.bytedance.pangle.r.xt.j.s
            r5 = -1
            r7 = 0
            r3 = r8
            r4 = r9
            j(r1, r2, r3, r4, r5, r7)
            com.bytedance.pangle.plugin.cw$j r8 = new com.bytedance.pangle.plugin.cw$j
            java.lang.String r9 = "dexOpt2失败"
            r1 = 0
            r8.<init>(r9, r0, r1)
            throw r8
    }

    private static java.lang.String g(java.io.File r19, java.lang.String r20, int r21, java.lang.StringBuffer r22) throws com.bytedance.pangle.plugin.cw.j {
            r1 = r22
            java.lang.String r2 = ";"
            java.lang.String r3 = "copyApk cost:"
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = com.bytedance.pangle.up.cw.xt(r20, r21)
            java.lang.String r6 = r19.getAbsolutePath()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            com.bytedance.pangle.util.tl.j(r6, r0)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r1.append(r3)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r1.append(r6)
            r1.append(r2)
            return r0
        L24:
            r0 = move-exception
            goto L4c
        L26:
            r0 = move-exception
            r11 = r0
            java.lang.String r12 = com.bytedance.pangle.r.xt.up     // Catch: java.lang.Throwable -> L24
            int r13 = com.bytedance.pangle.r.xt.j.v     // Catch: java.lang.Throwable -> L24
            r16 = -1
            r18 = 0
            r14 = r20
            r15 = r21
            j(r12, r13, r14, r15, r16, r18)     // Catch: java.lang.Throwable -> L24
            com.bytedance.pangle.oq r6 = com.bytedance.pangle.plugin.cw.j     // Catch: java.lang.Throwable -> L24
            r7 = 1100(0x44c, float:1.541E-42)
            r8 = -6
            r9 = r20
            r10 = r21
            r6.j(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L24
            com.bytedance.pangle.plugin.cw$j r0 = new com.bytedance.pangle.plugin.cw$j     // Catch: java.lang.Throwable -> L24
            java.lang.String r6 = "安装包拷贝失败"
            r7 = 0
            r0.<init>(r6, r11, r7)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L4c:
            r1.append(r3)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r1.append(r6)
            r1.append(r2)
            throw r0
    }

    static /* synthetic */ void j(java.io.File r0, java.lang.String r1, int r2, java.lang.StringBuffer r3) throws com.bytedance.pangle.plugin.cw.j {
            m(r0, r1, r2, r3)
            return
    }

    static /* synthetic */ void j(java.lang.String r0, int r1) throws com.bytedance.pangle.plugin.cw.j {
            cw(r0, r1)
            return
    }

    public static void j(java.lang.String r4, int r5, @androidx.annotation.NonNull java.lang.String r6, int r7, long r8, java.lang.String r10) {
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

    static /* synthetic */ void j(java.lang.String r0, int r1, java.util.Map r2, java.lang.StringBuffer r3) throws com.bytedance.pangle.plugin.cw.j {
            xt(r0, r1, r2, r3)
            return
    }

    static /* synthetic */ void j(java.lang.String r0, java.lang.String r1, int r2, java.lang.StringBuffer r3) throws com.bytedance.pangle.plugin.cw.j {
            xt(r0, r1, r2, r3)
            return
    }

    static boolean j(java.io.File r14, java.lang.String r15, int r16) {
            java.lang.String r7 = "Zeus/install_pangle"
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            java.lang.String r0 = "useOpt;"
            r8.append(r0)
            r9 = 1
            boolean[] r10 = new boolean[r9]
            r11 = 0
            r10[r11] = r11
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.plugin.cw.j     // Catch: java.lang.Throwable -> L86
            r2 = 0
            r5 = 0
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = r15
            r4 = r16
            r0.j(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L86
            r12 = r0
            java.lang.String r0 = "PluginInstaller"
            java.lang.String r1 = "install:"
            java.lang.String r2 = java.lang.String.valueOf(r15)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L86
            com.bytedance.pangle.log.j r13 = com.bytedance.pangle.log.j.j(r7, r0, r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = com.bytedance.pangle.r.xt.r     // Catch: java.lang.Throwable -> L86
            int r1 = com.bytedance.pangle.r.xt.j.w     // Catch: java.lang.Throwable -> L86
            r4 = -1
            r6 = 0
            r2 = r15
            r3 = r16
            j(r0, r1, r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L86
            xt(r15, r16)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = com.bytedance.pangle.up.cw.j(r15, r16)     // Catch: java.lang.Throwable -> L86
            com.bytedance.pangle.util.ae.j(r0)     // Catch: java.lang.Throwable -> L86
            com.bytedance.pangle.plugin.cw$1 r6 = new com.bytedance.pangle.plugin.cw$1     // Catch: java.lang.Throwable -> L86
            r6.<init>(r14, r15, r3, r8)     // Catch: java.lang.Throwable -> L86
            com.bytedance.pangle.plugin.cw$2 r0 = new com.bytedance.pangle.plugin.cw$2     // Catch: java.lang.Throwable -> L86
            r1 = r14
            r2 = r15
            r4 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L89
            r8 = r4
            r10 = r5
            r1 = 2
            com.bytedance.pangle.j.j$j[] r1 = new com.bytedance.pangle.j.j.InterfaceC0007j[r1]     // Catch: java.lang.Throwable -> L86
            r1[r11] = r6     // Catch: java.lang.Throwable -> L86
            r1[r9] = r0     // Catch: java.lang.Throwable -> L86
            com.bytedance.pangle.j.j.j(r11, r1)     // Catch: java.lang.Throwable -> L86
            com.bytedance.pangle.util.ae.j(r14)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = com.bytedance.pangle.r.xt.up     // Catch: java.lang.Throwable -> L86
            int r1 = com.bytedance.pangle.r.xt.j.mi     // Catch: java.lang.Throwable -> L86
            long r4 = r13.j()     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L86
            r2 = r15
            r3 = r16
            j(r0, r1, r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L86
            java.lang.String r14 = "success"
            r13.j(r14)     // Catch: java.lang.Throwable -> L86
            r2 = 0
            r5 = 0
            r1 = 1100(0x44c, float:1.541E-42)
            r3 = r15
            r4 = r16
            r0 = r12
            r0.j(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L86
            return r9
        L86:
            r0 = move-exception
        L87:
            r14 = r0
            goto L8d
        L89:
            r0 = move-exception
            r8 = r4
            r10 = r5
            goto L87
        L8d:
            boolean r0 = r14 instanceof com.bytedance.pangle.plugin.cw.j
            java.lang.String r1 = "PluginInstaller "
            if (r0 == 0) goto Laa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r1 = " install failed."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r7, r0, r14)
            r3 = r16
            goto Ldb
        Laa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r1 = " install failed unknown error."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r7, r0, r14)
            java.lang.String r0 = com.bytedance.pangle.r.xt.up
            int r1 = com.bytedance.pangle.r.xt.j.kt
            r4 = -1
            java.lang.String r6 = r8.toString()
            r2 = r15
            r3 = r16
            j(r0, r1, r2, r3, r4, r6)
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.plugin.cw.j
            r1 = 1100(0x44c, float:1.541E-42)
            r2 = -1
            r5 = r14
            r3 = r15
            r4 = r16
            r0.j(r1, r2, r3, r4, r5)
            r3 = r4
        Ldb:
            boolean r14 = r10[r11]
            if (r14 == 0) goto Le8
            com.bytedance.pangle.util.jy r14 = com.bytedance.pangle.util.jy.j()
            java.lang.String r0 = "install"
            r14.j(r15, r3, r0)
        Le8:
            return r11
    }

    static /* synthetic */ boolean j(java.lang.String r0, int r1, boolean r2, java.lang.StringBuffer r3) {
            boolean r0 = xt(r0, r1, r2, r3)
            return r0
    }

    private static void m(java.io.File r13, java.lang.String r14, int r15, java.lang.StringBuffer r16) throws com.bytedance.pangle.plugin.cw.j {
            r1 = r16
            java.lang.String r2 = ";"
            java.lang.String r3 = "checkSignature cost:"
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            boolean r0 = com.bytedance.pangle.tl.up.j(r0, r14)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            if (r0 == 0) goto L23
            r1.append(r3)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r1.append(r6)
            r1.append(r2)
            return
        L23:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r6 = "安装包签名校验失败[1]"
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            throw r0     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
        L2b:
            r0 = move-exception
            goto L50
        L2d:
            r0 = move-exception
            java.lang.String r6 = com.bytedance.pangle.r.xt.up     // Catch: java.lang.Throwable -> L2b
            int r7 = com.bytedance.pangle.r.xt.j.tj     // Catch: java.lang.Throwable -> L2b
            r10 = -1
            r12 = 0
            r8 = r14
            r9 = r15
            j(r6, r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.pangle.oq r6 = com.bytedance.pangle.plugin.cw.j     // Catch: java.lang.Throwable -> L2b
            r7 = 1100(0x44c, float:1.541E-42)
            r8 = -3
            r9 = r14
            r10 = r15
            r11 = r0
            r6.j(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.pangle.plugin.cw$j r0 = new com.bytedance.pangle.plugin.cw$j     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r11.getMessage()     // Catch: java.lang.Throwable -> L2b
            r7 = 0
            r0.<init>(r6, r11, r7)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L50:
            r1.append(r3)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r1.append(r6)
            r1.append(r2)
            throw r0
    }

    private static boolean oq(java.io.File r12, java.lang.String r13, int r14, java.lang.StringBuffer r15) throws com.bytedance.pangle.plugin.cw.j {
            java.lang.String r1 = ";"
            java.lang.String r2 = "dexOpt1 cost:"
            long r3 = java.lang.System.currentTimeMillis()
            boolean r0 = com.bytedance.pangle.util.g.cw()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            if (r0 == 0) goto L2f
            com.bytedance.pangle.m.ae.j(r12, r13, r14)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            android.app.Application r12 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            android.content.SharedPreferences r12 = com.bytedance.pangle.m.xt.j(r12)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            android.content.SharedPreferences$Editor r12 = r12.putInt(r13, r14)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r12.apply()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            com.bytedance.pangle.m.m.j()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            goto L8b
        L28:
            r0 = move-exception
            r12 = r0
            goto Lb0
        L2c:
            r0 = move-exception
            r12 = r0
            goto L9b
        L2f:
            boolean r12 = com.bytedance.pangle.util.g.tl()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            if (r12 == 0) goto L8b
            java.lang.String r12 = com.bytedance.pangle.up.cw.cw(r13, r14)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            java.lang.String r0 = com.bytedance.pangle.up.cw.xt(r13, r14)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r5.<init>()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r5.append(r12)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            java.lang.String r6 = java.io.File.separator     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r5.append(r6)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            java.lang.String r7 = com.bytedance.pangle.m.xt.j(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r5.append(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r7.<init>()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r7.append(r12)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r7.append(r6)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            java.lang.String r12 = com.bytedance.pangle.m.xt.j(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r7.append(r12)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            java.lang.String r12 = r7.toString()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            boolean r12 = com.bytedance.pangle.m.xt.j(r0, r12)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            if (r12 == 0) goto L8b
            java.lang.String[] r12 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            boolean r12 = com.bytedance.pangle.m.xt.j(r12)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            if (r12 == 0) goto L8b
            r15.append(r2)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r3
            r15.append(r12)
            r15.append(r1)
            r12 = 1
            return r12
        L8b:
            r15.append(r2)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r3
            r15.append(r12)
            r15.append(r1)
            r12 = 0
            return r12
        L9b:
            java.lang.String r5 = com.bytedance.pangle.r.xt.up     // Catch: java.lang.Throwable -> L28
            int r6 = com.bytedance.pangle.r.xt.j.s     // Catch: java.lang.Throwable -> L28
            r9 = -1
            r11 = 0
            r7 = r13
            r8 = r14
            j(r5, r6, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L28
            com.bytedance.pangle.plugin.cw$j r13 = new com.bytedance.pangle.plugin.cw$j     // Catch: java.lang.Throwable -> L28
            java.lang.String r14 = "dexOpt1失败"
            r0 = 0
            r13.<init>(r14, r12, r0)     // Catch: java.lang.Throwable -> L28
            throw r13     // Catch: java.lang.Throwable -> L28
        Lb0:
            r15.append(r2)
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r3
            r15.append(r13)
            r15.append(r1)
            throw r12
    }

    static /* synthetic */ java.lang.String r(java.io.File r0, java.lang.String r1, int r2, java.lang.StringBuffer r3) throws com.bytedance.pangle.plugin.cw.j {
            java.lang.String r0 = g(r0, r1, r2, r3)
            return r0
    }

    private static void tl(java.io.File r20, java.lang.String r21, int r22, java.lang.StringBuffer r23) throws com.bytedance.pangle.plugin.cw.j {
            r1 = r23
            java.lang.String r2 = ";"
            java.lang.String r3 = "checkPermissions cost:"
            java.lang.String r0 = "The following permissions are declared in the plugin but not in the host: "
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 0
            android.app.Application r7 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            android.app.Application r8 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r9 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r9)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            android.app.Application r8 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String r10 = r20.getAbsolutePath()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            android.content.pm.PackageInfo r8 = r8.getPackageArchiveInfo(r10, r9)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String[] r7 = r7.requestedPermissions     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.util.List r7 = java.util.Arrays.asList(r7)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String[] r9 = r8.requestedPermissions     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            if (r9 == 0) goto L8b
            int r9 = r9.length     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            if (r9 <= 0) goto L8b
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r9.<init>()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String[] r8 = r8.requestedPermissions     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            int r10 = r8.length     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r11 = 0
        L49:
            if (r11 >= r10) goto L5f
            r12 = r8[r11]     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            boolean r13 = r7.contains(r12)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            if (r13 != 0) goto L5c
            r9.add(r12)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            goto L5c
        L57:
            r0 = move-exception
            goto Lbd
        L59:
            r0 = move-exception
            r12 = r0
            goto L9a
        L5c:
            int r11 = r11 + 1
            goto L49
        L5f:
            boolean r7 = r9.isEmpty()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            if (r7 != 0) goto L8b
            java.lang.String r7 = "PluginInstaller"
            java.lang.String r8 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String r8 = r0.concat(r8)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            com.bytedance.pangle.log.ZeusLogger.w(r7, r8)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            com.bytedance.pangle.GlobalParam r7 = com.bytedance.pangle.GlobalParam.getInstance()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            boolean r7 = r7.checkPermission()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            if (r7 != 0) goto L7d
            goto L8b
        L7d:
            com.bytedance.pangle.plugin.cw$j r7 = new com.bytedance.pangle.plugin.cw$j     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String r8 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String r0 = r0.concat(r8)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r7.<init>(r0, r6)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            throw r7     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
        L8b:
            r1.append(r3)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r1.append(r6)
            r1.append(r2)
            return
        L9a:
            java.lang.String r13 = com.bytedance.pangle.r.xt.up     // Catch: java.lang.Throwable -> L57
            int r14 = com.bytedance.pangle.r.xt.j.f     // Catch: java.lang.Throwable -> L57
            r17 = -1
            r19 = 0
            r15 = r21
            r16 = r22
            j(r13, r14, r15, r16, r17, r19)     // Catch: java.lang.Throwable -> L57
            com.bytedance.pangle.oq r7 = com.bytedance.pangle.plugin.cw.j     // Catch: java.lang.Throwable -> L57
            r8 = 1100(0x44c, float:1.541E-42)
            r9 = -4
            r10 = r21
            r11 = r22
            r7.j(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L57
            com.bytedance.pangle.plugin.cw$j r0 = new com.bytedance.pangle.plugin.cw$j     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = "安装包权限校验失败"
            r0.<init>(r7, r12, r6)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        Lbd:
            r1.append(r3)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r1.append(r6)
            r1.append(r2)
            throw r0
    }

    static /* synthetic */ boolean up(java.io.File r0, java.lang.String r1, int r2, java.lang.StringBuffer r3) throws com.bytedance.pangle.plugin.cw.j {
            boolean r0 = oq(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ java.util.Map xt(java.io.File r0, java.lang.String r1, int r2, java.lang.StringBuffer r3) throws com.bytedance.pangle.plugin.cw.j {
            java.util.Map r0 = ae(r0, r1, r2, r3)
            return r0
    }

    private static void xt(java.lang.String r5, int r6) {
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r1 = "install"
            int r0 = r0.xt(r5, r6, r1)
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()
            java.lang.String r2 = "load"
            int r1 = r1.xt(r5, r6, r2)
            com.bytedance.pangle.GlobalParam r2 = com.bytedance.pangle.GlobalParam.getInstance()
            int r2 = r2.getRemoveApkEntryFlag(r5)
            r3 = 0
            r4 = 3
            if (r0 > r4) goto L22
            if (r1 <= r4) goto L23
        L22:
            r2 = 0
        L23:
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            r0.j(r5, r6, r2)
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            r0.r(r5, r6, r3)
            return
    }

    private static void xt(java.lang.String r15, int r16, java.util.Map<java.lang.String, java.util.List<java.util.zip.ZipEntry>> r17, java.lang.StringBuffer r18) throws com.bytedance.pangle.plugin.cw.j {
            r1 = r18
            java.lang.String r2 = ";"
            java.lang.String r3 = "copySo cost:"
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = com.bytedance.pangle.up.cw.xt(r15, r16)
            java.lang.String r6 = com.bytedance.pangle.up.cw.r(r15, r16)
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r6 = r17
            com.bytedance.pangle.up.xt.j(r7, r0, r15, r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r1.append(r3)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r1.append(r6)
            r1.append(r2)
            return
        L30:
            r0 = move-exception
            goto L58
        L32:
            r0 = move-exception
            java.lang.String r8 = com.bytedance.pangle.r.xt.up     // Catch: java.lang.Throwable -> L30
            int r9 = com.bytedance.pangle.r.xt.j.x     // Catch: java.lang.Throwable -> L30
            java.lang.String r14 = com.bytedance.pangle.log.xt.j(r0)     // Catch: java.lang.Throwable -> L30
            r12 = -1
            r10 = r15
            r11 = r16
            j(r8, r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L30
            com.bytedance.pangle.oq r8 = com.bytedance.pangle.plugin.cw.j     // Catch: java.lang.Throwable -> L30
            r9 = 1100(0x44c, float:1.541E-42)
            r10 = -7
            r11 = r15
            r12 = r16
            r13 = r0
            r8.j(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L30
            com.bytedance.pangle.plugin.cw$j r0 = new com.bytedance.pangle.plugin.cw$j     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = "安装包动态库拷贝失败"
            r7 = 0
            r0.<init>(r6, r13, r7)     // Catch: java.lang.Throwable -> L30
            throw r0     // Catch: java.lang.Throwable -> L30
        L58:
            r1.append(r3)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r1.append(r6)
            r1.append(r2)
            throw r0
    }

    private static void xt(java.lang.String r18, java.lang.String r19, int r20, java.lang.StringBuffer r21) throws com.bytedance.pangle.plugin.cw.j {
            r0 = r21
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.bytedance.pangle.res.j.cw r4 = new com.bytedance.pangle.res.j.cw
            r4.<init>()
            java.io.File r5 = new java.io.File
            r6 = r18
            r5.<init>(r6)
            r6 = 0
            int r4 = r4.j(r5, r6, r3)
            r5 = 100
            if (r4 != r5) goto L23
            java.lang.String r6 = "modifyRes"
            goto L25
        L23:
            java.lang.String r6 = "noModifyRes"
        L25:
            r0.append(r6)
            java.lang.String r6 = " cost:"
            r0.append(r6)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            r0.append(r6)
            java.lang.String r1 = ";"
            r0.append(r1)
            if (r4 == r5) goto L7d
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 != r0) goto L41
            goto L7d
        L41:
            java.lang.String r11 = r3.toString()
            java.lang.String r5 = com.bytedance.pangle.r.xt.up
            int r6 = com.bytedance.pangle.r.xt.j.l
            r9 = -1
            r7 = r19
            r8 = r20
            j(r5, r6, r7, r8, r9, r11)
            com.bytedance.pangle.oq r12 = com.bytedance.pangle.plugin.cw.j
            r14 = -2
            r17 = 0
            r13 = 1100(0x44c, float:1.541E-42)
            r15 = r19
            r16 = r20
            r12.j(r13, r14, r15, r16, r17)
            com.bytedance.pangle.plugin.cw$j r0 = new com.bytedance.pangle.plugin.cw$j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "modifyRes failed. result = "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ", errorLog = "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        L7d:
            return
    }

    private static boolean xt(java.lang.String r10, int r11, boolean r12, java.lang.StringBuffer r13) {
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            int r0 = r0.g(r10, r11)
            r1 = r0 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            r0 = r0 & 2
            if (r0 == 0) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            if (r1 != 0) goto L22
            if (r6 != 0) goto L22
            java.lang.String r10 = "removeEntry skip;"
            r13.append(r10)
            return r2
        L22:
            if (r12 == 0) goto L28
            if (r1 == 0) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            java.lang.String r4 = com.bytedance.pangle.up.cw.xt(r10, r11)
            long r0 = java.lang.System.currentTimeMillis()
            r9 = 1
            r7 = r10
            r8 = r11
            boolean r10 = com.bytedance.pangle.util.xt.xt.j(r4, r5, r6, r7, r8, r9)
            java.lang.String r11 = "removeEntry cost:"
            r13.append(r11)
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r0
            r13.append(r11)
            java.lang.String r11 = ";"
            r13.append(r11)
            return r10
    }
}
