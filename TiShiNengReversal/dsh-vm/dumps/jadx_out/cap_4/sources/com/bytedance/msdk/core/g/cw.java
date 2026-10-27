package com.bytedance.msdk.core.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    protected static java.util.List<com.bytedance.msdk.core.oq.oq> j(com.bytedance.msdk.core.oq.xt r6, java.lang.String r7) {
            r2 = 0
            r4 = 0
            r0 = r6
            r1 = r7
            java.util.List r6 = j(r0, r1, r2, r4)
            return r6
    }

    public static java.util.List<com.bytedance.msdk.core.oq.oq> j(com.bytedance.msdk.core.oq.xt r19, java.lang.String r20, double r21, double r23) {
            r7 = r20
            if (r19 == 0) goto L173
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Lc
            goto L173
        Lc:
            java.util.concurrent.CopyOnWriteArrayList r8 = new java.util.concurrent.CopyOnWriteArrayList
            r8.<init>()
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.oq.r r9 = r0.up(r7)
            if (r9 == 0) goto L11b
            double r11 = r9.j()
            double r13 = r9.xt()
            int r0 = r9.cw()
            int r1 = r19.m()
            r15 = 2
            r2 = 3
            r16 = 0
            r3 = 1
            if (r1 == r2) goto L50
            int r1 = r19.m()
            r4 = 4
            if (r1 != r4) goto L3a
            goto L50
        L3a:
            int r1 = r19.m()
            if (r1 != r15) goto L4d
            com.bytedance.msdk.core.g.xt r1 = com.bytedance.msdk.core.g.xt.r()
            double r0 = r1.j(r2, r7, r0)
            r1 = r0
        L49:
            r10 = 1
            r18 = 0
            goto L79
        L4d:
            r1 = r16
            goto L49
        L50:
            com.bytedance.msdk.core.g.xt r0 = com.bytedance.msdk.core.g.xt.r()
            int r1 = r19.m()
            java.lang.String r6 = r19.la()
            r2 = r21
            r4 = r23
            r10 = 1
            r18 = 0
            double[] r0 = r0.j(r1, r2, r4, r6, r7)
            r1 = r0[r18]
            r3 = r0[r10]
            int r0 = (int) r3
            java.util.Map r3 = r19.up()
            java.lang.String r4 = "price_from"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r4, r0)
        L79:
            boolean r0 = r9.up()
            if (r0 != 0) goto Ld9
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto Ld9
            int r0 = r9.getType()
            if (r0 != r10) goto L91
            r7 = r19
            r3 = r11
            r5 = r13
            xt(r1, r3, r5, r7, r8)
            goto L9e
        L91:
            r3 = r11
            r5 = r13
            int r0 = r9.getType()
            if (r0 != r15) goto L9e
            r7 = r19
            j(r1, r3, r5, r7, r8)
        L9e:
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            int r3 = r19.wq()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.util.List r0 = r0.m(r3)
            if (r0 == 0) goto Ld9
            java.util.Iterator r0 = r0.iterator()
        Lb4:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Ld9
            java.lang.Object r3 = r0.next()
            com.bytedance.msdk.core.oq.cw r3 = (com.bytedance.msdk.core.oq.cw) r3
            double r4 = r3.m()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto Lb4
            double r4 = r3.up()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto Lb4
            java.util.Map r0 = r19.up()
            java.lang.String r4 = "user_label_value"
            r0.put(r4, r3)
        Ld9:
            java.util.Map r0 = r19.up()
            java.lang.String r3 = "rule_id"
            java.lang.String r4 = r9.r()
            r0.put(r3, r4)
            java.util.Map r0 = r19.up()
            java.lang.String r3 = "ecpm"
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.put(r3, r1)
            java.util.Map r0 = r19.up()
            int r1 = r8.size()
            if (r1 != 0) goto Lff
            r3 = 0
            goto L100
        Lff:
            r3 = 1
        L100:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = "rule_in_use"
            r0.put(r2, r1)
            java.util.Map r0 = r19.up()
            int r1 = r19.m()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "group_type"
            r0.put(r2, r1)
            goto L11d
        L11b:
            r18 = 0
        L11d:
            boolean r0 = com.bytedance.msdk.j.up.cw.xt()
            if (r0 == 0) goto L167
            int r0 = r8.size()
            java.lang.String r1 = "DynamicRuleCalculate"
            if (r0 == 0) goto L162
            r10 = 0
        L12c:
            int r0 = r8.size()
            if (r10 >= r0) goto L167
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "rit："
            r0.<init>(r2)
            java.lang.Object r2 = r8.get(r10)
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            java.lang.String r2 = r2.w()
            r0.append(r2)
            java.lang.String r2 = ",level："
            r0.append(r2)
            java.lang.Object r2 = r8.get(r10)
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            int r2 = r2.x()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r0)
            int r10 = r10 + 1
            goto L12c
        L162:
            java.lang.String r0 = "走原waterfall，inUse ： 不生效"
            com.bytedance.msdk.j.up.cw.j(r1, r0)
        L167:
            int r0 = r8.size()
            if (r0 == 0) goto L16e
            return r8
        L16e:
            java.util.List r0 = r19.ol()
            return r0
        L173:
            r0 = 0
            return r0
    }

    private static void j(double r8, double r10, double r12, com.bytedance.msdk.core.oq.xt r14, java.util.List<com.bytedance.msdk.core.oq.oq> r15) {
            if (r14 == 0) goto L2d
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 == 0) goto L2d
            double r2 = r14.x()
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L11
            goto L2d
        L11:
            double r2 = r14.v()
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 <= 0) goto L25
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto L25
            java.util.List r8 = r14.ol()
            r15.addAll(r8)
            return
        L25:
            r1 = r8
            r3 = r10
            r5 = r12
            r0 = r14
            r7 = r15
            j(r0, r1, r3, r5, r7)
        L2d:
            return
    }

    public static void j(com.bytedance.msdk.core.oq.xt r20, double r21, double r23, double r25, java.util.List<com.bytedance.msdk.core.oq.oq> r27) {
            r0 = r27
            java.util.Map r1 = r20.rh()
            if (r1 == 0) goto L179
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r3 = r1.keySet()
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r5 = 0
        L18:
            int r6 = r2.size()
            if (r5 >= r6) goto L44
            java.lang.Object r6 = r2.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 <= 0) goto L32
            java.lang.Object r6 = r2.get(r5)
            r3.add(r6)
            goto L41
        L32:
            java.lang.Object r6 = r2.get(r5)
            java.lang.Object r6 = r1.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L41
            r0.addAll(r6)
        L41:
            int r5 = r5 + 1
            goto L18
        L44:
            com.bytedance.msdk.core.ae.xt.j(r3)
            int r2 = r3.size()
            if (r2 > 0) goto L4f
            goto L179
        L4f:
            r5 = -1
            r7 = r2
            r6 = 0
        L52:
            int r8 = r3.size()
            if (r6 >= r8) goto Lf1
            double r8 = (double) r6
            java.lang.Object r10 = r3.get(r6)
            java.lang.Object r10 = r1.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto Led
            r11 = 0
        L66:
            int r12 = r10.size()
            if (r11 >= r12) goto Led
            java.lang.Object r12 = r10.get(r11)
            com.bytedance.msdk.core.oq.oq r12 = (com.bytedance.msdk.core.oq.oq) r12
            if (r12 == 0) goto Le9
            int r13 = r12.mi()
            if (r13 != 0) goto Le9
            double r12 = r12.v()
            java.math.BigDecimal r12 = java.math.BigDecimal.valueOf(r12)
            r13 = 2
            java.math.RoundingMode r14 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r12 = r12.setScale(r13, r14)
            double r12 = r12.doubleValue()
            r14 = 0
            int r16 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r16 != 0) goto Lb1
            if (r5 >= 0) goto L9c
            double r10 = r8 - r23
            int r5 = (int) r10
            int r5 = java.lang.Math.max(r5, r4)
        L9c:
            if (r7 == r2) goto La0
            if (r16 != 0) goto Led
        La0:
            int r7 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r7 > 0) goto La7
        La4:
            int r7 = r2 + (-1)
            goto Led
        La7:
            double r8 = r8 + r25
            int r7 = (int) r8
            int r8 = r2 + (-1)
            int r7 = java.lang.Math.min(r7, r8)
            goto Led
        Lb1:
            if (r16 <= 0) goto Le9
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r5 >= 0) goto Lcd
            double r16 = r8 - r12
            double r16 = r8 + r16
            double r16 = r16 / r10
            double r16 = r16 - r23
            r18 = r10
            double r10 = java.lang.Math.ceil(r16)
            int r5 = (int) r10
            int r5 = java.lang.Math.max(r5, r4)
            goto Lcf
        Lcd:
            r18 = r10
        Lcf:
            if (r7 != r2) goto Led
            int r7 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r7 > 0) goto Ld6
            goto La4
        Ld6:
            double r10 = r8 - r12
            double r8 = r8 + r10
            double r8 = r8 / r18
            double r8 = r8 + r25
            double r7 = java.lang.Math.floor(r8)
            int r7 = (int) r7
            int r8 = r2 + (-1)
            int r7 = java.lang.Math.min(r7, r8)
            goto Led
        Le9:
            int r11 = r11 + 1
            goto L66
        Led:
            int r6 = r6 + 1
            goto L52
        Lf1:
            if (r5 >= 0) goto Lf4
            r5 = 0
        Lf4:
            if (r7 < r2) goto Lf8
            int r7 = r2 + (-1)
        Lf8:
            r2 = r5
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r12 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r14 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        Lff:
            if (r2 > r7) goto L152
            java.lang.Object r6 = r3.get(r2)
            java.lang.Object r6 = r1.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L14c
            int r16 = r6.size()
            if (r16 == 0) goto L14c
            r21 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L115:
            int r8 = r6.size()
            if (r4 >= r8) goto L14e
            java.lang.Object r8 = r6.get(r4)
            com.bytedance.msdk.core.oq.oq r8 = (com.bytedance.msdk.core.oq.oq) r8
            if (r8 == 0) goto L149
            double r17 = r8.v()
            int r9 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r9 < 0) goto L12f
            int r9 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r9 != 0) goto L133
        L12f:
            double r12 = r8.v()
        L133:
            double r17 = r8.v()
            int r9 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r9 > 0) goto L13f
            int r9 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r9 != 0) goto L143
        L13f:
            double r14 = r8.v()
        L143:
            r0.add(r8)
            if (r2 != r5) goto L149
            r10 = r12
        L149:
            int r4 = r4 + 1
            goto L115
        L14c:
            r21 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L14e:
            int r2 = r2 + 1
            r4 = 0
            goto Lff
        L152:
            java.util.Map r0 = r20.up()
            java.lang.String r1 = "upper_cpm_x"
            java.lang.Double r2 = java.lang.Double.valueOf(r10)
            r0.put(r1, r2)
            java.util.Map r0 = r20.up()
            java.lang.String r1 = "max_ecpm"
            java.lang.Double r2 = java.lang.Double.valueOf(r12)
            r0.put(r1, r2)
            java.util.Map r0 = r20.up()
            java.lang.String r1 = "min_ecpm"
            java.lang.Double r2 = java.lang.Double.valueOf(r14)
            r0.put(r1, r2)
        L179:
            return
    }

    private static void xt(double r17, double r19, double r21, com.bytedance.msdk.core.oq.xt r23, java.util.List<com.bytedance.msdk.core.oq.oq> r24) {
            r0 = r24
            int r1 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r1 < 0) goto Ld5
            r1 = 0
            int r3 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r3 > 0) goto Le
            goto Ld5
        Le:
            double r3 = r23.x()
            int r5 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r5 >= 0) goto L18
            goto Ld5
        L18:
            double r3 = r23.v()
            int r5 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2c
            int r3 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r3 > 0) goto L2c
            java.util.List r1 = r23.ol()
            r0.addAll(r1)
            return
        L2c:
            double r1 = r17 * r19
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r1)
            java.math.RoundingMode r2 = java.math.RoundingMode.HALF_UP
            r3 = 2
            java.math.BigDecimal r1 = r1.setScale(r3, r2)
            double r4 = r1.doubleValue()
            double r6 = r17 * r21
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r6)
            java.math.BigDecimal r1 = r1.setScale(r3, r2)
            double r1 = r1.doubleValue()
            java.util.List r6 = r23.ol()
            r9 = 0
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r12 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L54:
            int r14 = r6.size()
            if (r9 >= r14) goto Lae
            java.lang.Object r14 = r6.get(r9)
            com.bytedance.msdk.core.oq.oq r14 = (com.bytedance.msdk.core.oq.oq) r14
            int r15 = r14.mi()
            if (r15 != 0) goto La6
            double r15 = r14.v()
            java.math.BigDecimal r15 = java.math.BigDecimal.valueOf(r15)
            r17 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.math.RoundingMode r7 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r7 = r15.setScale(r3, r7)
            double r7 = r7.doubleValue()
            int r15 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r15 > 0) goto Lab
            int r15 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r15 < 0) goto Lab
            int r7 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r7 == 0) goto L8e
            double r7 = r14.v()
            int r15 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r15 >= 0) goto L92
        L8e:
            double r10 = r14.v()
        L92:
            int r7 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r7 == 0) goto L9e
            double r7 = r14.v()
            int r15 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r15 <= 0) goto La2
        L9e:
            double r12 = r14.v()
        La2:
            r0.add(r14)
            goto Lab
        La6:
            r17 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r0.add(r14)
        Lab:
            int r9 = r9 + 1
            goto L54
        Lae:
            java.util.Map r0 = r23.up()
            java.lang.String r1 = "max_ecpm"
            java.lang.Double r2 = java.lang.Double.valueOf(r10)
            r0.put(r1, r2)
            java.util.Map r0 = r23.up()
            java.lang.String r1 = "min_ecpm"
            java.lang.Double r2 = java.lang.Double.valueOf(r12)
            r0.put(r1, r2)
            java.util.Map r0 = r23.up()
            java.lang.String r1 = "upper_cpm_x"
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r0.put(r1, r2)
        Ld5:
            return
    }
}
