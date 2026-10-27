package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class r1 {
    public static com.acse.ottn.r1 a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f2605b = "HttpUtil";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnIndividuationCallBack a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.r1 f2606b;

        public a(com.acse.ottn.r1 r1, com.acse.ottn.activity.AcseHelpManager.OnIndividuationCallBack r2) {
                r0 = this;
                r0.f2606b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r3) throws java.lang.Exception {
                r2 = this;
                com.acse.ottn.activity.AcseHelpManager$OnIndividuationCallBack r0 = r2.a
                r1 = 1
                r0.onIndividuationState(r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "报错了="
                r0.append(r1)
                java.lang.String r3 = r3.getMessage()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "ShopHelperService"
                com.acse.ottn.h2.b(r0, r3)
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
    public class a0 implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public a0() {
                r0 = this;
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
    public class b implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.r1 a;

        public b(com.acse.ottn.r1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.String r4) throws java.lang.Exception {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1e
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L1e
                java.lang.String r4 = "r"
                int r4 = r0.getInt(r4)     // Catch: java.lang.Throwable -> L1e
                r1 = 1
                if (r4 == r1) goto Lf
                goto L1e
            Lf:
                com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L1e
                java.lang.String r1 = "tag_homepage_info"
                java.lang.String r2 = "data"
                java.lang.String r0 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1e
                r4.b(r1, r0)     // Catch: java.lang.Throwable -> L1e
            L1e:
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
    public class b0 implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnOpenPermission a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.r1 f2607b;

        public b0(com.acse.ottn.r1 r1, com.acse.ottn.activity.AcseHelpManager.OnOpenPermission r2) {
                r0 = this;
                r0.f2607b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(java.lang.String r6) throws java.lang.Exception {
                r5 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r6)
                java.lang.String r6 = "r"
                int r6 = r0.getInt(r6)
                r1 = 0
                r2 = 1
                if (r6 != r2) goto L34
                java.lang.String r6 = "oppo_state"
                java.lang.String r3 = r0.getString(r6)
                com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()
                r4.b(r6, r3)
                java.lang.String r6 = "open_plugin_permission"
                int r6 = r0.getInt(r6)
                if (r6 != r2) goto L2c
                com.acse.ottn.activity.AcseHelpManager$OnOpenPermission r6 = r5.a
                if (r6 == 0) goto L3b
                r6.openPermission(r2)
                return
            L2c:
                com.acse.ottn.activity.AcseHelpManager$OnOpenPermission r6 = r5.a
                if (r6 == 0) goto L3b
                r6.openPermission(r1)
                return
            L34:
                com.acse.ottn.activity.AcseHelpManager$OnOpenPermission r6 = r5.a
                if (r6 == 0) goto L3b
                r6.openPermission(r1)
            L3b:
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
    public class c implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.r1 a;

        public c(com.acse.ottn.r1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r3) throws java.lang.Exception {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "报错了="
                r0.append(r1)
                java.lang.String r3 = r3.getMessage()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "HttpUtil"
                com.acse.ottn.h2.b(r0, r3)
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
    public class c0 implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnOpenPermission a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.r1 f2608b;

        public c0(com.acse.ottn.r1 r1, com.acse.ottn.activity.AcseHelpManager.OnOpenPermission r2) {
                r0 = this;
                r0.f2608b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r2) throws java.lang.Exception {
                r1 = this;
                com.acse.ottn.activity.AcseHelpManager$OnOpenPermission r2 = r1.a
                if (r2 == 0) goto L8
                r0 = 0
                r2.openPermission(r0)
            L8:
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
    public class d implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.r1 a;

        public d(com.acse.ottn.r1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.String r4) throws java.lang.Exception {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r4)
                java.lang.String r4 = "r"
                int r4 = r0.getInt(r4)
                r1 = 1
                java.lang.String r2 = "tag_homepage_info"
                if (r4 != r1) goto L1e
                com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()
                java.lang.String r1 = "data"
                java.lang.String r0 = r0.getString(r1)
                r4.b(r2, r0)
                return
            L1e:
                com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()
                java.lang.String r0 = ""
                r4.b(r2, r0)
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
    public class d0 implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnOpenPermission a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.r1 f2609b;

        public d0(com.acse.ottn.r1 r1, com.acse.ottn.activity.AcseHelpManager.OnOpenPermission r2) {
                r0 = this;
                r0.f2609b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(java.lang.String r2) throws java.lang.Exception {
                r1 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r2)
                com.acse.ottn.activity.AcseHelpManager$OnOpenPermission r2 = r1.a
                if (r2 == 0) goto L21
                java.lang.String r2 = "r"
                int r2 = r0.getInt(r2)
                r0 = 1
                if (r2 != r0) goto L1c
                com.acse.ottn.activity.AcseHelpManager$OnOpenPermission r2 = r1.a
                boolean r0 = com.acse.ottn.activity.AcseHelpManager.isOPenPermission()
                r2.openPermission(r0)
                return
            L1c:
                com.acse.ottn.activity.AcseHelpManager$OnOpenPermission r2 = r1.a
                r2.openPermission(r0)
            L21:
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
    public class e implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.r1 a;

        public e(com.acse.ottn.r1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r3) throws java.lang.Exception {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "报错了="
                r0.append(r1)
                java.lang.String r3 = r3.getMessage()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "HttpUtil"
                com.acse.ottn.h2.b(r0, r3)
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
    public class e0 implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnOpenPermission a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.r1 f2610b;

        public e0(com.acse.ottn.r1 r1, com.acse.ottn.activity.AcseHelpManager.OnOpenPermission r2) {
                r0 = this;
                r0.f2610b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r2) throws java.lang.Exception {
                r1 = this;
                com.acse.ottn.activity.AcseHelpManager$OnOpenPermission r2 = r1.a
                if (r2 == 0) goto Lb
                boolean r0 = com.acse.ottn.activity.AcseHelpManager.isOPenPermission()
                r2.openPermission(r0)
            Lb:
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
    public class f implements com.acse.ottn.io.reactivex.functions.Consumer<com.acse.ottn.model.AccessiblityModel> {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.r1.i0 f2611b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.r1 f2612c;

        public f(com.acse.ottn.r1 r1, java.lang.String r2, com.acse.ottn.r1.i0 r3) {
                r0 = this;
                r0.f2612c = r1
                r0.a = r2
                r0.f2611b = r3
                r0.<init>()
                return
        }

        public void a(com.acse.ottn.model.AccessiblityModel r5) throws java.lang.Exception {
                r4 = this;
                java.lang.String r0 = com.acse.ottn.r1.a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "请求成功 string ="
                r1.append(r2)
                java.lang.String r2 = r5.toString()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.acse.ottn.h2.a(r0, r1)
                com.acse.ottn.p4 r0 = com.acse.ottn.p4.a()
                java.lang.String r1 = r4.a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = " r ="
                r2.append(r3)
                int r3 = r5.getR()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 2
                r0.b(r3, r1, r2)
                com.acse.ottn.r1$i0 r0 = r4.f2611b
                if (r0 == 0) goto L42
                r0.a(r5)
            L42:
                com.acse.ottn.n3 r5 = com.acse.ottn.n3.a()
                java.lang.String r0 = "coupon_request_time"
                r1 = 0
                r5.a(r0, r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(com.acse.ottn.model.AccessiblityModel r1) throws java.lang.Exception {
                r0 = this;
                com.acse.ottn.model.AccessiblityModel r1 = (com.acse.ottn.model.AccessiblityModel) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(com.acse.ottn.model.AccessiblityModel r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f0 implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.r1 f2613b;

        public f0(com.acse.ottn.r1 r1, java.lang.String r2) {
                r0 = this;
                r0.f2613b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(java.lang.String r2) throws java.lang.Exception {
                r1 = this;
                com.acse.ottn.o1 r2 = com.acse.ottn.o1.c()
                java.lang.String r0 = r1.a
                r2.a(r0)
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
    public class g implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.r1.i0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.r1 f2614b;

        public g(com.acse.ottn.r1 r1, com.acse.ottn.r1.i0 r2) {
                r0 = this;
                r0.f2614b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r4) throws java.lang.Exception {
                r3 = this;
                java.lang.String r0 = com.acse.ottn.r1.a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "报错了="
                r1.append(r2)
                java.lang.String r2 = r4.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.acse.ottn.h2.b(r0, r1)
                com.acse.ottn.r1$i0 r0 = r3.a
                if (r0 == 0) goto L27
                java.lang.String r4 = r4.getMessage()
                r0.a(r4)
            L27:
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
    public class g0 implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.r1 a;

        public g0(com.acse.ottn.r1 r1) {
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
    public class h implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.r1.i0 a;

        public h(com.acse.ottn.r1.i0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.String r4) throws java.lang.Exception {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r4)
                java.lang.String r4 = "r"
                int r4 = r0.getInt(r4)
                com.acse.ottn.r1$i0 r0 = r3.a
                if (r0 == 0) goto L1a
                r1 = 1
                r2 = 0
                if (r4 != r1) goto L17
                r0.a(r2)
                return
            L17:
                r0.a(r2)
            L1a:
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
    public class h0 implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnIndividuationCallBack a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.r1 f2615b;

        public h0(com.acse.ottn.r1 r1, com.acse.ottn.activity.AcseHelpManager.OnIndividuationCallBack r2) {
                r0 = this;
                r0.f2615b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(java.lang.String r2) throws java.lang.Exception {
                r1 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r2)
                java.lang.String r2 = "state"
                int r2 = r0.getInt(r2)
                r0 = 1
                if (r2 != r0) goto L14
                com.acse.ottn.activity.AcseHelpManager$OnIndividuationCallBack r2 = r1.a
                r2.onIndividuationState(r0)
                return
            L14:
                com.acse.ottn.activity.AcseHelpManager$OnIndividuationCallBack r2 = r1.a
                r0 = 0
                r2.onIndividuationState(r0)
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
    public class i implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.r1.i0 a;

        public i(com.acse.ottn.r1.i0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r2) throws java.lang.Exception {
                r1 = this;
                com.acse.ottn.r1$i0 r2 = r1.a
                if (r2 == 0) goto L8
                r0 = 0
                r2.a(r0)
            L8:
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
    public interface i0 {
        void a(com.acse.ottn.model.AccessiblityModel r1);

        void a(java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class j implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.r1.i0 a;

        public j(com.acse.ottn.r1.i0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.String r4) throws java.lang.Exception {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r4)
                java.lang.String r4 = "r"
                int r4 = r0.getInt(r4)
                com.acse.ottn.r1$i0 r1 = r3.a
                if (r1 == 0) goto L2a
                r2 = 1
                if (r4 != r2) goto L26
                java.lang.String r4 = "state"
                int r4 = r0.getInt(r4)
                com.acse.ottn.model.AccessiblityModel r0 = new com.acse.ottn.model.AccessiblityModel
                r0.<init>()
                r0.setRed_package(r4)
                com.acse.ottn.r1$i0 r4 = r3.a
                r4.a(r0)
                return
            L26:
                r4 = 0
                r1.a(r4)
            L2a:
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
    public interface j0 {
        void a(int r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class k implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.r1 a;

        public k(com.acse.ottn.r1 r1) {
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
    public class l implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.r1.i0 a;

        public l(com.acse.ottn.r1.i0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r2) throws java.lang.Exception {
                r1 = this;
                com.acse.ottn.r1$i0 r2 = r1.a
                if (r2 == 0) goto L8
                r0 = 0
                r2.a(r0)
            L8:
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
    public class m implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.r1.i0 a;

        public m(com.acse.ottn.r1.i0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.String r3) throws java.lang.Exception {
                r2 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r3)
                java.lang.String r3 = "r"
                int r3 = r0.getInt(r3)
                r0 = 1
                r1 = 0
                if (r3 != r0) goto L15
                com.acse.ottn.r1$i0 r3 = r2.a
                r3.a(r1)
                return
            L15:
                com.acse.ottn.r1$i0 r3 = r2.a
                r3.a(r1)
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
    public class n implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.r1.i0 a;

        public n(com.acse.ottn.r1.i0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r2) throws java.lang.Exception {
                r1 = this;
                com.acse.ottn.r1$i0 r2 = r1.a
                if (r2 == 0) goto L8
                r0 = 0
                r2.a(r0)
            L8:
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
    public class o implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public o() {
                r0 = this;
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
    public class p implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public p() {
                r0 = this;
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
    public class q implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.r1.j0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.r1 f2616b;

        public q(com.acse.ottn.r1 r1, com.acse.ottn.r1.j0 r2) {
                r0 = this;
                r0.f2616b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(java.lang.String r3) throws java.lang.Exception {
                r2 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r3)
                java.lang.String r3 = "r"
                int r3 = r0.getInt(r3)
                java.lang.String r1 = "code"
                int r0 = r0.getInt(r1)
                com.acse.ottn.r1$j0 r1 = r2.a
                if (r1 == 0) goto L18
                r1.a(r3, r0)
            L18:
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
    public class r implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.r1 a;

        public r(com.acse.ottn.r1 r1) {
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
    public class s implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.r1 a;

        public s(com.acse.ottn.r1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.String r2) throws java.lang.Exception {
                r1 = this;
                com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()
                r0.k(r2)
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
    public class t implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.r1 a;

        public t(com.acse.ottn.r1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                r1.getMessage()
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
    public class u implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public u() {
                r0 = this;
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
    public class v implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.r1 a;

        public v(com.acse.ottn.r1 r1) {
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
    public class w implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public w() {
                r0 = this;
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
    public class x implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public x() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(java.lang.String r4) throws java.lang.Exception {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r4)
                com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()
                java.lang.String r1 = "auto_start"
                java.lang.String r2 = r0.getString(r1)
                r4.b(r1, r2)
                com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()
                java.lang.String r1 = "relevancy_start"
                java.lang.String r2 = r0.getString(r1)
                r4.b(r1, r2)
                com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()
                java.lang.String r1 = "service_show_view"
                java.lang.String r0 = r0.getString(r1)
                r4.b(r1, r0)
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
    public class y implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public y() {
                r0 = this;
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
    public class z implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public z() {
                r0 = this;
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

    static {
            return
    }

    public r1() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.acse.ottn.r1.f2605b
            return r0
    }

    public static void a(com.acse.ottn.r1.i0 r3) {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = "secret"
            java.lang.String r2 = "abwvAq57vugUhUcTvDAVXWWV1gaqoNQA"
            r0.put(r1, r2)
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r0)
            com.acse.ottn.l1 r1 = new com.acse.ottn.l1
            r1.<init>()
            java.lang.String r2 = "application/json,utf-8"
            okhttp3.MediaType r2 = okhttp3.MediaType.parse(r2)
            okhttp3.RequestBody r0 = okhttp3.RequestBody.create(r2, r0)
            rx.e r0 = r1.e(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.r1$j r1 = new com.acse.ottn.r1$j
            r1.<init>(r3)
            com.acse.ottn.r1$l r2 = new com.acse.ottn.r1$l
            r2.<init>(r3)
            r0.u5(r1, r2)
            return
    }

    public static void a(java.lang.String r3, java.lang.String r4) {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            java.lang.String r1 = "pic"
            r0.put(r1, r3)
            java.lang.String r3 = "pic_effect"
            r0.put(r3, r4)
            com.acse.ottn.g0 r3 = new com.acse.ottn.g0
            r3.<init>()
            com.acse.ottn.t0 r4 = com.acse.ottn.t0.b()
            java.lang.String r1 = ""
            okhttp3.RequestBody r4 = r4.a(r0, r1)
            rx.e r3 = r3.p(r4)
            rx.h r4 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r3 = r3.w5(r4)
            rx.h r4 = com.acse.ottn.i.a()
            rx.e r3 = r3.I3(r4)
            com.acse.ottn.r1$u r4 = new com.acse.ottn.r1$u
            r4.<init>()
            com.acse.ottn.r1$w r0 = new com.acse.ottn.r1$w
            r0.<init>()
            r3.u5(r4, r0)
            return
    }

    public static void a(java.lang.String r3, java.lang.String r4, com.acse.ottn.r1.i0 r5) {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = "secret"
            java.lang.String r2 = "abwvAq57vugUhUcTvDAVXWWV1gaqoNQA"
            r0.put(r1, r2)
            java.lang.String r1 = "password"
            r0.put(r1, r3)
            java.lang.String r3 = "state"
            r0.put(r3, r4)
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r0)
            com.acse.ottn.l1 r4 = new com.acse.ottn.l1
            r4.<init>()
            java.lang.String r0 = "application/json,utf-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            okhttp3.RequestBody r3 = okhttp3.RequestBody.create(r0, r3)
            rx.e r3 = r4.k(r3)
            rx.h r4 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r3 = r3.w5(r4)
            rx.h r4 = com.acse.ottn.i.a()
            rx.e r3 = r3.I3(r4)
            com.acse.ottn.r1$m r4 = new com.acse.ottn.r1$m
            r4.<init>(r5)
            com.acse.ottn.r1$n r0 = new com.acse.ottn.r1$n
            r0.<init>(r5)
            r3.u5(r4, r0)
            return
    }

    public static void b(java.lang.String r2, java.lang.String r3, com.acse.ottn.r1.i0 r4) {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = "username"
            r0.put(r1, r2)
            java.lang.String r2 = "password"
            r0.put(r2, r3)
            java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r0)
            com.acse.ottn.l1 r3 = new com.acse.ottn.l1
            r3.<init>()
            java.lang.String r0 = "application/json,utf-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            okhttp3.RequestBody r2 = okhttp3.RequestBody.create(r0, r2)
            rx.e r2 = r3.l(r2)
            rx.h r3 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r2 = r2.w5(r3)
            rx.h r3 = com.acse.ottn.i.a()
            rx.e r2 = r2.I3(r3)
            com.acse.ottn.r1$h r3 = new com.acse.ottn.r1$h
            r3.<init>(r4)
            com.acse.ottn.r1$i r0 = new com.acse.ottn.r1$i
            r0.<init>(r4)
            r2.u5(r3, r0)
            return
    }

    public static com.acse.ottn.r1 c() {
            com.acse.ottn.r1 r0 = com.acse.ottn.r1.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.r1> r0 = com.acse.ottn.r1.class
            monitor-enter(r0)
            com.acse.ottn.r1 r1 = com.acse.ottn.r1.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.r1 r1 = new com.acse.ottn.r1     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.r1.a = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.r1 r0 = com.acse.ottn.r1.a
            return r0
    }

    public static void c(java.lang.String r4) {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "sys_dialog_text"
            java.lang.String r2 = ""
            r0.b(r1, r2)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r3 = "ak"
            r0.put(r3, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r3 = "sessionid"
            r0.put(r3, r1)
            java.lang.String r1 = "state"
            r0.put(r1, r4)
            com.acse.ottn.g0 r4 = new com.acse.ottn.g0
            r4.<init>()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            okhttp3.RequestBody r0 = r1.a(r0, r2)
            rx.e r4 = r4.m(r0)
            rx.h r0 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r4 = r4.w5(r0)
            rx.h r0 = com.acse.ottn.i.a()
            rx.e r4 = r4.I3(r0)
            com.acse.ottn.r1$z r0 = new com.acse.ottn.r1$z
            r0.<init>()
            com.acse.ottn.r1$a0 r1 = new com.acse.ottn.r1$a0
            r1.<init>()
            r4.u5(r0, r1)
            return
    }

    public static void d(java.lang.String r5) {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            java.lang.String r1 = "app"
            r0.put(r1, r5)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "timestamp"
            r0.put(r1, r5)
            com.acse.ottn.l1 r5 = new com.acse.ottn.l1
            r5.<init>()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            java.lang.String r2 = ""
            okhttp3.RequestBody r0 = r1.a(r0, r2)
            rx.e r5 = r5.g(r0)
            rx.h r0 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r5 = r5.w5(r0)
            rx.h r0 = com.acse.ottn.i.a()
            rx.e r5 = r5.I3(r0)
            com.acse.ottn.r1$o r0 = new com.acse.ottn.r1$o
            r0.<init>()
            com.acse.ottn.r1$p r1 = new com.acse.ottn.r1$p
            r1.<init>()
            r5.u5(r0, r1)
            return
    }

    public static void f() {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            com.acse.ottn.g0 r1 = new com.acse.ottn.g0
            r1.<init>()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            java.lang.String r3 = ""
            okhttp3.RequestBody r0 = r2.a(r0, r3)
            rx.e r0 = r1.q(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.r1$x r1 = new com.acse.ottn.r1$x
            r1.<init>()
            com.acse.ottn.r1$y r2 = new com.acse.ottn.r1$y
            r2.<init>()
            r0.u5(r1, r2)
            return
    }

    public void a(android.app.Activity r8, com.acse.ottn.activity.AcseHelpManager.OnOpenPermission r9) {
            r7 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.i()
            java.lang.String r2 = "device_manufacturer"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.j()
            java.lang.String r2 = "device_product"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.b()
            java.lang.String r2 = "device_brand"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.p()
            java.lang.String r2 = "system_model"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.a()
            java.lang.String r2 = "device_board"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.d()
            java.lang.String r2 = "device_device"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.f()
            java.lang.String r2 = "device_fubgerprint"
            r0.put(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = com.acse.ottn.n4.k()
            r1.append(r2)
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "device_SDK"
            r0.put(r3, r1)
            java.lang.String r1 = com.acse.ottn.n4.q()
            java.lang.String r3 = "system_version"
            r0.put(r3, r1)
            java.lang.String r1 = com.acse.ottn.n4.e()
            java.lang.String r3 = "harmonyDisplayVersion"
            r0.put(r3, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            boolean r1 = r1.e()
            java.lang.String r3 = "1"
            java.lang.String r4 = "0"
            if (r1 == 0) goto L95
            r1 = r3
            goto L96
        L95:
            r1 = r4
        L96:
            java.lang.String r5 = "accessiblity_state"
            r0.put(r5, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            java.lang.String r6 = "flow_window_state"
            if (r1 < r5) goto Laf
            boolean r1 = l.q.a(r8)
            if (r1 == 0) goto Laa
            goto Lab
        Laa:
            r3 = r4
        Lab:
            r0.put(r6, r3)
            goto Lb2
        Laf:
            r0.put(r6, r4)
        Lb2:
            java.lang.String r1 = "maven_version"
            java.lang.String r3 = "1.2.6.6"
            r0.put(r1, r3)
            if (r8 == 0) goto Lcc
            com.acse.ottn.w1 r1 = com.acse.ottn.w1.a()
            com.acse.ottn.model.PlunInstallModel r8 = r1.a(r8)
            java.lang.String r8 = r8.getVersion()
            java.lang.String r1 = "plunin_version"
            r0.put(r1, r8)
        Lcc:
            java.lang.String r8 = "is_snt"
            r0.put(r8, r4)
            com.acse.ottn.g0 r8 = new com.acse.ottn.g0
            r8.<init>()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            okhttp3.RequestBody r0 = r1.a(r0, r2)
            rx.e r8 = r8.l(r0)
            rx.h r0 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r8 = r8.w5(r0)
            rx.h r0 = com.acse.ottn.i.a()
            rx.e r8 = r8.I3(r0)
            com.acse.ottn.r1$b0 r0 = new com.acse.ottn.r1$b0
            r0.<init>(r7, r9)
            com.acse.ottn.r1$c0 r1 = new com.acse.ottn.r1$c0
            r1.<init>(r7, r9)
            r8.u5(r0, r1)
            return
    }

    public void a(com.acse.ottn.activity.AcseHelpManager.OnIndividuationCallBack r5) {
            r4 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            com.acse.ottn.g0 r1 = new com.acse.ottn.g0
            r1.<init>()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            java.lang.String r3 = ""
            okhttp3.RequestBody r0 = r2.a(r0, r3)
            rx.e r0 = r1.o(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.r1$h0 r1 = new com.acse.ottn.r1$h0
            r1.<init>(r4, r5)
            com.acse.ottn.r1$a r2 = new com.acse.ottn.r1$a
            r2.<init>(r4, r5)
            r0.u5(r1, r2)
            return
    }

    public void a(com.acse.ottn.activity.AcseHelpManager.OnOpenPermission r5) {
            r4 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.i()
            java.lang.String r2 = "device_manufacturer"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.j()
            java.lang.String r2 = "device_product"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.b()
            java.lang.String r2 = "device_brand"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.p()
            java.lang.String r2 = "system_model"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.a()
            java.lang.String r2 = "device_board"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.d()
            java.lang.String r2 = "device_device"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.f()
            java.lang.String r2 = "device_fubgerprint"
            r0.put(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = com.acse.ottn.n4.k()
            r1.append(r2)
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "device_SDK"
            r0.put(r3, r1)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r3 = "getSystemVersion"
            java.lang.String r1 = r1.e(r3)
            java.lang.String r3 = "system_version"
            r0.put(r3, r1)
            com.acse.ottn.w1 r1 = com.acse.ottn.w1.a()
            android.content.Context r3 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r3 = r3.getPackageName()
            com.acse.ottn.model.PlunInstallModel r1 = r1.a(r3)
            java.lang.String r1 = r1.getVersion()
            java.lang.String r3 = "plunin_version"
            r0.put(r3, r1)
            java.lang.String r1 = "is_snt"
            java.lang.String r3 = "0"
            r0.put(r1, r3)
            com.acse.ottn.g0 r1 = new com.acse.ottn.g0
            r1.<init>()
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            okhttp3.RequestBody r0 = r3.a(r0, r2)
            rx.e r0 = r1.h(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.r1$d0 r1 = new com.acse.ottn.r1$d0
            r1.<init>(r4, r5)
            com.acse.ottn.r1$e0 r2 = new com.acse.ottn.r1$e0
            r2.<init>(r4, r5)
            r0.u5(r1, r2)
            return
    }

    public void a(java.lang.String r5) {
            r4 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            com.acse.ottn.w1 r1 = com.acse.ottn.w1.a()
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r2 = r2.getPackageName()
            com.acse.ottn.model.PlunInstallModel r1 = r1.a(r2)
            java.lang.String r1 = r1.getVersion()
            java.lang.String r2 = "version"
            r0.put(r2, r1)
            java.lang.String r1 = "is_snt"
            java.lang.String r2 = "0"
            r0.put(r1, r2)
            java.lang.String r1 = "state"
            r0.put(r1, r5)
            com.acse.ottn.g0 r1 = new com.acse.ottn.g0
            r1.<init>()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            java.lang.String r3 = ""
            okhttp3.RequestBody r0 = r2.a(r0, r3)
            rx.e r0 = r1.d(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.r1$f0 r1 = new com.acse.ottn.r1$f0
            r1.<init>(r4, r5)
            com.acse.ottn.r1$g0 r5 = new com.acse.ottn.r1$g0
            r5.<init>(r4)
            r0.u5(r1, r5)
            return
    }

    public void a(java.lang.String r4, com.acse.ottn.r1.j0 r5) {
            r3 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            java.lang.String r1 = "limitType"
            java.lang.String r2 = "coupon"
            r0.put(r1, r2)
            java.lang.String r1 = "is_snt"
            java.lang.String r2 = "0"
            r0.put(r1, r2)
            java.lang.String r1 = "package_name"
            r0.put(r1, r4)
            com.acse.ottn.g0 r4 = new com.acse.ottn.g0
            r4.<init>()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            java.lang.String r2 = ""
            okhttp3.RequestBody r0 = r1.a(r0, r2)
            rx.e r4 = r4.i(r0)
            rx.h r0 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r4 = r4.w5(r0)
            rx.h r0 = com.acse.ottn.i.a()
            rx.e r4 = r4.I3(r0)
            com.acse.ottn.r1$q r0 = new com.acse.ottn.r1$q
            r0.<init>(r3, r5)
            com.acse.ottn.r1$r r5 = new com.acse.ottn.r1$r
            r5.<init>(r3)
            r4.u5(r0, r5)
            return
    }

    public void a(java.util.List<java.lang.String> r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.acse.ottn.r1.i0 r11) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L1b4
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto Le
            goto L1b4
        Le:
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            java.lang.String r1 = "app"
            r0.put(r1, r8)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "marker"
            r0.put(r2, r1)
            java.lang.String r1 = "data"
            java.lang.String r2 = "title_data"
            java.lang.String r3 = ""
            if (r7 == 0) goto L48
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r7)
            boolean r5 = com.acse.ottn.l0.f2433d
            if (r5 == 0) goto L44
            com.acse.ottn.n3 r5 = com.acse.ottn.n3.a()
            r5.b(r2, r4)
        L44:
            r0.put(r1, r4)
            goto L52
        L48:
            com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()
            r4.b(r2, r3)
            r0.put(r1, r3)
        L52:
            java.lang.String r1 = "title"
            r0.put(r1, r10)
            com.acse.ottn.d r10 = com.acse.ottn.d.d()
            java.lang.String r10 = r10.m
            java.lang.String r1 = "tb_title_pic"
            r0.put(r1, r10)
            com.acse.ottn.d r10 = com.acse.ottn.d.d()
            java.lang.String r10 = r10.n
            java.lang.String r1 = "tb_title_pic_by"
            r0.put(r1, r10)
            java.lang.String r10 = com.acse.ottn.l0.f2440k
            java.lang.String r1 = "new_version"
            r0.put(r1, r10)
            com.acse.ottn.t0 r10 = com.acse.ottn.t0.b()
            java.lang.String r10 = r10.j(r8)
            java.lang.String r1 = "coupon_type"
            r0.put(r1, r10)
            java.lang.String r10 = "genuine_packagename"
            r0.put(r10, r9)
            java.lang.String r9 = com.acse.ottn.n4.b()
            java.lang.String r10 = "device_brand"
            r0.put(r10, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r9.append(r1)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "current_system_time"
            r0.put(r10, r9)
            java.lang.String r9 = com.acse.ottn.l0.f2440k
            java.lang.String r10 = "is_snt"
            r0.put(r10, r9)
            java.lang.String r9 = com.acse.ottn.n4.r()
            java.lang.String r10 = "version"
            r0.put(r10, r9)
            java.lang.String r9 = "maven_version"
            java.lang.String r10 = "1.2.6.6"
            r0.put(r9, r10)
            com.acse.ottn.b r9 = com.acse.ottn.b.c()
            boolean r9 = r9.a()
            java.lang.String r10 = "1"
            java.lang.String r1 = "0"
            if (r9 == 0) goto Lce
            r9 = r10
            goto Lcf
        Lce:
            r9 = r1
        Lcf:
            java.lang.String r2 = "flow_permission"
            r0.put(r2, r9)
            java.lang.String r9 = com.acse.ottn.n4.b()
            java.lang.String r2 = "mobile"
            r0.put(r2, r9)
            java.lang.String r9 = com.acse.ottn.l0.y
            java.lang.String r2 = "mobile_version_release"
            r0.put(r2, r9)
            com.acse.ottn.n3 r9 = com.acse.ottn.n3.a()
            java.lang.String r2 = "longitude"
            java.lang.String r9 = r9.e(r2)
            java.lang.String r2 = "lon"
            r0.put(r2, r9)
            com.acse.ottn.n3 r9 = com.acse.ottn.n3.a()
            java.lang.String r2 = "latitude"
            java.lang.String r9 = r9.e(r2)
            java.lang.String r2 = "lat"
            r0.put(r2, r9)
            com.acse.ottn.n3 r9 = com.acse.ottn.n3.a()
            java.lang.String r2 = "location_state"
            java.lang.String r9 = r9.e(r2)
            java.lang.String r2 = "loca_type"
            r0.put(r2, r9)
            android.content.Context r9 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            boolean r9 = com.acse.ottn.n4.d(r9)
            if (r9 == 0) goto L11d
            r9 = r10
            goto L11e
        L11d:
            r9 = r1
        L11e:
            java.lang.String r2 = "is_open_adb"
            r0.put(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.String r4 = "accession_size"
            int r2 = r2.c(r4)
            r9.append(r2)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r0.put(r4, r9)
            com.acse.ottn.n3 r9 = com.acse.ottn.n3.a()
            java.lang.String r2 = "xposed_state"
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L14d
            r9 = r10
            goto L14e
        L14d:
            r9 = r1
        L14e:
            java.lang.String r2 = "is_ist_xp"
            r0.put(r2, r9)
            java.lang.String r9 = "is_debug"
            r0.put(r9, r1)
            android.content.Context r9 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            boolean r9 = com.acse.ottn.n4.e(r9)
            if (r9 == 0) goto L163
            goto L164
        L163:
            r10 = r1
        L164:
            java.lang.String r9 = "is_developermode_enabled"
            r0.put(r9, r10)
            if (r7 == 0) goto L185
            java.lang.String r9 = com.acse.ottn.r1.f2605b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "getCouponInfo string ="
            r10.append(r1)
            java.lang.String r7 = com.alibaba.fastjson.JSON.toJSONString(r7)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            com.acse.ottn.h2.a(r9, r7)
        L185:
            com.acse.ottn.l1 r7 = new com.acse.ottn.l1
            r7.<init>()
            com.acse.ottn.t0 r9 = com.acse.ottn.t0.b()
            okhttp3.RequestBody r9 = r9.a(r0, r3)
            rx.e r7 = r7.c(r9)
            rx.h r9 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r7 = r7.w5(r9)
            rx.h r9 = com.acse.ottn.i.a()
            rx.e r7 = r7.I3(r9)
            com.acse.ottn.r1$f r9 = new com.acse.ottn.r1$f
            r9.<init>(r6, r8, r11)
            com.acse.ottn.r1$g r8 = new com.acse.ottn.r1$g
            r8.<init>(r6, r11)
            r7.u5(r9, r8)
            return
        L1b4:
            java.lang.String r7 = com.acse.ottn.r1.f2605b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "isShowConpunInfor is "
            r8.append(r9)
            boolean r9 = com.acse.ottn.l0.f2434e
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.acse.ottn.h2.a(r7, r8)
            return
    }

    public void b() {
            r4 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.i()
            java.lang.String r2 = "device_manufacturer"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.j()
            java.lang.String r2 = "device_product"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.b()
            java.lang.String r2 = "device_brand"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.p()
            java.lang.String r2 = "system_model"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.a()
            java.lang.String r2 = "device_board"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.d()
            java.lang.String r2 = "device_device"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.f()
            java.lang.String r2 = "device_fubgerprint"
            r0.put(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = com.acse.ottn.n4.k()
            r1.append(r2)
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "device_SDK"
            r0.put(r3, r1)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r3 = "getSystemVersion"
            java.lang.String r1 = r1.e(r3)
            java.lang.String r3 = "system_version"
            r0.put(r3, r1)
            java.lang.String r1 = "plunin_version"
            java.lang.String r3 = "0"
            r0.put(r1, r3)
            java.lang.String r1 = "is_snt"
            r0.put(r1, r3)
            com.acse.ottn.g0 r1 = new com.acse.ottn.g0
            r1.<init>()
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            okhttp3.RequestBody r0 = r3.a(r0, r2)
            rx.e r0 = r1.e(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.r1$k r1 = new com.acse.ottn.r1$k
            r1.<init>(r4)
            com.acse.ottn.r1$v r2 = new com.acse.ottn.r1$v
            r2.<init>(r4)
            r0.u5(r1, r2)
            return
    }

    public void b(java.lang.String r4) {
            r3 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "marker"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.l0.f2440k
            java.lang.String r2 = "new_version"
            r0.put(r2, r1)
            java.lang.String r1 = "app"
            r0.put(r1, r4)
            java.lang.String r4 = "maven_version"
            java.lang.String r1 = "1.2.6.6"
            r0.put(r4, r1)
            com.acse.ottn.l1 r4 = new com.acse.ottn.l1
            r4.<init>()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            java.lang.String r2 = ""
            okhttp3.RequestBody r0 = r1.a(r0, r2)
            rx.e r4 = r4.b(r0)
            rx.h r0 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r4 = r4.w5(r0)
            rx.h r0 = com.acse.ottn.i.a()
            rx.e r4 = r4.I3(r0)
            com.acse.ottn.r1$b r0 = new com.acse.ottn.r1$b
            r0.<init>(r3)
            com.acse.ottn.r1$c r1 = new com.acse.ottn.r1$c
            r1.<init>(r3)
            r4.u5(r0, r1)
            return
    }

    public final java.lang.Object d() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.r1 r0 = com.acse.ottn.r1.a
            return r0
    }

    public void e() {
            r4 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "marker"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.l0.f2440k
            java.lang.String r2 = "new_version"
            r0.put(r2, r1)
            java.lang.String r1 = "maven_version"
            java.lang.String r2 = "1.2.6.6"
            r0.put(r1, r2)
            com.acse.ottn.l1 r1 = new com.acse.ottn.l1
            r1.<init>()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            java.lang.String r3 = ""
            okhttp3.RequestBody r0 = r2.a(r0, r3)
            rx.e r0 = r1.a(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.r1$d r1 = new com.acse.ottn.r1$d
            r1.<init>(r4)
            com.acse.ottn.r1$e r2 = new com.acse.ottn.r1$e
            r2.<init>(r4)
            r0.u5(r1, r2)
            return
    }

    public void g() {
            r4 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            java.lang.String r1 = "version"
            java.lang.String r2 = "1.2.6.6"
            r0.put(r1, r2)
            java.lang.String r1 = com.acse.ottn.n4.o()
            java.lang.String r2 = "mobile_id"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.b()
            java.lang.String r2 = "mobile"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.l0.y
            java.lang.String r2 = "mobile_version_release"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.l0.x
            java.lang.String r2 = "app_versione"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.d()
            java.lang.String r2 = "app_system_model"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.j()
            java.lang.String r2 = "device_product"
            r0.put(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "time"
            r0.put(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = com.acse.ottn.n4.k()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "device_SDK"
            r0.put(r2, r1)
            java.lang.String r1 = com.acse.ottn.n4.p()
            java.lang.String r2 = "system_model"
            r0.put(r2, r1)
            com.acse.ottn.v0 r1 = new com.acse.ottn.v0
            r1.<init>()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            okhttp3.RequestBody r0 = r2.a(r0)
            rx.e r0 = r1.a(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.r1$s r1 = new com.acse.ottn.r1$s
            r1.<init>(r4)
            com.acse.ottn.r1$t r2 = new com.acse.ottn.r1$t
            r2.<init>(r4)
            r0.u5(r1, r2)
            return
    }
}
