package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class jy {
    private java.util.Map<java.lang.String, java.lang.Long> j;
    private java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.String>> xt;



    private static class j {
        private static com.bytedance.msdk.core.tl.jy j;

        static {
                com.bytedance.msdk.core.tl.jy r0 = new com.bytedance.msdk.core.tl.jy
                r1 = 0
                r0.<init>(r1)
                com.bytedance.msdk.core.tl.jy.j.j = r0
                return
        }

        public j() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.bytedance.msdk.core.tl.jy j() {
                com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j.j
                return r0
        }
    }

    private jy() {
            r0 = this;
            r0.<init>()
            r0.xt()
            return
    }

    /* synthetic */ jy(com.bytedance.msdk.core.tl.jy.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bytedance.msdk.core.tl.jy j() {
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j.j()
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

    static /* synthetic */ void j(com.bytedance.msdk.core.tl.jy r0, com.bytedance.msdk.core.tl.ae r1, java.lang.String r2, int r3) {
            r0.j(r1, r2, r3)
            return
    }

    public void ae(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.core.tl.jy$2 r0 = new com.bytedance.msdk.core.tl.jy$2
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    public boolean cw(java.lang.String r12) {
            r11 = this;
            com.bytedance.msdk.core.tl.g r0 = r11.up(r12)
            r1 = 1
            if (r0 == 0) goto L74
            boolean r2 = r0.tl()
            if (r2 == 0) goto L74
            boolean r2 = r0.vl()
            if (r2 == 0) goto L74
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r2 = r2.getTime()
            long r4 = r0.qv()
            long r6 = r0.qv()
            long r8 = r0.g()
            long r6 = r6 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "checkPacing currentTime = "
            r8.<init>(r9)
            java.lang.String r9 = com.bytedance.msdk.core.tl.m.xt(r2)
            r8.append(r9)
            java.lang.String r9 = " showTime = "
            r8.append(r9)
            java.lang.String r9 = com.bytedance.msdk.core.tl.m.xt(r4)
            r8.append(r9)
            java.lang.String r9 = " pacingBean.getPacing() = "
            r8.append(r9)
            long r9 = r0.g()
            r8.append(r9)
            java.lang.String r0 = " pacingTime = "
            r8.append(r0)
            java.lang.String r0 = com.bytedance.msdk.core.tl.m.xt(r6)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            java.lang.String r8 = "TTMediationSDK_IntervalShowControl"
            com.bytedance.msdk.j.up.cw.j(r8, r0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L74
            java.util.Map<java.lang.String, java.lang.Long> r0 = r11.j
            long r2 = r2 - r4
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0.put(r12, r1)
            r12 = 0
            return r12
        L74:
            return r1
    }

    public void g(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.core.tl.tl r0 = com.bytedance.msdk.core.tl.tl.j()
            r0.j(r2)
            return
    }

    public long j(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r2.j
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 != 0) goto Ld
            r0 = -2
            return r0
        Ld:
            long r0 = r3.longValue()
            return r0
    }

    public void j(java.lang.String r2, long r3) {
            r1 = this;
            com.bytedance.msdk.core.tl.oq r0 = com.bytedance.msdk.core.tl.oq.j()
            r0.j(r2, r3)
            return
    }

    public boolean j(com.bytedance.msdk.core.tl.ae r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r7.xt()
            com.bytedance.msdk.core.tl.ae r1 = r6.oq(r1)
            r2 = 1
            java.lang.String r3 = "TTMediationSDK_IntervalShowControl"
            if (r1 != 0) goto L17
            java.lang.String r7 = "freqctl 规则为空直接存储"
            com.bytedance.msdk.j.up.cw.j(r3, r7)
            return r2
        L17:
            java.lang.String r4 = r7.up()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L2e
            java.lang.String r7 = "freqctl version 为空 清空本地数据 "
            com.bytedance.msdk.j.up.cw.j(r3, r7)
            java.lang.String r7 = r1.xt()
            r6.g(r7)
            return r0
        L2e:
            java.lang.String r4 = r1.up()
            java.lang.String r5 = r7.up()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L57
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "freqctl version 一致 version = "
            r7.<init>(r2)
            java.lang.String r1 = r1.up()
            r7.append(r1)
            java.lang.String r1 = "无需处理"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r7)
            return r0
        L57:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "freqctl version不一致，缓存新规则 old version = "
            r0.<init>(r4)
            java.lang.String r1 = r1.up()
            r0.append(r1)
            java.lang.String r1 = "  new version "
            r0.append(r1)
            java.lang.String r7 = r7.up()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r7)
            return r2
    }

    public boolean j(com.bytedance.msdk.core.tl.g r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r7.xt()
            com.bytedance.msdk.core.tl.g r1 = r6.up(r1)
            r2 = 1
            java.lang.String r3 = "TTMediationSDK_IntervalShowControl"
            if (r1 != 0) goto L17
            java.lang.String r7 = "pacing 规则为空直接存储"
            com.bytedance.msdk.j.up.cw.j(r3, r7)
            return r2
        L17:
            java.lang.String r4 = r7.oq()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L2e
            java.lang.String r1 = "pacing ruleId 为空 清空本地数据 "
            com.bytedance.msdk.j.up.cw.j(r3, r1)
            java.lang.String r7 = r7.r()
            r6.r(r7)
            return r0
        L2e:
            java.lang.String r4 = r1.oq()
            java.lang.String r5 = r7.oq()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L57
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "pacing ruleId 一致 ruleId = "
            r7.<init>(r2)
            java.lang.String r1 = r1.oq()
            r7.append(r1)
            java.lang.String r1 = " 无需处理"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r7)
            return r0
        L57:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "pacing ruleId不一致，缓存新规则 old ruleId = "
            r0.<init>(r4)
            java.lang.String r1 = r1.oq()
            r0.append(r1)
            java.lang.String r1 = "  new ruleId = "
            r0.append(r1)
            java.lang.String r1 = r7.oq()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "pacing 删除 ritId = "
            r0.<init>(r1)
            java.lang.String r1 = r7.r()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r0)
            java.lang.String r7 = r7.r()
            r6.r(r7)
            return r2
    }

    public android.util.Pair<java.lang.String, java.lang.String> m(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.String>> r0 = r1.xt
            java.lang.Object r2 = r0.get(r2)
            android.util.Pair r2 = (android.util.Pair) r2
            return r2
    }

    public com.bytedance.msdk.core.tl.ae oq(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.core.tl.tl r0 = com.bytedance.msdk.core.tl.tl.j()
            com.bytedance.msdk.core.tl.ae r2 = r0.xt(r2)
            return r2
    }

    public void r(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.core.tl.oq r0 = com.bytedance.msdk.core.tl.oq.j()
            r0.j(r2)
            return
    }

    public boolean tl(java.lang.String r11) {
            r10 = this;
            com.bytedance.msdk.core.tl.ae r0 = r10.oq(r11)
            if (r0 == 0) goto Lec
            boolean r1 = r0.tl()
            if (r1 == 0) goto Lec
            java.util.List r1 = r0.qv()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lec
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.core.tl.up r2 = (com.bytedance.msdk.core.tl.up) r2
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "checkFreqctl date = "
            r4.<init>(r5)
            long r5 = r3.getTime()
            r4.append(r5)
            java.lang.String r5 = " item.getEffectiveTime() = "
            r4.append(r5)
            long r5 = r2.r()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "TTMediationSDK_IntervalShowControl"
            com.bytedance.msdk.j.up.cw.j(r5, r4)
            long r3 = r3.getTime()
            long r6 = r2.r()
            r8 = 0
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 > 0) goto Lbf
            int r3 = r2.up()
            int r4 = r2.j()
            java.lang.String r6 = " count = "
            if (r3 >= r4) goto L81
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "checkFreqctl 未到上线可以展示 ruleId = "
            r3.<init>(r4)
            java.lang.String r4 = r2.cw()
            r3.append(r4)
            r3.append(r6)
            int r2 = r2.up()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.bytedance.msdk.j.up.cw.j(r5, r2)
            goto L14
        L81:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "checkFreqctl 到了上线不可以展示 ruleId = "
            r0.<init>(r1)
            java.lang.String r1 = r2.cw()
            r0.append(r1)
            r0.append(r6)
            int r1 = r2.up()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r5, r0)
            java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.String>> r0 = r10.xt
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r3 = r2.cw()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r2 = r2.up()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r3, r2)
            r0.put(r11, r1)
            return r8
        Lbf:
            java.lang.String r3 = r2.cw()
            r10.j(r0, r3, r8)
            java.lang.String r3 = r2.cw()
            long r6 = r2.xt()
            long r6 = com.bytedance.msdk.core.tl.m.j(r6)
            r10.j(r0, r3, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "checkFreqctl 有效期外计数需要清0，过期时间需要更新 = "
            r3.<init>(r4)
            java.lang.String r2 = r2.cw()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.bytedance.msdk.j.up.cw.j(r5, r2)
            goto L14
        Lec:
            r11 = 1
            return r11
    }

    public com.bytedance.msdk.core.tl.g up(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.core.tl.oq r0 = com.bytedance.msdk.core.tl.oq.j()
            com.bytedance.msdk.core.tl.g r2 = r0.xt(r2)
            return r2
    }

    public void xt() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.xt = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.j = r0
            return
    }

    public void xt(com.bytedance.msdk.core.tl.ae r2) {
            r1 = this;
            com.bytedance.msdk.core.tl.tl r0 = com.bytedance.msdk.core.tl.tl.j()
            r0.j(r2)
            return
    }

    public void xt(com.bytedance.msdk.core.tl.g r2) {
            r1 = this;
            com.bytedance.msdk.core.tl.oq r0 = com.bytedance.msdk.core.tl.oq.j()
            r0.j(r2)
            return
    }

    public void xt(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.core.tl.jy$1 r0 = new com.bytedance.msdk.core.tl.jy$1
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }
}
