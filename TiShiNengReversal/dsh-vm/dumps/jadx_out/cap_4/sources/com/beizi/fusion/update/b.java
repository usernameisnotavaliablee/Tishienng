package com.beizi.fusion.update;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    private static android.content.Context f;
    private static com.beizi.fusion.model.ResponseInfo g;
    private static com.beizi.fusion.model.TaskBean i;
    private static boolean k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f81l;

    /* renamed from: m, reason: collision with root package name */
    private static com.beizi.fusion.update.b f82m;
    private java.util.concurrent.ScheduledExecutorService a;
    private long b;
    private long c;
    private long d;
    private final com.beizi.fusion.update.b.HandlerC0003b e;
    private java.util.concurrent.ScheduledExecutorService h;
    private java.util.concurrent.ScheduledExecutorService j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements java.lang.Runnable {
        final /* synthetic */ com.beizi.fusion.update.b a;
        private int b;


        a(com.beizi.fusion.update.b r1, int r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.b = r2
                return
        }

        private void a() {
                r19 = this;
                r0 = r19
                com.beizi.fusion.model.TaskBean r1 = com.beizi.fusion.update.b.c()
                if (r1 == 0) goto Lc4
                com.beizi.fusion.model.TaskBean r1 = com.beizi.fusion.update.b.c()
                long r1 = r1.getExpired()
                long r3 = java.lang.System.currentTimeMillis()
                com.beizi.fusion.model.TaskBean r5 = com.beizi.fusion.update.b.c()
                java.util.List r5 = r5.getBackTaskArray()
                if (r5 == 0) goto Lc4
                int r6 = r5.size()
                if (r6 <= 0) goto Lc4
                android.content.Context r6 = com.beizi.fusion.update.b.a()
                com.beizi.fusion.events.EventCar r6 = com.beizi.fusion.events.EventCar.getInstance(r6)
                com.beizi.fusion.events.EventBean r7 = new com.beizi.fusion.events.EventBean
                java.lang.String r8 = com.beizi.fusion.c.b.b
                com.beizi.fusion.c.b r9 = com.beizi.fusion.c.b.a()
                java.lang.String r12 = r9.b()
                long r9 = java.lang.System.currentTimeMillis()
                java.lang.String r15 = java.lang.String.valueOf(r9)
                int r9 = r5.size()
                java.lang.String r17 = java.lang.String.valueOf(r9)
                java.lang.String r9 = ""
                java.lang.String r10 = "500.200"
                java.lang.String r11 = ""
                java.lang.String r13 = ""
                java.lang.String r14 = ""
                java.lang.String r16 = ""
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r6.goRoadWithoutThread(r7)
                r6 = 0
            L5b:
                int r7 = r5.size()
                if (r6 >= r7) goto Lc4
                long r7 = java.lang.System.currentTimeMillis()
                long r7 = r7 - r3
                int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r9 <= 0) goto La2
                android.content.Context r7 = com.beizi.fusion.update.b.a()
                com.beizi.fusion.events.EventCar r7 = com.beizi.fusion.events.EventCar.getInstance(r7)
                com.beizi.fusion.events.EventBean r8 = new com.beizi.fusion.events.EventBean
                java.lang.String r9 = com.beizi.fusion.c.b.b
                com.beizi.fusion.c.b r10 = com.beizi.fusion.c.b.a()
                java.lang.String r13 = r10.b()
                long r10 = java.lang.System.currentTimeMillis()
                java.lang.String r16 = java.lang.String.valueOf(r10)
                int r10 = r5.size()
                int r10 = r10 - r6
                java.lang.String r18 = java.lang.String.valueOf(r10)
                java.lang.String r10 = ""
                java.lang.String r11 = "530.500"
                java.lang.String r12 = ""
                java.lang.String r14 = ""
                java.lang.String r15 = ""
                java.lang.String r17 = ""
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r7.goRoadWithoutThread(r8)
                goto Lc1
            La2:
                java.lang.Object r7 = r5.get(r6)
                com.beizi.fusion.model.TaskBean$BackTaskArrayBean r7 = (com.beizi.fusion.model.TaskBean.BackTaskArrayBean) r7
                int r8 = r7.getType()
                com.beizi.fusion.update.b r9 = r0.a
                com.beizi.fusion.update.b$b r9 = com.beizi.fusion.update.b.b(r9)
                com.beizi.fusion.update.b$a$1 r10 = new com.beizi.fusion.update.b$a$1
                r10.<init>(r0, r8, r7)
                r9.post(r10)
                long r7 = r7.getSleepTime()     // Catch: java.lang.InterruptedException -> Lc1
                java.lang.Thread.sleep(r7)     // Catch: java.lang.InterruptedException -> Lc1
            Lc1:
                int r6 = r6 + 1
                goto L5b
            Lc4:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r11 = this;
                int r0 = r11.b
                r1 = 2
                r2 = 1
                if (r0 == r1) goto Le0
                r1 = 3
                if (r0 == r1) goto Ld4
                r1 = 4
                if (r0 == r1) goto L59
                r1 = 5
                if (r0 == r1) goto L11
                goto Ld3
            L11:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.getName()
                android.os.Message r0 = new android.os.Message
                r0.<init>()
                r0.what = r2
                r0.arg1 = r1
                com.beizi.fusion.update.b r1 = r11.a
                com.beizi.fusion.update.b$b r1 = com.beizi.fusion.update.b.b(r1)
                r1.sendMessage(r0)
                android.content.Context r0 = com.beizi.fusion.update.b.a()
                com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)
                com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
                java.lang.String r2 = com.beizi.fusion.c.b.b
                com.beizi.fusion.c.b r3 = com.beizi.fusion.c.b.a()
                java.lang.String r6 = r3.b()
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.String r9 = java.lang.String.valueOf(r3)
                java.lang.String r10 = ""
                java.lang.String r3 = ""
                java.lang.String r4 = "310.200"
                java.lang.String r5 = ""
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.goRoad(r1)
                return
            L59:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.getName()
                com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.update.b.b()
                com.beizi.fusion.model.TaskConfig r0 = r0.getTaskConfig()
                if (r0 == 0) goto Ld3
                com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.update.b.b()
                com.beizi.fusion.model.TaskConfig r0 = r0.getTaskConfig()
                if (r0 == 0) goto Ld3
                java.lang.String r1 = r0.getUrl()
                if (r1 == 0) goto Ld3
                android.content.Context r1 = com.beizi.fusion.update.b.a()
                java.lang.String r0 = r0.getUrl()
                com.beizi.fusion.c.b r2 = com.beizi.fusion.c.b.a()
                java.lang.String r2 = r2.b()
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                java.lang.String r0 = com.beizi.fusion.tool.v.a(r1, r0, r2, r3)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto Ld3
                int r1 = r0.length()
                if (r1 <= 0) goto Ld3
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld3
                r1.<init>(r0)     // Catch: java.lang.Exception -> Ld3
                java.lang.String r0 = "data"
                java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Exception -> Ld3
                boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Ld3
                if (r1 != 0) goto Ld3
                java.lang.String r1 = "null"
                boolean r1 = r0.equals(r1)     // Catch: java.lang.Exception -> Ld3
                if (r1 != 0) goto Ld3
                java.lang.String r1 = com.beizi.fusion.tool.y.a()     // Catch: java.lang.Exception -> Ld3
                java.lang.String r0 = com.beizi.fusion.tool.b.b(r1, r0)     // Catch: java.lang.Exception -> Ld3
                boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Ld3
                if (r1 != 0) goto Ld3
                com.beizi.fusion.model.TaskBean r0 = com.beizi.fusion.model.TaskBean.objectFromData(r0)     // Catch: java.lang.Exception -> Ld3
                com.beizi.fusion.update.b.a(r0)     // Catch: java.lang.Exception -> Ld3
                com.beizi.fusion.model.TaskBean r0 = com.beizi.fusion.update.b.c()     // Catch: java.lang.Exception -> Ld3
                if (r0 == 0) goto Ld3
                r11.a()     // Catch: java.lang.Exception -> Ld3
            Ld3:
                return
            Ld4:
                android.content.Context r0 = com.beizi.fusion.update.b.a()
                com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)
                r0.doUpLoadLogs()
                return
            Le0:
                com.beizi.fusion.update.b r0 = r11.a
                java.lang.Boolean r0 = com.beizi.fusion.update.b.a(r0)
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L134
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.getName()
                android.os.Message r0 = new android.os.Message
                r0.<init>()
                r0.what = r2
                r0.arg1 = r2
                com.beizi.fusion.update.b r1 = r11.a
                com.beizi.fusion.update.b$b r1 = com.beizi.fusion.update.b.b(r1)
                r1.sendMessage(r0)
                android.content.Context r0 = com.beizi.fusion.update.b.a()
                com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)
                com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
                java.lang.String r2 = com.beizi.fusion.c.b.b
                com.beizi.fusion.c.b r3 = com.beizi.fusion.c.b.a()
                java.lang.String r6 = r3.b()
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.String r9 = java.lang.String.valueOf(r3)
                java.lang.String r10 = ""
                java.lang.String r3 = ""
                java.lang.String r4 = "310.200"
                java.lang.String r5 = ""
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.goRoad(r1)
                return
            L134:
                android.content.Context r0 = com.beizi.fusion.update.b.a()
                com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)
                com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
                java.lang.String r2 = com.beizi.fusion.c.b.b
                com.beizi.fusion.c.b r3 = com.beizi.fusion.c.b.a()
                java.lang.String r6 = r3.b()
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.String r9 = java.lang.String.valueOf(r3)
                java.lang.String r10 = ""
                java.lang.String r3 = ""
                java.lang.String r4 = "310.210"
                java.lang.String r5 = ""
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.goRoad(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.fusion.update.b$b, reason: collision with other inner class name */
    private static class HandlerC0003b extends android.os.Handler {
        private final java.lang.ref.WeakReference<com.beizi.fusion.update.b> a;

        HandlerC0003b(com.beizi.fusion.update.b r2) {
                r1 = this;
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.a = r0
                return
        }

        @Override // android.os.Handler
        @android.annotation.SuppressLint({"NewApi"})
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                boolean r4 = com.beizi.fusion.update.b.d()
                if (r4 == 0) goto L7
                goto L56
            L7:
                r4 = 1
                com.beizi.fusion.update.b.a(r4)
                java.lang.ref.WeakReference<com.beizi.fusion.update.b> r4 = r3.a     // Catch: java.lang.Throwable -> L56
                java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L56
                com.beizi.fusion.update.b r4 = (com.beizi.fusion.update.b) r4     // Catch: java.lang.Throwable -> L56
                r0 = 0
                if (r4 != 0) goto L1a
                com.beizi.fusion.update.b.a(r0)     // Catch: java.lang.Throwable -> L56
                return
            L1a:
                com.beizi.fusion.update.c r1 = new com.beizi.fusion.update.c     // Catch: java.lang.Throwable -> L56
                android.content.Context r2 = com.beizi.fusion.update.b.a()     // Catch: java.lang.Throwable -> L56
                r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L56
                com.beizi.fusion.model.ResponseInfo r4 = com.beizi.fusion.update.b.b()     // Catch: java.lang.Throwable -> L56
                com.beizi.fusion.model.Configurator r4 = r4.getConfigurator()     // Catch: java.lang.Throwable -> L56
                if (r4 == 0) goto L49
                com.beizi.fusion.tool.e r4 = com.beizi.fusion.tool.e.b()     // Catch: java.lang.Throwable -> L56
                java.util.concurrent.ExecutorService r4 = r4.d()     // Catch: java.lang.Throwable -> L56
                com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.update.b.b()     // Catch: java.lang.Throwable -> L56
                com.beizi.fusion.model.Configurator r0 = r0.getConfigurator()     // Catch: java.lang.Throwable -> L56
                java.lang.String r0 = r0.getConfigUrl()     // Catch: java.lang.Throwable -> L56
                java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L56
                r1.executeOnExecutor(r4, r0)     // Catch: java.lang.Throwable -> L56
                return
            L49:
                com.beizi.fusion.tool.e r4 = com.beizi.fusion.tool.e.b()     // Catch: java.lang.Throwable -> L56
                java.util.concurrent.ExecutorService r4 = r4.d()     // Catch: java.lang.Throwable -> L56
                java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L56
                r1.executeOnExecutor(r4, r0)     // Catch: java.lang.Throwable -> L56
            L56:
                return
        }
    }

    static {
            return
    }

    private b(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            r0 = 60000(0xea60, double:2.9644E-319)
            r4.b = r0
            r4.c = r0
            r0 = 0
            r4.d = r0
            android.content.Context r5 = r5.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            com.beizi.fusion.update.b.f = r5
            com.beizi.fusion.update.b$b r5 = new com.beizi.fusion.update.b$b
            r5.<init>(r4)
            r4.e = r5
            com.beizi.fusion.model.ResponseInfo r5 = com.beizi.fusion.update.b.g
            if (r5 != 0) goto L7e
            android.content.Context r5 = com.beizi.fusion.update.b.f
            com.beizi.fusion.model.ResponseInfo r5 = com.beizi.fusion.model.ResponseInfo.getInstance(r5)
            com.beizi.fusion.update.b.g = r5
            boolean r5 = r5.isInit()
            if (r5 != 0) goto L36
            com.beizi.fusion.model.ResponseInfo r5 = com.beizi.fusion.update.b.g
            r5.init()
        L36:
            com.beizi.fusion.model.ResponseInfo r5 = com.beizi.fusion.update.b.g
            com.beizi.fusion.model.Configurator r5 = r5.getConfigurator()
            if (r5 == 0) goto L4e
            com.beizi.fusion.model.ResponseInfo r5 = com.beizi.fusion.update.b.g
            com.beizi.fusion.model.Configurator r5 = r5.getConfigurator()
            long r2 = r5.getCheckInterval()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L4e
            r4.b = r2
        L4e:
            com.beizi.fusion.model.ResponseInfo r5 = com.beizi.fusion.update.b.g
            com.beizi.fusion.model.Messenger r5 = r5.getMessenger()
            if (r5 == 0) goto L66
            com.beizi.fusion.model.ResponseInfo r5 = com.beizi.fusion.update.b.g
            com.beizi.fusion.model.Messenger r5 = r5.getMessenger()
            long r2 = r5.getCheckInterval()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L66
            r4.c = r2
        L66:
            com.beizi.fusion.model.ResponseInfo r5 = com.beizi.fusion.update.b.g
            com.beizi.fusion.model.TaskConfig r5 = r5.getTaskConfig()
            if (r5 == 0) goto L7e
            com.beizi.fusion.model.ResponseInfo r5 = com.beizi.fusion.update.b.g
            com.beizi.fusion.model.TaskConfig r5 = r5.getTaskConfig()
            long r2 = r5.getCheckInterval()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L7e
            r4.d = r2
        L7e:
            return
    }

    static /* synthetic */ android.content.Context a() {
            android.content.Context r0 = com.beizi.fusion.update.b.f
            return r0
    }

    static /* synthetic */ com.beizi.fusion.model.TaskBean a(com.beizi.fusion.model.TaskBean r0) {
            com.beizi.fusion.update.b.i = r0
            return r0
    }

    public static synchronized com.beizi.fusion.update.b a(android.content.Context r2) {
            java.lang.Class<com.beizi.fusion.update.b> r0 = com.beizi.fusion.update.b.class
            monitor-enter(r0)
            com.beizi.fusion.update.b r1 = com.beizi.fusion.update.b.f82m     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.beizi.fusion.update.b r1 = new com.beizi.fusion.update.b     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.beizi.fusion.update.b.f82m = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.beizi.fusion.update.b r2 = com.beizi.fusion.update.b.f82m     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    static /* synthetic */ java.lang.Boolean a(com.beizi.fusion.update.b r0) {
            java.lang.Boolean r0 = r0.e()
            return r0
    }

    static /* synthetic */ boolean a(boolean r0) {
            com.beizi.fusion.update.b.f81l = r0
            return r0
    }

    static /* synthetic */ com.beizi.fusion.model.ResponseInfo b() {
            com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.update.b.g
            return r0
    }

    static /* synthetic */ com.beizi.fusion.update.b.HandlerC0003b b(com.beizi.fusion.update.b r0) {
            com.beizi.fusion.update.b$b r0 = r0.e
            return r0
    }

    static /* synthetic */ com.beizi.fusion.model.TaskBean c() {
            com.beizi.fusion.model.TaskBean r0 = com.beizi.fusion.update.b.i
            return r0
    }

    private void c(int r4) {
            r3 = this;
            android.content.Context r0 = com.beizi.fusion.update.b.f
            com.beizi.fusion.tool.z r0 = com.beizi.fusion.tool.z.a(r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.ad.action.UPDATE_CONFIG_SUCCESS"
            r1.<init>(r2)
            java.lang.String r2 = "updateResult"
            r1.putExtra(r2, r4)
            r0.a(r1)
            return
    }

    static /* synthetic */ boolean d() {
            boolean r0 = com.beizi.fusion.update.b.f81l
            return r0
    }

    private java.lang.Boolean e() {
            r10 = this;
            com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.update.b.g
            com.beizi.fusion.model.Manager r0 = r0.getManager()
            if (r0 == 0) goto L8f
            java.util.List r0 = r0.getAdSpaces()
            if (r0 != 0) goto L11
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L11:
            int r1 = r0.size()
            if (r1 != 0) goto L1a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L1a:
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()
            java.lang.String r1 = r1.b()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.beizi.fusion.model.AdSpacesBean r0 = (com.beizi.fusion.model.AdSpacesBean) r0
            java.lang.String r3 = r0.getAppId()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L36
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L36:
            com.beizi.fusion.model.AdSpacesBean$ComponentBean r0 = r0.getComponent()
            if (r0 != 0) goto L3f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L3f:
            com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.update.b.g
            com.beizi.fusion.model.Configurator r0 = r0.getConfigurator()
            if (r0 == 0) goto L8c
            java.util.Date r0 = new java.util.Date
            r3 = 0
            r0.<init>(r3)
            android.content.Context r1 = com.beizi.fusion.update.b.f
            long r5 = r0.getTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = "lastUpdateTime"
            java.lang.Object r0 = com.beizi.fusion.tool.an.b(r1, r5, r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            com.beizi.fusion.model.ResponseInfo r5 = com.beizi.fusion.update.b.g
            long r5 = r5.getExpireTime()
            com.beizi.fusion.model.ResponseInfo r7 = com.beizi.fusion.update.b.g
            long r7 = r7.getMaxValidTime()
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L79
            r7 = 2592000000(0x9a7ec800, double:1.280618154E-314)
        L79:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L86
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L87
        L86:
            r2 = 1
        L87:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L8c:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L8f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    private void f() {
            r6 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r6.a
            r1 = 2
            if (r0 != 0) goto Lb
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r1)
            r6.a = r0
        Lb:
            java.util.concurrent.ScheduledExecutorService r0 = r6.h
            if (r0 != 0) goto L15
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r1)
            r6.h = r0
        L15:
            java.util.concurrent.ScheduledExecutorService r0 = r6.j
            if (r0 != 0) goto L27
            long r2 = r6.d
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L27
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r1)
            r6.j = r0
        L27:
            return
    }

    public void a(int r12) {
            r11 = this;
            boolean r12 = com.beizi.fusion.update.b.k
            r0 = 0
            if (r12 == 0) goto La
            r11.c(r0)
            com.beizi.fusion.update.b.k = r0
        La:
            android.content.Context r12 = com.beizi.fusion.update.b.f
            com.beizi.fusion.events.EventCar r12 = com.beizi.fusion.events.EventCar.getInstance(r12)
            com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
            java.lang.String r2 = com.beizi.fusion.c.b.b
            com.beizi.fusion.c.b r3 = com.beizi.fusion.c.b.a()
            java.lang.String r6 = r3.b()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = "320.500"
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.goRoad(r1)
            com.beizi.fusion.update.b.f81l = r0
            return
    }

    public void a(java.lang.Object r12) {
            r11 = this;
            com.beizi.fusion.update.a r12 = (com.beizi.fusion.update.a) r12
            r0 = 0
            if (r12 == 0) goto L46
            android.content.Context r12 = com.beizi.fusion.update.b.f
            com.beizi.fusion.model.ResponseInfo r12 = com.beizi.fusion.model.ResponseInfo.getInstance(r12)
            com.beizi.fusion.update.b.g = r12
            r12.init()
            boolean r12 = com.beizi.fusion.update.b.k
            if (r12 == 0) goto L1a
            r12 = 1
            r11.c(r12)
            com.beizi.fusion.update.b.k = r0
        L1a:
            android.content.Context r12 = com.beizi.fusion.update.b.f
            com.beizi.fusion.events.EventCar r12 = com.beizi.fusion.events.EventCar.getInstance(r12)
            com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
            java.lang.String r2 = com.beizi.fusion.c.b.b
            com.beizi.fusion.c.b r3 = com.beizi.fusion.c.b.a()
            java.lang.String r6 = r3.b()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = "320.200"
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.goRoad(r1)
        L46:
            com.beizi.fusion.update.b.f81l = r0
            return
    }

    public void b(int r15) {
            r14 = this;
            r14.f()
            if (r15 == 0) goto L4b
            r0 = 5
            if (r15 == r0) goto L9
            return
        L9:
            r15 = 1
            com.beizi.fusion.update.b.k = r15
            boolean r1 = com.beizi.fusion.update.b.f81l
            if (r1 != 0) goto L1e
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r1.what = r15
            r1.arg1 = r0
            com.beizi.fusion.update.b$b r15 = r14.e
            r15.sendMessage(r1)
        L1e:
            android.content.Context r15 = com.beizi.fusion.update.b.f
            com.beizi.fusion.events.EventCar r15 = com.beizi.fusion.events.EventCar.getInstance(r15)
            com.beizi.fusion.events.EventBean r0 = new com.beizi.fusion.events.EventBean
            java.lang.String r1 = com.beizi.fusion.c.b.b
            com.beizi.fusion.c.b r2 = com.beizi.fusion.c.b.a()
            java.lang.String r5 = r2.b()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r2)
            java.lang.String r9 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = "310.200"
            java.lang.String r4 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.goRoad(r0)
            return
        L4b:
            java.util.concurrent.ScheduledExecutorService r1 = r14.a
            com.beizi.fusion.update.b$a r2 = new com.beizi.fusion.update.b$a
            r15 = 2
            r2.<init>(r14, r15)
            long r5 = r14.b
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3 = 0
            r7 = r13
            r1.scheduleWithFixedDelay(r2, r3, r5, r7)
            java.util.concurrent.ScheduledExecutorService r7 = r14.h
            com.beizi.fusion.update.b$a r8 = new com.beizi.fusion.update.b$a
            r15 = 3
            r8.<init>(r14, r15)
            r9 = 0
            long r11 = r14.c
            r7.scheduleWithFixedDelay(r8, r9, r11, r13)
            java.util.concurrent.ScheduledExecutorService r7 = r14.j
            if (r7 == 0) goto Lb1
            long r0 = r14.d
            r2 = 0
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 == 0) goto Lb1
            com.beizi.fusion.update.b$a r8 = new com.beizi.fusion.update.b$a
            r15 = 4
            r8.<init>(r14, r15)
            r9 = 0
            long r11 = r14.d
            r7.scheduleWithFixedDelay(r8, r9, r11, r13)
            android.content.Context r15 = com.beizi.fusion.update.b.f
            com.beizi.fusion.events.EventCar r15 = com.beizi.fusion.events.EventCar.getInstance(r15)
            com.beizi.fusion.events.EventBean r0 = new com.beizi.fusion.events.EventBean
            java.lang.String r1 = com.beizi.fusion.c.b.b
            com.beizi.fusion.c.b r2 = com.beizi.fusion.c.b.a()
            java.lang.String r5 = r2.b()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r2)
            java.lang.String r9 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = "500.000"
            java.lang.String r4 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.goRoad(r0)
        Lb1:
            android.content.Context r15 = com.beizi.fusion.update.b.f
            com.beizi.fusion.events.EventCar r15 = com.beizi.fusion.events.EventCar.getInstance(r15)
            com.beizi.fusion.events.EventBean r0 = new com.beizi.fusion.events.EventBean
            java.lang.String r1 = com.beizi.fusion.c.b.b
            com.beizi.fusion.c.b r2 = com.beizi.fusion.c.b.a()
            java.lang.String r5 = r2.b()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r2)
            java.lang.String r9 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = "300.000"
            java.lang.String r4 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.goRoad(r0)
            return
    }
}
