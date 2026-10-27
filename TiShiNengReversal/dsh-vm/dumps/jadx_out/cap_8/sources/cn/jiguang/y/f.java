package cn.jiguang.y;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    private static cn.jiguang.y.f.a a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile java.util.concurrent.FutureTask<?> f1568b;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f1569c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.util.LinkedHashSet<java.lang.String> f1570d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f1571e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f1572f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final java.util.LinkedHashSet<java.lang.String> f1573g = null;

    /* renamed from: cn.jiguang.y.f$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class a extends cn.jiguang.au.b {
        private final android.content.Context a;

        private a(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                java.lang.String r1 = "SisTask"
                r0.f668h = r1
                return
        }

        /* synthetic */ a(android.content.Context r1, cn.jiguang.y.f.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // cn.jiguang.au.b
        public void a() {
                r6 = this;
                java.lang.String r0 = "ReportSis"
                android.content.Context r1 = r6.a     // Catch: java.lang.Throwable -> L7b
                java.lang.String r1 = cn.jiguang.y.f.a(r1)     // Catch: java.lang.Throwable -> L7b
                android.content.Context r2 = r6.a     // Catch: java.lang.Throwable -> L7b
                java.util.LinkedHashSet r2 = cn.jiguang.y.f.b(r2)     // Catch: java.lang.Throwable -> L7b
                java.util.LinkedHashSet r3 = cn.jiguang.y.f.a()     // Catch: java.lang.Throwable -> L7b
                r2.addAll(r3)     // Catch: java.lang.Throwable -> L7b
                android.content.Context r3 = r6.a     // Catch: java.lang.Throwable -> L7b
                java.util.LinkedHashSet r2 = cn.jiguang.av.x.a(r3, r2)     // Catch: java.lang.Throwable -> L7b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
                r3.<init>()     // Catch: java.lang.Throwable -> L7b
                java.lang.String r4 = "sis urls="
                r3.append(r4)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L7b
                r3.append(r4)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r4 = " post json="
                r3.append(r4)     // Catch: java.lang.Throwable -> L7b
                r3.append(r1)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7b
                cn.jiguang.w.f.c(r0, r3)     // Catch: java.lang.Throwable -> L7b
                boolean r3 = cn.jiguang.av.n.a()     // Catch: java.lang.Throwable -> L7b
                if (r3 != 0) goto L47
                java.lang.String r1 = "give up sis, because network is not connected"
                cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> L7b
                return
            L47:
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L7b
            L4b:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L7b
                if (r3 == 0) goto L7b
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L7b
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L7b
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L7b
                if (r4 == 0) goto L5e
                goto L4b
            L5e:
                int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7b
                r5 = 28
                if (r4 < r5) goto L73
                java.lang.String r4 = cn.jiguang.h.c.a.f1290d     // Catch: java.lang.Throwable -> L7b
                boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L7b
                if (r4 != 0) goto L73
                java.lang.String r3 = "won't use http at device since 28"
                cn.jiguang.w.f.i(r0, r3)     // Catch: java.lang.Throwable -> L7b
                goto L4b
            L73:
                android.content.Context r4 = r6.a     // Catch: java.lang.Throwable -> L7b
                boolean r3 = cn.jiguang.y.f.a(r4, r3, r1)     // Catch: java.lang.Throwable -> L7b
                if (r3 == 0) goto L4b
            L7b:
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.y.f.f1569c = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            cn.jiguang.y.f.f1570d = r0
            r1 = 21
            byte[] r1 = new byte[r1]
            r1 = {x0036: FILL_ARRAY_DATA , data: [126, 101, 68, 80, 106, 50, 57, 62, 68, 83, 112, 123, 56, 123, 64, 85, 106, 96, 56, 114, 94} // fill-array
            java.lang.String r1 = cn.jiguang.av.k.b(r1)
            cn.jiguang.y.f.f1571e = r1
            r2 = 26
            byte[] r2 = new byte[r2]
            r2 = {x0046: FILL_ARRAY_DATA , data: [96, 98, 101, 64, 83, 35, 39, 57, 101, 67, 73, 106, 37, 127, 97, 70, 22, 55, 98, 102, 100, 67, 72, 55, 107, 120} // fill-array
            java.lang.String r2 = cn.jiguang.av.k.b(r2)
            cn.jiguang.y.f.f1572f = r2
            r0.add(r1)
            r0.add(r2)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            cn.jiguang.y.f.f1573g = r0
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* synthetic */ java.lang.String a(android.content.Context r0) {
            java.lang.String r0 = c(r0)
            return r0
    }

    public static java.util.LinkedHashSet<java.lang.String> a() {
            boolean r0 = cn.jiguang.internal.JConstants.isTestEnv()
            if (r0 == 0) goto Lf
            java.util.LinkedHashSet<java.lang.String> r0 = cn.jiguang.y.f.f1573g
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.util.LinkedHashSet<java.lang.String> r0 = cn.jiguang.y.f.f1570d
            return r0
    }

    public static void a(android.content.Context r4, boolean r5) {
            cn.jiguang.y.f$a r0 = cn.jiguang.y.f.a
            r1 = 0
            if (r0 != 0) goto Lc
            cn.jiguang.y.f$a r0 = new cn.jiguang.y.f$a
            r0.<init>(r4, r1)
            cn.jiguang.y.f.a = r0
        Lc:
            java.util.concurrent.FutureTask<?> r4 = cn.jiguang.y.f.f1568b
            if (r4 == 0) goto L20
            java.util.concurrent.FutureTask<?> r4 = cn.jiguang.y.f.f1568b
            boolean r4 = r4.isCancelled()
            if (r4 != 0) goto L20
            java.util.concurrent.FutureTask<?> r4 = cn.jiguang.y.f.f1568b
            boolean r4 = r4.isDone()
            if (r4 == 0) goto L63
        L20:
            java.lang.Object r4 = cn.jiguang.y.f.f1569c
            monitor-enter(r4)
            java.util.concurrent.FutureTask<?> r0 = cn.jiguang.y.f.f1568b     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            java.util.concurrent.FutureTask<?> r0 = cn.jiguang.y.f.f1568b     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L3a
            java.util.concurrent.FutureTask<?> r0 = cn.jiguang.y.f.f1568b     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L62
            goto L3a
        L38:
            r5 = move-exception
            goto La3
        L3a:
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask     // Catch: java.lang.Throwable -> L4b
            cn.jiguang.y.f$a r2 = cn.jiguang.y.f.a     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L4b
            cn.jiguang.y.f.f1568b = r0     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = "FUTURE_TASK"
            java.util.concurrent.FutureTask<?> r1 = cn.jiguang.y.f.f1568b     // Catch: java.lang.Throwable -> L4b
            cn.jiguang.au.d.a(r0, r1)     // Catch: java.lang.Throwable -> L4b
            goto L62
        L4b:
            r0 = move-exception
            java.lang.String r1 = "ReportSis"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "new sis task e:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            r2.append(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L38
            cn.jiguang.w.f.i(r1, r0)     // Catch: java.lang.Throwable -> L38
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
        L63:
            if (r5 == 0) goto La2
            java.util.concurrent.FutureTask<?> r4 = cn.jiguang.y.f.f1568b     // Catch: java.lang.Throwable -> L6f java.util.concurrent.TimeoutException -> L87 java.util.concurrent.ExecutionException -> L90 java.lang.InterruptedException -> L99
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L6f java.util.concurrent.TimeoutException -> L87 java.util.concurrent.ExecutionException -> L90 java.lang.InterruptedException -> L99
            r0 = 10
            r4.get(r0, r5)     // Catch: java.lang.Throwable -> L6f java.util.concurrent.TimeoutException -> L87 java.util.concurrent.ExecutionException -> L90 java.lang.InterruptedException -> L99
            goto La2
        L6f:
            r4 = move-exception
            java.lang.String r5 = "ReportSis"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L77:
            java.lang.String r1 = "sis task e:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            cn.jiguang.w.f.i(r5, r4)
            goto La2
        L87:
            r4 = move-exception
            java.lang.String r5 = "ReportSis"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L77
        L90:
            r4 = move-exception
            java.lang.String r5 = "ReportSis"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L77
        L99:
            r4 = move-exception
            java.lang.String r5 = "ReportSis"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L77
        La2:
            return
        La3:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r5
    }

    static /* synthetic */ boolean a(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = b(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.util.LinkedHashSet b(android.content.Context r0) {
            java.util.LinkedHashSet r0 = d(r0)
            return r0
    }

    private static boolean b(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
            r4 = 3
            r5 = 2
            r3 = 1
            r2 = r6
            r0 = r7
            r1 = r8
            cn.jiguang.y.h r6 = cn.jiguang.y.c.a(r0, r1, r2, r3, r4, r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "report sis code["
            r7.append(r8)
            int r8 = r6.a()
            r7.append(r8)
            java.lang.String r8 = "] from url="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = "\n body="
            r7.append(r8)
            java.lang.String r8 = r6.b()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "ReportSis"
            cn.jiguang.w.f.c(r8, r7)
            int r7 = r6.a()
            if (r7 != 0) goto L72
            java.lang.String r6 = r6.b()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L72
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "ret"
            org.json.JSONObject r6 = r7.getJSONObject(r6)     // Catch: java.lang.Throwable -> L5c
            cn.jiguang.y.a r7 = cn.jiguang.y.a.b()     // Catch: java.lang.Throwable -> L5c
            r7.a(r2, r6)     // Catch: java.lang.Throwable -> L5c
            r6 = 1
            return r6
        L5c:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "getUrls e:"
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.w.f.i(r8, r6)
        L72:
            r6 = 0
            return r6
    }

    private static java.lang.String c(android.content.Context r14) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = cn.jiguang.d.a.e(r14)     // Catch: java.lang.Throwable -> La0
            cn.jiguang.e.a r2 = cn.jiguang.e.a.M()     // Catch: java.lang.Throwable -> La0
            java.lang.Object r2 = cn.jiguang.e.b.a(r14, r2)     // Catch: java.lang.Throwable -> La0
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> La0
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> La0
            int r4 = cn.jiguang.av.n.b(r14)     // Catch: java.lang.Throwable -> La0
            r5 = 0
            java.lang.String r6 = cn.jiguang.av.w.a(r14, r5)     // Catch: java.lang.Throwable -> La0
            java.lang.String r7 = "type"
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "appkey"
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = "sdkver"
            java.lang.String r4 = cn.jiguang.a.a.f236c     // Catch: java.lang.Throwable -> La0
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = "platform"
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> La0
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L41
            java.lang.String r1 = "uid"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> La0
        L41:
            if (r6 == 0) goto L48
            java.lang.String r1 = "opera"
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> La0
        L48:
            java.lang.String r1 = "get_loc_info"
            r2 = 0
            java.lang.Object r14 = cn.jiguang.i.a.a(r14, r1, r2)     // Catch: java.lang.Throwable -> La0
            boolean r1 = r14 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = "time"
            java.lang.String r3 = "lat"
            r6 = 4641240890982006784(0x4069000000000000, double:200.0)
            if (r1 == 0) goto L70
            android.os.Bundle r14 = (android.os.Bundle) r14     // Catch: java.lang.Throwable -> L6f
            double r8 = r14.getDouble(r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "lot"
            double r6 = r14.getDouble(r1)     // Catch: java.lang.Throwable -> L6d
            long r4 = r14.getLong(r2)     // Catch: java.lang.Throwable -> L6d
        L69:
            r12 = r8
            r8 = r6
            r6 = r12
            goto L71
        L6d:
            goto L69
        L6f:
        L70:
            r8 = r6
        L71:
            r10 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r14 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r14 <= 0) goto La0
            r10 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r14 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r14 >= 0) goto La0
            r10 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 <= 0) goto La0
            r10 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 >= 0) goto La0
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> La0
            java.lang.String r14 = "lng"
            r0.put(r14, r8)     // Catch: java.lang.Throwable -> La0
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> La0
        La0:
            java.lang.String r14 = r0.toString()
            return r14
    }

    private static java.util.LinkedHashSet<java.lang.String> d(android.content.Context r3) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            cn.jiguang.e.a r1 = cn.jiguang.e.a.ah()
            java.lang.Object r3 = cn.jiguang.e.b.a(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L16
            goto L2c
        L16:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L2c
            r1.<init>(r3)     // Catch: org.json.JSONException -> L2c
            r3 = 0
        L1c:
            int r2 = r1.length()     // Catch: org.json.JSONException -> L2c
            if (r3 >= r2) goto L2c
            java.lang.String r2 = r1.optString(r3)     // Catch: org.json.JSONException -> L2c
            r0.add(r2)     // Catch: org.json.JSONException -> L2c
            int r3 = r3 + 1
            goto L1c
        L2c:
            return r0
    }
}
