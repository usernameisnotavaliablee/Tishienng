package com.huawei.hms.framework.network.grs.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static final java.lang.String l = "c";
    private final com.huawei.hms.framework.network.grs.GrsBaseInfo a;
    private final android.content.Context b;
    private final n1.a c;
    private com.huawei.hms.framework.network.grs.g.d d;
    private final java.util.Map<java.lang.String, java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d>> e;
    private final java.util.List<com.huawei.hms.framework.network.grs.g.d> f;
    private final org.json.JSONArray g;
    private final java.util.List<java.lang.String> h;
    private final p1.c i;
    private java.lang.String j;
    private long k;

    public c(p1.c r3, n1.a r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            r2.e = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.f = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r2.g = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.h = r0
            java.lang.String r0 = ""
            r2.j = r0
            r0 = 1
            r2.k = r0
            r2.i = r3
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r3.c()
            r2.a = r0
            android.content.Context r3 = r3.a()
            r2.b = r3
            r2.c = r4
            r2.h()
            r2.i()
            return
    }

    private com.huawei.hms.framework.network.grs.g.d b(java.util.concurrent.ExecutorService r12, java.util.List<java.lang.String> r13, java.lang.String r14, n1.c r15) {
            r11 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r5 = 0
        L4:
            int r0 = r13.size()
            if (r5 >= r0) goto L9a
            java.lang.Object r0 = r13.get(r5)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L86
            com.huawei.hms.framework.network.grs.g.a r3 = new com.huawei.hms.framework.network.grs.g.a
            android.content.Context r7 = r11.b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r9 = r11.a
            r6 = r11
            r8 = r14
            r10 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.util.concurrent.Callable r14 = r3.g()
            java.util.concurrent.Future r14 = r12.submit(r14)
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d>> r15 = r6.e
            r15.put(r4, r14)
            r15 = 1
            long r3 = r6.k     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            java.lang.Object r14 = r14.get(r3, r0)     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            com.huawei.hms.framework.network.grs.g.d r14 = (com.huawei.hms.framework.network.grs.g.d) r14     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            if (r14 == 0) goto L5e
            boolean r0 = r14.D()     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            if (r0 != 0) goto L51
            boolean r0 = r14.B()     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            if (r0 == 0) goto L5e
            goto L51
        L4a:
            r0 = move-exception
            r2 = r14
            goto L6e
        L4d:
            r0 = move-exception
            r15 = r0
            r2 = r14
            goto L76
        L51:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.l     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            java.lang.String r2 = "grs request return body is not null and is OK."
            com.huawei.hms.framework.common.Logger.i(r0, r2)     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            r2 = r14
            goto L8a
        L5a:
            r2 = r14
            goto L66
        L5c:
            r2 = r14
            goto L7e
        L5e:
            r2 = r14
        L5f:
            r15 = 0
            goto L8a
        L61:
            r0 = move-exception
            goto L6e
        L63:
            r0 = move-exception
            r15 = r0
            goto L76
        L66:
            java.lang.String r14 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r15 = "the wait timed out"
            com.huawei.hms.framework.common.Logger.w(r14, r15)
            goto L5f
        L6e:
            java.lang.String r14 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r3 = "the current thread was interrupted while waiting"
            com.huawei.hms.framework.common.Logger.w(r14, r3, r0)
            goto L8a
        L76:
            java.lang.String r14 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r0 = "the computation threw an ExecutionException"
            com.huawei.hms.framework.common.Logger.w(r14, r0, r15)
            goto L5f
        L7e:
            java.lang.String r14 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r0 = "{requestServer} the computation was cancelled"
            com.huawei.hms.framework.common.Logger.i(r14, r0)
            goto L8a
        L86:
            r6 = r11
            r8 = r14
            r10 = r15
            goto L5f
        L8a:
            if (r15 == 0) goto L94
            java.lang.String r12 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r13 = "needBreak is true so need break current circulation"
            com.huawei.hms.framework.common.Logger.v(r12, r13)
            goto L9b
        L94:
            int r5 = r5 + 1
            r14 = r8
            r15 = r10
            goto L4
        L9a:
            r6 = r11
        L9b:
            com.huawei.hms.framework.network.grs.g.d r12 = r11.g(r2)
            return r12
    }

    private void e(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r4)
            com.huawei.hms.framework.network.grs.GrsBaseInfo r4 = r3.a
            java.lang.String r5 = r3.j()
            android.content.Context r1 = r3.b
            r2 = 0
            java.lang.String r4 = r4.getGrsReqParamJoint(r2, r2, r5, r1)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L26
            java.lang.String r5 = "?"
            r0.append(r5)
            r0.append(r4)
        L26:
            java.util.List<java.lang.String> r4 = r3.h
            java.lang.String r5 = r0.toString()
            r4.add(r5)
            return
    }

    private com.huawei.hms.framework.network.grs.g.d g(com.huawei.hms.framework.network.grs.g.d r7) {
            r6 = this;
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d>> r0 = r6.e
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r7 == 0) goto L24
            boolean r2 = r7.D()
            if (r2 != 0) goto L70
            boolean r2 = r7.B()
            if (r2 != 0) goto L70
        L24:
            java.lang.Object r2 = r1.getValue()     // Catch: java.util.concurrent.TimeoutException -> L37 java.lang.InterruptedException -> L39 java.util.concurrent.ExecutionException -> L3b java.util.concurrent.CancellationException -> L68
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2     // Catch: java.util.concurrent.TimeoutException -> L37 java.lang.InterruptedException -> L39 java.util.concurrent.ExecutionException -> L3b java.util.concurrent.CancellationException -> L68
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L37 java.lang.InterruptedException -> L39 java.util.concurrent.ExecutionException -> L3b java.util.concurrent.CancellationException -> L68
            r4 = 40000(0x9c40, double:1.97626E-319)
            java.lang.Object r2 = r2.get(r4, r3)     // Catch: java.util.concurrent.TimeoutException -> L37 java.lang.InterruptedException -> L39 java.util.concurrent.ExecutionException -> L3b java.util.concurrent.CancellationException -> L68
            com.huawei.hms.framework.network.grs.g.d r2 = (com.huawei.hms.framework.network.grs.g.d) r2     // Catch: java.util.concurrent.TimeoutException -> L37 java.lang.InterruptedException -> L39 java.util.concurrent.ExecutionException -> L3b java.util.concurrent.CancellationException -> L68
            r7 = r2
            goto La
        L37:
            goto L3d
        L39:
            r1 = move-exception
            goto L5b
        L3b:
            r1 = move-exception
            goto L63
        L3d:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r3 = "{checkResponse} when check result, find TimeoutException, cancel current request task"
            com.huawei.hms.framework.common.Logger.w(r2, r3)
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            boolean r2 = r2.isCancelled()
            if (r2 != 0) goto La
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r2 = 1
            r1.cancel(r2)
            goto La
        L5b:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r3 = "{checkResponse} when check result, find InterruptedException, check others"
        L5f:
            com.huawei.hms.framework.common.Logger.w(r2, r3, r1)
            goto La
        L63:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r3 = "{checkResponse} when check result, find ExecutionException, check others"
            goto L5f
        L68:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r2 = "{checkResponse} when check result, find CancellationException, check others"
            com.huawei.hms.framework.common.Logger.i(r1, r2)
            goto La
        L70:
            return r7
    }

    private void h() {
            r4 = this;
            android.content.Context r0 = r4.b
            p1.d r0 = o1.a.a(r0)
            if (r0 != 0) goto L10
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r1 = "g*s***_se****er_conf*** maybe has a big error"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            return
        L10:
            r4.f(r0)
            java.util.List r1 = r0.a()
            if (r1 == 0) goto L6e
            int r2 = r1.size()
            if (r2 > 0) goto L20
            goto L6e
        L20:
            int r2 = r1.size()
            r3 = 10
            if (r2 > r3) goto L66
            java.lang.String r0 = r0.e()
            int r2 = r1.size()
            if (r2 <= 0) goto L56
            java.util.Iterator r1 = r1.iterator()
        L36:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "https://"
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L52
            java.lang.String r2 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r3 = "grs server just support https scheme url,please check."
            com.huawei.hms.framework.common.Logger.w(r2, r3)
            goto L36
        L52:
            r4.e(r0, r2)
            goto L36
        L56:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.l
            java.util.List<java.lang.String> r1 = r4.h
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "request to GRS server url is {%s}"
            com.huawei.hms.framework.common.Logger.v(r0, r1, r2)
            return
        L66:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "grs_base_url's count is larger than MAX value 10"
            r0.<init>(r1)
            throw r0
        L6e:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r1 = "maybe grs_base_url config with [],please check."
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            return
    }

    private void i() {
            r3 = this;
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r3.a
            android.content.Context r1 = r3.b
            r2 = 1
            java.lang.String r0 = r0.getGrsParasKey(r2, r2, r1)
            n1.a r1 = r3.c
            n1.c r1 = r1.b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "ETag"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = ""
            java.lang.String r0 = r1.a(r0, r2)
            r3.j = r0
            return
    }

    private java.lang.String j() {
            r4 = this;
            android.content.Context r0 = r4.b
            java.lang.String r0 = r0.getPackageName()
            com.huawei.hms.framework.network.grs.f.b r0 = com.huawei.hms.framework.network.grs.f.b.a(r0)
            if (r0 == 0) goto L11
            t1.a r0 = r0.d()
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L26
            java.lang.String r0 = r0.a()
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.c.l
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r3 = "get appName from local assets is{%s}"
            com.huawei.hms.framework.common.Logger.v(r1, r3, r2)
            return r0
        L26:
            java.lang.String r0 = ""
            return r0
    }

    public com.huawei.hms.framework.network.grs.g.d a(java.util.concurrent.ExecutorService r5, java.lang.String r6, n1.c r7) {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r5 = 0
            return r5
        La:
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.List<java.lang.String> r2 = r4.h
            com.huawei.hms.framework.network.grs.g.d r5 = r4.b(r5, r2, r6, r7)
            r6 = 0
            if (r5 != 0) goto L19
            r7 = 0
            goto L1d
        L19:
            int r7 = r5.f()
        L1d:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r6] = r7
            java.lang.String r6 = "use 2.0 interface return http's code is：{%d}"
            com.huawei.hms.framework.common.Logger.i(r2, r6, r3)
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.huawei.hms.framework.network.grs.g.d> r1 = r4.f
            r0.<init>(r1)
            org.json.JSONArray r1 = r4.g
            android.content.Context r2 = r4.b
            com.huawei.hms.framework.network.grs.g.e.b(r0, r6, r1, r2)
            java.util.List<com.huawei.hms.framework.network.grs.g.d> r6 = r4.f
            r6.clear()
            return r5
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public synchronized void d(com.huawei.hms.framework.network.grs.g.d r7) {
            r6 = this;
            monitor-enter(r6)
            java.util.List<com.huawei.hms.framework.network.grs.g.d> r0 = r6.f     // Catch: java.lang.Throwable -> L19
            r0.add(r7)     // Catch: java.lang.Throwable -> L19
            com.huawei.hms.framework.network.grs.g.d r0 = r6.d     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L25
            boolean r0 = r0.D()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1c
            com.huawei.hms.framework.network.grs.g.d r0 = r6.d     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.B()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L25
            goto L1c
        L19:
            r7 = move-exception
            goto Lc1
        L1c:
            java.lang.String r7 = com.huawei.hms.framework.network.grs.g.c.l     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "grsResponseResult is ok"
            com.huawei.hms.framework.common.Logger.v(r7, r0)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r6)
            return
        L25:
            boolean r0 = r7.C()     // Catch: java.lang.Throwable -> L19
            r1 = 1
            if (r0 == 0) goto L4d
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.l     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "GRS server open 503 limiting strategy."
            com.huawei.hms.framework.common.Logger.i(r0, r2)     // Catch: java.lang.Throwable -> L19
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r6.a     // Catch: java.lang.Throwable -> L19
            android.content.Context r2 = r6.b     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r0.getGrsParasKey(r1, r1, r2)     // Catch: java.lang.Throwable -> L19
            q1.d$a r1 = new q1.d$a     // Catch: java.lang.Throwable -> L19
            long r2 = r7.z()     // Catch: java.lang.Throwable -> L19
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L19
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L19
            q1.d.b(r0, r1)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r6)
            return
        L4d:
            boolean r0 = r7.B()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L5a
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.l     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "GRS server open 304 Not Modified."
            com.huawei.hms.framework.common.Logger.i(r0, r2)     // Catch: java.lang.Throwable -> L19
        L5a:
            boolean r0 = r7.D()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L6f
            boolean r0 = r7.B()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L6f
            java.lang.String r7 = com.huawei.hms.framework.network.grs.g.c.l     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "grsResponseResult has exception so need return"
            com.huawei.hms.framework.common.Logger.v(r7, r0)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r6)
            return
        L6f:
            r6.d = r7     // Catch: java.lang.Throwable -> L19
            n1.a r0 = r6.c     // Catch: java.lang.Throwable -> L19
            com.huawei.hms.framework.network.grs.GrsBaseInfo r2 = r6.a     // Catch: java.lang.Throwable -> L19
            android.content.Context r3 = r6.b     // Catch: java.lang.Throwable -> L19
            p1.c r4 = r6.i     // Catch: java.lang.Throwable -> L19
            r0.d(r2, r7, r3, r4)     // Catch: java.lang.Throwable -> L19
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d>> r0 = r6.e     // Catch: java.lang.Throwable -> L19
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L19
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L19
        L86:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto Lbf
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L19
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = r7.A()     // Catch: java.lang.Throwable -> L19
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L19
            if (r3 != 0) goto L86
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3     // Catch: java.lang.Throwable -> L19
            boolean r3 = r3.isCancelled()     // Catch: java.lang.Throwable -> L19
            if (r3 != 0) goto L86
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.c.l     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = "future cancel"
            com.huawei.hms.framework.common.Logger.i(r3, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2     // Catch: java.lang.Throwable -> L19
            r2.cancel(r1)     // Catch: java.lang.Throwable -> L19
            goto L86
        Lbf:
            monitor-exit(r6)
            return
        Lc1:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L19
            throw r7
    }

    public void f(p1.d r1) {
            r0 = this;
            return
    }
}
