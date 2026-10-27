package cn.jiguang.as;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static android.os.Bundle a;

    /* renamed from: b, reason: collision with root package name */
    private static long f639b;

    /* renamed from: i, reason: collision with root package name */
    private static java.util.HashMap<java.lang.Integer, java.lang.String> f640i;

    /* renamed from: j, reason: collision with root package name */
    private static java.util.List<java.lang.String> f641j;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f642c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f643d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f644e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentLinkedQueue<android.os.Bundle> f645f;

    /* renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f646g;

    /* renamed from: h, reason: collision with root package name */
    private final java.lang.Runnable f647h;




    /* renamed from: cn.jiguang.as.a$a, reason: collision with other inner class name */
    private static final class C0016a {
        private static final cn.jiguang.as.a a = null;

        static {
                cn.jiguang.as.a r0 = new cn.jiguang.as.a
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.as.a.C0016a.a = r0
                return
        }

        public C0016a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.as.a a() {
                cn.jiguang.as.a r0 = cn.jiguang.as.a.C0016a.a
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.as.a.f640i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.jiguang.as.a.f641j = r0
            return
    }

    private a() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r3.f643d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r3.f644e = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r3.f645f = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r3.f646g = r0
            cn.jiguang.as.a$1 r0 = new cn.jiguang.as.a$1
            r0.<init>(r3)
            r3.f647h = r0
            android.content.Context r0 = cn.jiguang.av.c.a()
            r3.f642c = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f643d
            cn.jiguang.e.a r2 = cn.jiguang.e.a.Y()
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.set(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "default exception_switch="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f643d
            boolean r1 = r1.get()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExceptionStatsManager"
            cn.jiguang.w.f.c(r1, r0)
            return
    }

    /* synthetic */ a(cn.jiguang.as.a.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.as.a a() {
            cn.jiguang.as.a r0 = cn.jiguang.as.a.C0016a.a()
            return r0
    }

    static /* synthetic */ java.util.ArrayList a(org.json.JSONArray r0) {
            java.util.ArrayList r0 = b(r0)
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a(cn.jiguang.as.a r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f644e
            return r0
    }

    private org.json.JSONObject a(org.json.JSONObject r18, android.os.Bundle r19) {
            r17 = this;
            r0 = r19
            java.lang.String r1 = "extra"
            java.lang.String r2 = "exception_type"
            java.lang.String r3 = "_"
            java.lang.String r4 = "code"
            java.lang.String r5 = "&"
            java.lang.String r6 = "result"
            if (r18 != 0) goto L1a
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L16
            r7.<init>()     // Catch: java.lang.Throwable -> L16
            goto L1c
        L16:
            r7 = r18
            goto Lb1
        L1a:
            r7 = r18
        L1c:
            java.lang.String r8 = r0.getString(r4)     // Catch: java.lang.Throwable -> Lb1
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lb1
            if (r8 == 0) goto L27
            return r7
        L27:
            java.lang.String r4 = r0.getString(r4)     // Catch: java.lang.Throwable -> Lb1
            boolean r8 = r7.has(r6)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r9 = "_1"
            if (r8 == 0) goto L8e
            java.lang.String r8 = r7.optString(r6)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String[] r8 = r8.split(r5)     // Catch: java.lang.Throwable -> Lb1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r10.<init>()     // Catch: java.lang.Throwable -> Lb1
            r11 = 0
            r12 = 0
            r13 = 0
        L43:
            int r14 = r8.length     // Catch: java.lang.Throwable -> Lb1
            if (r12 >= r14) goto L7b
            r14 = r8[r12]     // Catch: java.lang.Throwable -> Lb1
            java.lang.String[] r14 = r14.split(r3)     // Catch: java.lang.Throwable -> Lb1
            r15 = r14[r11]     // Catch: java.lang.Throwable -> Lb1
            r16 = 1
            r14 = r14[r16]     // Catch: java.lang.Throwable -> Lb1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> Lb1
            int r14 = r14.intValue()     // Catch: java.lang.Throwable -> Lb1
            r10.append(r15)     // Catch: java.lang.Throwable -> Lb1
            r10.append(r3)     // Catch: java.lang.Throwable -> Lb1
            boolean r15 = r4.equals(r15)     // Catch: java.lang.Throwable -> Lb1
            if (r15 == 0) goto L6d
            int r14 = r14 + 1
            r10.append(r14)     // Catch: java.lang.Throwable -> Lb1
            r13 = 1
            goto L70
        L6d:
            r10.append(r14)     // Catch: java.lang.Throwable -> Lb1
        L70:
            int r14 = r8.length     // Catch: java.lang.Throwable -> Lb1
            int r14 = r14 + (-1)
            if (r12 == r14) goto L78
            r10.append(r5)     // Catch: java.lang.Throwable -> Lb1
        L78:
            int r12 = r12 + 1
            goto L43
        L7b:
            if (r13 != 0) goto L86
            r10.append(r5)     // Catch: java.lang.Throwable -> Lb1
            r10.append(r4)     // Catch: java.lang.Throwable -> Lb1
            r10.append(r9)     // Catch: java.lang.Throwable -> Lb1
        L86:
            java.lang.String r3 = r10.toString()     // Catch: java.lang.Throwable -> Lb1
        L8a:
            r7.put(r6, r3)     // Catch: java.lang.Throwable -> Lb1
            goto L9e
        L8e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r3.<init>()     // Catch: java.lang.Throwable -> Lb1
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb1
            r3.append(r9)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lb1
            goto L8a
        L9e:
            java.lang.String r3 = r0.getString(r2)     // Catch: java.lang.Throwable -> Lb1
            r7.put(r2, r3)     // Catch: java.lang.Throwable -> Lb1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> Lb1
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lb1
            r7.put(r1, r2)     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            return r7
    }

    static /* synthetic */ void a(cn.jiguang.as.a r0, java.util.List r1) {
            r0.a(r1)
            return
    }

    private void a(java.util.List<android.os.Bundle> r15) {
            r14 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = "exception_type"
            java.lang.String r2 = "data"
            java.lang.String r3 = "e_s.catch"
            java.lang.String r4 = "extra"
            android.content.Context r5 = r14.f642c
            if (r5 == 0) goto Ld5
            if (r15 == 0) goto Ld5
            boolean r5 = r15.isEmpty()
            if (r5 == 0) goto L18
            goto Ld5
        L18:
            org.json.JSONObject r5 = cn.jiguang.av.i.a(r3)     // Catch: java.lang.Throwable -> Ld5
            if (r5 != 0) goto L23
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld5
            r5.<init>()     // Catch: java.lang.Throwable -> Ld5
        L23:
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> Ld5
        L27:
            boolean r6 = r15.hasNext()     // Catch: java.lang.Throwable -> Ld5
            if (r6 == 0) goto Lbc
            java.lang.Object r6 = r15.next()     // Catch: java.lang.Throwable -> Ld5
            android.os.Bundle r6 = (android.os.Bundle) r6     // Catch: java.lang.Throwable -> Ld5
            if (r6 != 0) goto L36
            goto L27
        L36:
            org.json.JSONArray r7 = r5.optJSONArray(r2)     // Catch: java.lang.Throwable -> Ld5
            if (r7 != 0) goto L41
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld5
            r7.<init>()     // Catch: java.lang.Throwable -> Ld5
        L41:
            java.lang.String r8 = r6.getString(r1)     // Catch: java.lang.Throwable -> Ld5
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Ld5
            if (r9 == 0) goto L4c
            goto L27
        L4c:
            boolean r9 = r8.equals(r0)     // Catch: java.lang.Throwable -> Ld5
            if (r9 == 0) goto L59
            boolean r9 = r14.b(r6)     // Catch: java.lang.Throwable -> Ld5
            if (r9 == 0) goto L59
            goto L27
        L59:
            r9 = 0
        L5a:
            int r10 = r7.length()     // Catch: java.lang.Throwable -> Ld5
            if (r9 >= r10) goto Lb1
            java.lang.Object r10 = r7.get(r9)     // Catch: java.lang.Throwable -> Ld5
            org.json.JSONObject r10 = (org.json.JSONObject) r10     // Catch: java.lang.Throwable -> Ld5
            if (r10 == 0) goto Lae
            java.lang.String r11 = r10.optString(r1)     // Catch: java.lang.Throwable -> Ld5
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Ld5
            if (r12 != 0) goto Lae
            boolean r11 = r11.equals(r8)     // Catch: java.lang.Throwable -> Ld5
            if (r11 == 0) goto Lae
            boolean r11 = r0.equals(r8)     // Catch: java.lang.Throwable -> Ld5
            if (r11 == 0) goto La9
            boolean r11 = r10.has(r4)     // Catch: java.lang.Throwable -> Ld5
            if (r11 == 0) goto La9
            java.lang.String r11 = r6.getString(r4)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r12 = r10.getString(r4)     // Catch: java.lang.Throwable -> Ld5
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Ld5
            if (r13 != 0) goto Lae
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> Ld5
            if (r13 != 0) goto Lae
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> Ld5
            if (r11 == 0) goto Lae
            org.json.JSONObject r6 = r14.a(r10, r6)     // Catch: java.lang.Throwable -> Ld5
        La2:
            r7.remove(r9)     // Catch: java.lang.Throwable -> Ld5
        La5:
            r7.put(r6)     // Catch: java.lang.Throwable -> Ld5
            goto Lb7
        La9:
            org.json.JSONObject r6 = r14.a(r10, r6)     // Catch: java.lang.Throwable -> Ld5
            goto La2
        Lae:
            int r9 = r9 + 1
            goto L5a
        Lb1:
            r8 = 0
            org.json.JSONObject r6 = r14.a(r8, r6)     // Catch: java.lang.Throwable -> Ld5
            goto La5
        Lb7:
            r5.put(r2, r7)     // Catch: java.lang.Throwable -> Ld5
            goto L27
        Lbc:
            cn.jiguang.av.i.a(r3, r5)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r15 = "ExceptionStatsManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld5
            r0.<init>()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = "saveData success, cache="
            r0.append(r1)     // Catch: java.lang.Throwable -> Ld5
            r0.append(r5)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld5
            cn.jiguang.w.f.c(r15, r0)     // Catch: java.lang.Throwable -> Ld5
        Ld5:
            return
    }

    private boolean a(android.os.Bundle r7, android.os.Bundle r8) {
            r6 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L51
            if (r8 != 0) goto La
            goto L51
        La:
            int r2 = r7.size()
            int r3 = r8.size()
            if (r2 == r3) goto L15
            return r1
        L15:
            java.util.Set r2 = r7.keySet()
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.get(r3)
            java.lang.Object r3 = r8.get(r3)
            if (r4 != 0) goto L36
            if (r3 == 0) goto L1d
            return r1
        L36:
            boolean r5 = r4 instanceof android.os.Bundle
            if (r5 == 0) goto L49
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L48
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r3 = r6.a(r4, r3)
            if (r3 != 0) goto L1d
        L48:
            return r1
        L49:
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L1d
            return r1
        L50:
            return r0
        L51:
            return r1
    }

    private static java.util.ArrayList<org.json.JSONArray> b(org.json.JSONArray r9) {
            java.lang.String r0 = "ExceptionStatsManager"
            r1 = 0
            if (r9 == 0) goto L86
            int r2 = r9.length()
            if (r2 != 0) goto Ld
            goto L86
        Ld:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            r2.<init>()     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            r3.<init>()     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            r4 = 0
            r5 = 0
        L19:
            int r6 = r9.length()     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            if (r4 >= r6) goto L5b
            org.json.JSONObject r6 = r9.optJSONObject(r4)     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            if (r6 == 0) goto L58
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            if (r7 != 0) goto L2c
            goto L58
        L2c:
            java.lang.String r7 = r6.toString()     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            java.lang.String r8 = "UTF-8"
            byte[] r7 = r7.getBytes(r8)     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            int r7 = r7.length     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            int r5 = r5 + r7
            r8 = 102400(0x19000, float:1.43493E-40)
            if (r5 <= r8) goto L55
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            if (r5 <= 0) goto L4b
            r3.add(r2)     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            goto L4b
        L47:
            r9 = move-exception
            goto L65
        L49:
            r9 = move-exception
            goto L7e
        L4b:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            r2.<init>()     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            r2.put(r6)     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            r5 = r7
            goto L58
        L55:
            r2.put(r6)     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
        L58:
            int r4 = r4 + 1
            goto L19
        L5b:
            int r9 = r2.length()     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
            if (r9 <= 0) goto L64
            r3.add(r2)     // Catch: java.lang.Throwable -> L47 java.io.UnsupportedEncodingException -> L49
        L64:
            return r3
        L65:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "partition throwable:"
        L6c:
            r2.append(r3)
            java.lang.String r9 = r9.getMessage()
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            cn.jiguang.w.f.i(r0, r9)
            goto L86
        L7e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "partition exception:"
            goto L6c
        L86:
            return r1
    }

    static /* synthetic */ void b(cn.jiguang.as.a r0) {
            r0.c()
            return
    }

    private boolean b(android.os.Bundle r7) {
            r6 = this;
            android.os.Bundle r0 = cn.jiguang.as.a.a
            r1 = 0
            if (r0 != 0) goto L9
            r6.d(r7)
            return r1
        L9:
            android.os.Bundle r0 = r6.c(r7)
            long r2 = java.lang.System.currentTimeMillis()
            android.os.Bundle r4 = cn.jiguang.as.a.a
            boolean r0 = r6.a(r4, r0)
            if (r0 == 0) goto L24
            long r4 = cn.jiguang.as.a.f639b
            long r2 = r2 - r4
            r4 = 300(0x12c, double:1.48E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L24
            r7 = 1
            return r7
        L24:
            r6.d(r7)
            return r1
    }

    private android.os.Bundle c(android.os.Bundle r4) {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "extra"
            java.lang.String r2 = r4.getString(r1)
            r0.putString(r1, r2)
            java.lang.String r1 = "exception_type"
            java.lang.String r2 = r4.getString(r1)
            r0.putString(r1, r2)
            java.lang.String r1 = "code"
            java.lang.String r4 = r4.getString(r1)
            r0.putString(r1, r4)
            return r0
    }

    static /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue c(cn.jiguang.as.a r0) {
            java.util.concurrent.ConcurrentLinkedQueue<android.os.Bundle> r0 = r0.f645f
            return r0
    }

    private void c() {
            r2 = this;
            cn.jiguang.as.a$2 r0 = new cn.jiguang.as.a$2
            r0.<init>(r2)
            java.lang.String r1 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r1, r0)
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger d(cn.jiguang.as.a r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f646g
            return r0
    }

    private void d(android.os.Bundle r3) {
            r2 = this;
            android.os.Bundle r3 = r2.c(r3)
            cn.jiguang.as.a.a = r3
            long r0 = java.lang.System.currentTimeMillis()
            cn.jiguang.as.a.f639b = r0
            return
    }

    private boolean d() {
            r5 = this;
            android.content.Context r0 = r5.f642c
            cn.jiguang.e.a r1 = cn.jiguang.e.a.an()
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            long r0 = java.lang.Math.abs(r2)
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L22
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    static /* synthetic */ android.content.Context e(cn.jiguang.as.a r0) {
            android.content.Context r0 = r0.f642c
            return r0
    }

    static /* synthetic */ boolean f(cn.jiguang.as.a r0) {
            boolean r0 = r0.d()
            return r0
    }

    public void a(int r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ""
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "2"
            r1.a(r2, r0)
            return
    }

    public void a(android.os.Bundle r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f643d
            boolean r0 = r0.get()
            if (r0 == 0) goto L34
            if (r5 != 0) goto Lb
            goto L34
        Lb:
            java.util.concurrent.ConcurrentLinkedQueue<android.os.Bundle> r0 = r4.f645f
            boolean r5 = r0.offer(r5)
            if (r5 == 0) goto L34
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f646g
            int r5 = r5.incrementAndGet()
            r0 = 50
            java.lang.String r1 = "exception_stats_save"
            if (r5 < r0) goto L2b
            cn.jiguang.av.l r5 = cn.jiguang.av.l.a()
            java.lang.Runnable r0 = r4.f647h
            r2 = 0
        L27:
            r5.a(r1, r0, r2)
            return
        L2b:
            cn.jiguang.av.l r5 = cn.jiguang.av.l.a()
            java.lang.Runnable r0 = r4.f647h
            r2 = 500(0x1f4, double:2.47E-321)
            goto L27
        L34:
            return
    }

    public void a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "code"
            r0.putString(r1, r3)     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "exception_type"
            r0.putString(r3, r4)     // Catch: java.lang.Throwable -> L12
            r2.a(r0)     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public void a(boolean r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f643d
            r0.set(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateSwitchState exception_switch="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f643d
            boolean r1 = r1.get()
            r0.append(r1)
            java.lang.String r1 = " origin switchState="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ExceptionStatsManager"
            cn.jiguang.w.f.c(r0, r3)
            return
    }

    public void b() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f643d
            boolean r0 = r0.get()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startReport exception_switch="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ExceptionStatsManager"
            cn.jiguang.w.f.c(r2, r1)
            if (r0 != 0) goto L1f
            return
        L1f:
            cn.jiguang.as.a$3 r0 = new cn.jiguang.as.a$3
            r0.<init>(r3)
            java.lang.String r1 = "DELAY_TASK"
            cn.jiguang.au.d.a(r1, r0)
            return
    }

    public void b(int r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ""
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "3"
            r1.a(r2, r0)
            return
    }
}
