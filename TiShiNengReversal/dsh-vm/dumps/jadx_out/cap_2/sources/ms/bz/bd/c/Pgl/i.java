package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class i extends ms.bz.bd.c.Pgl.pbly.pgla {
    i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r19, java.lang.String r21, java.lang.Object r22) throws java.lang.Throwable {
            r18 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            ms.bz.bd.c.Pgl.pblv r1 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r1 = r1.c()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            java.lang.String r6 = "0c6d2b"
            r2 = 4
            byte[] r7 = new byte[r2]     // Catch: java.lang.Throwable -> L124
            r7 = {x013a: FILL_ARRAY_DATA , data: [54, 104, 67, 25} // fill-array     // Catch: java.lang.Throwable -> L124
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L124
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L124
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L124
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1     // Catch: java.lang.Throwable -> L124
            android.net.DhcpInfo r1 = r1.getDhcpInfo()     // Catch: java.lang.Throwable -> L124
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L124
            r2.<init>()     // Catch: java.lang.Throwable -> L124
            int r3 = r1.dns1     // Catch: java.lang.Throwable -> L124
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2.append(r3)     // Catch: java.lang.Throwable -> L124
            java.lang.String r8 = "6375e8"
            r3 = 1
            byte[] r9 = new byte[r3]     // Catch: java.lang.Throwable -> L124
            r10 = 0
            r11 = 105(0x69, float:1.47E-43)
            r9[r10] = r11     // Catch: java.lang.Throwable -> L124
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L124
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L124
            r2.append(r4)     // Catch: java.lang.Throwable -> L124
            int r4 = r1.dns1     // Catch: java.lang.Throwable -> L124
            int r4 = r4 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2.append(r4)     // Catch: java.lang.Throwable -> L124
            java.lang.String r16 = "2ead82"
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L124
            r5 = 109(0x6d, float:1.53E-43)
            r4[r10] = r5     // Catch: java.lang.Throwable -> L124
            r12 = 16777217(0x1000001, float:2.350989E-38)
            r13 = 0
            r14 = 0
            r17 = r4
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r12, r13, r14, r16, r17)     // Catch: java.lang.Throwable -> L124
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L124
            r2.append(r4)     // Catch: java.lang.Throwable -> L124
            int r4 = r1.dns1     // Catch: java.lang.Throwable -> L124
            int r4 = r4 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2.append(r4)     // Catch: java.lang.Throwable -> L124
            java.lang.String r16 = "80ff74"
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L124
            r5 = 103(0x67, float:1.44E-43)
            r4[r10] = r5     // Catch: java.lang.Throwable -> L124
            r12 = 16777217(0x1000001, float:2.350989E-38)
            r13 = 0
            r14 = 0
            r17 = r4
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r12, r13, r14, r16, r17)     // Catch: java.lang.Throwable -> L124
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L124
            r2.append(r4)     // Catch: java.lang.Throwable -> L124
            int r4 = r1.dns1     // Catch: java.lang.Throwable -> L124
            int r4 = r4 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2.append(r4)     // Catch: java.lang.Throwable -> L124
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L124
            r0.put(r2)     // Catch: java.lang.Throwable -> L124
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L124
            r2.<init>()     // Catch: java.lang.Throwable -> L124
            int r4 = r1.dns2     // Catch: java.lang.Throwable -> L124
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2.append(r4)     // Catch: java.lang.Throwable -> L124
            java.lang.String r16 = "1a9f16"
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L124
            r5 = 110(0x6e, float:1.54E-43)
            r4[r10] = r5     // Catch: java.lang.Throwable -> L124
            r12 = 16777217(0x1000001, float:2.350989E-38)
            r13 = 0
            r14 = 0
            r17 = r4
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r12, r13, r14, r16, r17)     // Catch: java.lang.Throwable -> L124
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L124
            r2.append(r4)     // Catch: java.lang.Throwable -> L124
            int r4 = r1.dns2     // Catch: java.lang.Throwable -> L124
            int r4 = r4 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2.append(r4)     // Catch: java.lang.Throwable -> L124
            java.lang.String r16 = "6f14c3"
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L124
            r4[r10] = r11     // Catch: java.lang.Throwable -> L124
            r12 = 16777217(0x1000001, float:2.350989E-38)
            r13 = 0
            r14 = 0
            r17 = r4
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r12, r13, r14, r16, r17)     // Catch: java.lang.Throwable -> L124
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L124
            r2.append(r4)     // Catch: java.lang.Throwable -> L124
            int r4 = r1.dns2     // Catch: java.lang.Throwable -> L124
            int r4 = r4 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2.append(r4)     // Catch: java.lang.Throwable -> L124
            java.lang.String r15 = "378d85"
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L124
            r4 = 108(0x6c, float:1.51E-43)
            r3[r10] = r4     // Catch: java.lang.Throwable -> L124
            r11 = 16777217(0x1000001, float:2.350989E-38)
            r12 = 0
            r13 = 0
            r16 = r3
            java.lang.Object r3 = com.volcengine.mobsecBiz.matrix.pgla.a(r11, r12, r13, r15, r16)     // Catch: java.lang.Throwable -> L124
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L124
            r2.append(r3)     // Catch: java.lang.Throwable -> L124
            int r1 = r1.dns2     // Catch: java.lang.Throwable -> L124
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2.append(r1)     // Catch: java.lang.Throwable -> L124
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L124
            r0.put(r1)     // Catch: java.lang.Throwable -> L124
            goto L135
        L124:
            r1 = 6
            byte[] r7 = new byte[r1]
            r7 = {x0140: FILL_ARRAY_DATA , data: [121, 58, 66, 124, 9, 121} // fill-array
            r4 = 0
            java.lang.String r6 = "e1972b"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
        L135:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
