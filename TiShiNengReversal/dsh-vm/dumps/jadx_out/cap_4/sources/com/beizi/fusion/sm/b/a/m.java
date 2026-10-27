package com.beizi.fusion.sm.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class m implements android.content.ServiceConnection {
    private final android.content.Context a;
    private final com.beizi.fusion.sm.b.b b;
    private final com.beizi.fusion.sm.b.a.m.a c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.FunctionalInterface
    public interface a {
        java.lang.String a(android.os.IBinder r1) throws com.beizi.fusion.sm.b.d, android.os.RemoteException;
    }

    private m(android.content.Context r2, com.beizi.fusion.sm.b.b r3, com.beizi.fusion.sm.b.a.m.a r4) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto La
            r1.a = r2
            goto L14
        La:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.a = r2
        L14:
            r1.b = r3
            r1.c = r4
            return
    }

    public static void a(android.content.Context r1, android.content.Intent r2, com.beizi.fusion.sm.b.b r3, com.beizi.fusion.sm.b.a.m.a r4) {
            com.beizi.fusion.sm.b.a.m r0 = new com.beizi.fusion.sm.b.a.m
            r0.<init>(r1, r3, r4)
            r0.a(r2)
            return
    }

    private void a(android.content.Intent r3) {
            r2 = this;
            android.content.Context r0 = r2.a     // Catch: java.lang.Exception -> L1e
            r1 = 1
            boolean r0 = r0.bindService(r3, r2, r1)     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1e
            r0.<init>()     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = "Service has been bound: "
            r0.append(r1)     // Catch: java.lang.Exception -> L1e
            r0.append(r3)     // Catch: java.lang.Exception -> L1e
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L1e
            com.beizi.fusion.sm.b.e.a(r3)     // Catch: java.lang.Exception -> L1e
            return
        L1e:
            r3 = move-exception
            goto L28
        L20:
            com.beizi.fusion.sm.b.d r3 = new com.beizi.fusion.sm.b.d     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = "Service binding failed"
            r3.<init>(r0)     // Catch: java.lang.Exception -> L1e
            throw r3     // Catch: java.lang.Exception -> L1e
        L28:
            com.beizi.fusion.sm.b.b r0 = r2.b
            r0.a(r3)
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
            com.beizi.fusion.sm.b.e.a(r1)
            com.beizi.fusion.sm.b.a.m$a r1 = r3.c     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r5 == 0) goto L66
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r1 == 0) goto L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r1.<init>()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r2 = "OAID acquire success: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r1.append(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            com.beizi.fusion.sm.b.e.a(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            com.beizi.fusion.sm.b.b r1 = r3.b     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r1.a(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            android.content.Context r5 = r3.a     // Catch: java.lang.Exception -> L5d
            r5.unbindService(r3)     // Catch: java.lang.Exception -> L5d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5d
            r5.<init>()     // Catch: java.lang.Exception -> L5d
            r5.append(r0)     // Catch: java.lang.Exception -> L5d
            java.lang.String r4 = r4.getClassName()     // Catch: java.lang.Exception -> L5d
            r5.append(r4)     // Catch: java.lang.Exception -> L5d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L5d
            com.beizi.fusion.sm.b.e.a(r4)     // Catch: java.lang.Exception -> L5d
            return
        L5d:
            r4 = move-exception
            com.beizi.fusion.sm.b.e.a(r4)
            goto L91
        L62:
            r5 = move-exception
            goto L92
        L64:
            r5 = move-exception
            goto L6e
        L66:
            com.beizi.fusion.sm.b.d r5 = new com.beizi.fusion.sm.b.d     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r1 = "OAID acquire failed"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            throw r5     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
        L6e:
            com.beizi.fusion.sm.b.e.a(r5)     // Catch: java.lang.Throwable -> L62
            com.beizi.fusion.sm.b.b r1 = r3.b     // Catch: java.lang.Throwable -> L62
            r1.a(r5)     // Catch: java.lang.Throwable -> L62
            android.content.Context r5 = r3.a     // Catch: java.lang.Exception -> L5d
            r5.unbindService(r3)     // Catch: java.lang.Exception -> L5d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5d
            r5.<init>()     // Catch: java.lang.Exception -> L5d
            r5.append(r0)     // Catch: java.lang.Exception -> L5d
            java.lang.String r4 = r4.getClassName()     // Catch: java.lang.Exception -> L5d
            r5.append(r4)     // Catch: java.lang.Exception -> L5d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L5d
            com.beizi.fusion.sm.b.e.a(r4)     // Catch: java.lang.Exception -> L5d
        L91:
            return
        L92:
            android.content.Context r1 = r3.a     // Catch: java.lang.Exception -> Lae
            r1.unbindService(r3)     // Catch: java.lang.Exception -> Lae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lae
            r1.<init>()     // Catch: java.lang.Exception -> Lae
            r1.append(r0)     // Catch: java.lang.Exception -> Lae
            java.lang.String r4 = r4.getClassName()     // Catch: java.lang.Exception -> Lae
            r1.append(r4)     // Catch: java.lang.Exception -> Lae
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> Lae
            com.beizi.fusion.sm.b.e.a(r4)     // Catch: java.lang.Exception -> Lae
            goto Lb2
        Lae:
            r4 = move-exception
            com.beizi.fusion.sm.b.e.a(r4)
        Lb2:
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
            com.beizi.fusion.sm.b.e.a(r3)
            return
    }
}
