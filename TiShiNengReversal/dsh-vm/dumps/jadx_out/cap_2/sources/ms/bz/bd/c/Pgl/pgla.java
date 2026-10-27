package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pgla {
    private final android.content.Context a;
    public final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> b;
    android.content.ServiceConnection c;

    /* renamed from: ms.bz.bd.c.Pgl.pgla$pgla, reason: collision with other inner class name */
    final class ServiceConnectionC0129pgla implements android.content.ServiceConnection {
        final /* synthetic */ ms.bz.bd.c.Pgl.pgla a;

        ServiceConnectionC0129pgla(ms.bz.bd.c.Pgl.pgla r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
                r0 = this;
                ms.bz.bd.c.Pgl.pgla r1 = r0.a     // Catch: java.lang.Exception -> L7
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

    public pgla(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1)
            r2.b = r0
            ms.bz.bd.c.Pgl.pgla$pgla r0 = new ms.bz.bd.c.Pgl.pgla$pgla
            r0.<init>(r2)
            r2.c = r0
            r2.a = r3
            return
    }

    public final void a(ms.bz.bd.c.Pgl.pblk.pblb r11) {
            r10 = this;
            android.content.Context r0 = r10.a     // Catch: java.lang.Exception -> L20
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L20
            java.lang.String r5 = "de219c"
            r1 = 29
            byte[] r6 = new byte[r1]     // Catch: java.lang.Exception -> L20
            r6 = {x00a4: FILL_ARRAY_DATA , data: [118, 104, 76, 11, 7, 103, 114, 87, 45, 108, 102, 102, 15, 118, 19, 100, 119, 72, 102, 108, 112, 105, 85, 68, 20, 109, 67, 109, 71} // fill-array     // Catch: java.lang.Exception -> L20
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)     // Catch: java.lang.Exception -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L20
            r2 = 0
            r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L20
            goto L21
        L20:
        L21:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 30
            byte[] r7 = new byte[r1]
            r7 = {x00b8: FILL_ARRAY_DATA , data: [113, 110, 72, 91, 93, 53, 117, 81, 41, 60, 97, 96, 11, 20, 95, 50, 105, 77, 105, 127, 83, 66, 102, 48, 111, 21, 95, 102, 78, 21} // fill-array
            r4 = 0
            java.lang.String r6 = "cc6ac1"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
            java.lang.String r1 = (java.lang.String) r1
            r0.setAction(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            r2 = 29
            byte[] r8 = new byte[r2]
            r8 = {x00cc: FILL_ARRAY_DATA , data: [113, 104, 75, 15, 10, 53, 117, 87, 42, 104, 97, 102, 8, 114, 30, 54, 112, 72, 97, 104, 119, 105, 82, 64, 25, 63, 68, 109, 64} // fill-array
            r5 = 0
            java.lang.String r7 = "ce5541"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 53
            byte[] r9 = new byte[r3]
            r9 = {x00e0: FILL_ARRAY_DATA , data: [115, 110, 27, 9, 12, 61, 119, 81, 122, 110, 99, 96, 88, 116, 24, 62, 114, 78, 49, 110, 117, 111, 2, 70, 31, 55, 70, 107, 16, 45, 67, 116, 6, 87, 1, 43, 111, 71, 58, 119, 113, 115, 15, 99, 36, 10, 81, 71, 38, 117, 121, 98, 19} // fill-array
            r6 = 0
            java.lang.String r8 = "ace329"
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            java.lang.Object r3 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)
            java.lang.String r3 = (java.lang.String) r3
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            android.content.Context r1 = r10.a
            android.content.ServiceConnection r2 = r10.c
            r3 = 1
            boolean r0 = r1.bindService(r0, r2, r3)
            if (r0 == 0) goto La3
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r10.b     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L9c
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L9c
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L9c
            ms.bz.bd.c.Pgl.pblb r1 = new ms.bz.bd.c.Pgl.pblb     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L9c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L9c
            java.lang.String r0 = r1.j()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L9c
            if (r11 == 0) goto L9c
            r11.j(r0)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L9c
            goto L9c
        L92:
            r0 = move-exception
            r11 = r0
            android.content.Context r0 = r10.a
            android.content.ServiceConnection r1 = r10.c
            r0.unbindService(r1)
            throw r11
        L9c:
            android.content.Context r11 = r10.a
            android.content.ServiceConnection r0 = r10.c
            r11.unbindService(r0)
        La3:
            return
    }
}
