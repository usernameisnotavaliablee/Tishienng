package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n {
    public n() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            com.beizi.ad.g r1 = com.beizi.ad.f.a()
            if (r1 == 0) goto L14
            com.beizi.ad.g r1 = com.beizi.ad.f.a()
            java.lang.String r1 = r1.d()
            goto L15
        L14:
            r1 = 0
        L15:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L1c
            return r1
        L1c:
            com.beizi.ad.g r1 = com.beizi.ad.f.a()
            if (r1 == 0) goto L34
            boolean r1 = com.beizi.ad.f.b()
            if (r1 != 0) goto L33
            com.beizi.ad.g r1 = com.beizi.ad.f.a()
            boolean r1 = r1.c()
            if (r1 == 0) goto L33
            goto L34
        L33:
            return r0
        L34:
            java.lang.String r1 = "__OAID__"
            java.lang.String r3 = com.beizi.ad.internal.h.m.b(r3, r1)
            if (r3 != 0) goto L3d
            return r0
        L3d:
            return r3
    }

    public static java.lang.String b(android.content.Context r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            com.beizi.ad.g r1 = com.beizi.ad.f.a()
            if (r1 == 0) goto L1d
            boolean r1 = com.beizi.ad.f.b()
            if (r1 != 0) goto L1c
            com.beizi.ad.g r1 = com.beizi.ad.f.a()
            boolean r1 = r1.c()
            if (r1 == 0) goto L1c
            goto L1d
        L1c:
            return r0
        L1d:
            java.lang.String r1 = "__HONOROAID__"
            java.lang.String r2 = com.beizi.ad.internal.h.m.b(r2, r1)
            if (r2 != 0) goto L26
            return r0
        L26:
            return r2
    }
}
