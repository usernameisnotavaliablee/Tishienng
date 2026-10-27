package com.bykv.vk.component.ttvideo.log;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d implements com.bykv.vk.component.ttvideo.log.b {
    private com.bykv.vk.component.ttvideo.log.a a;
    private com.bykv.vk.component.ttvideo.log.f b;
    private com.bykv.vk.component.ttvideo.log.c c;
    private boolean d;
    private java.lang.String e;
    private java.lang.String f;
    private int g;
    public int h;
    private int i;
    private android.content.Context j;
    private long k;

    private static class a implements java.lang.Runnable {
        private com.bykv.vk.component.ttvideo.log.f a;
        private android.os.Handler b;
        com.bykv.vk.component.ttvideo.log.c c;

        /* renamed from: com.bykv.vk.component.ttvideo.log.d$a$a, reason: collision with other inner class name */
        class RunnableC0171a implements java.lang.Runnable {
            final /* synthetic */ org.json.JSONObject a;

            RunnableC0171a(com.bykv.vk.component.ttvideo.log.d.a r1, org.json.JSONObject r2) {
                    r0 = this;
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    com.bykv.vk.component.ttvideo.log.e r0 = com.bykv.vk.component.ttvideo.log.e.c
                    org.json.JSONObject r1 = r3.a
                    r2 = 0
                    r0.a(r2, r1)
                    return
            }
        }

        public a(com.bykv.vk.component.ttvideo.log.f r1, com.bykv.vk.component.ttvideo.log.d r2, com.bykv.vk.component.ttvideo.log.c r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.c = r3
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r0.b = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.lang.String r0 = "AyncGetLogDataRunnable enter"
                java.lang.String r1 = "VideoEventLoggerV2"
                com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
                com.bykv.vk.component.ttvideo.log.f r0 = r3.a
                if (r0 != 0) goto L11
                java.lang.String r0 = "rEvent is null, return."
                com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r1, r0)
                return
            L11:
                com.bykv.vk.component.ttvideo.log.c r2 = r3.c
                org.json.JSONObject r0 = r0.a(r2)
                android.os.Handler r2 = r3.b
                if (r2 == 0) goto L31
                android.os.Looper r2 = r2.getLooper()
                if (r2 == 0) goto L31
                java.lang.String r2 = "report in main looper"
                com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r2)
                android.os.Handler r1 = r3.b
                com.bykv.vk.component.ttvideo.log.d$a$a r2 = new com.bykv.vk.component.ttvideo.log.d$a$a
                r2.<init>(r3, r0)
                r1.post(r2)
                return
            L31:
                java.lang.String r2 = "report in child thread"
                com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r2)
                com.bykv.vk.component.ttvideo.log.e r1 = com.bykv.vk.component.ttvideo.log.e.c
                r2 = 0
                r1.a(r2, r0)
                return
        }
    }

    public d(android.content.Context r3, com.bykv.vk.component.ttvideo.log.a r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.g = r0
            r2.h = r0
            r2.i = r0
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            r2.k = r0
            r2.a = r4
            com.bykv.vk.component.ttvideo.log.c r0 = new com.bykv.vk.component.ttvideo.log.c
            r0.<init>(r4, r3)
            r2.c = r0
            com.bykv.vk.component.ttvideo.log.f r4 = new com.bykv.vk.component.ttvideo.log.f
            r4.<init>()
            r2.b = r4
            r4 = 1
            r2.d = r4
            r2.j = r3
            return
    }

    private void b() {
            r2 = this;
            r0 = 0
            r2.i = r0
            r1 = 1
            r2.d = r1
            r2.h = r0
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            r2.k = r0
            return
    }

    private void c() {
            r5 = this;
            java.lang.String r0 = "VideoEventLoggerV2"
            java.lang.String r1 = "exception:"
            java.lang.String r2 = r5.e
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lf
            java.lang.String r2 = r5.e
            goto L19
        Lf:
            java.lang.String r2 = r5.f
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L5f
            java.lang.String r2 = r5.f
        L19:
            java.lang.String r3 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L20 java.io.UnsupportedEncodingException -> L22
            goto L3e
        L20:
            r3 = move-exception
            goto L24
        L22:
            r3 = move-exception
            goto L38
        L24:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
        L29:
            java.lang.String r1 = r3.toString()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r0, r1)
            goto L3e
        L38:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            goto L29
        L3e:
            java.lang.String r0 = "&l="
            int r0 = r2.indexOf(r0)
            if (r0 <= 0) goto L5f
            int r1 = r0 + 1
            java.lang.String r3 = "&"
            int r1 = r2.indexOf(r3, r1)
            int r0 = r0 + 3
            if (r1 <= 0) goto L57
            java.lang.String r0 = r2.substring(r0, r1)
            goto L5b
        L57:
            java.lang.String r0 = r2.substring(r0)
        L5b:
            com.bykv.vk.component.ttvideo.log.f r1 = r5.b
            r1.f1667o = r0
        L5f:
            return
    }

    private void d() {
            r6 = this;
            com.bykv.vk.component.ttvideo.log.f r0 = r6.b
            if (r0 != 0) goto L5
            goto L40
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sendEvent pt_new:"
            r0.<init>(r1)
            com.bykv.vk.component.ttvideo.log.f r1 = r6.b
            long r1 = r1.b
            r0.append(r1)
            java.lang.String r1 = ", mEvent:"
            r0.append(r1)
            com.bykv.vk.component.ttvideo.log.f r1 = r6.b
            r0.append(r1)
            java.lang.String r1 = ", eventBase:"
            r0.append(r1)
            com.bykv.vk.component.ttvideo.log.c r1 = r6.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoEventLoggerV2"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.log.f r0 = r6.b
            long r0 = r0.b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L41
            long r0 = r6.k
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L41
        L40:
            return
        L41:
            int r0 = r6.g
            if (r0 <= 0) goto L49
            com.bykv.vk.component.ttvideo.log.c r1 = r6.c
            r1.h = r0
        L49:
            android.content.Context r0 = r6.j
            java.lang.String r1 = "VideoEventLogger"
            r4 = 0
            android.content.SharedPreferences r0 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r0, r1, r4)
            com.bykv.vk.component.ttvideo.log.f r1 = r6.b
            java.lang.String r4 = ""
            java.lang.String r5 = "playersessionid"
            java.lang.String r4 = r0.getString(r5, r4)
            r1.f1668p = r4
            android.content.SharedPreferences$Editor r0 = r0.edit()
            com.bykv.vk.component.ttvideo.log.c r1 = r6.c
            java.lang.String r1 = r1.f
            r0.putString(r5, r1)
            r0.apply()
            com.bykv.vk.component.ttvideo.log.f r0 = r6.b
            com.bykv.vk.component.ttvideo.log.c r1 = r6.c
            java.lang.String r1 = r1.f
            r0.f1666n = r1
            int r1 = r6.h
            r0.h = r1
            java.lang.String r1 = r6.e
            if (r1 == 0) goto L7e
            r0.k = r1
        L7e:
            java.lang.String r1 = r6.f
            if (r1 == 0) goto L84
            r0.f1664l = r1
        L84:
            long r4 = r0.b
            r0.c = r4
            long r4 = r6.k
            r0.a = r4
            long r4 = r0.e
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L9e
            long r4 = r0.d
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L9e
            long r1 = java.lang.System.currentTimeMillis()
            r0.e = r1
        L9e:
            com.bykv.vk.component.ttvideo.log.f r0 = r6.b
            java.lang.String r0 = r0.f1667o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lab
            r6.c()
        Lab:
            java.util.concurrent.ExecutorService r0 = com.bykv.vk.component.ttvideo.utils.EngineThreadPool.a()
            com.bykv.vk.component.ttvideo.log.d$a r1 = new com.bykv.vk.component.ttvideo.log.d$a
            com.bykv.vk.component.ttvideo.log.f r2 = r6.b
            com.bykv.vk.component.ttvideo.log.c r3 = r6.c
            r1.<init>(r2, r6, r3)
            r0.execute(r1)
            r6.b()
            return
    }

    private void f(int r1) {
            r0 = this;
            r0.d()
            com.bykv.vk.component.ttvideo.log.f r1 = new com.bykv.vk.component.ttvideo.log.f
            r1.<init>()
            r0.b = r1
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void a() {
            r6 = this;
            int r0 = r6.i
            r1 = 4
            if (r0 == r1) goto L1b
            r0 = 2
            r6.i = r0
            r0 = 0
            r6.d = r0
            com.bykv.vk.component.ttvideo.log.f r0 = r6.b
            long r1 = r0.d
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L1b
            long r1 = java.lang.System.currentTimeMillis()
            r0.d = r1
        L1b:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void a(int r9) {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 5
            if (r9 == r2) goto L1c
            int r2 = r8.i
            r3 = 4
            r4 = 0
            if (r2 != r3) goto Lf
            r3 = 0
            goto L10
        Lf:
            r3 = 1
        L10:
            r5 = 3
            if (r2 != r5) goto L14
            goto L15
        L14:
            r4 = r3
        L15:
            if (r4 == 0) goto L1c
            com.bykv.vk.component.ttvideo.log.c r2 = r8.c
            r2.a()
        L1c:
            boolean r2 = r8.d
            if (r2 == 0) goto L2d
            com.bykv.vk.component.ttvideo.log.f r2 = r8.b
            long r3 = r2.d
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L2d
            r2.f = r0
            goto L31
        L2d:
            com.bykv.vk.component.ttvideo.log.f r2 = r8.b
            r2.e = r0
        L31:
            r8.f(r9)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void a(long r6, java.lang.String r8) {
            r5 = this;
            r0 = 1
            r5.i = r0
            com.bykv.vk.component.ttvideo.log.c r1 = r5.c
            r1.a(r8)
            long r1 = r5.k
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 > 0) goto L12
            r5.k = r6
        L12:
            r5.d = r0
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void a(com.bykv.vk.component.ttvideo.utils.Error r11, int r12) {
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
            int r12 = r10.i
            r2 = 0
            r3 = 1
            r4 = 4
            if (r12 != r4) goto Ld
            r5 = 0
            goto Le
        Ld:
            r5 = 1
        Le:
            r6 = 3
            if (r12 != r6) goto L12
            goto L13
        L12:
            r2 = r5
        L13:
            r12 = 5
            r10.i = r12
            boolean r12 = r10.d
            if (r12 == 0) goto L27
            com.bykv.vk.component.ttvideo.log.f r12 = r10.b
            long r5 = r12.d
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L27
            r12.f = r0
            goto L44
        L27:
            java.lang.String r12 = r11.c
            java.lang.String r5 = "kTTVideoErrorDomainVideoOwnPlayer"
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L3b
            java.lang.String r12 = r11.c
            java.lang.String r5 = "kTTVideoErrorDomainVideoOSPlayer"
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L40
        L3b:
            int r12 = r10.h
            int r12 = r12 + r3
            r10.h = r12
        L40:
            com.bykv.vk.component.ttvideo.log.f r12 = r10.b
            r12.e = r0
        L44:
            if (r2 == 0) goto L4b
            com.bykv.vk.component.ttvideo.log.c r12 = r10.c
            r12.a()
        L4b:
            com.bykv.vk.component.ttvideo.log.f r12 = r10.b
            int r0 = r11.getType()
            r12.i = r0
            com.bykv.vk.component.ttvideo.log.f r12 = r10.b
            int r11 = r11.a
            r12.j = r11
            r10.f(r4)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void a(com.bykv.vk.component.ttvideo.utils.Error r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = r1.c
            java.lang.String r3 = "kTTVideoErrorDomainVideoOwnPlayer"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L16
            java.lang.String r1 = r1.c
            java.lang.String r2 = "kTTVideoErrorDomainVideoOSPlayer"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L15
            goto L16
        L15:
            return
        L16:
            int r1 = r0.h
            int r1 = r1 + 1
            r0.h = r1
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void a(java.lang.String r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.log.c r0 = r1.c
            if (r0 == 0) goto L11
            if (r2 == 0) goto L11
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L11
            com.bykv.vk.component.ttvideo.log.c r0 = r1.c
            r0.b(r2)
        L11:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.e = r2
            com.bykv.vk.component.ttvideo.log.c r0 = r1.c
            if (r0 == 0) goto L8
            r0.g = r2
        L8:
            r1.f = r3
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void b(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.log.f r0 = r1.b
            r0.f1665m = r2
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void c(int r10) {
            r9 = this;
            int r0 = r9.i
            if (r0 != 0) goto L5
            return
        L5:
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = r9.i
            r3 = 4
            r4 = 0
            if (r2 != r3) goto L11
            r3 = 0
            goto L12
        L11:
            r3 = 1
        L12:
            r5 = 3
            if (r2 != r5) goto L16
            r3 = 0
        L16:
            r9.i = r4
            boolean r2 = r9.d
            if (r2 == 0) goto L35
            com.bykv.vk.component.ttvideo.log.f r2 = r9.b
            long r4 = r2.b
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L35
            long r4 = r2.d
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L35
            long r4 = r2.f
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L39
            r2.f = r0
            goto L39
        L35:
            com.bykv.vk.component.ttvideo.log.f r2 = r9.b
            r2.e = r0
        L39:
            if (r3 == 0) goto L40
            com.bykv.vk.component.ttvideo.log.c r0 = r9.c
            r0.a()
        L40:
            r9.f(r10)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void d(int r8) {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 10
            if (r8 != r2) goto L14
            com.bykv.vk.component.ttvideo.log.f r8 = r7.b
            long r2 = r8.b
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L14
            r8.b = r0
        L14:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void e(int r2) {
            r1 = this;
            r1.g = r2
            com.bykv.vk.component.ttvideo.log.c r0 = r1.c
            r0.h = r2
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.b
    public void reset() {
            r3 = this;
            r0 = 1
            r3.d = r0
            r0 = 0
            r3.e = r0
            r3.f = r0
            r0 = 0
            r3.g = r0
            r3.h = r0
            com.bykv.vk.component.ttvideo.log.c r0 = new com.bykv.vk.component.ttvideo.log.c
            com.bykv.vk.component.ttvideo.log.a r1 = r3.a
            android.content.Context r2 = r3.j
            r0.<init>(r1, r2)
            r3.c = r0
            return
    }
}
