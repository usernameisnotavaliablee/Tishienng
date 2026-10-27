package cn.jiguang.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h {

    /* renamed from: d, reason: collision with root package name */
    private static int f402d;
    private final java.util.concurrent.atomic.AtomicBoolean a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.Map<cn.jiguang.ab.g, android.util.Pair<java.lang.Integer, cn.jiguang.ag.a>> f403b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.Map<cn.jiguang.ab.g, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ad.h.c>> f404c;

    /* renamed from: e, reason: collision with root package name */
    private java.util.Map<cn.jiguang.ab.g, java.lang.Long> f405e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.util.LinkedHashSet<cn.jiguang.ab.g>> f406f;

    /* renamed from: cn.jiguang.ad.h$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class a {
        private static final cn.jiguang.ad.h a = null;

        static {
                cn.jiguang.ad.h r0 = new cn.jiguang.ad.h
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.ad.h.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.ad.h a() {
                cn.jiguang.ad.h r0 = cn.jiguang.ad.h.a.a
                return r0
        }
    }

    static class b extends cn.jiguang.ah.a implements java.lang.Runnable {
        private android.content.Context a;

        /* renamed from: d, reason: collision with root package name */
        private int f407d;

        /* renamed from: e, reason: collision with root package name */
        private final java.lang.Object f408e;

        /* renamed from: f, reason: collision with root package name */
        private int f409f;

        b(android.content.Context r1, int r2, java.lang.Object r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f407d = r2
                r0.f408e = r3
                return
        }

        b(android.content.Context r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f408e = r2
                return
        }

        static /* synthetic */ int a(cn.jiguang.ad.h.b r0, int r1) {
                r0.f409f = r1
                return r1
        }

        @Override // cn.jiguang.ah.a
        public void a(android.os.Message r4) {
                r3 = this;
                int r4 = r4.what
                r0 = 60000(0xea60, float:8.4078E-41)
                java.lang.String r1 = "TcpReporter"
                if (r4 < r0) goto L34
                java.lang.Object r4 = r3.f408e
                boolean r4 = r4 instanceof cn.jiguang.ab.g
                if (r4 == 0) goto L69
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "time to idle="
                r4.append(r0)
                java.lang.Object r0 = r3.f408e
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                cn.jiguang.w.f.c(r1, r4)
                cn.jiguang.ad.h r4 = cn.jiguang.ad.h.a()
                android.content.Context r0 = r3.a
                java.lang.Object r1 = r3.f408e
                cn.jiguang.ab.g r1 = (cn.jiguang.ab.g) r1
                r2 = 0
                cn.jiguang.ad.h.a(r4, r0, r1, r2)
                return
            L34:
                r0 = 50000(0xc350, float:7.0065E-41)
                if (r4 < r0) goto L69
                java.lang.Object r4 = r3.f408e
                boolean r0 = r4 instanceof cn.jiguang.ad.h.c
                if (r0 == 0) goto L69
                cn.jiguang.ad.h$c r4 = (cn.jiguang.ad.h.c) r4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "onTimeout="
                r0.append(r2)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                cn.jiguang.w.f.c(r1, r0)
                cn.jiguang.ad.h r0 = cn.jiguang.ad.h.a()
                cn.jiguang.ab.g r1 = r4.f414f
                int r2 = r4.f413e
                cn.jiguang.ad.h.a(r0, r1, r2)
                cn.jiguang.ad.h r0 = cn.jiguang.ad.h.a()
                android.content.Context r1 = r3.a
                r0.a(r1, r4)
            L69:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r11 = this;
                int r0 = r11.f407d     // Catch: java.lang.Throwable -> L6f
                r1 = 1
                if (r0 == r1) goto L5c
                r1 = 2
                if (r0 == r1) goto L48
                r1 = 3
                if (r0 == r1) goto Lc
                goto L6f
            Lc:
                java.lang.Object r0 = r11.f408e     // Catch: java.lang.Throwable -> L6f
                boolean r1 = r0 instanceof cn.jiguang.ad.h.c     // Catch: java.lang.Throwable -> L6f
                if (r1 == 0) goto L6f
                cn.jiguang.ad.h$c r0 = (cn.jiguang.ad.h.c) r0     // Catch: java.lang.Throwable -> L6f
                java.lang.String r1 = "TcpReporter"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
                r2.<init>()     // Catch: java.lang.Throwable -> L6f
                java.lang.String r3 = "onResult, data="
                r2.append(r3)     // Catch: java.lang.Throwable -> L6f
                r2.append(r0)     // Catch: java.lang.Throwable -> L6f
                java.lang.String r3 = " code="
                r2.append(r3)     // Catch: java.lang.Throwable -> L6f
                int r3 = r11.f409f     // Catch: java.lang.Throwable -> L6f
                r2.append(r3)     // Catch: java.lang.Throwable -> L6f
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6f
                cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L6f
                android.content.Context r3 = r11.a     // Catch: java.lang.Throwable -> L6f
                int r4 = r11.f409f     // Catch: java.lang.Throwable -> L6f
                org.json.JSONObject r5 = r0.a     // Catch: java.lang.Throwable -> L6f
                cn.jiguang.y.g$a r6 = r0.f410b     // Catch: java.lang.Throwable -> L6f
                java.io.File r7 = r0.f411c     // Catch: java.lang.Throwable -> L6f
                java.util.Set<java.lang.String> r8 = r0.f412d     // Catch: java.lang.Throwable -> L6f
                cn.jiguang.api.ReportCallBack r9 = r0.f417i     // Catch: java.lang.Throwable -> L6f
                java.lang.String r10 = r0.f418j     // Catch: java.lang.Throwable -> L6f
                cn.jiguang.y.g.a(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6f
                return
            L48:
                java.lang.Object r0 = r11.f408e     // Catch: java.lang.Throwable -> L6f
                boolean r0 = r0 instanceof cn.jiguang.ab.g     // Catch: java.lang.Throwable -> L6f
                if (r0 == 0) goto L6f
                cn.jiguang.ad.h r0 = cn.jiguang.ad.h.a()     // Catch: java.lang.Throwable -> L6f
                android.content.Context r1 = r11.a     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r2 = r11.f408e     // Catch: java.lang.Throwable -> L6f
                cn.jiguang.ab.g r2 = (cn.jiguang.ab.g) r2     // Catch: java.lang.Throwable -> L6f
                cn.jiguang.ad.h.b(r0, r1, r2)     // Catch: java.lang.Throwable -> L6f
                return
            L5c:
                java.lang.Object r0 = r11.f408e     // Catch: java.lang.Throwable -> L6f
                boolean r0 = r0 instanceof cn.jiguang.ab.g     // Catch: java.lang.Throwable -> L6f
                if (r0 == 0) goto L6f
                cn.jiguang.ad.h r0 = cn.jiguang.ad.h.a()     // Catch: java.lang.Throwable -> L6f
                android.content.Context r1 = r11.a     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r2 = r11.f408e     // Catch: java.lang.Throwable -> L6f
                cn.jiguang.ab.g r2 = (cn.jiguang.ab.g) r2     // Catch: java.lang.Throwable -> L6f
                cn.jiguang.ad.h.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L6f
            L6f:
                return
        }
    }

    public static class c {
        org.json.JSONObject a;

        /* renamed from: b, reason: collision with root package name */
        cn.jiguang.y.g.a f410b;

        /* renamed from: c, reason: collision with root package name */
        java.io.File f411c;

        /* renamed from: d, reason: collision with root package name */
        java.util.Set<java.lang.String> f412d;

        /* renamed from: e, reason: collision with root package name */
        int f413e;

        /* renamed from: f, reason: collision with root package name */
        cn.jiguang.ab.g f414f;

        /* renamed from: g, reason: collision with root package name */
        java.util.LinkedHashSet<cn.jiguang.ab.g> f415g;

        /* renamed from: h, reason: collision with root package name */
        boolean f416h;

        /* renamed from: i, reason: collision with root package name */
        transient cn.jiguang.api.ReportCallBack f417i;

        /* renamed from: j, reason: collision with root package name */
        transient java.lang.String f418j;

        public c() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f413e = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TcpReportData{types="
                r0.append(r1)
                java.util.Set<java.lang.String> r1 = r2.f412d
                r0.append(r1)
                java.lang.String r1 = ", seqId="
                r0.append(r1)
                int r1 = r2.f413e
                r0.append(r1)
                java.lang.String r1 = ", ipPort="
                r0.append(r1)
                cn.jiguang.ab.g r1 = r2.f414f
                r0.append(r1)
                java.lang.String r1 = ", restUrls="
                r0.append(r1)
                java.util.LinkedHashSet<cn.jiguang.ab.g> r1 = r2.f415g
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            return
    }

    private h() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.f403b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.f404c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f405e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f406f = r0
            return
    }

    /* synthetic */ h(cn.jiguang.ad.h.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private cn.jiguang.ad.h.c a(cn.jiguang.ab.g r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L1e
            java.util.Map<cn.jiguang.ab.g, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ad.h$c>> r0 = r1.f404c
            java.lang.Object r2 = r0.get(r2)
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            if (r2 == 0) goto L1e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r2.get(r0)
            cn.jiguang.ad.h$c r0 = (cn.jiguang.ad.h.c) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.remove(r3)
            return r0
        L1e:
            r2 = 0
            return r2
    }

    static /* synthetic */ cn.jiguang.ad.h.c a(cn.jiguang.ad.h r0, cn.jiguang.ab.g r1, int r2) {
            cn.jiguang.ad.h$c r0 = r0.a(r1, r2)
            return r0
    }

    public static cn.jiguang.ad.h a() {
            cn.jiguang.ad.h r0 = cn.jiguang.ad.h.a.a()
            return r0
    }

    private java.lang.String a(java.lang.String r9, boolean r10) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "normal"
            java.lang.String r2 = "ssl"
            if (r0 == 0) goto Le
            if (r10 == 0) goto Ld
            return r2
        Ld:
            return r1
        Le:
            r9.getClass()
            int r0 = r9.hashCode()
            java.lang.String r3 = "awake"
            java.lang.String r4 = "android_notification_state"
            java.lang.String r5 = "active_user"
            java.lang.String r6 = "account"
            r7 = -1
            switch(r0) {
                case -1245458676: goto Lc6;
                case -1177318867: goto Lbd;
                case -1091230153: goto Lb2;
                case -1051289244: goto La9;
                case -1039745817: goto La0;
                case -820729752: goto L95;
                case -693746763: goto L8a;
                case -295020531: goto L81;
                case -31313123: goto L75;
                case 96275: goto L67;
                case 2986591: goto L59;
                case 93223301: goto L4d;
                case 907150721: goto L3f;
                case 1350272347: goto L31;
                case 1973539834: goto L23;
                default: goto L21;
            }
        L21:
            goto Ld0
        L23:
            java.lang.String r0 = "identify_account"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L2d
            goto Ld0
        L2d:
            r7 = 14
            goto Ld0
        L31:
            java.lang.String r0 = "android_awake_target"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L3b
            goto Ld0
        L3b:
            r7 = 13
            goto Ld0
        L3f:
            java.lang.String r0 = "detach_account"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L49
            goto Ld0
        L49:
            r7 = 12
            goto Ld0
        L4d:
            boolean r0 = r9.equals(r3)
            if (r0 != 0) goto L55
            goto Ld0
        L55:
            r7 = 11
            goto Ld0
        L59:
            java.lang.String r0 = "aat3"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L63
            goto Ld0
        L63:
            r7 = 10
            goto Ld0
        L67:
            java.lang.String r0 = "aa3"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L71
            goto Ld0
        L71:
            r7 = 9
            goto Ld0
        L75:
            java.lang.String r0 = "android_awake2"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L7e
            goto Ld0
        L7e:
            r7 = 8
            goto Ld0
        L81:
            boolean r0 = r9.equals(r4)
            if (r0 != 0) goto L88
            goto Ld0
        L88:
            r7 = 7
            goto Ld0
        L8a:
            java.lang.String r0 = "android_awake"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L93
            goto Ld0
        L93:
            r7 = 6
            goto Ld0
        L95:
            java.lang.String r0 = "active_terminate"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L9e
            goto Ld0
        L9e:
            r7 = 5
            goto Ld0
        La0:
            boolean r0 = r9.equals(r1)
            if (r0 != 0) goto La7
            goto Ld0
        La7:
            r7 = 4
            goto Ld0
        La9:
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto Lb0
            goto Ld0
        Lb0:
            r7 = 3
            goto Ld0
        Lb2:
            java.lang.String r0 = "android_awake_target2"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lbb
            goto Ld0
        Lbb:
            r7 = 2
            goto Ld0
        Lbd:
            boolean r0 = r9.equals(r6)
            if (r0 != 0) goto Lc4
            goto Ld0
        Lc4:
            r7 = 1
            goto Ld0
        Lc6:
            java.lang.String r0 = "active_launch"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lcf
            goto Ld0
        Lcf:
            r7 = 0
        Ld0:
            switch(r7) {
                case 0: goto Le7;
                case 1: goto Le6;
                case 2: goto Le5;
                case 3: goto Le7;
                case 4: goto Le1;
                case 5: goto Le7;
                case 6: goto Le5;
                case 7: goto Le0;
                case 8: goto Le5;
                case 9: goto Le5;
                case 10: goto Le5;
                case 11: goto Le5;
                case 12: goto Le6;
                case 13: goto Le5;
                case 14: goto Le6;
                default: goto Ld3;
            }
        Ld3:
            java.util.Map<java.lang.String, java.util.LinkedHashSet<cn.jiguang.ab.g>> r0 = r8.f406f
            boolean r0 = r0.containsKey(r9)
            if (r0 != 0) goto Ldf
            if (r10 == 0) goto Lde
            return r2
        Lde:
            return r1
        Ldf:
            return r9
        Le0:
            return r4
        Le1:
            if (r10 == 0) goto Le4
            return r2
        Le4:
            return r1
        Le5:
            return r3
        Le6:
            return r6
        Le7:
            return r5
    }

    private void a(android.content.Context r8, int r9, cn.jiguang.ag.a r10, cn.jiguang.ab.g r11, cn.jiguang.ad.h.c r12) {
            r7 = this;
            cn.jiguang.y.g$a r0 = r12.f410b
            int r1 = r12.f413e
            java.util.Set<java.lang.String> r2 = r12.f412d
            byte[] r0 = a(r8, r0, r1, r2)
            java.lang.String r1 = "TcpReporter"
            if (r0 == 0) goto L9e
            int r2 = r0.length
            if (r2 != 0) goto L13
            goto L9e
        L13:
            cn.jiguang.ah.b r2 = cn.jiguang.ah.b.a()
            r3 = 50000(0xc350, float:7.0065E-41)
            int r4 = r12.f413e
            int r4 = r4 + r3
            cn.jiguang.ad.h$b r3 = new cn.jiguang.ad.h$b
            r3.<init>(r8, r12)
            r5 = 15000(0x3a98, double:7.411E-320)
            r2.b(r4, r5, r3)
            r2 = 1
            r12.f416h = r2
            int r2 = r10.a(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "send tcp data, len="
            r3.append(r4)
            int r4 = r0.length
            r3.append(r4)
            java.lang.String r4 = ", data="
            r3.append(r4)
            r3.append(r12)
            java.lang.String r4 = ", use ssl: "
            r3.append(r4)
            boolean r4 = r10 instanceof cn.jiguang.ag.b
            r3.append(r4)
            java.lang.String r4 = ", send "
            r3.append(r4)
            if (r2 != 0) goto L58
            java.lang.String r2 = "succeed"
            goto L5a
        L58:
            java.lang.String r2 = "failed"
        L5a:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.c(r1, r2)
            cn.jiguang.al.c r1 = cn.jiguang.al.c.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r10.f461h
            r2.append(r3)
            java.lang.String r3 = ":"
            r2.append(r3)
            int r10 = r10.f462i
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            java.util.Set<java.lang.String> r12 = r12.f412d
            java.lang.String r12 = r12.toString()
            int r0 = r0.length
            long r2 = (long) r0
            r1.b(r10, r12, r2)
            cn.jiguang.ah.b r10 = cn.jiguang.ah.b.a()
            r12 = 60000(0xea60, float:8.4078E-41)
            int r9 = r9 + r12
            cn.jiguang.ad.h$b r12 = new cn.jiguang.ad.h$b
            r12.<init>(r8, r11)
            r0 = 31000(0x7918, double:1.5316E-319)
            r10.b(r9, r0, r12)
            return
        L9e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "package data failed, give up, data="
            r9.append(r10)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            cn.jiguang.w.f.c(r1, r9)
            r9 = -1
            r7.a(r8, r12, r9)
            return
    }

    private void a(android.content.Context r10, cn.jiguang.ab.g r11) {
            r9 = this;
            java.lang.String r0 = "TcpReporter"
            if (r11 != 0) goto L6
            goto Lda
        L6:
            java.util.Map<cn.jiguang.ab.g, android.util.Pair<java.lang.Integer, cn.jiguang.ag.a>> r1 = r9.f403b     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r1 = r1.get(r11)     // Catch: java.lang.Throwable -> L6a
            android.util.Pair r1 = (android.util.Pair) r1     // Catch: java.lang.Throwable -> L6a
            if (r1 != 0) goto L12
            goto Lda
        L12:
            java.lang.Object r2 = r1.second     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.ag.a r2 = (cn.jiguang.ag.a) r2     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto Lda
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L20
            goto Lda
        L20:
            cn.jiguang.al.d r3 = cn.jiguang.al.d.a()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r11.a     // Catch: java.lang.Throwable -> L6a
            int r5 = r11.f270b     // Catch: java.lang.Throwable -> L6a
            int r6 = r2.f460g     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = r3.d(r4, r5, r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r11.a     // Catch: java.lang.Throwable -> L6a
            int r5 = r11.f270b     // Catch: java.lang.Throwable -> L6a
            int r4 = r2.a(r4, r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r5.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "start tcp report socket("
            r5.append(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r6 = r1.first     // Catch: java.lang.Throwable -> L6a
            r5.append(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "):"
            r5.append(r6)     // Catch: java.lang.Throwable -> L6a
            r5.append(r11)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = ", code: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L6a
            r5.append(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> L6a
            r5 = 0
            if (r4 == 0) goto L6c
            r9.a(r10, r11, r5)     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.al.d r1 = cn.jiguang.al.d.a()     // Catch: java.lang.Throwable -> L6a
            r1.g(r3, r4)     // Catch: java.lang.Throwable -> L6a
            goto Lc1
        L6a:
            r10 = move-exception
            goto Ld5
        L6c:
            cn.jiguang.ad.h$b r4 = new cn.jiguang.ad.h$b     // Catch: java.lang.Throwable -> L6a
            r6 = 2
            r4.<init>(r10, r6, r11)     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.z.b.c(r4)     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.al.d r4 = cn.jiguang.al.d.a()     // Catch: java.lang.Throwable -> L6a
            r4.g(r3, r5)     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.ad.h$b r3 = new cn.jiguang.ad.h$b     // Catch: java.lang.Throwable -> L6a
            r3.<init>(r10, r11)     // Catch: java.lang.Throwable -> L6a
        L81:
            java.util.concurrent.atomic.AtomicBoolean r4 = r9.a     // Catch: java.lang.Throwable -> L6a
            boolean r4 = r4.get()     // Catch: java.lang.Throwable -> L6a
            if (r4 != 0) goto Lc1
            java.nio.ByteBuffer r4 = r2.a()     // Catch: java.lang.Throwable -> L6a cn.jiguang.ad.e -> La6
            r9.a(r10, r4, r11)     // Catch: java.lang.Throwable -> L6a cn.jiguang.ad.e -> La6
            cn.jiguang.ah.b r4 = cn.jiguang.ah.b.a()     // Catch: java.lang.Throwable -> L6a cn.jiguang.ad.e -> La6
            java.lang.Object r6 = r1.first     // Catch: java.lang.Throwable -> L6a cn.jiguang.ad.e -> La6
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L6a cn.jiguang.ad.e -> La6
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L6a cn.jiguang.ad.e -> La6
            r7 = 60000(0xea60, float:8.4078E-41)
            int r6 = r6 + r7
            r7 = 31000(0x7918, double:1.5316E-319)
            r4.b(r6, r7, r3)     // Catch: java.lang.Throwable -> L6a cn.jiguang.ad.e -> La6
            goto L81
        La6:
            r1 = move-exception
            int r2 = r1.a     // Catch: java.lang.Throwable -> L6a
            r3 = -997(0xfffffffffffffc1b, float:NaN)
            if (r2 == r3) goto Lc1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r2.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = "recv failed with error:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L6a
            r2.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> L6a
        Lc1:
            r9.a(r10, r11, r5)     // Catch: java.lang.Throwable -> L6a
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.a     // Catch: java.lang.Throwable -> L6a
            boolean r10 = r10.get()     // Catch: java.lang.Throwable -> L6a
            if (r10 == 0) goto Ld2
            java.lang.String r10 = "Break receiving by wantStop"
        Lce:
            cn.jiguang.w.f.i(r0, r10)     // Catch: java.lang.Throwable -> L6a
            goto Lda
        Ld2:
            java.lang.String r10 = "disconnected"
            goto Lce
        Ld5:
            java.lang.String r11 = "socket exception"
            cn.jiguang.w.f.b(r0, r11, r10)
        Lda:
            return
    }

    private void a(android.content.Context r7, cn.jiguang.ab.g r8, int r9) {
            r6 = this;
            java.util.Map<cn.jiguang.ab.g, android.util.Pair<java.lang.Integer, cn.jiguang.ag.a>> r0 = r6.f403b
            java.lang.Object r0 = r0.remove(r8)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.String r1 = "TcpReporter"
            if (r0 == 0) goto L21
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.second
            java.io.Closeable r0 = (java.io.Closeable) r0
            cn.jiguang.av.x.a(r0)
            java.lang.String r0 = "closeSocket final"
            cn.jiguang.w.f.c(r1, r0)
            goto L22
        L21:
            r2 = 0
        L22:
            java.util.Map<cn.jiguang.ab.g, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ad.h$c>> r0 = r6.f404c
            java.lang.Object r0 = r0.remove(r8)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            if (r9 != 0) goto L33
            boolean r3 = cn.jiguang.av.n.a()
            if (r3 != 0) goto L33
            r9 = -2
        L33:
            java.lang.String r3 = ") at "
            java.lang.String r4 = "socket("
            if (r0 == 0) goto Lae
            int r5 = r0.size()
            if (r5 <= 0) goto Lae
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            if (r9 != 0) goto L5f
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            r5.append(r3)
            r5.append(r8)
            java.lang.String r8 = " is disconnected, go on send waiting request"
            r5.append(r8)
        L57:
            java.lang.String r8 = r5.toString()
            cn.jiguang.w.f.c(r1, r8)
            goto L77
        L5f:
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            r5.append(r3)
            r5.append(r8)
            java.lang.String r8 = " is disconnected, finish waiting request, code="
            r5.append(r8)
            r5.append(r9)
            goto L57
        L77:
            java.util.Collection r8 = r0.values()
            java.util.Iterator r8 = r8.iterator()
        L7f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lcd
            java.lang.Object r0 = r8.next()
            cn.jiguang.ad.h$c r0 = (cn.jiguang.ad.h.c) r0
            if (r0 != 0) goto L8e
            goto L7f
        L8e:
            cn.jiguang.ah.b r1 = cn.jiguang.ah.b.a()
            r2 = 50000(0xc350, float:7.0065E-41)
            int r3 = r0.f413e
            int r3 = r3 + r2
            r1.b(r3)
            if (r9 != 0) goto La1
            r6.a(r7, r0)
            goto L7f
        La1:
            cn.jiguang.ad.h$b r1 = new cn.jiguang.ad.h$b
            r2 = 3
            r1.<init>(r7, r2, r0)
            cn.jiguang.ad.h.b.a(r1, r9)
            cn.jiguang.z.b.c(r1)
            goto L7f
        Lae:
            if (r2 <= 0) goto Lcd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r2)
            r7.append(r3)
            r7.append(r8)
            java.lang.String r8 = " is disconnected, no task left"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            cn.jiguang.w.f.c(r1, r7)
        Lcd:
            return
    }

    private synchronized void a(android.content.Context r9, cn.jiguang.ab.g r10, cn.jiguang.ad.h.c r11) {
            r8 = this;
            monitor-enter(r8)
            java.util.Map<cn.jiguang.ab.g, android.util.Pair<java.lang.Integer, cn.jiguang.ag.a>> r0 = r8.f403b     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L75
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L16
            java.lang.Object r1 = r0.second     // Catch: java.lang.Throwable -> L11
            cn.jiguang.ag.a r1 = (cn.jiguang.ag.a) r1     // Catch: java.lang.Throwable -> L11
        Lf:
            r5 = r1
            goto L18
        L11:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L7a
        L16:
            r1 = 0
            goto Lf
        L18:
            java.util.Set<java.lang.String> r1 = r11.f412d     // Catch: java.lang.Throwable -> L75
            boolean r1 = r8.a(r9, r1)     // Catch: java.lang.Throwable -> L75
            if (r5 != 0) goto L5c
            r11 = 19
            r0 = 30720(0x7800, float:4.3048E-41)
            if (r1 == 0) goto L2c
            cn.jiguang.ag.b r2 = new cn.jiguang.ag.b     // Catch: java.lang.Throwable -> L11
            r2.<init>(r0, r11)     // Catch: java.lang.Throwable -> L11
            goto L31
        L2c:
            cn.jiguang.ag.c r2 = new cn.jiguang.ag.c     // Catch: java.lang.Throwable -> L11
            r2.<init>(r0, r11)     // Catch: java.lang.Throwable -> L11
        L31:
            int r11 = b()     // Catch: java.lang.Throwable -> L11
            java.util.Map<cn.jiguang.ab.g, android.util.Pair<java.lang.Integer, cn.jiguang.ag.a>> r0 = r8.f403b     // Catch: java.lang.Throwable -> L11
            android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r11, r2)     // Catch: java.lang.Throwable -> L11
            r0.put(r10, r3)     // Catch: java.lang.Throwable -> L11
            cn.jiguang.ad.h$b r11 = new cn.jiguang.ad.h$b     // Catch: java.lang.Throwable -> L11
            r0 = 1
            r11.<init>(r9, r0, r10)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L55
            boolean r9 = cn.jiguang.ab.c.g(r9)     // Catch: java.lang.Throwable -> L11
            if (r9 != 0) goto L52
            goto L55
        L52:
            java.lang.String r9 = "FUTURE_TASK"
            goto L57
        L55:
            java.lang.String r9 = "ONCE_TASK"
        L57:
            cn.jiguang.au.d.a(r9, r11)     // Catch: java.lang.Throwable -> L11
        L5a:
            r2 = r8
            goto L78
        L5c:
            boolean r1 = r5.b()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L5a
            java.lang.Object r0 = r0.first     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L75
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L75
            r2 = r8
            r3 = r9
            r6 = r10
            r7 = r11
            r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L72
            goto L78
        L72:
            r0 = move-exception
        L73:
            r9 = r0
            goto L7a
        L75:
            r0 = move-exception
            r2 = r8
            goto L73
        L78:
            monitor-exit(r8)
            return
        L7a:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L72
            throw r9
    }

    private void a(android.content.Context r4, cn.jiguang.ad.h.c r5, int r6) {
            r3 = this;
            cn.jiguang.ab.g r0 = r5.f414f
            if (r0 == 0) goto L17
            java.util.Map<cn.jiguang.ab.g, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ad.h$c>> r1 = r3.f404c
            java.lang.Object r0 = r1.get(r0)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            if (r0 == 0) goto L17
            int r1 = r5.f413e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.remove(r1)
        L17:
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r1 = 50000(0xc350, float:7.0065E-41)
            int r2 = r5.f413e
            int r2 = r2 + r1
            r0.b(r2)
            cn.jiguang.ad.h$b r0 = new cn.jiguang.ad.h$b
            r1 = 3
            r0.<init>(r4, r1, r5)
            cn.jiguang.ad.h.b.a(r0, r6)
            cn.jiguang.z.b.c(r0)
            return
    }

    private void a(android.content.Context r8, java.nio.ByteBuffer r9, cn.jiguang.ab.g r10) {
            r7 = this;
            java.lang.String r0 = "TcpReporter"
            if (r9 == 0) goto Lf3
            byte[] r1 = r9.array()     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto Lc
            goto Lf3
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r1.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "Received bytes - len:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L52
            byte[] r2 = r9.array()     // Catch: java.lang.Throwable -> L52
            int r2 = r2.length     // Catch: java.lang.Throwable -> L52
            r1.append(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = ", ipPort: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L52
            r1.append(r10)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L52
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L52
            byte[] r1 = r9.array()     // Catch: java.lang.Throwable -> L52
            int r1 = r1.length     // Catch: java.lang.Throwable -> L52
            r2 = 19
            java.lang.String r3 = "unknown_receive"
            r4 = -1
            if (r1 == r2) goto L55
            r1 = 1
            r7.b(r8, r10, r1)     // Catch: java.lang.Throwable -> L52
            r7.a(r8, r10, r4)     // Catch: java.lang.Throwable -> L52
            cn.jiguang.al.c r8 = cn.jiguang.al.c.a()     // Catch: java.lang.Throwable -> L52
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L52
            byte[] r9 = r9.array()     // Catch: java.lang.Throwable -> L52
            int r9 = r9.length     // Catch: java.lang.Throwable -> L52
        L4d:
            long r1 = (long) r9     // Catch: java.lang.Throwable -> L52
            r8.c(r10, r3, r1)     // Catch: java.lang.Throwable -> L52
            return
        L52:
            r8 = move-exception
            goto Lf9
        L55:
            r1 = 2
            byte r2 = r9.get(r1)     // Catch: java.lang.Throwable -> L52
            if (r2 == r1) goto L88
            if (r2 != 0) goto L5f
            goto L88
        L5f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r5.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = "wrong version "
            r5.append(r6)     // Catch: java.lang.Throwable -> L52
            r5.append(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L52
            cn.jiguang.w.f.i(r0, r2)     // Catch: java.lang.Throwable -> L52
            r7.b(r8, r10, r1)     // Catch: java.lang.Throwable -> L52
            r7.a(r8, r10, r4)     // Catch: java.lang.Throwable -> L52
            cn.jiguang.al.c r8 = cn.jiguang.al.c.a()     // Catch: java.lang.Throwable -> L52
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L52
            byte[] r9 = r9.array()     // Catch: java.lang.Throwable -> L52
            int r9 = r9.length     // Catch: java.lang.Throwable -> L52
            goto L4d
        L88:
            r1 = 15
            short r1 = r9.getShort(r1)     // Catch: java.lang.Throwable -> L52
            r2 = 17
            short r2 = r9.getShort(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r3.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "onResult seqId="
            r3.append(r4)     // Catch: java.lang.Throwable -> L52
            r3.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = " code="
            r3.append(r4)     // Catch: java.lang.Throwable -> L52
            r3.append(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L52
            cn.jiguang.w.f.c(r0, r3)     // Catch: java.lang.Throwable -> L52
            cn.jiguang.ah.b r3 = cn.jiguang.ah.b.a()     // Catch: java.lang.Throwable -> L52
            r4 = 50000(0xc350, float:7.0065E-41)
            int r4 = r4 + r1
            r3.b(r4)     // Catch: java.lang.Throwable -> L52
            cn.jiguang.ad.h$c r1 = r7.a(r10, r1)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto Lf2
            if (r2 != 0) goto Le7
            cn.jiguang.al.c r3 = cn.jiguang.al.c.a()     // Catch: java.lang.Throwable -> L52
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L52
            java.util.Set<java.lang.String> r4 = r1.f412d     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L52
            byte[] r9 = r9.array()     // Catch: java.lang.Throwable -> L52
            int r9 = r9.length     // Catch: java.lang.Throwable -> L52
            long r5 = (long) r9     // Catch: java.lang.Throwable -> L52
            r3.c(r10, r4, r5)     // Catch: java.lang.Throwable -> L52
            cn.jiguang.ad.h$b r9 = new cn.jiguang.ad.h$b     // Catch: java.lang.Throwable -> L52
            r10 = 3
            r9.<init>(r8, r10, r1)     // Catch: java.lang.Throwable -> L52
            cn.jiguang.ad.h.b.a(r9, r2)     // Catch: java.lang.Throwable -> L52
            cn.jiguang.z.b.c(r9)     // Catch: java.lang.Throwable -> L52
            return
        Le7:
            r9 = 401(0x191, float:5.62E-43)
            if (r2 != r9) goto Lef
            r7.a(r8, r10, r2)     // Catch: java.lang.Throwable -> L52
            return
        Lef:
            r7.a(r8, r1)     // Catch: java.lang.Throwable -> L52
        Lf2:
            return
        Lf3:
            java.lang.String r8 = "onReceive buffer is null"
            cn.jiguang.w.f.i(r0, r8)     // Catch: java.lang.Throwable -> L52
            return
        Lf9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "tcp reporter onReceive err:"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jiguang.w.f.i(r0, r8)
            return
    }

    static /* synthetic */ void a(cn.jiguang.ad.h r0, android.content.Context r1, cn.jiguang.ab.g r2) {
            r0.a(r1, r2)
            return
    }

    static /* synthetic */ void a(cn.jiguang.ad.h r0, android.content.Context r1, cn.jiguang.ab.g r2, int r3) {
            r0.a(r1, r2, r3)
            return
    }

    private void a(org.json.JSONObject r9) {
            r8 = this;
            if (r9 == 0) goto L52
            int r0 = r9.length()
            if (r0 != 0) goto L9
            goto L52
        L9:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: org.json.JSONException -> L52
            r0.<init>()     // Catch: org.json.JSONException -> L52
            java.util.Iterator r1 = r9.keys()     // Catch: org.json.JSONException -> L52
        L12:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> L52
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> L52
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L52
            org.json.JSONArray r3 = r9.optJSONArray(r2)     // Catch: org.json.JSONException -> L52
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet     // Catch: org.json.JSONException -> L52
            r4.<init>()     // Catch: org.json.JSONException -> L52
            if (r3 == 0) goto L46
            r5 = 0
        L2a:
            int r6 = r3.length()     // Catch: org.json.JSONException -> L52
            if (r5 >= r6) goto L46
            java.lang.String r6 = r3.getString(r5)     // Catch: org.json.JSONException -> L52
            cn.jiguang.ab.g r6 = cn.jiguang.ab.g.a(r6)     // Catch: org.json.JSONException -> L52
            if (r6 == 0) goto L43
            boolean r7 = r6.a()     // Catch: org.json.JSONException -> L52
            if (r7 == 0) goto L43
            r4.add(r6)     // Catch: org.json.JSONException -> L52
        L43:
            int r5 = r5 + 1
            goto L2a
        L46:
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L52
            goto L12
        L4a:
            boolean r9 = r0.isEmpty()     // Catch: org.json.JSONException -> L52
            if (r9 != 0) goto L52
            r8.f406f = r0     // Catch: org.json.JSONException -> L52
        L52:
            return
    }

    private boolean a(android.content.Context r2, java.util.Set<java.lang.String> r3) {
            r1 = this;
            boolean r2 = cn.jiguang.ab.c.g(r2)
            if (r2 == 0) goto L18
            r2 = 1
            if (r3 == 0) goto L17
            java.lang.String r0 = "sdk_jid"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L17
            int r3 = r3.size()
            if (r3 == r2) goto L18
        L17:
            return r2
        L18:
            r2 = 0
            return r2
    }

    private static byte[] a(android.content.Context r2, long r3, byte[] r5) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.P()
            java.lang.Object r0 = cn.jiguang.e.b.a(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1b
            cn.jiguang.e.a r0 = cn.jiguang.e.a.Q()
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
        L1b:
            java.lang.String r2 = cn.jiguang.av.v.f(r0)
            java.lang.String r0 = cn.jiguang.av.v.c(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            byte[] r2 = cn.jiguang.av.v.c(r2)
            r3 = 16
            if (r2 != 0) goto L40
            byte[] r2 = new byte[r3]
            return r2
        L40:
            int r4 = r2.length
            if (r4 != r3) goto L44
            return r2
        L44:
            byte[] r4 = new byte[r3]
            int r2 = r2.length
            int r2 = java.lang.Math.min(r2, r3)
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r4, r3, r2)
            return r4
    }

    private static byte[] a(android.content.Context r4, cn.jiguang.y.g.a r5, int r6, java.util.Set<java.lang.String> r7) {
            byte[] r7 = r5.b()
            if (r7 == 0) goto L79
            int r0 = r7.length
            if (r0 == 0) goto L79
            int r0 = r7.length
            r1 = 30683(0x77db, float:4.2996E-41)
            if (r0 <= r1) goto Lf
            goto L79
        Lf:
            cn.jiguang.ai.b r0 = new cn.jiguang.ai.b
            int r1 = r7.length
            int r1 = r1 + 37
            r0.<init>(r1)
            r1 = 0
            r0.b(r1)
            r2 = 2
            r0.a(r2)
            cn.jiguang.ad.b r2 = cn.jiguang.ad.b.a()
            short r2 = r2.b()
            long r2 = (long) r2
            r0.a(r2)
            cn.jiguang.e.a r2 = cn.jiguang.e.a.M()
            java.lang.Object r2 = cn.jiguang.e.b.a(r4, r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.b(r2)
            byte[] r4 = a(r4, r2, r7)
            r0.a(r4)
            long r2 = (long) r1
            r0.a(r2)
            r0.b(r6)
            cn.jiguang.av.t$a r4 = r5.d()
            int r4 = r4.d()
            cn.jiguang.av.t$a r6 = r5.d()
            byte[] r6 = r6.a()
            int r5 = r5.c()
            r0.a(r5)
            r0.a(r1)
            r0.a(r4)
            r0.b(r6)
            r0.a(r7)
            int r4 = r0.a()
            r0.b(r4, r1)
            byte[] r4 = r0.b()
            return r4
        L79:
            r4 = 0
            return r4
    }

    private static synchronized int b() {
            java.lang.Class<cn.jiguang.ad.h> r0 = cn.jiguang.ad.h.class
            monitor-enter(r0)
            int r1 = cn.jiguang.ad.h.f402d     // Catch: java.lang.Throwable -> Ld
            int r1 = r1 + 1
            int r1 = r1 % 10000
            cn.jiguang.ad.h.f402d = r1     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public static synchronized int b(android.content.Context r5) {
            java.lang.Class<cn.jiguang.ad.h> r0 = cn.jiguang.ad.h.class
            monitor-enter(r0)
            cn.jiguang.e.a r1 = cn.jiguang.e.a.aA()     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = cn.jiguang.e.b.b(r5, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L23
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r1 != 0) goto L25
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L23
            int r1 = r1.nextInt(r2)     // Catch: java.lang.Throwable -> L23
            int r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r5 = move-exception
            goto L42
        L25:
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L23
            r3 = 1
            int r1 = r1 + r3
            int r1 = r1 % r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L23
            cn.jiguang.e.a r4 = cn.jiguang.e.a.aA()     // Catch: java.lang.Throwable -> L23
            cn.jiguang.e.a r2 = r4.a(r2)     // Catch: java.lang.Throwable -> L23
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r3]     // Catch: java.lang.Throwable -> L23
            r4 = 0
            r3[r4] = r2     // Catch: java.lang.Throwable -> L23
            cn.jiguang.e.b.a(r5, r3)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return r1
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r5
    }

    private java.util.LinkedHashSet<cn.jiguang.ab.g> b(android.content.Context r7, java.util.Set<java.lang.String> r8) {
            r6 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.String r1 = cn.jiguang.aa.a.d()
            cn.jiguang.ab.g r1 = cn.jiguang.ab.g.a(r1)
            if (r1 == 0) goto L19
            boolean r2 = r1.a()
            if (r2 == 0) goto L19
            r0.add(r1)
            goto L3b
        L19:
            java.util.Set r7 = r6.c(r7, r8)
            if (r7 == 0) goto L3b
            java.util.Iterator r7 = r7.iterator()
        L23:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3b
            java.lang.Object r8 = r7.next()
            cn.jiguang.ab.g r8 = (cn.jiguang.ab.g) r8
            if (r8 == 0) goto L23
            boolean r1 = r8.a()
            if (r1 == 0) goto L23
            r0.add(r8)
            goto L23
        L3b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "tcp report find urls="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "TcpReporter"
            cn.jiguang.w.f.c(r8, r7)
            java.util.Map<cn.jiguang.ab.g, java.lang.Long> r7 = r6.f405e     // Catch: java.lang.Throwable -> L81
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> L81
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L81
        L5b:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L83
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L81
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L81
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L81
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L81
            long r4 = r1.longValue()     // Catch: java.lang.Throwable -> L81
            long r2 = r2 - r4
            r4 = 600000(0x927c0, double:2.964394E-318)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L5b
            r7.remove()     // Catch: java.lang.Throwable -> L81
            goto L5b
        L81:
            r7 = move-exception
            goto L9d
        L83:
            java.util.Map<cn.jiguang.ab.g, java.lang.Long> r7 = r6.f405e     // Catch: java.lang.Throwable -> L81
            java.util.Set r7 = r7.keySet()     // Catch: java.lang.Throwable -> L81
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L81
        L8d:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto La2
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L81
            cn.jiguang.ab.g r1 = (cn.jiguang.ab.g) r1     // Catch: java.lang.Throwable -> L81
            r0.remove(r1)     // Catch: java.lang.Throwable -> L81
            goto L8d
        L9d:
            java.lang.String r1 = "remove black tcp urls err"
            cn.jiguang.w.f.d(r8, r1, r7)
        La2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "tcp report find urls and remove black List Tcp Urls ="
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            cn.jiguang.w.f.c(r8, r7)
            return r0
    }

    private void b(android.content.Context r10, cn.jiguang.ab.g r11) {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "socket at "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " is connected, deal with waiting request"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TcpReporter"
            cn.jiguang.w.f.c(r1, r0)
            java.util.Map<cn.jiguang.ab.g, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ad.h$c>> r0 = r9.f404c
            java.lang.Object r0 = r0.get(r11)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.util.Map<cn.jiguang.ab.g, android.util.Pair<java.lang.Integer, cn.jiguang.ag.a>> r1 = r9.f403b
            java.lang.Object r1 = r1.get(r11)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 != 0) goto L2e
            return
        L2e:
            if (r0 == 0) goto L6c
            java.lang.Object r2 = r1.second
            r6 = r2
            cn.jiguang.ag.a r6 = (cn.jiguang.ag.a) r6
            if (r6 == 0) goto L6c
            boolean r2 = r6.b()
            if (r2 == 0) goto L6c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r0.next()
            r8 = r2
            cn.jiguang.ad.h$c r8 = (cn.jiguang.ad.h.c) r8
            if (r8 == 0) goto L67
            boolean r2 = r8.f416h
            if (r2 != 0) goto L67
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r5 = r2.intValue()
            r3 = r9
            r4 = r10
            r7 = r11
            r3.a(r4, r5, r6, r7, r8)
            goto L69
        L67:
            r4 = r10
            r7 = r11
        L69:
            r10 = r4
            r11 = r7
            goto L45
        L6c:
            r4 = r10
            r7 = r11
            cn.jiguang.ah.b r10 = cn.jiguang.ah.b.a()
            java.lang.Object r11 = r1.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0 = 60000(0xea60, float:8.4078E-41)
            int r11 = r11 + r0
            cn.jiguang.ad.h$b r0 = new cn.jiguang.ad.h$b
            r0.<init>(r4, r7)
            r1 = 31000(0x7918, double:1.5316E-319)
            r10.b(r11, r1, r0)
            return
    }

    private void b(android.content.Context r11, cn.jiguang.ab.g r12, int r13) {
            r10 = this;
            if (r12 != 0) goto L3
            return
        L3:
            java.net.InetAddress r0 = r12.f271c     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.getHostAddress()     // Catch: java.lang.Throwable -> L22
        Lb:
            r3 = r0
            goto L10
        Ld:
            java.lang.String r0 = r12.a     // Catch: java.lang.Throwable -> L22
            goto Lb
        L10:
            cn.jiguang.ab.k r1 = new cn.jiguang.ab.k     // Catch: java.lang.Throwable -> L22
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L22
            int r4 = r12.f270b     // Catch: java.lang.Throwable -> L22
            long r5 = cn.jiguang.d.b.b(r11)     // Catch: java.lang.Throwable -> L22
            r7 = 0
            r2 = 3
            r9 = r13
            r1.a(r2, r3, r4, r5, r7, r9)     // Catch: java.lang.Throwable -> L22
        L22:
            java.util.Map<cn.jiguang.ab.g, java.lang.Long> r11 = r10.f405e
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            r11.put(r12, r13)
            return
    }

    static /* synthetic */ void b(cn.jiguang.ad.h r0, android.content.Context r1, cn.jiguang.ab.g r2) {
            r0.b(r1, r2)
            return
    }

    private java.util.Set<cn.jiguang.ab.g> c(android.content.Context r5, java.util.Set<java.lang.String> r6) {
            r4 = this;
            r4.c(r5)
            boolean r5 = r4.a(r5, r6)
            if (r5 == 0) goto Lc
            java.lang.String r0 = "ssl"
            goto Le
        Lc:
            java.lang.String r0 = "normal"
        Le:
            if (r6 == 0) goto L4a
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L17
            goto L4a
        L17:
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        L1c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r4.a(r2, r5)
            java.util.Map<java.lang.String, java.util.LinkedHashSet<cn.jiguang.ab.g>> r3 = r4.f406f
            java.lang.Object r2 = r3.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L4a
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L3d
            goto L4a
        L3d:
            if (r1 != 0) goto L41
            r1 = r2
            goto L44
        L41:
            r1.retainAll(r2)
        L44:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L1c
        L4a:
            java.util.Map<java.lang.String, java.util.LinkedHashSet<cn.jiguang.ab.g>> r5 = r4.f406f
            java.lang.Object r5 = r5.get(r0)
            java.util.Set r5 = (java.util.Set) r5
            return r5
        L53:
            return r1
    }

    private void c(android.content.Context r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.LinkedHashSet<cn.jiguang.ab.g>> r0 = r1.f406f
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
        La:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aJ()
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L22
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L22
            r0.<init>(r2)     // Catch: org.json.JSONException -> L22
            r1.a(r0)     // Catch: org.json.JSONException -> L22
        L22:
            return
    }

    public cn.jiguang.ad.h.c a(android.content.Context r2, org.json.JSONObject r3, cn.jiguang.y.g.a r4, java.io.File r5, java.util.Set<java.lang.String> r6, cn.jiguang.api.ReportCallBack r7, java.lang.String r8) {
            r1 = this;
            cn.jiguang.ad.h$c r0 = new cn.jiguang.ad.h$c
            r0.<init>()
            r0.a = r3
            r0.f410b = r4
            r0.f411c = r5
            r0.f412d = r6
            int r2 = b(r2)
            r0.f413e = r2
            r0.f417i = r7
            r0.f418j = r8
            return r0
    }

    public void a(android.content.Context r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "closeSocket sockets:"
            r0.append(r1)
            java.util.Map<cn.jiguang.ab.g, android.util.Pair<java.lang.Integer, cn.jiguang.ag.a>> r1 = r5.f403b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TcpReporter"
            cn.jiguang.w.f.c(r1, r0)
            java.util.Map<cn.jiguang.ab.g, android.util.Pair<java.lang.Integer, cn.jiguang.ag.a>> r0 = r5.f403b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            cn.jiguang.ab.g r2 = (cn.jiguang.ab.g) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "closeSocket IpPort:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            cn.jiguang.w.f.c(r1, r3)
            r3 = -3
            r5.a(r6, r2, r3)
            goto L22
        L4d:
            return
    }

    public void a(android.content.Context r9, cn.jiguang.ad.h.c r10) {
            r8 = this;
            java.lang.String r0 = "TcpReporter"
            java.util.LinkedHashSet<cn.jiguang.ab.g> r1 = r10.f415g     // Catch: java.lang.Throwable -> L30
            r2 = 0
            if (r1 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 == 0) goto L33
            cn.jiguang.ah.b r3 = cn.jiguang.ah.b.a()     // Catch: java.lang.Throwable -> L30
            r3.a(r9)     // Catch: java.lang.Throwable -> L30
            java.util.Set<java.lang.String> r3 = r10.f412d     // Catch: java.lang.Throwable -> L30
            java.util.LinkedHashSet r3 = r8.b(r9, r3)     // Catch: java.lang.Throwable -> L30
            r10.f415g = r3     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "tcp report begin="
            r3.append(r4)     // Catch: java.lang.Throwable -> L30
            r3.append(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L30
            cn.jiguang.w.f.c(r0, r3)     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r9 = move-exception
            goto L114
        L33:
            boolean r3 = cn.jiguang.av.n.a()     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L3e
            r1 = -2
            r8.a(r9, r10, r1)     // Catch: java.lang.Throwable -> L30
            return
        L3e:
            java.util.LinkedHashSet<cn.jiguang.ab.g> r3 = r10.f415g     // Catch: java.lang.Throwable -> L30
            r4 = -1
            if (r3 == 0) goto L110
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L4b
            goto L110
        L4b:
            java.util.Map<cn.jiguang.ab.g, android.util.Pair<java.lang.Integer, cn.jiguang.ag.a>> r3 = r8.f403b     // Catch: java.lang.Throwable -> L30
            java.util.Set r3 = r3.keySet()     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L30
        L55:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L7e
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L30
            cn.jiguang.ab.g r5 = (cn.jiguang.ab.g) r5     // Catch: java.lang.Throwable -> L30
            java.util.LinkedHashSet<cn.jiguang.ab.g> r6 = r10.f415g     // Catch: java.lang.Throwable -> L30
            boolean r6 = r6.contains(r5)     // Catch: java.lang.Throwable -> L30
            if (r6 == 0) goto L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = "use exist ipPort="
            r3.append(r6)     // Catch: java.lang.Throwable -> L30
            r3.append(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L30
            cn.jiguang.w.f.c(r0, r3)     // Catch: java.lang.Throwable -> L30
            goto L7f
        L7e:
            r5 = 0
        L7f:
            if (r5 != 0) goto Ld0
            java.util.LinkedHashSet<cn.jiguang.ab.g> r3 = r10.f415g     // Catch: java.lang.Throwable -> La9
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> La9
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> La9
            if (r5 == 0) goto Lab
            java.lang.Object r3 = r3.next()     // Catch: java.lang.Throwable -> La9
            r5 = r3
            cn.jiguang.ab.g r5 = (cn.jiguang.ab.g) r5     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r3.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = "use next ipPort="
            r3.append(r6)     // Catch: java.lang.Throwable -> La9
            r3.append(r5)     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La9
            cn.jiguang.w.f.c(r0, r3)     // Catch: java.lang.Throwable -> La9
            goto Ld0
        La9:
            r1 = move-exception
            goto Lb4
        Lab:
            r8.a(r9, r10, r4)     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = "use next no has ipPort "
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> La9
            return
        Lb4:
            r8.a(r9, r10, r4)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r9.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r10 = "use next no has ipPort err:"
            r9.append(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.String r10 = r1.getMessage()     // Catch: java.lang.Throwable -> L30
            r9.append(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L30
            cn.jiguang.w.f.c(r0, r9)     // Catch: java.lang.Throwable -> L30
            return
        Ld0:
            r10.f414f = r5     // Catch: java.lang.Throwable -> L30
            java.util.LinkedHashSet<cn.jiguang.ab.g> r3 = r10.f415g     // Catch: java.lang.Throwable -> L30
            r3.remove(r5)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto Led
            cn.jiguang.ah.b r1 = cn.jiguang.ah.b.a()     // Catch: java.lang.Throwable -> L30
            int r3 = r10.f413e     // Catch: java.lang.Throwable -> L30
            r4 = 50000(0xc350, float:7.0065E-41)
            int r3 = r3 + r4
            cn.jiguang.ad.h$b r4 = new cn.jiguang.ad.h$b     // Catch: java.lang.Throwable -> L30
            r4.<init>(r9, r10)     // Catch: java.lang.Throwable -> L30
            r6 = 15000(0x3a98, double:7.411E-320)
            r1.b(r3, r6, r4)     // Catch: java.lang.Throwable -> L30
        Led:
            java.util.Map<cn.jiguang.ab.g, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ad.h$c>> r1 = r8.f404c     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L101
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            java.util.Map<cn.jiguang.ab.g, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ad.h$c>> r3 = r8.f404c     // Catch: java.lang.Throwable -> L30
            r3.put(r5, r1)     // Catch: java.lang.Throwable -> L30
        L101:
            r10.f416h = r2     // Catch: java.lang.Throwable -> L30
            int r2 = r10.f413e     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L30
            r1.put(r2, r10)     // Catch: java.lang.Throwable -> L30
            r8.a(r9, r5, r10)     // Catch: java.lang.Throwable -> L30
            return
        L110:
            r8.a(r9, r10, r4)     // Catch: java.lang.Throwable -> L30
            return
        L114:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "tcp upload e:"
            r10.append(r1)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jiguang.w.f.i(r0, r9)
            return
    }
}
