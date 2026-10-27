package com.acse.ottn.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TransparentService extends android.app.Service {

    /* renamed from: f, reason: collision with root package name */
    public static android.view.View f2683f = null;

    /* renamed from: g, reason: collision with root package name */
    public static android.view.WindowManager f2684g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f2685h = "MainService";
    public android.view.WindowManager.LayoutParams a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.RelativeLayout f2686b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f2687c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f2688d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f2689e;

    static {
            r0 = 10053(0x2745, float:1.4087E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public TransparentService() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final void a() {
            r3 = this;
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r3.a = r0
            android.app.Application r0 = r3.getApplication()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            com.acse.ottn.service.TransparentService.f2684g = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L22
            android.view.WindowManager$LayoutParams r0 = r3.a
            r1 = 2038(0x7f6, float:2.856E-42)
            r0.type = r1
            goto L28
        L22:
            android.view.WindowManager$LayoutParams r0 = r3.a
            r1 = 2002(0x7d2, float:2.805E-42)
            r0.type = r1
        L28:
            android.view.WindowManager$LayoutParams r0 = r3.a
            r1 = 1
            r0.format = r1
            r1 = 8
            r0.flags = r1
            r1 = 51
            r0.gravity = r1
            r1 = 0
            r0.x = r1
            r0.y = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = com.acse.ottn.x0.a(r3, r1)
            r0.width = r2
            android.view.WindowManager$LayoutParams r0 = r3.a
            int r1 = com.acse.ottn.x0.a(r3, r1)
            r0.height = r1
            return
    }

    public final void a(int r3) {
            r2 = this;
            android.app.Application r0 = r2.getApplication()     // Catch: java.lang.Throwable -> L13
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)     // Catch: java.lang.Throwable -> L13
            r1 = 0
            android.view.View r3 = r0.inflate(r3, r1)     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.service.TransparentService.f2683f = r3     // Catch: java.lang.Throwable -> L13
            r0 = 0
            r3.measure(r0, r0)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public void b() {
            r2 = this;
            android.view.View r0 = com.acse.ottn.service.TransparentService.f2683f     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L13
        L9:
            android.view.WindowManager r0 = com.acse.ottn.service.TransparentService.f2684g     // Catch: java.lang.Throwable -> L13
            android.view.View r1 = com.acse.ottn.service.TransparentService.f2683f     // Catch: java.lang.Throwable -> L13
            r0.removeView(r1)     // Catch: java.lang.Throwable -> L13
            r2.stopSelf()     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public void c() {
            r3 = this;
            int r0 = com.acse.ottn.R.layout.transparent_background
            r3.a(r0)
            android.view.View r0 = com.acse.ottn.service.TransparentService.f2683f
            int r1 = com.acse.ottn.R.id.treasure_box
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r3.f2686b = r0
            android.view.View r0 = com.acse.ottn.service.TransparentService.f2683f
            int r1 = com.acse.ottn.R.id.image
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f2688d = r0
            android.view.WindowManager r0 = com.acse.ottn.service.TransparentService.f2684g     // Catch: java.lang.Throwable -> L26
            android.view.View r1 = com.acse.ottn.service.TransparentService.f2683f     // Catch: java.lang.Throwable -> L26
            android.view.WindowManager$LayoutParams r2 = r3.a     // Catch: java.lang.Throwable -> L26
            r0.addView(r1, r2)     // Catch: java.lang.Throwable -> L26
        L26:
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r0 = this;
            super.onCreate()
            r0.a()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r0 = this;
            super.onDestroy()
            r0.b()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "deeplink"
            java.lang.String r0 = r5.getStringExtra(r0)     // Catch: java.lang.Exception -> Lc
            r4.f2689e = r0     // Catch: java.lang.Exception -> Lc
            r4.c()     // Catch: java.lang.Exception -> Lc
            goto L27
        Lc:
            r0 = move-exception
            java.lang.String r1 = com.acse.ottn.service.TransparentService.f2685h     // Catch: java.lang.Exception -> L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r2.<init>()     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = "Exception ="
            r2.append(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Exception -> L27
            r2.append(r0)     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L27
            com.acse.ottn.h2.a(r1, r0)     // Catch: java.lang.Exception -> L27
        L27:
            int r5 = super.onStartCommand(r5, r6, r7)
            return r5
    }
}
