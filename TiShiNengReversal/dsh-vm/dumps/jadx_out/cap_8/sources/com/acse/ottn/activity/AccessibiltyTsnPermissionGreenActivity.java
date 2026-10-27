package com.acse.ottn.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AccessibiltyTsnPermissionGreenActivity extends com.acse.ottn.a0 {
    public android.widget.RelativeLayout A;
    public android.widget.RelativeLayout B;
    public android.widget.RelativeLayout C;
    public android.widget.RelativeLayout D;
    public com.acse.ottn.adapter.AutoScrollViewPager E;
    public int F;
    public android.widget.TextView G;
    public android.widget.RelativeLayout H;
    public java.lang.String I;
    public com.acse.ottn.e0.b J;
    public long K;
    public android.os.Handler L;
    public java.lang.Runnable M;
    public java.lang.Runnable N;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f2081e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f2082f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f2083g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f2084h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f2085i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f2086j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f2087k;
    public android.widget.ImageView l;
    public android.widget.ImageView m;
    public android.widget.TextView n;
    public androidx.appcompat.app.AlertDialog o;
    public androidx.appcompat.widget.AppCompatCheckBox p;
    public android.widget.TextView q;
    public android.widget.TextView r;
    public android.widget.TextView s;
    public android.widget.TextView t;
    public android.widget.TextView u;
    public android.widget.TextView v;
    public android.widget.TextView w;
    public android.widget.TextView x;
    public android.widget.TextView y;
    public android.widget.TextView z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public a(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r2.a
                java.lang.Class<com.acse.ottn.activity.SeedWebViewActivity> r1 = com.acse.ottn.activity.SeedWebViewActivity.class
                r3.<init>(r0, r1)
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r2.a
                java.lang.String r0 = r0.c(r1)
                java.lang.String r1 = "url"
                r3.putExtra(r1, r0)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r2.a
                r0.startActivity(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.e0.b<java.lang.Integer> {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public b(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @androidx.annotation.RequiresApi(api = 23)
        /* renamed from: a, reason: avoid collision after fix types in other method */
        public void a2(int r1, java.lang.Integer r2) {
                r0 = this;
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r0.a
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.b(r1)
                return
        }

        @Override // com.acse.ottn.e0.b
        @androidx.annotation.RequiresApi(api = 23)
        public /* bridge */ /* synthetic */ void a(int r1, java.lang.Integer r2) {
                r0 = this;
                java.lang.Integer r2 = (java.lang.Integer) r2
                r0.a2(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements com.acse.ottn.z0.c {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public c(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.z0.c
        public void a() {
                r2 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "refuse_vivo_buttery_manage"
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.z0.c
        public void b() {
                r4 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "allow_vivo_buttery_manage"
                r0.a(r1)
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.String r1 = "battery_hignt_size"
                java.lang.String r2 = "0"
                java.lang.String r0 = r0.a(r1, r2)
                boolean r2 = r0.equals(r2)
                java.lang.String r3 = "1"
                if (r2 == 0) goto L25
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                r0.b(r1, r3)
                goto L34
            L25:
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L34
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.String r2 = "2"
                r0.b(r1, r2)
            L34:
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r4.a
                com.acse.ottn.z4.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public d(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        @androidx.annotation.RequiresApi(api = 23)
        public void run() {
                r1 = this;
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r1.a
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public e(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        @androidx.annotation.RequiresApi(api = 23)
        public void run() {
                r3 = this;
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r3.a
                android.content.res.Resources r1 = r0.getResources()
                int r2 = com.acse.ottn.R.string.dialog_vivo_battery_message
                java.lang.String r1 = r1.getString(r2)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements com.acse.ottn.z0.c {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public f(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.z0.c
        public void a() {
                r2 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "refuse_service_permission"
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.z0.c
        public void b() {
                r3 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "allow_service_permission"
                r0.a(r1)
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.String r1 = "OpenPermissionName"
                java.lang.String r2 = "应用启动管理"
                r0.b(r1, r2)
                com.acse.ottn.b5 r0 = com.acse.ottn.b5.a()
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r3.a
                java.lang.String r2 = r1.getPackageName()
                r0.a(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class g implements com.acse.ottn.z0.c {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public g(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.z0.c
        public void a() {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.z0.c
        public void b() {
                r2 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "all_permission_open"
                r0.a(r1)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r2.a
                r1 = -1
                r0.setResult(r1)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r2.a
                r0.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class h implements com.acse.ottn.c.d {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public h(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.c.d
        public void onDismiss() {
                r2 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "refuse_continue_open_permission"
                r0.a(r1)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r2.a
                r0.finish()
                return
        }

        @Override // com.acse.ottn.c.d
        public void onOpen() {
                r2 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "continue_open_permission"
                r0.a(r1)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r2.a
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class i implements com.acse.ottn.z0.c {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public i(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.z0.c
        public void a() {
                r2 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "cancle_flow_window_list"
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.z0.c
        public void b() {
                r3 = this;
                com.acse.ottn.i1 r0 = com.acse.ottn.i1.b()
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r3.a
                r2 = 10011(0x271b, float:1.4028E-41)
                r0.a(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class j implements com.acse.ottn.f4.h {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public j(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.f4.h
        public void onDismiss() {
                r2 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "refuse_service"
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.f4.h
        public void onOpen() {
                r3 = this;
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                java.lang.String r2 = "is_agree_service"
                r0.a(r2, r1)
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "allow_service"
                r0.a(r1)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r3.a
                androidx.appcompat.widget.AppCompatCheckBox r0 = com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.a(r0)
                r1 = 1
                r0.setChecked(r1)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r3.a
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class k implements android.widget.CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public k(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto L1d
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r2 = r1.a
                androidx.appcompat.widget.AppCompatCheckBox r2 = com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.a(r2)
                com.acse.ottn.h0 r3 = com.acse.ottn.h0.a()
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r1.a
                java.lang.String r3 = r3.f(r0)
                int r3 = android.graphics.Color.parseColor(r3)
                android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
                r2.setSupportButtonTintList(r3)
            L1d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class l implements com.acse.ottn.z0.c {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public l(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.z0.c
        public void a() {
                r2 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "refuse_minu_service_run"
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.z0.c
        public void b() {
                r2 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "allow_minu_service_run"
                r0.a(r1)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r2.a
                com.acse.ottn.p2.c(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class m implements com.acse.ottn.z0.c {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity f2088b;

        public m(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1, java.lang.String r2) {
                r0 = this;
                r0.f2088b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.z0.c
        public void a() {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.z0.c
        public void b() {
                r4 = this;
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.String r1 = "location_permission_size"
                int r0 = r0.c(r1)
                if (r0 != 0) goto L64
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                r2 = 1
                r0.a(r1, r2)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r4.f2088b
                java.lang.String r0 = com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.d(r0)
                java.lang.String r1 = "honor"
                boolean r0 = r1.equals(r0)
                java.lang.String r1 = "battery_white"
                if (r0 == 0) goto L51
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 36
                if (r0 < r2) goto L51
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r0.a(r1, r2)
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.String r1 = "OpenPermissionName"
                java.lang.String r3 = "权限管理"
                r0.b(r1, r3)
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.String r1 = "location_permission"
                r0.a(r1, r2)
                com.acse.ottn.g2 r0 = com.acse.ottn.g2.a()
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r4.f2088b
                r0.d(r1)
                return
            L51:
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r0.a(r1, r2)
                com.acse.ottn.g2 r0 = com.acse.ottn.g2.a()
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r4.f2088b
                r0.f(r1)
                return
            L64:
                java.lang.String r0 = r4.a
                java.lang.String r2 = "1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L80
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                r2 = 2
                r0.a(r1, r2)
                com.acse.ottn.g2 r0 = com.acse.ottn.g2.a()
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r4.f2088b
                r0.c(r1)
                return
            L80:
                java.lang.String r0 = r4.a
                java.lang.String r2 = "2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Lb4
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r4.f2088b
                java.lang.String r0 = com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.d(r0)
                java.lang.String r2 = "samsung"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto La3
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                java.lang.String r3 = "battery_white_samsung"
                r0.a(r3, r2)
            La3:
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                r2 = 3
                r0.a(r1, r2)
                com.acse.ottn.g2 r0 = com.acse.ottn.g2.a()
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r4.f2088b
                r0.b(r1)
            Lb4:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class n implements com.acse.ottn.z0.c {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public n(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.z0.c
        public void a() {
                r2 = this;
                com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()
                java.lang.String r1 = "refuse_service_permission"
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.z0.c
        public void b() {
                r3 = this;
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                java.lang.String r2 = "oppo_35_autostart"
                r0.a(r2, r1)
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.String r2 = "battery_white"
                r0.a(r2, r1)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.settings.SETTINGS"
                r0.<init>(r1)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r3.a
                r1.startActivity(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class o implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public o(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r0.a
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.b(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class p implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public p(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r0.a
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.b(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class q implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public q(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r0.a
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.b(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class r implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public r(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r0.a
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.b(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class s implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public s(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r0.a
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.b(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class t implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public t(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        @androidx.annotation.RequiresApi(api = 23)
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r0.a
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.b(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class u implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public u(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r0.a
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.c(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class v implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity a;

        public v(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r2.a
                java.lang.Class<com.acse.ottn.activity.SeedWebViewActivity> r1 = com.acse.ottn.activity.SeedWebViewActivity.class
                r3.<init>(r0, r1)
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r1 = r2.a
                java.lang.String r0 = r0.e(r1)
                java.lang.String r1 = "url"
                r3.putExtra(r1, r0)
                com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0 = r2.a
                r0.startActivity(r3)
                return
        }
    }

    static {
            r0 = 9560(0x2558, float:1.3396E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public AccessibiltyTsnPermissionGreenActivity() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.F = r0
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$b r0 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$b
            r0.<init>(r2)
            r2.J = r0
            r0 = 0
            r2.K = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.L = r0
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$d r0 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$d
            r0.<init>(r2)
            r2.M = r0
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$e r0 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$e
            r0.<init>(r2)
            r2.N = r0
            return
    }

    public static /* synthetic */ androidx.appcompat.widget.AppCompatCheckBox a(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0) {
            androidx.appcompat.widget.AppCompatCheckBox r0 = r0.p
            return r0
    }

    public static void a(android.app.Activity r0, android.app.Dialog r1) {
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Exception -> L11
            if (r0 != 0) goto L11
            if (r1 == 0) goto L11
            boolean r0 = r1.isShowing()     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L11
            r1.dismiss()     // Catch: java.lang.Exception -> L11
        L11:
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0, java.lang.String r1) {
            r0.c(r1)
            return
    }

    public static /* synthetic */ void b(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0) {
            r0.l()
            return
    }

    public static /* synthetic */ void c(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0) {
            r0.f()
            return
    }

    public static /* synthetic */ java.lang.String d(com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity r0) {
            java.lang.String r0 = r0.I
            return r0
    }

    @Override // com.acse.ottn.a0
    public void a(int r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            r1 = 0
            r2.a(r2, r3, r1)
            r3 = 2048(0x800, float:2.87E-42)
            r0.addFlags(r3)
            r3 = 1024(0x400, float:1.435E-42)
            r0.clearFlags(r3)
            android.view.View r3 = r0.getDecorView()
            r0 = 1280(0x500, float:1.794E-42)
            r3.setSystemUiVisibility(r0)
            return
    }

    public final void a(androidx.appcompat.app.AppCompatActivity r1, java.lang.String r2, int r3) {
            r0 = this;
            com.acse.ottn.a r2 = com.acse.ottn.a.c()
            r2.a(r1, r3)
            return
    }

    public final void a(java.lang.String r8) {
            r7 = this;
            android.content.res.Resources r8 = r7.getResources()
            int r0 = com.acse.ottn.R.string.dialog_keep_back_title
            java.lang.String r2 = r8.getString(r0)
            androidx.appcompat.app.AlertDialog r8 = r7.o
            a(r7, r8)
            android.content.res.Resources r8 = r7.getResources()
            int r0 = com.acse.ottn.R.string.dialog_keep_back_message
            java.lang.String r3 = r8.getString(r0)
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$l r6 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$l
            r6.<init>(r7)
            java.lang.String r4 = "好的"
            r5 = 0
            r1 = r7
            androidx.appcompat.app.AlertDialog r8 = com.acse.ottn.z0.a(r1, r2, r3, r4, r5, r6)
            r1.o = r8
            return
    }

    public final void a(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r7 < r0) goto La
            java.lang.String r7 = "允许后台运行:"
        L8:
            r1 = r7
            goto Ld
        La:
            java.lang.String r7 = "允许后台运行和自启动权限:"
            goto L8
        Ld:
            androidx.appcompat.app.AlertDialog r7 = r6.o
            a(r6, r7)
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$f r5 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$f
            r5.<init>(r6)
            java.lang.String r3 = "好的"
            r4 = 0
            r0 = r6
            r2 = r8
            androidx.appcompat.app.AlertDialog r7 = com.acse.ottn.z0.a(r0, r1, r2, r3, r4, r5)
            r0.o = r7
            return
    }

    public final void a(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            androidx.appcompat.app.AlertDialog r0 = r7.o
            a(r7, r0)
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$m r6 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$m
            r6.<init>(r7, r10)
            java.lang.String r4 = "好的"
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            androidx.appcompat.app.AlertDialog r8 = com.acse.ottn.z0.a(r1, r2, r3, r4, r5, r6)
            r1.o = r8
            return
    }

    public final void b(java.lang.String r9) {
            r8 = this;
            com.acse.ottn.b r9 = com.acse.ottn.b.c()
            r0 = 0
            r9.a(r0)
            androidx.appcompat.app.AlertDialog r9 = r8.o
            a(r8, r9)
            int r9 = com.acse.ottn.R.string.dialog_flow_message
            android.content.res.Resources r0 = r8.getResources()
            int r1 = com.acse.ottn.R.string.dialog_flow_title
            java.lang.String r3 = r0.getString(r1)
            android.content.res.Resources r0 = r8.getResources()
            java.lang.String r4 = r0.getString(r9)
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$i r7 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$i
            r7.<init>(r8)
            java.lang.String r5 = "好的"
            r6 = 0
            r2 = r8
            androidx.appcompat.app.AlertDialog r9 = com.acse.ottn.z0.a(r2, r3, r4, r5, r6, r7)
            r2.o = r9
            return
    }

    public final void c() {
            r0 = this;
            r0.d()
            return
    }

    public final void c(java.lang.String r8) {
            r7 = this;
            androidx.appcompat.app.AlertDialog r0 = r7.o
            a(r7, r0)
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$n r6 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$n
            r6.<init>(r7)
            java.lang.String r4 = "好的"
            r5 = 0
            java.lang.String r2 = "允许自启动权限:"
            r1 = r7
            r3 = r8
            androidx.appcompat.app.AlertDialog r8 = com.acse.ottn.z0.a(r1, r2, r3, r4, r5, r6)
            r1.o = r8
            return
    }

    public final void d() {
            r7 = this;
            androidx.appcompat.app.AlertDialog r0 = r7.o
            a(r7, r0)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "location_permission_size"
            int r0 = r0.c(r1)
            com.acse.ottn.b5 r1 = com.acse.ottn.b5.a()
            java.lang.String r2 = r7.getPackageName()
            boolean r1 = r1.b(r2)
            if (r1 != 0) goto L2f
            java.lang.String r0 = r7.getPackageName()
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.acse.ottn.R.string.dialog_keep_back_two_title
            java.lang.String r1 = r1.getString(r2)
            r7.a(r0, r1)
            return
        L2f:
            java.lang.String r1 = r7.I
            java.lang.String r2 = "vivo"
            boolean r1 = r1.equals(r2)
            java.lang.String r2 = "2"
            r3 = 2
            r4 = 1
            java.lang.String r5 = "1"
            if (r1 == 0) goto L99
            com.acse.ottn.b5 r1 = com.acse.ottn.b5.a()
            boolean r1 = r1.b()
            if (r1 != 0) goto L51
            java.lang.String r0 = r7.getPackageName()
            r7.d(r0)
            return
        L51:
            com.acse.ottn.g2 r1 = com.acse.ottn.g2.a()
            boolean r1 = r1.a(r7)
            if (r1 != 0) goto L75
            if (r0 > r4) goto L75
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.acse.ottn.R.string.location_title
            java.lang.String r0 = r0.getString(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.acse.ottn.R.string.location_content
            java.lang.String r1 = r1.getString(r2)
            r7.a(r0, r1, r5)
            return
        L75:
            com.acse.ottn.g2 r1 = com.acse.ottn.g2.a()
            boolean r1 = r1.b(r7)
            if (r1 != 0) goto L12b
            if (r0 > r3) goto L12b
            int r0 = com.acse.ottn.R.string.location_background_content
            android.content.res.Resources r1 = r7.getResources()
            int r3 = com.acse.ottn.R.string.location_background_title
            java.lang.String r1 = r1.getString(r3)
            android.content.res.Resources r3 = r7.getResources()
            java.lang.String r0 = r3.getString(r0)
            r7.a(r1, r0, r2)
            return
        L99:
            java.lang.String r1 = r7.I
            java.lang.String r6 = "oneplus"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto Lb7
            java.lang.String r1 = r7.I
            java.lang.String r6 = "oppo"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto Lb7
            java.lang.String r1 = r7.I
            java.lang.String r6 = "realme"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto Le3
        Lb7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 35
            if (r1 < r6) goto Le3
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r6 = "oppo_35_autostart"
            boolean r1 = r1.a(r6)
            if (r1 != 0) goto Le3
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r6 = "auto_start"
            java.lang.String r1 = r1.e(r6)
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto Le3
            android.os.Handler r0 = r7.L
            java.lang.Runnable r1 = r7.N
            r2 = 100
            r0.postDelayed(r1, r2)
            return
        Le3:
            com.acse.ottn.g2 r1 = com.acse.ottn.g2.a()
            boolean r1 = r1.a(r7)
            if (r1 != 0) goto L107
            if (r0 > r4) goto L107
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.acse.ottn.R.string.location_title
            java.lang.String r0 = r0.getString(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.acse.ottn.R.string.location_content
            java.lang.String r1 = r1.getString(r2)
            r7.a(r0, r1, r5)
            return
        L107:
            com.acse.ottn.g2 r1 = com.acse.ottn.g2.a()
            boolean r1 = r1.b(r7)
            if (r1 != 0) goto L12b
            if (r0 > r3) goto L12b
            int r0 = com.acse.ottn.R.string.location_background_content
            android.content.res.Resources r1 = r7.getResources()
            int r3 = com.acse.ottn.R.string.location_background_title
            java.lang.String r1 = r1.getString(r3)
            android.content.res.Resources r3 = r7.getResources()
            java.lang.String r0 = r3.getString(r0)
            r7.a(r1, r0, r2)
            return
        L12b:
            r7.k()
            return
    }

    public final void d(java.lang.String r8) {
            r7 = this;
            androidx.appcompat.app.AlertDialog r8 = r7.o
            a(r7, r8)
            android.content.res.Resources r8 = r7.getResources()
            int r0 = com.acse.ottn.R.string.dialog_vivo_battery_message
            java.lang.String r3 = r8.getString(r0)
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$c r6 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$c
            r6.<init>(r7)
            java.lang.String r4 = "好的"
            r5 = 0
            java.lang.String r2 = "耗电管理:"
            r1 = r7
            androidx.appcompat.app.AlertDialog r8 = com.acse.ottn.z0.a(r1, r2, r3, r4, r5, r6)
            r1.o = r8
            return
    }

    public final void e() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.K
            long r0 = r0 - r2
            r2 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1e
            java.lang.String r0 = "再按返回键一次退出"
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r1)
            r0.show()
            long r0 = java.lang.System.currentTimeMillis()
            r5.K = r0
            return
        L1e:
            r5.finish()
            return
    }

    public final void f() {
            r2 = this;
            androidx.appcompat.app.AlertDialog r0 = r2.o
            a(r2, r0)
            int r0 = com.acse.ottn.R.string.permission_warning
            android.content.res.Resources r1 = r2.getResources()
            java.lang.String r0 = r1.getString(r0)
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$h r1 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$h
            r1.<init>(r2)
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.c.a(r2, r0, r1)
            r2.o = r0
            return
    }

    @androidx.annotation.RequiresApi(api = 23)
    @android.annotation.SuppressLint({"RestrictedApi"})
    public final void g() {
            r6 = this;
            int r0 = com.acse.ottn.R.id.banner
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f2081e = r0
            int r0 = com.acse.ottn.R.id.tv_first_line
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.t = r0
            int r0 = com.acse.ottn.R.id.tv_secend_line
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.u = r0
            int r0 = com.acse.ottn.R.id.checkbox
            android.view.View r0 = r6.findViewById(r0)
            androidx.appcompat.widget.AppCompatCheckBox r0 = (androidx.appcompat.widget.AppCompatCheckBox) r0
            r6.p = r0
            com.acse.ottn.h0 r1 = com.acse.ottn.h0.a()
            java.lang.String r1 = r1.f(r6)
            int r1 = android.graphics.Color.parseColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setSupportButtonTintList(r1)
            androidx.appcompat.widget.AppCompatCheckBox r0 = r6.p
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$k r1 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$k
            r1.<init>(r6)
            r0.setOnCheckedChangeListener(r1)
            int r0 = com.acse.ottn.R.id.banner1
            android.view.View r0 = r6.findViewById(r0)
            com.acse.ottn.adapter.AutoScrollViewPager r0 = (com.acse.ottn.adapter.AutoScrollViewPager) r0
            r6.E = r0
            int r0 = com.acse.ottn.R.id.rl_accessiblity
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r6.A = r0
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$o r1 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$o
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.rl_location
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r6.C = r0
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$p r1 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$p
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r6.f2081e
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$q r1 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$q
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.rl_flow_window
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r6.B = r0
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$r r1 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$r
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.rl_battery
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r6.D = r0
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$s r1 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$s
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.iv_accessiblity_two
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f2082f = r0
            int r0 = com.acse.ottn.R.id.iv_flow_window_two
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f2083g = r0
            int r0 = com.acse.ottn.R.id.iv_battery_two
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f2084h = r0
            int r0 = com.acse.ottn.R.id.iv_accessiblity
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f2085i = r0
            int r0 = com.acse.ottn.R.id.iv_location
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f2087k = r0
            int r0 = com.acse.ottn.R.id.iv_location_two
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.l = r0
            int r0 = com.acse.ottn.R.id.iv_flow_window
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f2086j = r0
            int r0 = com.acse.ottn.R.id.iv_battery
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.m = r0
            int r0 = com.acse.ottn.R.id.rl_service
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r6.H = r0
            int r0 = com.acse.ottn.R.id.tv_location_describe
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.z = r0
            int r0 = com.acse.ottn.R.id.tv_accessiblity_describe
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.q = r0
            int r0 = com.acse.ottn.R.id.tv_flow_describe
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.r = r0
            int r0 = com.acse.ottn.R.id.tv_content
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.n = r0
            int r0 = com.acse.ottn.R.id.tv_warning
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.G = r0
            int r0 = com.acse.ottn.R.id.linearLayout_1
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.acse.ottn.h0 r1 = com.acse.ottn.h0.a()
            r1.a(r6, r0)
            int r0 = com.acse.ottn.R.id.step_one
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = com.acse.ottn.R.id.step_two
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = com.acse.ottn.R.id.step_three
            android.view.View r2 = r6.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r3 = com.acse.ottn.R.id.step_four
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.h0 r4 = com.acse.ottn.h0.a()
            android.widget.TextView r5 = r6.q
            r4.a(r6, r0, r5)
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            android.widget.TextView r4 = r6.r
            r0.a(r6, r1, r4)
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            android.widget.TextView r1 = r6.n
            r0.a(r6, r2, r1)
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            android.widget.TextView r1 = r6.z
            r0.a(r6, r3, r1)
            int r0 = com.acse.ottn.R.id.av_back
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.rl_context
            android.view.View r1 = r6.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            com.acse.ottn.h0 r2 = com.acse.ottn.h0.a()
            r2.b(r6, r0)
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            r0.b(r6, r1)
            r6.j()
            android.widget.ImageView r0 = r6.f2081e
            int r1 = com.acse.ottn.R.mipmap.banner_6
            r0.setImageResource(r1)
            int r0 = com.acse.ottn.R.id.tv_open
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.s = r0
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$t r1 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$t
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.tv_my_think
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.y = r0
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            android.widget.TextView r1 = r6.y
            r2 = 0
            r0.a(r6, r2, r1)
            android.widget.TextView r0 = r6.y
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$u r1 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$u
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.tv_service
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.w = r0
            int r0 = com.acse.ottn.R.id.tv_privacy
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.v = r0
            r6.i()
            return
    }

    public final boolean h() {
            r5 = this;
            com.acse.ottn.g3 r0 = com.acse.ottn.g3.a()
            boolean r0 = r0.d()
            r1 = 1
            if (r0 == 0) goto L64
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            boolean r0 = r0.e()
            r2 = 0
            if (r0 == 0) goto L2e
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            boolean r0 = r0.a()
            if (r0 == 0) goto L2e
            com.acse.ottn.b5 r0 = com.acse.ottn.b5.a()
            java.lang.String r3 = com.acse.ottn.l0.w
            boolean r0 = r0.b(r3)
            if (r0 == 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            java.lang.String r3 = r5.I
            java.lang.String r4 = "oneplus"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L4d
            java.lang.String r3 = r5.I
            java.lang.String r4 = "oppo"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L4d
            java.lang.String r3 = r5.I
            java.lang.String r4 = "realme"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L63
        L4d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L63
            if (r0 == 0) goto L62
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r3 = "oppo_35_autostart"
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L62
            return r1
        L62:
            return r2
        L63:
            return r0
        L64:
            return r1
    }

    public final void i() {
            r10 = this;
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            android.widget.TextView r1 = r10.t
            r0.d(r10, r1)
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            android.widget.TextView r1 = r10.w
            r0.d(r10, r1)
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            android.widget.TextView r1 = r10.v
            r0.d(r10, r1)
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            android.widget.TextView r1 = r10.s
            r0.b(r10, r1)
            android.widget.TextView r0 = r10.s
            int r1 = com.acse.ottn.R.string.permission_commit
            r0.setText(r1)
            android.widget.TextView r0 = r10.t
            int r1 = com.acse.ottn.R.string.permission_title
            r0.setText(r1)
            android.widget.TextView r0 = r10.u
            int r1 = com.acse.ottn.R.string.permission_title_two
            r0.setText(r1)
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            android.widget.TextView r1 = r10.u
            r2 = 0
            r0.a(r10, r1, r2)
            android.widget.TextView r0 = r10.q
            int r1 = com.acse.ottn.R.string.permission_accessiblity
            r0.setText(r1)
            android.widget.TextView r0 = r10.r
            int r1 = com.acse.ottn.R.string.permission_flowwindow
            r0.setText(r1)
            android.widget.TextView r0 = r10.n
            int r1 = com.acse.ottn.R.string.permission_home_back
            r0.setText(r1)
            android.widget.TextView r0 = r10.w
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$v r1 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$v
            r1.<init>(r10)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r10.v
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$a r1 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$a
            r1.<init>(r10)
            r0.setOnClickListener(r1)
            com.acse.ottn.h0 r2 = com.acse.ottn.h0.a()
            android.widget.ImageView r4 = r10.f2085i
            android.widget.ImageView r5 = r10.f2087k
            android.widget.ImageView r6 = r10.f2086j
            android.widget.ImageView r7 = r10.m
            com.acse.ottn.adapter.AutoScrollViewPager r8 = r10.E
            android.widget.ImageView r9 = r10.f2081e
            r3 = r10
            r2.a(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public final void j() {
            r11 = this;
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            android.widget.ImageView r2 = r11.f2082f
            android.widget.ImageView r3 = r11.l
            android.widget.ImageView r4 = r11.f2083g
            android.widget.ImageView r5 = r11.f2084h
            android.widget.RelativeLayout r6 = r11.A
            android.widget.RelativeLayout r7 = r11.C
            android.widget.RelativeLayout r8 = r11.B
            android.widget.RelativeLayout r9 = r11.D
            android.widget.TextView r10 = r11.z
            r1 = r11
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public final void k() {
            r7 = this;
            int r0 = com.acse.ottn.R.string.permission_all_open
            java.lang.String r3 = r7.getString(r0)
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$g r6 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$g
            r6.<init>(r7)
            java.lang.String r4 = "好的"
            r5 = 0
            r2 = 0
            r1 = r7
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.z0.a(r1, r2, r3, r4, r5, r6)
            r1.o = r0
            return
    }

    public final void l() {
            r4 = this;
            boolean r0 = r4.h()
            if (r0 == 0) goto La
            r4.c()
            return
        La:
            androidx.appcompat.widget.AppCompatCheckBox r0 = r4.p
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L16
            r4.m()
            return
        L16:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            boolean r0 = r0.e()
            if (r0 != 0) goto L32
            com.acse.ottn.a r0 = com.acse.ottn.a.c()
            int r1 = r4.F
            r2 = 10010(0x271a, float:1.4027E-41)
            r0.b(r4, r2, r1)
            int r0 = r4.F
            int r0 = r0 + 1
            r4.F = r0
            return
        L32:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "oppo_start_white_list"
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L5d
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.a(r1, r2)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "pay_secure"
            r0.a(r2, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.SETTINGS"
            r0.<init>(r1)
            r4.startActivity(r0)
            return
        L5d:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            boolean r0 = r0.a()
            if (r0 != 0) goto L6d
            java.lang.String r0 = com.acse.ottn.l0.w
            r4.b(r0)
            return
        L6d:
            java.lang.String r0 = r4.I
            java.lang.String r1 = "xiaomi"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L81
            java.lang.String r0 = r4.I
            java.lang.String r1 = "redmi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La5
        L81:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "background_battery_hignt"
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto La5
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "flow_window_state"
            java.lang.String r0 = r0.e(r1)
            java.lang.String r1 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La5
            java.lang.String r0 = com.acse.ottn.l0.w
            r4.a(r0)
            return
        La5:
            com.acse.ottn.b5 r0 = com.acse.ottn.b5.a()
            java.lang.String r1 = r4.getPackageName()
            boolean r0 = r0.b(r1)
            java.lang.String r1 = "vivo"
            if (r0 != 0) goto Ld9
            android.content.res.Resources r0 = r4.getResources()
            int r2 = com.acse.ottn.R.string.dialog_keep_back_two_title
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r2 = r4.I
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Ld1
            android.content.res.Resources r0 = r4.getResources()
            int r1 = com.acse.ottn.R.string.dialog_keep_back_message
            java.lang.String r0 = r0.getString(r1)
        Ld1:
            java.lang.String r1 = r4.getPackageName()
            r4.a(r1, r0)
            return
        Ld9:
            java.lang.String r0 = r4.I
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf7
            com.acse.ottn.b5 r0 = com.acse.ottn.b5.a()
            boolean r0 = r0.b()
            if (r0 != 0) goto Lf3
            java.lang.String r0 = r4.getPackageName()
            r4.d(r0)
            return
        Lf3:
            r4.c()
            return
        Lf7:
            java.lang.String r0 = r4.I
            java.lang.String r1 = "oneplus"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L115
            java.lang.String r0 = r4.I
            java.lang.String r1 = "oppo"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L115
            java.lang.String r0 = r4.I
            java.lang.String r1 = "realme"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L147
        L115:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L147
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "oppo_35_autostart"
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L143
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "auto_start"
            java.lang.String r0 = r0.e(r1)
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L143
            android.os.Handler r0 = r4.L
            java.lang.Runnable r1 = r4.N
            r2 = 100
            r0.postDelayed(r1, r2)
            return
        L143:
            r4.c()
            return
        L147:
            r4.c()
            return
    }

    public final void m() {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.o
            a(r1, r0)
            com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$j r0 = new com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity$j
            r0.<init>(r1)
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.f4.a(r1, r0)
            r1.o = r0
            return
    }

    @Override // com.acse.ottn.a0
    public void onBackPressed() {
            r0 = this;
            r0.e()
            return
    }

    @Override // com.acse.ottn.a0
    @androidx.annotation.RequiresApi(api = 23)
    public native void onCreate(android.os.Bundle r1);

    @Override // com.acse.ottn.a0
    public void onDestroy() {
            r2 = this;
            androidx.appcompat.app.AlertDialog r0 = r2.o
            a(r2, r0)
            java.lang.String r0 = "AccessibiltyTsnPermissionGreenActivity"
            java.lang.String r1 = "onDestroy"
            com.acse.ottn.h2.a(r0, r1)
            super.onDestroy()
            return
    }

    @Override // com.acse.ottn.a0
    public void onPause() {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.o
            a(r1, r0)
            super.onPause()
            return
    }

    @Override // com.acse.ottn.a0
    public void onResume() {
            r6 = this;
            java.lang.String r0 = "send_open_flow_window"
            super.onResume()
            com.acse.ottn.q2 r1 = com.acse.ottn.q2.b()
            java.lang.String r2 = "open_accessiblity_page_pv"
            r1.a(r2)
            r6.j()     // Catch: java.lang.Exception -> L3a
            com.acse.ottn.b r1 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L3a
            boolean r1 = r1.a()     // Catch: java.lang.Exception -> L3a
            com.acse.ottn.b r2 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L3a
            boolean r2 = r2.e()     // Catch: java.lang.Exception -> L3a
            if (r2 == 0) goto L3c
            androidx.appcompat.widget.AppCompatCheckBox r2 = r6.p     // Catch: java.lang.Exception -> L3a
            boolean r2 = r2.isChecked()     // Catch: java.lang.Exception -> L3a
            if (r2 == 0) goto L3c
            androidx.appcompat.app.AlertDialog r2 = r6.o     // Catch: java.lang.Exception -> L3a
            a(r6, r2)     // Catch: java.lang.Exception -> L3a
            android.os.Handler r2 = r6.L     // Catch: java.lang.Exception -> L3a
            java.lang.Runnable r3 = r6.M     // Catch: java.lang.Exception -> L3a
            r4 = 500(0x1f4, double:2.47E-321)
            r2.postDelayed(r3, r4)     // Catch: java.lang.Exception -> L3a
            goto L3c
        L3a:
            r0 = move-exception
            goto L65
        L3c:
            com.acse.ottn.s0 r2 = com.acse.ottn.s0.d()     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> L3a
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = r3.e(r0)     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L64
            boolean r1 = r2.equals(r3)     // Catch: java.lang.Exception -> L3a
            if (r1 != 0) goto L64
            com.acse.ottn.q2 r1 = com.acse.ottn.q2.b()     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = "open_flow_window"
            r1.a(r3)     // Catch: java.lang.Exception -> L3a
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L3a
            r1.b(r0, r2)     // Catch: java.lang.Exception -> L3a
        L64:
            return
        L65:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception e ="
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "samon"
            com.acse.ottn.h2.a(r1, r0)
            return
    }
}
