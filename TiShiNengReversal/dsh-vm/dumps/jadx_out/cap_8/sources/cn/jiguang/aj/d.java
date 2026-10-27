package cn.jiguang.aj;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    public static cn.jiguang.ak.e a;

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    private static org.json.JSONArray a(java.lang.Throwable r7) {
            boolean r0 = r7 instanceof cn.jiguang.aj.c     // Catch: org.json.JSONException -> Ld3
            if (r0 == 0) goto Ldb
            cn.jiguang.aj.c r7 = (cn.jiguang.aj.c) r7     // Catch: org.json.JSONException -> Ld3
            cn.jiguang.aj.k r0 = new cn.jiguang.aj.k     // Catch: org.json.JSONException -> Ld3
            r0.<init>()     // Catch: org.json.JSONException -> Ld3
            cn.jiguang.aj.l r1 = new cn.jiguang.aj.l     // Catch: org.json.JSONException -> Ld3
            r1.<init>(r0)     // Catch: org.json.JSONException -> Ld3
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.json.JSONException -> Ld3
            r0.<init>()     // Catch: org.json.JSONException -> Ld3
            java.lang.Thread r7 = r7.c()     // Catch: org.json.JSONException -> Ld3
            long r2 = r7.getId()     // Catch: org.json.JSONException -> Ld3
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch: org.json.JSONException -> Ld3
            r0.add(r7)     // Catch: org.json.JSONException -> Ld3
            java.util.List r7 = r1.a(r0)     // Catch: org.json.JSONException -> Ld3
            if (r7 == 0) goto Ldb
            int r0 = r7.size()     // Catch: org.json.JSONException -> Ld3
            if (r0 <= 0) goto Ldb
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> Ld3
            r0.<init>()     // Catch: org.json.JSONException -> Ld3
            int r1 = r7.size()     // Catch: org.json.JSONException -> Ld3
            r2 = 0
        L3a:
            if (r2 >= r1) goto Lcc
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ld3
            r3.<init>()     // Catch: org.json.JSONException -> Ld3
            java.lang.Object r4 = r7.get(r2)     // Catch: org.json.JSONException -> Ld3
            cn.jiguang.ak.h r4 = (cn.jiguang.ak.h) r4     // Catch: org.json.JSONException -> Ld3
            if (r4 == 0) goto Lc8
            java.lang.Boolean r5 = r4.c()     // Catch: org.json.JSONException -> Ld3
            if (r5 == 0) goto L58
            java.lang.String r5 = "crashed"
            java.lang.Boolean r6 = r4.c()     // Catch: org.json.JSONException -> Ld3
            r3.put(r5, r6)     // Catch: org.json.JSONException -> Ld3
        L58:
            java.lang.Boolean r5 = r4.d()     // Catch: org.json.JSONException -> Ld3
            if (r5 == 0) goto L67
            java.lang.String r5 = "current"
            java.lang.Boolean r6 = r4.d()     // Catch: org.json.JSONException -> Ld3
            r3.put(r5, r6)     // Catch: org.json.JSONException -> Ld3
        L67:
            java.lang.String r5 = r4.b()     // Catch: org.json.JSONException -> Ld3
            if (r5 == 0) goto L76
            java.lang.String r5 = "name"
            java.lang.String r6 = r4.b()     // Catch: org.json.JSONException -> Ld3
            r3.put(r5, r6)     // Catch: org.json.JSONException -> Ld3
        L76:
            java.lang.Boolean r5 = r4.g()     // Catch: org.json.JSONException -> Ld3
            if (r5 == 0) goto L85
            java.lang.String r5 = "daemon"
            java.lang.Boolean r6 = r4.g()     // Catch: org.json.JSONException -> Ld3
            r3.put(r5, r6)     // Catch: org.json.JSONException -> Ld3
        L85:
            java.lang.Long r5 = r4.a()     // Catch: org.json.JSONException -> Ld3
            if (r5 == 0) goto L94
            java.lang.String r5 = "id"
            java.lang.Long r6 = r4.a()     // Catch: org.json.JSONException -> Ld3
            r3.put(r5, r6)     // Catch: org.json.JSONException -> Ld3
        L94:
            java.lang.Integer r5 = r4.f()     // Catch: org.json.JSONException -> Ld3
            if (r5 == 0) goto La3
            java.lang.String r5 = "priority"
            java.lang.Integer r6 = r4.f()     // Catch: org.json.JSONException -> Ld3
            r3.put(r5, r6)     // Catch: org.json.JSONException -> Ld3
        La3:
            cn.jiguang.ak.g r5 = r4.e()     // Catch: org.json.JSONException -> Ld3
            if (r5 == 0) goto Lb0
            cn.jiguang.ak.g r5 = r4.e()     // Catch: org.json.JSONException -> Ld3
            a(r3, r5)     // Catch: org.json.JSONException -> Ld3
        Lb0:
            java.lang.String r5 = r4.h()     // Catch: org.json.JSONException -> Ld3
            if (r5 == 0) goto Lbf
            java.lang.String r5 = "state"
            java.lang.String r4 = r4.h()     // Catch: org.json.JSONException -> Ld3
            r3.put(r5, r4)     // Catch: org.json.JSONException -> Ld3
        Lbf:
            int r4 = r3.length()     // Catch: org.json.JSONException -> Ld3
            if (r4 <= 0) goto Lc8
            r0.put(r3)     // Catch: org.json.JSONException -> Ld3
        Lc8:
            int r2 = r2 + 1
            goto L3a
        Lcc:
            int r7 = r0.length()     // Catch: org.json.JSONException -> Ld3
            if (r7 <= 0) goto Ldb
            return r0
        Ld3:
            r7 = move-exception
            java.lang.String r0 = "ExceptionParseUtils"
            java.lang.String r1 = "Error parse Exception."
            cn.jiguang.w.f.a(r0, r1, r7)
        Ldb:
            r7 = 0
            return r7
    }

    public static org.json.JSONObject a(android.content.Context r3, cn.jiguang.ak.i r4) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L91
            r0.<init>()     // Catch: java.lang.Throwable -> L91
            java.util.UUID r1 = r4.b()     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L18
            java.lang.String r1 = "sid"
            java.util.UUID r2 = r4.b()     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L91
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L91
        L18:
            java.lang.String r1 = "did"
            java.lang.String r3 = cn.jiguang.av.g.a(r3)     // Catch: java.lang.Throwable -> L91
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L91
            java.lang.Boolean r3 = r4.c()     // Catch: java.lang.Throwable -> L91
            if (r3 == 0) goto L30
            java.lang.String r3 = "init"
            java.lang.Boolean r1 = r4.c()     // Catch: java.lang.Throwable -> L91
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L91
        L30:
            java.util.Date r3 = r4.a()     // Catch: java.lang.Throwable -> L91
            if (r3 == 0) goto L3f
            java.lang.String r1 = "started"
            java.lang.String r3 = cn.jiguang.av.e.a(r3)     // Catch: java.lang.Throwable -> L91
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L91
        L3f:
            cn.jiguang.ak.i$a r3 = r4.e()     // Catch: java.lang.Throwable -> L91
            if (r3 == 0) goto L54
            java.lang.String r1 = "status"
            java.lang.String r3 = r3.name()     // Catch: java.lang.Throwable -> L91
            java.util.Locale r2 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = r3.toLowerCase(r2)     // Catch: java.lang.Throwable -> L91
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L91
        L54:
            java.lang.Long r3 = r4.f()     // Catch: java.lang.Throwable -> L91
            if (r3 == 0) goto L63
            java.lang.String r3 = "seq"
            java.lang.Long r1 = r4.f()     // Catch: java.lang.Throwable -> L91
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L91
        L63:
            int r3 = r4.d()     // Catch: java.lang.Throwable -> L91
            if (r3 <= 0) goto L6e
            java.lang.String r1 = "errors"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L91
        L6e:
            java.lang.Double r3 = r4.g()     // Catch: java.lang.Throwable -> L91
            if (r3 == 0) goto L7d
            java.lang.String r3 = "duration"
            java.lang.Double r1 = r4.g()     // Catch: java.lang.Throwable -> L91
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L91
        L7d:
            java.util.Date r3 = r4.h()     // Catch: java.lang.Throwable -> L91
            if (r3 == 0) goto L90
            java.lang.String r3 = "timestamp"
            java.util.Date r4 = r4.h()     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = cn.jiguang.av.e.a(r4)     // Catch: java.lang.Throwable -> L91
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L91
        L90:
            return r0
        L91:
            r3 = move-exception
            java.lang.String r4 = "ExceptionParseUtils"
            java.lang.String r0 = "Error parse SentrySessionEnvelopeItem."
            cn.jiguang.w.f.a(r4, r0, r3)
            r3 = 0
            return r3
    }

    public static org.json.JSONObject a(android.content.Context r5, java.lang.Throwable r6) {
            java.lang.String r0 = "values"
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L43
            r2.<init>()     // Catch: org.json.JSONException -> L43
            org.json.JSONArray r3 = c(r5, r6)     // Catch: org.json.JSONException -> L43
            if (r3 == 0) goto Lce
            int r4 = r3.length()     // Catch: org.json.JSONException -> L43
            if (r4 <= 0) goto Lce
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L43
            r4.<init>()     // Catch: org.json.JSONException -> L43
            r4.put(r0, r3)     // Catch: org.json.JSONException -> L43
            java.lang.String r3 = "exception"
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L43
            boolean r3 = r6 instanceof cn.jiguang.aj.c     // Catch: org.json.JSONException -> L43
            if (r3 == 0) goto L46
            r3 = r6
            cn.jiguang.aj.c r3 = (cn.jiguang.aj.c) r3     // Catch: org.json.JSONException -> L43
            cn.jiguang.ak.c r3 = r3.a()     // Catch: org.json.JSONException -> L43
            if (r3 == 0) goto L46
            java.lang.String r3 = r3.a()     // Catch: org.json.JSONException -> L43
            java.lang.String r4 = "UncaughtExceptionHandler"
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: org.json.JSONException -> L43
            if (r3 == 0) goto L46
            java.lang.String r3 = "level"
            java.lang.String r4 = "fatal"
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L43
            goto L46
        L43:
            r5 = move-exception
            goto Lcf
        L46:
            org.json.JSONArray r6 = a(r6)     // Catch: org.json.JSONException -> L43
            if (r6 == 0) goto L5f
            int r3 = r6.length()     // Catch: org.json.JSONException -> L43
            if (r3 <= 0) goto L5f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L43
            r3.<init>()     // Catch: org.json.JSONException -> L43
            r3.put(r0, r6)     // Catch: org.json.JSONException -> L43
            java.lang.String r6 = "threads"
            r2.put(r6, r3)     // Catch: org.json.JSONException -> L43
        L5f:
            java.lang.String r6 = "timestamp"
            java.util.Date r0 = cn.jiguang.av.e.c()     // Catch: org.json.JSONException -> L43
            java.lang.String r0 = cn.jiguang.av.e.a(r0)     // Catch: org.json.JSONException -> L43
            r2.put(r6, r0)     // Catch: org.json.JSONException -> L43
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L43
            r6.<init>()     // Catch: org.json.JSONException -> L43
            java.lang.String r0 = "app"
            org.json.JSONObject r3 = cn.jiguang.ar.b.a(r5)     // Catch: org.json.JSONException -> L43
            r6.put(r0, r3)     // Catch: org.json.JSONException -> L43
            java.lang.String r0 = "os"
            org.json.JSONObject r3 = cn.jiguang.ar.b.d(r5)     // Catch: org.json.JSONException -> L43
            r6.put(r0, r3)     // Catch: org.json.JSONException -> L43
            java.lang.String r0 = "device"
            org.json.JSONObject r3 = cn.jiguang.ar.b.c(r5)     // Catch: org.json.JSONException -> L43
            r6.put(r0, r3)     // Catch: org.json.JSONException -> L43
            java.lang.String r0 = "contexts"
            r2.put(r0, r6)     // Catch: org.json.JSONException -> L43
            java.lang.String r6 = "dist"
            int r0 = cn.jiguang.a.a.f237d     // Catch: org.json.JSONException -> L43
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch: org.json.JSONException -> L43
            r2.put(r6, r0)     // Catch: org.json.JSONException -> L43
            java.lang.String r6 = "environment"
            java.lang.String r0 = "production"
            r2.put(r6, r0)     // Catch: org.json.JSONException -> L43
            java.lang.String r6 = "platform"
            java.lang.String r0 = "java"
            r2.put(r6, r0)     // Catch: org.json.JSONException -> L43
            cn.jiguang.ak.e r6 = new cn.jiguang.ak.e     // Catch: org.json.JSONException -> L43
            r6.<init>()     // Catch: org.json.JSONException -> L43
            cn.jiguang.aj.d.a = r6     // Catch: org.json.JSONException -> L43
            java.lang.String r0 = "event_id"
            java.lang.String r6 = r6.toString()     // Catch: org.json.JSONException -> L43
            r2.put(r0, r6)     // Catch: org.json.JSONException -> L43
            java.lang.String r6 = "sdk"
            org.json.JSONObject r0 = cn.jiguang.ar.b.a()     // Catch: org.json.JSONException -> L43
            r2.put(r6, r0)     // Catch: org.json.JSONException -> L43
            java.lang.String r6 = "user"
            org.json.JSONObject r5 = cn.jiguang.ar.b.b(r5)     // Catch: org.json.JSONException -> L43
            r2.put(r6, r5)     // Catch: org.json.JSONException -> L43
            return r2
        Lce:
            return r1
        Lcf:
            java.lang.String r6 = "ExceptionParseUtils"
            java.lang.String r0 = "Error parse SentryEventEnvelopeItem."
            cn.jiguang.w.f.a(r6, r0, r5)
            return r1
    }

    public static org.json.JSONObject a(java.lang.String r3) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L12
            r0.<init>()     // Catch: org.json.JSONException -> L12
            java.lang.String r1 = "content_type"
            java.lang.String r2 = "application/json"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L12
            java.lang.String r1 = "type"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L12
            return r0
        L12:
            r3 = move-exception
            java.lang.String r0 = "ExceptionParseUtils"
            java.lang.String r1 = "Error parse SentryEnvelopeItemHeader."
            cn.jiguang.w.f.a(r0, r1, r3)
            r3 = 0
            return r3
    }

    public static org.json.JSONObject a(boolean r3) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2d
            r0.<init>()     // Catch: org.json.JSONException -> L2d
            if (r3 == 0) goto L14
            cn.jiguang.ak.e r3 = cn.jiguang.aj.d.a     // Catch: org.json.JSONException -> L2d
            if (r3 == 0) goto L14
            java.lang.String r1 = "event_id"
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> L2d
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L2d
        L14:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2d
            r3.<init>()     // Catch: org.json.JSONException -> L2d
            cn.jiguang.internal.ActionManager r1 = cn.jiguang.internal.ActionManager.getInstance()     // Catch: org.json.JSONException -> L2d
            r1.wrapSdkVersionInfo(r3)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "core_sdk_ver"
            java.lang.String r2 = cn.jiguang.a.a.f236c     // Catch: org.json.JSONException -> L2d
            r3.put(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "sdks"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L2d
            return r0
        L2d:
            r3 = move-exception
            java.lang.String r0 = "ExceptionParseUtils"
            java.lang.String r1 = "Error parse SentryEnvelopeHeader."
            cn.jiguang.w.f.a(r0, r1, r3)
            r3 = 0
            return r3
    }

    private static void a(org.json.JSONObject r3, cn.jiguang.ak.c r4) {
            if (r4 != 0) goto L3
            return
        L3:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2c
            r0.<init>()     // Catch: org.json.JSONException -> L2c
            java.lang.String r1 = r4.a()     // Catch: org.json.JSONException -> L2c
            if (r1 == 0) goto L17
            java.lang.String r1 = "type"
            java.lang.String r2 = r4.a()     // Catch: org.json.JSONException -> L2c
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2c
        L17:
            java.lang.Boolean r1 = r4.b()     // Catch: org.json.JSONException -> L2c
            if (r1 == 0) goto L26
            java.lang.String r1 = "handled"
            java.lang.Boolean r4 = r4.b()     // Catch: org.json.JSONException -> L2c
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L2c
        L26:
            java.lang.String r4 = "mechanism"
            r3.put(r4, r0)     // Catch: org.json.JSONException -> L2c
            return
        L2c:
            r3 = move-exception
            java.lang.String r4 = "ExceptionParseUtils"
            java.lang.String r0 = "Error parse writeMechanism."
            cn.jiguang.w.f.a(r4, r0, r3)
            return
    }

    private static void a(org.json.JSONObject r2, cn.jiguang.ak.f r3) {
            if (r3 != 0) goto L4
            goto Le5
        L4:
            java.lang.Boolean r0 = r3.n()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto L13
            java.lang.String r0 = "native"
            java.lang.Boolean r1 = r3.n()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        L13:
            java.lang.String r0 = r3.a()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto L22
            java.lang.String r0 = "filename"
            java.lang.String r1 = r3.a()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        L22:
            java.lang.String r0 = r3.b()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto L31
            java.lang.String r0 = "function"
            java.lang.String r1 = r3.b()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        L31:
            java.lang.Boolean r0 = r3.h()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto L40
            java.lang.String r0 = "in_app"
            java.lang.Boolean r1 = r3.h()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        L40:
            java.lang.Integer r0 = r3.d()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto L4f
            java.lang.String r0 = "lineno"
            java.lang.Integer r1 = r3.d()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        L4f:
            java.lang.String r0 = r3.c()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto L5e
            java.lang.String r0 = "module"
            java.lang.String r1 = r3.c()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        L5e:
            java.lang.String r0 = r3.i()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto L6d
            java.lang.String r0 = "package"
            java.lang.String r1 = r3.i()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        L6d:
            java.lang.String r0 = r3.f()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto L7c
            java.lang.String r0 = "abs_path"
            java.lang.String r1 = r3.f()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        L7c:
            java.lang.Integer r0 = r3.e()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto L8b
            java.lang.String r0 = "colno"
            java.lang.Integer r1 = r3.e()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        L8b:
            java.lang.String r0 = r3.g()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto L9a
            java.lang.String r0 = "context_line"
            java.lang.String r1 = r3.g()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        L9a:
            java.lang.String r0 = r3.j()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto La9
            java.lang.String r0 = "platform"
            java.lang.String r1 = r3.j()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        La9:
            java.lang.String r0 = r3.k()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto Lb8
            java.lang.String r0 = "image_addr"
            java.lang.String r1 = r3.k()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        Lb8:
            java.lang.String r0 = r3.l()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto Lc7
            java.lang.String r0 = "symbol_addr"
            java.lang.String r1 = r3.l()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        Lc7:
            java.lang.String r0 = r3.m()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto Ld6
            java.lang.String r0 = "instruction_addr"
            java.lang.String r1 = r3.m()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Le6
        Ld6:
            java.lang.String r0 = r3.o()     // Catch: org.json.JSONException -> Le6
            if (r0 == 0) goto Le5
            java.lang.String r0 = "raw_function"
            java.lang.String r3 = r3.o()     // Catch: org.json.JSONException -> Le6
            r2.put(r0, r3)     // Catch: org.json.JSONException -> Le6
        Le5:
            return
        Le6:
            r2 = move-exception
            java.lang.String r3 = "ExceptionParseUtils"
            java.lang.String r0 = "Error parse StackFrame."
            cn.jiguang.w.f.a(r3, r0, r2)
            return
    }

    private static void a(org.json.JSONObject r6, cn.jiguang.ak.g r7) {
            if (r7 != 0) goto L3
            goto L6d
        L3:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6e
            r0.<init>()     // Catch: org.json.JSONException -> L6e
            java.util.List r1 = r7.a()     // Catch: org.json.JSONException -> L6e
            if (r1 == 0) goto L62
            java.util.List r1 = r7.a()     // Catch: org.json.JSONException -> L6e
            int r1 = r1.size()     // Catch: org.json.JSONException -> L6e
            if (r1 <= 0) goto L62
            java.lang.Boolean r1 = r7.b()     // Catch: org.json.JSONException -> L6e
            if (r1 == 0) goto L27
            java.lang.String r1 = "snapshot"
            java.lang.Boolean r2 = r7.b()     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
        L27:
            java.util.List r1 = r7.a()     // Catch: org.json.JSONException -> L6e
            int r1 = r1.size()     // Catch: org.json.JSONException -> L6e
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L6e
            r2.<init>()     // Catch: org.json.JSONException -> L6e
            r3 = 0
        L35:
            if (r3 >= r1) goto L57
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6e
            r4.<init>()     // Catch: org.json.JSONException -> L6e
            java.util.List r5 = r7.a()     // Catch: org.json.JSONException -> L6e
            java.lang.Object r5 = r5.get(r3)     // Catch: org.json.JSONException -> L6e
            cn.jiguang.ak.f r5 = (cn.jiguang.ak.f) r5     // Catch: org.json.JSONException -> L6e
            if (r5 == 0) goto L54
            a(r4, r5)     // Catch: org.json.JSONException -> L6e
            int r5 = r4.length()     // Catch: org.json.JSONException -> L6e
            if (r5 <= 0) goto L54
            r2.put(r4)     // Catch: org.json.JSONException -> L6e
        L54:
            int r3 = r3 + 1
            goto L35
        L57:
            int r7 = r2.length()     // Catch: org.json.JSONException -> L6e
            if (r7 <= 0) goto L62
            java.lang.String r7 = "frames"
            r0.put(r7, r2)     // Catch: org.json.JSONException -> L6e
        L62:
            int r7 = r0.length()     // Catch: org.json.JSONException -> L6e
            if (r7 <= 0) goto L6d
            java.lang.String r7 = "stacktrace"
            r6.put(r7, r0)     // Catch: org.json.JSONException -> L6e
        L6d:
            return
        L6e:
            r6 = move-exception
            java.lang.String r7 = "ExceptionParseUtils"
            java.lang.String r0 = "Error parse StackTrace."
            cn.jiguang.w.f.a(r7, r0, r6)
            return
    }

    public static void b(android.content.Context r7, java.lang.Throwable r8) {
            java.lang.String r0 = "ExceptionParseUtils"
            cn.jiguang.aj.k r1 = new cn.jiguang.aj.k     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            cn.jiguang.aj.j r2 = new cn.jiguang.aj.j     // Catch: java.lang.Throwable -> L70
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L70
            java.util.List r8 = r2.a(r8)     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L70
        L14:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L98
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L70
            cn.jiguang.ak.d r1 = (cn.jiguang.ak.d) r1     // Catch: java.lang.Throwable -> L70
            cn.jiguang.ak.g r2 = r1.e()     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L14
            cn.jiguang.ak.g r2 = r1.e()     // Catch: java.lang.Throwable -> L70
            java.util.List r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L31
            goto L14
        L31:
            cn.jiguang.ak.g r2 = r1.e()     // Catch: java.lang.Throwable -> L70
            java.util.List r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            r3 = 0
            r4 = 0
        L3b:
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L70
            if (r4 >= r5) goto L14
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L70
            cn.jiguang.ak.f r5 = (cn.jiguang.ak.f) r5     // Catch: java.lang.Throwable -> L70
            if (r5 != 0) goto L4a
            goto L95
        L4a:
            java.lang.String r5 = r5.c()     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = cn.jiguang.ar.b.a(r5)     // Catch: java.lang.Throwable -> L70
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L70
            if (r6 != 0) goto L95
            cn.jiguang.ak.c r8 = r1.f()     // Catch: java.lang.Throwable -> L70
            if (r8 == 0) goto L72
            java.lang.String r8 = "ANR"
            cn.jiguang.ak.c r1 = r1.f()     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r1.a()     // Catch: java.lang.Throwable -> L70
            boolean r8 = android.text.TextUtils.equals(r8, r1)     // Catch: java.lang.Throwable -> L70
            if (r8 == 0) goto L72
            r3 = 1
            goto L72
        L70:
            r7 = move-exception
            goto L99
        L72:
            cn.jiguang.al.b r8 = cn.jiguang.al.b.a()     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L7b
            java.lang.String r1 = "EX_ANR"
            goto L7d
        L7b:
            java.lang.String r1 = "EX_CRASH"
        L7d:
            r8.a(r7, r5, r1)     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r7.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = "sdk exception occurred, anr "
            r7.append(r8)     // Catch: java.lang.Throwable -> L70
            r7.append(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L70
            cn.jiguang.w.f.i(r0, r7)     // Catch: java.lang.Throwable -> L70
            return
        L95:
            int r4 = r4 + 1
            goto L3b
        L98:
            return
        L99:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "count ex failed, "
            r8.append(r1)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            cn.jiguang.w.f.i(r0, r7)
            return
    }

    private static org.json.JSONArray c(android.content.Context r6, java.lang.Throwable r7) {
            cn.jiguang.aj.k r6 = new cn.jiguang.aj.k     // Catch: org.json.JSONException -> L93
            r6.<init>()     // Catch: org.json.JSONException -> L93
            cn.jiguang.aj.j r0 = new cn.jiguang.aj.j     // Catch: org.json.JSONException -> L93
            r0.<init>(r6)     // Catch: org.json.JSONException -> L93
            java.util.List r6 = r0.a(r7)     // Catch: org.json.JSONException -> L93
            if (r6 == 0) goto L9b
            int r7 = r6.size()     // Catch: org.json.JSONException -> L93
            if (r7 <= 0) goto L9b
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: org.json.JSONException -> L93
            r7.<init>()     // Catch: org.json.JSONException -> L93
            int r0 = r6.size()     // Catch: org.json.JSONException -> L93
            r1 = 0
        L20:
            if (r1 >= r0) goto L8c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L93
            r2.<init>()     // Catch: org.json.JSONException -> L93
            java.lang.Object r3 = r6.get(r1)     // Catch: org.json.JSONException -> L93
            cn.jiguang.ak.d r3 = (cn.jiguang.ak.d) r3     // Catch: org.json.JSONException -> L93
            if (r3 == 0) goto L89
            cn.jiguang.ak.c r4 = r3.f()     // Catch: org.json.JSONException -> L93
            a(r2, r4)     // Catch: org.json.JSONException -> L93
            java.lang.String r4 = r3.c()     // Catch: org.json.JSONException -> L93
            if (r4 == 0) goto L45
            java.lang.String r4 = "module"
            java.lang.String r5 = r3.c()     // Catch: org.json.JSONException -> L93
            r2.put(r4, r5)     // Catch: org.json.JSONException -> L93
        L45:
            java.lang.Long r4 = r3.d()     // Catch: org.json.JSONException -> L93
            if (r4 == 0) goto L54
            java.lang.String r4 = "thread_id"
            java.lang.Long r5 = r3.d()     // Catch: org.json.JSONException -> L93
            r2.put(r4, r5)     // Catch: org.json.JSONException -> L93
        L54:
            java.lang.String r4 = r3.a()     // Catch: org.json.JSONException -> L93
            if (r4 == 0) goto L63
            java.lang.String r4 = "type"
            java.lang.String r5 = r3.a()     // Catch: org.json.JSONException -> L93
            r2.put(r4, r5)     // Catch: org.json.JSONException -> L93
        L63:
            java.lang.String r4 = r3.b()     // Catch: org.json.JSONException -> L93
            if (r4 == 0) goto L73
            java.lang.String r4 = "value"
            java.lang.String r5 = r3.b()     // Catch: org.json.JSONException -> L93
            r2.put(r4, r5)     // Catch: org.json.JSONException -> L93
        L73:
            cn.jiguang.ak.g r4 = r3.e()     // Catch: org.json.JSONException -> L93
            if (r4 == 0) goto L80
            cn.jiguang.ak.g r3 = r3.e()     // Catch: org.json.JSONException -> L93
            a(r2, r3)     // Catch: org.json.JSONException -> L93
        L80:
            int r3 = r2.length()     // Catch: org.json.JSONException -> L93
            if (r3 <= 0) goto L89
            r7.put(r2)     // Catch: org.json.JSONException -> L93
        L89:
            int r1 = r1 + 1
            goto L20
        L8c:
            int r6 = r7.length()     // Catch: org.json.JSONException -> L93
            if (r6 <= 0) goto L9b
            return r7
        L93:
            r6 = move-exception
            java.lang.String r7 = "ExceptionParseUtils"
            java.lang.String r0 = "Error parse Exception."
            cn.jiguang.w.f.a(r7, r0, r6)
        L9b:
            r6 = 0
            return r6
    }
}
