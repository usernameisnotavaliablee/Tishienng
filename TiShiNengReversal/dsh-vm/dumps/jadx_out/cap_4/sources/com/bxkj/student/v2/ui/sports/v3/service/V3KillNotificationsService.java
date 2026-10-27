package com.bxkj.student.v2.ui.sports.v3.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3KillNotificationsService extends android.app.Service {

    @org.jetbrains.annotations.NotNull
    private final android.os.IBinder a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class a extends android.os.Binder {

        @org.jetbrains.annotations.NotNull
        private final android.app.Service a;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.V3KillNotificationsService b;

        public a(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.ui.sports.v3.service.V3KillNotificationsService r2, android.app.Service r3) {
                r1 = this;
                java.lang.String r0 = "service"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.b = r2
                r1.<init>()
                r1.a = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final android.app.Service a() {
                r1 = this;
                android.app.Service r0 = r1.a
                return r0
        }
    }

    public V3KillNotificationsService() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.v2.ui.sports.v3.service.V3KillNotificationsService$a r0 = new com.bxkj.student.v2.ui.sports.v3.service.V3KillNotificationsService$a
            r0.<init>(r1, r1)
            r1.a = r0
            return
    }

    @Override // android.app.Service
    @org.jetbrains.annotations.NotNull
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull android.content.Intent r2) {
            r1 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.g0.p(r2, r0)
            android.os.IBinder r2 = r1.a
            return r2
    }

    @Override // android.app.Service
    public void onCreate() {
            r0 = this;
            return
    }

    @Override // android.app.Service
    public int onStartCommand(@org.jetbrains.annotations.Nullable android.content.Intent r1, int r2, int r3) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // android.app.Service
    public void onTaskRemoved(@org.jetbrains.annotations.Nullable android.content.Intent r4) {
            r3 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "KillNotificationsService->onTaskRemoved"
            com.orhanobut.logger.j.d(r2, r1)
            if (r4 == 0) goto L15
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto L15
            java.lang.String r4 = r4.getClassName()
            goto L16
        L15:
            r4 = 0
        L16:
            java.lang.String r1 = "com.acse.ottn.activity.TransparentGreenActivity"
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r1)
            if (r4 == 0) goto L26
            java.lang.String r4 = "来自省钱助手的错误杀进程"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r4, r0)
            return
        L26:
            com.bxkj.student.v2.ui.sports.v3.service.m$a r4 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            r4.b(r3)
            return
    }
}
