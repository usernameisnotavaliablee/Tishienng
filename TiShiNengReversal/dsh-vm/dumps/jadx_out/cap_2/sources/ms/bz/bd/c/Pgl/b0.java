package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class b0 extends ms.bz.bd.c.Pgl.pbly.pgla {
    b0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    protected final java.lang.Object b(long r7, java.lang.String r9, java.lang.Object r10) {
            r6 = this;
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 23
            r9 = 0
            r10 = 1
            if (r7 < r8) goto L62
            ms.bz.bd.c.Pgl.pblv r7 = ms.bz.bd.c.Pgl.pblv.a()     // Catch: java.lang.Throwable -> L62
            android.content.Context r7 = r7.c()     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = "60965a"
            r8 = 12
            byte[] r5 = new byte[r8]     // Catch: java.lang.Throwable -> L62
            r5 = {x0078: FILL_ARRAY_DATA , data: [36, 61, 68, 76, 15, 117, 33, 24, 126, 111, 51, 43} // fill-array     // Catch: java.lang.Throwable -> L62
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            r2 = 0
            java.lang.Object r8 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r7.getSystemService(r8)     // Catch: java.lang.Throwable -> L62
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7     // Catch: java.lang.Throwable -> L62
            android.net.Network r8 = androidx.work.impl.constraints.trackers.a.a(r7)     // Catch: java.lang.Throwable -> L62
            android.net.NetworkCapabilities r7 = r7.getNetworkCapabilities(r8)     // Catch: java.lang.Throwable -> L62
            r8 = 4
            boolean r7 = r7.hasTransport(r8)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L4d
            java.lang.String r4 = "e8a67e"
            byte[] r5 = new byte[r10]     // Catch: java.lang.Throwable -> L62
            r7 = 37
            r5[r9] = r7     // Catch: java.lang.Throwable -> L62
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            r2 = 0
            java.lang.Object r7 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L62
            goto L5f
        L4d:
            java.lang.String r4 = "743fad"
            byte[] r5 = new byte[r10]     // Catch: java.lang.Throwable -> L62
            r7 = 118(0x76, float:1.65E-43)
            r5[r9] = r7     // Catch: java.lang.Throwable -> L62
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            r2 = 0
            java.lang.Object r7 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L62
        L5f:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L62
            return r7
        L62:
            byte[] r5 = new byte[r10]
            r7 = 119(0x77, float:1.67E-43)
            r5[r9] = r7
            r2 = 0
            java.lang.String r4 = "6d3b33"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            java.lang.Object r7 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            java.lang.String r7 = (java.lang.String) r7
            return r7
    }
}
