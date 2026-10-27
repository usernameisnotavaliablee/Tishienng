package com.bytedance.adsdk.xt.xt.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae extends com.bytedance.adsdk.xt.xt.cw.j.m {
    public ae() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean j(java.lang.String r4, int r5, java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> r6) {
            r3 = this;
            r0 = 45
            char r1 = r3.j(r5, r4)
            if (r0 != r1) goto L46
            java.lang.Object r0 = r6.peek()
            r1 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = r6.peek()
            com.bytedance.adsdk.xt.xt.xt.j r6 = (com.bytedance.adsdk.xt.xt.xt.j) r6
            com.bytedance.adsdk.xt.xt.r.up r6 = r6.j()
            boolean r6 = com.bytedance.adsdk.xt.xt.r.cw.j(r6)
            if (r6 != 0) goto L20
            return r1
        L20:
            int r6 = r5 + 1
            char r6 = r3.j(r6, r4)
            boolean r6 = com.bytedance.adsdk.xt.xt.up.j.cw(r6)
            if (r6 == 0) goto L2e
            r4 = 1
            return r4
        L2e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unrecognized - symbol, not a negative number or operator, problem range:"
            r0.<init>(r2)
            java.lang.String r4 = r4.substring(r1, r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
        L46:
            char r4 = r3.j(r5, r4)
            boolean r4 = com.bytedance.adsdk.xt.xt.up.j.cw(r4)
            return r4
    }

    @Override // com.bytedance.adsdk.xt.xt.cw.j.m
    public int j(java.lang.String r5, int r6, java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> r7, com.bytedance.adsdk.xt.xt.cw.j r8) {
            r4 = this;
            boolean r0 = r4.j(r5, r6, r7)
            if (r0 != 0) goto Lb
            int r5 = r8.j(r5, r6, r7)
            return r5
        Lb:
            char r8 = r4.j(r6, r5)
            r0 = 45
            if (r8 != r0) goto L16
            int r8 = r6 + 1
            goto L17
        L16:
            r8 = r6
        L17:
            r0 = 0
        L18:
            char r1 = r4.j(r8, r5)
            boolean r2 = com.bytedance.adsdk.xt.xt.up.j.cw(r1)
            r3 = 46
            if (r2 != 0) goto L50
            if (r0 != 0) goto L29
            if (r1 != r3) goto L29
            goto L50
        L29:
            if (r1 == r3) goto L38
            java.lang.String r5 = r5.substring(r6, r8)
            com.bytedance.adsdk.xt.xt.xt.j.az r6 = new com.bytedance.adsdk.xt.xt.xt.j.az
            r6.<init>(r5)
            r7.push(r6)
            return r8
        L38:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal negative number format, problem interval:"
            r0.<init>(r1)
            java.lang.String r5 = r5.substring(r6, r8)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            throw r7
        L50:
            int r8 = r8 + 1
            if (r1 != r3) goto L18
            r0 = 1
            goto L18
    }
}
