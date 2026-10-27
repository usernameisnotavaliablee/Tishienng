package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pbly {
    private static final android.util.SparseArray<ms.bz.bd.c.Pgl.pbly.pgla> a = null;
    public static final /* synthetic */ int b = 0;

    public static abstract class pgla {
        public pgla() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.Object a(int r1, int r2, long r3, java.lang.String r5, java.lang.Object r6) throws java.lang.Throwable {
                r0 = this;
                java.lang.Object r1 = r0.b(r3, r5, r6)
                return r1
        }

        protected java.lang.Object b(long r1, java.lang.String r3, java.lang.Object r4) throws java.lang.Throwable {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            ms.bz.bd.c.Pgl.pbly.a = r0
            return
    }

    public pbly() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Object a(int r9, int r10, long r11, java.lang.String r13, java.lang.Object r14) {
            android.util.SparseArray<ms.bz.bd.c.Pgl.pbly$pgla> r0 = ms.bz.bd.c.Pgl.pbly.a
            java.lang.Object r0 = r0.get(r9)
            r1 = r0
            ms.bz.bd.c.Pgl.pbly$pgla r1 = (ms.bz.bd.c.Pgl.pbly.pgla) r1
            if (r1 == 0) goto L1d
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r7 = r14
            java.lang.Object r9 = r1.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L15
            return r9
        L15:
            r0 = move-exception
            r9 = r0
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
        L1d:
            r2 = r9
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r10 = 21
            byte[] r8 = new byte[r10]
            r8 = {x0048: FILL_ARRAY_DATA , data: [125, 37, 80, 17, 0, 32, 101, 86, 119, 50, 50, 60, 3, 82, 6, 42, 118, 23, 62, 63, 118} // fill-array
            r5 = 0
            java.lang.String r7 = "c7cf03"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r10 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r12 = 1
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r13 = 0
            r12[r13] = r11
            java.lang.String r10 = java.lang.String.format(r10, r12)
            r9.<init>(r10)
            throw r9
    }

    public static void b(int r8, ms.bz.bd.c.Pgl.pbly.pgla r9) {
            android.util.SparseArray<ms.bz.bd.c.Pgl.pbly$pgla> r0 = ms.bz.bd.c.Pgl.pbly.a
            java.lang.Object r1 = r0.get(r8)
            ms.bz.bd.c.Pgl.pbly$pgla r1 = (ms.bz.bd.c.Pgl.pbly.pgla) r1
            if (r1 != 0) goto Le
            r0.put(r8, r9)
            return
        Le:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r9 = 21
            byte[] r7 = new byte[r9]
            r7 = {x0038: FILL_ARRAY_DATA , data: [50, 34, 80, 77, 14, 117, 37, 16, 55, 100, 121, 113, 2, 64, 8, 120, 118, 6, 55, 115, 57} // fill-array
            r4 = 0
            java.lang.String r6 = "f3c10f"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            java.lang.Object r9 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = r1.toString()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r9 = java.lang.String.format(r9, r1)
            r8.<init>(r9)
            throw r8
    }
}
