package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class q7 extends com.amap.api.col.p0003l.r7 {
    public q7() {
            r0 = this;
            r0.<init>()
            return
    }

    public q7(com.amap.api.col.p0003l.r7 r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.amap.api.col.p0003l.r7
    protected final byte[] b(byte[] r5) {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyyMMdd HHmmss"
            r1.<init>(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r1 = r1.format(r2)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r0.append(r1)
            int r1 = r0.length()
            r2 = 53
            r3 = 0
            if (r1 == r2) goto L37
            byte[] r5 = new byte[r3]
            return r5
        L37:
            java.lang.String r0 = r0.toString()
            byte[] r0 = com.amap.api.col.p0003l.q4.o(r0)
            int r1 = r0.length
            int r2 = r5.length
            int r1 = r1 + r2
            byte[] r1 = new byte[r1]
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r0.length
            int r2 = r5.length
            java.lang.System.arraycopy(r5, r3, r1, r0, r2)
            return r1
    }
}
