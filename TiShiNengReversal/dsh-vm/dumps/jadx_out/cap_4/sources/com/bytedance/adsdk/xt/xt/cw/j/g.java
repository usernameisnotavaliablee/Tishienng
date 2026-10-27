package com.bytedance.adsdk.xt.xt.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g extends com.bytedance.adsdk.xt.xt.cw.j.m {
    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.xt.xt.cw.j.m
    public int j(java.lang.String r7, int r8, java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> r9, com.bytedance.adsdk.xt.xt.cw.j r10) {
            r6 = this;
            r0 = 41
            char r1 = r6.j(r8, r7)
            if (r0 == r1) goto Ld
            int r7 = r10.j(r7, r8, r9)
            return r7
        Ld:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
        L12:
            java.lang.Object r0 = r9.pollFirst()
            com.bytedance.adsdk.xt.xt.xt.j r0 = (com.bytedance.adsdk.xt.xt.xt.j) r0
            if (r0 == 0) goto L2e
            com.bytedance.adsdk.xt.xt.r.up r1 = r0.j()
            com.bytedance.adsdk.xt.xt.r.xt r2 = com.bytedance.adsdk.xt.xt.r.xt.j
            if (r1 == r2) goto L2e
            com.bytedance.adsdk.xt.xt.r.up r1 = r0.j()
            com.bytedance.adsdk.xt.xt.r.r r2 = com.bytedance.adsdk.xt.xt.r.r.j
            if (r1 == r2) goto L2e
            r10.addFirst(r0)
            goto L12
        L2e:
            if (r0 == 0) goto L97
            com.bytedance.adsdk.xt.xt.r.up r1 = r0.j()
            com.bytedance.adsdk.xt.xt.r.xt r2 = com.bytedance.adsdk.xt.xt.r.xt.j
            if (r1 != r2) goto L8d
            com.bytedance.adsdk.xt.xt.xt.j.oq r0 = (com.bytedance.adsdk.xt.xt.xt.j.oq) r0
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L48:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r10.next()
            com.bytedance.adsdk.xt.xt.xt.j r3 = (com.bytedance.adsdk.xt.xt.xt.j) r3
            com.bytedance.adsdk.xt.xt.r.up r4 = r3.j()
            com.bytedance.adsdk.xt.xt.r.r r5 = com.bytedance.adsdk.xt.xt.r.r.up
            if (r4 != r5) goto L67
            com.bytedance.adsdk.xt.xt.xt.j r3 = com.bytedance.adsdk.xt.xt.up.xt.j(r2, r7, r8)
            r1.add(r3)
            r2.clear()
            goto L48
        L67:
            r2.addLast(r3)
            goto L48
        L6b:
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto L78
            com.bytedance.adsdk.xt.xt.xt.j r7 = com.bytedance.adsdk.xt.xt.up.xt.j(r2, r7, r8)
            r1.add(r7)
        L78:
            int r7 = r1.size()
            com.bytedance.adsdk.xt.xt.xt.j[] r7 = new com.bytedance.adsdk.xt.xt.xt.j[r7]
            java.lang.Object[] r7 = r1.toArray(r7)
            com.bytedance.adsdk.xt.xt.xt.j[] r7 = (com.bytedance.adsdk.xt.xt.xt.j[]) r7
            r0.j(r7)
            int r8 = r8 + 1
            r9.push(r0)
            return r8
        L8d:
            com.bytedance.adsdk.xt.xt.xt.j r7 = com.bytedance.adsdk.xt.xt.up.xt.j(r10, r7, r8)
            r9.push(r7)
            int r8 = r8 + 1
            return r8
        L97:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r10 = 0
            java.lang.String r7 = r7.substring(r10, r8)
            r9.<init>(r7)
            throw r9
    }
}
