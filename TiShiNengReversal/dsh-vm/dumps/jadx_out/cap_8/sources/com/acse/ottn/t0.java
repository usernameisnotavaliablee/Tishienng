package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class t0 {
    public static com.acse.ottn.t0 a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f2798b = "t0";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.accessibilityservice.AccessibilityService.TakeScreenshotCallback {
        public final /* synthetic */ java.lang.String a;

        public a(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
        public void onFailure(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onFailure code is "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "samon ScreenShotResult"
                com.acse.ottn.h2.c(r0, r3)
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
        @androidx.annotation.RequiresApi(api = 30)
        public void onSuccess(@androidx.annotation.NonNull android.accessibilityservice.AccessibilityService.ScreenshotResult r2) {
                r1 = this;
                android.hardware.HardwareBuffer r0 = l.k.a(r2)
                android.graphics.ColorSpace r2 = l.l.a(r2)
                android.graphics.Bitmap r2 = l.m.a(r0, r2)
                java.lang.String r0 = r1.a
                com.acse.ottn.t0.a(r2, r0)
                com.acse.ottn.t0.a(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4);
    }

    static {
            return
    }

    public t0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.io.File a() {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r1 = "crash"
            java.io.File r0 = r0.getExternalFilesDir(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L13
            r0.mkdirs()
        L13:
            return r0
    }

    public static void a(android.accessibilityservice.AccessibilityService r2, java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1a
            if (r2 != 0) goto L9
            goto L1a
        L9:
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.util.concurrent.Executor r0 = l.g.a(r0)
            com.acse.ottn.t0$a r1 = new com.acse.ottn.t0$a
            r1.<init>(r3)
            r3 = 0
            l.h.a(r2, r3, r0, r1)
        L1a:
            return
    }

    public static /* synthetic */ void a(android.graphics.Bitmap r0) {
            b(r0)
            return
    }

    public static void a(android.graphics.Bitmap r3, java.io.File r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 20
            r3.compress(r1, r2, r0)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L1e
            r3.<init>(r4)     // Catch: java.lang.Exception -> L1e
            byte[] r4 = r0.toByteArray()     // Catch: java.lang.Exception -> L1e
            r3.write(r4)     // Catch: java.lang.Exception -> L1e
            r3.flush()     // Catch: java.lang.Exception -> L1e
            r3.close()     // Catch: java.lang.Exception -> L1e
        L1e:
            return
    }

    public static void a(android.graphics.Bitmap r3, java.lang.String r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L1b
            r2 = 20
            r3.compress(r1, r2, r0)     // Catch: java.lang.Throwable -> L1b
            byte[] r3 = r0.toByteArray()     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)     // Catch: java.lang.Throwable -> L1b
            com.acse.ottn.r1.c()     // Catch: java.lang.Throwable -> L1b
            com.acse.ottn.r1.a(r3, r4)     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    public static com.acse.ottn.t0 b() {
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.t0> r0 = com.acse.ottn.t0.class
            monitor-enter(r0)
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.t0 r1 = new com.acse.ottn.t0     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.t0.a = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.a
            return r0
    }

    public static void b(android.graphics.Bitmap r4) {
            boolean r0 = com.acse.ottn.activity.AcseHelpManager.mIsDebug
            if (r0 != 0) goto L5
            return
        L5:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = a()
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            r3 = 10000(0x2710, float:1.4013E-41)
            int r2 = r2.nextInt(r3)
            r1.append(r2)
            java.lang.String r2 = "shotdd.png"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            a(r4, r0)
            return
    }

    public int a(java.lang.String r2, int r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r3
        L7:
            int r2 = r2.length()
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 >= r0) goto L10
            int r2 = r2 + r3
        L10:
            return r2
    }

    public okhttp3.RequestBody a(java.util.Map r3) {
            r2 = this;
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r3)
            com.acse.ottn.f r0 = com.acse.ottn.f.b()
            java.lang.String r3 = r0.a(r3)
            java.lang.String r0 = "\\n"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = "data"
            r0.put(r1, r3)
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "samon all request data = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RetrofitServiceManager"
            com.acse.ottn.h2.a(r1, r0)
            java.lang.String r0 = "application/json,utf-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            okhttp3.RequestBody r3 = okhttp3.RequestBody.create(r0, r3)
            return r3
    }

    public okhttp3.RequestBody a(java.util.Map r10, java.lang.String r11) {
            r9 = this;
            java.lang.String r10 = com.alibaba.fastjson.JSON.toJSONString(r10)
            java.lang.String r0 = com.acse.ottn.t0.f2798b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "内容  getTitle="
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "samon importantData ="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RetrofitServiceManager"
            com.acse.ottn.h2.a(r1, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r2 = "heart_beat"
            boolean r11 = r2.equals(r11)
            java.lang.String r3 = "samon all request data = "
            java.lang.String r4 = "content"
            java.lang.String r5 = "sdk_version"
            java.lang.String r6 = ""
            java.lang.String r7 = "\\n"
            java.lang.String r8 = "application/json,utf-8"
            if (r11 == 0) goto L82
            java.lang.String r11 = "1"
            r0.put(r2, r11)
            com.acse.ottn.g r11 = com.acse.ottn.g.a()
            r2 = 1
            java.lang.String r10 = r11.b(r10, r2)
            java.lang.String r10 = r10.replaceAll(r7, r6)
            java.lang.String r11 = com.acse.ottn.l0.l
            r0.put(r5, r11)
            r0.put(r4, r10)
            java.lang.String r10 = com.alibaba.fastjson.JSON.toJSONString(r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.acse.ottn.h2.a(r1, r11)
            okhttp3.MediaType r11 = okhttp3.MediaType.parse(r8)
            okhttp3.RequestBody r10 = okhttp3.RequestBody.create(r11, r10)
            return r10
        L82:
            com.acse.ottn.g r11 = com.acse.ottn.g.a()
            r2 = 0
            java.lang.String r11 = r11.b(r10, r2)
            java.lang.String r11 = r11.replaceAll(r7, r6)
            java.lang.String r2 = com.acse.ottn.l0.a(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto La2
            okhttp3.MediaType r11 = okhttp3.MediaType.parse(r8)
            okhttp3.RequestBody r10 = okhttp3.RequestBody.create(r11, r10)
            return r10
        La2:
            java.lang.String r10 = com.acse.ottn.l0.l
            r0.put(r5, r10)
            r0.put(r4, r11)
            java.lang.String r10 = com.alibaba.fastjson.JSON.toJSONString(r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.acse.ottn.h2.a(r1, r11)
            okhttp3.MediaType r11 = okhttp3.MediaType.parse(r8)
            okhttp3.RequestBody r10 = okhttp3.RequestBody.create(r11, r10)
            return r10
    }

    public void a(java.lang.String r6, com.acse.ottn.model.WxClickDataModel r7) {
            r5 = this;
            java.lang.String r0 = "applet_data"
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L3b
            if (r1 == 0) goto L4f
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = r1.e(r0)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = com.acse.ottn.t0.f2798b     // Catch: java.lang.Exception -> L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r3.<init>()     // Catch: java.lang.Exception -> L3b
            java.lang.String r4 = "changeHeartAppletData applet_data ="
            r3.append(r4)     // Catch: java.lang.Exception -> L3b
            r3.append(r1)     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L3b
            com.acse.ottn.h2.a(r2, r3)     // Catch: java.lang.Exception -> L3b
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L3b
            if (r2 == 0) goto L2d
            return
        L2d:
            java.util.Map r1 = com.acse.ottn.a2.b(r1)     // Catch: java.lang.Exception -> L3b
            int r2 = r7.getToast_times()     // Catch: java.lang.Exception -> L3b
            if (r2 != 0) goto L3d
            r1.remove(r6)     // Catch: java.lang.Exception -> L3b
            goto L44
        L3b:
            r6 = move-exception
            goto L57
        L3d:
            java.lang.String r7 = com.alibaba.fastjson.JSON.toJSONString(r7)     // Catch: java.lang.Exception -> L3b
            r1.put(r6, r7)     // Catch: java.lang.Exception -> L3b
        L44:
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L3b
            java.lang.String r7 = com.alibaba.fastjson.JSON.toJSONString(r1)     // Catch: java.lang.Exception -> L3b
            r6.b(r0, r7)     // Catch: java.lang.Exception -> L3b
        L4f:
            java.lang.String r6 = com.acse.ottn.t0.f2798b     // Catch: java.lang.Exception -> L3b
            java.lang.String r7 = "changeHeartAppletData adPackageModel is null "
            com.acse.ottn.h2.a(r6, r7)     // Catch: java.lang.Exception -> L3b
            return
        L57:
            java.lang.String r7 = com.acse.ottn.t0.f2798b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "changeHeartAppletData Exception e ="
            r0.append(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.acse.ottn.h2.a(r7, r6)
            return
    }

    public void a(java.util.List<java.lang.String> r12, java.util.List<java.lang.String> r13, com.acse.ottn.t0.b r14) {
            r11 = this;
            int r0 = r13.size()
            if (r0 == 0) goto Lde
            int r0 = r12.size()
            if (r0 != 0) goto Le
            goto Lde
        Le:
            r0 = 0
            r1 = 0
        L10:
            int r2 = r13.size()
            if (r1 >= r2) goto Lde
            java.lang.Object r2 = r13.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "\\|"
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            if (r3 >= 0) goto L27
            goto Lde
        L27:
            r3 = 0
        L28:
            int r4 = r12.size()
            if (r3 >= r4) goto Lda
            r4 = r2[r0]
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto Ld6
            java.lang.Object r4 = r12.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r5 = r2[r0]
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto Ld6
            r4 = 1
            r5 = r2[r4]
            java.lang.String r6 = "0"
            boolean r5 = r5.equals(r6)
            r6 = 2
            java.lang.String r7 = ""
            if (r5 == 0) goto L5e
            r12 = r2[r4]
            r13 = r2[r6]
            int r13 = java.lang.Integer.parseInt(r13)
            r14.a(r12, r13, r7, r7)
            return
        L5e:
            r5 = r2[r4]
            java.lang.String r8 = "1"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L7a
            r13 = r2[r4]
            r0 = r2[r6]
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Object r12 = r12.get(r3)
            java.lang.String r12 = (java.lang.String) r12
            r14.a(r13, r0, r12, r7)
            return
        L7a:
            r5 = r2[r4]
            java.lang.String r8 = "2"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L90
            r12 = r2[r4]
            r13 = r2[r6]
            int r13 = java.lang.Integer.parseInt(r13)
            r14.a(r12, r13, r7, r7)
            return
        L90:
            r5 = r2[r4]
            java.lang.String r8 = "3"
            boolean r5 = r5.equals(r8)
            r8 = 4
            r9 = 3
            if (r5 == 0) goto Lac
            r12 = r2[r4]
            r13 = r2[r6]
            int r13 = java.lang.Integer.parseInt(r13)
            r0 = r2[r9]
            r1 = r2[r8]
            r14.a(r12, r13, r0, r1)
            return
        Lac:
            r5 = r2[r4]
            java.lang.String r10 = "4"
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto Lc6
            r12 = r2[r4]
            r13 = r2[r6]
            int r13 = java.lang.Integer.parseInt(r13)
            r0 = r2[r9]
            r1 = r2[r8]
            r14.a(r12, r13, r0, r1)
            return
        Lc6:
            r5 = r2[r4]
            java.lang.String r6 = "5"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Ld6
            r12 = r2[r4]
            r14.a(r12, r0, r7, r7)
            return
        Ld6:
            int r3 = r3 + 1
            goto L28
        Lda:
            int r1 = r1 + 1
            goto L10
        Lde:
            return
    }

    public boolean a(int r3) {
            r2 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 <= r0) goto L11
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
            java.lang.String r0 = com.acse.ottn.l0.p
            java.lang.String r1 = "scroll_state"
            r3.b(r1, r0)
            r3 = 0
            return r3
        L11:
            r3 = 1
            return r3
    }

    public final boolean a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ".*\\d+.*"
            boolean r2 = r2.matches(r0)
            return r2
    }

    public boolean a(java.util.List<java.lang.String> r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L47
            int r1 = r5.size()
            if (r1 != 0) goto La
            goto L47
        La:
            r1 = 0
        Lb:
            int r2 = r5.size()
            if (r1 >= r2) goto L46
            java.lang.Object r2 = r5.get(r1)
            if (r2 == 0) goto L43
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "https"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L41
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "匿名"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L41
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            r3 = 17
            if (r2 <= r3) goto L43
        L41:
            r5 = 1
            return r5
        L43:
            int r1 = r1 + 1
            goto Lb
        L46:
            return r0
        L47:
            java.lang.String r5 = com.acse.ottn.t0.f2798b
            java.lang.String r1 = "getGoodsTitle lists = null"
            com.acse.ottn.h2.a(r5, r1)
            return r0
    }

    public boolean a(java.util.List<java.lang.String> r5, int r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L4f
            int r1 = r5.size()
            if (r1 != 0) goto La
            goto L4f
        La:
            boolean r1 = r4.d(r5)
            if (r1 != 0) goto L11
            return r0
        L11:
            r1 = 0
        L12:
            int r2 = r5.size()
            if (r1 >= r2) goto L4e
            java.lang.Object r2 = r5.get(r1)
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "￥"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L42
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "¥"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L4b
        L42:
            int r5 = r5.size()
            if (r5 < r6) goto L4a
            r5 = 1
            return r5
        L4a:
            return r0
        L4b:
            int r1 = r1 + 1
            goto L12
        L4e:
            return r0
        L4f:
            java.lang.String r5 = com.acse.ottn.t0.f2798b
            java.lang.String r6 = "judgeData lists = null"
            com.acse.ottn.h2.a(r5, r6)
            return r0
    }

    public boolean a(java.util.List<java.lang.String> r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = 0
            r2 = 0
        L7:
            boolean r3 = r7.hasNext()
            r4 = 1
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r7.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L21
            boolean r5 = r8.equals(r3)
            if (r5 == 0) goto L21
            r1 = 1
        L21:
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L7
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L7
            r2 = 1
            goto L7
        L2f:
            if (r1 == 0) goto L34
            if (r2 == 0) goto L34
            return r4
        L34:
            return r0
    }

    public int b(int r3) {
            r2 = this;
            boolean r0 = com.acse.ottn.activity.AcseHelpManager.mIsDebug
            if (r0 == 0) goto Lc
            java.lang.String r0 = com.acse.ottn.t0.f2798b
            java.lang.String r1 = "setReadTime is debug"
            com.acse.ottn.h2.a(r0, r1)
            return r3
        Lc:
            java.lang.String r0 = com.acse.ottn.t0.f2798b
            java.lang.String r1 = "setReadTime is release"
            com.acse.ottn.h2.a(r0, r1)
            return r3
    }

    public com.acse.ottn.model.PageSettingTypeModel b(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = com.acse.ottn.t0.f2798b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getCurrentPageSettingData json ="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L1e
            r4 = 0
            return r4
        L1e:
            java.lang.Class<com.acse.ottn.model.PageSettingTypeModel> r0 = com.acse.ottn.model.PageSettingTypeModel.class
            java.lang.Object r4 = com.alibaba.fastjson.JSON.parseObject(r4, r0)
            com.acse.ottn.model.PageSettingTypeModel r4 = (com.acse.ottn.model.PageSettingTypeModel) r4
            return r4
    }

    public boolean b(java.lang.String r3, int r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "月销"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L44
            java.lang.String r0 = "已售"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L44
            java.lang.String r0 = "[1-9]\\d*\\.?\\d*"
            boolean r0 = r3.matches(r0)
            if (r0 != 0) goto L44
            java.lang.String r0 = "￥"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L44
            java.lang.String r0 = "¥"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L31
            goto L44
        L31:
            int r0 = r3.length()
            if (r0 > r4) goto L3e
            boolean r4 = r2.a(r3)
            if (r4 != 0) goto L3e
            return r1
        L3e:
            r4 = 2
            boolean r3 = r2.c(r3, r4)
            return r3
        L44:
            r3 = 1
            return r3
    }

    public boolean b(java.util.List<java.lang.String> r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L39
            int r1 = r5.size()
            if (r1 != 0) goto La
            goto L39
        La:
            r1 = 0
        Lb:
            int r2 = r5.size()
            if (r1 >= r2) goto L38
            java.lang.Object r2 = r5.get(r1)
            if (r2 == 0) goto L35
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "￥"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L33
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "¥"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L35
        L33:
            r5 = 1
            return r5
        L35:
            int r1 = r1 + 1
            goto Lb
        L38:
            return r0
        L39:
            java.lang.String r5 = com.acse.ottn.t0.f2798b
            java.lang.String r1 = "getPrice lists = null"
            com.acse.ottn.h2.a(r5, r1)
            return r0
    }

    public com.acse.ottn.model.AdPackageModel c() {
            r4 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L13
            java.lang.String r0 = com.acse.ottn.t0.f2798b
            java.lang.String r1 = "parserHeardBeatData samon parserHeardBeatData is null"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.model.AdPackageModel r0 = new com.acse.ottn.model.AdPackageModel
            r0.<init>()
            return r0
        L13:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "show_ad_activity"
            java.lang.String r0 = r0.e(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L30
            java.lang.String r0 = com.acse.ottn.t0.f2798b
            java.lang.String r1 = "show_ad_activity = null"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.model.AdPackageModel r0 = new com.acse.ottn.model.AdPackageModel
            r0.<init>()
            return r0
        L30:
            java.lang.String r1 = com.acse.ottn.t0.f2798b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "show_ad_activity = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.acse.ottn.h2.a(r1, r2)
            java.lang.Class<com.acse.ottn.model.AdPackageModel> r1 = com.acse.ottn.model.AdPackageModel.class
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject(r0, r1)
            com.acse.ottn.model.AdPackageModel r0 = (com.acse.ottn.model.AdPackageModel) r0
            if (r0 != 0) goto L56
            com.acse.ottn.model.AdPackageModel r0 = new com.acse.ottn.model.AdPackageModel
            r0.<init>()
            return r0
        L56:
            java.lang.String r1 = com.acse.ottn.t0.f2798b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "adPackageModel = "
            r2.append(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.acse.ottn.h2.a(r1, r2)
            return r0
    }

    public com.acse.ottn.model.WxClickDataModel c(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = com.acse.ottn.t0.f2798b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getCurrentWxAppletData json ="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L1e
            r4 = 0
            return r4
        L1e:
            java.lang.Class<com.acse.ottn.model.WxClickDataModel> r0 = com.acse.ottn.model.WxClickDataModel.class
            java.lang.Object r4 = com.alibaba.fastjson.JSON.parseObject(r4, r0)
            com.acse.ottn.model.WxClickDataModel r4 = (com.acse.ottn.model.WxClickDataModel) r4
            return r4
    }

    public java.lang.String c(java.util.List<java.lang.String> r4) {
            r3 = this;
            if (r4 == 0) goto L31
            int r0 = r4.size()
            if (r0 != 0) goto L9
            goto L31
        L9:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        Lf:
            int r2 = r4.size()
            if (r1 >= r2) goto L2c
            java.lang.Object r2 = r4.get(r1)
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
        L29:
            int r1 = r1 + 1
            goto Lf
        L2c:
            java.lang.String r4 = r0.toString()
            return r4
        L31:
            java.lang.String r4 = com.acse.ottn.t0.f2798b
            java.lang.String r0 = " getTbTitle lists = null"
            com.acse.ottn.h2.a(r4, r0)
            java.lang.String r4 = ""
            return r4
    }

    public boolean c(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = "，"
            java.lang.String[] r2 = r2.split(r0)
            int r2 = r2.length
            if (r2 < r3) goto Lb
            r2 = 0
            return r2
        Lb:
            r2 = 1
            return r2
    }

    public com.acse.ottn.model.PageSettingTypeModel d(java.lang.String r6) {
            r5 = this;
            r0 = 0
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto L99
            com.acse.ottn.t0 r1 = b()     // Catch: java.lang.Exception -> L44
            com.acse.ottn.model.AdPackageModel r1 = r1.c()     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto L77
            java.lang.String r2 = com.acse.ottn.t0.f2798b     // Catch: java.lang.Exception -> L44
            java.lang.String r3 = "getShowAdActivityPackageName adPackageModel is not null "
            com.acse.ottn.h2.a(r2, r3)     // Catch: java.lang.Exception -> L44
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L44
            java.lang.String r3 = "read_timeout"
            java.lang.String r4 = r1.getRead_timeout()     // Catch: java.lang.Exception -> L44
            r2.b(r3, r4)     // Catch: java.lang.Exception -> L44
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L44
            java.lang.String r3 = "delay_read_time"
            int r4 = r1.getDelay_readpage_time()     // Catch: java.lang.Exception -> L44
            r2.a(r3, r4)     // Catch: java.lang.Exception -> L44
            java.lang.String r2 = r1.getNew_package_setting()     // Catch: java.lang.Exception -> L44
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L46
            java.lang.String r6 = com.acse.ottn.t0.f2798b     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "getShowAdActivityPackageName getNew_package_setting is not null "
            com.acse.ottn.h2.a(r6, r1)     // Catch: java.lang.Exception -> L44
            return r0
        L44:
            r6 = move-exception
            goto L7f
        L46:
            java.lang.String r2 = com.acse.ottn.t0.f2798b     // Catch: java.lang.Exception -> L44
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L44
            r3.<init>()     // Catch: java.lang.Exception -> L44
            java.lang.String r4 = "getShowAdActivityPackageName ="
            r3.append(r4)     // Catch: java.lang.Exception -> L44
            java.lang.String r4 = r1.getNew_package_setting()     // Catch: java.lang.Exception -> L44
            java.util.Map r4 = com.acse.ottn.a2.b(r4)     // Catch: java.lang.Exception -> L44
            r3.append(r4)     // Catch: java.lang.Exception -> L44
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L44
            com.acse.ottn.h2.a(r2, r3)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = r1.getNew_package_setting()     // Catch: java.lang.Exception -> L44
            java.util.Map r1 = com.acse.ottn.a2.b(r1)     // Catch: java.lang.Exception -> L44
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Exception -> L44
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L44
            com.acse.ottn.model.PageSettingTypeModel r6 = r5.b(r6)     // Catch: java.lang.Exception -> L44
            return r6
        L77:
            java.lang.String r6 = com.acse.ottn.t0.f2798b     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "getShowAdActivityPackageName adPackageModel is null "
            com.acse.ottn.h2.a(r6, r1)     // Catch: java.lang.Exception -> L44
            goto L99
        L7f:
            java.lang.String r1 = com.acse.ottn.t0.f2798b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getShowAdActivityPackageName Exception e ="
            r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.acse.ottn.h2.a(r1, r6)
        L99:
            return r0
    }

    public final java.lang.Object d() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.a
            return r0
    }

    public boolean d(java.util.List<java.lang.String> r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L33
            int r1 = r6.size()
            if (r1 != 0) goto La
            goto L33
        La:
            r1 = 0
        Lb:
            int r2 = r6.size()
            if (r1 >= r2) goto L32
            java.lang.Object r2 = r6.get(r1)
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "0"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.replace(r3, r4)
            int r2 = r2.length()
            r3 = 17
            if (r2 <= r3) goto L2f
            r6 = 1
            return r6
        L2f:
            int r1 = r1 + 1
            goto Lb
        L32:
            return r0
        L33:
            java.lang.String r6 = com.acse.ottn.t0.f2798b
            java.lang.String r1 = "getPrice lists = null"
            com.acse.ottn.h2.a(r6, r1)
            return r0
    }

    public com.acse.ottn.model.WxClickDataModel e(java.lang.String r5) {
            r4 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L37
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "applet_data"
            java.lang.String r0 = r0.e(r1)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = com.acse.ottn.t0.f2798b     // Catch: java.lang.Exception -> L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L35
            r2.<init>()     // Catch: java.lang.Exception -> L35
            java.lang.String r3 = "getShowWxAppletData applet_data ="
            r2.append(r3)     // Catch: java.lang.Exception -> L35
            r2.append(r0)     // Catch: java.lang.Exception -> L35
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L35
            com.acse.ottn.h2.a(r1, r2)     // Catch: java.lang.Exception -> L35
            java.util.Map r0 = com.acse.ottn.a2.b(r0)     // Catch: java.lang.Exception -> L35
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Exception -> L35
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L35
            com.acse.ottn.model.WxClickDataModel r5 = r4.c(r5)     // Catch: java.lang.Exception -> L35
            return r5
        L35:
            r5 = move-exception
            goto L3f
        L37:
            java.lang.String r5 = com.acse.ottn.t0.f2798b     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = "getShowWxAppletData adPackageModel is null "
            com.acse.ottn.h2.a(r5, r0)     // Catch: java.lang.Exception -> L35
            goto L59
        L3f:
            java.lang.String r0 = com.acse.ottn.t0.f2798b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getShowWxAppletData Exception e ="
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.acse.ottn.h2.a(r0, r5)
        L59:
            r5 = 0
            return r5
    }

    public void f(java.lang.String r2) {
            r1 = this;
            int r2 = r2.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "b"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "samon-->"
            com.acse.ottn.h2.a(r0, r2)
            return
    }

    public java.lang.String g(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "com.taobao.tao.welcome.Welcome"
            java.lang.String r1 = "tag_homepage_info"
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            if (r2 == 0) goto L60
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            java.lang.String r2 = r2.e(r1)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            java.util.Map r2 = com.acse.ottn.a2.b(r2)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            boolean r3 = r5.equals(r0)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            if (r3 != 0) goto L27
            java.lang.String r3 = "com.taobao.tao.TBMainActivity"
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            if (r3 == 0) goto L28
            goto L27
        L25:
            r5 = move-exception
            goto L46
        L27:
            r5 = r0
        L28:
            java.lang.Object r0 = r2.get(r5)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            if (r3 == 0) goto L37
            java.lang.String r5 = ""
            return r5
        L37:
            r2.remove(r5)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            com.acse.ottn.n3 r5 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r2)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            r5.b(r1, r2)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L60
            return r0
        L46:
            java.lang.String r0 = com.acse.ottn.t0.f2798b     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r1.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "getShowAdActivityPackageName Exception e ="
            r1.append(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L60
            r1.append(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L60
            com.acse.ottn.h2.a(r0, r5)     // Catch: java.lang.Throwable -> L60
        L60:
            r5 = 0
            return r5
    }

    public boolean h(java.lang.String r6) {
            r5 = this;
            r0 = 0
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L50
            com.acse.ottn.t0 r1 = b()     // Catch: java.lang.Exception -> L35
            com.acse.ottn.model.AdPackageModel r1 = r1.c()     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L50
            r2 = 0
        L12:
            java.util.List r3 = r1.getKeywords_names()     // Catch: java.lang.Exception -> L35
            int r3 = r3.size()     // Catch: java.lang.Exception -> L35
            if (r2 >= r3) goto L50
            java.lang.String r3 = r6.toLowerCase()     // Catch: java.lang.Exception -> L35
            java.util.List r4 = r1.getKeywords_names()     // Catch: java.lang.Exception -> L35
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Exception -> L35
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Exception -> L35
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Exception -> L35
            if (r3 == 0) goto L32
            r6 = 1
            return r6
        L32:
            int r2 = r2 + 1
            goto L12
        L35:
            r6 = move-exception
            java.lang.String r1 = com.acse.ottn.t0.f2798b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isAccordType Exception e ="
            r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.acse.ottn.h2.a(r1, r6)
        L50:
            return r0
    }

    public boolean i(java.lang.String r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length()
            if (r1 >= r2) goto L17
            char r2 = r4.charAt(r1)
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 == 0) goto L14
            r4 = 1
            return r4
        L14:
            int r1 = r1 + 1
            goto L2
        L17:
            return r0
    }

    public java.lang.String j(java.lang.String r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "pic_type"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.t0.f2798b
            r0.append(r1)
            java.lang.String r1 = "--samon"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "isShowBigPicture "
            com.acse.ottn.h2.a(r0, r2)
            com.acse.ottn.o r0 = com.acse.ottn.o.c()
            java.lang.String r0 = r0.l
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L3b
            com.acse.ottn.o r6 = com.acse.ottn.o.c()
            java.lang.String r6 = r6.J
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = com.acse.ottn.t0.f2798b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "pageName= "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.acse.ottn.h2.a(r0, r2)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 == 0) goto L85
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = com.acse.ottn.t0.f2798b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "QuickPreference.getInstance() is not null= "
            com.acse.ottn.h2.a(r0, r2)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r0 = r0.e(r6)
            goto L87
        L85:
            java.lang.String r0 = ""
        L87:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = com.acse.ottn.t0.f2798b
            r2.append(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            com.acse.ottn.h2.a(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto Lbc
            if (r0 != 0) goto Lb3
            goto Lbc
        Lb3:
            java.lang.Class<com.acse.ottn.model.ShowWindowModel> r2 = com.acse.ottn.model.ShowWindowModel.class
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject(r0, r2)
            com.acse.ottn.model.ShowWindowModel r0 = (com.acse.ottn.model.ShowWindowModel) r0
            goto Lc1
        Lbc:
            com.acse.ottn.model.ShowWindowModel r0 = new com.acse.ottn.model.ShowWindowModel
            r0.<init>()
        Lc1:
            r0.setAppName(r6)
            com.acse.ottn.s0 r6 = com.acse.ottn.s0.d()
            java.lang.String r6 = r6.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.acse.ottn.t0.f2798b
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "date= "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.acse.ottn.h2.a(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.acse.ottn.t0.f2798b
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "label.getShowBigWindowData()= "
            r2.append(r3)
            java.lang.String r3 = r0.getShowBigWindowData()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.acse.ottn.h2.a(r1, r2)
            java.lang.String r0 = r0.getShowBigWindowData()
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L127
            java.lang.String r6 = "1"
            return r6
        L127:
            java.lang.String r6 = "0"
            return r6
    }

    public void k(java.lang.String r3) {
            r2 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L9
            java.lang.String r1 = "business_date"
            r0.b(r1, r3)     // Catch: java.lang.Exception -> L9
        L9:
            return
    }

    public java.lang.String l(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            goto L32
        L7:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "business_date"
            java.lang.String r0 = r0.e(r1)
            java.util.Map r0 = com.acse.ottn.a2.b(r0)
            if (r0 == 0) goto L32
            java.lang.Object r2 = r0.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L31
            r0.remove(r5)
            java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r0)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            r0.b(r1, r5)
        L31:
            return r2
        L32:
            java.lang.String r5 = ""
            return r5
    }
}
