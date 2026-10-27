package com.bytedance.msdk.cw.cw.xt.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.msdk.cw.cw.xt.j.xt.xt {
    private com.bytedance.msdk.cw.m.xt.xt cw;
    private com.bytedance.msdk.api.j.xt xt;



    class cw extends com.bytedance.msdk.xt.cw {
        private final com.bytedance.sdk.openadsdk.s.j.xt.j.xt av;
        private volatile boolean az;
        com.bytedance.sdk.openadsdk.i.cw.xt.ws g;
        private boolean jy;
        java.lang.ref.SoftReference<android.widget.FrameLayout> oq;
        final java.lang.Object qv;
        final /* synthetic */ com.bytedance.msdk.cw.cw.xt.j.xt.j vl;
        private boolean ws;





        cw(com.bytedance.msdk.cw.cw.xt.j.xt.j r2) {
                r1 = this;
                r1.vl = r2
                r1.<init>()
                java.lang.Object r2 = new java.lang.Object
                r2.<init>()
                r1.qv = r2
                r2 = 0
                r1.az = r2
                com.bytedance.msdk.cw.cw.xt.j.xt.j$cw$4 r2 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$cw$4
                r0 = 0
                r2.<init>(r1, r0)
                r1.av = r2
                return
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.j cw(com.bytedance.msdk.cw.cw.xt.j.xt.j.cw r0) {
                com.bytedance.msdk.j.xt.j r0 = r0.m17if()
                return r0
        }

        /* renamed from: if, reason: not valid java name */
        private com.bytedance.msdk.j.xt.j m17if() {
                r1 = this;
                com.bytedance.msdk.j.xt.m r0 = r1.ae
                com.bytedance.msdk.j.xt.j r0 = (com.bytedance.msdk.j.xt.j) r0
                return r0
        }

        static /* synthetic */ boolean j(com.bytedance.msdk.cw.cw.xt.j.xt.j.cw r0) {
                boolean r0 = r0.jy
                return r0
        }

        static /* synthetic */ boolean j(com.bytedance.msdk.cw.cw.xt.j.xt.j.cw r0, boolean r1) {
                r0.jy = r1
                return r1
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m m(com.bytedance.msdk.cw.cw.xt.j.xt.j.cw r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.sdk.openadsdk.s.j.xt.j.xt r(com.bytedance.msdk.cw.cw.xt.j.xt.j.cw r0) {
                com.bytedance.sdk.openadsdk.s.j.xt.j.xt r0 = r0.av
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m up(com.bytedance.msdk.cw.cw.xt.j.xt.j.cw r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m xt(com.bytedance.msdk.cw.cw.xt.j.xt.j.cw r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ boolean xt(com.bytedance.msdk.cw.cw.xt.j.xt.j.cw r0, boolean r1) {
                r0.ws = r1
                return r1
        }

        public synchronized android.view.View g() {
                r7 = this;
                monitor-enter(r7)
                java.lang.ref.SoftReference<android.widget.FrameLayout> r0 = r7.oq     // Catch: java.lang.Throwable -> L39
                if (r0 != 0) goto L8
                monitor-exit(r7)
                r0 = 0
                return r0
            L8:
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L39
                android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L39
                java.lang.Object r1 = r7.qv     // Catch: java.lang.Throwable -> L39
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L39
                if (r0 != 0) goto L34
                long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L2e java.lang.InterruptedException -> L30
                r4 = 2000(0x7d0, double:9.88E-321)
                long r4 = r4 + r2
            L1a:
                boolean r6 = r7.ws     // Catch: java.lang.Throwable -> L2e java.lang.InterruptedException -> L30
                if (r6 != 0) goto L34
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto L34
                java.lang.Object r6 = r7.qv     // Catch: java.lang.Throwable -> L2e java.lang.InterruptedException -> L30
                long r2 = r4 - r2
                r6.wait(r2)     // Catch: java.lang.Throwable -> L2e java.lang.InterruptedException -> L30
                long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L2e java.lang.InterruptedException -> L30
                goto L1a
            L2e:
                r0 = move-exception
                goto L37
            L30:
                r2 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L2e
            L34:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r7)
                return r0
            L37:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
                throw r0     // Catch: java.lang.Throwable -> L39
            L39:
                r0 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L39
                throw r0
        }

        public long ig() {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.tl()
                long r0 = com.bytedance.msdk.j.cw.xt.j(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }

        public com.bytedance.sdk.openadsdk.i.cw.xt.ae j(android.app.Activity r3) {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto L1a
                java.lang.String r0 = "pangle banner : getDislikeDialog = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                com.bytedance.sdk.openadsdk.i.cw.xt.ae r3 = r0.j(r3)
                return r3
            L1a:
                r3 = 0
                return r3
        }

        public void j(android.app.Activity r4, com.bytedance.sdk.openadsdk.kt.j.xt.j.j r5) {
                r3 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r3.g
                if (r0 == 0) goto L2a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "pangle banner : activity = "
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r1 = " pluginDislikeInteractionCallback:"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r3.g
                com.bytedance.msdk.cw.cw.xt.j.xt.j$cw$3 r1 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$cw$3
                r2 = 0
                r1.<init>(r3, r2, r5)
                r0.j(r4, r1)
            L2a:
                return
        }

        public void j(android.app.Dialog r3, java.lang.Integer[] r4) {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto L18
                java.lang.String r0 = "pangle banner :  ttDislikeDialogAbstract = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                r0.j(r3, r4)
            L18:
                return
        }

        public void j(android.content.Context r9) {
                r8 = this;
                com.bytedance.msdk.cw.cw.xt.j.xt.j r0 = r8.vl
                com.bytedance.sdk.openadsdk.core.gq r0 = r0.j(r9)
                if (r0 != 0) goto L9
                return
            L9:
                com.bytedance.msdk.cw.cw.xt.j.xt.j r1 = r8.vl
                com.bytedance.msdk.api.j.xt r2 = com.bytedance.msdk.cw.cw.xt.j.xt.j.xt(r1)
                com.bytedance.msdk.cw.cw.xt.j.xt.j r1 = r8.vl
                com.bytedance.msdk.cw.m.xt.xt r1 = com.bytedance.msdk.cw.cw.xt.j.xt.j.j(r1)
                java.lang.String r3 = r1.vl()
                com.bytedance.msdk.cw.cw.xt.j.xt.j r1 = r8.vl
                com.bytedance.msdk.cw.m.xt.xt r1 = com.bytedance.msdk.cw.cw.xt.j.xt.j.j(r1)
                java.lang.String r4 = r1.av()
                com.bytedance.msdk.cw.cw.xt.j.xt.j r1 = r8.vl
                com.bytedance.msdk.cw.m.xt.xt r1 = com.bytedance.msdk.cw.cw.xt.j.xt.j.j(r1)
                java.lang.String r5 = r1.i()
                com.bytedance.msdk.cw.cw.xt.j.xt.j r1 = r8.vl
                com.bytedance.msdk.cw.m.xt.xt r1 = com.bytedance.msdk.cw.cw.xt.j.xt.j.j(r1)
                java.lang.String r6 = r1.ch()
                r7 = 0
                com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = com.bytedance.msdk.j.cw.xt.j(r2, r3, r4, r5, r6, r7)
                com.bytedance.msdk.cw.cw.xt.j.xt.j r2 = r8.vl
                com.bytedance.msdk.api.j.xt r2 = com.bytedance.msdk.cw.cw.xt.j.xt.j.xt(r2)
                float r2 = r2.ws()
                com.bytedance.msdk.cw.cw.xt.j.xt.j r3 = r8.vl
                com.bytedance.msdk.api.j.xt r3 = com.bytedance.msdk.cw.cw.xt.j.xt.j.xt(r3)
                float r3 = r3.az()
                com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r2 = r1.j(r2)
                r2.xt(r3)
                com.bytedance.sdk.openadsdk.i.cw.cw.xt r1 = r1.j()
                com.bytedance.msdk.cw.cw.xt.j.xt.j$cw$1 r2 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$cw$1
                r3 = 0
                r2.<init>(r8, r3, r9)
                r0.cw(r1, r2)
                return
        }

        public void j(com.bytedance.sdk.openadsdk.i.cw.j.xt r3) {
                r2 = this;
                java.lang.String r0 = "pangle banner : setAdInteractionListener pluginTTAdInteractionListener = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto L16
                r0.j(r3)
            L16:
                return
        }

        public com.bytedance.sdk.openadsdk.i.cw.xt.r kk() {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto L12
                java.lang.String r0 = "TTMediationSDK"
                java.lang.String r1 = "pangle banner : getDislikeInfo"
                com.bytedance.msdk.j.up.cw.xt(r0, r1)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                com.bytedance.sdk.openadsdk.i.cw.xt.r r0 = r0.m()
                return r0
            L12:
                r0 = 0
                return r0
        }

        public java.lang.String o() {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r1.g
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.tl()
                java.lang.String r0 = com.bytedance.msdk.j.cw.xt.cw(r0)
                return r0
            Ld:
                java.lang.String r0 = ""
                return r0
        }

        public java.util.Map<java.lang.String, java.lang.Object> p() {
                r4 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r4.g
                if (r0 == 0) goto L32
                java.util.Map r0 = r0.tl()
                if (r0 == 0) goto L32
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.lang.String r2 = "coupon"
                java.lang.Object r3 = r0.get(r2)
                r1.put(r2, r3)
                java.lang.String r2 = "live_room"
                java.lang.Object r3 = r0.get(r2)
                r1.put(r2, r3)
                java.lang.String r2 = "product"
                java.lang.Object r0 = r0.get(r2)
                r1.put(r2, r0)
                r4.cw(r1)
                java.util.Map r0 = super.p()
                return r0
            L32:
                r0 = 0
                return r0
        }

        public void uf(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "pangle banner : uploadDislikeEvent event = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto L16
                r0.j(r3)
            L16:
                return
        }

        public boolean up() {
                r1 = this;
                boolean r0 = r1.az
                return r0
        }

        public void v(int r3) {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto L18
                java.lang.String r0 = "pangle banner : setSlideIntervalTime  intervalTime = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                r0.j(r3)
            L18:
                return
        }

        public void w() {
                r1 = this;
                r0 = 1
                r1.az = r0
                com.bytedance.msdk.cw.cw.xt.j.xt.j$cw$2 r0 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$cw$2
                r0.<init>(r1)
                com.bytedance.msdk.j.up.m.cw(r0)
                return
        }

        public long yb() {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.tl()
                long r0 = com.bytedance.msdk.j.cw.xt.xt(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }
    }

    /* renamed from: com.bytedance.msdk.cw.cw.xt.j.xt.j$j, reason: collision with other inner class name */
    class C0240j extends com.bytedance.msdk.xt.cw {
        com.bytedance.sdk.openadsdk.ch.j.xt.j.j g;
        private boolean jy;
        final /* synthetic */ com.bytedance.msdk.cw.cw.xt.j.xt.j oq;
        private com.bytedance.sdk.openadsdk.i.cw.xt.oq qv;
        private android.content.Context vl;
        private volatile boolean ws;





        C0240j(com.bytedance.msdk.cw.cw.xt.j.xt.j r6, android.content.Context r7, com.bytedance.sdk.openadsdk.i.cw.xt.oq r8) {
                r5 = this;
                r5.oq = r6
                r5.<init>()
                r0 = 0
                r5.ws = r0
                com.bytedance.msdk.cw.cw.xt.j.xt.j$j$3 r1 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$j$3
                r2 = 0
                r1.<init>(r5, r2)
                r5.g = r1
                r5.qv = r8
                r5.vl = r7
                com.bytedance.sdk.openadsdk.i.cw.xt.cw r7 = r8.mi()
                if (r7 == 0) goto L72
                java.lang.String r1 = r7.j()
                r5.f(r1)
                java.lang.String r1 = r7.cw()
                r5.v(r1)
                java.lang.String r1 = r7.r()
                r5.ch(r1)
                java.lang.String r1 = r7.xt()
                r5.s(r1)
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.util.Map r3 = r7.up()
                if (r3 == 0) goto L4a
                int r4 = r3.size()
                if (r4 <= 0) goto L4a
                r1.putAll(r3)
            L4a:
                r5.up(r1)
                java.lang.String r1 = "5.4.0.3"
                boolean r1 = com.bytedance.msdk.j.cw.xt.j(r1)
                if (r1 == 0) goto L5c
                java.lang.String r1 = r7.ae()
                r5.vl(r1)
            L5c:
                java.lang.String r1 = "6.8.1.6"
                boolean r1 = com.bytedance.msdk.j.cw.xt.j(r1)
                if (r1 == 0) goto L6b
                java.lang.String r1 = r7.tl()
                r5.oq(r1)
            L6b:
                java.lang.String r7 = r7.g()
                r5.qv(r7)
            L72:
                java.lang.String r7 = r8.ae()
                r5.la(r7)
                java.lang.String r7 = r8.tl()
                r5.gq(r7)
                java.lang.String r7 = r8.g()
                r5.p(r7)
                com.bytedance.sdk.openadsdk.i.cw.xt.vl r7 = r8.ws()
                if (r7 == 0) goto L95
                com.bytedance.sdk.openadsdk.i.cw.xt.vl r7 = r8.ws()
                java.lang.String r2 = r7.cw()
            L95:
                r5.a(r2)
                int r7 = r8.i()
                r5.qv(r7)
                int r7 = r8.av()
                r5.vl(r7)
                java.lang.String r7 = r8.jy()
                r5.rn(r7)
                int r7 = r8.oq()
                double r1 = (double) r7
                r5.r(r1)
                int r7 = r8.av()
                r1 = 4
                if (r7 != r1) goto Lbe
                r7 = 1
                goto Lbf
            Lbe:
                r7 = 0
            Lbf:
                r5.tl(r7)
                r5.ae(r0)
                int r7 = r8.i()
                r2 = 16
                if (r7 == r2) goto L11f
                int r7 = r8.i()
                r2 = 3
                if (r7 == r2) goto L11f
                int r7 = r8.i()
                r2 = 2
                if (r7 == r2) goto L11f
                int r7 = r8.i()
                r2 = 131(0x83, float:1.84E-43)
                if (r7 != r2) goto Le4
                goto L11f
            Le4:
                int r7 = r8.i()
                if (r7 != r1) goto L158
                java.util.List r7 = r8.az()
                if (r7 == 0) goto L158
                java.util.List r7 = r8.az()
                int r7 = r7.size()
                if (r7 <= 0) goto L158
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.List r0 = r8.az()
                java.util.Iterator r0 = r0.iterator()
            L107:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L11b
                java.lang.Object r1 = r0.next()
                com.bytedance.sdk.openadsdk.i.cw.xt.vl r1 = (com.bytedance.sdk.openadsdk.i.cw.xt.vl) r1
                java.lang.String r1 = r1.cw()
                r7.add(r1)
                goto L107
            L11b:
                r5.j(r7)
                goto L158
            L11f:
                java.util.List r7 = r8.az()
                if (r7 == 0) goto L158
                java.util.List r7 = r8.az()
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L158
                java.util.List r7 = r8.az()
                java.lang.Object r7 = r7.get(r0)
                if (r7 == 0) goto L158
                java.util.List r7 = r8.az()
                java.lang.Object r7 = r7.get(r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.vl r7 = (com.bytedance.sdk.openadsdk.i.cw.xt.vl) r7
                java.lang.String r0 = r7.cw()
                r5.l(r0)
                int r0 = r7.j()
                r5.mi(r0)
                int r7 = r7.xt()
                r5.w(r7)
            L158:
                int r7 = r8.i()
                r5.qv(r7)
                com.bytedance.msdk.cw.m.xt.xt r6 = com.bytedance.msdk.cw.cw.xt.j.xt.j.j(r6)
                boolean r6 = r6.j()
                if (r6 == 0) goto L193
                java.util.Map r6 = r8.f()
                if (r6 == 0) goto L193
                java.lang.String r7 = "price"
                java.lang.Object r6 = r6.get(r7)
                double r6 = com.bytedance.msdk.j.cw.xt.j(r6)
                java.lang.String r8 = "pangle native 返回的 cpm价格："
                java.lang.String r0 = java.lang.String.valueOf(r6)
                java.lang.String r8 = r8.concat(r0)
                java.lang.String r0 = "TTMediationSDK_ECMP"
                com.bytedance.msdk.j.up.cw.j(r0, r8)
                r0 = 0
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L18f
                goto L190
            L18f:
                r6 = r0
            L190:
                r5.j(r6)
            L193:
                return
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m ae(com.bytedance.msdk.cw.cw.xt.j.xt.j.C0240j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.j cw(com.bytedance.msdk.cw.cw.xt.j.xt.j.C0240j r0) {
                com.bytedance.msdk.j.xt.j r0 = r0.m18if()
                return r0
        }

        /* renamed from: if, reason: not valid java name */
        private com.bytedance.msdk.j.xt.j m18if() {
                r1 = this;
                com.bytedance.msdk.j.xt.m r0 = r1.ae
                com.bytedance.msdk.j.xt.j r0 = (com.bytedance.msdk.j.xt.j) r0
                return r0
        }

        static /* synthetic */ boolean j(com.bytedance.msdk.cw.cw.xt.j.xt.j.C0240j r0) {
                boolean r0 = r0.jy
                return r0
        }

        static /* synthetic */ boolean j(com.bytedance.msdk.cw.cw.xt.j.xt.j.C0240j r0, boolean r1) {
                r0.jy = r1
                return r1
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m m(com.bytedance.msdk.cw.cw.xt.j.xt.j.C0240j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.sdk.openadsdk.i.cw.xt.oq r(com.bytedance.msdk.cw.cw.xt.j.xt.j.C0240j r0) {
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r0.qv
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m up(com.bytedance.msdk.cw.cw.xt.j.xt.j.C0240j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m xt(com.bytedance.msdk.cw.cw.xt.j.xt.j.C0240j r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        public int el() {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r1.qv
                if (r0 == 0) goto L9
                int r0 = r0.cw()
                return r0
            L9:
                r0 = 0
                return r0
        }

        public int hu() {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r1.qv
                if (r0 == 0) goto L9
                int r0 = r0.r()
                return r0
            L9:
                r0 = 0
                return r0
        }

        public long ig() {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.f()
                long r0 = com.bytedance.msdk.j.cw.xt.j(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }

        public com.bytedance.sdk.openadsdk.i.cw.xt.ae j(android.app.Activity r3) {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                if (r0 == 0) goto L1a
                java.lang.String r0 = "pangle banner native: getDislikeDialog = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                com.bytedance.sdk.openadsdk.i.cw.xt.ae r3 = r0.j(r3)
                return r3
            L1a:
                r3 = 0
                return r3
        }

        public void j(android.app.Activity r9, android.view.ViewGroup r10, java.util.List<android.view.View> r11, java.util.List<android.view.View> r12, java.util.List<android.view.View> r13, com.bytedance.msdk.api.r.j.ae.oq r14, java.util.List<android.view.View> r15) {
                r8 = this;
                super.j(r9, r10, r11, r12, r13, r14, r15)
                r1 = r10
                r10 = r9
                r9 = r8
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r9.qv
                if (r0 == 0) goto L1f
                r6 = 0
                com.bytedance.sdk.openadsdk.ch.j.xt.j.j r7 = r9.g
                r2 = 0
                r3 = r11
                r4 = r12
                r5 = r13
                r0.j(r1, r2, r3, r4, r5, r6, r7)
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r11 = r9.qv
                com.bytedance.msdk.cw.cw.xt.j.xt.j$j$1 r12 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$j$1
                r13 = 0
                r12.<init>(r8, r13)
                r11.j(r10, r12)
            L1f:
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r10 = r9.qv
                r11 = -1
                if (r10 == 0) goto L83
                android.graphics.Bitmap r10 = r10.m()
                if (r10 == 0) goto L83
                if (r14 == 0) goto L83
                int r10 = r14.vl
                android.view.View r10 = r1.findViewById(r10)
                if (r10 == 0) goto L83
                r12 = 0
                r10.setVisibility(r12)
                boolean r12 = r10 instanceof android.view.ViewGroup
                if (r12 == 0) goto L74
                r12 = r10
                android.view.ViewGroup r12 = (android.view.ViewGroup) r12
                r12.removeAllViews()
                android.widget.ImageView r13 = new android.widget.ImageView
                android.content.Context r15 = r9.vl
                r13.<init>(r15)
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r15 = r9.qv
                android.graphics.Bitmap r15 = r15.m()
                r13.setImageBitmap(r15)
                android.widget.ImageView$ScaleType r15 = android.widget.ImageView.ScaleType.CENTER_INSIDE
                r13.setScaleType(r15)
                android.view.ViewGroup$LayoutParams r15 = r10.getLayoutParams()
                android.content.Context r0 = r9.vl
                r2 = 1108869120(0x42180000, float:38.0)
                int r0 = com.bytedance.msdk.api.up.cw(r0, r2)
                r15.width = r0
                android.content.Context r0 = r9.vl
                int r0 = com.bytedance.msdk.api.up.cw(r0, r2)
                r15.height = r0
                r10.setLayoutParams(r15)
                r12.addView(r13, r11, r11)
                goto L83
            L74:
                boolean r12 = r10 instanceof android.widget.ImageView
                if (r12 == 0) goto L83
                android.widget.ImageView r10 = (android.widget.ImageView) r10
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r12 = r9.qv
                android.graphics.Bitmap r12 = r12.m()
                r10.setImageBitmap(r12)
            L83:
                if (r14 == 0) goto La3
                int r10 = r14.ae
                android.view.View r10 = r1.findViewById(r10)
                android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
                if (r10 == 0) goto La3
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r12 = r9.qv
                if (r12 == 0) goto La3
                android.view.View r12 = r12.tj()
                if (r12 != 0) goto L9a
                goto La3
            L9a:
                r8.xt(r12)
                r10.removeAllViews()
                r10.addView(r12, r11, r11)
            La3:
                return
        }

        public void j(android.app.Activity r4, com.bytedance.sdk.openadsdk.kt.j.xt.j.j r5) {
                r3 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r3.qv
                if (r0 == 0) goto L2a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "pangle banner native:  activity = "
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r1 = " pluginDislikeInteractionCallback:"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r3.qv
                com.bytedance.msdk.cw.cw.xt.j.xt.j$j$4 r1 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$j$4
                r2 = 0
                r1.<init>(r3, r2, r5)
                r0.j(r4, r1)
            L2a:
                return
        }

        public void j(android.app.Dialog r3, java.lang.Integer[] r4) {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                if (r0 == 0) goto L1c
                java.lang.String r0 = "pangle banner native:  ttDislikeDialogAbstract = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                boolean r0 = r3 instanceof com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
                if (r0 == 0) goto L1c
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                r0.xt(r3, r4)
            L1c:
                return
        }

        public void j(com.bytedance.sdk.openadsdk.i.cw.j.xt r3) {
                r2 = this;
                java.lang.String r0 = "pangle banner native: setAdInteractionListener pluginTTAdInteractionListener = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                if (r0 == 0) goto L16
                r0.j(r3)
            L16:
                return
        }

        public com.bytedance.sdk.openadsdk.i.cw.xt.r kk() {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                if (r0 == 0) goto L12
                java.lang.String r0 = "TTMediationSDK"
                java.lang.String r1 = "pangle banner native : getDislikeInfo"
                com.bytedance.msdk.j.up.cw.xt(r0, r1)
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                com.bytedance.sdk.openadsdk.i.cw.xt.r r0 = r0.w()
                return r0
            L12:
                r0 = 0
                return r0
        }

        public boolean kt() {
                r1 = this;
                r0 = 1
                return r0
        }

        public java.lang.String o() {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r1.qv
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.f()
                java.lang.String r0 = com.bytedance.msdk.j.cw.xt.cw(r0)
                return r0
            Ld:
                java.lang.String r0 = ""
                return r0
        }

        public java.util.Map<java.lang.String, java.lang.Object> p() {
                r4 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r4.qv
                if (r0 == 0) goto L32
                java.util.Map r0 = r0.f()
                if (r0 == 0) goto L32
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.lang.String r2 = "coupon"
                java.lang.Object r3 = r0.get(r2)
                r1.put(r2, r3)
                java.lang.String r2 = "live_room"
                java.lang.Object r3 = r0.get(r2)
                r1.put(r2, r3)
                java.lang.String r2 = "product"
                java.lang.Object r0 = r0.get(r2)
                r1.put(r2, r0)
                r4.cw(r1)
                java.util.Map r0 = super.p()
                return r0
            L32:
                r0 = 0
                return r0
        }

        public void uf(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "pangle banner native: uploadDislikeEvent event = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                if (r0 == 0) goto L16
                r0.j(r3)
            L16:
                return
        }

        public boolean up() {
                r1 = this;
                boolean r0 = r1.ws
                return r0
        }

        public void w() {
                r1 = this;
                r0 = 1
                r1.ws = r0
                com.bytedance.msdk.cw.cw.xt.j.xt.j$j$2 r0 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$j$2
                r0.<init>(r1)
                com.bytedance.msdk.j.up.m.cw(r0)
                return
        }

        public com.bytedance.sdk.openadsdk.i.cw.xt.ae xt(android.app.Dialog r3, java.lang.Integer[] r4) {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                if (r0 == 0) goto L1a
                java.lang.String r0 = "pangle banner native : getDislikeDialog = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                com.bytedance.sdk.openadsdk.i.cw.xt.ae r3 = r0.j(r3, r4)
                return r3
            L1a:
                r3 = 0
                return r3
        }

        public long yb() {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.oq r0 = r2.qv
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.f()
                long r0 = com.bytedance.msdk.j.cw.xt.xt(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }
    }

    class xt extends com.bytedance.msdk.xt.cw {
        com.bytedance.sdk.openadsdk.i.cw.xt.ws g;
        private final com.bytedance.sdk.openadsdk.s.j.xt.j.xt jy;
        final /* synthetic */ com.bytedance.msdk.cw.cw.xt.j.xt.j oq;
        private boolean qv;
        private volatile boolean vl;





        xt(com.bytedance.msdk.cw.cw.xt.j.xt.j r3, android.content.Context r4, com.bytedance.sdk.openadsdk.i.cw.xt.ws r5) {
                r2 = this;
                r2.oq = r3
                r2.<init>()
                r0 = 0
                r2.vl = r0
                com.bytedance.msdk.cw.cw.xt.j.xt.j$xt$3 r0 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$xt$3
                r1 = 0
                r0.<init>(r2, r1)
                r2.jy = r0
                r2.g = r5
                int r5 = r5.xt()
                r2.qv(r5)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r5 = r2.g
                int r5 = r5.cw()
                r2.vl(r5)
                r5 = 1
                r2.ae(r5)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r5 = r2.g
                r5.j(r0)
                boolean r5 = r4 instanceof android.app.Activity
                if (r5 == 0) goto L3b
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r5 = r2.g
                android.app.Activity r4 = (android.app.Activity) r4
                com.bytedance.msdk.cw.cw.xt.j.xt.j$xt$1 r0 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$xt$1
                r0.<init>(r2, r1, r3)
                r5.j(r4, r0)
            L3b:
                com.bytedance.msdk.cw.m.xt.xt r3 = com.bytedance.msdk.cw.cw.xt.j.xt.j.j(r3)
                boolean r3 = r3.j()
                if (r3 == 0) goto L71
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r3 = r2.g
                java.util.Map r3 = r3.tl()
                if (r3 == 0) goto L71
                java.lang.String r4 = "price"
                java.lang.Object r3 = r3.get(r4)
                double r3 = com.bytedance.msdk.j.cw.xt.j(r3)
                java.lang.String r5 = "banner混存 pangle 模板native 返回的 cpm价格："
                java.lang.String r0 = java.lang.String.valueOf(r3)
                java.lang.String r5 = r5.concat(r0)
                java.lang.String r0 = "TTMediationSDK_ECMP"
                com.bytedance.msdk.j.up.cw.j(r0, r5)
                r0 = 0
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 <= 0) goto L6d
                goto L6e
            L6d:
                r3 = r0
            L6e:
                r2.j(r3)
            L71:
                return
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.j cw(com.bytedance.msdk.cw.cw.xt.j.xt.j.xt r0) {
                com.bytedance.msdk.j.xt.j r0 = r0.m19if()
                return r0
        }

        /* renamed from: if, reason: not valid java name */
        private com.bytedance.msdk.j.xt.j m19if() {
                r1 = this;
                com.bytedance.msdk.j.xt.m r0 = r1.ae
                com.bytedance.msdk.j.xt.j r0 = (com.bytedance.msdk.j.xt.j) r0
                return r0
        }

        static /* synthetic */ boolean j(com.bytedance.msdk.cw.cw.xt.j.xt.j.xt r0) {
                boolean r0 = r0.qv
                return r0
        }

        static /* synthetic */ boolean j(com.bytedance.msdk.cw.cw.xt.j.xt.j.xt r0, boolean r1) {
                r0.qv = r1
                return r1
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m r(com.bytedance.msdk.cw.cw.xt.j.xt.j.xt r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m up(com.bytedance.msdk.cw.cw.xt.j.xt.j.xt r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.j.xt.m xt(com.bytedance.msdk.cw.cw.xt.j.xt.j.xt r0) {
                com.bytedance.msdk.j.xt.m r0 = r0.ae
                return r0
        }

        public android.view.View g() {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r1.g
                if (r0 == 0) goto L9
                android.view.View r0 = r0.j()
                return r0
            L9:
                r0 = 0
                return r0
        }

        public long ig() {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.tl()
                long r0 = com.bytedance.msdk.j.cw.xt.j(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }

        public com.bytedance.sdk.openadsdk.i.cw.xt.ae j(android.app.Activity r2) {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r1.g
                if (r0 == 0) goto L9
                com.bytedance.sdk.openadsdk.i.cw.xt.ae r2 = r0.j(r2)
                return r2
            L9:
                com.bytedance.sdk.openadsdk.i.cw.xt.ae r2 = super.j(r2)
                return r2
        }

        public void j(android.app.Activity r4, com.bytedance.sdk.openadsdk.kt.j.xt.j.j r5) {
                r3 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r3.g
                if (r0 == 0) goto L2a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "pangle banner-native express:  activity = "
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r1 = " pluginDislikeInteractionCallback:"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r3.g
                com.bytedance.msdk.cw.cw.xt.j.xt.j$xt$4 r1 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$xt$4
                r2 = 0
                r1.<init>(r3, r2, r5)
                r0.j(r4, r1)
            L2a:
                return
        }

        public void j(android.app.Dialog r3, java.lang.Integer[] r4) {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto L18
                java.lang.String r0 = "pangle banner-native express:  ttDislikeDialogAbstract = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                r0.j(r3, r4)
            L18:
                return
        }

        public void j(com.bytedance.sdk.openadsdk.i.cw.j.cw r3) {
                r2 = this;
                java.lang.String r0 = "pangle banner express: setDownloadListener pluginTTAppDownloadListener = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto L16
                r0.j(r3)
            L16:
                return
        }

        public void j(com.bytedance.sdk.openadsdk.i.cw.j.xt r3) {
                r2 = this;
                java.lang.String r0 = "pangle banner express: setAdInteractionListener pluginTTAdInteractionListener = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto L16
                r0.j(r3)
            L16:
                return
        }

        public void j(com.bytedance.sdk.openadsdk.s.j.xt.j.cw r3) {
                r2 = this;
                java.lang.String r0 = "pangle banner express: setVideoAdListener pluginExpressVideoAdListener = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto L16
                r0.j(r3)
            L16:
                return
        }

        public com.bytedance.sdk.openadsdk.i.cw.xt.r kk() {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r1.g
                if (r0 == 0) goto L9
                com.bytedance.sdk.openadsdk.i.cw.xt.r r0 = r0.m()
                return r0
            L9:
                com.bytedance.sdk.openadsdk.i.cw.xt.r r0 = super.kk()
                return r0
        }

        public java.lang.String o() {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r1.g
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.tl()
                java.lang.String r0 = com.bytedance.msdk.j.cw.xt.cw(r0)
                return r0
            Ld:
                java.lang.String r0 = ""
                return r0
        }

        public java.util.Map<java.lang.String, java.lang.Object> p() {
                r3 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r3.g
                if (r0 == 0) goto L21
                java.util.Map r0 = r0.tl()
                if (r0 == 0) goto L21
                java.lang.String r1 = "getMediaExtraInfo "
                java.lang.String r2 = java.lang.String.valueOf(r0)
                java.lang.String r1 = r1.concat(r2)
                java.lang.String r2 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r2, r1)
                r3.cw(r0)
                java.util.Map r0 = super.p()
                return r0
            L21:
                r0 = 0
                return r0
        }

        public void qv() {
                r1 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r1.g
                if (r0 == 0) goto L7
                r0.r()
            L7:
                return
        }

        public void uf(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "pangle banner express: uploadDislikeEvent event = "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.xt(r1, r0)
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto L16
                r0.j(r3)
            L16:
                return
        }

        public boolean up() {
                r1 = this;
                boolean r0 = r1.vl
                return r0
        }

        public void w() {
                r1 = this;
                r0 = 1
                r1.vl = r0
                com.bytedance.msdk.cw.cw.xt.j.xt.j$xt$2 r0 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$xt$2
                r0.<init>(r1)
                com.bytedance.msdk.j.up.m.cw(r0)
                return
        }

        public long yb() {
                r2 = this;
                com.bytedance.sdk.openadsdk.i.cw.xt.ws r0 = r2.g
                if (r0 == 0) goto Ld
                java.util.Map r0 = r0.tl()
                long r0 = com.bytedance.msdk.j.cw.xt.xt(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }
    }

    public j(com.bytedance.msdk.cw.j.xt r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void cw(android.content.Context r8) {
            r7 = this;
            com.bytedance.sdk.openadsdk.core.gq r0 = r7.j(r8)
            if (r0 != 0) goto L7
            return
        L7:
            com.bytedance.msdk.api.j.xt r1 = r7.xt
            com.bytedance.msdk.cw.m.xt.xt r2 = r7.cw
            java.lang.String r2 = r2.vl()
            com.bytedance.msdk.cw.m.xt.xt r3 = r7.cw
            java.lang.String r3 = r3.av()
            com.bytedance.msdk.cw.m.xt.xt r4 = r7.cw
            java.lang.String r4 = r4.i()
            com.bytedance.msdk.cw.m.xt.xt r5 = r7.cw
            java.lang.String r5 = r5.ch()
            r6 = 0
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = com.bytedance.msdk.j.cw.xt.j(r1, r2, r3, r4, r5, r6)
            com.bytedance.msdk.api.j.xt r2 = r7.xt
            int r2 = r2.ch()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r2 = r1.j(r2)
            com.bytedance.msdk.api.j.xt r3 = r7.xt
            int r3 = r3.s()
            r2.xt(r3)
            com.bytedance.sdk.openadsdk.i.cw.cw.xt r1 = r1.j()
            com.bytedance.msdk.cw.cw.xt.j.xt.j$2 r2 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$2
            r3 = 0
            r2.<init>(r7, r3, r8)
            r0.j(r1, r2)
            return
    }

    static /* synthetic */ com.bytedance.msdk.cw.m.xt.xt j(com.bytedance.msdk.cw.cw.xt.j.xt.j r0) {
            com.bytedance.msdk.cw.m.xt.xt r0 = r0.cw
            return r0
    }

    static /* synthetic */ com.bytedance.msdk.api.j.xt xt(com.bytedance.msdk.cw.cw.xt.j.xt.j r0) {
            com.bytedance.msdk.api.j.xt r0 = r0.xt
            return r0
    }

    private void xt(android.content.Context r8) {
            r7 = this;
            com.bytedance.sdk.openadsdk.core.gq r0 = r7.j(r8)
            if (r0 != 0) goto L7
            return
        L7:
            com.bytedance.msdk.api.j.xt r1 = r7.xt
            com.bytedance.msdk.cw.m.xt.xt r2 = r7.cw
            java.lang.String r2 = r2.vl()
            com.bytedance.msdk.cw.m.xt.xt r3 = r7.cw
            java.lang.String r3 = r3.av()
            com.bytedance.msdk.cw.m.xt.xt r4 = r7.cw
            java.lang.String r4 = r4.i()
            com.bytedance.msdk.cw.m.xt.xt r5 = r7.cw
            java.lang.String r5 = r5.ch()
            r6 = 0
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = com.bytedance.msdk.j.cw.xt.j(r1, r2, r3, r4, r5, r6)
            com.bytedance.msdk.api.j.xt r2 = r7.xt
            int r2 = r2.ch()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = r1.j(r2)
            com.bytedance.msdk.api.j.xt r2 = r7.xt
            int r2 = r2.s()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = r1.xt(r2)
            com.bytedance.msdk.api.j.xt r2 = r7.xt
            float r2 = r2.ws()
            com.bytedance.msdk.api.j.xt r3 = r7.xt
            float r3 = r3.az()
            com.bytedance.msdk.api.j.xt r4 = r7.xt
            boolean r4 = com.bytedance.msdk.j.cw.xt.j(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "pangle banner native express autoHeight:"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r6 = " width:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = "  height:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r6, r5)
            r5 = 0
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L7e
            if (r4 != 0) goto L7e
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r2 = r1.j(r2)
            r2.xt(r3)
            goto L85
        L7e:
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r2 = r1.j(r2)
            r2.xt(r5)
        L85:
            com.bytedance.sdk.openadsdk.i.cw.cw.xt r1 = r1.j()
            com.bytedance.msdk.cw.cw.xt.j.xt.j$1 r2 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$1
            r3 = 0
            r2.<init>(r7, r3, r8)
            r0.j(r1, r2)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.xt.j.xt
    public void xt(android.content.Context r1, com.bytedance.msdk.cw.m.xt.xt r2, com.bytedance.msdk.api.j.xt r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r0 = this;
            r0.xt = r3
            r0.cw = r2
            if (r3 != 0) goto L11
            com.bytedance.msdk.api.j r1 = new com.bytedance.msdk.api.j
            java.lang.String r2 = "load ad fail adSlot is null"
            r1.<init>(r2)
            r0.j(r1)
            return
        L11:
            if (r4 == 0) goto L6e
            java.lang.String r2 = "tt_ad_sub_type"
            java.lang.Object r2 = r4.get(r2)
            if (r2 == 0) goto L5e
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 4
            if (r2 != r3) goto L5e
            java.lang.String r2 = "tt_ad_origin_type"
            java.lang.Object r2 = r4.get(r2)
            if (r2 == 0) goto L6e
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 1
            if (r2 != r3) goto L41
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.xt(r1)
            return
        L41:
            r3 = 2
            if (r2 != r3) goto L50
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.cw(r1)
            return
        L50:
            com.bytedance.msdk.api.j r1 = new com.bytedance.msdk.api.j
            r2 = 80001(0x13881, float:1.12105E-40)
            java.lang.String r3 = "originType is mismatch"
            r1.<init>(r2, r3)
            r0.j(r1)
            return
        L5e:
            com.bytedance.msdk.cw.cw.xt.j.xt.j$cw r2 = new com.bytedance.msdk.cw.cw.xt.j.xt.j$cw
            r2.<init>(r0)
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r2.j(r1)
        L6e:
            return
    }
}
