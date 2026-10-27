package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    public static com.acse.ottn.e a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f2272b = "acse_ShopHelperService";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.e a;

        public a(com.acse.ottn.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.String r1) throws java.lang.Exception {
                r0 = this;
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
        public final /* synthetic */ com.acse.ottn.e a;

        public b(com.acse.ottn.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r4) throws java.lang.Exception {
                r3 = this;
                java.lang.String r0 = com.acse.ottn.e.a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "报错了="
                r1.append(r2)
                java.lang.String r4 = r4.getMessage()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                com.acse.ottn.h2.b(r0, r4)
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

    static {
            return
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.acse.ottn.e.f2272b
            return r0
    }

    public static com.acse.ottn.e c() {
            com.acse.ottn.e r0 = com.acse.ottn.e.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.e> r0 = com.acse.ottn.e.class
            monitor-enter(r0)
            com.acse.ottn.e r1 = com.acse.ottn.e.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.e r1 = new com.acse.ottn.e     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.e.a = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.e r0 = com.acse.ottn.e.a
            return r0
    }

    public void a(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            return
    }

    public void a(com.acse.ottn.model.AccessiblityModel r4) {
            r3 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r4.getData()
            java.lang.String r1 = r1.getCoupon_activity_name()
            java.lang.String r2 = "para"
            r0.put(r2, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r4.getData()
            java.lang.String r4 = r4.getPackage_name()
            java.lang.String r1 = "app"
            r0.put(r1, r4)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r4 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r1 = "sessionid"
            r0.put(r1, r4)
            java.lang.String r4 = "is_snt"
            java.lang.String r1 = "0"
            r0.put(r4, r1)
            com.acse.ottn.l1 r4 = new com.acse.ottn.l1
            r4.<init>()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            java.lang.String r2 = ""
            okhttp3.RequestBody r0 = r1.a(r0, r2)
            rx.e r4 = r4.i(r0)
            rx.h r0 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r4 = r4.w5(r0)
            rx.h r0 = com.acse.ottn.i.a()
            rx.e r4 = r4.I3(r0)
            com.acse.ottn.e$a r0 = new com.acse.ottn.e$a
            r0.<init>(r3)
            com.acse.ottn.e$b r1 = new com.acse.ottn.e$b
            r1.<init>(r3)
            r4.u5(r0, r1)
            return
    }

    public void b() {
            r0 = this;
            return
    }

    public final java.lang.Object d() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.e r0 = com.acse.ottn.e.a
            return r0
    }
}
