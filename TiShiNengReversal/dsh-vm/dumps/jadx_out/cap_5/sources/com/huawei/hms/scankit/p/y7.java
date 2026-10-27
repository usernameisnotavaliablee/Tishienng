package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class y7 extends com.huawei.hms.scankit.p.t6 {
    public y7() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.CharSequence r1, java.lang.String r2, boolean r3) {
            r0 = 0
            java.util.List r1 = com.huawei.hms.scankit.p.x7.b(r1, r2, r3, r0)
            if (r1 == 0) goto L21
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Le
            goto L21
        Le:
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L21:
            java.lang.String r1 = ""
            return r1
    }

    private static void a(java.lang.String[] r3, com.huawei.hms.ml.scan.HmsScan.EventTime r4) {
            if (r3 == 0) goto L12
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L12
        L6:
            int r0 = r3.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L12
            r2 = r3[r1]
            com.huawei.hms.scankit.p.d3.a(r2, r4)
            int r1 = r1 + 1
            goto L8
        L12:
            return
    }

    private static java.lang.String[] b(java.lang.CharSequence r3, java.lang.String r4, boolean r5) {
            r0 = 0
            java.util.List r3 = com.huawei.hms.scankit.p.x7.b(r3, r4, r5, r0)
            if (r3 == 0) goto L29
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Le
            goto L29
        Le:
            int r4 = r3.size()
            java.lang.String[] r5 = new java.lang.String[r4]
            r1 = 0
        L15:
            if (r1 >= r4) goto L28
            java.lang.Object r2 = r3.get(r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            r5[r1] = r2
            int r1 = r1 + 1
            goto L15
        L28:
            return r5
        L29:
            java.lang.String[] r3 = new java.lang.String[r0]
            return r3
    }

    @Override // com.huawei.hms.scankit.p.t6
    public com.huawei.hms.ml.scan.HmsScan b(com.huawei.hms.scankit.p.s6 r21) {
            r20 = this;
            java.lang.String r0 = com.huawei.hms.scankit.p.t6.a(r21)
            java.lang.String r1 = "BEGIN:VEVENT"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto Le
            r0 = 0
            return r0
        Le:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "\n"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "SUMMARY"
            r2 = 1
            java.lang.String r4 = a(r1, r0, r2)
            java.lang.String r1 = "LOCATION"
            java.lang.String r7 = a(r1, r0, r2)
            java.lang.String r1 = "ORGANIZER"
            java.lang.String r9 = a(r1, r0, r2)
            java.lang.String r1 = "DESCRIPTION"
            java.lang.String r8 = a(r1, r0, r2)
            java.lang.String r1 = "STATUS"
            java.lang.String r10 = a(r1, r0, r2)
            java.lang.String r1 = "DTSTART"
            java.lang.String[] r1 = b(r1, r0, r2)
            java.lang.String r3 = "DTEND"
            java.lang.String[] r0 = b(r3, r0, r2)
            com.huawei.hms.ml.scan.HmsScan$EventTime r5 = new com.huawei.hms.ml.scan.HmsScan$EventTime
            r18 = 0
            java.lang.String r19 = ""
            r12 = -1
            r13 = -1
            r14 = -1
            r15 = -1
            r16 = -1
            r17 = -1
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            com.huawei.hms.ml.scan.HmsScan$EventTime r6 = new com.huawei.hms.ml.scan.HmsScan$EventTime
            java.lang.String r19 = ""
            r11 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            a(r1, r5)
            a(r0, r6)
            com.huawei.hms.ml.scan.HmsScan$EventInfo r3 = new com.huawei.hms.ml.scan.HmsScan$EventInfo
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.huawei.hms.ml.scan.HmsScan r0 = new com.huawei.hms.ml.scan.HmsScan
            r6 = r4
            java.lang.String r4 = r21.k()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = r21.c()
            int r5 = com.huawei.hms.scankit.p.t6.a(r1)
            int r7 = com.huawei.hms.ml.scan.HmsScan.EVENT_INFO_FORM
            byte[] r8 = r21.i()
            com.huawei.hms.scankit.p.u6[] r1 = r21.j()
            android.graphics.Point[] r9 = com.huawei.hms.scankit.p.t6.a(r1)
            com.huawei.hms.scankit.p.z6 r11 = new com.huawei.hms.scankit.p.z6
            r11.<init>(r3)
            r10 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
    }
}
