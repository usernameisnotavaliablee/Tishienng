package com.bytedance.adsdk.xt.xt.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.adsdk.xt.xt.cw.j.m {
    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.xt.xt.cw.j.m
    public int j(java.lang.String r5, int r6, java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> r7, com.bytedance.adsdk.xt.xt.cw.j r8) {
            r4 = this;
            char r0 = r4.j(r6, r5)
            r1 = 39
            if (r1 == r0) goto Ld
            int r5 = r8.j(r5, r6, r7)
            return r5
        Ld:
            int r8 = r6 + 1
            int r0 = r5.length()
            r2 = r8
        L14:
            if (r2 >= r0) goto L1f
            char r3 = r4.j(r2, r5)
            if (r3 == r1) goto L1f
            int r2 = r2 + 1
            goto L14
        L1f:
            char r0 = r4.j(r2, r5)
            if (r0 != r1) goto L34
            java.lang.String r5 = r5.substring(r8, r2)
            com.bytedance.adsdk.xt.xt.xt.j.kt r6 = new com.bytedance.adsdk.xt.xt.xt.j.kt
            r6.<init>(r5)
            r7.push(r6)
            int r2 = r2 + 1
            return r2
        L34:
            com.bytedance.adsdk.xt.j.j r7 = new com.bytedance.adsdk.xt.j.j
            java.lang.String r8 = "String expression not surrounded by '"
            java.lang.String r5 = r5.substring(r6)
            r7.<init>(r8, r5)
            throw r7
    }
}
