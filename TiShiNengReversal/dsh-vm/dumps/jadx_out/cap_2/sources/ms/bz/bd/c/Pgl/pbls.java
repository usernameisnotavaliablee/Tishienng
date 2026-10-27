package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pbls {
    private final android.content.Context a;
    ms.bz.bd.c.Pgl.pblt b;
    android.content.ServiceConnection c;

    final class pgla implements android.content.ServiceConnection {
        final /* synthetic */ ms.bz.bd.c.Pgl.pbls a;

        pgla(ms.bz.bd.c.Pgl.pbls r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
                r1 = this;
                ms.bz.bd.c.Pgl.pbls r2 = r1.a
                ms.bz.bd.c.Pgl.pblt r0 = new ms.bz.bd.c.Pgl.pblt
                r0.<init>(r3)
                r2.b = r0
                return
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName r1) {
                r0 = this;
                return
        }
    }

    public pbls(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            ms.bz.bd.c.Pgl.pbls$pgla r0 = new ms.bz.bd.c.Pgl.pbls$pgla
            r0.<init>(r1)
            r1.c = r0
            r1.a = r2
            return
    }

    public final void a(ms.bz.bd.c.Pgl.pblk.pblb r10) {
            r9 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 23
            byte[] r7 = new byte[r1]
            r7 = {x0052: FILL_ARRAY_DATA , data: [115, 111, 28, 91, 68, 50, 107, 13, 55, 52, 102, 105, 18, 16, 87, 35, 113, 70, 33, 39, 121, 99, 20} // fill-array
            r4 = 0
            java.lang.String r6 = "abbaa0"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 39
            byte[] r8 = new byte[r2]
            r8 = {x0062: FILL_ARRAY_DATA , data: [119, 104, 27, 9, 71, 96, 111, 10, 48, 102, 98, 110, 21, 66, 84, 113, 117, 65, 38, 117, 125, 100, 19, 9, 121, 112, 112, 77, 55, 102, 125, 99, 37, 66, 79, 99, 111, 71, 49} // fill-array
            r5 = 0
            java.lang.String r7 = "eee3bb"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r2 = (java.lang.String) r2
            r0.setClassName(r1, r2)
            android.content.Context r1 = r9.a
            android.content.ServiceConnection r2 = r9.c
            r3 = 1
            boolean r0 = r1.bindService(r0, r2, r3)
            if (r0 == 0) goto L51
            ms.bz.bd.c.Pgl.pblt r0 = r9.b     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L4a
            java.lang.String r0 = r0.j()     // Catch: java.lang.Throwable -> L4a
            if (r10 == 0) goto L4a
            r10.j(r0)     // Catch: java.lang.Throwable -> L4a
        L4a:
            android.content.Context r10 = r9.a
            android.content.ServiceConnection r0 = r9.c
            r10.unbindService(r0)
        L51:
            return
    }
}
