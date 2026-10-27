package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h1 {
    private java.util.List<com.huawei.hms.hatool.f> a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;

    public h1(java.util.List<com.huawei.hms.hatool.f> r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    private void b(java.util.List<com.huawei.hms.hatool.f> r13, java.lang.String r14, java.lang.String r15) {
            r12 = this;
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L8
            goto L85
        L8:
            int r0 = r13.size()
            int r0 = r0 / 500
            int r0 = r0 + 1
            r1 = 0
        L11:
            if (r1 >= r0) goto L85
            int r2 = r1 * 500
            int r3 = r13.size()
            int r4 = r2 + 500
            int r3 = java.lang.Math.min(r3, r4)
            java.util.List r2 = r13.subList(r2, r3)
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "-"
            java.lang.String r5 = ""
            java.lang.String r11 = r3.replace(r4, r5)
            long r3 = java.lang.System.currentTimeMillis()
            int r5 = com.huawei.hms.hatool.c.c(r15, r14)
            long r5 = (long) r5
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 * r7
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r2 = r2.iterator()
        L4a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L64
            java.lang.Object r7 = r2.next()
            com.huawei.hms.hatool.f r7 = (com.huawei.hms.hatool.f) r7
            java.lang.String r8 = r7.d()
            boolean r8 = com.huawei.hms.hatool.h.d(r8, r3, r5)
            if (r8 != 0) goto L4a
            r10.add(r7)
            goto L4a
        L64:
            int r2 = r10.size()
            if (r2 <= 0) goto L77
            com.huawei.hms.hatool.j0 r6 = new com.huawei.hms.hatool.j0
            java.lang.String r9 = r12.d
            r8 = r14
            r7 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            r6.b()
            goto L80
        L77:
            r8 = r14
            r7 = r15
            java.lang.String r14 = "hmsSdk"
            java.lang.String r15 = "No data to report handler"
            com.huawei.hms.hatool.j1.l(r14, r15)
        L80:
            int r1 = r1 + 1
            r15 = r7
            r14 = r8
            goto L11
        L85:
            return
    }

    public void a() {
            r13 = this;
            java.lang.String r0 = r13.c
            java.lang.String r1 = "_default_config_tag"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L78
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List<com.huawei.hms.hatool.f> r5 = r13.a
            java.util.Iterator r5 = r5.iterator()
        L24:
            boolean r6 = r5.hasNext()
            java.lang.String r7 = "diffprivacy"
            java.lang.String r8 = "preins"
            java.lang.String r9 = "maint"
            java.lang.String r10 = "oper"
            if (r6 == 0) goto L6b
            java.lang.Object r6 = r5.next()
            com.huawei.hms.hatool.f r6 = (com.huawei.hms.hatool.f) r6
            java.lang.String r11 = r6.f()
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L67
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L49
            goto L67
        L49:
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L53
            r0.add(r6)
            goto L24
        L53:
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L5d
            r2.add(r6)
            goto L24
        L5d:
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L24
            r3.add(r6)
            goto L24
        L67:
            r4.add(r6)
            goto L24
        L6b:
            r13.b(r4, r10, r1)
            r13.b(r0, r9, r1)
            r13.b(r2, r8, r1)
            r13.b(r3, r7, r1)
            return
        L78:
            java.util.List<com.huawei.hms.hatool.f> r0 = r13.a
            java.lang.String r1 = r13.c
            java.lang.String r2 = r13.b
            r13.b(r0, r1, r2)
            return
    }
}
