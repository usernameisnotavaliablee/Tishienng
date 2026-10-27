package cn.jiguang.commons.y;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a {
    private static final java.security.SecureRandom a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.util.Map f1223c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.util.Map f1224d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final java.util.Map f1225e = null;

    /* renamed from: cn.jiguang.commons.y.a$a, reason: collision with other inner class name */
    class RunnableC0036a implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f1226b;

        /* renamed from: cn.jiguang.commons.y.a$a$a, reason: collision with other inner class name */
        class RunnableC0037a implements java.lang.Runnable {
            final /* synthetic */ cn.jiguang.commons.y.a.RunnableC0036a a;

            RunnableC0037a(cn.jiguang.commons.y.a.RunnableC0036a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    cn.jiguang.commons.y.a$a r0 = r2.a
                    java.lang.String r0 = r0.a
                    java.lang.String r1 = "delay time is over,ready to request"
                    cn.jiguang.commons.w.a.a(r0, r1)
                    cn.jiguang.commons.y.a$a r0 = r2.a
                    java.lang.Runnable r0 = r0.f1226b
                    r0.run()
                    return
            }
        }

        RunnableC0036a(java.lang.String r1, java.lang.Runnable r2) {
                r0 = this;
                r0.a = r1
                r0.f1226b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.c()     // Catch: java.lang.Throwable -> L18
                cn.jiguang.commons.y.a$a$a r1 = new cn.jiguang.commons.y.a$a$a     // Catch: java.lang.Throwable -> L18
                r1.<init>(r3)     // Catch: java.lang.Throwable -> L18
                cn.jiguang.commons.C.a$g r2 = cn.jiguang.commons.C.a.g.f771d     // Catch: java.lang.Throwable -> L18
                r0.a(r1, r2)     // Catch: java.lang.Throwable -> L18
                java.util.Map r0 = cn.jiguang.commons.y.a.a()
                java.lang.String r1 = r3.a
                r0.remove(r1)
                return
            L18:
                r0 = move-exception
                java.util.Map r1 = cn.jiguang.commons.y.a.a()
                java.lang.String r2 = r3.a
                r1.remove(r2)
                throw r0
        }
    }

    static {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            cn.jiguang.commons.y.a.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.commons.y.a.f1223c = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            cn.jiguang.commons.y.a.f1224d = r1
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            cn.jiguang.commons.y.a.f1225e = r2
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 600000(0x927c0, float:8.40779E-40)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 480000(0x75300, float:6.72623E-40)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r3, r4)
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 360000(0x57e40, float:5.04467E-40)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r4, r5)
            r5 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 240000(0x3a980, float:3.36312E-40)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r5, r6)
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 180000(0x2bf20, float:2.52234E-40)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.put(r7, r8)
            r9 = 5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 60000(0xea60, float:8.4078E-41)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0.put(r9, r10)
            r11 = 6
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 30000(0x7530, float:4.2039E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.put(r11, r12)
            r13 = 7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.put(r13, r14)
            r15 = 8
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r16 = 5000(0x1388, float:7.006E-42)
            r17 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)
            r0.put(r15, r13)
            r0 = 300000(0x493e0, float:4.2039E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
            r1.put(r3, r6)
            r1.put(r4, r8)
            r0 = 120000(0x1d4c0, float:1.68156E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r5, r0)
            r1.put(r7, r10)
            r1.put(r9, r12)
            r0 = 20000(0x4e20, float:2.8026E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r11, r0)
            r0 = r17
            r1.put(r0, r14)
            r1.put(r15, r13)
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L22
            r2.<init>()     // Catch: java.lang.Exception -> L22
            r2.append(r3)     // Catch: java.lang.Exception -> L22
            java.lang.String r3 = "_blc"
            r2.append(r3)     // Catch: java.lang.Exception -> L22
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Exception -> L22
            int r3 = r0.a(r3, r1)     // Catch: java.lang.Exception -> L22
            return r3
        L22:
            return r1
    }

    private static java.lang.Integer a(java.lang.String r1, int r2) {
            java.lang.String r0 = "ServerConfigManager"
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 == 0) goto L15
            java.util.Map r1 = cn.jiguang.commons.y.a.f1224d
        La:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            return r1
        L15:
            java.util.Map r1 = cn.jiguang.commons.y.a.f1223c
            goto La
    }

    static /* synthetic */ java.util.Map a() {
            java.util.Map r0 = cn.jiguang.commons.y.a.f1225e
            return r0
    }

    public static boolean a(java.lang.String r6, long r7, long r9) {
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            r4 = 1
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 > 0) goto L11
            java.lang.String r7 = "lt<=0 no need check"
            cn.jiguang.commons.w.a.a(r6, r7)
            return r4
        L11:
            long r0 = r0 - r7
            long r7 = java.lang.Math.abs(r0)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "skip elapsed:"
            r0.append(r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r1
            r0.append(r7)
            java.lang.String r7 = "s, limit:"
            r0.append(r7)
            long r9 = r9 / r1
            r0.append(r9)
            java.lang.String r7 = "s"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            cn.jiguang.commons.w.a.a(r6, r7)
            r6 = 0
            return r6
        L41:
            return r4
    }

    public static boolean a(java.lang.String r10, long r11, long r13, java.lang.Runnable r15) {
            r0 = 0
            if (r15 != 0) goto L9
            java.lang.String r11 = "no callback runnable, return false"
            cn.jiguang.commons.w.a.a(r10, r11)
            return r0
        L9:
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 > 0) goto L1c
            java.lang.String r11 = "lt<=0 no need delay"
            cn.jiguang.commons.w.a.a(r10, r11)
            c(r10, r0)
            return r0
        L1c:
            long r11 = r1 - r11
            long r11 = java.lang.Math.abs(r11)
            r5 = 2
            long r5 = r5 * r13
            r7 = 1000(0x3e8, double:4.94E-321)
            int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r9 >= 0) goto L53
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "not reach 2x, elapsed:"
            r15.append(r1)
            long r11 = r11 / r7
            r15.append(r11)
            java.lang.String r11 = "s, limit:"
            r15.append(r11)
            long r13 = r13 / r7
            r15.append(r13)
            java.lang.String r11 = "s"
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            cn.jiguang.commons.w.a.a(r10, r11)
            c(r10, r0)
            return r0
        L53:
            cn.jiguang.commons.L.o r11 = cn.jiguang.commons.L.o.c()
            boolean r11 = r11.a(r10)
            r12 = 1
            if (r11 == 0) goto L8f
            java.util.Map r11 = cn.jiguang.commons.y.a.f1225e
            java.lang.Object r11 = r11.get(r10)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 != 0) goto L6b
            r13 = -1
            goto L74
        L6b:
            long r13 = r11.longValue()
            long r13 = r13 - r1
            long r13 = java.lang.Math.max(r3, r13)
        L74:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r15 = "in delaying, after:"
            r11.append(r15)
            long r13 = r13 / r7
            r11.append(r13)
            java.lang.String r13 = "s, to real execute"
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            cn.jiguang.commons.w.a.a(r10, r11)
            return r12
        L8f:
            int r11 = a(r10)
            r13 = 8
            if (r11 <= r13) goto L99
            r11 = 8
        L99:
            java.lang.Integer r14 = a(r10, r11)
            if (r14 == 0) goto La5
            int r0 = r14.intValue()
            if (r0 > 0) goto Lab
        La5:
            r14 = 5000(0x1388, float:7.006E-42)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
        Lab:
            int r0 = r14.intValue()
            if (r0 <= r12) goto Lbc
            java.security.SecureRandom r0 = cn.jiguang.commons.y.a.a
            int r14 = r14.intValue()
            int r14 = r0.nextInt(r14)
            long r3 = (long) r14
        Lbc:
            long r1 = r1 + r3
            java.util.Map r14 = cn.jiguang.commons.y.a.f1225e
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r14.put(r10, r0)
            cn.jiguang.commons.L.o r14 = cn.jiguang.commons.L.o.c()
            cn.jiguang.commons.y.a$a r0 = new cn.jiguang.commons.y.a$a
            r0.<init>(r10, r15)
            r14.a(r10, r0, r3)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "need delay,  delayTime:"
            r14.append(r15)
            long r3 = r3 / r7
            r14.append(r3)
            java.lang.String r15 = "s, currentRetryCount:"
            r14.append(r15)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            cn.jiguang.commons.w.a.a(r10, r14)
            if (r11 >= r13) goto Lf3
            int r13 = r11 + 1
        Lf3:
            c(r10, r13)
            return r12
    }

    public static void c(java.lang.String r1) {
            r0 = 0
            c(r1, r0)
            return
    }

    public static void c(java.lang.String r2, int r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L21
            if (r3 >= 0) goto L9
            goto L21
        L9:
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L21
            r1.<init>()     // Catch: java.lang.Exception -> L21
            r1.append(r2)     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = "_blc"
            r1.append(r2)     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Exception -> L21
            r0.c(r2, r3)     // Catch: java.lang.Exception -> L21
        L21:
            return
    }
}
