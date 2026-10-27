package xyz.adscope.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class g {
    private final java.util.LinkedList<xyz.adscope.common.f> a;

    g(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.util.List<xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel> r7, xyz.adscope.common.f.c r8) {
            r3 = this;
            r3.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r3.a = r0
            java.util.Collections.reverse(r7)
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
        L12:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r7.next()
            xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r1 = (xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel) r1
            xyz.adscope.common.f r2 = new xyz.adscope.common.f
            r2.<init>(r4, r5, r6)
            r2.a(r8)
            r2.a(r1)
            if (r0 == 0) goto L2e
            r2.d(r0)
        L2e:
            java.util.LinkedList<xyz.adscope.common.f> r0 = r3.a
            r0.addFirst(r2)
            r0 = r2
            goto L12
        L35:
            return
    }

    void a(xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog r2) {
            r1 = this;
            java.util.LinkedList<xyz.adscope.common.f> r0 = r1.a
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.getFirst()
            if (r0 == 0) goto L15
            java.util.LinkedList<xyz.adscope.common.f> r0 = r1.a
            java.lang.Object r0 = r0.getFirst()
            xyz.adscope.common.f r0 = (xyz.adscope.common.f) r0
            r0.c(r2)
        L15:
            return
    }
}
