package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class vl {
    private static final java.lang.String j = null;
    private java.util.Map<java.lang.String, java.lang.Long> xt;


    private static class j {
        private static com.bytedance.msdk.core.tl.vl j;

        static {
                com.bytedance.msdk.core.tl.vl r0 = new com.bytedance.msdk.core.tl.vl
                r1 = 0
                r0.<init>(r1)
                com.bytedance.msdk.core.tl.vl.j.j = r0
                return
        }

        public j() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.bytedance.msdk.core.tl.vl j() {
                com.bytedance.msdk.core.tl.vl r0 = com.bytedance.msdk.core.tl.vl.j.j
                return r0
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TTMediationSDK_"
            r0.<init>(r1)
            java.lang.Class<com.bytedance.msdk.core.tl.vl> r1 = com.bytedance.msdk.core.tl.vl.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.core.tl.vl.j = r0
            return
    }

    private vl() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.xt = r0
            return
    }

    /* synthetic */ vl(com.bytedance.msdk.core.tl.vl.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bytedance.msdk.core.tl.vl j() {
            com.bytedance.msdk.core.tl.vl r0 = com.bytedance.msdk.core.tl.vl.j.j()
            return r0
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.tl.vl r0, java.lang.String r1, java.lang.String r2, long r3) {
            r0.j(r1, r2, r3)
            return
    }

    private void j(java.lang.String r2, java.lang.String r3, long r4) {
            r1 = this;
            com.bytedance.msdk.core.tl.oq r0 = com.bytedance.msdk.core.tl.oq.j()
            r0.j(r2, r3, r4)
            return
    }

    static /* synthetic */ java.lang.String xt() {
            java.lang.String r0 = com.bytedance.msdk.core.tl.vl.j
            return r0
    }

    public boolean cw(java.lang.String r13, java.lang.String r14) {
            r12 = this;
            java.lang.String r0 = com.bytedance.msdk.core.tl.vl.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "adn checkPacing ritId = "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r2 = " adnSlotId = "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            com.bytedance.msdk.core.tl.g r1 = r12.r(r13, r14)
            r2 = 1
            if (r1 == 0) goto La1
            boolean r3 = r1.tl()
            if (r3 == 0) goto La1
            boolean r3 = r1.vl()
            if (r3 == 0) goto La1
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            long r3 = r3.getTime()
            long r5 = r1.qv()
            long r7 = r1.qv()
            long r9 = r1.g()
            long r7 = r7 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "adn checkPacing currentTime = "
            r9.<init>(r10)
            java.lang.String r10 = com.bytedance.msdk.core.tl.m.xt(r3)
            r9.append(r10)
            java.lang.String r10 = " showTime = "
            r9.append(r10)
            java.lang.String r10 = com.bytedance.msdk.core.tl.m.xt(r5)
            r9.append(r10)
            java.lang.String r10 = " pacingBean.getPacing() = "
            r9.append(r10)
            long r10 = r1.g()
            r9.append(r10)
            java.lang.String r1 = " pacingTime = "
            r9.append(r1)
            java.lang.String r1 = com.bytedance.msdk.core.tl.m.xt(r7)
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto La1
            java.util.Map<java.lang.String, java.lang.Long> r0 = r12.xt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            java.lang.String r13 = "_"
            r1.append(r13)
            r1.append(r14)
            java.lang.String r13 = r1.toString()
            long r3 = r3 - r5
            java.lang.Long r14 = java.lang.Long.valueOf(r3)
            r0.put(r13, r14)
            r13 = 0
            return r13
        La1:
            return r2
    }

    public void delete(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.bytedance.msdk.core.tl.oq r0 = com.bytedance.msdk.core.tl.oq.j()
            r0.j(r2, r3)
            return
    }

    public long j(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r2.xt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 != 0) goto L21
            r3 = -2
            return r3
        L21:
            long r3 = r3.longValue()
            return r3
    }

    public boolean j(com.bytedance.msdk.core.tl.g r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r6.xt()
            java.lang.String r2 = r6.cw()
            com.bytedance.msdk.core.tl.g r1 = r5.r(r1, r2)
            r2 = 1
            if (r1 != 0) goto L1b
            java.lang.String r6 = com.bytedance.msdk.core.tl.vl.j
            java.lang.String r0 = "adn pacing 规则为空直接存储"
            com.bytedance.msdk.j.up.cw.j(r6, r0)
            return r2
        L1b:
            java.lang.String r3 = r6.oq()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L38
            java.lang.String r1 = com.bytedance.msdk.core.tl.vl.j
            java.lang.String r2 = "adn pacing ruleId 为空 清空本地数据 "
            com.bytedance.msdk.j.up.cw.j(r1, r2)
            java.lang.String r1 = r6.xt()
            java.lang.String r6 = r6.cw()
            r5.delete(r1, r6)
            return r0
        L38:
            java.lang.String r3 = r1.oq()
            java.lang.String r4 = r6.oq()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L63
            java.lang.String r6 = com.bytedance.msdk.core.tl.vl.j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "adn pacing ruleId 一致 ruleId = "
            r2.<init>(r3)
            java.lang.String r1 = r1.oq()
            r2.append(r1)
            java.lang.String r1 = " 无需处理"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r6, r1)
            return r0
        L63:
            java.lang.String r0 = com.bytedance.msdk.core.tl.vl.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "adn pacing ruleId不一致，缓存新规则 old ruleId = "
            r3.<init>(r4)
            java.lang.String r1 = r1.oq()
            r3.append(r1)
            java.lang.String r1 = "  new ruleId = "
            r3.append(r1)
            java.lang.String r1 = r6.oq()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            java.lang.String r0 = r6.xt()
            java.lang.String r6 = r6.cw()
            r5.delete(r0, r6)
            return r2
    }

    public com.bytedance.msdk.core.tl.g r(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.bytedance.msdk.core.tl.oq r0 = com.bytedance.msdk.core.tl.oq.j()
            com.bytedance.msdk.core.tl.g r2 = r0.xt(r2, r3)
            return r2
    }

    public void xt(com.bytedance.msdk.core.tl.g r2) {
            r1 = this;
            com.bytedance.msdk.core.tl.oq r0 = com.bytedance.msdk.core.tl.oq.j()
            r0.j(r2)
            return
    }

    public void xt(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.bytedance.msdk.core.tl.vl$1 r0 = new com.bytedance.msdk.core.tl.vl$1
            r0.<init>(r1, r2, r3)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }
}
