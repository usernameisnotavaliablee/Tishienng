package com.baidu.liantian.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static android.content.Context f5951b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f5952c;

    /* renamed from: e, reason: collision with root package name */
    public static java.util.List<java.lang.Integer> f5953e;

    /* renamed from: g, reason: collision with root package name */
    private static com.baidu.liantian.core.d f5954g;

    /* renamed from: h, reason: collision with root package name */
    private static int f5955h;
    public com.baidu.liantian.e a;

    /* renamed from: d, reason: collision with root package name */
    com.baidu.liantian.a.a f5956d;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f5957f;





    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.baidu.liantian.core.d.f5953e = r0
            return
    }

    private d(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5957f = r0
            com.baidu.liantian.b.a()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.baidu.liantian.core.d.f5951b = r2
            com.baidu.liantian.a.a r2 = com.baidu.liantian.a.a.a(r2)
            r1.f5956d = r2
            com.baidu.liantian.e r2 = new com.baidu.liantian.e
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b
            r2.<init>(r0)
            r1.a = r2
            return
    }

    static /* synthetic */ com.baidu.liantian.a.a a(com.baidu.liantian.core.d r0) {
            com.baidu.liantian.a.a r0 = r0.f5956d
            return r0
    }

    public static com.baidu.liantian.core.d a() {
            com.baidu.liantian.core.d r0 = com.baidu.liantian.core.d.f5954g
            return r0
    }

    public static synchronized com.baidu.liantian.core.d a(android.content.Context r2) {
            java.lang.Class<com.baidu.liantian.core.d> r0 = com.baidu.liantian.core.d.class
            monitor-enter(r0)
            com.baidu.liantian.core.d r1 = com.baidu.liantian.core.d.f5954g     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            com.baidu.liantian.core.d r1 = new com.baidu.liantian.core.d     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            com.baidu.liantian.core.d.f5954g = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1d
        L19:
            com.baidu.liantian.core.d r2 = com.baidu.liantian.core.d.f5954g     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r2
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public static void a(int r1) {
            int r0 = com.baidu.liantian.core.d.f5955h
            if (r0 != 0) goto L6
            com.baidu.liantian.core.d.f5955h = r1
        L6:
            return
    }

    private void a(int r9, java.lang.String r10, java.lang.String r11, android.content.pm.PackageInfo r12) {
            r8 = this;
            java.lang.String r0 = "-"
            com.baidu.liantian.a.a r1 = r8.f5956d     // Catch: java.lang.Throwable -> L49
            com.baidu.liantian.core.ApkInfo r1 = r1.a(r9)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L4c
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Throwable -> L49
            boolean r1 = com.baidu.liantian.b.e.c(r10, r1)     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L14
            goto L1dc
        L14:
            com.baidu.liantian.a.a r1 = r8.f5956d     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.core.ApkInfo r1 = r1.a(r9)     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L1d
            goto L4c
        L1d:
            com.baidu.liantian.a.a r2 = r8.f5956d     // Catch: java.lang.Throwable -> L45
            r2.h(r9)     // Catch: java.lang.Throwable -> L45
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r1.pkgPath     // Catch: java.lang.Throwable -> L45
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L45
            r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L45
            r2.exists()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            boolean r1 = r2.exists()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L4c
            com.baidu.liantian.c.a(r2)     // Catch: java.lang.Throwable -> L45
            r2.delete()     // Catch: java.lang.Throwable -> L45
            r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            goto L4c
        L45:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            com.baidu.liantian.b.e.a()
        L4c:
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L1ab
            if (r2 != 0) goto L16e
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L1ab
            android.content.Context r3 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L1ab
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r4 = ".tmp_liantian"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1ab
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L1ab
            if (r3 != 0) goto L69
            r2.mkdir()     // Catch: java.lang.Throwable -> L1ab
        L69:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L1ab
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ab
            r4.<init>()     // Catch: java.lang.Throwable -> L1ab
            r4.append(r9)     // Catch: java.lang.Throwable -> L1ab
            r4.append(r0)     // Catch: java.lang.Throwable -> L1ab
            r4.append(r10)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r5 = ".zip"
            r4.append(r5)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1ab
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L1ab
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L16b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L16b
            android.content.Context r4 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L168
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L168
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L168
            java.io.InputStream r1 = r4.open(r5)     // Catch: java.lang.Throwable -> L168
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L168
        L9c:
            int r5 = r1.read(r4)     // Catch: java.lang.Throwable -> L168
            r6 = -1
            r7 = 0
            if (r5 == r6) goto La8
            r2.write(r4, r7, r5)     // Catch: java.lang.Throwable -> L168
            goto L9c
        La8:
            r2.flush()     // Catch: java.lang.Throwable -> L168
            java.lang.String r4 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L168
            r5 = 1
            com.baidu.liantian.b.e.a(r4, r5)     // Catch: java.lang.Throwable -> L168
            java.lang.String r4 = com.baidu.liantian.b.o.a(r3)     // Catch: java.lang.Throwable -> L168
            if (r4 == 0) goto L15c
            boolean r11 = r4.equalsIgnoreCase(r11)     // Catch: java.lang.Throwable -> L168
            if (r11 != 0) goto Lc1
            goto L15c
        Lc1:
            com.baidu.liantian.core.ApkInfo r11 = new com.baidu.liantian.core.ApkInfo     // Catch: java.lang.Throwable -> L168
            java.lang.String r6 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L168
            r11.<init>(r9, r10, r6)     // Catch: java.lang.Throwable -> L168
            r11.apkMD5 = r4     // Catch: java.lang.Throwable -> L168
            r11.priority = r5     // Catch: java.lang.Throwable -> L168
            com.baidu.liantian.a.a r4 = r8.f5956d     // Catch: java.lang.Throwable -> L168
            r4.a(r11)     // Catch: java.lang.Throwable -> L168
            com.baidu.liantian.a.a r11 = r8.f5956d     // Catch: java.lang.Throwable -> L168
            int r11 = r11.g(r9)     // Catch: java.lang.Throwable -> L168
            r4 = 3
            if (r11 != r4) goto Le0
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L168
            goto Le1
        Le0:
            r7 = 1
        Le1:
            com.baidu.liantian.e r11 = r8.a     // Catch: java.lang.Throwable -> L168
            boolean r11 = r11.d()     // Catch: java.lang.Throwable -> L168
            java.lang.String r4 = ".b_liantian"
            if (r11 == 0) goto L127
            if (r7 == 0) goto L127
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L168
            android.content.Context r5 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L168
            java.io.File r5 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L168
            r11.<init>(r5, r4)     // Catch: java.lang.Throwable -> L168
            boolean r4 = r11.exists()     // Catch: java.lang.Throwable -> L168
            if (r4 != 0) goto L101
            r11.mkdir()     // Catch: java.lang.Throwable -> L168
        L101:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L168
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L168
            r5.<init>()     // Catch: java.lang.Throwable -> L168
            r5.append(r9)     // Catch: java.lang.Throwable -> L168
            r5.append(r0)     // Catch: java.lang.Throwable -> L168
            r5.append(r10)     // Catch: java.lang.Throwable -> L168
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L168
            r4.<init>(r11, r0)     // Catch: java.lang.Throwable -> L168
            boolean r11 = com.baidu.liantian.b.e.a(r4)     // Catch: java.lang.Throwable -> L168
            if (r11 != 0) goto L121
            com.baidu.liantian.b.e.a(r3, r4)     // Catch: java.lang.Throwable -> L168
        L121:
            android.content.Context r11 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L168
            com.baidu.liantian.c.a(r11, r9, r3, r4)     // Catch: java.lang.Throwable -> L168
            goto L170
        L127:
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L168
            android.content.Context r5 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L168
            java.io.File r5 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L168
            r11.<init>(r5, r4)     // Catch: java.lang.Throwable -> L168
            boolean r4 = r11.exists()     // Catch: java.lang.Throwable -> L168
            if (r4 == 0) goto L170
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L168
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L168
            r5.<init>()     // Catch: java.lang.Throwable -> L168
            r5.append(r9)     // Catch: java.lang.Throwable -> L168
            r5.append(r0)     // Catch: java.lang.Throwable -> L168
            r5.append(r10)     // Catch: java.lang.Throwable -> L168
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L168
            r4.<init>(r11, r0)     // Catch: java.lang.Throwable -> L168
            boolean r11 = com.baidu.liantian.b.e.a(r4)     // Catch: java.lang.Throwable -> L168
            if (r11 == 0) goto L170
            com.baidu.liantian.c.a(r4)     // Catch: java.lang.Throwable -> L168
            r4.delete()     // Catch: java.lang.Throwable -> L168
            goto L170
        L15c:
            r3.delete()     // Catch: java.lang.Throwable -> L168
            r1.close()     // Catch: java.io.IOException -> L162
        L162:
            r2.close()     // Catch: java.io.IOException -> L167
            goto L1dc
        L167:
            return
        L168:
            r10 = r1
        L169:
            r1 = r3
            goto L1ad
        L16b:
            r10 = r1
            r2 = r10
            goto L169
        L16e:
            r2 = r1
            r3 = r2
        L170:
            com.baidu.liantian.a.a r11 = r8.f5956d     // Catch: java.lang.Throwable -> L168
            com.baidu.liantian.core.ApkInfo r11 = r11.a(r9)     // Catch: java.lang.Throwable -> L168
            if (r11 == 0) goto L19e
            java.lang.String r11 = r11.pkgPath     // Catch: java.lang.Throwable -> L168
            boolean r11 = com.baidu.liantian.b.e.c(r11)     // Catch: java.lang.Throwable -> L168
            if (r11 != 0) goto L181
            goto L19e
        L181:
            boolean r10 = r8.a(r9, r10, r12)     // Catch: java.lang.Throwable -> L168
            if (r10 == 0) goto L190
            java.util.List<java.lang.Integer> r10 = com.baidu.liantian.core.d.f5953e     // Catch: java.lang.Throwable -> L168
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L168
            r10.add(r11)     // Catch: java.lang.Throwable -> L168
        L190:
            if (r1 == 0) goto L197
            r1.close()     // Catch: java.io.IOException -> L196
            goto L197
        L196:
        L197:
            if (r2 == 0) goto L1dc
            r2.close()     // Catch: java.io.IOException -> L19d
            goto L1dc
        L19d:
            return
        L19e:
            if (r1 == 0) goto L1a5
            r1.close()     // Catch: java.io.IOException -> L1a4
            goto L1a5
        L1a4:
        L1a5:
            if (r2 == 0) goto L1dc
        L1a7:
            r2.close()     // Catch: java.io.IOException -> L1dc
            goto L1dc
        L1ab:
            r10 = r1
            r2 = r10
        L1ad:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L1cd
            if (r1 == 0) goto L1cf
            boolean r11 = r1.exists()     // Catch: java.lang.Throwable -> L1cd
            if (r11 == 0) goto L1cf
            com.baidu.liantian.c.a(r1)     // Catch: java.lang.Throwable -> L1cd
            com.baidu.liantian.a.a r11 = r8.f5956d     // Catch: java.lang.Throwable -> L1cd
            r11.h(r9)     // Catch: java.lang.Throwable -> L1cd
            r1.delete()     // Catch: java.lang.Throwable -> L1cd
            if (r10 == 0) goto L1ca
            r10.close()     // Catch: java.io.IOException -> L1c9
            goto L1ca
        L1c9:
        L1ca:
            if (r2 == 0) goto L1dc
            goto L1a7
        L1cd:
            r9 = move-exception
            goto L1dd
        L1cf:
            if (r10 == 0) goto L1d6
            r10.close()     // Catch: java.io.IOException -> L1d5
            goto L1d6
        L1d5:
        L1d6:
            if (r2 == 0) goto L1dc
            r2.close()     // Catch: java.io.IOException -> L1dc
        L1dc:
            return
        L1dd:
            if (r10 == 0) goto L1e4
            r10.close()     // Catch: java.io.IOException -> L1e3
            goto L1e4
        L1e3:
        L1e4:
            if (r2 == 0) goto L1e9
            r2.close()     // Catch: java.io.IOException -> L1e9
        L1e9:
            throw r9
    }

    private synchronized boolean a(int r17, java.lang.String r18, boolean r19, android.content.pm.PackageInfo r20) {
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r0 = r20
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            monitor-enter(r16)
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2db
            r6 = 1
            if (r19 == 0) goto L1e
            com.baidu.liantian.a.a r7 = r1.f5956d     // Catch: java.lang.Throwable -> L2db
            int r7 = r7.c(r2)     // Catch: java.lang.Throwable -> L2db
            if (r7 == r6) goto L1e
            monitor-exit(r16)
            return r4
        L1e:
            com.baidu.liantian.a.a r7 = r1.f5956d     // Catch: java.lang.Throwable -> L2db
            com.baidu.liantian.core.ApkInfo r7 = r7.a(r2)     // Catch: java.lang.Throwable -> L2db
            if (r7 != 0) goto L50
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2db
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2db
            r0.<init>()     // Catch: java.lang.Throwable -> L2db
            java.lang.String r5 = "0"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2db
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L2db
            java.lang.String r5 = "1"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2db
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L2db
            java.lang.String r2 = "2"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L2db
            if (r19 != 0) goto L4e
            android.content.Context r2 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L2db
            java.lang.String r3 = "1003105"
            com.baidu.liantian.b.e.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L2db
        L4e:
            monitor-exit(r16)
            return r4
        L50:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L2db
            java.lang.String r9 = r7.pkgPath     // Catch: java.lang.Throwable -> L2db
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L2db
            r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L2db
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2db
            boolean r8 = com.baidu.liantian.b.e.a(r8)     // Catch: java.lang.Throwable -> L2db
            r9 = 3
            if (r8 != 0) goto L93
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2db
            com.baidu.liantian.a.a r0 = r1.f5956d     // Catch: java.lang.Throwable -> L2db
            r0.f(r2)     // Catch: java.lang.Throwable -> L2db
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2db
            r0.<init>()     // Catch: java.lang.Throwable -> L2db
            java.lang.String r5 = "0"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2db
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L2db
            java.lang.String r5 = "1"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2db
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L2db
            java.lang.String r2 = "2"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L2db
            if (r19 != 0) goto L91
            android.content.Context r2 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L2db
            java.lang.String r3 = "1003105"
            com.baidu.liantian.b.e.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L2db
        L91:
            monitor-exit(r16)
            return r4
        L93:
            if (r0 == 0) goto L97
            r7.cloudPkgInfo = r0     // Catch: java.lang.Throwable -> L2db
        L97:
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L2db
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L2db
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L2db
            com.baidu.liantian.core.g r8 = com.baidu.liantian.core.g.a(r0)     // Catch: java.lang.Throwable -> L2db
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2db
            boolean r0 = r8.a(r7, r4)     // Catch: java.lang.Throwable -> L2db
            if (r0 != 0) goto Le3
            com.baidu.liantian.a.a r0 = r1.f5956d     // Catch: java.lang.Throwable -> L2db
            r0.f(r2)     // Catch: java.lang.Throwable -> L2db
            java.lang.String r0 = r7.pkgPath     // Catch: java.lang.Throwable -> L2db
            r8.a(r0)     // Catch: java.lang.Throwable -> L2db
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2db
            r0.<init>()     // Catch: java.lang.Throwable -> L2db
            java.lang.String r5 = "0"
            r6 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2db
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L2db
            java.lang.String r5 = "1"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2db
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L2db
            java.lang.String r2 = "2"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L2db
            if (r19 != 0) goto Lde
            android.content.Context r2 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L2db
            java.lang.String r3 = "1003105"
            com.baidu.liantian.b.e.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L2db
        Lde:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2db
            monitor-exit(r16)
            return r4
        Le3:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2db
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L107
            java.lang.String[] r0 = com.baidu.liantian.b.e.g(r0)     // Catch: java.lang.Throwable -> L107
            r10 = 2
            if (r0 == 0) goto L10a
            int r11 = r0.length     // Catch: java.lang.Throwable -> L107
            if (r11 != r10) goto L10a
            r11 = r0[r4]     // Catch: java.lang.Throwable -> L107
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L107
            if (r11 != 0) goto L10a
            r11 = r0[r6]     // Catch: java.lang.Throwable -> L107
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L107
            if (r11 != 0) goto L10a
            r11 = r0[r4]     // Catch: java.lang.Throwable -> L107
            r0 = r0[r6]     // Catch: java.lang.Throwable -> L107
            goto L10e
        L107:
            r0 = move-exception
            goto L271
        L10a:
            java.lang.String r11 = com.baidu.liantian.b.e.f5910d     // Catch: java.lang.Throwable -> L107
            java.lang.String r0 = com.baidu.liantian.b.e.f5911e     // Catch: java.lang.Throwable -> L107
        L10e:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L107
            java.lang.String r12 = r7.pkgPath     // Catch: java.lang.Throwable -> L107
            com.baidu.liantian.core.ApkInfo r7 = r8.c(r12)     // Catch: java.lang.Throwable -> L107
            java.lang.ClassLoader r12 = r7.classLoader     // Catch: java.lang.Throwable -> L107
            com.baidu.liantian.core.f r12 = (com.baidu.liantian.core.f) r12     // Catch: java.lang.Throwable -> L107
            java.lang.String r13 = "com.baidu.liantian.engine.EngineImpl"
            java.lang.Class r13 = r12.a(r13)     // Catch: java.lang.Throwable -> L107
            if (r13 != 0) goto L195
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L107
            java.lang.String r0 = "java.lang.String"
            java.lang.Class r0 = r12.a(r0)     // Catch: java.lang.Throwable -> L107
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L107
            r5.<init>()     // Catch: java.lang.Throwable -> L107
            java.lang.String r6 = "0"
            r9 = 9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L107
            r5.put(r6, r9)     // Catch: java.lang.Throwable -> L107
            java.lang.String r6 = "1"
            java.lang.String r9 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L107
            r5.put(r6, r9)     // Catch: java.lang.Throwable -> L107
            java.lang.String r6 = "2"
            r5.put(r6, r3)     // Catch: java.lang.Throwable -> L107
            java.lang.String r6 = "3"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L107
            java.lang.String r10 = "classloader="
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L107
            r9.append(r12)     // Catch: java.lang.Throwable -> L107
            java.lang.String r10 = ",StringClass="
            r9.append(r10)     // Catch: java.lang.Throwable -> L107
            r9.append(r0)     // Catch: java.lang.Throwable -> L107
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L107
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L107
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)     // Catch: java.lang.Throwable -> L107
            java.lang.String r9 = "\n"
            java.lang.String r10 = ""
            java.lang.String r0 = r0.replace(r9, r10)     // Catch: java.lang.Throwable -> L107
            java.lang.String r9 = "\t"
            java.lang.String r10 = ""
            java.lang.String r0 = r0.replace(r9, r10)     // Catch: java.lang.Throwable -> L107
            java.lang.String r9 = "\r"
            java.lang.String r10 = ""
            java.lang.String r0 = r0.replace(r9, r10)     // Catch: java.lang.Throwable -> L107
            r5.put(r6, r0)     // Catch: java.lang.Throwable -> L107
            if (r19 != 0) goto L18e
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L107
            java.lang.String r6 = "1003105"
            com.baidu.liantian.b.e.a(r0, r6, r5)     // Catch: java.lang.Throwable -> L107
        L18e:
            com.baidu.liantian.a.a r0 = r1.f5956d     // Catch: java.lang.Throwable -> L107
            r0.f(r2)     // Catch: java.lang.Throwable -> L107
            monitor-exit(r16)
            return r4
        L195:
            java.lang.String r12 = "getInstance"
            java.lang.Class[] r14 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L107
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r14[r4] = r15     // Catch: java.lang.Throwable -> L107
            java.lang.reflect.Method r12 = r13.getDeclaredMethod(r12, r14)     // Catch: java.lang.Throwable -> L107
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L107
            android.content.Context r15 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L107
            r14[r4] = r15     // Catch: java.lang.Throwable -> L107
            java.lang.Object r12 = r12.invoke(r13, r14)     // Catch: java.lang.Throwable -> L107
            java.util.Objects.toString(r12)     // Catch: java.lang.Throwable -> L107
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L107
            java.lang.String r13 = "setSecurityVerifyInfo"
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> L1c5
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r14[r4] = r15     // Catch: java.lang.Throwable -> L1c5
            r14[r6] = r15     // Catch: java.lang.Throwable -> L1c5
            java.lang.Object[] r15 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L1c5
            r15[r4] = r11     // Catch: java.lang.Throwable -> L1c5
            r15[r6] = r0     // Catch: java.lang.Throwable -> L1c5
            com.baidu.liantian.b.e.a(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1c5
            goto L1c8
        L1c5:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L107
        L1c8:
            java.lang.String r0 = "init"
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> L107
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L107
            r11[r4] = r13     // Catch: java.lang.Throwable -> L107
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L107
            r11[r6] = r13     // Catch: java.lang.Throwable -> L107
            com.baidu.liantian.e r13 = r1.a     // Catch: java.lang.Throwable -> L107
            boolean r13 = r13.o()     // Catch: java.lang.Throwable -> L107
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.Throwable -> L107
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L107
            r10[r4] = r5     // Catch: java.lang.Throwable -> L107
            r10[r6] = r13     // Catch: java.lang.Throwable -> L107
            java.lang.Object r0 = com.baidu.liantian.b.e.a(r12, r0, r11, r10)     // Catch: java.lang.Throwable -> L107
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L107
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L107
            if (r0 != 0) goto L225
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L107
            r0.<init>()     // Catch: java.lang.Throwable -> L107
            java.lang.String r5 = "0"
            r6 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L107
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L107
            java.lang.String r5 = "1"
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L107
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L107
            java.lang.String r5 = "2"
            r0.put(r5, r3)     // Catch: java.lang.Throwable -> L107
            if (r19 != 0) goto L216
            android.content.Context r5 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L107
            java.lang.String r6 = "1003105"
            com.baidu.liantian.b.e.a(r5, r6, r0)     // Catch: java.lang.Throwable -> L107
        L216:
            com.baidu.liantian.a.a r0 = r1.f5956d     // Catch: java.lang.Throwable -> L107
            r0.f(r2)     // Catch: java.lang.Throwable -> L107
            java.lang.String r0 = r7.pkgPath     // Catch: java.lang.Throwable -> L107
            r8.a(r0)     // Catch: java.lang.Throwable -> L107
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L107
            monitor-exit(r16)
            return r4
        L225:
            r7.initStatus = r6     // Catch: java.lang.Throwable -> L2db
            r7.apkParseSuc = r6     // Catch: java.lang.Throwable -> L2db
            com.baidu.liantian.a.a r0 = r1.f5956d     // Catch: java.lang.Throwable -> L2db
            r0.a(r7)     // Catch: java.lang.Throwable -> L2db
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2db
            com.baidu.liantian.a.a r0 = r1.f5956d     // Catch: java.lang.Throwable -> L2db
            int r8 = r7.key     // Catch: java.lang.Throwable -> L2db
            int r0 = r0.g(r8)     // Catch: java.lang.Throwable -> L2db
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2db
            if (r0 >= r9) goto L249
            r8 = -1
            if (r0 == r8) goto L249
            com.baidu.liantian.a.a r8 = r1.f5956d     // Catch: java.lang.Throwable -> L2db
            int r7 = r7.key     // Catch: java.lang.Throwable -> L2db
            int r0 = r0 + r6
            r8.b(r7, r0)     // Catch: java.lang.Throwable -> L2db
        L249:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2db
            r0.<init>()     // Catch: java.lang.Throwable -> L2db
            java.lang.String r7 = "0"
            r0.put(r7, r5)     // Catch: java.lang.Throwable -> L2db
            java.lang.String r5 = "1"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2db
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L2db
            java.lang.String r2 = "2"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L2db
            if (r19 != 0) goto L26a
            android.content.Context r2 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L2db
            java.lang.String r3 = "1003105"
            com.baidu.liantian.b.e.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L2db
        L26a:
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L2db
            com.baidu.liantian.b.e.c(r0)     // Catch: java.lang.Throwable -> L2db
            monitor-exit(r16)
            return r6
        L271:
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> L2d6
            com.baidu.liantian.a.a r5 = r1.f5956d     // Catch: java.lang.Throwable -> L2d6
            r5.f(r2)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r0 = com.baidu.liantian.b.a(r0)     // Catch: java.lang.Throwable -> L2d6
            android.content.Context r5 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r6 = r7.packageName     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r0 = com.baidu.liantian.b.i.a(r5, r0, r6)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r5 = r7.pkgPath     // Catch: java.lang.Throwable -> L2d6
            r8.a(r5)     // Catch: java.lang.Throwable -> L2d6
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2d6
            r5.<init>()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r6 = "0"
            r7 = 7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2d6
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r6 = "1"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2d6
            r5.put(r6, r2)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r2 = "2"
            r5.put(r2, r3)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r2 = "3"
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r3 = "\n"
            java.lang.String r6 = ""
            java.lang.String r0 = r0.replace(r3, r6)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r3 = "\t"
            java.lang.String r6 = ""
            java.lang.String r0 = r0.replace(r3, r6)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r3 = "\r"
            java.lang.String r6 = ""
            java.lang.String r0 = r0.replace(r3, r6)     // Catch: java.lang.Throwable -> L2d6
            r5.put(r2, r0)     // Catch: java.lang.Throwable -> L2d6
            if (r19 != 0) goto L2d9
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r2 = "1003105"
            com.baidu.liantian.b.e.a(r0, r2, r5)     // Catch: java.lang.Throwable -> L2d6
            goto L2d9
        L2d6:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L2db
        L2d9:
            monitor-exit(r16)
            return r4
        L2db:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L2e0
            monitor-exit(r16)
            return r4
        L2e0:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L2e0
            throw r0
    }

    static /* synthetic */ com.baidu.liantian.e b(com.baidu.liantian.core.d r0) {
            com.baidu.liantian.e r0 = r0.a
            return r0
    }

    private static void b(java.lang.String r7) {
            com.baidu.liantian.b.a()
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto La
            goto L3c
        La:
            com.baidu.liantian.core.g r0 = com.baidu.liantian.core.g.a()     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L11
            goto L3c
        L11:
            com.baidu.liantian.core.ApkInfo r1 = r0.d(r7)     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L18
            goto L3c
        L18:
            java.lang.ClassLoader r1 = r1.classLoader     // Catch: java.lang.Throwable -> L50
            com.baidu.liantian.core.f r1 = (com.baidu.liantian.core.f) r1     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "com.baidu.liantian.engine.EngineImpl"
            java.lang.Class r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "getInstance"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L50
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L50
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L50
            android.content.Context r4 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L50
            r3[r6] = r4     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L3d
        L3c:
            return
        L3d:
            java.lang.String r2 = "unload"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L50
            r4 = 0
            java.lang.Object r1 = com.baidu.liantian.b.e.a(r1, r2, r4, r3)     // Catch: java.lang.Throwable -> L50
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L50
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L50
            r0.b(r7)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r7 = move-exception
            r7.getMessage()
            com.baidu.liantian.b.b()
            return
    }

    private boolean c(android.content.Context r10) {
            r9 = this;
            java.lang.String r0 = "com.baidu.liantian.x18"
            r1 = 0
            com.baidu.liantian.core.g r10 = com.baidu.liantian.core.g.a(r10)     // Catch: java.lang.Throwable -> L92
            if (r10 != 0) goto La
            return r1
        La:
            com.baidu.liantian.core.ApkInfo r2 = r10.d(r0)     // Catch: java.lang.Throwable -> L92
            r3 = 1
            if (r2 == 0) goto L12
            return r3
        L12:
            com.baidu.liantian.a.a r2 = r9.f5956d     // Catch: java.lang.Throwable -> L92
            if (r2 != 0) goto L1e
            android.content.Context r2 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L92
            com.baidu.liantian.a.a r2 = com.baidu.liantian.a.a.a(r2)     // Catch: java.lang.Throwable -> L92
            r9.f5956d = r2     // Catch: java.lang.Throwable -> L92
        L1e:
            com.baidu.liantian.a.a r2 = r9.f5956d     // Catch: java.lang.Throwable -> L92
            com.baidu.liantian.core.ApkInfo r2 = r2.c(r0)     // Catch: java.lang.Throwable -> L92
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L92
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L8a
            com.baidu.liantian.e r4 = r9.a     // Catch: java.lang.Throwable -> L92
            boolean r4 = r4.d()     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L7e
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L92
            android.content.Context r5 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L92
            java.io.File r5 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L92
            java.lang.String r6 = ".b_liantian"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L92
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> L92
            if (r5 != 0) goto L4a
            r4.mkdir()     // Catch: java.lang.Throwable -> L92
        L4a:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L92
            java.lang.String r6 = r2.pkgPath     // Catch: java.lang.Throwable -> L92
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L92
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r7.<init>()     // Catch: java.lang.Throwable -> L92
            int r8 = r2.key     // Catch: java.lang.Throwable -> L92
            r7.append(r8)     // Catch: java.lang.Throwable -> L92
            java.lang.String r8 = "-"
            r7.append(r8)     // Catch: java.lang.Throwable -> L92
            java.lang.String r8 = r2.versionName     // Catch: java.lang.Throwable -> L92
            r7.append(r8)     // Catch: java.lang.Throwable -> L92
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L92
            r6.<init>(r4, r7)     // Catch: java.lang.Throwable -> L92
            boolean r4 = com.baidu.liantian.b.e.a(r6)     // Catch: java.lang.Throwable -> L92
            if (r4 != 0) goto L77
            com.baidu.liantian.b.e.a(r5, r6)     // Catch: java.lang.Throwable -> L92
        L77:
            android.content.Context r4 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L92
            int r7 = r2.key     // Catch: java.lang.Throwable -> L92
            com.baidu.liantian.c.a(r4, r7, r5, r6)     // Catch: java.lang.Throwable -> L92
        L7e:
            int r4 = r2.key     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = r2.versionName     // Catch: java.lang.Throwable -> L92
            r5 = 0
            boolean r2 = r9.a(r4, r2, r5)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L8a
            return r3
        L8a:
            com.baidu.liantian.core.ApkInfo r10 = r10.d(r0)     // Catch: java.lang.Throwable -> L92
            if (r10 != 0) goto L91
            return r1
        L91:
            return r3
        L92:
            com.baidu.liantian.b.e.a()
            return r1
    }

    static /* synthetic */ boolean c(com.baidu.liantian.core.d r0) {
            boolean r0 = r0.f5957f
            return r0
    }

    public final android.util.Pair<java.lang.Integer, java.lang.Object> a(int r9, java.lang.String r10, java.lang.Class<?>[] r11, java.lang.Object... r12) {
            r8 = this;
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.baidu.liantian.b.a()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "0"
            java.lang.String r4 = java.lang.Integer.toString(r9)
            r2.put(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto L23
            r3 = r10
            goto L25
        L23:
            java.lang.String r3 = " "
        L25:
            java.lang.String r4 = "1"
            r2.put(r4, r3)
            java.lang.String r3 = "2"
            r2.put(r3, r4)
            android.content.Context r3 = com.baidu.liantian.core.d.f5951b
            java.lang.String r4 = "1003136"
            com.baidu.liantian.b.e.a(r3, r4, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            android.util.Pair r9 = new android.util.Pair
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r9.<init>(r10, r4)
            return r9
        L48:
            com.baidu.liantian.a.a r2 = r8.f5956d     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            boolean r2 = r2.d(r9)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            if (r2 == 0) goto L68
            android.util.Pair r9 = new android.util.Pair     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            r9.<init>(r1, r4)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            return r9
        L59:
            r9 = move-exception
            goto Ld8
        L5c:
            r9 = move-exception
            goto Le4
        L5f:
            r9 = move-exception
            goto Lf0
        L62:
            r9 = move-exception
            goto Lfc
        L65:
            r9 = move-exception
            goto L108
        L68:
            boolean r2 = r8.f5957f     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            if (r2 != 0) goto L72
            android.util.Pair r9 = new android.util.Pair     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            r9.<init>(r1, r4)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            return r9
        L72:
            com.baidu.liantian.core.g r2 = com.baidu.liantian.core.g.a()     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            if (r2 != 0) goto L7e
            android.util.Pair r9 = new android.util.Pair     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            r9.<init>(r1, r4)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            return r9
        L7e:
            com.baidu.liantian.a.a r5 = r8.f5956d     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            com.baidu.liantian.core.ApkInfo r9 = r5.a(r9)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            if (r9 == 0) goto Lcd
            java.lang.String r5 = r9.packageName     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            com.baidu.liantian.core.ApkInfo r5 = r2.d(r5)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            if (r5 == 0) goto Lcd
            java.lang.String r9 = r9.packageName     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            com.baidu.liantian.core.ApkInfo r9 = r2.d(r9)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            java.lang.ClassLoader r9 = r9.classLoader     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            com.baidu.liantian.core.f r9 = (com.baidu.liantian.core.f) r9     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            java.lang.String r2 = "com.baidu.liantian.engine.EngineImpl"
            java.lang.Class r9 = r9.a(r2)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            java.lang.String r2 = "getInstance"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            java.lang.reflect.Method r2 = r9.getDeclaredMethod(r2, r5)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            android.content.Context r5 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            r3[r7] = r5     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            java.lang.Object r9 = r2.invoke(r9, r3)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            java.lang.Object r9 = com.baidu.liantian.b.e.a(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            java.util.Objects.toString(r9)     // Catch: java.lang.Throwable -> Lc0
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lc0
            goto Lc3
        Lc0:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
        Lc3:
            android.util.Pair r10 = new android.util.Pair     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            r10.<init>(r11, r9)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            return r10
        Lcd:
            android.util.Pair r9 = new android.util.Pair     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            r10 = 4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            r9.<init>(r10, r4)     // Catch: java.lang.Throwable -> L59 java.lang.IllegalArgumentException -> L5c java.lang.IllegalAccessException -> L5f java.lang.reflect.InvocationTargetException -> L62 java.lang.NoSuchMethodException -> L65
            return r9
        Ld8:
            r9.getMessage()
            com.baidu.liantian.b.b()
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r1, r4)
            return r9
        Le4:
            r9.getMessage()
            com.baidu.liantian.b.b()
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r0, r4)
            return r9
        Lf0:
            r9.getMessage()
            com.baidu.liantian.b.b()
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r0, r4)
            return r9
        Lfc:
            r9.getMessage()
            com.baidu.liantian.b.b()
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r0, r4)
            return r9
        L108:
            r9.getMessage()
            com.baidu.liantian.b.b()
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r0, r4)
            return r9
    }

    public final void a(int r8, java.lang.String r9, com.baidu.liantian.ac.Callback r10, java.lang.Class<?>[] r11, java.lang.Object... r12) {
            r7 = this;
            java.lang.String r0 = "0"
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L51
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L51
            r1.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L51
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "1"
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L1b
            r3 = r9
            goto L1d
        L1b:
            java.lang.String r3 = " "
        L1d:
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "2"
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L51
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "1003136"
            com.baidu.liantian.b.e.a(r0, r2, r1)     // Catch: java.lang.Throwable -> L51
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L42
            if (r10 == 0) goto L41
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L51
            r11 = 0
            r8[r11] = r9     // Catch: java.lang.Throwable -> L51
            r10.onError(r8)     // Catch: java.lang.Throwable -> L51
        L41:
            return
        L42:
            com.baidu.liantian.core.d$3 r0 = new com.baidu.liantian.core.d$3     // Catch: java.lang.Throwable -> L51
            r1 = r7
            r3 = r8
            r4 = r9
            r2 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.start()     // Catch: java.lang.Throwable -> L51
            return
        L51:
            com.baidu.liantian.b.e.a()
            return
    }

    public final synchronized void a(com.baidu.liantian.ac.Callback r5) {
            r4 = this;
            monitor-enter(r4)
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Lae
            com.baidu.liantian.b.e.d(r0)     // Catch: java.lang.Throwable -> Lae
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r4.f5957f     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L17
            if (r5 == 0) goto L15
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lae
            r5.onEnd(r0)     // Catch: java.lang.Throwable -> Lae
        L15:
            monitor-exit(r4)
            return
        L17:
            r0 = 1
            r4.f5957f = r0     // Catch: java.lang.Throwable -> Lae
            com.baidu.liantian.e r0 = r4.a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = "3.1.6.7"
            android.content.SharedPreferences$Editor r2 = r0.f5992c     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "ssv"
            r2.putString(r3, r1)     // Catch: java.lang.Throwable -> Lae
            android.content.SharedPreferences$Editor r0 = r0.f5992c     // Catch: java.lang.Throwable -> Lae
            r0.commit()     // Catch: java.lang.Throwable -> Lae
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Lae
            com.baidu.liantian.rp.Report r0 = com.baidu.liantian.rp.Report.getInstance(r0)     // Catch: java.lang.Throwable -> Lae
            r0.n()     // Catch: java.lang.Throwable -> Lae
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = "android.intent.action.PACKAGE_REMOVED"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = "package"
            r0.addDataScheme(r1)     // Catch: java.lang.Throwable -> Lae
            android.content.Context r1 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Lae
            com.baidu.liantian.LiantianReceiver r2 = new com.baidu.liantian.LiantianReceiver     // Catch: java.lang.Throwable -> Lae
            r2.<init>()     // Catch: java.lang.Throwable -> Lae
            r1.registerReceiver(r2, r0)     // Catch: java.lang.Throwable -> Lae
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Lae
            com.baidu.liantian.b.b.a(r0)     // Catch: java.lang.Throwable -> Lae
            com.baidu.liantian.a.a r0 = r4.f5956d     // Catch: java.lang.Throwable -> Lae
            java.util.List r0 = r0.a()     // Catch: java.lang.Throwable -> Lae
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lae
        L58:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto La4
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lae
            com.baidu.liantian.core.ApkInfo r1 = (com.baidu.liantian.core.ApkInfo) r1     // Catch: java.lang.Throwable -> Lae
            android.content.Context r2 = com.baidu.liantian.core.d.f5951b     // Catch: java.io.IOException -> L6f java.lang.Throwable -> Lae
            java.io.File r2 = r2.getFilesDir()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> Lae
            java.lang.String r2 = r2.getCanonicalPath()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> Lae
            goto L73
        L6f:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> Lae
            r2 = 0
        L73:
            if (r2 == 0) goto L58
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
            r3.<init>()     // Catch: java.lang.Throwable -> Lae
            r3.append(r2)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "/.liantian_"
            r3.append(r2)     // Catch: java.lang.Throwable -> Lae
            int r2 = r1.key     // Catch: java.lang.Throwable -> Lae
            r3.append(r2)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Lae
            r1.dataDir = r2     // Catch: java.lang.Throwable -> Lae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
            r2.<init>()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = r1.dataDir     // Catch: java.lang.Throwable -> Lae
            r2.append(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = "/lib"
            r2.append(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lae
            com.baidu.liantian.b.e.d(r1)     // Catch: java.lang.Throwable -> Lae
            goto L58
        La4:
            com.baidu.liantian.core.d$1 r0 = new com.baidu.liantian.core.d$1     // Catch: java.lang.Throwable -> Lae
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lae
            r0.start()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r4)
            return
        Lae:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r4)
            return
        Lb3:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb3
            throw r5
    }

    public final void a(java.lang.String r2) {
            r1 = this;
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lc
            com.baidu.liantian.core.d$4 r0 = new com.baidu.liantian.core.d$4     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lc
            r0.start()     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            com.baidu.liantian.b.e.a()
            return
    }

    public final synchronized boolean a(int r2, java.lang.String r3, android.content.pm.PackageInfo r4) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            boolean r2 = r1.a(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public final boolean a(com.baidu.liantian.core.ApkInfo r24, java.lang.String r25) {
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "\r"
            java.lang.String r4 = "\t"
            java.lang.String r5 = "\n"
            java.lang.String r6 = "3"
            java.lang.String r7 = "1003106"
            java.lang.String r8 = "2"
            java.lang.String r9 = "1"
            java.lang.String r10 = "0"
            java.lang.String r11 = ""
            r12 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.util.Objects.toString(r2)
            com.baidu.liantian.b.a()
            if (r2 != 0) goto L24
            return r12
        L24:
            java.io.File r13 = new java.io.File
            java.lang.String r14 = r2.pkgPath
            r13.<init>(r14)
            r15 = 1
            boolean r16 = com.baidu.liantian.b.e.a(r13)     // Catch: java.lang.Throwable -> Ld3
            if (r16 != 0) goto Ld8
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Ld3
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Ld3
            r0.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> Ld3
            r0.put(r10, r14)     // Catch: java.lang.Throwable -> Ld3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld3
            r14.<init>()     // Catch: java.lang.Throwable -> Ld3
            int r15 = r2.key     // Catch: java.lang.Throwable -> Ld3
            r14.append(r15)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> Ld3
            r0.put(r9, r14)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r14 = r2.versionName     // Catch: java.lang.Throwable -> Ld3
            r0.put(r8, r14)     // Catch: java.lang.Throwable -> Ld3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r15 = "nowTime:"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> Ld3
            r18 = r13
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld0
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = ", nowFileInfo: path="
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r18.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld0
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = ", exists="
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            boolean r12 = r18.exists()     // Catch: java.lang.Throwable -> Ld0
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = ", canRead="
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            boolean r12 = r18.canRead()     // Catch: java.lang.Throwable -> Ld0
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = ", isFile="
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            boolean r12 = r18.isFile()     // Catch: java.lang.Throwable -> Ld0
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = ",length"
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            long r12 = r18.length()     // Catch: java.lang.Throwable -> Ld0
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = " - "
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            r12 = r25
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r14.toString()     // Catch: java.lang.Throwable -> Ld0
            byte[] r12 = r12.getBytes()     // Catch: java.lang.Throwable -> Ld0
            r15 = 0
            java.lang.String r12 = android.util.Base64.encodeToString(r12, r15)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r12.replace(r5, r11)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r12.replace(r4, r11)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r12.replace(r3, r11)     // Catch: java.lang.Throwable -> Ld0
            r0.put(r6, r12)     // Catch: java.lang.Throwable -> Ld0
            android.content.Context r12 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.b.e.a(r12, r7, r0)     // Catch: java.lang.Throwable -> Ld0
            r15 = 0
            return r15
        Ld0:
            r0 = move-exception
            goto L34e
        Ld3:
            r0 = move-exception
            r18 = r13
            goto L34e
        Ld8:
            r18 = r13
            com.baidu.liantian.a.a r12 = r1.f5956d     // Catch: java.lang.Throwable -> Ld0
            int r13 = r2.key     // Catch: java.lang.Throwable -> Ld0
            boolean r12 = r12.b(r13)     // Catch: java.lang.Throwable -> Ld0
            if (r12 != 0) goto Le9
            com.baidu.liantian.a.a r12 = r1.f5956d     // Catch: java.lang.Throwable -> Ld0
            r12.a(r2)     // Catch: java.lang.Throwable -> Ld0
        Le9:
            android.content.Context r12 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Ld0
            android.content.Context r12 = r12.getApplicationContext()     // Catch: java.lang.Throwable -> Ld0
            android.content.Context r12 = com.stub.StubApp.getOrigApplicationContext(r12)     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.core.g r12 = com.baidu.liantian.core.g.a(r12)     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.a.a r13 = r1.f5956d     // Catch: java.lang.Throwable -> Ld0
            int r14 = r2.key     // Catch: java.lang.Throwable -> Ld0
            r15 = 1
            r13.a(r14, r15)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r13 = r2.packageName     // Catch: java.lang.Throwable -> Ld0
            b(r13)     // Catch: java.lang.Throwable -> Ld0
            boolean r13 = r12.a(r2, r15)     // Catch: java.lang.Throwable -> Ld0
            r14 = 2
            if (r13 != 0) goto L14d
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Ld0
            r0.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> Ld0
            r0.put(r10, r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r12.<init>()     // Catch: java.lang.Throwable -> Ld0
            int r13 = r2.key     // Catch: java.lang.Throwable -> Ld0
            r12.append(r13)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Ld0
            r0.put(r9, r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r2.versionName     // Catch: java.lang.Throwable -> Ld0
            r0.put(r8, r12)     // Catch: java.lang.Throwable -> Ld0
            android.content.Context r12 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.b.e.a(r12, r7, r0)     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.c.a(r18)     // Catch: java.lang.Throwable -> Ld0
            r18.delete()     // Catch: java.lang.Throwable -> Ld0
            int r0 = r2.key     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r2.versionName     // Catch: java.lang.Throwable -> Ld0
            r13 = 0
            r15 = 1
            r1.a(r0, r12, r15, r13)     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.a.a r0 = r1.f5956d     // Catch: java.lang.Throwable -> Ld0
            int r12 = r2.key     // Catch: java.lang.Throwable -> Ld0
            r15 = 0
            r0.a(r12, r15)     // Catch: java.lang.Throwable -> Ld0
            return r15
        L14d:
            android.content.Context r13 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Ld0
            java.lang.String[] r13 = com.baidu.liantian.b.e.g(r13)     // Catch: java.lang.Throwable -> Ld0
            if (r13 == 0) goto L170
            int r15 = r13.length     // Catch: java.lang.Throwable -> Ld0
            if (r15 != r14) goto L170
            r15 = 0
            r19 = r13[r15]     // Catch: java.lang.Throwable -> Ld0
            boolean r19 = android.text.TextUtils.isEmpty(r19)     // Catch: java.lang.Throwable -> Ld0
            if (r19 != 0) goto L170
            r17 = 1
            r19 = r13[r17]     // Catch: java.lang.Throwable -> Ld0
            boolean r19 = android.text.TextUtils.isEmpty(r19)     // Catch: java.lang.Throwable -> Ld0
            if (r19 != 0) goto L170
            r19 = r13[r15]     // Catch: java.lang.Throwable -> Ld0
            r13 = r13[r17]     // Catch: java.lang.Throwable -> Ld0
            goto L174
        L170:
            java.lang.String r19 = com.baidu.liantian.b.e.f5910d     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r13 = com.baidu.liantian.b.e.f5911e     // Catch: java.lang.Throwable -> Ld0
        L174:
            java.lang.String r15 = r2.pkgPath     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.core.ApkInfo r2 = r12.c(r15)     // Catch: java.lang.Throwable -> Ld0
            if (r2 != 0) goto L17e
            r15 = 0
            return r15
        L17e:
            java.lang.ClassLoader r12 = r2.classLoader     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.core.f r12 = (com.baidu.liantian.core.f) r12     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r15 = "com.baidu.liantian.engine.EngineImpl"
            java.lang.Class r15 = r12.a(r15)     // Catch: java.lang.Throwable -> Ld0
            if (r15 != 0) goto L1f8
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = "java.lang.String"
            java.lang.Class r0 = r12.a(r0)     // Catch: java.lang.Throwable -> Ld0
            java.util.HashMap r13 = new java.util.HashMap     // Catch: java.lang.Throwable -> Ld0
            r13.<init>()     // Catch: java.lang.Throwable -> Ld0
            r14 = 6
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> Ld0
            r13.put(r10, r14)     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r14.<init>()     // Catch: java.lang.Throwable -> Ld0
            int r15 = r2.key     // Catch: java.lang.Throwable -> Ld0
            r14.append(r15)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> Ld0
            r13.put(r9, r14)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r14 = r2.versionName     // Catch: java.lang.Throwable -> Ld0
            r13.put(r8, r14)     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r15 = "classloader="
            r14.<init>(r15)     // Catch: java.lang.Throwable -> Ld0
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = ",StringClass="
            r14.append(r12)     // Catch: java.lang.Throwable -> Ld0
            r14.append(r0)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> Ld0
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> Ld0
            r15 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r15)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = r0.replace(r5, r11)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = r0.replace(r4, r11)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = r0.replace(r3, r11)     // Catch: java.lang.Throwable -> Ld0
            r13.put(r6, r0)     // Catch: java.lang.Throwable -> Ld0
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.b.e.a(r0, r7, r13)     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.c.a(r18)     // Catch: java.lang.Throwable -> Ld0
            r18.delete()     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.a.a r0 = r1.f5956d     // Catch: java.lang.Throwable -> Ld0
            int r12 = r2.key     // Catch: java.lang.Throwable -> Ld0
            r15 = 0
            r0.a(r12, r15)     // Catch: java.lang.Throwable -> Ld0
            return r15
        L1f8:
            r12 = r15
            java.lang.String r15 = "getInstance"
            r21 = r13
            r14 = 1
            java.lang.Class[] r13 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> Ld0
            java.lang.Class<android.content.Context> r17 = android.content.Context.class
            r22 = 0
            r13[r22] = r17     // Catch: java.lang.Throwable -> Ld0
            java.lang.reflect.Method r13 = r12.getDeclaredMethod(r15, r13)     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> Ld0
            android.content.Context r14 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Ld0
            r15[r22] = r14     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r12 = r13.invoke(r12, r15)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r13 = "setSecurityVerifyInfo"
            r14 = 2
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L22f
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r15[r22] = r20     // Catch: java.lang.Throwable -> L22f
            r17 = 1
            r15[r17] = r20     // Catch: java.lang.Throwable -> L22f
            r24 = r15
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L22f
            r15[r22] = r19     // Catch: java.lang.Throwable -> L22f
            r14 = r24
            r15[r17] = r21     // Catch: java.lang.Throwable -> L22f
            com.baidu.liantian.b.e.a(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L22f
            goto L232
        L22f:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> Ld0
        L232:
            java.lang.String r13 = "init"
            r14 = 2
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> Ld0
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Ld0
            r22 = 0
            r15[r22] = r14     // Catch: java.lang.Throwable -> Ld0
            r14 = r15
            java.lang.Class r19 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Ld0
            r17 = 1
            r14[r17] = r19     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.e r15 = r1.a     // Catch: java.lang.Throwable -> Ld0
            boolean r15 = r15.o()     // Catch: java.lang.Throwable -> Ld0
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r15)     // Catch: java.lang.Throwable -> Ld0
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> Ld0
            r22 = 0
            r15[r22] = r0     // Catch: java.lang.Throwable -> Ld0
            r17 = 1
            r15[r17] = r19     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r12 = com.baidu.liantian.b.e.a(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Ld0
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> Ld0
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> Ld0
            if (r12 != 0) goto L2ae
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.c.a(r18)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = r2.packageName     // Catch: java.lang.Throwable -> Ld0
            b(r0)     // Catch: java.lang.Throwable -> Ld0
            r18.delete()     // Catch: java.lang.Throwable -> Ld0
            int r0 = r2.key     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r2.versionName     // Catch: java.lang.Throwable -> Ld0
            r13 = 0
            r15 = 1
            r1.a(r0, r12, r15, r13)     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.a.a r0 = r1.f5956d     // Catch: java.lang.Throwable -> Ld0
            int r12 = r2.key     // Catch: java.lang.Throwable -> Ld0
            r15 = 0
            r0.a(r12, r15)     // Catch: java.lang.Throwable -> Ld0
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Ld0
            r0.<init>()     // Catch: java.lang.Throwable -> Ld0
            r12 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> Ld0
            r0.put(r10, r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r12.<init>()     // Catch: java.lang.Throwable -> Ld0
            int r13 = r2.key     // Catch: java.lang.Throwable -> Ld0
            r12.append(r13)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Ld0
            r0.put(r9, r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r2.versionName     // Catch: java.lang.Throwable -> Ld0
            r0.put(r8, r12)     // Catch: java.lang.Throwable -> Ld0
            android.content.Context r12 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.b.e.a(r12, r7, r0)     // Catch: java.lang.Throwable -> Ld0
            r15 = 0
            return r15
        L2ae:
            boolean r12 = r2.isMem     // Catch: java.lang.Throwable -> Ld0
            if (r12 == 0) goto L2ca
            com.baidu.liantian.c.a(r18)     // Catch: java.lang.Throwable -> Ld0
            r18.delete()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r2.dataDir     // Catch: java.lang.Throwable -> Ld0
            com.baidu.liantian.b.e.d(r12)     // Catch: java.lang.Throwable -> Ld0
            java.util.List<java.lang.Integer> r12 = com.baidu.liantian.core.g.f5977b     // Catch: java.lang.Throwable -> Ld0
            if (r12 == 0) goto L2ca
            int r13 = r2.key     // Catch: java.lang.Throwable -> Ld0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> Ld0
            r12.add(r13)     // Catch: java.lang.Throwable -> Ld0
        L2ca:
            com.baidu.liantian.b.a()
            com.baidu.liantian.a.a r3 = r1.f5956d     // Catch: java.lang.Throwable -> L349
            int r4 = r2.key     // Catch: java.lang.Throwable -> L349
            com.baidu.liantian.core.ApkInfo r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L349
            java.util.Objects.toString(r3)     // Catch: java.lang.Throwable -> L349
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L349
            if (r3 == 0) goto L2f0
            java.lang.String r4 = r3.versionName     // Catch: java.lang.Throwable -> L349
            java.lang.String r5 = r2.versionName     // Catch: java.lang.Throwable -> L349
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L349
            if (r4 != 0) goto L2f0
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L349
            java.lang.String r3 = r3.pkgPath     // Catch: java.lang.Throwable -> L349
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L349
        L2ee:
            r3 = 1
            goto L2f2
        L2f0:
            r14 = 0
            goto L2ee
        L2f2:
            r2.initStatus = r3     // Catch: java.lang.Throwable -> L349
            r2.apkParseSuc = r3     // Catch: java.lang.Throwable -> L349
            com.baidu.liantian.a.a r3 = r1.f5956d     // Catch: java.lang.Throwable -> L349
            long r3 = r3.a(r2)     // Catch: java.lang.Throwable -> L349
            r5 = 0
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 <= 0) goto L313
            if (r14 == 0) goto L313
            boolean r3 = r14.exists()     // Catch: java.lang.Throwable -> L349
            if (r3 == 0) goto L313
            com.baidu.liantian.c.a(r14)     // Catch: java.lang.Throwable -> L349
            r14.delete()     // Catch: java.lang.Throwable -> L349
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L349
        L313:
            com.baidu.liantian.a.a r3 = r1.f5956d     // Catch: java.lang.Throwable -> L349
            int r4 = r2.key     // Catch: java.lang.Throwable -> L349
            r15 = 0
            r3.a(r4, r15)     // Catch: java.lang.Throwable -> L349
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L349
            android.content.Context r3 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L349
            com.baidu.liantian.b.e.c(r3)     // Catch: java.lang.Throwable -> L349
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L349
            r3.<init>()     // Catch: java.lang.Throwable -> L349
            r3.put(r10, r0)     // Catch: java.lang.Throwable -> L349
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L349
            r0.<init>()     // Catch: java.lang.Throwable -> L349
            int r4 = r2.key     // Catch: java.lang.Throwable -> L349
            r0.append(r4)     // Catch: java.lang.Throwable -> L349
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L349
            r3.put(r9, r0)     // Catch: java.lang.Throwable -> L349
            java.lang.String r0 = r2.versionName     // Catch: java.lang.Throwable -> L349
            r3.put(r8, r0)     // Catch: java.lang.Throwable -> L349
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L349
            com.baidu.liantian.b.e.a(r0, r7, r3)     // Catch: java.lang.Throwable -> L349
        L346:
            r17 = 1
            goto L34d
        L349:
            com.baidu.liantian.b.e.a()
            goto L346
        L34d:
            return r17
        L34e:
            r0.getMessage()     // Catch: java.lang.Throwable -> L3b6
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L3b6
            com.baidu.liantian.c.a(r18)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r12 = r2.packageName     // Catch: java.lang.Throwable -> L3b6
            b(r12)     // Catch: java.lang.Throwable -> L3b6
            r18.delete()     // Catch: java.lang.Throwable -> L3b6
            int r12 = r2.key     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r13 = r2.versionName     // Catch: java.lang.Throwable -> L3b6
            r14 = 0
            r15 = 1
            r1.a(r12, r13, r15, r14)     // Catch: java.lang.Throwable -> L3b6
            com.baidu.liantian.a.a r12 = r1.f5956d     // Catch: java.lang.Throwable -> L3b6
            int r13 = r2.key     // Catch: java.lang.Throwable -> L3b6
            r15 = 0
            r12.a(r13, r15)     // Catch: java.lang.Throwable -> L3b6
            java.util.HashMap r12 = new java.util.HashMap     // Catch: java.lang.Throwable -> L3b6
            r12.<init>()     // Catch: java.lang.Throwable -> L3b6
            r13 = 5
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L3b6
            r12.put(r10, r13)     // Catch: java.lang.Throwable -> L3b6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b6
            r10.<init>()     // Catch: java.lang.Throwable -> L3b6
            int r13 = r2.key     // Catch: java.lang.Throwable -> L3b6
            r10.append(r13)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L3b6
            r12.put(r9, r10)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r2 = r2.versionName     // Catch: java.lang.Throwable -> L3b6
            r12.put(r8, r2)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r0 = com.baidu.liantian.b.a(r0)     // Catch: java.lang.Throwable -> L3b6
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L3b6
            r15 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r15)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r0 = r0.replace(r5, r11)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r0 = r0.replace(r4, r11)     // Catch: java.lang.Throwable -> L3b6
            java.lang.String r0 = r0.replace(r3, r11)     // Catch: java.lang.Throwable -> L3b6
            r12.put(r6, r0)     // Catch: java.lang.Throwable -> L3b6
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L3b6
            com.baidu.liantian.b.e.a(r0, r7, r12)     // Catch: java.lang.Throwable -> L3b6
        L3b4:
            r15 = 0
            goto L3ba
        L3b6:
            com.baidu.liantian.b.e.a()
            goto L3b4
        L3ba:
            return r15
    }

    public final void b() {
            r10 = this;
            com.baidu.liantian.a.a r0 = r10.f5956d     // Catch: java.lang.Throwable -> L10b
            java.util.List r0 = r0.a()     // Catch: java.lang.Throwable -> L10b
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L10b
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L10b
            com.baidu.liantian.e r1 = r10.a     // Catch: java.lang.Throwable -> L10b
            java.util.List r1 = r1.q()     // Catch: java.lang.Throwable -> L10b
            com.baidu.liantian.e r2 = r10.a     // Catch: java.lang.Throwable -> L10b
            java.util.List r2 = r2.p()     // Catch: java.lang.Throwable -> L10b
            r3 = 0
            r4 = 0
        L1a:
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L10b
            if (r4 >= r5) goto L34
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L10b
            boolean r5 = r1.contains(r5)     // Catch: java.lang.Throwable -> L10b
            if (r5 != 0) goto L31
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L10b
            r1.add(r5)     // Catch: java.lang.Throwable -> L10b
        L31:
            int r4 = r4 + 1
            goto L1a
        L34:
            com.baidu.liantian.core.d$2 r2 = new com.baidu.liantian.core.d$2     // Catch: java.lang.Throwable -> L10b
            r2.<init>(r10, r1)     // Catch: java.lang.Throwable -> L10b
            java.util.Collections.sort(r0, r2)     // Catch: java.lang.Throwable -> L10b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L10b
        L40:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L10b
            if (r1 == 0) goto L10a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L10b
            com.baidu.liantian.core.ApkInfo r1 = (com.baidu.liantian.core.ApkInfo) r1     // Catch: java.lang.Throwable -> L10b
            com.baidu.liantian.core.g r2 = com.baidu.liantian.core.g.a()     // Catch: java.lang.Throwable -> L10b
            r4 = 0
            if (r2 == 0) goto L5a
            java.lang.String r5 = r1.packageName     // Catch: java.lang.Throwable -> L10b
            com.baidu.liantian.core.ApkInfo r2 = r2.d(r5)     // Catch: java.lang.Throwable -> L10b
            goto L5b
        L5a:
            r2 = r4
        L5b:
            if (r2 != 0) goto L40
            com.baidu.liantian.a.a r2 = r10.f5956d     // Catch: java.lang.Throwable -> L10b
            int r5 = r1.key     // Catch: java.lang.Throwable -> L10b
            int r2 = r2.g(r5)     // Catch: java.lang.Throwable -> L10b
            r5 = 3
            if (r2 != r5) goto L6d
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L10b
            r2 = 0
            goto L6e
        L6d:
            r2 = 1
        L6e:
            com.baidu.liantian.e r5 = r10.a     // Catch: java.lang.Throwable -> L10b
            boolean r5 = r5.d()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r6 = "-"
            java.lang.String r7 = ".b_liantian"
            if (r5 == 0) goto Lc3
            if (r2 == 0) goto Lc3
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L10b
            android.content.Context r5 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L10b
            java.io.File r5 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L10b
            r2.<init>(r5, r7)     // Catch: java.lang.Throwable -> L10b
            boolean r5 = r2.exists()     // Catch: java.lang.Throwable -> L10b
            if (r5 != 0) goto L90
            r2.mkdir()     // Catch: java.lang.Throwable -> L10b
        L90:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L10b
            java.lang.String r7 = r1.pkgPath     // Catch: java.lang.Throwable -> L10b
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L10b
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10b
            r8.<init>()     // Catch: java.lang.Throwable -> L10b
            int r9 = r1.key     // Catch: java.lang.Throwable -> L10b
            r8.append(r9)     // Catch: java.lang.Throwable -> L10b
            r8.append(r6)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r6 = r1.versionName     // Catch: java.lang.Throwable -> L10b
            r8.append(r6)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L10b
            r7.<init>(r2, r6)     // Catch: java.lang.Throwable -> L10b
            boolean r2 = com.baidu.liantian.b.e.a(r7)     // Catch: java.lang.Throwable -> L10b
            if (r2 != 0) goto Lbb
            com.baidu.liantian.b.e.a(r5, r7)     // Catch: java.lang.Throwable -> L10b
        Lbb:
            android.content.Context r2 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L10b
            int r6 = r1.key     // Catch: java.lang.Throwable -> L10b
            com.baidu.liantian.c.a(r2, r6, r5, r7)     // Catch: java.lang.Throwable -> L10b
            goto L101
        Lc3:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L10b
            android.content.Context r5 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L10b
            java.io.File r5 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L10b
            r2.<init>(r5, r7)     // Catch: java.lang.Throwable -> L10b
            boolean r5 = r2.exists()     // Catch: java.lang.Throwable -> L10b
            if (r5 == 0) goto L101
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10b
            r7.<init>()     // Catch: java.lang.Throwable -> L10b
            int r8 = r1.key     // Catch: java.lang.Throwable -> L10b
            r7.append(r8)     // Catch: java.lang.Throwable -> L10b
            r7.append(r6)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r6 = r1.versionName     // Catch: java.lang.Throwable -> L10b
            r7.append(r6)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L10b
            r5.<init>(r2, r6)     // Catch: java.lang.Throwable -> L10b
            boolean r2 = com.baidu.liantian.b.e.a(r5)     // Catch: java.lang.Throwable -> L10b
            if (r2 == 0) goto L101
            com.baidu.liantian.c.a(r5)     // Catch: java.lang.Throwable -> L10b
            r5.delete()     // Catch: java.lang.Throwable -> L10b
            r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L10b
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L10b
        L101:
            int r2 = r1.key     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Throwable -> L10b
            r10.a(r2, r1, r4)     // Catch: java.lang.Throwable -> L10b
            goto L40
        L10a:
            return
        L10b:
            com.baidu.liantian.b.e.a()
            return
    }

    public final void b(android.content.Context r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "t"
            java.lang.String r3 = "n"
            com.baidu.liantian.e r4 = r0.a     // Catch: java.lang.Throwable -> L250
            android.content.SharedPreferences r4 = r4.a     // Catch: java.lang.Throwable -> L250
            java.lang.String r5 = "lpcf"
            r6 = 0
            boolean r4 = r4.getBoolean(r5, r6)     // Catch: java.lang.Throwable -> L250
            if (r4 == 0) goto L17
            goto L24f
        L17:
            java.lang.String r4 = "liantian_local.cfg"
            java.lang.String r5 = "local"
            java.lang.String r4 = com.baidu.liantian.b.e.a(r1, r4, r5)     // Catch: java.lang.Throwable -> L250
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L250
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L250
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L250
            r4.<init>()     // Catch: java.lang.Throwable -> L250
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L250
            r7.<init>()     // Catch: java.lang.Throwable -> L250
            r8 = 0
        L2f:
            int r9 = r5.length()     // Catch: java.lang.Throwable -> L250
            if (r8 >= r9) goto L89
            org.json.JSONObject r9 = r5.optJSONObject(r8)     // Catch: java.lang.Throwable -> L250
            java.lang.String r10 = "pkgname"
            java.lang.String r10 = r9.optString(r10)     // Catch: java.lang.Throwable -> L250
            java.lang.String r11 = "version"
            java.lang.String r11 = r9.optString(r11)     // Catch: java.lang.Throwable -> L250
            java.lang.String r12 = "id"
            int r12 = r9.optInt(r12)     // Catch: java.lang.Throwable -> L250
            if (r12 <= 0) goto L54
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L250
            r7.add(r13)     // Catch: java.lang.Throwable -> L250
        L54:
            java.lang.String r13 = "md5"
            java.lang.String r9 = r9.optString(r13)     // Catch: java.lang.Throwable -> L250
            boolean r13 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L250
            if (r13 != 0) goto L86
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L250
            if (r13 != 0) goto L86
            boolean r13 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L250
            if (r13 != 0) goto L86
            if (r12 <= 0) goto L86
            java.lang.String r9 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L250
            com.baidu.liantian.core.ApkInfo r13 = new com.baidu.liantian.core.ApkInfo     // Catch: java.lang.Throwable -> L250
            r13.<init>()     // Catch: java.lang.Throwable -> L250
            r13.packageName = r10     // Catch: java.lang.Throwable -> L250
            r13.versionName = r11     // Catch: java.lang.Throwable -> L250
            r13.key = r12     // Catch: java.lang.Throwable -> L250
            r13.apkMD5 = r9     // Catch: java.lang.Throwable -> L250
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L250
            r4.put(r9, r13)     // Catch: java.lang.Throwable -> L250
        L86:
            int r8 = r8 + 1
            goto L2f
        L89:
            com.baidu.liantian.e r5 = r0.a     // Catch: java.lang.Throwable -> L250
            r5.a(r7)     // Catch: java.lang.Throwable -> L250
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L250
            if (r5 > 0) goto L9a
            com.baidu.liantian.e r1 = r0.a     // Catch: java.lang.Throwable -> L250
            r1.s()     // Catch: java.lang.Throwable -> L250
            return
        L9a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L250
            r5.<init>()     // Catch: java.lang.Throwable -> L250
            java.lang.String r7 = com.baidu.liantian.b.e.b()     // Catch: java.lang.Throwable -> L250
            r5.append(r7)     // Catch: java.lang.Throwable -> L250
            java.lang.String r7 = "p/1/pio"
            r5.append(r7)     // Catch: java.lang.Throwable -> L250
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L250
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L250
            r7.<init>()     // Catch: java.lang.Throwable -> L250
            java.util.Collection r8 = r4.values()     // Catch: java.lang.Throwable -> L250
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L250
        Lbc:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L250
            java.lang.String r10 = "v"
            java.lang.String r11 = "l"
            if (r9 == 0) goto Led
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L250
            com.baidu.liantian.core.ApkInfo r9 = (com.baidu.liantian.core.ApkInfo) r9     // Catch: java.lang.Throwable -> L250
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L250
            r12.<init>()     // Catch: java.lang.Throwable -> L250
            java.lang.String r13 = "pk"
            java.lang.String r14 = r9.packageName     // Catch: java.lang.Throwable -> L250
            r12.put(r13, r14)     // Catch: java.lang.Throwable -> L250
            java.lang.String r13 = "m"
            java.lang.String r14 = r9.apkMD5     // Catch: java.lang.Throwable -> L250
            r12.put(r13, r14)     // Catch: java.lang.Throwable -> L250
            int r13 = r9.key     // Catch: java.lang.Throwable -> L250
            r12.put(r11, r13)     // Catch: java.lang.Throwable -> L250
            java.lang.String r9 = r9.versionName     // Catch: java.lang.Throwable -> L250
            r12.put(r10, r9)     // Catch: java.lang.Throwable -> L250
            r7.put(r12)     // Catch: java.lang.Throwable -> L250
            goto Lbc
        Led:
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L250
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L250
            java.lang.String r1 = com.baidu.liantian.b.h.a(r1, r5, r7)     // Catch: java.lang.Throwable -> L250
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L250
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L250
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L250
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L250
            if (r1 <= 0) goto L10b
            com.baidu.liantian.e r1 = r0.a     // Catch: java.lang.Throwable -> L250
            r1.s()     // Catch: java.lang.Throwable -> L250
        L10b:
            r1 = 0
        L10c:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> L250
            if (r1 >= r7) goto L24f
            org.json.JSONObject r7 = r5.optJSONObject(r1)     // Catch: java.lang.Throwable -> L250
            java.lang.String r8 = "errno"
            int r8 = r7.optInt(r8)     // Catch: java.lang.Throwable -> L250
            int r9 = r7.optInt(r11)     // Catch: java.lang.Throwable -> L250
            r12 = 1
            if (r8 != r12) goto L244
            java.lang.String r8 = "detail"
            org.json.JSONObject r7 = r7.optJSONObject(r8)     // Catch: java.lang.Throwable -> L16d
            android.content.pm.PackageInfo r8 = new android.content.pm.PackageInfo     // Catch: java.lang.Throwable -> L16d
            r8.<init>()     // Catch: java.lang.Throwable -> L16d
            java.lang.String r12 = "p"
            java.lang.String r12 = r7.optString(r12)     // Catch: java.lang.Throwable -> L16d
            r8.packageName = r12     // Catch: java.lang.Throwable -> L16d
            java.lang.String r12 = r7.optString(r10)     // Catch: java.lang.Throwable -> L16d
            r8.versionName = r12     // Catch: java.lang.Throwable -> L16d
            android.content.pm.ApplicationInfo r12 = new android.content.pm.ApplicationInfo     // Catch: java.lang.Throwable -> L16d
            r12.<init>()     // Catch: java.lang.Throwable -> L16d
            java.lang.String r13 = r7.optString(r3)     // Catch: java.lang.Throwable -> L16d
            r12.className = r13     // Catch: java.lang.Throwable -> L16d
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L16d
            java.lang.String r14 = "."
            if (r13 != 0) goto L173
            java.lang.String r13 = r12.className     // Catch: java.lang.Throwable -> L16d
            boolean r13 = r13.startsWith(r14)     // Catch: java.lang.Throwable -> L16d
            if (r13 == 0) goto L173
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16d
            r13.<init>()     // Catch: java.lang.Throwable -> L16d
            java.lang.String r15 = r8.packageName     // Catch: java.lang.Throwable -> L16d
            r13.append(r15)     // Catch: java.lang.Throwable -> L16d
            java.lang.String r15 = r12.className     // Catch: java.lang.Throwable -> L16d
            r13.append(r15)     // Catch: java.lang.Throwable -> L16d
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L16d
            r12.className = r13     // Catch: java.lang.Throwable -> L16d
            goto L173
        L16d:
            r18 = r1
            r16 = r3
            goto L220
        L173:
            int r13 = r7.optInt(r2)     // Catch: java.lang.Throwable -> L16d
            r12.theme = r13     // Catch: java.lang.Throwable -> L16d
            r8.applicationInfo = r12     // Catch: java.lang.Throwable -> L16d
            java.lang.String r12 = "a"
            org.json.JSONArray r7 = r7.optJSONArray(r12)     // Catch: java.lang.Throwable -> L16d
            if (r7 == 0) goto L21b
            int r12 = r7.length()     // Catch: java.lang.Throwable -> L16d
            if (r12 <= 0) goto L21b
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16d
            r12.<init>()     // Catch: java.lang.Throwable -> L16d
            r13 = 0
        L18f:
            int r15 = r7.length()     // Catch: java.lang.Throwable -> L16d
            if (r13 >= r15) goto L202
            org.json.JSONObject r15 = r7.getJSONObject(r13)     // Catch: java.lang.Throwable -> L1ef
            if (r15 == 0) goto L1f2
            android.content.pm.ActivityInfo r6 = new android.content.pm.ActivityInfo     // Catch: java.lang.Throwable -> L1ef
            r6.<init>()     // Catch: java.lang.Throwable -> L1ef
            r18 = r1
            java.lang.String r1 = r15.optString(r3)     // Catch: java.lang.Throwable -> L1ce
            r6.name = r1     // Catch: java.lang.Throwable -> L1ce
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1ce
            if (r1 != 0) goto L1d1
            java.lang.String r1 = r6.name     // Catch: java.lang.Throwable -> L1ce
            boolean r1 = r1.startsWith(r14)     // Catch: java.lang.Throwable -> L1ce
            if (r1 == 0) goto L1d1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ce
            r1.<init>()     // Catch: java.lang.Throwable -> L1ce
            r16 = r3
            java.lang.String r3 = r8.packageName     // Catch: java.lang.Throwable -> L1f7
            r1.append(r3)     // Catch: java.lang.Throwable -> L1f7
            java.lang.String r3 = r6.name     // Catch: java.lang.Throwable -> L1f7
            r1.append(r3)     // Catch: java.lang.Throwable -> L1f7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1f7
            r6.name = r1     // Catch: java.lang.Throwable -> L1f7
            goto L1d3
        L1ce:
            r16 = r3
            goto L1f7
        L1d1:
            r16 = r3
        L1d3:
            java.lang.String r1 = r8.packageName     // Catch: java.lang.Throwable -> L1f7
            r6.packageName = r1     // Catch: java.lang.Throwable -> L1f7
            int r1 = r15.optInt(r2)     // Catch: java.lang.Throwable -> L1f7
            r6.theme = r1     // Catch: java.lang.Throwable -> L1f7
            int r1 = r15.optInt(r11)     // Catch: java.lang.Throwable -> L1f7
            r6.labelRes = r1     // Catch: java.lang.Throwable -> L1f7
            java.lang.String r1 = r6.name     // Catch: java.lang.Throwable -> L1f7
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1f7
            if (r1 != 0) goto L1fa
            r12.add(r6)     // Catch: java.lang.Throwable -> L1f7
            goto L1fa
        L1ef:
            r18 = r1
            goto L1ce
        L1f2:
            r18 = r1
            r16 = r3
            goto L1fa
        L1f7:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L220
        L1fa:
            int r13 = r13 + 1
            r1 = r18
            r3 = r16
            r6 = 0
            goto L18f
        L202:
            r18 = r1
            r16 = r3
            int r1 = r12.size()     // Catch: java.lang.Throwable -> L220
            if (r1 <= 0) goto L224
            int r1 = r12.size()     // Catch: java.lang.Throwable -> L220
            android.content.pm.ActivityInfo[] r1 = new android.content.pm.ActivityInfo[r1]     // Catch: java.lang.Throwable -> L220
            java.lang.Object[] r1 = r12.toArray(r1)     // Catch: java.lang.Throwable -> L220
            android.content.pm.ActivityInfo[] r1 = (android.content.pm.ActivityInfo[]) r1     // Catch: java.lang.Throwable -> L220
            r8.activities = r1     // Catch: java.lang.Throwable -> L220
            goto L224
        L21b:
            r18 = r1
            r16 = r3
            goto L224
        L220:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L250
            r8 = 0
        L224:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L250
            java.lang.Object r1 = r4.get(r1)     // Catch: java.lang.Throwable -> L250
            com.baidu.liantian.core.ApkInfo r1 = (com.baidu.liantian.core.ApkInfo) r1     // Catch: java.lang.Throwable -> L250
            if (r1 == 0) goto L248
            if (r8 == 0) goto L248
            java.lang.String r3 = r8.packageName     // Catch: java.lang.Throwable -> L250
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L250
            if (r3 != 0) goto L248
            int r3 = r1.key     // Catch: java.lang.Throwable -> L250
            java.lang.String r6 = r1.versionName     // Catch: java.lang.Throwable -> L250
            java.lang.String r1 = r1.apkMD5     // Catch: java.lang.Throwable -> L250
            r0.a(r3, r6, r1, r8)     // Catch: java.lang.Throwable -> L250
            goto L248
        L244:
            r18 = r1
            r16 = r3
        L248:
            int r1 = r18 + 1
            r3 = r16
            r6 = 0
            goto L10c
        L24f:
            return
        L250:
            com.baidu.liantian.b.e.a()
            return
    }

    public final boolean c() {
            r1 = this;
            com.baidu.liantian.a.a r0 = r1.f5956d
            r0.d()
            r0 = 1
            r1.f5957f = r0
            android.content.Context r0 = com.baidu.liantian.core.d.f5951b
            boolean r0 = r1.c(r0)
            return r0
    }
}
