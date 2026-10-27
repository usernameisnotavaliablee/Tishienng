package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ea extends java.lang.Thread {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> f3187b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3188d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3189e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f3190g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3191h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3192i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3193j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3194k;
        final /* synthetic */ com.amap.api.col.p0003l.ea l;

        a(com.amap.api.col.p0003l.ea r1, java.lang.String r2, java.lang.String r3, boolean r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
                r0 = this;
                r0.l = r1
                r0.f3188d = r2
                r0.f3189e = r3
                r0.f3190g = r4
                r0.f3191h = r5
                r0.f3192i = r6
                r0.f3193j = r7
                r0.f3194k = r8
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r7 = this;
                java.lang.String r0 = r7.f3188d
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                java.lang.String r1 = "amap_web_logo"
                if (r0 != 0) goto L53
                java.lang.String r0 = r7.f3189e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L53
                boolean r0 = r7.f3190g
                java.lang.String r2 = com.autonavi.amap.mapcore.AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME
                java.lang.String r3 = r7.f3189e
                java.lang.String r4 = r7.f3188d
                java.lang.String r5 = r7.f3191h
                if (r0 == 0) goto L39
                com.amap.api.col.3l.fa$d r6 = new com.amap.api.col.3l.fa$d
                r6.<init>(r3, r4, r5, r2)
                java.lang.String r3 = "md5_day"
                r6.g(r1, r3)
                com.amap.api.col.3l.fa r3 = new com.amap.api.col.3l.fa
                com.amap.api.col.3l.ea r4 = r7.l
                android.content.Context r4 = com.amap.api.col.p0003l.ea.a(r4)
                com.amap.api.col.p0003l.b3.s()
                r3.<init>(r4, r6)
                r3.a()
            L39:
                com.amap.api.col.3l.ea r3 = r7.l
                java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r3 = r3.f3187b
                if (r3 == 0) goto L53
                java.lang.Object r3 = r3.get()
                if (r3 == 0) goto L53
                com.amap.api.col.3l.ea r3 = r7.l
                java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r3 = r3.f3187b
                java.lang.Object r3 = r3.get()
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r3
                r4 = 0
                r3.changeLogoIconStyle(r2, r0, r4)
            L53:
                java.lang.String r0 = r7.f3192i
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto La4
                java.lang.String r0 = r7.f3193j
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto La4
                boolean r0 = r7.f3190g
                java.lang.String r2 = com.autonavi.amap.mapcore.AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME
                java.lang.String r3 = r7.f3193j
                java.lang.String r4 = r7.f3192i
                java.lang.String r5 = r7.f3194k
                if (r0 == 0) goto L8a
                com.amap.api.col.3l.fa$d r6 = new com.amap.api.col.3l.fa$d
                r6.<init>(r3, r4, r5, r2)
                java.lang.String r3 = "md5_night"
                r6.g(r1, r3)
                com.amap.api.col.3l.fa r1 = new com.amap.api.col.3l.fa
                com.amap.api.col.3l.ea r3 = r7.l
                android.content.Context r3 = com.amap.api.col.p0003l.ea.a(r3)
                com.amap.api.col.p0003l.b3.s()
                r1.<init>(r3, r6)
                r1.a()
            L8a:
                com.amap.api.col.3l.ea r1 = r7.l
                java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r1 = r1.f3187b
                if (r1 == 0) goto La4
                java.lang.Object r1 = r1.get()
                if (r1 == 0) goto La4
                com.amap.api.col.3l.ea r1 = r7.l
                java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r1 = r1.f3187b
                java.lang.Object r1 = r1.get()
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r1
                r3 = 1
                r1.changeLogoIconStyle(r2, r0, r3)
            La4:
                return
        }
    }

    public ea(android.content.Context r2, com.autonavi.base.amap.api.mapcore.IAMapDelegate r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3187b = r0
            r1.a = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.f3187b = r2
            return
    }

    static /* synthetic */ android.content.Context a(com.amap.api.col.p0003l.ea r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    private android.util.Pair<org.json.JSONObject, com.amap.api.col.3l.g4.c.a> b(java.lang.StringBuilder r12) {
            r11 = this;
            java.lang.String r0 = "cloud_config_pull_timestamp"
            java.lang.String r1 = "cloud_config_pull"
            r2 = 0
            android.content.Context r3 = r11.a     // Catch: java.lang.Throwable -> L13d
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L13d
            java.lang.Long r3 = com.amap.api.col.p0003l.r2.a(r3, r1, r0, r4)     // Catch: java.lang.Throwable -> L13d
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L13d
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L13d
            long r3 = r5 - r3
            long r3 = java.lang.Math.abs(r3)     // Catch: java.lang.Throwable -> L13d
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r9 = ""
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 < 0) goto L3e
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L13d
            java.lang.String r3 = ";;"
            java.lang.String r4 = ";"
            r12.replaceAll(r3, r4)     // Catch: java.lang.Throwable -> L13d
            android.content.Context r3 = r11.a     // Catch: java.lang.Throwable -> L13d
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L13d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L13d
            com.amap.api.col.p0003l.r2.c(r3, r1, r0, r4)     // Catch: java.lang.Throwable -> L13d
            goto L3f
        L3e:
            r12 = r9
        L3f:
            android.content.Context r0 = r11.a     // Catch: java.lang.Throwable -> L13d
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L13d
            com.amap.api.col.3l.g4$c r0 = com.amap.api.col.p0003l.g4.c(r0, r1, r12, r2)     // Catch: java.lang.Throwable -> L13d
            int r1 = com.amap.api.col.p0003l.g4.a     // Catch: java.lang.Throwable -> L13d
            r3 = 1
            if (r1 == r3) goto L84
            if (r12 == r9) goto L84
            if (r0 == 0) goto L84
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r1 = r11.f3187b     // Catch: java.lang.Throwable -> L13d
            if (r1 == 0) goto L84
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L13d
            if (r1 == 0) goto L84
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r1 = r11.f3187b     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L13d
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r1     // Catch: java.lang.Throwable -> L13d
            android.os.Handler r1 = r1.getMainHandler()     // Catch: java.lang.Throwable -> L13d
            android.os.Message r1 = r1.obtainMessage()     // Catch: java.lang.Throwable -> L13d
            r3 = 2
            r1.what = r3     // Catch: java.lang.Throwable -> L13d
            java.lang.String r3 = r0.f3390c     // Catch: java.lang.Throwable -> L13d
            if (r3 == 0) goto L75
            r1.obj = r3     // Catch: java.lang.Throwable -> L13d
        L75:
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r3 = r11.f3187b     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L13d
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r3     // Catch: java.lang.Throwable -> L13d
            android.os.Handler r3 = r3.getMainHandler()     // Catch: java.lang.Throwable -> L13d
            r3.sendMessage(r1)     // Catch: java.lang.Throwable -> L13d
        L84:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13d
            r1.<init>()     // Catch: java.lang.Throwable -> L13d
            android.content.Context r3 = r11.a     // Catch: java.lang.Throwable -> L13d
            java.io.File r3 = com.autonavi.base.amap.mapcore.tools.GLFileUtil.getCacheDir(r3)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L13d
            r1.append(r3)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r3 = "/authCustomConfigName"
            r1.append(r3)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13d
            boolean r3 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L13d
            if (r3 != 0) goto Lb7
            if (r0 == 0) goto Lb7
            org.json.JSONObject r3 = r0.f3393f     // Catch: java.lang.Throwable -> L13d
            if (r3 == 0) goto Lb7
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L13d
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L13d
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.writeDatasToFile(r1, r4)     // Catch: java.lang.Throwable -> L13d
            goto Lc5
        Lb7:
            byte[] r1 = com.autonavi.base.amap.mapcore.tools.GLFileUtil.readFileContents(r1)     // Catch: java.lang.Throwable -> L13d
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13d
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L13d
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L13d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L13d
        Lc5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13d
            r1.<init>()     // Catch: java.lang.Throwable -> L13d
            android.content.Context r4 = r11.a     // Catch: java.lang.Throwable -> L13d
            java.io.File r4 = com.autonavi.base.amap.mapcore.tools.GLFileUtil.getCacheDir(r4)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L13d
            r1.append(r4)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r4 = "/authLogConfigName"
            r1.append(r4)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13d
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r4 = "IsExceptionUpdate"
            java.lang.String r5 = "mOfflineLoc"
            if (r12 != 0) goto L111
            if (r0 == 0) goto L111
            com.amap.api.col.3l.g4$c$a r12 = r0.f3394g     // Catch: java.lang.Throwable -> L13d
            if (r12 == 0) goto L111
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13d
            r12.<init>()     // Catch: java.lang.Throwable -> L13d
            com.amap.api.col.3l.g4$c$a r6 = r0.f3394g     // Catch: java.lang.Throwable -> L13d
            boolean r6 = r6.a     // Catch: java.lang.Throwable -> L13d
            r12.put(r4, r6)     // Catch: java.lang.Throwable -> L13d
            com.amap.api.col.3l.g4$c$a r4 = r0.f3394g     // Catch: java.lang.Throwable -> L13d
            org.json.JSONObject r4 = r4.f3398c     // Catch: java.lang.Throwable -> L13d
            r12.put(r5, r4)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L13d
            byte[] r12 = r12.getBytes()     // Catch: java.lang.Throwable -> L13d
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.writeDatasToFile(r1, r12)     // Catch: java.lang.Throwable -> L13d
            com.amap.api.col.3l.g4$c$a r12 = r0.f3394g     // Catch: java.lang.Throwable -> L13d
            goto L137
        L111:
            byte[] r12 = com.autonavi.base.amap.mapcore.tools.GLFileUtil.readFileContents(r1)     // Catch: java.lang.Throwable -> L13d
            com.amap.api.col.3l.g4$c$a r0 = new com.amap.api.col.3l.g4$c$a     // Catch: java.lang.Throwable -> L13d
            r0.<init>()     // Catch: java.lang.Throwable -> L13d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13d
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L13d
            r6.<init>(r12)     // Catch: java.lang.Throwable -> L13d
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L13d
            boolean r12 = r1.getBoolean(r4)     // Catch: java.lang.Throwable -> L13d
            r0.a = r12     // Catch: java.lang.Throwable -> L13d
            boolean r12 = r1.has(r5)     // Catch: java.lang.Throwable -> L13d
            if (r12 == 0) goto L136
            org.json.JSONObject r12 = r1.getJSONObject(r5)     // Catch: java.lang.Throwable -> L13d
            r0.f3398c = r12     // Catch: java.lang.Throwable -> L13d
        L136:
            r12 = r0
        L137:
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.Throwable -> L13d
            r0.<init>(r3, r12)     // Catch: java.lang.Throwable -> L13d
            return r0
        L13d:
            return r2
    }

    private static void c(android.content.Context r5, com.amap.api.col.p0003l.p4 r6, org.json.JSONObject r7) {
            java.lang.String r0 = ""
            if (r7 != 0) goto L5
            goto L41
        L5:
            java.lang.String r1 = "16V"
            org.json.JSONObject r7 = r7.optJSONObject(r1)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "di"
            java.lang.String r1 = r7.optString(r1, r0)     // Catch: java.lang.Throwable -> L41
            r2 = 0
            boolean r1 = com.amap.api.col.p0003l.g4.x(r1, r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "dis"
            java.lang.String r3 = r7.optString(r3, r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "able"
            java.lang.String r4 = r7.optString(r4, r0)     // Catch: java.lang.Throwable -> L41
            boolean r2 = com.amap.api.col.p0003l.g4.x(r4, r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "isFilter"
            java.lang.String r7 = r7.optString(r4, r0)     // Catch: java.lang.Throwable -> L41
            r0 = 1
            boolean r7 = com.amap.api.col.p0003l.g4.x(r7, r0)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L3a
            boolean r0 = com.amap.api.col.p0003l.q4.B(r3)     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L3a
            goto L41
        L3a:
            com.amap.api.col.3l.y5 r6 = com.amap.api.col.p0003l.y5.a(r6)     // Catch: java.lang.Throwable -> L41
            r6.b(r5, r2, r7)     // Catch: java.lang.Throwable -> L41
        L41:
            return
    }

    private void d(com.amap.api.col.3l.g4.c.a r6) {
            r5 = this;
            java.lang.String r0 = "maploc"
            if (r6 == 0) goto L4f
            boolean r1 = r6.a     // Catch: java.lang.Throwable -> L47
            android.content.Context r2 = r5.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "ue"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            com.amap.api.col.p0003l.x2.a(r2, r0, r3, r1)     // Catch: java.lang.Throwable -> L47
            org.json.JSONObject r6 = r6.f3398c     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "fn"
            r2 = 1000(0x3e8, float:1.401E-42)
            int r1 = r6.optInt(r1, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "mpn"
            r3 = 0
            int r2 = r6.optInt(r2, r3)     // Catch: java.lang.Throwable -> L47
            r4 = 500(0x1f4, float:7.0E-43)
            if (r2 <= r4) goto L28
            r2 = 500(0x1f4, float:7.0E-43)
        L28:
            r4 = 30
            if (r2 >= r4) goto L2e
            r2 = 30
        L2e:
            java.lang.String r4 = "igu"
            java.lang.String r6 = r6.optString(r4)     // Catch: java.lang.Throwable -> L47
            boolean r6 = com.amap.api.col.p0003l.g4.x(r6, r3)     // Catch: java.lang.Throwable -> L47
            com.amap.api.col.p0003l.h7.b(r1, r6)     // Catch: java.lang.Throwable -> L47
            android.content.Context r6 = r5.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "opn"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L47
            com.amap.api.col.p0003l.x2.a(r6, r0, r1, r2)     // Catch: java.lang.Throwable -> L47
            return
        L47:
            r6 = move-exception
            java.lang.String r0 = "AuthUtil"
            java.lang.String r1 = "loadConfigDataUploadException"
            com.amap.api.col.p0003l.w5.p(r6, r0, r1)
        L4f:
            return
    }

    private static void e(org.json.JSONObject r1) {
            if (r1 != 0) goto L3
            goto Lc
        L3:
            java.lang.String r0 = "17E"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.p0003l.d3.j(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    private void f(org.json.JSONObject r2) {
            r1 = this;
            if (r2 != 0) goto L4
            goto L8b
        L4:
            java.lang.String r0 = "1A1"
            org.json.JSONObject r2 = r2.optJSONObject(r0)     // Catch: java.lang.Exception -> L8b
            com.amap.api.col.3l.ia r0 = com.amap.api.col.p0003l.ia.a()     // Catch: java.lang.Exception -> L8b
            r0.b(r2)     // Catch: java.lang.Exception -> L8b
            com.amap.api.col.3l.ia r2 = com.amap.api.col.p0003l.ia.a()     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "feature_terrain"
            boolean r2 = r2.c(r0)     // Catch: java.lang.Exception -> L8b
            if (r2 != 0) goto L35
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r2 = r1.f3187b     // Catch: java.lang.Exception -> L8b
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L8b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r2     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L35
            r0 = 0
            r2.setTerrainAuth(r0)     // Catch: java.lang.Exception -> L8b
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "地形图功能为计费能力，请联系商务进行功能开通。"
            r2.<init>(r0)     // Catch: java.lang.Exception -> L8b
            com.amap.api.col.p0003l.b3.D(r2)     // Catch: java.lang.Exception -> L8b
        L35:
            com.amap.api.col.3l.ia r2 = com.amap.api.col.p0003l.ia.a()     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "feature_gltf"
            boolean r2 = r2.c(r0)     // Catch: java.lang.Exception -> L8b
            if (r2 != 0) goto L60
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r2 = r1.f3187b     // Catch: java.lang.Exception -> L8b
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L8b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r2     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L60
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r2.getGlOverlayLayer()     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L56
            java.lang.String r0 = "GLTFOVERLAY"
            r2.clearOverlayByType(r0)     // Catch: java.lang.Exception -> L8b
        L56:
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "GLTF功能不支持"
            r2.<init>(r0)     // Catch: java.lang.Exception -> L8b
            com.amap.api.col.p0003l.b3.D(r2)     // Catch: java.lang.Exception -> L8b
        L60:
            com.amap.api.col.3l.ia r2 = com.amap.api.col.p0003l.ia.a()     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "feature_mvt"
            boolean r2 = r2.c(r0)     // Catch: java.lang.Exception -> L8b
            if (r2 != 0) goto L8b
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r2 = r1.f3187b     // Catch: java.lang.Exception -> L8b
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L8b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r2     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L8b
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r2.getGlOverlayLayer()     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L81
            java.lang.String r0 = "MVTTILEOVERLAY"
            r2.clearOverlayByType(r0)     // Catch: java.lang.Exception -> L8b
        L81:
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "MVT功能不支持"
            r2.<init>(r0)     // Catch: java.lang.Exception -> L8b
            com.amap.api.col.p0003l.b3.D(r2)     // Catch: java.lang.Exception -> L8b
        L8b:
            return
    }

    private static void g(org.json.JSONObject r5) {
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            goto L33
        L5:
            java.lang.String r1 = "16G"
            org.json.JSONObject r5 = r5.optJSONObject(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "able"
            java.lang.String r1 = r5.optString(r1, r0)     // Catch: java.lang.Throwable -> L33
            r2 = 0
            boolean r1 = com.amap.api.col.p0003l.g4.x(r1, r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "removeCache"
            java.lang.String r3 = r5.optString(r3, r0)     // Catch: java.lang.Throwable -> L33
            boolean r3 = com.amap.api.col.p0003l.g4.x(r3, r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "uploadInfo"
            java.lang.String r5 = r5.optString(r4, r0)     // Catch: java.lang.Throwable -> L33
            boolean r5 = com.amap.api.col.p0003l.g4.x(r5, r2)     // Catch: java.lang.Throwable -> L33
            com.amap.api.col.p0003l.s2.a(r1)     // Catch: java.lang.Throwable -> L33
            com.amap.api.col.p0003l.s2.d(r3)     // Catch: java.lang.Throwable -> L33
            com.amap.api.col.p0003l.s2.f(r5)     // Catch: java.lang.Throwable -> L33
        L33:
            return
    }

    private void h(org.json.JSONObject r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L25
        L3:
            java.lang.String r0 = "17W"
            org.json.JSONObject r4 = r4.optJSONObject(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "able"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.optString(r0, r1)     // Catch: java.lang.Throwable -> L25
            r0 = 0
            boolean r4 = com.amap.api.col.p0003l.g4.x(r4, r0)     // Catch: java.lang.Throwable -> L25
            android.content.Context r0 = r3.a     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "amap_param"
            java.lang.String r2 = "overlay_use_old_type"
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.p0003l.r2.c(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L25
        L25:
            return
    }

    @Override // java.lang.Thread
    public final void interrupt() {
            r0 = this;
            super.interrupt()
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r17 = this;
            r1 = r17
            java.lang.String r0 = "time"
            java.lang.String r2 = "te"
            java.lang.String r3 = "si"
            java.lang.String r4 = "mc"
            java.lang.String r5 = "15C"
            java.lang.String r6 = "156"
            java.lang.String r7 = "154"
            java.lang.String r8 = "14L"
            java.lang.String r9 = "14M"
            java.lang.String r10 = ";"
            boolean r11 = com.amap.api.maps.MapsInitializer.getNetWorkEnable()     // Catch: java.lang.Throwable -> Lfe
            if (r11 != 0) goto L1e
            goto L2bb
        L1e:
            com.amap.api.col.3l.k4 r11 = com.amap.api.col.p0003l.k4.a()     // Catch: java.lang.Throwable -> Lfe
            android.content.Context r12 = r1.a     // Catch: java.lang.Throwable -> Lfe
            r11.c(r12)     // Catch: java.lang.Throwable -> Lfe
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfe
            r11.<init>()     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r12 = "14S"
            r11.append(r12)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r12 = "11K"
            r11.append(r12)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r12 = "001"
            r11.append(r12)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r9)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r8)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r12 = "16V"
            r11.append(r12)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r12 = "14Z"
            r11.append(r12)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r7)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r6)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r5)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r12 = "16G"
            r11.append(r12)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r12 = "17W"
            r11.append(r12)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r12 = "17E"
            r11.append(r12)     // Catch: java.lang.Throwable -> Lfe
            r11.append(r10)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r12 = "1A1"
            r11.append(r12)     // Catch: java.lang.Throwable -> Lfe
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r12 = r1.f3187b     // Catch: java.lang.Throwable -> Lc5
            if (r12 == 0) goto Lc5
            java.lang.Object r12 = r12.get()     // Catch: java.lang.Throwable -> Lc5
            if (r12 == 0) goto Lc5
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r12 = r1.f3187b     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r12 = r12.get()     // Catch: java.lang.Throwable -> Lc5
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r12 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r12     // Catch: java.lang.Throwable -> Lc5
            com.autonavi.extra.b r13 = r12.getAMapExtraInterfaceManager()     // Catch: java.lang.Throwable -> Lc5
            if (r13 == 0) goto Lc5
            com.autonavi.extra.b r12 = r12.getAMapExtraInterfaceManager()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r12 = r12.g()     // Catch: java.lang.Throwable -> Lc5
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> Lc5
            if (r13 != 0) goto Lc5
            int r13 = r12.indexOf(r10)     // Catch: java.lang.Throwable -> Lc5
            if (r13 != 0) goto Lbf
            r11.append(r12)     // Catch: java.lang.Throwable -> Lc5
            goto Lc5
        Lbf:
            r11.append(r10)     // Catch: java.lang.Throwable -> Lc5
            r11.append(r12)     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            android.util.Pair r10 = r1.b(r11)     // Catch: java.lang.Throwable -> Lfe
            r11 = 1
            java.lang.String r12 = "able"
            if (r10 == 0) goto L117
            java.lang.Object r13 = r10.first     // Catch: java.lang.Throwable -> Lfe
            if (r13 == 0) goto L117
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch: java.lang.Throwable -> Lfe
            org.json.JSONObject r7 = r13.optJSONObject(r7)     // Catch: java.lang.Throwable -> Lfe
            if (r7 == 0) goto L117
            java.lang.String r13 = r7.getString(r12)     // Catch: java.lang.Throwable -> Lfe
            boolean r13 = com.amap.api.col.p0003l.g4.x(r13, r11)     // Catch: java.lang.Throwable -> Lfe
            if (r13 == 0) goto L117
            java.lang.String r13 = r7.optString(r4)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r14 = r7.optString(r3)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r7 = r7.optString(r2)     // Catch: java.lang.Throwable -> Lfe
            boolean r15 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r11 = "approval_number"
            if (r15 != 0) goto L101
            android.content.Context r15 = r1.a     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.p0003l.r2.c(r15, r11, r4, r13)     // Catch: java.lang.Throwable -> Lfe
            goto L101
        Lfe:
            r0 = move-exception
            goto L2bc
        L101:
            boolean r4 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> Lfe
            if (r4 != 0) goto L10c
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.p0003l.r2.c(r4, r11, r3, r14)     // Catch: java.lang.Throwable -> Lfe
        L10c:
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lfe
            if (r3 != 0) goto L117
            android.content.Context r3 = r1.a     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.p0003l.r2.c(r3, r11, r2, r7)     // Catch: java.lang.Throwable -> Lfe
        L117:
            if (r10 == 0) goto L12c
            java.lang.Object r2 = r10.second     // Catch: java.lang.Throwable -> Lfe
            if (r2 == 0) goto L12c
            com.amap.api.col.3l.p4 r2 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> Lfe
            if (r2 == 0) goto L12c
            java.lang.Object r3 = r10.second     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.g4$c$a r3 = (com.amap.api.col.3l.g4.c.a) r3     // Catch: java.lang.Throwable -> Lfe
            boolean r3 = r3.a     // Catch: java.lang.Throwable -> Lfe
            r2.c(r3)     // Catch: java.lang.Throwable -> Lfe
        L12c:
            if (r10 == 0) goto L135
            java.lang.Object r2 = r10.second     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.g4$c$a r2 = (com.amap.api.col.3l.g4.c.a) r2     // Catch: java.lang.Throwable -> Lfe
            r1.d(r2)     // Catch: java.lang.Throwable -> Lfe
        L135:
            if (r10 == 0) goto L19d
            java.lang.Object r2 = r10.first     // Catch: java.lang.Throwable -> L165
            if (r2 == 0) goto L19d
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Throwable -> L165
            org.json.JSONObject r2 = r2.optJSONObject(r9)     // Catch: java.lang.Throwable -> L165
            if (r2 == 0) goto L19d
            boolean r3 = r2.has(r12)     // Catch: java.lang.Throwable -> L165
            if (r3 == 0) goto L19d
            java.lang.String r3 = r2.getString(r12)     // Catch: java.lang.Throwable -> L165
            r4 = 1
            boolean r3 = com.amap.api.col.p0003l.g4.x(r3, r4)     // Catch: java.lang.Throwable -> L165
            if (r3 == 0) goto L19d
            boolean r3 = r2.has(r0)     // Catch: java.lang.Throwable -> L165
            if (r3 == 0) goto L167
            int r2 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L165
            r3 = 60
            int r2 = java.lang.Math.max(r3, r2)     // Catch: java.lang.Throwable -> L165
            goto L16a
        L165:
            goto L19d
        L167:
            r2 = 2592000(0x278d00, float:3.632166E-39)
        L16a:
            android.content.Context r3 = r1.a     // Catch: java.lang.Throwable -> L165
            java.lang.String r4 = "Map3DCache"
            r13 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L165
            java.lang.Long r0 = com.amap.api.col.p0003l.r2.a(r3, r4, r0, r7)     // Catch: java.lang.Throwable -> L165
            long r3 = r0.longValue()     // Catch: java.lang.Throwable -> L165
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L165
            long r13 = r13 - r3
            int r2 = r2 * 1000
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L165
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 <= 0) goto L19d
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r0 = r1.f3187b     // Catch: java.lang.Throwable -> L165
            if (r0 == 0) goto L19d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L165
            if (r0 == 0) goto L19d
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r0 = r1.f3187b     // Catch: java.lang.Throwable -> L165
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L165
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r0     // Catch: java.lang.Throwable -> L165
            r0.clearTileCache()     // Catch: java.lang.Throwable -> L165
        L19d:
            r9 = 0
            if (r10 == 0) goto L1d5
            java.lang.Object r0 = r10.first     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L1d5
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L1d4
            org.json.JSONObject r0 = r0.optJSONObject(r8)     // Catch: java.lang.Throwable -> L1d4
            if (r0 == 0) goto L1d5
            boolean r2 = r0.has(r12)     // Catch: java.lang.Throwable -> L1d4
            if (r2 == 0) goto L1d5
            java.lang.String r0 = r0.getString(r12)     // Catch: java.lang.Throwable -> L1d4
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r9)     // Catch: java.lang.Throwable -> L1d4
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r2 = r1.f3187b     // Catch: java.lang.Throwable -> L1d4
            if (r2 == 0) goto L1d5
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L1d4
            if (r2 == 0) goto L1d5
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r2 = r1.f3187b     // Catch: java.lang.Throwable -> L1d4
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L1d4
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r2     // Catch: java.lang.Throwable -> L1d4
            r16 = 1
            r0 = r0 ^ 1
            r2.setHideLogoEnble(r0)     // Catch: java.lang.Throwable -> L1d4
            goto L1d5
        L1d4:
        L1d5:
            if (r10 == 0) goto L1ee
            java.lang.Object r0 = r10.first     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L1ee
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lfe
            org.json.JSONObject r0 = r0.optJSONObject(r6)     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L1ee
            java.lang.String r0 = r0.optString(r12)     // Catch: java.lang.Throwable -> Lfe
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r9)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.p0003l.p2.e(r0)     // Catch: java.lang.Throwable -> Lfe
        L1ee:
            if (r10 == 0) goto L201
            java.lang.Object r0 = r10.first     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L201
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.p4 r2 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> Lfe
            java.lang.Object r3 = r10.first     // Catch: java.lang.Throwable -> Lfe
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: java.lang.Throwable -> Lfe
            c(r0, r2, r3)     // Catch: java.lang.Throwable -> Lfe
        L201:
            if (r10 == 0) goto L247
            java.lang.Object r0 = r10.first     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L247
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lfe
            org.json.JSONObject r0 = r0.optJSONObject(r5)     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L247
            java.lang.String r2 = r0.optString(r12)     // Catch: java.lang.Throwable -> Lfe
            boolean r4 = com.amap.api.col.p0003l.g4.x(r2, r9)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r2 = "logo_day_url"
            java.lang.String r3 = r0.optString(r2)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r2 = "logo_day_md5"
            java.lang.String r2 = r0.optString(r2)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r5 = "logo_night_url"
            java.lang.String r7 = r0.optString(r5)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r5 = "logo_night_md5"
            java.lang.String r6 = r0.optString(r5)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r5 = "logo_day_ipv6_url"
            java.lang.String r5 = r0.optString(r5)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r8 = "logo_night_ipv6_url"
            java.lang.String r8 = r0.optString(r8)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.z2 r11 = com.amap.api.col.p0003l.z2.a()     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.ea$a r0 = new com.amap.api.col.3l.ea$a     // Catch: java.lang.Throwable -> Lfe
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lfe
            r11.b(r0)     // Catch: java.lang.Throwable -> Lfe
        L247:
            if (r10 == 0) goto L26e
            java.lang.Object r0 = r10.first     // Catch: java.lang.Throwable -> L26d
            if (r0 == 0) goto L26e
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r0 = r1.f3187b     // Catch: java.lang.Throwable -> L26d
            if (r0 == 0) goto L26e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L26d
            if (r0 == 0) goto L26e
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r0 = r1.f3187b     // Catch: java.lang.Throwable -> L26d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L26d
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r0     // Catch: java.lang.Throwable -> L26d
            com.autonavi.extra.b r2 = r0.getAMapExtraInterfaceManager()     // Catch: java.lang.Throwable -> L26d
            if (r2 == 0) goto L26e
            com.autonavi.extra.b r0 = r0.getAMapExtraInterfaceManager()     // Catch: java.lang.Throwable -> L26d
            r0.h()     // Catch: java.lang.Throwable -> L26d
            goto L26e
        L26d:
        L26e:
            if (r10 == 0) goto L279
            java.lang.Object r0 = r10.first     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L279
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lfe
            g(r0)     // Catch: java.lang.Throwable -> Lfe
        L279:
            if (r10 == 0) goto L284
            java.lang.Object r0 = r10.first     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L284
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lfe
            r1.h(r0)     // Catch: java.lang.Throwable -> Lfe
        L284:
            if (r10 == 0) goto L28f
            java.lang.Object r0 = r10.first     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L28f
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lfe
            e(r0)     // Catch: java.lang.Throwable -> Lfe
        L28f:
            if (r10 == 0) goto L29a
            java.lang.Object r0 = r10.first     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L29a
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lfe
            r1.f(r0)     // Catch: java.lang.Throwable -> Lfe
        L29a:
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.p4 r2 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.p0003l.w5.g(r0, r2)     // Catch: java.lang.Throwable -> Lfe
            r1.interrupt()     // Catch: java.lang.Throwable -> Lfe
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r0 = r1.f3187b     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L2bb
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L2bb
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r0 = r1.f3187b     // Catch: java.lang.Throwable -> Lfe
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lfe
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r0     // Catch: java.lang.Throwable -> Lfe
            r0.setRunLowFrame(r9)     // Catch: java.lang.Throwable -> Lfe
        L2bb:
            return
        L2bc:
            r1.interrupt()
            java.lang.String r2 = "AMapDelegateImpGLSurfaceView"
            java.lang.String r3 = "mVerfy"
            com.amap.api.col.p0003l.w5.p(r0, r2, r3)
            java.lang.String r2 = com.amap.api.col.p0003l.c3.f3066e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "auth exception "
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.amap.api.col.p0003l.d3.l(r2, r0)
            return
    }
}
