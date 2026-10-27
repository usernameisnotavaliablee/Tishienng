package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i1 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f2374b = "FloatWindowManager";

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.acse.ottn.i1 f2375c;
    public androidx.appcompat.app.AlertDialog a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.i1.i {
        public final /* synthetic */ androidx.appcompat.app.AppCompatActivity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2376b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i1 f2377c;

        public a(com.acse.ottn.i1 r1, androidx.appcompat.app.AppCompatActivity r2, int r3) {
                r0 = this;
                r0.f2377c = r1
                r0.a = r2
                r0.f2376b = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.i1.i
        public void a(boolean r10) {
                r9 = this;
                java.lang.String r0 = "package:"
                java.lang.String r1 = "3"
                java.lang.String r2 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
                java.lang.String r3 = "1"
                java.lang.String r4 = "battery_white"
                java.lang.String r5 = "flow_window_state"
                if (r10 == 0) goto L135
                com.acse.ottn.q2 r10 = com.acse.ottn.q2.b()
                java.lang.String r6 = "open_flow_window_list"
                r10.a(r6)
                com.acse.ottn.n3 r10 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lfc
                java.lang.String r10 = r10.a(r5, r3)     // Catch: java.lang.Exception -> Lfc
                java.lang.String r6 = com.acse.ottn.n4.b()     // Catch: java.lang.Exception -> Lfc
                java.lang.String r7 = "xiaomi"
                boolean r7 = r7.equals(r6)     // Catch: java.lang.Exception -> Lfc
                java.lang.String r8 = "2"
                if (r7 != 0) goto L3d
                java.lang.String r7 = "redmi"
                boolean r7 = r7.equals(r6)     // Catch: java.lang.Exception -> Lfc
                if (r7 != 0) goto L3d
                java.lang.String r7 = "blackshark"
                boolean r7 = r7.equals(r6)     // Catch: java.lang.Exception -> Lfc
                if (r7 == 0) goto L87
            L3d:
                boolean r7 = r10.equals(r8)     // Catch: java.lang.Exception -> Lfc
                if (r7 != 0) goto L87
                com.acse.ottn.n3 r10 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lfc
                r10.b(r5, r8)     // Catch: java.lang.Exception -> Lfc
                com.acse.ottn.n3 r10 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lfc
                java.lang.String r3 = "OpenPermissionName"
                java.lang.String r6 = "显示悬浮窗"
                r10.b(r3, r6)     // Catch: java.lang.Exception -> Lfc
                android.content.Intent r10 = new android.content.Intent     // Catch: java.lang.Exception -> Lfc
                r10.<init>()     // Catch: java.lang.Exception -> Lfc
                com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lfc
                java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lfc
                r3.a(r4, r6)     // Catch: java.lang.Exception -> Lfc
                android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Exception -> Lfc
                java.lang.String r6 = "com.miui.securitycenter"
                java.lang.String r7 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
                r3.<init>(r6, r7)     // Catch: java.lang.Exception -> Lfc
                java.lang.String r6 = "extra_pkgname"
                androidx.appcompat.app.AppCompatActivity r7 = r9.a     // Catch: java.lang.Exception -> Lfc
                java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Exception -> Lfc
                r10.putExtra(r6, r7)     // Catch: java.lang.Exception -> Lfc
                r10.setComponent(r3)     // Catch: java.lang.Exception -> Lfc
                r3 = 268435456(0x10000000, float:2.524355E-29)
                r10.addFlags(r3)     // Catch: java.lang.Exception -> Lfc
                androidx.appcompat.app.AppCompatActivity r3 = r9.a     // Catch: java.lang.Exception -> Lfc
                int r6 = r9.f2376b     // Catch: java.lang.Exception -> Lfc
                r3.startActivityForResult(r10, r6)     // Catch: java.lang.Exception -> Lfc
                return
            L87:
                java.lang.String r7 = "vivo"
                boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lfc
                if (r6 == 0) goto Lc3
                boolean r10 = r10.equals(r8)     // Catch: java.lang.Exception -> Lfc
                if (r10 != 0) goto Lc3
                com.acse.ottn.n3 r10 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lfc
                r10.b(r5, r8)     // Catch: java.lang.Exception -> Lfc
                com.acse.ottn.n3 r10 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lfc
                java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lfc
                r10.a(r4, r6)     // Catch: java.lang.Exception -> Lfc
                android.content.Intent r10 = new android.content.Intent     // Catch: java.lang.Exception -> Lfc
                r10.<init>()     // Catch: java.lang.Exception -> Lfc
                java.lang.String r6 = "com.vivo.permissionmanager"
                java.lang.String r7 = "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"
                r10.setClassName(r6, r7)     // Catch: java.lang.Exception -> Lfc
                java.lang.String r6 = "packagename"
                java.lang.String r7 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> Lfc
                r10.putExtra(r6, r7)     // Catch: java.lang.Exception -> Lfc
                java.lang.String r6 = "tabId"
                r10.putExtra(r6, r3)     // Catch: java.lang.Exception -> Lfc
                androidx.appcompat.app.AppCompatActivity r3 = r9.a     // Catch: java.lang.Exception -> Lfc
                r3.startActivity(r10)     // Catch: java.lang.Exception -> Lfc
                return
            Lc3:
                android.content.Intent r10 = new android.content.Intent     // Catch: java.lang.Exception -> Lfc
                r10.<init>(r2)     // Catch: java.lang.Exception -> Lfc
                com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lfc
                r3.b(r5, r1)     // Catch: java.lang.Exception -> Lfc
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lfc
                r3.<init>()     // Catch: java.lang.Exception -> Lfc
                r3.append(r0)     // Catch: java.lang.Exception -> Lfc
                androidx.appcompat.app.AppCompatActivity r6 = r9.a     // Catch: java.lang.Exception -> Lfc
                java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Exception -> Lfc
                r3.append(r6)     // Catch: java.lang.Exception -> Lfc
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lfc
                android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> Lfc
                r10.setData(r3)     // Catch: java.lang.Exception -> Lfc
                com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lfc
                java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lfc
                r3.a(r4, r6)     // Catch: java.lang.Exception -> Lfc
                androidx.appcompat.app.AppCompatActivity r3 = r9.a     // Catch: java.lang.Exception -> Lfc
                int r6 = r9.f2376b     // Catch: java.lang.Exception -> Lfc
                r3.startActivityForResult(r10, r6)     // Catch: java.lang.Exception -> Lfc
                return
            Lfc:
                android.content.Intent r10 = new android.content.Intent
                r10.<init>(r2)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                r2.b(r5, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                androidx.appcompat.app.AppCompatActivity r0 = r9.a
                java.lang.String r0 = r0.getPackageName()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                android.net.Uri r0 = android.net.Uri.parse(r0)
                r10.setData(r0)
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.a(r4, r1)
                androidx.appcompat.app.AppCompatActivity r0 = r9.a
                int r1 = r9.f2376b
                r0.startActivityForResult(r10, r1)
                return
            L135:
                com.acse.ottn.q2 r10 = com.acse.ottn.q2.b()
                java.lang.String r0 = "cancle_flow_window_list"
                r10.a(r0)
                java.lang.String r10 = "FloatWindowManager"
                java.lang.String r0 = "ROM:360, user manually refuse OVERLAY_PERMISSION"
                com.acse.ottn.h2.b(r10, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.i1.i {
        public final /* synthetic */ androidx.appcompat.app.AppCompatActivity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2378b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i1 f2379c;

        public b(com.acse.ottn.i1 r1, androidx.appcompat.app.AppCompatActivity r2, int r3) {
                r0 = this;
                r0.f2379c = r1
                r0.a = r2
                r0.f2378b = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.i1.i
        public void a(boolean r2) {
                r1 = this;
                if (r2 == 0) goto La
                androidx.appcompat.app.AppCompatActivity r2 = r1.a
                int r0 = r1.f2378b
                com.acse.ottn.m3.a(r2, r0)
                return
            La:
                java.lang.String r2 = "FloatWindowManager"
                java.lang.String r0 = "ROM:360, user manually refuse OVERLAY_PERMISSION"
                com.acse.ottn.h2.b(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements com.acse.ottn.i1.i {
        public final /* synthetic */ androidx.appcompat.app.AppCompatActivity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2380b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i1 f2381c;

        public c(com.acse.ottn.i1 r1, androidx.appcompat.app.AppCompatActivity r2, int r3) {
                r0 = this;
                r0.f2381c = r1
                r0.a = r2
                r0.f2380b = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.i1.i
        public void a(boolean r2) {
                r1 = this;
                if (r2 == 0) goto La
                androidx.appcompat.app.AppCompatActivity r2 = r1.a
                int r0 = r1.f2380b
                com.acse.ottn.s1.a(r2, r0)
                return
            La:
                java.lang.String r2 = "FloatWindowManager"
                java.lang.String r0 = "ROM:huawei, user manually refuse OVERLAY_PERMISSION"
                com.acse.ottn.h2.b(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements com.acse.ottn.i1.i {
        public final /* synthetic */ androidx.appcompat.app.AppCompatActivity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2382b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i1 f2383c;

        public d(com.acse.ottn.i1 r1, androidx.appcompat.app.AppCompatActivity r2, int r3) {
                r0 = this;
                r0.f2383c = r1
                r0.a = r2
                r0.f2382b = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.i1.i
        public void a(boolean r2) {
                r1 = this;
                if (r2 == 0) goto La
                androidx.appcompat.app.AppCompatActivity r2 = r1.a
                int r0 = r1.f2382b
                com.acse.ottn.o2.a(r2, r0)
                return
            La:
                java.lang.String r2 = "FloatWindowManager"
                java.lang.String r0 = "ROM:meizu, user manually refuse OVERLAY_PERMISSION"
                com.acse.ottn.h2.b(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements com.acse.ottn.i1.i {
        public final /* synthetic */ androidx.appcompat.app.AppCompatActivity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2384b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i1 f2385c;

        public e(com.acse.ottn.i1 r1, androidx.appcompat.app.AppCompatActivity r2, int r3) {
                r0 = this;
                r0.f2385c = r1
                r0.a = r2
                r0.f2384b = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.i1.i
        public void a(boolean r2) {
                r1 = this;
                if (r2 == 0) goto La
                androidx.appcompat.app.AppCompatActivity r2 = r1.a
                int r0 = r1.f2384b
                com.acse.ottn.p2.a(r2, r0)
                return
            La:
                java.lang.String r2 = "FloatWindowManager"
                java.lang.String r0 = "ROM:miui, user manually refuse OVERLAY_PERMISSION"
                com.acse.ottn.h2.b(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements com.acse.ottn.i1.i {
        public final /* synthetic */ androidx.appcompat.app.AppCompatActivity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2386b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i1 f2387c;

        public f(com.acse.ottn.i1 r1, androidx.appcompat.app.AppCompatActivity r2, int r3) {
                r0 = this;
                r0.f2387c = r1
                r0.a = r2
                r0.f2386b = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.i1.i
        public void a(boolean r2) {
                r1 = this;
                if (r2 == 0) goto La
                androidx.appcompat.app.AppCompatActivity r2 = r1.a
                int r0 = r1.f2386b
                com.acse.ottn.h3.a(r2, r0)
                return
            La:
                java.lang.String r2 = "FloatWindowManager"
                java.lang.String r0 = "ROM:miui, user manually refuse OVERLAY_PERMISSION"
                com.acse.ottn.h2.b(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class g implements com.acse.ottn.i1.i {
        public final /* synthetic */ androidx.appcompat.app.AppCompatActivity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2388b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i1 f2389c;

        public g(com.acse.ottn.i1 r1, androidx.appcompat.app.AppCompatActivity r2, int r3) {
                r0 = this;
                r0.f2389c = r1
                r0.a = r2
                r0.f2388b = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.i1.i
        public void a(boolean r3) {
                r2 = this;
                java.lang.String r0 = "FloatWindowManager"
                if (r3 == 0) goto L15
                androidx.appcompat.app.AppCompatActivity r3 = r2.a     // Catch: java.lang.Exception -> Lc
                int r1 = r2.f2388b     // Catch: java.lang.Exception -> Lc
                com.acse.ottn.i1.e(r3, r1)     // Catch: java.lang.Exception -> Lc
                return
            Lc:
                r3 = move-exception
                java.lang.String r3 = android.util.Log.getStackTraceString(r3)
                com.acse.ottn.h2.b(r0, r3)
                return
            L15:
                java.lang.String r3 = "user manually refuse OVERLAY_PERMISSION"
                com.acse.ottn.h2.a(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class h implements com.acse.ottn.z0.c {
        public final /* synthetic */ com.acse.ottn.i1.i a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.i1 f2390b;

        public h(com.acse.ottn.i1 r1, com.acse.ottn.i1.i r2) {
                r0 = this;
                r0.f2390b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.z0.c
        public void a() {
                r2 = this;
                com.acse.ottn.i1 r0 = r2.f2390b
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.i1.a(r0)
                r0.dismiss()
                com.acse.ottn.i1$i r0 = r2.a
                r1 = 0
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.z0.c
        public void b() {
                r2 = this;
                com.acse.ottn.i1$i r0 = r2.a
                r1 = 1
                r0.a(r1)
                com.acse.ottn.i1 r0 = r2.f2390b
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.i1.a(r0)
                r0.dismiss()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface i {
        void a(boolean r1);
    }

    public i1() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ androidx.appcompat.app.AlertDialog a(com.acse.ottn.i1 r0) {
            androidx.appcompat.app.AlertDialog r0 = r0.a
            return r0
    }

    public static java.lang.Boolean a(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            r0 = 100
            java.util.List r1 = r1.getRunningServices(r0)
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            android.app.ActivityManager$RunningServiceInfo r0 = (android.app.ActivityManager.RunningServiceInfo) r0
            android.content.ComponentName r0 = r0.service
            java.lang.String r0 = r0.getClassName()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L2d:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
    }

    public static com.acse.ottn.i1 b() {
            com.acse.ottn.i1 r0 = com.acse.ottn.i1.f2375c
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.i1> r0 = com.acse.ottn.i1.class
            monitor-enter(r0)
            com.acse.ottn.i1 r1 = com.acse.ottn.i1.f2375c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.i1 r1 = new com.acse.ottn.i1     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.i1.f2375c = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.i1 r0 = com.acse.ottn.i1.f2375c
            return r0
    }

    public static void e(androidx.appcompat.app.AppCompatActivity r3, int r4) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Class<android.provider.Settings> r0 = android.provider.Settings.class
            java.lang.String r1 = "ACTION_MANAGE_OVERLAY_PERMISSION"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            android.content.Intent r1 = new android.content.Intent
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "package:"
            r0.append(r2)
            java.lang.String r2 = r3.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setData(r0)
            r3.startActivityForResult(r1, r4)
            return
    }

    public void a(android.app.Activity r11, int r12) {
            r10 = this;
            java.lang.String r0 = "package:"
            java.lang.String r1 = "3"
            java.lang.String r2 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            java.lang.String r3 = "1"
            java.lang.String r4 = "battery_white"
            java.lang.String r5 = "flow_window_state"
            com.acse.ottn.q2 r6 = com.acse.ottn.q2.b()
            java.lang.String r7 = "open_flow_window_list"
            r6.a(r7)
            java.lang.String r6 = com.acse.ottn.n4.b()     // Catch: java.lang.Exception -> Lf0
            com.acse.ottn.n3 r7 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lf0
            java.lang.String r7 = r7.a(r5, r3)     // Catch: java.lang.Exception -> Lf0
            java.lang.String r8 = "xiaomi"
            boolean r8 = r8.equals(r6)     // Catch: java.lang.Exception -> Lf0
            java.lang.String r9 = "2"
            if (r8 != 0) goto L3b
            java.lang.String r8 = "redmi"
            boolean r8 = r8.equals(r6)     // Catch: java.lang.Exception -> Lf0
            if (r8 != 0) goto L3b
            java.lang.String r8 = "blackshark"
            boolean r8 = r8.equals(r6)     // Catch: java.lang.Exception -> Lf0
            if (r8 == 0) goto L7f
        L3b:
            boolean r8 = r7.equals(r9)     // Catch: java.lang.Exception -> Lf0
            if (r8 != 0) goto L7f
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lf0
            r3.b(r5, r9)     // Catch: java.lang.Exception -> Lf0
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lf0
            java.lang.String r6 = "OpenPermissionName"
            java.lang.String r7 = "显示悬浮窗"
            r3.b(r6, r7)     // Catch: java.lang.Exception -> Lf0
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Exception -> Lf0
            r3.<init>()     // Catch: java.lang.Exception -> Lf0
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lf0
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lf0
            r6.a(r4, r7)     // Catch: java.lang.Exception -> Lf0
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch: java.lang.Exception -> Lf0
            java.lang.String r7 = "com.miui.securitycenter"
            java.lang.String r8 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
            r6.<init>(r7, r8)     // Catch: java.lang.Exception -> Lf0
            java.lang.String r7 = "extra_pkgname"
            java.lang.String r8 = r11.getPackageName()     // Catch: java.lang.Exception -> Lf0
            r3.putExtra(r7, r8)     // Catch: java.lang.Exception -> Lf0
            r3.setComponent(r6)     // Catch: java.lang.Exception -> Lf0
            r6 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r6)     // Catch: java.lang.Exception -> Lf0
            r11.startActivityForResult(r3, r12)     // Catch: java.lang.Exception -> Lf0
            return
        L7f:
            java.lang.String r8 = "vivo"
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> Lf0
            if (r6 == 0) goto Lbd
            boolean r6 = r7.equals(r9)     // Catch: java.lang.Exception -> Lf0
            if (r6 != 0) goto Lbd
            java.lang.String r6 = "0"
            com.acse.ottn.z4.f2919c = r6     // Catch: java.lang.Exception -> Lf0
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lf0
            r6.b(r5, r9)     // Catch: java.lang.Exception -> Lf0
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lf0
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lf0
            r6.a(r4, r7)     // Catch: java.lang.Exception -> Lf0
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Exception -> Lf0
            r6.<init>()     // Catch: java.lang.Exception -> Lf0
            java.lang.String r7 = "com.vivo.permissionmanager"
            java.lang.String r8 = "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"
            r6.setClassName(r7, r8)     // Catch: java.lang.Exception -> Lf0
            java.lang.String r7 = "packagename"
            java.lang.String r8 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> Lf0
            r6.putExtra(r7, r8)     // Catch: java.lang.Exception -> Lf0
            java.lang.String r7 = "tabId"
            r6.putExtra(r7, r3)     // Catch: java.lang.Exception -> Lf0
            r11.startActivity(r6)     // Catch: java.lang.Exception -> Lf0
            return
        Lbd:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Exception -> Lf0
            r3.<init>(r2)     // Catch: java.lang.Exception -> Lf0
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lf0
            r6.b(r5, r1)     // Catch: java.lang.Exception -> Lf0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf0
            r6.<init>()     // Catch: java.lang.Exception -> Lf0
            r6.append(r0)     // Catch: java.lang.Exception -> Lf0
            java.lang.String r7 = r11.getPackageName()     // Catch: java.lang.Exception -> Lf0
            r6.append(r7)     // Catch: java.lang.Exception -> Lf0
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Lf0
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Exception -> Lf0
            r3.setData(r6)     // Catch: java.lang.Exception -> Lf0
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> Lf0
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lf0
            r6.a(r4, r7)     // Catch: java.lang.Exception -> Lf0
            r11.startActivityForResult(r3, r12)     // Catch: java.lang.Exception -> Lf0
            return
        Lf0:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r5, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r11.getPackageName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r3.setData(r0)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.a(r4, r1)
            r11.startActivityForResult(r3, r12)
            return
    }

    public final void a(androidx.appcompat.app.AppCompatActivity r2, int r3) {
            r1 = this;
            com.acse.ottn.i1$b r0 = new com.acse.ottn.i1$b
            r0.<init>(r1, r2, r3)
            r1.a(r2, r0)
            return
    }

    public final void a(androidx.appcompat.app.AppCompatActivity r2, com.acse.ottn.i1.i r3) {
            r1 = this;
            java.lang.String r0 = "您的手机没有授予悬浮窗权限，请开启后再试"
            r1.a(r2, r0, r3)
            return
    }

    public final void a(androidx.appcompat.app.AppCompatActivity r9, java.lang.String r10, com.acse.ottn.i1.i r11) {
            r8 = this;
            androidx.appcompat.app.AlertDialog r10 = r8.a
            if (r10 == 0) goto Lf
            boolean r10 = r10.isShowing()
            if (r10 == 0) goto Lf
            androidx.appcompat.app.AlertDialog r10 = r8.a
            r10.dismiss()
        Lf:
            int r10 = com.acse.ottn.R.string.dialog_flow_message
            android.content.res.Resources r0 = r9.getResources()
            int r1 = com.acse.ottn.R.string.dialog_flow_title
            java.lang.String r3 = r0.getString(r1)
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r4 = r0.getString(r10)
            com.acse.ottn.i1$h r7 = new com.acse.ottn.i1$h
            r7.<init>(r8, r11)
            java.lang.String r5 = "好的"
            r6 = 0
            r2 = r9
            androidx.appcompat.app.AlertDialog r9 = com.acse.ottn.z0.a(r2, r3, r4, r5, r6, r7)
            r8.a = r9
            return
    }

    public boolean a() {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.a
            if (r0 == 0) goto Lc
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean a(android.content.Context r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r3 = l.q.a(r3)
            return r3
        Lb:
            r3 = 1
            return r3
    }

    public void b(androidx.appcompat.app.AppCompatActivity r3, int r4) {
            r2 = this;
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r1 = 0
            r0.a(r1)
            com.acse.ottn.i1$a r0 = new com.acse.ottn.i1$a
            r0.<init>(r2, r3, r4)
            r2.a(r3, r0)
            return
    }

    public final boolean b(android.content.Context r8) {
            r7 = this;
            boolean r0 = com.acse.ottn.r3.c()
            if (r0 == 0) goto Lb
            boolean r8 = r7.d(r8)
            return r8
        Lb:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L3a
            java.lang.Class<android.provider.Settings> r1 = android.provider.Settings.class
            java.lang.String r2 = "canDrawOverlays"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L30
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L30
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Exception -> L30
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L30
            r2[r6] = r8     // Catch: java.lang.Exception -> L30
            r8 = 0
            java.lang.Object r8 = r1.invoke(r8, r2)     // Catch: java.lang.Exception -> L30
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L30
            r0 = r8
            goto L3a
        L30:
            r8 = move-exception
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            java.lang.String r1 = "FloatWindowManager"
            com.acse.ottn.h2.b(r1, r8)
        L3a:
            boolean r8 = r0.booleanValue()
            return r8
    }

    public final void c(androidx.appcompat.app.AppCompatActivity r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L38
            boolean r0 = com.acse.ottn.r3.d()
            if (r0 == 0) goto L10
            r2.h(r3, r4)
            return
        L10:
            boolean r0 = com.acse.ottn.r3.c()
            if (r0 == 0) goto L1a
            r2.g(r3, r4)
            return
        L1a:
            boolean r0 = com.acse.ottn.r3.b()
            if (r0 == 0) goto L24
            r2.f(r3, r4)
            return
        L24:
            boolean r0 = com.acse.ottn.r3.a()
            if (r0 == 0) goto L2e
            r2.a(r3, r4)
            return
        L2e:
            boolean r0 = com.acse.ottn.r3.e()
            if (r0 == 0) goto L37
            r2.i(r3, r4)
        L37:
            return
        L38:
            r2.d(r3, r4)
            return
    }

    public final boolean c(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.acse.ottn.s1.a(r1)
            return r1
    }

    public final void d(androidx.appcompat.app.AppCompatActivity r3, int r4) {
            r2 = this;
            boolean r0 = com.acse.ottn.r3.c()
            if (r0 == 0) goto La
            r2.g(r3, r4)
            return
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L18
            com.acse.ottn.i1$g r0 = new com.acse.ottn.i1$g
            r0.<init>(r2, r3, r4)
            r2.a(r3, r0)
        L18:
            return
    }

    public final boolean d(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.acse.ottn.o2.a(r1)
            return r1
    }

    public final boolean e(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.acse.ottn.p2.a(r1)
            return r1
    }

    public final void f(androidx.appcompat.app.AppCompatActivity r2, int r3) {
            r1 = this;
            com.acse.ottn.i1$c r0 = new com.acse.ottn.i1$c
            r0.<init>(r1, r2, r3)
            r1.a(r2, r0)
            return
    }

    public final boolean f(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.acse.ottn.h3.a(r1)
            return r1
    }

    public final void g(androidx.appcompat.app.AppCompatActivity r2, int r3) {
            r1 = this;
            com.acse.ottn.i1$d r0 = new com.acse.ottn.i1$d
            r0.<init>(r1, r2, r3)
            r1.a(r2, r0)
            return
    }

    public final boolean g(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.acse.ottn.m3.a(r1)
            return r1
    }

    public final void h(androidx.appcompat.app.AppCompatActivity r2, int r3) {
            r1 = this;
            com.acse.ottn.i1$e r0 = new com.acse.ottn.i1$e
            r0.<init>(r1, r2, r3)
            r1.a(r2, r0)
            return
    }

    public final void i(androidx.appcompat.app.AppCompatActivity r2, int r3) {
            r1 = this;
            com.acse.ottn.i1$f r0 = new com.acse.ottn.i1$f
            r0.<init>(r1, r2, r3)
            r1.a(r2, r0)
            return
    }
}
