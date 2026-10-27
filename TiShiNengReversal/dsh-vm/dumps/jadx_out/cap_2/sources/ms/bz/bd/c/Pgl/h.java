package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class h extends ms.bz.bd.c.Pgl.pbly.pgla {
    h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r9, java.lang.String r11, java.lang.Object r12) throws java.lang.Throwable {
            r8 = this;
            java.lang.String r9 = ""
            java.util.Enumeration r10 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L6a
        L6:
            boolean r11 = r10.hasMoreElements()     // Catch: java.net.SocketException -> L6a
            if (r11 == 0) goto L69
            java.lang.Object r11 = r10.nextElement()     // Catch: java.net.SocketException -> L6a
            java.net.NetworkInterface r11 = (java.net.NetworkInterface) r11     // Catch: java.net.SocketException -> L6a
            java.util.Enumeration r12 = r11.getInetAddresses()     // Catch: java.net.SocketException -> L6a
        L16:
            boolean r0 = r12.hasMoreElements()     // Catch: java.net.SocketException -> L6a
            if (r0 == 0) goto L6
            java.lang.Object r0 = r12.nextElement()     // Catch: java.net.SocketException -> L6a
            java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch: java.net.SocketException -> L6a
            java.lang.String r1 = r11.getName()     // Catch: java.net.SocketException -> L6a
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.net.SocketException -> L6a
            if (r2 != 0) goto L16
            boolean r2 = r0.isLoopbackAddress()     // Catch: java.net.SocketException -> L6a
            if (r2 != 0) goto L16
            boolean r0 = r0 instanceof java.net.Inet4Address
            if (r0 == 0) goto L16
            java.lang.String r6 = "b89079"
            r0 = 5
            byte[] r7 = new byte[r0]     // Catch: java.net.SocketException -> L6a
            r7 = {x007e: FILL_ARRAY_DATA , data: [97, 55, 68, 65, 28} // fill-array     // Catch: java.net.SocketException -> L6a
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.net.SocketException -> L6a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.net.SocketException -> L6a
            boolean r0 = r1.startsWith(r0)     // Catch: java.net.SocketException -> L6a
            if (r0 == 0) goto L16
            java.lang.String r5 = "59fc1b"
            r10 = 17
            byte[] r6 = new byte[r10]     // Catch: java.net.SocketException -> L6a
            r6 = {x0086: FILL_ARRAY_DATA , data: [45, 53, 16, 3, 47, 113, 50, 10, 50, 32, 55, 123, 27, 22, 3, 112, 108} // fill-array     // Catch: java.net.SocketException -> L6a
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            r3 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)     // Catch: java.net.SocketException -> L6a
            r11.getName()     // Catch: java.net.SocketException -> L6a
            java.lang.String r9 = r11.getName()     // Catch: java.net.SocketException -> L6a
        L69:
            return r9
        L6a:
            r10 = 19
            byte[] r5 = new byte[r10]
            r5 = {x0094: FILL_ARRAY_DATA , data: [119, 102, 87, 85, 36, 101, 67, 68, 101, 35, 117, 112, 80, 85, 11, 116, 107, 76, 59} // fill-array
            r2 = 0
            java.lang.String r4 = "aa0a2b"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            return r9
    }
}
