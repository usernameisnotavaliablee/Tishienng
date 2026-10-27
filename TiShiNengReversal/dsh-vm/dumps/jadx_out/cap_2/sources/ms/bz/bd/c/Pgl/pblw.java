package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class pblw extends ms.bz.bd.c.Pgl.pbly.pgla {
    private static ms.bz.bd.c.Pgl.pblw a;

    public static class pgla {
        private long a;
        private java.lang.String b;

        public pgla() {
                r0 = this;
                r0.<init>()
                return
        }

        public final void a(java.lang.String r3) {
                r2 = this;
                r2.b = r3
                long r0 = java.lang.System.currentTimeMillis()
                r2.a = r0
                return
        }

        public final void b(java.lang.String r9, int r10) {
                r8 = this;
                ms.bz.bd.c.Pgl.pblw r0 = ms.bz.bd.c.Pgl.pblw.c()
                if (r0 != 0) goto L7
                return
            L7:
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = r8.a
                long r1 = r1 - r3
                java.lang.String r5 = r8.b
                r6 = r9
                r7 = r10
                r0.d(r1, r3, r5, r6, r7)
                return
        }

        public final void c(java.lang.String r9, int r10) {
                r8 = this;
                ms.bz.bd.c.Pgl.pblw r0 = ms.bz.bd.c.Pgl.pblw.c()
                if (r0 != 0) goto L7
                return
            L7:
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = r8.a
                long r1 = r1 - r3
                java.lang.String r5 = r8.b
                r6 = r9
                r7 = r10
                r0.h(r1, r3, r5, r6, r7)
                return
        }
    }

    public pblw() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized ms.bz.bd.c.Pgl.pblw c() {
            java.lang.Class<ms.bz.bd.c.Pgl.pblw> r0 = ms.bz.bd.c.Pgl.pblw.class
            monitor-enter(r0)
            ms.bz.bd.c.Pgl.pblw r1 = ms.bz.bd.c.Pgl.pblw.a     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static synchronized void f(ms.bz.bd.c.Pgl.pblw r1) {
            java.lang.Class<ms.bz.bd.c.Pgl.pblw> r0 = ms.bz.bd.c.Pgl.pblw.class
            monitor-enter(r0)
            ms.bz.bd.c.Pgl.pblw.a = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object a(int r7, int r8, long r9, java.lang.String r11, java.lang.Object r12) throws java.lang.Throwable {
            r6 = this;
            r8 = 131073(0x20001, float:1.83672E-40)
            r9 = 2
            r10 = 0
            if (r7 != r8) goto L24
            if (r11 == 0) goto L23
            boolean r7 = r6.g(r11)
            if (r7 == 0) goto L23
            byte[] r5 = new byte[r9]
            r5 = {x004e: FILL_ARRAY_DATA , data: [88, 31} // fill-array
            r2 = 0
            java.lang.String r4 = "f654b8"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            java.lang.Object r7 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L23:
            return r10
        L24:
            r8 = 131074(0x20002, float:1.83674E-40)
            if (r7 != r8) goto L4c
            java.lang.String[] r12 = (java.lang.String[]) r12
            if (r11 == 0) goto L4c
            if (r12 == 0) goto L4c
            int r7 = r12.length
            if (r7 == 0) goto L4c
            org.json.JSONObject r7 = new org.json.JSONObject
            r8 = 0
            r8 = r12[r8]
            r7.<init>(r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r0 = 1
            r0 = r12[r0]
            r8.<init>(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r9 = r12[r9]
            r0.<init>(r9)
            r6.e(r11, r7, r8, r0)
        L4c:
            return r10
    }

    public abstract void d(long r1, long r3, java.lang.String r5, java.lang.String r6, int r7);

    public abstract void e(java.lang.String r1, org.json.JSONObject r2, org.json.JSONObject r3, org.json.JSONObject r4);

    public abstract boolean g(java.lang.String r1);

    public abstract void h(long r1, long r3, java.lang.String r5, java.lang.String r6, int r7);
}
