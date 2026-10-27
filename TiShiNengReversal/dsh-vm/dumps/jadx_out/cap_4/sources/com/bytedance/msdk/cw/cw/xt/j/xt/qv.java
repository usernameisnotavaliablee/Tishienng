package com.bytedance.msdk.cw.cw.xt.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class qv extends com.bytedance.msdk.cw.cw.xt.j.xt.xt {
    private com.bytedance.msdk.cw.m.xt.xt cw;
    private com.bytedance.msdk.api.j.xt xt;

    class j extends com.bytedance.msdk.xt.cw {
        com.bytedance.sdk.openadsdk.tj.j.xt.j.ae g;
        private java.util.Map<java.lang.String, java.lang.Object> jy;
        final /* synthetic */ com.bytedance.msdk.cw.cw.xt.j.xt.qv oq;
        private com.bytedance.sdk.openadsdk.i.cw.xt.az qv;
        private boolean vl;

        /* renamed from: com.bytedance.msdk.cw.cw.xt.j.xt.qv$j$1, reason: invalid class name */
        class AnonymousClass1 extends com.bytedance.sdk.openadsdk.tj.j.xt.j.ae {
            final /* synthetic */ com.bytedance.msdk.cw.cw.xt.j.xt.qv.j j;




            AnonymousClass1(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r1, java.util.function.Function r2) {
                    r0 = this;
                    r0.j = r1
                    r0.<init>(r2)
                    return
            }

            public void j() {
                    r2 = this;
                    java.lang.String r0 = "TTMediationSDK"
                    java.lang.String r1 = "pangle_reward_onRewardVideoCached"
                    com.bytedance.msdk.j.up.cw.r(r0, r1)
                    return
            }

            public void j(int r3, java.lang.String r4) {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "pangle_reward_onError code:"
                    r0.<init>(r1)
                    r0.append(r3)
                    java.lang.String r1 = "  message:"
                    r0.append(r1)
                    r0.append(r4)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "TTMediationSDK"
                    com.bytedance.msdk.j.up.cw.r(r1, r0)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r0 = r2.j
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv r0 = r0.oq
                    com.bytedance.msdk.api.j r1 = new com.bytedance.msdk.api.j
                    r1.<init>(r3, r4)
                    r0.j(r1)
                    return
            }

            public void j(com.bytedance.sdk.openadsdk.i.cw.xt.az r8) {
                    r7 = this;
                    java.lang.String r0 = "pangle_reward_onRewardVideoAdLoad"
                    java.lang.String r1 = "TTMediationSDK"
                    com.bytedance.msdk.j.up.cw.r(r1, r0)
                    if (r8 != 0) goto L18
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r8 = r7.j
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv r8 = r8.oq
                    com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
                    java.lang.String r1 = "请求成功，但无广告可用"
                    r0.<init>(r1)
                    r8.j(r0)
                    return
                L18:
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r0 = r7.j
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv.j.j(r0, r8)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r8 = r7.j
                    r0 = 1
                    r8.ae(r0)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r8 = r7.j
                    com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j.j(r8)
                    int r0 = r0.j()
                    r8.vl(r0)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r8 = r7.j
                    com.bytedance.sdk.openadsdk.i.cw.xt.az r8 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j.j(r8)
                    java.util.Map r8 = r8.xt()
                    java.lang.String r0 = "PangleRewardLoader WaterfallPangleRewardLoader extraInfo :"
                    java.lang.String r2 = java.lang.String.valueOf(r8)
                    java.lang.String r0 = r0.concat(r2)
                    com.bytedance.msdk.j.up.cw.r(r1, r0)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r0 = r7.j
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv r0 = r0.oq
                    com.bytedance.msdk.cw.m.xt.xt r0 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.xt(r0)
                    boolean r0 = r0.j()
                    if (r0 == 0) goto La3
                    if (r8 == 0) goto La3
                    java.lang.String r0 = "price"
                    java.lang.Object r0 = r8.get(r0)
                    double r2 = com.bytedance.msdk.j.cw.xt.j(r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r4 = r7.j
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv r4 = r4.oq
                    com.bytedance.msdk.cw.m.xt.xt r4 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.xt(r4)
                    java.lang.String r4 = r4.xt()
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r5 = r7.j
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv r5 = r5.oq
                    com.bytedance.msdk.cw.m.xt.xt r5 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.xt(r5)
                    java.lang.String r5 = r5.vl()
                    java.lang.String r4 = com.bytedance.msdk.j.up.up.xt(r4, r5)
                    r0.append(r4)
                    java.lang.String r4 = "pangle reward 返回的 cpm价格："
                    r0.append(r4)
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r4 = "TTMediationSDK_ECMP"
                    com.bytedance.msdk.j.up.cw.j(r4, r0)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r0 = r7.j
                    r4 = 0
                    int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r6 <= 0) goto L9f
                    goto La0
                L9f:
                    r2 = r4
                La0:
                    r0.j(r2)
                La3:
                    if (r8 == 0) goto Ld6
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r0 = r7.j
                    r0.r(r8)
                    java.lang.String r0 = "materialMetaIsFromPreload"
                    java.lang.Object r8 = r8.get(r0)
                    boolean r0 = r8 instanceof java.lang.Boolean
                    if (r0 == 0) goto Ld6
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r0 = r7.j
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv.j.j(r0, r8)
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    java.lang.String r0 = "pangle 激励 返回的adnPreload："
                    r8.<init>(r0)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r0 = r7.j
                    boolean r0 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j.xt(r0)
                    r8.append(r0)
                    java.lang.String r8 = r8.toString()
                    com.bytedance.msdk.j.up.cw.j(r1, r8)
                Ld6:
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r8 = r7.j
                    com.bytedance.sdk.openadsdk.i.cw.xt.az r8 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j.j(r8)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j$1$1 r0 = new com.bytedance.msdk.cw.cw.xt.j.xt.qv$j$1$1
                    r1 = 0
                    r0.<init>(r7, r1)
                    r8.j(r0)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r8 = r7.j
                    com.bytedance.sdk.openadsdk.i.cw.xt.az r8 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j.j(r8)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j$1$2 r0 = new com.bytedance.msdk.cw.cw.xt.j.xt.qv$j$1$2
                    r0.<init>(r7, r1)
                    r8.xt(r0)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r8 = r7.j
                    com.bytedance.sdk.openadsdk.i.cw.xt.az r8 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j.j(r8)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j$1$3 r0 = new com.bytedance.msdk.cw.cw.xt.j.xt.qv$j$1$3
                    r0.<init>(r7, r1)
                    r8.j(r0)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r8 = r7.j
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv r0 = r8.oq
                    r0.j(r8)
                    return
            }

            public void xt(com.bytedance.sdk.openadsdk.i.cw.xt.az r3) {
                    r2 = this;
                    java.lang.String r3 = "TTMediationSDK"
                    java.lang.String r0 = "pangle_reward_onRewardVideoCached 2"
                    com.bytedance.msdk.j.up.cw.r(r3, r0)
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r3 = r2.j
                    com.bytedance.msdk.cw.cw.xt.j.xt.qv r0 = r3.oq
                    r1 = 0
                    r0.j(r3, r1)
                    return
            }
        }

        j(com.bytedance.msdk.cw.cw.xt.j.xt.qv r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
                r1 = this;
                r1.oq = r2
                r1.<init>()
                com.bytedance.msdk.cw.cw.xt.j.xt.qv$j$1 r2 = new com.bytedance.msdk.cw.cw.xt.j.xt.qv$j$1
                r0 = 0
                r2.<init>(r1, r0)
                r1.g = r2
                r1.jy = r3
                return
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m a(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt ae(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.tl.j av(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.tl.j r0 = r0.m21if()
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m az(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.tl
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m ch(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt cw(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m f(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.tl
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt g(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m gq(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m h(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m i(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.tl
                return r0
        }

        /* renamed from: if, reason: not valid java name */
        private com.bytedance.msdk.api.r.j.tl.j m21if() {
                r1 = this;
                com.bytedance.msdk.j.xt.m r0 = r1.tl
                com.bytedance.msdk.api.r.j.tl.j r0 = (com.bytedance.msdk.api.r.j.tl.j) r0
                return r0
        }

        static /* synthetic */ com.bytedance.sdk.openadsdk.i.cw.xt.az j(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r0.qv
                return r0
        }

        static /* synthetic */ com.bytedance.sdk.openadsdk.i.cw.xt.az j(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0, com.bytedance.sdk.openadsdk.i.cw.xt.az r1) {
                r0.qv = r1
                return r1
        }

        private void j(android.content.Context r9) {
                r8 = this;
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r0 = r8.oq
                com.bytedance.sdk.openadsdk.core.gq r9 = r0.j(r9)
                if (r9 != 0) goto L9
                return
            L9:
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r0 = r8.oq
                com.bytedance.msdk.api.j.xt r0 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j(r0)
                java.util.Map r0 = r0.c()
                if (r0 == 0) goto L28
                java.lang.String r1 = "pangle"
                java.lang.Object r0 = r0.get(r1)
                boolean r1 = r0 instanceof java.lang.String
                if (r1 == 0) goto L28
                java.lang.String r0 = (java.lang.String) r0
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L28
                goto L2a
            L28:
                java.lang.String r0 = ""
            L2a:
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r1 = r8.oq
                com.bytedance.msdk.api.j.xt r2 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j(r1)
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r1 = r8.oq
                com.bytedance.msdk.cw.m.xt.xt r1 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.xt(r1)
                java.lang.String r3 = r1.vl()
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r1 = r8.oq
                com.bytedance.msdk.cw.m.xt.xt r1 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.xt(r1)
                java.lang.String r4 = r1.av()
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r1 = r8.oq
                com.bytedance.msdk.cw.m.xt.xt r1 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.xt(r1)
                java.lang.String r5 = r1.i()
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r1 = r8.oq
                com.bytedance.msdk.cw.m.xt.xt r1 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.xt(r1)
                java.lang.String r6 = r1.ch()
                r7 = 0
                com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = com.bytedance.msdk.j.cw.xt.j(r2, r3, r4, r5, r6, r7)
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r2 = r8.oq
                com.bytedance.msdk.api.j.xt r2 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j(r2)
                java.lang.String r2 = r2.gq()
                com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r2 = r1.m(r2)
                com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r2.up(r0)
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r2 = r8.oq
                com.bytedance.msdk.api.j.xt r2 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j(r2)
                java.lang.String r2 = r2.p()
                com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r0.oq(r2)
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r2 = r8.oq
                com.bytedance.msdk.api.j.xt r2 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j(r2)
                int r2 = r2.h()
                com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r0.tl(r2)
                r2 = 1080(0x438, float:1.513E-42)
                com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r0.j(r2)
                r2 = 1920(0x780, float:2.69E-42)
                com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r0.xt(r2)
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r2 = r8.oq
                com.bytedance.msdk.api.j.xt r2 = com.bytedance.msdk.cw.cw.xt.j.xt.qv.j(r2)
                int r2 = r2.rn()
                r0.r(r2)
                com.bytedance.sdk.openadsdk.i.cw.cw.xt r0 = r1.j()
                com.bytedance.sdk.openadsdk.tj.j.xt.j.ae r1 = r8.g
                r9.j(r0, r1)
                return
        }

        static /* synthetic */ void j(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0, android.content.Context r1) {
                r0.j(r1)
                return
        }

        static /* synthetic */ boolean j(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0, boolean r1) {
                r0.vl = r1
                return r1
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt jy(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m kt(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.tl
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m l(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m la(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt m(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m mi(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.tl
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt oq(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        private com.bytedance.msdk.api.r.j.tl.j os() {
                r1 = this;
                com.bytedance.msdk.j.xt.m r0 = r1.ae
                com.bytedance.msdk.api.r.j.tl.j r0 = (com.bytedance.msdk.api.r.j.tl.j) r0
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m p(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt qv(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt r(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m rn(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.tl.j s(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.tl.j r0 = r0.os()
                return r0
        }

        static /* synthetic */ boolean tj(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                boolean r0 = r0.to()
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt tl(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        private boolean to() {
                r3 = this;
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r0 = r3.oq
                java.lang.String r1 = "pangle"
                java.lang.String r0 = r0.j(r1)
                java.lang.String r2 = "0.0"
                boolean r0 = r2.equals(r0)
                r2 = 0
                if (r0 == 0) goto L12
                return r2
            L12:
                com.bytedance.msdk.cw.cw.xt.j.xt.qv r0 = r3.oq
                java.lang.String r0 = r0.j(r1)
                java.lang.String r1 = "4.4.0.0"
                int r0 = r1.compareTo(r0)
                if (r0 <= 0) goto L22
                r0 = 1
                return r0
            L22:
                return r2
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt up(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m v(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.tl
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt vl(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m w(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.tl
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.api.r.j.xt ws(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.api.r.j.xt r0 = r0.cw
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m x(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.tl
                return r0
        }

        static /* synthetic */ boolean xt(com.bytedance.msdk.cw.cw.xt.j.xt.qv.j r0) {
                boolean r0 = r0.vl
                return r0
        }

        public long ig() {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r2.qv
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.xt()
                long r0 = com.bytedance.msdk.j.cw.xt.j(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }

        public void j(android.app.Activity r2, java.lang.Object r3, java.lang.String r4) {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r1.qv
                if (r0 == 0) goto Ld
                if (r3 == 0) goto La
                r0.j(r2, r3, r4)
                return
            La:
                r0.j(r2)
            Ld:
                return
        }

        public void j(com.bytedance.sdk.openadsdk.i.cw.j.xt r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "PangleRewardLoader WaterfallPangleRewardLoader setAdInteractionListener pluginTTAdInteractionListener:"
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r1 = "  mTTRewardVideoAd: "
                r0.append(r1)
                com.bytedance.sdk.openadsdk.i.cw.xt.az r1 = r2.qv
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.r(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r2.qv
                if (r0 == 0) goto L24
                r0.j(r3)
            L24:
                return
        }

        public void j(java.lang.Object r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "PangleRewardLoader WaterfallPangleRewardLoader setRewardAdPlayAgainController rewardAdPlayAgainController:"
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r1 = "  mTTRewardVideoAd: "
                r0.append(r1)
                com.bytedance.sdk.openadsdk.i.cw.xt.az r1 = r2.qv
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.r(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r2.qv
                if (r0 == 0) goto L2a
                boolean r1 = r3 instanceof com.bytedance.sdk.openadsdk.a.j.xt.j.xt
                if (r1 == 0) goto L2a
                com.bytedance.sdk.openadsdk.a.j.xt.j.xt r3 = (com.bytedance.sdk.openadsdk.a.j.xt.j.xt) r3
                r0.j(r3)
            L2a:
                return
        }

        public boolean lx() {
                r1 = this;
                r0 = 1
                return r0
        }

        public java.lang.Integer m() {
                r5 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r5.qv
                if (r0 == 0) goto L16
                long r0 = r0.r()
                long r2 = java.lang.System.currentTimeMillis()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L16
                r0 = 2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
            L16:
                r0 = 3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        public boolean nd() {
                r1 = this;
                boolean r0 = r1.vl
                return r0
        }

        public java.lang.String o() {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r1.qv
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.xt()
                java.lang.String r0 = com.bytedance.msdk.j.cw.xt.cw(r0)
                return r0
            Ld:
                java.lang.String r0 = ""
                return r0
        }

        public java.util.Map<java.lang.String, java.lang.Object> p() {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r1.qv
                if (r0 == 0) goto Lb
                java.util.Map r0 = r0.xt()
                r1.cw(r0)
            Lb:
                java.util.Map r0 = super.p()
                return r0
        }

        public boolean up() {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r1.qv
                if (r0 != 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        public void w() {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r2.qv
                if (r0 == 0) goto L14
                r1 = 0
                r0.j(r1)
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r2.qv
                r0.j(r1)
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r2.qv
                r0.j(r1)
                r2.qv = r1
            L14:
                return
        }

        public long yb() {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.az r0 = r2.qv
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.xt()
                long r0 = com.bytedance.msdk.j.cw.xt.xt(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }
    }

    public qv(com.bytedance.msdk.cw.j.xt r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ com.bytedance.msdk.api.j.xt j(com.bytedance.msdk.cw.cw.xt.j.xt.qv r0) {
            com.bytedance.msdk.api.j.xt r0 = r0.xt
            return r0
    }

    static /* synthetic */ com.bytedance.msdk.cw.m.xt.xt xt(com.bytedance.msdk.cw.cw.xt.j.xt.qv r0) {
            com.bytedance.msdk.cw.m.xt.xt r0 = r0.cw
            return r0
    }

    public void cw() {
            r2 = this;
            com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
            java.lang.String r1 = "load ad fail adSlot is null"
            r0.<init>(r1)
            r2.j(r0)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.xt.j.xt
    public void xt(android.content.Context r1, com.bytedance.msdk.cw.m.xt.xt r2, com.bytedance.msdk.api.j.xt r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r0 = this;
            r0.xt = r3
            r0.cw = r2
            if (r3 != 0) goto La
            r0.cw()
            return
        La:
            com.bytedance.msdk.cw.cw.xt.j.xt.qv$j r2 = new com.bytedance.msdk.cw.cw.xt.j.xt.qv$j
            r2.<init>(r0, r4)
            if (r1 == 0) goto L1a
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            goto L1e
        L1a:
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
        L1e:
            com.bytedance.msdk.cw.cw.xt.j.xt.qv.j.j(r2, r1)
            return
    }
}
