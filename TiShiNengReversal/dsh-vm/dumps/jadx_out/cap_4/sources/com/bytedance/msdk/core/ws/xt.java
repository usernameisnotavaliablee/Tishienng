package com.bytedance.msdk.core.ws;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt implements com.bytedance.msdk.j.up.tl.j {
    private static volatile boolean j;

    /* renamed from: r, reason: collision with root package name */
    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static volatile com.bytedance.msdk.core.ws.xt f2300r;
    private final java.util.concurrent.atomic.AtomicBoolean ae;
    private final android.content.Context cw;
    private final java.util.concurrent.atomic.AtomicBoolean g;

    /* renamed from: m, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f2301m;
    private int oq;
    private final com.bytedance.msdk.j.up.tl tl;
    private final java.util.concurrent.atomic.AtomicInteger up;
    private final com.bytedance.msdk.core.ws.j xt;




    private class cw extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bytedance.msdk.core.ws.xt j;

        private cw(com.bytedance.msdk.core.ws.xt r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        /* synthetic */ cw(com.bytedance.msdk.core.ws.xt r1, com.bytedance.msdk.core.ws.xt.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                if (r4 != 0) goto L3
                goto L64
            L3:
                com.bytedance.sdk.openadsdk.core.oq r3 = com.bytedance.sdk.openadsdk.core.oq.i()
                boolean r3 = r3.la()
                if (r3 == 0) goto Le
                goto L64
            Le:
                java.lang.String r3 = "--==-- settings receiver"
                java.lang.String r0 = "SdkSettingsHelper"
                com.bytedance.msdk.j.up.cw.j(r0, r3)
                java.lang.String r3 = "b_msg_id"
                r1 = -1
                int r3 = r4.getIntExtra(r3, r1)
                r1 = 1
                if (r3 != r1) goto L64
                java.lang.String r3 = "b_msg_process_name"
                java.lang.String r3 = r4.getStringExtra(r3)     // Catch: java.lang.Throwable -> L3b
                com.bytedance.msdk.core.ws.xt r4 = r2.j     // Catch: java.lang.Throwable -> L3b
                android.content.Context r4 = com.bytedance.msdk.core.ws.xt.j(r4)     // Catch: java.lang.Throwable -> L3b
                java.lang.String r4 = com.bytedance.msdk.tl.s.xt(r4)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch: java.lang.Throwable -> L3b
                if (r3 == 0) goto L3d
                java.lang.String r3 = "--==-- settings receiver, same process, return"
                com.bytedance.msdk.j.up.cw.j(r0, r3)     // Catch: java.lang.Throwable -> L3b
                return
            L3b:
                r3 = move-exception
                goto L61
            L3d:
                com.bytedance.msdk.core.ws.xt r3 = r2.j     // Catch: java.lang.Throwable -> L3b
                com.bytedance.msdk.core.ws.j r3 = com.bytedance.msdk.core.ws.xt.xt(r3)     // Catch: java.lang.Throwable -> L3b
                if (r3 == 0) goto L64
                java.lang.String r3 = "--==-- settings receiver loadData"
                com.bytedance.msdk.j.up.cw.j(r0, r3)     // Catch: java.lang.Throwable -> L3b
                com.bytedance.msdk.core.ws.xt r3 = r2.j     // Catch: java.lang.Throwable -> L3b
                com.bytedance.msdk.core.ws.j r3 = com.bytedance.msdk.core.ws.xt.xt(r3)     // Catch: java.lang.Throwable -> L3b
                r4 = 0
                r3.j(r4)     // Catch: java.lang.Throwable -> L3b
                com.bytedance.msdk.ae.j.cw r3 = com.bytedance.msdk.ae.j.cw.j()     // Catch: java.lang.Throwable -> L3b
                r3.xt()     // Catch: java.lang.Throwable -> L3b
                java.lang.String r3 = "--==-- settings receiver loadData end"
                com.bytedance.msdk.j.up.cw.j(r0, r3)     // Catch: java.lang.Throwable -> L3b
                return
            L61:
                com.bytedance.sdk.component.utils.vl.j(r3)
            L64:
                return
        }
    }

    interface j {
        public static final java.lang.String j = null;

        static {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.bytedance.msdk.tl.rn.j()
                r0.append(r1)
                java.lang.String r1 = ".openadsdk.permission.TT_PANGOLIN"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.bytedance.msdk.core.ws.xt.j.j = r0
                return
        }
    }

    /* renamed from: com.bytedance.msdk.core.ws.xt$xt, reason: collision with other inner class name */
    private class RunnableC0232xt implements java.lang.Runnable {
        private int cw;
        final /* synthetic */ com.bytedance.msdk.core.ws.xt j;
        private final com.bytedance.msdk.api.r.up xt;

        RunnableC0232xt(com.bytedance.msdk.core.ws.xt r1, com.bytedance.msdk.api.r.up r2, int r3) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                r0.xt = r2
                r0.cw = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.bytedance.msdk.core.ws.xt r0 = r4.j
                android.content.Context r0 = com.bytedance.msdk.core.ws.xt.j(r0)
                boolean r0 = com.bytedance.msdk.tl.x.j(r0)
                if (r0 != 0) goto L17
                com.bytedance.msdk.core.ws.xt r0 = r4.j     // Catch: java.lang.Throwable -> L44
                com.bytedance.msdk.core.ws.j r0 = com.bytedance.msdk.core.ws.xt.xt(r0)     // Catch: java.lang.Throwable -> L44
                r1 = 0
                r0.j(r1)     // Catch: java.lang.Throwable -> L44
                return
            L17:
                com.bytedance.msdk.core.ws.xt r0 = r4.j
                java.util.concurrent.atomic.AtomicBoolean r0 = com.bytedance.msdk.core.ws.xt.cw(r0)
                r1 = 1
                r0.set(r1)
                com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
                boolean r0 = r0.l()
                boolean r2 = com.bytedance.msdk.core.ws.xt.r()
                if (r2 != 0) goto L35
                com.bytedance.msdk.core.ws.xt.j(r1)
                com.bytedance.msdk.m.r.j(r0)
            L35:
                boolean r1 = com.bytedance.msdk.tl.r.j.j()
                if (r1 != 0) goto L44
                com.bytedance.msdk.core.ws.xt r1 = r4.j
                com.bytedance.msdk.api.r.up r2 = r4.xt
                int r3 = r4.cw
                com.bytedance.msdk.core.ws.xt.j(r1, r0, r2, r3)
            L44:
                return
        }
    }

    static {
            return
    }

    private xt(com.bytedance.msdk.core.ws.j r5) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r4.up = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r4.f2301m = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r4.ae = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r4.g = r0
            r0 = -1
            r4.oq = r0
            if (r5 != 0) goto L29
            com.bytedance.msdk.core.ws.cw r5 = com.bytedance.msdk.core.xt.xt()
        L29:
            r4.xt = r5
            android.content.Context r5 = com.bytedance.msdk.core.xt.getContext()
            r4.cw = r5
            com.bytedance.msdk.j.up.tl r0 = new com.bytedance.msdk.j.up.tl
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r4)
            r4.tl = r0
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.jy()
            if (r0 == 0) goto L5d
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "com.bytedance.msdk.core.setting.SettingsReceiver"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L59
            com.bytedance.msdk.core.ws.xt$cw r1 = new com.bytedance.msdk.core.ws.xt$cw     // Catch: java.lang.Throwable -> L59
            r2 = 0
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = com.bytedance.msdk.core.ws.xt.j.j     // Catch: java.lang.Throwable -> L59
            r5.registerReceiver(r1, r0, r3, r2)     // Catch: java.lang.Throwable -> L59
            return
        L59:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L5d:
            return
    }

    private org.json.JSONObject ae() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.msdk.m.xt.xt.j()
            java.util.List r1 = tl()
            if (r1 == 0) goto L35
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.bytedance.msdk.m.xt.xt r3 = com.bytedance.msdk.m.xt.xt.j()
            com.bytedance.msdk.j.j.r r3 = r3.j(r2)
            if (r3 == 0) goto L12
            java.lang.String r3 = r3.xt()     // Catch: org.json.JSONException -> L30
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L30
            goto L12
        L30:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            goto L12
        L35:
            return r0
    }

    private java.lang.String cw(org.json.JSONObject r1) {
            r0 = this;
            org.json.JSONObject r1 = com.bytedance.msdk.tl.rn.j(r1)
            if (r1 == 0) goto Lb
            java.lang.String r1 = r1.toString()
            return r1
        Lb:
            r1 = 0
            return r1
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean cw(com.bytedance.msdk.core.ws.xt r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f2301m
            return r0
    }

    public static org.json.JSONObject cw() {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.m r1 = r1.l()
            r2 = 0
            if (r1 == 0) goto L38
            java.util.Map r1 = r1.j()
            if (r1 == 0) goto L38
            java.util.Set r3 = r1.keySet()     // Catch: java.lang.Exception -> L32
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L32
        L1e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L32
            if (r4 == 0) goto L34
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L32
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L32
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Exception -> L32
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L32
            goto L1e
        L32:
            r0 = move-exception
            goto L35
        L34:
            return r0
        L35:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L38:
            return r2
    }

    static /* synthetic */ android.content.Context j(com.bytedance.msdk.core.ws.xt r0) {
            android.content.Context r0 = r0.cw
            return r0
    }

    public static com.bytedance.msdk.core.ws.xt j(com.bytedance.msdk.core.ws.j r2) {
            com.bytedance.msdk.core.ws.xt r0 = com.bytedance.msdk.core.ws.xt.f2300r
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.ws.xt> r0 = com.bytedance.msdk.core.ws.xt.class
            monitor-enter(r0)
            com.bytedance.msdk.core.ws.xt r1 = com.bytedance.msdk.core.ws.xt.f2300r     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.core.ws.xt r1 = new com.bytedance.msdk.core.ws.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.core.ws.xt.f2300r = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.bytedance.msdk.core.ws.xt r2 = com.bytedance.msdk.core.ws.xt.f2300r
            return r2
    }

    public static java.lang.String j(java.lang.Throwable r2) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.getClass()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L20
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L20
            r0.close()     // Catch: java.io.IOException -> L14
        L14:
            r1.close()
            goto L27
        L18:
            r2 = move-exception
            r0.close()     // Catch: java.io.IOException -> L1c
        L1c:
            r1.close()
            throw r2
        L20:
            r0.close()     // Catch: java.io.IOException -> L23
        L23:
            r1.close()
            r2 = 0
        L27:
            return r2
    }

    private java.util.Map<java.lang.String, java.lang.String> j(java.util.Map<java.lang.String, java.lang.String> r5) {
            r4 = this;
            if (r5 == 0) goto L35
            int r0 = r5.size()
            if (r0 != 0) goto L9
            goto L35
        L9:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L16
            java.lang.String r3 = r2.toLowerCase()
            java.lang.Object r2 = r5.get(r2)
            r0.put(r3, r2)
            goto L16
        L34:
            return r0
        L35:
            r5 = 0
            return r5
    }

    private void j(com.bytedance.msdk.api.r.up r6, int r7, int r8, java.lang.String r9, boolean r10) {
            r5 = this;
            java.lang.String r0 = " msg = "
            if (r10 == 0) goto Lf
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> Ld
            r2 = 1
            r1.xt(r2)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r6 = move-exception
            goto L79
        Lf:
            if (r10 == 0) goto L14
            java.lang.String r10 = "v4Enc_config"
            goto L16
        L14:
            java.lang.String r10 = "v2Enc_config"
        L16:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "code = "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld
            r1.append(r8)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "，msg = "
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld
            r1.append(r9)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            r3 = 0
            com.bytedance.msdk.tl.l.j(r10, r2, r3, r1)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r10 = "SdkSettingsHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "----拉取配置失败: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld
            r1.append(r8)     // Catch: java.lang.Throwable -> Ld
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld
            r1.append(r9)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld
            com.bytedance.msdk.j.up.cw.r(r10, r1)     // Catch: java.lang.Throwable -> Ld
            com.bytedance.msdk.api.j r10 = new com.bytedance.msdk.api.j     // Catch: java.lang.Throwable -> Ld
            r10.<init>(r8, r9)     // Catch: java.lang.Throwable -> Ld
            r5.j(r6, r10, r7)     // Catch: java.lang.Throwable -> Ld
            com.bytedance.msdk.core.ws.cw r6 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> Ld
            boolean r6 = r6.l()     // Catch: java.lang.Throwable -> Ld
            if (r6 != 0) goto L78
            com.bytedance.msdk.core.qv.j r6 = com.bytedance.msdk.core.qv.j.j()     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            java.lang.String r10 = "聚合config请求失败 code = "
            r7.<init>(r10)     // Catch: java.lang.Throwable -> Ld
            r7.append(r8)     // Catch: java.lang.Throwable -> Ld
            r7.append(r0)     // Catch: java.lang.Throwable -> Ld
            r7.append(r9)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Ld
            r6.j(r8, r7)     // Catch: java.lang.Throwable -> Ld
        L78:
            return
        L79:
            com.bytedance.sdk.component.utils.vl.j(r6)
            return
    }

    private void j(com.bytedance.msdk.api.r.up r2, com.bytedance.msdk.api.j r3) {
            r1 = this;
            com.bytedance.msdk.core.ws.xt$1 r0 = new com.bytedance.msdk.core.ws.xt$1
            r0.<init>(r1, r2, r3)
            com.bytedance.msdk.j.up.m.cw(r0)
            return
    }

    private void j(com.bytedance.msdk.api.r.up r8, com.bytedance.msdk.api.j r9, int r10) throws java.lang.Throwable {
            r7 = this;
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.j()
            java.lang.String r1 = "server_dist_host"
            r0.m(r1)
            r7.j(r8, r9)
            com.bytedance.msdk.m.cw.up()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "setting 配置拉取失败，尝试再次拉取... mLoadingSuccess:"
            r8.<init>(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.ae
            boolean r9 = r9.get()
            r8.append(r9)
            java.lang.String r9 = " mRetryCount:"
            r8.append(r9)
            java.util.concurrent.atomic.AtomicInteger r9 = r7.up
            int r9 = r9.get()
            r0 = 1
            int r9 = r9 + r0
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "SdkSettingsHelper"
            com.bytedance.msdk.j.up.cw.r(r9, r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f2301m
            r1 = 0
            r8.set(r1)
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.ae
            boolean r8 = r8.get()
            r2 = 0
            if (r8 == 0) goto L52
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.g
            r8.set(r1)
            com.bytedance.msdk.j.up.tl r8 = r7.tl
            r8.removeCallbacksAndMessages(r2)
            return
        L52:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.up
            int r8 = r8.get()
            r3 = 3
            if (r8 <= r3) goto L61
            java.lang.String r8 = "setting 最多尝试四次拉取... "
            com.bytedance.msdk.j.up.cw.r(r9, r8)
            return
        L61:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.g
            r8.set(r0)
            android.os.Message r8 = android.os.Message.obtain()
            r8.what = r0
            java.util.concurrent.atomic.AtomicInteger r4 = r7.up
            int r4 = r4.get()
            r8.arg1 = r4
            r8.arg2 = r10
            java.util.concurrent.atomic.AtomicInteger r10 = r7.up
            int r10 = r10.get()
            if (r10 >= r3) goto L8e
            r3 = 1
        L80:
            if (r1 > r10) goto L89
            r5 = 3
            long r3 = r3 * r5
            int r1 = r1 + 1
            goto L80
        L89:
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            goto L91
        L8e:
            r3 = 120000(0x1d4c0, double:5.9288E-319)
        L91:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.up
            r1.incrementAndGet()
            com.bytedance.msdk.j.up.tl r1 = r7.tl
            r1.removeCallbacksAndMessages(r2)
            com.bytedance.msdk.j.up.tl r1 = r7.tl
            r1.sendMessageDelayed(r8, r3)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "setting 重试次数:"
            r8.<init>(r1)
            int r10 = r10 + r0
            r8.append(r10)
            java.lang.String r10 = "  重试间隔："
            r8.append(r10)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            com.bytedance.msdk.j.up.cw.xt(r9, r8)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.ws.xt r0, com.bytedance.msdk.api.r.up r1, int r2, int r3, java.lang.String r4, boolean r5) {
            r0.j(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.ws.xt r0, boolean r1, com.bytedance.msdk.api.r.up r2, int r3) {
            r0.j(r1, r2, r3)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.ws.xt r0, int[] r1, int[] r2, com.bytedance.sdk.component.g.xt r3, org.json.JSONObject r4, java.lang.String r5, int[] r6, com.bytedance.msdk.api.r.up r7, org.json.JSONObject r8, int r9, boolean r10, long r11) throws java.lang.Throwable {
            r0.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    private void j(org.json.JSONObject r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto Le
        L3:
            java.lang.String r0 = "remote_log_enabled"
            boolean r2 = r2.optBoolean(r0)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto Le
            com.bytedance.msdk.j.up.cw.j()     // Catch: java.lang.Throwable -> Le
        Le:
            return
    }

    private void j(boolean r3, long r4) {
            r2 = this;
            if (r3 == 0) goto L5
            java.lang.String r3 = "v4Enc_config"
            goto L7
        L5:
            java.lang.String r3 = "v2Enc_config"
        L7:
            r0 = 1
            java.lang.String r1 = ""
            com.bytedance.msdk.tl.l.j(r3, r0, r4, r1)
            return
    }

    private void j(boolean r13, com.bytedance.msdk.api.r.up r14, int r15) {
            r12 = this;
            r0 = 0
            int[] r3 = new int[]{r0}
            r0 = 1
            int[] r2 = new int[r0]
            long r7 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.core.g.up r0 = com.bytedance.msdk.core.g.up.r()
            java.util.Map r0 = r0.xt(r15)
            java.lang.String r4 = "event_label_value_root"
            java.lang.Object r4 = r0.get(r4)
            r10 = r4
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.String r4 = "config_req_label_value_root"
            java.lang.Object r0 = r0.get(r4)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            com.bytedance.msdk.r.xt r4 = com.bytedance.msdk.r.xt.j()
            com.bytedance.sdk.component.g.j r4 = r4.xt()
            com.bytedance.sdk.component.g.xt.up r11 = r4.xt()
            java.lang.String r4 = com.bytedance.msdk.core.cw.j()
            r11.j(r4)
            com.bytedance.msdk.core.j r4 = com.bytedance.msdk.core.j.qv()
            java.lang.String r4 = r4.tl()
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L52
            java.lang.String r6 = "X-Tt-Env"
            r11.xt(r6, r4)
            java.lang.String r4 = "x-use-ppe"
            java.lang.String r6 = "1"
            r11.xt(r4, r6)
        L52:
            java.lang.String r4 = "User-Agent"
            java.lang.String r6 = com.bytedance.msdk.xt.xt.j
            r11.xt(r4, r6)
            org.json.JSONObject r0 = r12.xt(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L92
            com.bytedance.msdk.core.ws.cw r4 = com.bytedance.msdk.core.xt.xt()
            boolean r4 = r4.r()
            r6 = r4 ^ 1
            if (r4 != 0) goto L7e
            java.lang.String r4 = "x-pglcypher"
            java.lang.String r9 = "4"
            r11.xt(r4, r9)
            java.lang.String r0 = r0.toString()
            byte[] r0 = com.bytedance.msdk.tl.rn.xt(r0)
            java.lang.String r4 = "application/octet-stream"
            r11.j(r4, r0)
            goto L85
        L7e:
            java.lang.String r0 = r12.cw(r0)
            r11.cw(r0)
        L85:
            com.bytedance.msdk.core.ws.xt$3 r0 = new com.bytedance.msdk.core.ws.xt$3
            r1 = r12
            r9 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            r11.j(r0)
            return
        L92:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            com.bytedance.msdk.core.qv.j r0 = com.bytedance.msdk.core.qv.j.j()
            r1 = 81017(0x13c79, float:1.13529E-40)
            java.lang.String r2 = "GM接口请求异常"
            r0.j(r1, r2)
            return
    }

    private void j(int[] r13, int[] r14, com.bytedance.sdk.component.g.xt r15, org.json.JSONObject r16, java.lang.String r17, int[] r18, com.bytedance.msdk.api.r.up r19, org.json.JSONObject r20, int r21, boolean r22, long r23) throws java.lang.Throwable {
            r12 = this;
            r0 = r16
            r1 = r19
            r2 = r22
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r23
            java.util.Map r5 = r15.cw()
            java.util.Map r5 = r12.j(r5)
            r6 = 0
            if (r5 == 0) goto L30
            java.lang.String r7 = "active-control"
            java.lang.Object r7 = r5.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "ts"
            java.lang.Object r8 = r5.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "pst"
            java.lang.Object r5 = r5.get(r9)
            java.lang.String r5 = (java.lang.String) r5
            goto L33
        L30:
            r5 = r6
            r7 = r5
            r8 = r7
        L33:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = r17
            r9.append(r10)
            r9.append(r7)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r8 = com.bytedance.msdk.tl.f.j(r8)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L5e
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L5e
            com.bytedance.msdk.core.ws.cw r5 = com.bytedance.msdk.core.xt.xt()
            r5.r(r7)
        L5e:
            r12.j(r0)
            java.lang.String r5 = "state_code"
            r7 = -80000(0xfffffffffffec780, float:NaN)
            int r5 = r0.optInt(r5, r7)
            java.lang.String r8 = "message"
            java.lang.String r8 = r0.optString(r8)
            r9 = 20000(0x4e20, float:2.8026E-41)
            r10 = 0
            if (r5 != r9) goto L77
            r13[r10] = r9
        L77:
            r11 = 30004(0x7534, float:4.2045E-41)
            if (r5 != r11) goto L9b
            r13[r10] = r11
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f2301m
            r13.set(r10)
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.g
            r13.set(r10)
            com.bytedance.msdk.j.up.tl r13 = r12.tl
            r13.removeCallbacksAndMessages(r6)
            com.bytedance.msdk.core.ws.j r13 = r12.xt
            r13.j(r0)
            r12.j(r1)
            com.bytedance.msdk.m.cw.r()
            r12.j(r2, r3)
            return
        L9b:
            if (r5 != r9) goto Lf8
            java.lang.String r11 = r0.toString()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto Lf8
            r5 = 1
            r14[r10] = r5
            r13[r10] = r9
            java.lang.String r13 = r15.r()
            if (r13 == 0) goto Lb8
            int r13 = r13.length()
            r18[r10] = r13
        Lb8:
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.g
            r13.set(r10)
            com.bytedance.msdk.j.up.tl r13 = r12.tl
            r13.removeCallbacksAndMessages(r6)
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.ae
            r13.set(r5)
            long r13 = android.os.SystemClock.elapsedRealtime()
            com.bytedance.msdk.core.ws.j r15 = r12.xt
            r15.j(r0, r10)
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r13
            java.lang.String r13 = "parse_save_time"
            r14 = r20
            r14.put(r13, r5)
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f2301m
            r13.set(r10)
            r12.j(r1)
            com.bytedance.msdk.m.cw.r()
            com.bytedance.msdk.core.j r13 = com.bytedance.msdk.core.j.qv()
            boolean r13 = r13.jy()
            if (r13 == 0) goto Lf4
            up()
        Lf4:
            r12.j(r2, r3)
            return
        Lf8:
            if (r5 == r7) goto Lfc
            r13[r10] = r5
        Lfc:
            boolean r14 = android.text.TextUtils.isEmpty(r8)
            if (r14 == 0) goto L112
            java.lang.String r14 = "msg"
            java.lang.String r15 = r0.optString(r14)
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L112
            java.lang.String r8 = r0.optString(r14)
        L112:
            r13 = r13[r10]
            r16 = r13
            r15 = r21
            r14 = r1
            r18 = r2
            r17 = r8
            r13 = r12
            r13.j(r14, r15, r16, r17, r18)
            return
    }

    static /* synthetic */ boolean j(boolean r0) {
            com.bytedance.msdk.core.ws.xt.j = r0
            return r0
    }

    private boolean m() {
            r6 = this;
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.j()
            java.lang.String r1 = "max_expire_time"
            r2 = 0
            long r0 = r0.xt(r1, r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.ae
            boolean r2 = r2.get()
            r3 = 0
            if (r2 == 0) goto L2c
            long r4 = java.lang.System.currentTimeMillis()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L2c
            java.lang.String r2 = "SdkSettingsHelper"
            java.lang.String r4 = "setting 缓存过期，再次发起请求..."
            com.bytedance.msdk.j.up.cw.xt(r2, r4)
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.ae
            r2.set(r3)
            r6.j()
        L2c:
            long r4 = java.lang.System.currentTimeMillis()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L36
            r0 = 1
            return r0
        L36:
            return r3
    }

    static /* synthetic */ boolean r() {
            boolean r0 = com.bytedance.msdk.core.ws.xt.j
            return r0
    }

    private static java.util.List<java.lang.String> tl() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "pangle"
            r0.add(r1)
            java.lang.String r1 = "gdt"
            r0.add(r1)
            java.lang.String r1 = "admob"
            r0.add(r1)
            java.lang.String r1 = "unity"
            r0.add(r1)
            java.lang.String r1 = "baidu"
            r0.add(r1)
            java.lang.String r1 = "sigmob"
            r0.add(r1)
            java.lang.String r1 = "mintegral"
            r0.add(r1)
            java.lang.String r1 = "ks"
            r0.add(r1)
            java.lang.String r1 = "klevin"
            r0.add(r1)
            java.lang.String r1 = "xiaomi"
            r0.add(r1)
            return r0
    }

    private static void up() {
            com.bytedance.sdk.openadsdk.core.oq r0 = com.bytedance.sdk.openadsdk.core.oq.i()
            boolean r0 = r0.la()
            if (r0 == 0) goto Lb
            goto L43
        Lb:
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            if (r0 == 0) goto L43
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L3f
            r0.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = com.bytedance.msdk.tl.rn.j()     // Catch: java.lang.Throwable -> L3f
            r0.setPackage(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "com.bytedance.msdk.core.setting.SettingsReceiver"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "b_msg_id"
            r2 = 1
            r0.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "b_msg_process_name"
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = com.bytedance.msdk.tl.s.xt(r2)     // Catch: java.lang.Throwable -> L3f
            r0.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = com.bytedance.msdk.core.ws.xt.j.j     // Catch: java.lang.Throwable -> L3f
            r1.sendBroadcast(r0, r2)     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L43:
            return
    }

    static /* synthetic */ com.bytedance.msdk.core.ws.j xt(com.bytedance.msdk.core.ws.xt r0) {
            com.bytedance.msdk.core.ws.j r0 = r0.xt
            return r0
    }

    public static org.json.JSONObject xt() {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.m r1 = r1.l()
            java.lang.String r2 = "user_id"
            java.lang.String r3 = ""
            if (r1 == 0) goto L1a
            java.lang.String r4 = r1.xt()     // Catch: org.json.JSONException -> L18
            goto L1b
        L18:
            r1 = move-exception
            goto L5e
        L1a:
            r4 = r3
        L1b:
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "channel"
            if (r1 == 0) goto L27
            java.lang.String r4 = r1.cw()     // Catch: org.json.JSONException -> L18
            goto L28
        L27:
            r4 = r3
        L28:
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "sub_channel"
            if (r1 == 0) goto L34
            java.lang.String r4 = r1.r()     // Catch: org.json.JSONException -> L18
            goto L35
        L34:
            r4 = r3
        L35:
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "age"
            if (r1 == 0) goto L41
            int r4 = r1.up()     // Catch: org.json.JSONException -> L18
            goto L42
        L41:
            r4 = 0
        L42:
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "gender"
            if (r1 == 0) goto L4e
            java.lang.String r4 = r1.m()     // Catch: org.json.JSONException -> L18
            goto L4f
        L4e:
            r4 = r3
        L4f:
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L18
            java.lang.String r2 = "user_value_group"
            if (r1 == 0) goto L5a
            java.lang.String r3 = r1.ae()     // Catch: org.json.JSONException -> L18
        L5a:
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L18
            return r0
        L5e:
            com.bytedance.sdk.component.utils.vl.j(r1)
            return r0
    }

    private org.json.JSONObject xt(org.json.JSONObject r7) {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ts"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L17a
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L17a
            java.lang.String r1 = "media_sdk_version"
            java.lang.String r2 = com.bytedance.msdk.xt.xt.xt()     // Catch: java.lang.Exception -> L17a
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L17a
            java.lang.String r1 = "plugin_version"
            java.lang.String r2 = com.bytedance.msdk.xt.xt.r()     // Catch: java.lang.Exception -> L17a
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L17a
            java.lang.String r1 = "is_fusion"
            r2 = 1
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L17a
            java.lang.String r1 = "app_id"
            com.bytedance.msdk.core.j r3 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = r3.vl()     // Catch: java.lang.Exception -> L17a
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L17a
            java.lang.String r1 = "package_name"
            java.lang.String r3 = com.bytedance.msdk.tl.rn.j()     // Catch: java.lang.Exception -> L17a
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L17a
            java.lang.String r1 = "app_version"
            java.lang.String r3 = com.bytedance.msdk.tl.rn.cw()     // Catch: java.lang.Exception -> L17a
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L17a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L17a
            r1.<init>()     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "android_id"
            java.lang.String r4 = com.bytedance.msdk.tl.x.r()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "imei"
            java.lang.String r4 = com.bytedance.msdk.tl.x.tj()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "imei_md5"
            java.lang.String r4 = com.bytedance.msdk.tl.x.tj()     // Catch: java.lang.Exception -> L17a
            java.lang.String r4 = com.bytedance.msdk.tl.f.j(r4)     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "oaid"
            java.lang.String r4 = com.bytedance.msdk.tl.x.xt()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "gaid"
            com.bytedance.msdk.tl.tl r4 = com.bytedance.msdk.tl.tl.j()     // Catch: java.lang.Exception -> L17a
            java.lang.String r4 = r4.xt()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "applog_did"
            java.lang.String r4 = com.bytedance.msdk.tl.x.j()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "publisher_did"
            com.bytedance.msdk.core.j r4 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Exception -> L17a
            java.lang.String r4 = r4.w()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "conn_type"
            int r4 = com.bytedance.msdk.tl.x.up()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "os"
            int r4 = com.bytedance.msdk.tl.x.jy()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "os_version"
            java.lang.String r4 = com.bytedance.msdk.tl.x.ws()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "vendor"
            java.lang.String r4 = com.bytedance.msdk.tl.x.i()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "device_model"
            java.lang.String r4 = com.bytedance.msdk.tl.x.ae()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "mcc"
            java.lang.String r4 = com.bytedance.msdk.tl.x.qv()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "mnc"
            java.lang.String r4 = com.bytedance.msdk.tl.x.vl()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "time_zone"
            java.lang.String r4 = com.bytedance.msdk.tl.x.w()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "ip"
            java.lang.String r4 = com.bytedance.msdk.tl.x.f()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "locale_language"
            java.lang.String r4 = com.bytedance.msdk.tl.x.oq()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "total_space"
            java.lang.String r4 = com.bytedance.msdk.tl.x.av()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "carrier_name"
            java.lang.String r4 = com.bytedance.msdk.tl.x.kt()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "device_name"
            java.lang.String r4 = com.bytedance.msdk.tl.x.tl()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "pb"
            java.lang.String r4 = ""
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "boot"
            java.lang.String r4 = com.bytedance.msdk.tl.x.mi()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "country_code"
            com.bytedance.msdk.core.ws.cw r4 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Exception -> L17a
            java.lang.String r4 = r4.tl()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "total_mem"
            java.lang.String r4 = com.bytedance.msdk.tl.x.az()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "device_type"
            java.lang.String r4 = com.bytedance.msdk.tl.x.ae()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "language"
            java.lang.String r4 = com.bytedance.msdk.tl.x.g()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "android_os_version_int"
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "device"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L17a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L17a
            r1.<init>()     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "init_time"
            com.bytedance.msdk.core.j r4 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Exception -> L17a
            long r4 = r4.cw()     // Catch: java.lang.Exception -> L17a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "app"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L17a
            java.lang.String r1 = "grouping_params"
            org.json.JSONObject r3 = xt()     // Catch: java.lang.Exception -> L17a
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L17a
            org.json.JSONObject r1 = cw()     // Catch: java.lang.Exception -> L17a
            if (r1 == 0) goto L17d
            java.lang.String r3 = "user_defined_grouping_params"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L17a
            goto L17d
        L17a:
            r7 = move-exception
            goto L20e
        L17d:
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Exception -> L17a
            boolean r1 = r1.ae()     // Catch: java.lang.Exception -> L17a
            if (r1 != 0) goto L194
            java.lang.String r1 = "etag"
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = r3.oq()     // Catch: java.lang.Exception -> L17a
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L17a
        L194:
            android.content.Context r1 = r6.cw     // Catch: java.lang.Exception -> L17a
            com.bytedance.msdk.tl.up r1 = com.bytedance.msdk.tl.m.j(r1)     // Catch: java.lang.Exception -> L17a
            if (r1 == 0) goto L1ac
            java.lang.String r3 = "latitude"
            float r4 = r1.j     // Catch: java.lang.Exception -> L17a
            double r4 = (double) r4     // Catch: java.lang.Exception -> L17a
            r0.put(r3, r4)     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = "longitude"
            float r1 = r1.xt     // Catch: java.lang.Exception -> L17a
            double r4 = (double) r1     // Catch: java.lang.Exception -> L17a
            r0.put(r3, r4)     // Catch: java.lang.Exception -> L17a
        L1ac:
            java.lang.String r1 = "adn_version_list"
            org.json.JSONObject r3 = r6.ae()     // Catch: java.lang.Exception -> L17a
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L17a
            com.bytedance.msdk.core.g.up r1 = com.bytedance.msdk.core.g.up.r()     // Catch: java.lang.Exception -> L17a
            r1.j(r0, r7)     // Catch: java.lang.Exception -> L17a
            com.bytedance.msdk.core.g.up r7 = com.bytedance.msdk.core.g.up.r()     // Catch: java.lang.Exception -> L17a
            r7.j(r0)     // Catch: java.lang.Exception -> L17a
            com.bytedance.msdk.core.j r7 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Exception -> L17a
            java.util.List r7 = r7.rn()     // Catch: java.lang.Exception -> L17a
            if (r7 == 0) goto L1f1
            int r1 = r7.size()     // Catch: java.lang.Exception -> L17a
            if (r1 <= 0) goto L1f1
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> L17a
            r1.<init>()     // Catch: java.lang.Exception -> L17a
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L17a
        L1dc:
            boolean r3 = r7.hasNext()     // Catch: java.lang.Exception -> L17a
            if (r3 == 0) goto L1ec
            java.lang.Object r3 = r7.next()     // Catch: java.lang.Exception -> L17a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L17a
            r1.put(r3)     // Catch: java.lang.Exception -> L17a
            goto L1dc
        L1ec:
            java.lang.String r7 = "primerit_list"
            r0.put(r7, r1)     // Catch: java.lang.Exception -> L17a
        L1f1:
            boolean r7 = com.bytedance.msdk.tl.az.j()     // Catch: java.lang.Exception -> L17a
            if (r7 != 0) goto L20d
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L17a
            r7.<init>()     // Catch: java.lang.Exception -> L17a
            java.lang.String r1 = "err_type"
            r7.put(r1, r2)     // Catch: java.lang.Exception -> L17a
            java.lang.String r1 = "err_msg"
            java.lang.String r2 = "applog so加载失败"
            r7.put(r1, r2)     // Catch: java.lang.Exception -> L17a
            java.lang.String r1 = "monitor_alarm"
            r0.put(r1, r7)     // Catch: java.lang.Exception -> L17a
        L20d:
            return r0
        L20e:
            com.bytedance.sdk.component.utils.vl.j(r7)
            return r0
    }

    public void cw(int r4) {
            r3 = this;
            java.lang.String r0 = "SdkSettingsHelper"
            com.bytedance.msdk.tl.x.j()
            boolean r1 = r3.m()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            java.lang.String r4 = "setting 缓存未过期，无需再次发起请求..."
            com.bytedance.msdk.j.up.cw.xt(r0, r4)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r4 = move-exception
            goto L2b
        L13:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f2301m     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L21
            java.lang.String r4 = "setting 正在加载，无需再次发起请求..."
            com.bytedance.msdk.j.up.cw.xt(r0, r4)     // Catch: java.lang.Throwable -> L11
            return
        L21:
            com.bytedance.msdk.core.ws.xt$xt r1 = new com.bytedance.msdk.core.ws.xt$xt     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r1.<init>(r3, r2, r4)     // Catch: java.lang.Throwable -> L11
            com.bytedance.msdk.j.up.m.r(r1)     // Catch: java.lang.Throwable -> L11
            return
        L2b:
            java.lang.String r1 = "load sdk settings error: "
            com.bytedance.msdk.j.up.cw.j(r0, r1, r4)
            return
    }

    public com.bytedance.msdk.core.ws.xt j() {
            r2 = this;
            java.lang.String r0 = "SdkSettingsHelper"
            java.lang.String r1 = "setting resetRetryCount..."
            com.bytedance.msdk.j.up.cw.r(r0, r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.up
            r1 = 0
            r0.set(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.g
            r0.set(r1)
            com.bytedance.msdk.j.up.tl r0 = r2.tl
            if (r0 == 0) goto L1a
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
        L1a:
            return r2
    }

    public void j(int r4) {
            r3 = this;
            java.lang.String r0 = "SdkSettingsHelper"
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f2301m     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            r3.oq = r4     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "setting 正在加载，无需再次发起请求..."
            com.bytedance.msdk.j.up.cw.xt(r0, r4)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r4 = move-exception
            goto L1e
        L14:
            com.bytedance.msdk.core.ws.xt$xt r1 = new com.bytedance.msdk.core.ws.xt$xt     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.<init>(r3, r2, r4)     // Catch: java.lang.Throwable -> L12
            com.bytedance.msdk.j.up.m.r(r1)     // Catch: java.lang.Throwable -> L12
            return
        L1e:
            java.lang.String r1 = "load sdk settings error: "
            com.bytedance.msdk.j.up.cw.j(r0, r1, r4)
            return
    }

    public void j(android.os.Message r5) {
            r4 = this;
            int r0 = r5.what
            r1 = 1
            if (r0 == r1) goto L6
            goto L41
        L6:
            int r0 = r5.arg1
            int r5 = r5.arg2
            r2 = 3
            if (r0 != r2) goto L13
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.g
            r3 = 0
            r2.set(r3)
        L13:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "setting 发起尝试拉取配置请求... mLoadingSuccess:"
            r2.<init>(r3)
            java.util.concurrent.atomic.AtomicBoolean r3 = r4.ae
            boolean r3 = r3.get()
            r2.append(r3)
            java.lang.String r3 = "tryCount:"
            r2.append(r3)
            int r0 = r0 + r1
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "SdkSettingsHelper"
            com.bytedance.msdk.j.up.cw.r(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.ae     // Catch: java.lang.Throwable -> L41
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3e
            goto L41
        L3e:
            r4.cw(r5)     // Catch: java.lang.Throwable -> L41
        L41:
            return
    }

    public void j(com.bytedance.msdk.api.r.up r3) {
            r2 = this;
            int r0 = r2.oq
            r1 = 2
            if (r0 == r1) goto L8
            r1 = 3
            if (r0 != r1) goto Le
        L8:
            r1 = -1
            r2.oq = r1
            r2.j(r0)
        Le:
            if (r3 == 0) goto L20
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.util.List r0 = r0.rn()
            com.bytedance.msdk.core.ws.xt$2 r1 = new com.bytedance.msdk.core.ws.xt$2
            r1.<init>(r2, r3, r0)
            com.bytedance.msdk.j.up.m.cw(r1)
        L20:
            return
    }

    public void xt(int r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.g
            boolean r0 = r0.get()
            java.lang.String r1 = "SdkSettingsHelper"
            if (r0 == 0) goto L10
            java.lang.String r3 = "setting 正在尝试拉取配置中..."
            com.bytedance.msdk.j.up.cw.r(r1, r3)
            return
        L10:
            java.lang.String r0 = "setting 尝试拉取配置..."
            com.bytedance.msdk.j.up.cw.r(r1, r0)
            r2.j()
            r2.cw(r3)
            return
    }
}
