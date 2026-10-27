package com.baidu.liantian;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LiantianService extends android.app.Service {
    private volatile int a;


    public LiantianService() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    static /* synthetic */ void a(com.baidu.liantian.LiantianService r1) {
            int r0 = r1.a     // Catch: java.lang.Throwable -> L14
            int r0 = r0 + (-1)
            r1.a = r0     // Catch: java.lang.Throwable -> L14
            int r0 = r1.a     // Catch: java.lang.Throwable -> L14
            if (r0 > 0) goto L13
            r0 = 0
            r1.a = r0     // Catch: java.lang.Throwable -> L14
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L14
            r1.stopSelf()     // Catch: java.lang.Throwable -> L14
        L13:
            return
        L14:
            com.baidu.liantian.b.e.a()
            return
    }

    static /* synthetic */ void a(com.baidu.liantian.LiantianService r7, java.lang.ClassLoader r8, android.content.Intent r9) {
            java.lang.String r0 = "target_class"
            java.lang.String r0 = r9.getStringExtra(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Class r8 = r8.loadClass(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r8.newInstance()     // Catch: java.lang.Throwable -> L40
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L40
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "target_method"
            java.lang.String r1 = r9.getStringExtra(r1)     // Catch: java.lang.Throwable -> L40
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L40
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L40
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Class<android.content.Intent> r4 = android.content.Intent.class
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L40
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L40
            android.content.Context r7 = com.stub.StubApp.getOrigApplicationContext(r7)     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L40
            r1[r5] = r7     // Catch: java.lang.Throwable -> L40
            r1[r6] = r9     // Catch: java.lang.Throwable -> L40
            r8.invoke(r0, r1)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r7 = move-exception
            r7.getMessage()
            com.baidu.liantian.b.b()
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r4, int r5, int r6) {
            r3 = this;
            if (r4 != 0) goto L7
            int r4 = super.onStartCommand(r4, r5, r6)     // Catch: java.lang.Throwable -> L26
            return r4
        L7:
            int r0 = r3.a     // Catch: java.lang.Throwable -> L26
            int r0 = r0 + 1
            r3.a = r0     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = "from_plugin_package"
            java.lang.String r0 = r4.getStringExtra(r0)     // Catch: java.lang.Throwable -> L26
            r4.getAction()     // Catch: java.lang.Throwable -> L26
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L26
            com.baidu.liantian.b.r r1 = com.baidu.liantian.b.r.a()     // Catch: java.lang.Throwable -> L26
            com.baidu.liantian.LiantianService$1 r2 = new com.baidu.liantian.LiantianService$1     // Catch: java.lang.Throwable -> L26
            r2.<init>(r3, r4, r0)     // Catch: java.lang.Throwable -> L26
            r1.a(r2)     // Catch: java.lang.Throwable -> L26
            goto L29
        L26:
            com.baidu.liantian.b.e.a()
        L29:
            int r4 = super.onStartCommand(r4, r5, r6)
            return r4
    }
}
