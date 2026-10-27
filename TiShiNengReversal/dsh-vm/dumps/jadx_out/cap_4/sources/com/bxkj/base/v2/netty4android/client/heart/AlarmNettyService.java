package com.bxkj.base.v2.netty4android.client.heart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class AlarmNettyService extends android.app.Service {

    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.netty4android.client.heart.a a;

    public AlarmNettyService() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void a() {
            r4 = this;
            com.bxkj.base.BaseApp r0 = com.bxkj.base.BaseApp.c()     // Catch: java.lang.Exception -> L1a
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L1a
            com.bxkj.base.BaseApp r2 = com.bxkj.base.BaseApp.c()     // Catch: java.lang.Exception -> L1a
            java.lang.Class<com.bxkj.base.v2.netty4android.service.NettySocketService> r3 = com.bxkj.base.v2.netty4android.service.NettySocketService.class
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L1a
            java.lang.String r2 = "action"
            r3 = 1
            android.content.Intent r1 = r1.putExtra(r2, r3)     // Catch: java.lang.Exception -> L1a
            r0.startService(r1)     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AlarmChatService心跳检测服务重连失败:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.e(r0, r1)
            return
    }

    @Override // android.app.Service
    @org.jetbrains.annotations.Nullable
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "AlarmChatService心跳检测服务重新创建"
            com.orhanobut.logger.j.d(r1, r0)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(@org.jetbrains.annotations.Nullable android.content.Intent r6, int r7, int r8) {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.bxkj.base.v2.netty4android.client.heart.a r2 = r5.a
            if (r2 != 0) goto Ld
            com.bxkj.base.v2.netty4android.client.heart.a r2 = new com.bxkj.base.v2.netty4android.client.heart.a
            r2.<init>(r5)
        Ld:
            r5.a = r2
            r2.b()
            com.bxkj.base.v2.data.b$a r2 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r3 = r2.a()
            boolean r3 = r3.Y()
            if (r3 == 0) goto L39
            com.bxkj.base.v2.data.b r2 = r2.a()
            long r2 = r2.u()
            long r0 = r0 - r2
            r2 = 180000(0x2bf20, double:8.8932E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L39
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "超过60秒3次未收到心跳回调重连"
            com.orhanobut.logger.j.e(r1, r0)
            r5.a()
        L39:
            int r6 = super.onStartCommand(r6, r7, r8)
            return r6
    }
}
