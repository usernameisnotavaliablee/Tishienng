package com.bytedance.msdk.cw.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class oq extends com.bytedance.msdk.cw.cw.j.xt {
    private final java.util.List<com.bytedance.msdk.core.oq.oq> ae;

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.msdk.core.oq.xt f2307m;
    private final java.util.HashSet<java.lang.String> tl;
    private final com.bytedance.msdk.cw.m.j.xt up;

    public oq(com.bytedance.msdk.cw.m.j.xt r2, com.bytedance.msdk.core.oq.xt r3, java.util.List<com.bytedance.msdk.core.oq.oq> r4) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.tl = r0
            r1.up = r2
            r1.f2307m = r3
            r1.ae = r4
            return
    }

    private com.bytedance.msdk.core.oq.oq m() {
            r5 = this;
            java.util.List<com.bytedance.msdk.core.oq.oq> r0 = r5.ae
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            if (r2 == 0) goto La
            java.lang.String r3 = r2.w()
            java.util.HashSet<java.lang.String> r4 = r5.tl
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto La
            return r2
        L25:
            return r1
    }

    @Override // com.bytedance.msdk.cw.cw.j.xt
    public boolean xt(com.bytedance.msdk.core.oq.oq r5, int r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r6 != r1) goto L1e
            com.bytedance.msdk.core.oq.oq r6 = r4.m()
            if (r6 == 0) goto Lf3
            if (r5 == 0) goto Lf3
            java.lang.String r6 = r6.w()
            java.lang.String r5 = r5.w()
            boolean r5 = android.text.TextUtils.equals(r6, r5)
            if (r5 == 0) goto Lf3
            r4.cw()
            return r1
        L1e:
            r2 = 2
            java.lang.String r3 = "TTMediationSDK"
            if (r6 != r2) goto L9b
            if (r5 == 0) goto L5e
            java.util.HashSet<java.lang.String> r6 = r4.tl
            java.lang.String r5 = r5.w()
            r6.add(r5)
            com.bytedance.msdk.cw.m.j.xt r5 = r4.up
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.tl()
            if (r5 == 0) goto L43
            int r6 = r5.size()
            if (r6 <= 0) goto L43
            java.lang.Object r5 = r5.get(r0)
            com.bytedance.msdk.xt.cw r5 = (com.bytedance.msdk.xt.cw) r5
            goto L44
        L43:
            r5 = 0
        L44:
            if (r5 == 0) goto L5e
            com.bytedance.msdk.core.oq.oq r6 = r4.m()
            if (r6 == 0) goto L5e
            java.lang.String r6 = r6.w()
            java.lang.String r5 = r5.qa()
            boolean r5 = android.text.TextUtils.equals(r6, r5)
            if (r5 == 0) goto L5e
            r4.cw()
            return r1
        L5e:
            com.bytedance.msdk.cw.m.j.j r5 = r4.xt
            boolean r5 = r5.tl()
            if (r5 == 0) goto Lf3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.bytedance.msdk.core.oq.xt r6 = r4.f2307m
            java.lang.String r6 = com.bytedance.msdk.j.up.up.j(r6)
            r5.append(r6)
            java.lang.String r6 = "全部广告完成响应..."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.bytedance.msdk.j.up.cw.r(r3, r5)
            com.bytedance.msdk.cw.m.j.xt r5 = r4.up
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.tl()
            boolean r5 = com.bytedance.msdk.tl.p.j(r5)
            if (r5 == 0) goto L9a
            com.bytedance.msdk.api.j r5 = new com.bytedance.msdk.api.j
            r6 = 20005(0x4e25, float:2.8033E-41)
            java.lang.String r0 = com.bytedance.msdk.api.j.j(r6)
            r5.<init>(r6, r0)
            r4.j(r5)
        L9a:
            return r1
        L9b:
            com.bytedance.msdk.cw.m.j.j r5 = r4.xt
            boolean r5 = r5.up()
            if (r5 == 0) goto Lf3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.bytedance.msdk.core.oq.xt r6 = r4.f2307m
            java.lang.String r6 = com.bytedance.msdk.j.up.up.j(r6)
            r5.append(r6)
            java.lang.String r6 = "触发总超时或全部代码位响应结束.....totalTimeout："
            r5.append(r6)
            com.bytedance.msdk.cw.m.j.j r6 = r4.xt
            boolean r6 = r6.up()
            r5.append(r6)
            java.lang.String r6 = "  allWtfFinish:"
            r5.append(r6)
            com.bytedance.msdk.cw.m.j.j r6 = r4.xt
            boolean r6 = r6.tl()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.bytedance.msdk.j.up.cw.r(r3, r5)
            com.bytedance.msdk.cw.m.j.xt r5 = r4.up
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.tl()
            boolean r5 = com.bytedance.msdk.tl.p.j(r5)
            if (r5 != 0) goto Le4
            r4.cw()
            goto Lf2
        Le4:
            com.bytedance.msdk.api.j r5 = new com.bytedance.msdk.api.j
            r6 = 10003(0x2713, float:1.4017E-41)
            java.lang.String r0 = com.bytedance.msdk.api.j.j(r6)
            r5.<init>(r6, r0)
            r4.j(r5)
        Lf2:
            return r1
        Lf3:
            return r0
    }
}
