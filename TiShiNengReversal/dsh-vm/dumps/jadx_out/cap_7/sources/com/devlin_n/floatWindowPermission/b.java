package com.devlin_n.floatWindowPermission;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class b {
    private static final java.lang.String b = "FloatWindowManager";
    public static final int c = 1;
    private static volatile com.devlin_n.floatWindowPermission.b d;
    private android.app.Dialog a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.devlin_n.floatWindowPermission.b.h {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ com.devlin_n.floatWindowPermission.b b;

        a(com.devlin_n.floatWindowPermission.b r1, android.content.Context r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.devlin_n.floatWindowPermission.b.h
        public void a(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L7
                android.content.Context r1 = r0.a
                com.devlin_n.floatWindowPermission.f.a(r1)
            L7:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.devlin_n.floatWindowPermission.b$b, reason: collision with other inner class name */
    class C0135b implements com.devlin_n.floatWindowPermission.b.h {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ com.devlin_n.floatWindowPermission.b b;

        C0135b(com.devlin_n.floatWindowPermission.b r1, android.content.Context r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.devlin_n.floatWindowPermission.b.h
        public void a(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L7
                android.content.Context r1 = r0.a
                com.devlin_n.floatWindowPermission.c.a(r1)
            L7:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.devlin_n.floatWindowPermission.b.h {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ com.devlin_n.floatWindowPermission.b b;

        c(com.devlin_n.floatWindowPermission.b r1, android.content.Context r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.devlin_n.floatWindowPermission.b.h
        public void a(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L7
                android.content.Context r1 = r0.a
                com.devlin_n.floatWindowPermission.d.a(r1)
            L7:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.devlin_n.floatWindowPermission.b.h {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ com.devlin_n.floatWindowPermission.b b;

        d(com.devlin_n.floatWindowPermission.b r1, android.content.Context r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.devlin_n.floatWindowPermission.b.h
        public void a(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L7
                android.content.Context r1 = r0.a
                com.devlin_n.floatWindowPermission.e.a(r1)
            L7:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements com.devlin_n.floatWindowPermission.b.h {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ com.devlin_n.floatWindowPermission.b b;

        e(com.devlin_n.floatWindowPermission.b r1, android.content.Context r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.devlin_n.floatWindowPermission.b.h
        public void a(boolean r3) {
                r2 = this;
                if (r3 == 0) goto L45
                java.lang.Class<android.provider.Settings> r3 = android.provider.Settings.class
                java.lang.String r0 = "ACTION_MANAGE_OVERLAY_PERMISSION"
                java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch: java.lang.Exception -> L41
                android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L41
                r1 = 0
                java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L41
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L41
                r0.<init>(r3)     // Catch: java.lang.Exception -> L41
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L41
                r3.<init>()     // Catch: java.lang.Exception -> L41
                java.lang.String r1 = "package:"
                r3.append(r1)     // Catch: java.lang.Exception -> L41
                android.content.Context r1 = r2.a     // Catch: java.lang.Exception -> L41
                java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Exception -> L41
                r3.append(r1)     // Catch: java.lang.Exception -> L41
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L41
                android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L41
                r0.setData(r3)     // Catch: java.lang.Exception -> L41
                android.content.Context r3 = r2.a     // Catch: java.lang.Exception -> L41
                android.app.Activity r3 = com.devlin_n.floatWindowPermission.h.a(r3)     // Catch: java.lang.Exception -> L41
                r1 = 1
                r3.startActivityForResult(r0, r1)     // Catch: java.lang.Exception -> L41
                return
            L41:
                r3 = move-exception
                android.util.Log.getStackTraceString(r3)
            L45:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ com.devlin_n.floatWindowPermission.b.h a;
        final /* synthetic */ com.devlin_n.floatWindowPermission.b b;

        f(com.devlin_n.floatWindowPermission.b r1, com.devlin_n.floatWindowPermission.b.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                com.devlin_n.floatWindowPermission.b$h r3 = r1.a
                r0 = 0
                r3.a(r0)
                r2.dismiss()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ com.devlin_n.floatWindowPermission.b.h a;
        final /* synthetic */ com.devlin_n.floatWindowPermission.b b;

        g(com.devlin_n.floatWindowPermission.b r1, com.devlin_n.floatWindowPermission.b.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                com.devlin_n.floatWindowPermission.b$h r3 = r1.a
                r0 = 1
                r3.a(r0)
                r2.dismiss()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface h {
        void a(boolean r1);
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(android.content.Context r2) {
            r1 = this;
            com.devlin_n.floatWindowPermission.b$a r0 = new com.devlin_n.floatWindowPermission.b$a
            r0.<init>(r1, r2)
            r1.n(r2, r0)
            return
    }

    private void d(android.content.Context r3) {
            r2 = this;
            boolean r0 = com.devlin_n.floatWindowPermission.g.c()
            if (r0 == 0) goto La
            r2.j(r3)
            return
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L18
            com.devlin_n.floatWindowPermission.b$e r0 = new com.devlin_n.floatWindowPermission.b$e
            r0.<init>(r2, r3)
            r2.n(r3, r0)
        L18:
            return
    }

    private boolean e(android.content.Context r8) {
            r7 = this;
            boolean r0 = com.devlin_n.floatWindowPermission.g.c()
            if (r0 == 0) goto Lb
            boolean r8 = r7.i(r8)
            return r8
        Lb:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L34
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
            goto L34
        L30:
            r8 = move-exception
            android.util.Log.getStackTraceString(r8)
        L34:
            boolean r8 = r0.booleanValue()
            return r8
    }

    public static com.devlin_n.floatWindowPermission.b f() {
            com.devlin_n.floatWindowPermission.b r0 = com.devlin_n.floatWindowPermission.b.d
            if (r0 != 0) goto L19
            java.lang.Class<com.devlin_n.floatWindowPermission.b> r0 = com.devlin_n.floatWindowPermission.b.class
            monitor-enter(r0)
            com.devlin_n.floatWindowPermission.b r1 = com.devlin_n.floatWindowPermission.b.d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.devlin_n.floatWindowPermission.b r1 = new com.devlin_n.floatWindowPermission.b     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.devlin_n.floatWindowPermission.b.d = r1     // Catch: java.lang.Throwable -> L13
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
            com.devlin_n.floatWindowPermission.b r0 = com.devlin_n.floatWindowPermission.b.d
            return r0
    }

    private boolean g(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.devlin_n.floatWindowPermission.c.b(r1)
            return r1
    }

    private void h(android.content.Context r2) {
            r1 = this;
            com.devlin_n.floatWindowPermission.b$b r0 = new com.devlin_n.floatWindowPermission.b$b
            r0.<init>(r1, r2)
            r1.n(r2, r0)
            return
    }

    private boolean i(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.devlin_n.floatWindowPermission.d.b(r1)
            return r1
    }

    private void j(android.content.Context r2) {
            r1 = this;
            com.devlin_n.floatWindowPermission.b$c r0 = new com.devlin_n.floatWindowPermission.b$c
            r0.<init>(r1, r2)
            r1.n(r2, r0)
            return
    }

    private boolean k(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.devlin_n.floatWindowPermission.e.b(r1)
            return r1
    }

    private void l(android.content.Context r2) {
            r1 = this;
            com.devlin_n.floatWindowPermission.b$d r0 = new com.devlin_n.floatWindowPermission.b$d
            r0.<init>(r1, r2)
            r1.n(r2, r0)
            return
    }

    private boolean m(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.devlin_n.floatWindowPermission.f.b(r1)
            return r1
    }

    private void n(android.content.Context r2, com.devlin_n.floatWindowPermission.b.h r3) {
            r1 = this;
            java.lang.String r0 = "您的手机没有授予悬浮窗权限，开启后才能正常使用此功能"
            r1.o(r2, r0, r3)
            return
    }

    private void o(android.content.Context r2, java.lang.String r3, com.devlin_n.floatWindowPermission.b.h r4) {
            r1 = this;
            android.app.Dialog r0 = r1.a
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lf
            android.app.Dialog r0 = r1.a
            r0.dismiss()
        Lf:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r2)
            r2 = 1
            android.app.AlertDialog$Builder r2 = r0.setCancelable(r2)
            java.lang.String r0 = ""
            android.app.AlertDialog$Builder r2 = r2.setTitle(r0)
            android.app.AlertDialog$Builder r2 = r2.setMessage(r3)
            com.devlin_n.floatWindowPermission.b$g r3 = new com.devlin_n.floatWindowPermission.b$g
            r3.<init>(r1, r4)
            java.lang.String r0 = "现在去开启"
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r0, r3)
            com.devlin_n.floatWindowPermission.b$f r3 = new com.devlin_n.floatWindowPermission.b$f
            r3.<init>(r1, r4)
            java.lang.String r4 = "暂不开启"
            android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r4, r3)
            android.app.AlertDialog r2 = r2.create()
            r1.a = r2
            r2.show()
            return
    }

    public void b(android.content.Context r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L2d
            boolean r0 = com.devlin_n.floatWindowPermission.g.d()
            if (r0 == 0) goto L10
            r2.l(r3)
            goto L2d
        L10:
            boolean r0 = com.devlin_n.floatWindowPermission.g.c()
            if (r0 == 0) goto L1a
            r2.j(r3)
            goto L2d
        L1a:
            boolean r0 = com.devlin_n.floatWindowPermission.g.b()
            if (r0 == 0) goto L24
            r2.h(r3)
            goto L2d
        L24:
            boolean r0 = com.devlin_n.floatWindowPermission.g.a()
            if (r0 == 0) goto L2d
            r2.a(r3)
        L2d:
            r2.d(r3)
            return
    }

    public boolean c(android.content.Context r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L32
            boolean r0 = com.devlin_n.floatWindowPermission.g.d()
            if (r0 == 0) goto L11
            boolean r3 = r2.k(r3)
            return r3
        L11:
            boolean r0 = com.devlin_n.floatWindowPermission.g.c()
            if (r0 == 0) goto L1c
            boolean r3 = r2.i(r3)
            return r3
        L1c:
            boolean r0 = com.devlin_n.floatWindowPermission.g.b()
            if (r0 == 0) goto L27
            boolean r3 = r2.g(r3)
            return r3
        L27:
            boolean r0 = com.devlin_n.floatWindowPermission.g.a()
            if (r0 == 0) goto L32
            boolean r3 = r2.m(r3)
            return r3
        L32:
            boolean r3 = r2.e(r3)
            return r3
    }
}
