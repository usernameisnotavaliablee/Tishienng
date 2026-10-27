package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l {

    /* renamed from: cn.jiguang.v.l$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class a {
        private static final java.util.Map<java.lang.String, cn.jiguang.v.l.a.d> a = null;

        /* renamed from: cn.jiguang.v.l$a$a, reason: collision with other inner class name */
        private static class C0046a implements cn.jiguang.v.l.a.d {
            private C0046a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ C0046a(cn.jiguang.v.l.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // cn.jiguang.v.l.a.d
            public java.lang.Integer a() {
                    r1 = this;
                    java.lang.Integer r0 = cn.jiguang.m.a.b()
                    return r0
            }

            @Override // cn.jiguang.v.l.a.d
            public void a(android.content.Context r1, org.json.JSONObject r2) {
                    r0 = this;
                    cn.jiguang.m.a.b(r1)
                    return
            }
        }

        private static class b implements cn.jiguang.v.l.a.d {
            private b() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ b(cn.jiguang.v.l.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // cn.jiguang.v.l.a.d
            public java.lang.Integer a() {
                    r1 = this;
                    java.lang.Integer r0 = cn.jiguang.v.h.c()
                    return r0
            }

            @Override // cn.jiguang.v.l.a.d
            public void a(android.content.Context r1, org.json.JSONObject r2) {
                    r0 = this;
                    cn.jiguang.v.h.b(r1)
                    return
            }
        }

        private static class c implements cn.jiguang.v.l.a.d {


            private c() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ c(cn.jiguang.v.l.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // cn.jiguang.v.l.a.d
            public java.lang.Integer a() {
                    r4 = this;
                    java.lang.String r0 = "ConfigHandlerManager"
                    boolean r1 = cn.jiguang.a.a.b()     // Catch: java.lang.Throwable -> L2b
                    if (r1 == 0) goto L2d
                    cn.jiguang.dy.b r1 = cn.jiguang.dy.b.a()     // Catch: java.lang.Throwable -> L11
                    java.lang.Integer r0 = r1.b()     // Catch: java.lang.Throwable -> L11
                    return r0
                L11:
                    r1 = move-exception
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                    r2.<init>()     // Catch: java.lang.Throwable -> L2b
                    java.lang.String r3 = "getProtocolVersion failed - DY supported but error: "
                    r2.append(r3)     // Catch: java.lang.Throwable -> L2b
                    java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L2b
                    r2.append(r1)     // Catch: java.lang.Throwable -> L2b
                    java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L2b
                    cn.jiguang.w.f.l(r0, r1)     // Catch: java.lang.Throwable -> L2b
                    goto L4b
                L2b:
                    r1 = move-exception
                    goto L33
                L2d:
                    java.lang.String r1 = "getProtocolVersion - DY not supported"
                    cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L2b
                    goto L4b
                L33:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "getProtocolVersion failed - check DY support error: "
                    r2.append(r3)
                    java.lang.String r1 = r1.getMessage()
                    r2.append(r1)
                    java.lang.String r1 = r2.toString()
                    cn.jiguang.w.f.l(r0, r1)
                L4b:
                    r0 = 0
                    return r0
            }

            @Override // cn.jiguang.v.l.a.d
            public void a(android.content.Context r4, org.json.JSONObject r5) {
                    r3 = this;
                    java.lang.String r0 = "dy_id"
                    java.lang.String r1 = "ConfigHandlerManager"
                    if (r4 == 0) goto L41
                    if (r5 != 0) goto L9
                    goto L41
                L9:
                    boolean r2 = r5.has(r0)     // Catch: java.lang.Throwable -> L15
                    if (r2 != 0) goto L17
                    java.lang.String r4 = "updateImmediately failed: dy_id not found in config"
                L11:
                    cn.jiguang.w.f.i(r1, r4)     // Catch: java.lang.Throwable -> L15
                    return
                L15:
                    r4 = move-exception
                    goto L44
                L17:
                    int r5 = r5.optInt(r0)     // Catch: java.lang.Throwable -> L15
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
                    r0.<init>()     // Catch: java.lang.Throwable -> L15
                    java.lang.String r2 = "Processing dy config with dy_id: "
                    r0.append(r2)     // Catch: java.lang.Throwable -> L15
                    r0.append(r5)     // Catch: java.lang.Throwable -> L15
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L15
                    cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L15
                    boolean r0 = cn.jiguang.a.a.b()     // Catch: java.lang.Throwable -> L15
                    if (r0 == 0) goto L3e
                    cn.jiguang.v.l$a$c$1 r0 = new cn.jiguang.v.l$a$c$1     // Catch: java.lang.Throwable -> L15
                    r0.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L15
                    cn.jiguang.z.b.d(r0)     // Catch: java.lang.Throwable -> L15
                    return
                L3e:
                    java.lang.String r4 = "Skip dy config update: dynamic loading not supported"
                    goto L11
                L41:
                    java.lang.String r4 = "updateImmediately failed: context or config is null"
                    goto L11
                L44:
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r0 = "updateImmediately failed: "
                    r5.append(r0)
                    java.lang.String r4 = r4.getMessage()
                    r5.append(r4)
                    java.lang.String r4 = r5.toString()
                    cn.jiguang.w.f.l(r1, r4)
                    return
            }
        }

        public interface d {
            java.lang.Integer a();

            void a(android.content.Context r1, org.json.JSONObject r2);
        }

        private static class e implements cn.jiguang.v.l.a.d {
            private e() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ e(cn.jiguang.v.l.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // cn.jiguang.v.l.a.d
            public java.lang.Integer a() {
                    r1 = this;
                    java.lang.Integer r0 = cn.jiguang.v.i.c()
                    return r0
            }

            @Override // cn.jiguang.v.l.a.d
            public void a(android.content.Context r1, org.json.JSONObject r2) {
                    r0 = this;
                    cn.jiguang.v.i.b(r1)
                    return
            }
        }

        private static class f implements cn.jiguang.v.l.a.d {
            private f() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ f(cn.jiguang.v.l.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // cn.jiguang.v.l.a.d
            public java.lang.Integer a() {
                    r1 = this;
                    java.lang.Integer r0 = cn.jiguang.aj.i.b()
                    return r0
            }

            @Override // cn.jiguang.v.l.a.d
            public void a(android.content.Context r1, org.json.JSONObject r2) {
                    r0 = this;
                    cn.jiguang.aj.i.c(r1)
                    return
            }
        }

        private static class g implements cn.jiguang.v.l.a.d {
            private g() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ g(cn.jiguang.v.l.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // cn.jiguang.v.l.a.d
            public java.lang.Integer a() {
                    r1 = this;
                    cn.jiguang.y.a r0 = cn.jiguang.y.a.b()
                    java.lang.Integer r0 = r0.a()
                    return r0
            }

            @Override // cn.jiguang.v.l.a.d
            public void a(android.content.Context r1, org.json.JSONObject r2) {
                    r0 = this;
                    cn.jiguang.y.a r2 = cn.jiguang.y.a.b()
                    r2.a(r1)
                    return
            }
        }

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                cn.jiguang.v.l.a.a = r0
                cn.jiguang.v.l$a$a r1 = new cn.jiguang.v.l$a$a
                r2 = 0
                r1.<init>(r2)
                java.lang.String r3 = "awake"
                r0.put(r3, r1)
                cn.jiguang.v.l$a$b r1 = new cn.jiguang.v.l$a$b
                r1.<init>(r2)
                java.lang.String r3 = "banned"
                r0.put(r3, r1)
                cn.jiguang.v.l$a$c r1 = new cn.jiguang.v.l$a$c
                r1.<init>(r2)
                java.lang.String r3 = "dy"
                r0.put(r3, r1)
                cn.jiguang.v.l$a$g r1 = new cn.jiguang.v.l$a$g
                r1.<init>(r2)
                java.lang.String r3 = "sis"
                r0.put(r3, r1)
                cn.jiguang.v.l$a$f r1 = new cn.jiguang.v.l$a$f
                r1.<init>(r2)
                java.lang.String r3 = "sentry"
                r0.put(r3, r1)
                cn.jiguang.v.l$a$e r1 = new cn.jiguang.v.l$a$e
                r1.<init>(r2)
                java.lang.String r2 = "limit"
                r0.put(r2, r1)
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        public static cn.jiguang.v.l.a.d a(java.lang.String r1) {
                java.util.Map<java.lang.String, cn.jiguang.v.l$a$d> r0 = cn.jiguang.v.l.a.a
                java.lang.Object r1 = r0.get(r1)
                cn.jiguang.v.l$a$d r1 = (cn.jiguang.v.l.a.d) r1
                return r1
        }
    }

    public static class b {
        private static java.util.Map<java.lang.Integer, java.lang.Integer> a;

        private static class a {
            private static cn.jiguang.dy.b.a a;


            static {
                    cn.jiguang.v.l$b$a$1 r0 = new cn.jiguang.v.l$b$a$1
                    r0.<init>()
                    cn.jiguang.v.l.b.a.a = r0
                    return
            }

            public a() {
                    r1 = this;
                    r1.<init>()
                    return
            }

            static /* synthetic */ cn.jiguang.dy.b.a a() {
                    cn.jiguang.dy.b$a r0 = cn.jiguang.v.l.b.a.a
                    return r0
            }
        }

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                cn.jiguang.v.l.b.a = r0
                r1 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 600000(0x927c0, float:8.40779E-40)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.put(r1, r2)
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = cn.jiguang.v.l.b.a
                r1 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 480000(0x75300, float:6.72623E-40)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.put(r1, r2)
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = cn.jiguang.v.l.b.a
                r1 = 2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 360000(0x57e40, float:5.04467E-40)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.put(r1, r2)
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = cn.jiguang.v.l.b.a
                r1 = 3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 240000(0x3a980, float:3.36312E-40)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.put(r1, r2)
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = cn.jiguang.v.l.b.a
                r1 = 4
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 180000(0x2bf20, float:2.52234E-40)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.put(r1, r2)
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = cn.jiguang.v.l.b.a
                r1 = 5
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 60000(0xea60, float:8.4078E-41)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.put(r1, r2)
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = cn.jiguang.v.l.b.a
                r1 = 6
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 30000(0x7530, float:4.2039E-41)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.put(r1, r2)
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = cn.jiguang.v.l.b.a
                r1 = 7
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 10000(0x2710, float:1.4013E-41)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.put(r1, r2)
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = cn.jiguang.v.l.b.a
                r1 = 8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 5000(0x1388, float:7.006E-42)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.put(r1, r2)
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        public static cn.jiguang.dy.b.a a() {
                cn.jiguang.dy.b$a r0 = cn.jiguang.v.l.b.a.a()
                return r0
        }

        public static boolean a(android.content.Context r2, boolean r3, long r4, long r6, long r8, java.lang.String r10, java.lang.Runnable r11) {
                if (r3 == 0) goto L87
                r0 = 0
                int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r3 <= 0) goto L87
                long r4 = r4 - r6
                r6 = 2
                long r8 = r8 * r6
                int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r3 < 0) goto L87
                cn.jiguang.av.l r3 = cn.jiguang.av.l.a()
                boolean r3 = r3.b(r10)
                java.lang.String r4 = "delayed tag:"
                java.lang.String r5 = "ResetConfigurationHelper"
                r6 = 1
                if (r3 == 0) goto L38
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                r2.append(r10)
                java.lang.String r3 = ", is has delayed"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                cn.jiguang.w.f.c(r5, r2)
                return r6
            L38:
                int r3 = cn.jiguang.h.b.c(r2, r10)
                java.util.Map<java.lang.Integer, java.lang.Integer> r7 = cn.jiguang.v.l.b.a
                java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
                java.lang.Object r7 = r7.get(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                if (r7 != 0) goto L50
                r7 = 5000(0x1388, float:7.006E-42)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            L50:
                int r7 = r7.intValue()
                int r7 = cn.jiguang.av.u.a(r7)
                long r7 = (long) r7
                cn.jiguang.av.l r9 = cn.jiguang.av.l.a()
                r9.a(r10, r11, r7)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r4)
                r9.append(r10)
                java.lang.String r4 = ", time:"
                r9.append(r4)
                r9.append(r7)
                java.lang.String r4 = ", n:"
                r9.append(r4)
                r9.append(r3)
                java.lang.String r4 = r9.toString()
                cn.jiguang.w.f.c(r5, r4)
                int r3 = r3 + r6
                cn.jiguang.h.b.a(r2, r10, r3)
                return r6
            L87:
                r3 = 0
                cn.jiguang.h.b.a(r2, r10, r3)
                return r3
        }
    }

    private static class c {
        java.lang.Integer a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.Integer f1537b;

        c(java.lang.Integer r1, java.lang.Integer r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f1537b = r2
                return
        }

        public boolean a(int r4) {
                r3 = this;
                java.lang.Integer r0 = r3.a
                r1 = 1
                if (r0 != 0) goto La
                java.lang.Integer r2 = r3.f1537b
                if (r2 != 0) goto La
                return r1
            La:
                r2 = 0
                if (r0 == 0) goto L14
                int r0 = r0.intValue()
                if (r4 >= r0) goto L14
                return r2
            L14:
                java.lang.Integer r0 = r3.f1537b
                if (r0 == 0) goto L1f
                int r0 = r0.intValue()
                if (r4 <= r0) goto L1f
                return r2
            L1f:
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "VersionRange{min="
                r0.append(r1)
                java.lang.Integer r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", max="
                r0.append(r1)
                java.lang.Integer r1 = r2.f1537b
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public l() {
            r1 = this;
            r1.<init>()
            return
    }

    private static cn.jiguang.v.l.c a(java.lang.String r8) {
            java.lang.String r0 = "]"
            java.lang.String r1 = "["
            java.lang.String r2 = "ResetConfigurationHelper"
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            r4 = 0
            if (r3 == 0) goto Le
            return r4
        Le:
            java.lang.String r3 = r8.trim()     // Catch: java.lang.Exception -> L3f
            boolean r5 = r3.startsWith(r1)     // Catch: java.lang.Exception -> L3f
            if (r5 == 0) goto L96
            boolean r5 = r3.endsWith(r0)     // Catch: java.lang.Exception -> L3f
            if (r5 != 0) goto L20
            goto L96
        L20:
            java.lang.String r5 = ","
            java.lang.String[] r5 = r3.split(r5)     // Catch: java.lang.Exception -> L3f
            int r6 = r5.length     // Catch: java.lang.Exception -> L3f
            r7 = 2
            if (r6 == r7) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3f
            r0.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = "Failed to parse version range: invalid number of parts, expected 2 parts separated by comma, content: "
            r0.append(r1)     // Catch: java.lang.Exception -> L3f
            r0.append(r3)     // Catch: java.lang.Exception -> L3f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L3f
            cn.jiguang.w.f.c(r2, r0)     // Catch: java.lang.Exception -> L3f
            return r4
        L3f:
            r0 = move-exception
            goto L9c
        L41:
            r3 = 0
            r6 = r5[r3]     // Catch: java.lang.Exception -> L3f
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Exception -> L3f
            boolean r1 = r6.startsWith(r1)     // Catch: java.lang.Exception -> L3f
            r7 = 1
            if (r1 == 0) goto L57
            java.lang.String r1 = r6.substring(r7)     // Catch: java.lang.Exception -> L3f
            java.lang.String r6 = r1.trim()     // Catch: java.lang.Exception -> L3f
        L57:
            boolean r1 = r6.isEmpty()     // Catch: java.lang.Exception -> L3f
            if (r1 != 0) goto L66
            int r1 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L3f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L3f
            goto L67
        L66:
            r1 = r4
        L67:
            r5 = r5[r7]     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Exception -> L3f
            boolean r0 = r5.endsWith(r0)     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L80
            int r0 = r5.length()     // Catch: java.lang.Exception -> L3f
            int r0 = r0 - r7
            java.lang.String r0 = r5.substring(r3, r0)     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = r0.trim()     // Catch: java.lang.Exception -> L3f
        L80:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Exception -> L3f
            if (r0 != 0) goto L8f
            int r0 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L3f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L3f
            goto L90
        L8f:
            r0 = r4
        L90:
            cn.jiguang.v.l$c r3 = new cn.jiguang.v.l$c     // Catch: java.lang.Exception -> L3f
            r3.<init>(r1, r0)     // Catch: java.lang.Exception -> L3f
            return r3
        L96:
            java.lang.String r0 = "Parse version range failed: invalid format, should be like [1,5] or [1,] or [,5] or []"
            cn.jiguang.w.f.c(r2, r0)     // Catch: java.lang.Exception -> L3f
            return r4
        L9c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Parse version range failed: "
            r1.append(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = ", input: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            cn.jiguang.w.f.l(r2, r8)
            return r4
    }

    public static void a(android.content.Context r10, org.json.JSONObject r11) {
            java.lang.String r1 = "ResetConfigurationHelper"
            if (r10 == 0) goto L15d
            if (r11 != 0) goto L8
            goto L15d
        L8:
            java.lang.String r0 = "configs"
            org.json.JSONArray r11 = r11.optJSONArray(r0)     // Catch: java.lang.Throwable -> L13b
            if (r11 == 0) goto L13e
            int r0 = r11.length()     // Catch: java.lang.Throwable -> L13b
            if (r0 != 0) goto L18
            goto L13e
        L18:
            r2 = 0
            r3 = 0
        L1a:
            int r0 = r11.length()     // Catch: java.lang.Throwable -> L13b
            if (r3 >= r0) goto L15c
            org.json.JSONObject r5 = r11.getJSONObject(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "type"
            java.lang.String r9 = r5.optString(r0)     // Catch: java.lang.Throwable -> L38
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3c
            java.lang.String r0 = "Skip config: type is empty"
            cn.jiguang.w.f.i(r1, r0)     // Catch: java.lang.Throwable -> L38
        L35:
            r4 = r10
            goto L136
        L38:
            r0 = move-exception
            r4 = r10
            goto L116
        L3c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "config :"
            r0.append(r4)     // Catch: java.lang.Throwable -> L38
            r0.append(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L38
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "ver_range"
            java.lang.String r0 = r5.optString(r0)     // Catch: java.lang.Throwable -> L38
            cn.jiguang.v.l$c r6 = a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "sdk_range"
            java.lang.String r0 = r5.optString(r0)     // Catch: java.lang.Throwable -> L38
            cn.jiguang.v.l$c r0 = a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "partial_update"
            boolean r7 = r5.optBoolean(r4, r2)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "verRange :"
            r4.append(r8)     // Catch: java.lang.Throwable -> L38
            r4.append(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L38
            cn.jiguang.w.f.c(r1, r4)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "sdkRange :"
            r4.append(r8)     // Catch: java.lang.Throwable -> L38
            r4.append(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L38
            cn.jiguang.w.f.c(r1, r4)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "partialUpdate :"
            r4.append(r8)     // Catch: java.lang.Throwable -> L38
            r4.append(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L38
            cn.jiguang.w.f.c(r1, r4)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto Lf4
            int r4 = cn.jiguang.a.a.f237d     // Catch: java.lang.Throwable -> L38
            boolean r4 = r0.a(r4)     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto Lf4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "Skip config type: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            r4.append(r9)     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = ", current SDK version "
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            int r5 = cn.jiguang.a.a.f237d     // Catch: java.lang.Throwable -> L38
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = " not in range ["
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r5 = r0.a     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = ""
            if (r5 == 0) goto Ld5
            goto Ld6
        Ld5:
            r5 = r6
        Ld6:
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = ","
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r0 = r0.f1537b     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto Le3
            r6 = r0
        Le3:
            r4.append(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "]"
            r4.append(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L38
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L38
            goto L35
        Lf4:
            cn.jiguang.v.l$a$d r8 = cn.jiguang.v.l.a.a(r9)     // Catch: java.lang.Throwable -> L38
            r4 = r10
            if (r8 == 0) goto L101
            a(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lff
            goto L136
        Lff:
            r0 = move-exception
            goto L116
        L101:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
            r10.<init>()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r0 = "Unknown config type: "
            r10.append(r0)     // Catch: java.lang.Throwable -> Lff
            r10.append(r9)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.w.f.i(r1, r10)     // Catch: java.lang.Throwable -> Lff
            goto L136
        L116:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13b
            r10.<init>()     // Catch: java.lang.Throwable -> L13b
            java.lang.String r5 = "Process config at index "
            r10.append(r5)     // Catch: java.lang.Throwable -> L13b
            r10.append(r3)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r5 = " failed: "
            r10.append(r5)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L13b
            r10.append(r0)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L13b
            cn.jiguang.w.f.l(r1, r10)     // Catch: java.lang.Throwable -> L13b
        L136:
            int r3 = r3 + 1
            r10 = r4
            goto L1a
        L13b:
            r0 = move-exception
            r10 = r0
            goto L144
        L13e:
            java.lang.String r10 = "resetConfiguration failed: configs is empty"
            cn.jiguang.w.f.i(r1, r10)     // Catch: java.lang.Throwable -> L13b
            return
        L144:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "resetConfiguration failed: "
            r11.append(r0)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jiguang.w.f.l(r1, r10)
        L15c:
            return
        L15d:
            java.lang.String r10 = "resetConfiguration failed: context or jsonContent is null"
            cn.jiguang.w.f.i(r1, r10)
            return
    }

    private static void a(android.content.Context r4, org.json.JSONObject r5, cn.jiguang.v.l.c r6, boolean r7, cn.jiguang.v.l.a.d r8, java.lang.String r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Handle "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = " config: verRange=["
            r0.append(r1)
            java.lang.String r1 = ","
            if (r6 == 0) goto L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Integer r3 = r6.a
            r2.append(r3)
            r2.append(r1)
            java.lang.Integer r3 = r6.f1537b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L2f
        L2d:
            java.lang.String r2 = "null"
        L2f:
            r0.append(r2)
            java.lang.String r2 = "], partialUpdate="
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ResetConfigurationHelper"
            cn.jiguang.w.f.c(r0, r7)
            java.lang.Integer r7 = r8.a()
            if (r7 == 0) goto L92
            if (r6 == 0) goto L92
            int r2 = r7.intValue()
            boolean r2 = r6.a(r2)
            if (r2 != 0) goto L92
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Skip "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = " update: current protocol version "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = " not in range ["
            r4.append(r5)
            java.lang.Integer r5 = r6.a
            java.lang.String r7 = ""
            if (r5 == 0) goto L76
            goto L77
        L76:
            r5 = r7
        L77:
            r4.append(r5)
            r4.append(r1)
            java.lang.Integer r5 = r6.f1537b
            if (r5 == 0) goto L82
            r7 = r5
        L82:
            r4.append(r7)
            java.lang.String r5 = "]"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.c(r0, r4)
            return
        L92:
            r8.a(r4, r5)
            return
    }
}
