package xyz.adscope.common.v2.dev.oaid.sm.oaid.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class OAIDService implements android.content.ServiceConnection {
    private final xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDService.RemoteCaller caller;
    private final android.content.Context context;
    private final xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter getter;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.FunctionalInterface
    public interface RemoteCaller {
        java.lang.String callRemoteInterface(android.os.IBinder r1);
    }

    private OAIDService(android.content.Context r2, xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r3, xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDService.RemoteCaller r4) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto La
            r1.context = r2
            goto L14
        La:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.context = r2
        L14:
            r1.getter = r3
            r1.caller = r4
            return
    }

    public static void bind(android.content.Context r1, android.content.Intent r2, xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r3, xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDService.RemoteCaller r4) {
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDService r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDService
            r0.<init>(r1, r3, r4)
            r0.bind(r2)
            return
    }

    private void bind(android.content.Intent r3) {
            r2 = this;
            android.content.Context r0 = r2.context     // Catch: java.lang.Exception -> L1e
            r1 = 1
            boolean r0 = r0.bindService(r3, r2, r1)     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1e
            r0.<init>()     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = "Service has been bound: "
            r0.append(r1)     // Catch: java.lang.Exception -> L1e
            r0.append(r3)     // Catch: java.lang.Exception -> L1e
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L1e
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r3)     // Catch: java.lang.Exception -> L1e
            return
        L1e:
            r3 = move-exception
            goto L28
        L20:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException r3 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = "Service binding failed"
            r3.<init>(r0)     // Catch: java.lang.Exception -> L1e
            throw r3     // Catch: java.lang.Exception -> L1e
        L28:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r0 = r2.getter
            r0.onOAIDGetError(r3)
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            java.lang.String r0 = "Service has been unbound: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Service has been connected: "
            r1.append(r2)
            java.lang.String r2 = r4.getClassName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r1)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDService$RemoteCaller r1 = r3.caller     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r5 = r1.callRemoteInterface(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r5 == 0) goto L66
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r1 == 0) goto L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r1.<init>()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r2 = "OAID acquire success: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r1.append(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r1 = r3.getter     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r1.onOAIDGetComplete(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            android.content.Context r5 = r3.context     // Catch: java.lang.Exception -> L5d
            r5.unbindService(r3)     // Catch: java.lang.Exception -> L5d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5d
            r5.<init>()     // Catch: java.lang.Exception -> L5d
            r5.append(r0)     // Catch: java.lang.Exception -> L5d
            java.lang.String r4 = r4.getClassName()     // Catch: java.lang.Exception -> L5d
            r5.append(r4)     // Catch: java.lang.Exception -> L5d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L5d
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r4)     // Catch: java.lang.Exception -> L5d
            return
        L5d:
            r4 = move-exception
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r4)
            goto L96
        L62:
            r5 = move-exception
            goto L97
        L64:
            r5 = move-exception
            goto L6e
        L66:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException r5 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r1 = "OAID acquire failed"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            throw r5     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
        L6e:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r5)     // Catch: java.lang.Throwable -> L62
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r1 = r3.getter     // Catch: java.lang.Throwable -> L62
            r1.onOAIDGetError(r5)     // Catch: java.lang.Throwable -> L62
            android.content.Context r5 = r3.context     // Catch: java.lang.Exception -> L92
            r5.unbindService(r3)     // Catch: java.lang.Exception -> L92
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L92
            r5.<init>()     // Catch: java.lang.Exception -> L92
            r5.append(r0)     // Catch: java.lang.Exception -> L92
            java.lang.String r4 = r4.getClassName()     // Catch: java.lang.Exception -> L92
            r5.append(r4)     // Catch: java.lang.Exception -> L92
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L92
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r4)     // Catch: java.lang.Exception -> L92
            goto L96
        L92:
            r4 = move-exception
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r4)
        L96:
            return
        L97:
            android.content.Context r1 = r3.context     // Catch: java.lang.Exception -> Lb3
            r1.unbindService(r3)     // Catch: java.lang.Exception -> Lb3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb3
            r1.<init>()     // Catch: java.lang.Exception -> Lb3
            r1.append(r0)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r4 = r4.getClassName()     // Catch: java.lang.Exception -> Lb3
            r1.append(r4)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> Lb3
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r4)     // Catch: java.lang.Exception -> Lb3
            goto Lb7
        Lb3:
            r4 = move-exception
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r4)
        Lb7:
            throw r5
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Service has been disconnected: "
            r0.append(r1)
            java.lang.String r3 = r3.getClassName()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r3)
            return
    }
}
