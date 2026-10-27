package com.bytedance.adsdk.xt.xt.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tl extends com.bytedance.adsdk.xt.xt.cw.j.m {
    public tl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.xt.xt.cw.j.m
    public int j(java.lang.String r7, int r8, java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> r9, com.bytedance.adsdk.xt.xt.cw.j r10) {
            r6 = this;
            char r0 = r6.j(r8, r7)
            boolean r0 = com.bytedance.adsdk.xt.xt.up.j.r(r0)
            if (r0 != 0) goto Lf
            int r7 = r10.j(r7, r8, r9)
            return r7
        Lf:
            java.lang.String r10 = new java.lang.String
            char r0 = r6.j(r8, r7)
            int r1 = r8 + 1
            char r2 = r6.j(r1, r7)
            r3 = 2
            char[] r4 = new char[r3]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r2
            r10.<init>(r4)
            com.bytedance.adsdk.xt.xt.r.cw r0 = com.bytedance.adsdk.xt.xt.r.cw.j(r10)
            if (r0 == 0) goto L3b
            com.bytedance.adsdk.xt.xt.xt.j.av r7 = new com.bytedance.adsdk.xt.xt.xt.j.av
            com.bytedance.adsdk.xt.xt.r.cw r10 = com.bytedance.adsdk.xt.xt.r.cw.j(r10)
            r7.<init>(r10)
            r9.push(r7)
            int r8 = r8 + r3
            return r8
        L3b:
            char r10 = r6.j(r8, r7)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            com.bytedance.adsdk.xt.xt.r.cw r0 = com.bytedance.adsdk.xt.xt.r.cw.j(r10)
            if (r0 == 0) goto L56
            com.bytedance.adsdk.xt.xt.xt.j.av r7 = new com.bytedance.adsdk.xt.xt.xt.j.av
            com.bytedance.adsdk.xt.xt.r.cw r8 = com.bytedance.adsdk.xt.xt.r.cw.j(r10)
            r7.<init>(r8)
            r9.push(r7)
            return r1
        L56:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unrecognized:"
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = "examine:"
            r0.append(r10)
            java.lang.String r7 = r7.substring(r5, r8)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r9.<init>(r7)
            throw r9
    }
}
