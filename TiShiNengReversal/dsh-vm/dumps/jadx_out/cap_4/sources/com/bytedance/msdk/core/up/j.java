package com.bytedance.msdk.core.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private final java.util.Map<java.lang.String, java.lang.Integer> j;
    private final java.util.Map<java.lang.String, java.lang.Integer> xt;

    public j() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.xt = r0
            return
    }

    public static boolean j(com.bytedance.msdk.api.j.xt r4, com.bytedance.msdk.api.j.xt r5, com.bytedance.msdk.xt.cw r6) {
            r6 = 0
            java.lang.String r0 = ", a2: "
            java.lang.String r1 = "TMe"
            if (r4 == 0) goto L21d
            if (r5 != 0) goto Lb
            goto L21d
        Lb:
            int r2 = r4.rn()
            int r3 = r5.rn()
            if (r2 == r3) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- orientation, a1: "
            r2.<init>(r3)
            int r4 = r4.rn()
            r2.append(r4)
            r2.append(r0)
            int r4 = r5.rn()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
        L35:
            boolean r2 = r4.wq()
            boolean r3 = r5.wq()
            if (r2 == r3) goto L5f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- isMuted, a1: "
            r2.<init>(r3)
            boolean r4 = r4.wq()
            r2.append(r4)
            r2.append(r0)
            boolean r4 = r5.wq()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
        L5f:
            int r2 = r4.ch()
            int r3 = r5.ch()
            if (r2 == r3) goto L89
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- ImgWidth, a1: "
            r2.<init>(r3)
            int r4 = r4.ch()
            r2.append(r4)
            r2.append(r0)
            int r4 = r5.ch()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
        L89:
            int r2 = r4.s()
            int r3 = r5.s()
            if (r2 == r3) goto Lb3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- ImgHeight, a1: "
            r2.<init>(r3)
            int r4 = r4.s()
            r2.append(r4)
            r2.append(r0)
            int r4 = r5.s()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
        Lb3:
            java.lang.String r2 = r4.p()
            if (r2 == 0) goto Led
            java.lang.String r2 = r5.p()
            if (r2 == 0) goto Led
            java.lang.String r2 = r4.p()
            java.lang.String r3 = r5.p()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lfb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- rewardName, a1: "
            r2.<init>(r3)
            java.lang.String r4 = r4.p()
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r5.p()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
        Led:
            java.lang.String r2 = r4.p()
            if (r2 != 0) goto L1fd
            java.lang.String r2 = r5.p()
            if (r2 == 0) goto Lfb
            goto L1fd
        Lfb:
            int r2 = r4.h()
            int r3 = r5.h()
            if (r2 == r3) goto L125
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- rewardAmount, a1: "
            r2.<init>(r3)
            int r4 = r4.h()
            r2.append(r4)
            r2.append(r0)
            int r4 = r5.h()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
        L125:
            java.lang.String r2 = r4.gq()
            if (r2 == 0) goto L15f
            java.lang.String r2 = r5.gq()
            if (r2 == 0) goto L15f
            java.lang.String r2 = r4.gq()
            java.lang.String r3 = r5.gq()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L16c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- reward, userId, a1: "
            r2.<init>(r3)
            java.lang.String r4 = r4.gq()
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r5.gq()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
        L15f:
            java.lang.String r2 = r4.gq()
            if (r2 != 0) goto L1dd
            java.lang.String r2 = r5.gq()
            if (r2 == 0) goto L16c
            goto L1dd
        L16c:
            java.util.Map r2 = r4.c()
            if (r2 == 0) goto L1ae
            java.util.Map r2 = r5.c()
            if (r2 == 0) goto L1ae
            java.util.Map r2 = r4.c()
            java.util.Map r3 = r5.c()
            boolean r2 = j(r2, r3)
            if (r2 != 0) goto L1bb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- customData, a1: "
            r2.<init>(r3)
            java.util.Map r4 = r4.c()
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            r2.append(r0)
            java.util.Map r4 = r5.c()
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
        L1ae:
            java.util.Map r2 = r4.c()
            if (r2 != 0) goto L1bd
            java.util.Map r2 = r5.c()
            if (r2 == 0) goto L1bb
            goto L1bd
        L1bb:
            r4 = 1
            return r4
        L1bd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- customData=null, a1: "
            r2.<init>(r3)
            java.util.Map r4 = r4.c()
            r2.append(r4)
            r2.append(r0)
            java.util.Map r4 = r5.c()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
        L1dd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- reward, userId=null, a1: "
            r2.<init>(r3)
            java.lang.String r4 = r4.gq()
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r5.gq()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
        L1fd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- rewardName=null, a1: "
            r2.<init>(r3)
            java.lang.String r4 = r4.p()
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r5.p()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
        L21d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- adSlot = null, a1: "
            r2.<init>(r3)
            r2.append(r4)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return r6
    }

    public static boolean j(java.util.Map<java.lang.String, java.lang.Object> r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
            r0 = 1
            if (r7 != 0) goto L6
            if (r8 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r7 == 0) goto L52
            if (r8 == 0) goto L52
            int r2 = r7.size()
            int r3 = r8.size()
            if (r2 == r3) goto L16
            return r1
        L16:
            java.util.Set r2 = r7.keySet()
            if (r2 == 0) goto L51
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L20
            java.lang.Object r4 = r7.get(r3)
            boolean r5 = r4 instanceof java.lang.String
            r6 = 0
            if (r5 == 0) goto L3a
            java.lang.String r4 = (java.lang.String) r4
            goto L3b
        L3a:
            r4 = r6
        L3b:
            java.lang.Object r3 = r8.get(r3)
            boolean r5 = r3 instanceof java.lang.String
            if (r5 == 0) goto L46
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
        L46:
            if (r4 != 0) goto L4a
            if (r6 == 0) goto L20
        L4a:
            boolean r3 = android.text.TextUtils.equals(r4, r6)
            if (r3 != 0) goto L20
            return r1
        L51:
            return r0
        L52:
            return r1
    }

    protected int j(com.bytedance.msdk.core.up.xt.ae r21, com.bytedance.msdk.api.j.xt r22, com.bytedance.msdk.api.j.xt r23, java.lang.String r24) {
            r20 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            if (r0 == 0) goto Le
            com.bytedance.msdk.xt.cw r5 = r0.j
            if (r5 != 0) goto L14
        Le:
            r9 = r20
            r19 = 4
            goto L186
        L14:
            if (r2 == 0) goto L1b
            java.lang.String r5 = r2.v()
            goto L1d
        L1b:
            java.lang.String r5 = ""
        L1d:
            com.bytedance.msdk.xt.cw r6 = r0.j
            java.lang.String r6 = r6.ff()
            com.bytedance.msdk.xt.cw r7 = r0.j
            java.lang.String r7 = r7.qa()
            com.bytedance.msdk.xt.cw r8 = r0.j
            java.lang.Integer r8 = r8.m()
            int r9 = r8.intValue()
            java.lang.String r11 = ":复用成功：---"
            java.lang.String r13 = ":AdSlot不符合 ---: "
            java.lang.String r15 = ":广告已show过 ---: "
            r16 = -1
            r10 = 1
            r17 = 6
            java.lang.String r12 = ", adSlotId: "
            r18 = 7
            java.lang.String r14 = "--==-- "
            java.lang.String r4 = "TTMediationSDK"
            if (r9 != r10) goto Ld5
            com.bytedance.msdk.xt.cw r8 = r0.j
            boolean r8 = r8.qb()
            if (r8 == 0) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            r0.append(r15)
            r0.append(r6)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            return r18
        L6c:
            com.bytedance.msdk.xt.cw r8 = r0.j
            r9 = r20
            boolean r5 = r9.j(r5, r8)
            if (r5 == 0) goto L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            java.lang.String r1 = ":广告过期了(M配置) ---: "
            r0.append(r1)
            r0.append(r6)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            r0 = 2
            return r0
        L95:
            com.bytedance.msdk.xt.cw r0 = r0.j
            boolean r0 = j(r1, r2, r0)
            if (r0 != 0) goto Lb9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            r0.append(r13)
            r0.append(r6)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            return r17
        Lb9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            r0.append(r11)
            r0.append(r6)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            return r16
        Ld5:
            r9 = r20
            com.bytedance.msdk.xt.cw r5 = r0.j
            boolean r5 = r5.qb()
            if (r5 == 0) goto Lfb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            r0.append(r15)
            r0.append(r6)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            return r18
        Lfb:
            int r5 = r8.intValue()
            r15 = 3
            if (r5 != r15) goto L120
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            java.lang.String r1 = ":广告过期了(adn api) ---: "
            r0.append(r1)
            r0.append(r6)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            return r10
        L120:
            int r5 = r8.intValue()
            r8 = 4
            if (r5 != r8) goto L146
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            java.lang.String r1 = ":isReady是false ---: "
            r0.append(r1)
            r0.append(r6)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            r0 = 5
            return r0
        L146:
            com.bytedance.msdk.xt.cw r0 = r0.j
            boolean r0 = j(r1, r2, r0)
            if (r0 != 0) goto L16a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            r0.append(r13)
            r0.append(r6)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            return r17
        L16a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            r0.append(r11)
            r0.append(r6)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            return r16
        L186:
            return r19
    }

    public int j(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L23
            int r3 = r3.intValue()
            return r3
        L23:
            r3 = 1800000(0x1b7740, float:2.522337E-39)
            return r3
    }

    public void j(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.put(r3, r4)
            return
    }

    public final boolean j(java.lang.String r6, com.bytedance.msdk.xt.cw r7) {
            r5 = this;
            java.lang.String r0 = "TTMediationSDK"
            r1 = 1
            if (r7 == 0) goto L2a
            boolean r2 = r7.up()
            if (r2 == 0) goto Lc
            goto L2a
        Lc:
            long r2 = r7.sm()
            java.lang.String r7 = r7.qa()
            int r6 = r5.j(r6, r7)
            long r6 = (long) r6
            long r2 = r2 + r6
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            java.lang.String r6 = "--==-- 使用了配置的过期时间进行判断 ------"
            com.bytedance.msdk.j.up.cw.j(r0, r6)
            return r1
        L2a:
            java.lang.String r6 = "--==-- 广告已经destroy了，视为过期 ------"
            com.bytedance.msdk.j.up.cw.j(r0, r6)
            return r1
    }

    public int xt(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.xt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L23
            int r3 = r3.intValue()
            return r3
        L23:
            r3 = 1
            return r3
    }

    public void xt(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.xt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.put(r3, r4)
            return
    }
}
