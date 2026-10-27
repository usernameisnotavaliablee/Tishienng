package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pblo {
    private final android.content.Context a;
    public final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> b;
    android.content.ServiceConnection c;

    final class pgla implements android.content.ServiceConnection {
        final /* synthetic */ ms.bz.bd.c.Pgl.pblo a;

        pgla(ms.bz.bd.c.Pgl.pblo r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
                r0 = this;
                ms.bz.bd.c.Pgl.pblo r1 = r0.a     // Catch: java.lang.Exception -> L7
                java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r1 = r1.b     // Catch: java.lang.Exception -> L7
                r1.put(r2)     // Catch: java.lang.Exception -> L7
            L7:
                return
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName r1) {
                r0 = this;
                return
        }
    }

    public pblo(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1)
            r2.b = r0
            ms.bz.bd.c.Pgl.pblo$pgla r0 = new ms.bz.bd.c.Pgl.pblo$pgla
            r0.<init>(r2)
            r2.c = r0
            r2.a = r3
            return
    }

    public final void a(ms.bz.bd.c.Pgl.pblk.pblb r10) {
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto L8
            goto L8c
        L8:
            r1 = 33
            if (r0 < r1) goto Le
            goto L8c
        Le:
            r0 = 15
            android.content.Context r1 = r9.a     // Catch: java.lang.Exception -> L2e
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L2e
            java.lang.String r6 = "f8dffb"
            byte[] r7 = new byte[r0]     // Catch: java.lang.Exception -> L2e
            r7 = {x008e: FILL_ARRAY_DATA , data: [116, 53, 26, 92, 81, 96, 100, 14, 48, 63, 57, 50, 0, 27, 93} // fill-array     // Catch: java.lang.Exception -> L2e
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L2e
            r3 = 0
            r1.getPackageInfo(r2, r3)     // Catch: java.lang.Exception -> L2e
            goto L2f
        L2e:
        L2f:
            android.content.Intent r1 = new android.content.Intent
            r2 = 36
            byte[] r8 = new byte[r2]
            r8 = {x009a: FILL_ARRAY_DATA , data: [36, 60, 29, 94, 26, 47, 49, 25, 33, 122, 40, 35, 21, 30, 11, 37, 35, 25, 49, 49, 105, 28, 32, 53, 33, 9, 17, 35, 13, 7, 2, 1, 38, 57, 44, 5} // fill-array
            r5 = 0
            java.lang.String r7 = "61cd07"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r2)
            byte[] r8 = new byte[r0]
            r8 = {x00b0: FILL_ARRAY_DATA , data: [113, 61, 24, 8, 81, 48, 97, 6, 50, 107, 60, 58, 2, 79, 93} // fill-array
            java.lang.String r7 = "c0f2f2"
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            r1.setPackage(r0)
            android.content.Context r0 = r9.a
            android.content.ServiceConnection r2 = r9.c
            r3 = 1
            boolean r0 = r0.bindService(r1, r2, r3)
            if (r0 == 0) goto L8c
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r9.b     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L85
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L85
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L85
            ms.bz.bd.c.Pgl.pblp r1 = new ms.bz.bd.c.Pgl.pblp     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L85
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L85
            java.lang.String r0 = r1.j()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L85
            if (r10 == 0) goto L85
            r10.j(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L85
            goto L85
        L7b:
            r0 = move-exception
            r10 = r0
            android.content.Context r0 = r9.a
            android.content.ServiceConnection r1 = r9.c
            r0.unbindService(r1)
            throw r10
        L85:
            android.content.Context r10 = r9.a
            android.content.ServiceConnection r0 = r9.c
            r10.unbindService(r0)
        L8c:
            return
    }
}
