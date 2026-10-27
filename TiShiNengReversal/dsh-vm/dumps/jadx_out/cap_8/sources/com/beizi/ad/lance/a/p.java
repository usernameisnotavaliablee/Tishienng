package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class p {
    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(int r3) {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1 = 100
            int r0 = r0.nextInt(r1)
            float r0 = (float) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ratio = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = ",ratioCheckNum = "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "BeiZisAd"
            com.beizi.ad.lance.a.m.c(r2, r1)
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L31
            r3 = 1
            return r3
        L31:
            r3 = 0
            return r3
    }
}
