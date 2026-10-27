package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l {
    public l() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(java.util.List<java.lang.String> r11) {
            if (r11 == 0) goto L5a
            int r0 = r11.size()
            if (r0 <= 0) goto L5a
            r0 = 0
            r1 = 0
        La:
            int r2 = r11.size()
            if (r1 >= r2) goto L5a
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "ReportEventUtil:"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "ReportEventUtil"
            com.beizi.ad.lance.a.m.a(r4, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L57
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            java.lang.String r2 = com.beizi.ad.internal.h.q.a(r3, r4, r5, r6, r7, r8, r9, r10)
            com.beizi.ad.internal.i r3 = new com.beizi.ad.internal.i
            r3.<init>(r2)
            com.beizi.ad.lance.a.c r2 = com.beizi.ad.lance.a.c.b()
            java.util.concurrent.ExecutorService r2 = r2.f()
            java.lang.Void[] r4 = new java.lang.Void[r0]
            r3.executeOnExecutor(r2, r4)
        L57:
            int r1 = r1 + 1
            goto La
        L5a:
            return
    }
}
