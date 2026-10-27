package com.acse.ottn.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MainService extends android.app.Service implements com.acse.ottn.service.a.u0 {

    /* renamed from: c, reason: collision with root package name */
    public static android.view.View f2678c = null;

    /* renamed from: d, reason: collision with root package name */
    public static android.view.WindowManager f2679d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f2680e = "MainService";
    public android.view.WindowManager.LayoutParams a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.model.AccessiblityModel f2681b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.r1.j0 {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.MainService f2682b;

        public a(com.acse.ottn.service.MainService r1, java.lang.String r2) {
                r0 = this;
                r0.f2682b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.r1.j0
        public void a(int r2, int r3) {
                r1 = this;
                r0 = 1
                if (r2 != r0) goto L1b
                if (r3 != r0) goto L11
                com.acse.ottn.m2 r2 = com.acse.ottn.m2.a()
                com.acse.ottn.service.MainService r3 = r1.f2682b
                java.lang.String r0 = r1.a
                r2.a(r3, r0, r3)
                return
            L11:
                com.acse.ottn.m2 r2 = com.acse.ottn.m2.a()
                com.acse.ottn.service.MainService r3 = r1.f2682b
                r2.b(r3)
                return
            L1b:
                com.acse.ottn.m2 r2 = com.acse.ottn.m2.a()
                com.acse.ottn.service.MainService r3 = r1.f2682b
                r2.b(r3)
                return
        }
    }

    static {
            r0 = 10050(0x2742, float:1.4083E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public MainService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.acse.ottn.service.a.u0
    public void a() {
            r1 = this;
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.a()
            r0.b(r1)
            return
    }

    @Override // com.acse.ottn.service.a.u0
    public void a(java.lang.String r3) {
            r2 = this;
            com.acse.ottn.r1 r0 = com.acse.ottn.r1.c()
            com.acse.ottn.service.MainService$a r1 = new com.acse.ottn.service.MainService$a
            r1.<init>(r2, r3)
            r0.a(r3, r1)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final void b() {
            r1 = this;
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.a()
            r0.a(r1)
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
            r2 = this;
            super.onCreate()
            java.lang.String r0 = com.acse.ottn.service.MainService.f2680e
            java.lang.String r1 = "MainService Created"
            com.acse.ottn.h2.c(r0, r1)
            r2.b()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r4 = this;
            java.lang.String r0 = com.acse.ottn.service.MainService.f2680e     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = "onDestroy "
            com.acse.ottn.h2.c(r0, r1)     // Catch: java.lang.Exception -> L15
            com.acse.ottn.service.a.b()     // Catch: java.lang.Exception -> L15
            com.acse.ottn.service.a.d()     // Catch: java.lang.Exception -> L15
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.a()     // Catch: java.lang.Exception -> L15
            r0.b(r4)     // Catch: java.lang.Exception -> L15
            goto L30
        L15:
            r0 = move-exception
            java.lang.String r1 = com.acse.ottn.service.MainService.f2680e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onDestroy e="
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.acse.ottn.h2.c(r1, r0)
        L30:
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "model"
            java.io.Serializable r0 = r5.getSerializableExtra(r0)     // Catch: java.lang.Exception -> L2e
            com.acse.ottn.model.AccessiblityModel r0 = (com.acse.ottn.model.AccessiblityModel) r0     // Catch: java.lang.Exception -> L2e
            r4.f2681b = r0     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L66
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L66
            com.acse.ottn.model.AccessiblityModel r0 = r4.f2681b     // Catch: java.lang.Exception -> L2e
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()     // Catch: java.lang.Exception -> L2e
            java.lang.String r0 = r0.getService_control()     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L30
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.a()     // Catch: java.lang.Exception -> L2e
            com.acse.ottn.model.AccessiblityModel r1 = r4.f2681b     // Catch: java.lang.Exception -> L2e
            r0.c(r4, r1, r4)     // Catch: java.lang.Exception -> L2e
            goto L66
        L2e:
            r0 = move-exception
            goto L4c
        L30:
            com.acse.ottn.model.AccessiblityModel r0 = r4.f2681b     // Catch: java.lang.Exception -> L2e
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()     // Catch: java.lang.Exception -> L2e
            java.lang.String r0 = r0.getService_control()     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L66
            com.acse.ottn.m2 r0 = com.acse.ottn.m2.a()     // Catch: java.lang.Exception -> L2e
            com.acse.ottn.model.AccessiblityModel r1 = r4.f2681b     // Catch: java.lang.Exception -> L2e
            r0.a(r4, r1, r4)     // Catch: java.lang.Exception -> L2e
            goto L66
        L4c:
            java.lang.String r1 = com.acse.ottn.service.MainService.f2680e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception ="
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.acse.ottn.h2.a(r1, r0)
        L66:
            int r5 = super.onStartCommand(r5, r6, r7)
            return r5
    }
}
