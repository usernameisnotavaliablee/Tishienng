package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a1 {
    public static volatile boolean c = true;
    public static java.lang.String d;
    private static volatile ms.bz.bd.c.Pgl.a1 e;
    private ms.bz.bd.c.Pgl.pblk a;
    private java.lang.String b;

    final class pgla implements ms.bz.bd.c.Pgl.pblk.pblb {
        final /* synthetic */ ms.bz.bd.c.Pgl.a1 a;

        pgla(ms.bz.bd.c.Pgl.a1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // ms.bz.bd.c.Pgl.pblk.pblb
        public final void j(java.lang.String r2) {
                r1 = this;
                ms.bz.bd.c.Pgl.a1 r0 = r1.a
                ms.bz.bd.c.Pgl.a1.c(r0, r2)
                return
        }
    }

    private a1(android.content.Context r7) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.b = r0
            ms.bz.bd.c.Pgl.pblk r0 = new ms.bz.bd.c.Pgl.pblk     // Catch: java.lang.Throwable -> L22
            ms.bz.bd.c.Pgl.a1$pgla r1 = new ms.bz.bd.c.Pgl.a1$pgla     // Catch: java.lang.Throwable -> L22
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L22
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            r6.a = r0     // Catch: java.lang.Throwable -> L22
            boolean r0 = ms.bz.bd.c.Pgl.a1.c     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L21
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L22
            r1 = 32
            if (r0 > r1) goto L21
            ms.bz.bd.c.Pgl.pblk r0 = r6.a     // Catch: java.lang.Throwable -> L22
            r0.c(r7)     // Catch: java.lang.Throwable -> L22
        L21:
            return
        L22:
            r7 = 3
            byte[] r5 = new byte[r7]
            r5 = {x0034: FILL_ARRAY_DATA , data: [124, 47, 64} // fill-array
            r2 = 0
            java.lang.String r4 = "b802bc"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            return
    }

    public static ms.bz.bd.c.Pgl.a1 b(android.content.Context r2) {
            ms.bz.bd.c.Pgl.a1 r0 = ms.bz.bd.c.Pgl.a1.e
            if (r0 != 0) goto L19
            java.lang.Class<ms.bz.bd.c.Pgl.a1> r0 = ms.bz.bd.c.Pgl.a1.class
            monitor-enter(r0)
            ms.bz.bd.c.Pgl.a1 r1 = ms.bz.bd.c.Pgl.a1.e     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            ms.bz.bd.c.Pgl.a1 r1 = new ms.bz.bd.c.Pgl.a1     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            ms.bz.bd.c.Pgl.a1.e = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            ms.bz.bd.c.Pgl.a1 r2 = ms.bz.bd.c.Pgl.a1.e
            return r2
    }

    static /* synthetic */ void c(ms.bz.bd.c.Pgl.a1 r0, java.lang.String r1) {
            r0.b = r1
            return
    }

    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = ms.bz.bd.c.Pgl.a1.d
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = r1.b
            return r0
    }
}
