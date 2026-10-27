package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class x extends ms.bz.bd.c.Pgl.pbly.pgla {
    x() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    protected final java.lang.Object b(long r8, java.lang.String r10, java.lang.Object r11) throws java.lang.Throwable {
            r7 = this;
            ms.bz.bd.c.Pgl.pblv r8 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r8 = r8.c()
            r9 = 1
            r10 = 0
            android.content.Context r8 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L68
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "4cf430"
            r11 = 4
            byte[] r5 = new byte[r11]     // Catch: java.lang.Throwable -> L68
            r5 = {x008a: FILL_ARRAY_DATA , data: [50, 104, 19, 73} // fill-array     // Catch: java.lang.Throwable -> L68
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            r2 = 0
            java.lang.Object r11 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L68
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L68
            java.lang.Object r8 = r8.getSystemService(r11)     // Catch: java.lang.Throwable -> L68
            android.net.wifi.WifiManager r8 = (android.net.wifi.WifiManager) r8     // Catch: java.lang.Throwable -> L68
            android.net.wifi.WifiInfo r8 = r8.getConnectionInfo()     // Catch: java.lang.Throwable -> L68
            java.lang.Class r11 = r8.getClass()     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "3c8e59"
            r1 = 24
            byte[] r6 = new byte[r1]     // Catch: java.lang.Throwable -> L68
            r6 = {x0090: FILL_ARRAY_DATA , data: [116, 54, 29, 68, 93, 122, 100, 27, 62, 101, 118, 48, 29, 69, 92, 122, 103, 16, 63, 96, 117, 50, 28, 66} // fill-array     // Catch: java.lang.Throwable -> L68
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L68
            byte[] r1 = ms.bz.bd.c.Pgl.pbla.a(r1)     // Catch: java.lang.Throwable -> L68
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Method r11 = r11.getDeclaredMethod(r0, r10)     // Catch: java.lang.Throwable -> L68
            r11.setAccessible(r9)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r8 = r11.invoke(r8, r10)     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L68
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L68
            java.lang.String r10 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L68
            goto L69
        L68:
        L69:
            boolean r8 = android.text.TextUtils.isEmpty(r10)
            if (r8 == 0) goto L85
            byte[] r5 = new byte[r9]
            r8 = 119(0x77, float:1.67E-43)
            r9 = 0
            r5[r9] = r8
            r2 = 0
            java.lang.String r4 = "646eb2"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            java.lang.Object r8 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L85:
            java.lang.String r8 = r10.trim()
            return r8
    }
}
