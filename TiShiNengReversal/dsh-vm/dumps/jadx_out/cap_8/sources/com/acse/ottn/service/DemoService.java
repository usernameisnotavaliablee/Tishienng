package com.acse.ottn.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DemoService extends android.app.Service {
    public static java.lang.String a = "DemoService";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.service.DemoService a;

        public a(com.acse.ottn.service.DemoService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.String r3) throws java.lang.Exception {
                r2 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L14
                com.acse.ottn.o r0 = com.acse.ottn.o.c()
                com.acse.ottn.service.DemoService r1 = r2.a
                r0.a(r1, r3)
                com.acse.ottn.service.DemoService r3 = r2.a
                r3.stopSelf()
            L14:
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.String r1) throws java.lang.Exception {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.String r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.service.DemoService a;

        public b(com.acse.ottn.service.DemoService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.Throwable r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements com.acse.ottn.io.reactivex.ObservableOnSubscribe<java.lang.String> {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.DemoService f2660b;

        public c(com.acse.ottn.service.DemoService r1, java.lang.String r2) {
                r0 = this;
                r0.f2660b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.io.reactivex.ObservableOnSubscribe
        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.a.a(r0, r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.ObservableOnSubscribe
        public /* synthetic */ void call(rx.l<? super java.lang.String> r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.a.b(r0, r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.ObservableOnSubscribe
        public void subscribe(com.acse.ottn.io.reactivex.ObservableEmitter<java.lang.String> r4) throws java.lang.Exception {
                r3 = this;
                okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient     // Catch: java.lang.Exception -> L35
                r0.<init>()     // Catch: java.lang.Exception -> L35
                okhttp3.Request$Builder r1 = new okhttp3.Request$Builder     // Catch: java.lang.Exception -> L35
                r1.<init>()     // Catch: java.lang.Exception -> L35
                java.lang.String r2 = r3.a     // Catch: java.lang.Exception -> L35
                okhttp3.Request$Builder r1 = r1.url(r2)     // Catch: java.lang.Exception -> L35
                okhttp3.Request r1 = r1.build()     // Catch: java.lang.Exception -> L35
                okhttp3.Call r0 = r0.newCall(r1)     // Catch: java.lang.Exception -> L35
                okhttp3.Response r0 = r0.execute()     // Catch: java.lang.Exception -> L35
                okhttp3.ResponseBody r0 = r0.body()     // Catch: java.lang.Exception -> L35
                java.lang.String r0 = r0.string()     // Catch: java.lang.Exception -> L35
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L35
                r1.<init>(r0)     // Catch: java.lang.Exception -> L35
                java.lang.String r0 = "content"
                java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Exception -> L35
                java.lang.String r1 = "samon-->code1"
                com.acse.ottn.h2.a(r1, r0)     // Catch: java.lang.Exception -> L35
                goto L4a
            L35:
                r0 = move-exception
                java.lang.String r1 = "samon-->code11"
                java.lang.String r2 = "shortcode is null"
                com.acse.ottn.h2.a(r1, r2)
                java.lang.String r1 = com.acse.ottn.service.DemoService.a()
                java.lang.String r0 = r0.getMessage()
                com.acse.ottn.h2.a(r1, r0)
                java.lang.String r0 = ""
            L4a:
                r4.onNext(r0)
                return
        }
    }

    static {
            r0 = 10044(0x273c, float:1.4075E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public DemoService() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.acse.ottn.service.DemoService.a
            return r0
    }

    public void a(java.lang.String r3) {
            r2 = this;
            com.acse.ottn.service.DemoService$c r0 = new com.acse.ottn.service.DemoService$c
            r0.<init>(r2, r3)
            rx.e r3 = rx.e.j1(r0)
            rx.h r0 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r3 = r3.w5(r0)
            rx.h r0 = com.acse.ottn.i.a()
            rx.e r3 = r3.I3(r0)
            com.acse.ottn.service.DemoService$a r0 = new com.acse.ottn.service.DemoService$a
            r0.<init>(r2)
            com.acse.ottn.service.DemoService$b r1 = new com.acse.ottn.service.DemoService$b
            r1.<init>(r2)
            r3.u5(r0, r1)
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
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r3, int r4, int r5) {
            r2 = this;
            if (r3 == 0) goto L1a
            java.lang.String r0 = "tkl_url"
            java.lang.String r0 = r3.getStringExtra(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1d
            r2.a(r0)     // Catch: java.lang.Exception -> L12
            goto L1d
        L12:
            java.lang.String r0 = com.acse.ottn.service.DemoService.a
            java.lang.String r1 = "request code fail "
            com.acse.ottn.h2.b(r0, r1)
            goto L1d
        L1a:
            r2.stopSelf()
        L1d:
            int r3 = super.onStartCommand(r3, r4, r5)
            return r3
    }
}
