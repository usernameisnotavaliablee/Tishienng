package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class qv {
    private static final java.lang.String j = null;
    private java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.String>> xt;


    private static class j {
        private static com.bytedance.msdk.core.tl.qv j;

        static {
                com.bytedance.msdk.core.tl.qv r0 = new com.bytedance.msdk.core.tl.qv
                r1 = 0
                r0.<init>(r1)
                com.bytedance.msdk.core.tl.qv.j.j = r0
                return
        }

        public j() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.bytedance.msdk.core.tl.qv j() {
                com.bytedance.msdk.core.tl.qv r0 = com.bytedance.msdk.core.tl.qv.j.j
                return r0
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TTMediationSDK_"
            r0.<init>(r1)
            java.lang.Class<com.bytedance.msdk.core.tl.qv> r1 = com.bytedance.msdk.core.tl.qv.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.core.tl.qv.j = r0
            return
    }

    private qv() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.xt = r0
            return
    }

    /* synthetic */ qv(com.bytedance.msdk.core.tl.qv.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.bytedance.msdk.core.tl.ae j(com.bytedance.msdk.core.tl.qv r0, java.lang.String r1, java.lang.String r2) {
            com.bytedance.msdk.core.tl.ae r0 = r0.r(r1, r2)
            return r0
    }

    public static com.bytedance.msdk.core.tl.qv j() {
            com.bytedance.msdk.core.tl.qv r0 = com.bytedance.msdk.core.tl.qv.j.j()
            return r0
    }

    private void j(com.bytedance.msdk.core.tl.ae r2, java.lang.String r3, int r4) {
            r1 = this;
            com.bytedance.msdk.core.tl.tl r0 = com.bytedance.msdk.core.tl.tl.j()
            r0.j(r2, r3, r4)
            return
    }

    private void j(com.bytedance.msdk.core.tl.ae r2, java.lang.String r3, long r4) {
            r1 = this;
            com.bytedance.msdk.core.tl.tl r0 = com.bytedance.msdk.core.tl.tl.j()
            r0.j(r2, r3, r4)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.tl.qv r0, com.bytedance.msdk.core.tl.ae r1, java.lang.String r2, int r3) {
            r0.j(r1, r2, r3)
            return
    }

    private com.bytedance.msdk.core.tl.ae r(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.bytedance.msdk.core.tl.tl r0 = com.bytedance.msdk.core.tl.tl.j()
            com.bytedance.msdk.core.tl.ae r2 = r0.xt(r2, r3)
            return r2
    }

    static /* synthetic */ java.lang.String xt() {
            java.lang.String r0 = com.bytedance.msdk.core.tl.qv.j
            return r0
    }

    public boolean cw(java.lang.String r13, java.lang.String r14) {
            r12 = this;
            java.lang.String r0 = com.bytedance.msdk.core.tl.qv.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "adn checkFreqctl ritId = "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r3 = " adnSlotId = "
            r1.append(r3)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            com.bytedance.msdk.core.tl.ae r0 = r12.r(r13, r14)
            if (r0 == 0) goto L142
            boolean r1 = r0.tl()
            if (r1 == 0) goto L142
            java.util.List r1 = r0.qv()
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L142
            java.lang.Object r4 = r1.next()
            com.bytedance.msdk.core.tl.up r4 = (com.bytedance.msdk.core.tl.up) r4
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            java.lang.String r6 = com.bytedance.msdk.core.tl.qv.j
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            r7.append(r13)
            r7.append(r3)
            r7.append(r14)
            java.lang.String r8 = "  date = "
            r7.append(r8)
            long r8 = r5.getTime()
            r7.append(r8)
            java.lang.String r8 = " item.getEffectiveTime() = "
            r7.append(r8)
            long r8 = r4.r()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.j(r6, r7)
            long r7 = r5.getTime()
            long r9 = r4.r()
            r5 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L115
            int r7 = r4.up()
            int r8 = r4.j()
            java.lang.String r9 = " count = "
            java.lang.String r10 = " ruleId = "
            if (r7 >= r8) goto Lb7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "adn checkFreqctl 未到上线可以展示 ritId = "
            r5.<init>(r7)
            r5.append(r13)
            r5.append(r3)
            r5.append(r14)
            r5.append(r10)
            java.lang.String r7 = r4.cw()
            r5.append(r7)
            r5.append(r9)
            int r4 = r4.up()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.bytedance.msdk.j.up.cw.j(r6, r4)
            goto L2f
        Lb7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "adn checkFreqctl 到了上线不可以展示 ritId = "
            r0.<init>(r1)
            r0.append(r13)
            r0.append(r3)
            r0.append(r14)
            r0.append(r10)
            java.lang.String r1 = r4.cw()
            r0.append(r1)
            r0.append(r9)
            int r1 = r4.up()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r6, r0)
            java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.String>> r0 = r12.xt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            java.lang.String r13 = "_"
            r1.append(r13)
            r1.append(r14)
            java.lang.String r13 = r1.toString()
            android.util.Pair r14 = new android.util.Pair
            java.lang.String r1 = r4.cw()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r4.up()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r14.<init>(r1, r2)
            r0.put(r13, r14)
            return r5
        L115:
            java.lang.String r7 = r4.cw()
            r12.j(r0, r7, r5)
            java.lang.String r5 = r4.cw()
            long r7 = r4.xt()
            long r7 = com.bytedance.msdk.core.tl.m.j(r7)
            r12.j(r0, r5, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "adn checkFreqctl 有效期外计数需要清0，过期时间需要更新 = "
            r5.<init>(r7)
            java.lang.String r4 = r4.cw()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.bytedance.msdk.j.up.cw.j(r6, r4)
            goto L2f
        L142:
            r13 = 1
            return r13
    }

    public void delete(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.bytedance.msdk.core.tl.tl r0 = com.bytedance.msdk.core.tl.tl.j()
            r0.j(r2, r3)
            return
    }

    public android.util.Pair<java.lang.String, java.lang.String> j(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.String>> r0 = r2.xt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.Object r3 = r0.get(r3)
            android.util.Pair r3 = (android.util.Pair) r3
            return r3
    }

    public boolean j(com.bytedance.msdk.core.tl.ae r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r6.xt()
            java.lang.String r2 = r6.cw()
            com.bytedance.msdk.core.tl.ae r1 = r5.r(r1, r2)
            r2 = 1
            if (r1 != 0) goto L1b
            java.lang.String r6 = com.bytedance.msdk.core.tl.qv.j
            java.lang.String r0 = "adn freqctl 规则为空直接存储"
            com.bytedance.msdk.j.up.cw.j(r6, r0)
            return r2
        L1b:
            java.lang.String r3 = r6.m()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L38
            java.lang.String r6 = com.bytedance.msdk.core.tl.qv.j
            java.lang.String r2 = "adn freqctl version 为空 清空本地数据 "
            com.bytedance.msdk.j.up.cw.j(r6, r2)
            java.lang.String r6 = r1.xt()
            java.lang.String r1 = r1.cw()
            r5.delete(r6, r1)
            return r0
        L38:
            java.lang.String r3 = r1.m()
            java.lang.String r4 = r6.m()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L63
            java.lang.String r6 = com.bytedance.msdk.core.tl.qv.j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "adn freqctl version 一致 version = "
            r2.<init>(r3)
            java.lang.String r1 = r1.m()
            r2.append(r1)
            java.lang.String r1 = " 无需处理"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r6, r1)
            return r0
        L63:
            java.lang.String r0 = com.bytedance.msdk.core.tl.qv.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "adn freqctl version不一致，缓存新规则 old version = "
            r3.<init>(r4)
            java.lang.String r1 = r1.m()
            r3.append(r1)
            java.lang.String r1 = "  new version "
            r3.append(r1)
            java.lang.String r6 = r6.m()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r6)
            return r2
    }

    public void xt(com.bytedance.msdk.core.tl.ae r2) {
            r1 = this;
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()
            r0.xt(r2)
            return
    }

    public void xt(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.bytedance.msdk.core.tl.qv$1 r0 = new com.bytedance.msdk.core.tl.qv$1
            r0.<init>(r1, r2, r3)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }
}
