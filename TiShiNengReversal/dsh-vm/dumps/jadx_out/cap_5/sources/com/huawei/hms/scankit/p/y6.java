package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class y6 {
    public y6() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.huawei.hms.ml.scan.HmsScan a(com.huawei.hms.scankit.p.s6 r10) {
            if (r10 != 0) goto L4
            r10 = 0
            return r10
        L4:
            boolean r0 = com.huawei.hms.scankit.p.r3.f
            if (r0 == 0) goto Lf
            com.huawei.hms.ml.scan.HmsScan r0 = com.huawei.hms.scankit.p.v5.a(r10)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            com.huawei.hms.ml.scan.HmsScan r1 = new com.huawei.hms.ml.scan.HmsScan
            java.lang.String r2 = r10.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = r10.c()
            int r3 = com.huawei.hms.scankit.p.t6.a(r0)
            java.lang.String r4 = r10.k()
            int r5 = com.huawei.hms.ml.scan.HmsScan.PURE_TEXT_FORM
            byte[] r6 = r10.i()
            com.huawei.hms.scankit.p.u6[] r0 = r10.j()
            android.graphics.Point[] r7 = com.huawei.hms.scankit.p.t6.a(r0)
            r8 = 0
            r9 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            float r10 = r10.l()
            double r2 = (double) r10
            com.huawei.hms.ml.scan.HmsScan r10 = r1.setZoomValue(r2)
            return r10
    }

    public static com.huawei.hms.ml.scan.HmsScan[] a(com.huawei.hms.scankit.p.s6[] r3) {
            r0 = 0
            if (r3 == 0) goto L19
            int r1 = r3.length
            if (r1 > 0) goto L7
            goto L19
        L7:
            int r1 = r3.length
            com.huawei.hms.ml.scan.HmsScan[] r1 = new com.huawei.hms.ml.scan.HmsScan[r1]
        La:
            int r2 = r3.length
            if (r0 >= r2) goto L18
            r2 = r3[r0]
            com.huawei.hms.ml.scan.HmsScan r2 = a(r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto La
        L18:
            return r1
        L19:
            com.huawei.hms.ml.scan.HmsScan[] r3 = new com.huawei.hms.ml.scan.HmsScan[r0]
            return r3
    }
}
