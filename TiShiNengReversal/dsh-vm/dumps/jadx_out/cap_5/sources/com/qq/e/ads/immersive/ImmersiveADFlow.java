package com.qq.e.ads.immersive;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ImmersiveADFlow extends com.qq.e.ads.AbstractAD<com.qq.e.comm.pi.IAFD> implements com.qq.e.comm.pi.IAFD {
    private final com.qq.e.ads.immersive.ImmersiveADFlowListener h;
    private final com.qq.e.ads.immersive.ImmersiveADFlow.ADListenerAdapter i;
    private final java.util.Map<java.lang.String, java.lang.String> j;
    private com.qq.e.ads.cfg.VideoOption k;
    private boolean l;
    private boolean m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ADListenerAdapter implements com.qq.e.comm.adevent.ADListener {
        public com.qq.e.ads.immersive.ImmersiveADFlowListener adListener;

        public ADListenerAdapter(com.qq.e.ads.immersive.ImmersiveADFlowListener r1) {
                r0 = this;
                r0.<init>()
                r0.adListener = r1
                return
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(com.qq.e.comm.adevent.ADEvent r4) {
                r3 = this;
                com.qq.e.ads.immersive.ImmersiveADFlowListener r0 = r3.adListener
                if (r0 != 0) goto L6
                goto L79
            L6:
                int r0 = r4.getType()
                java.lang.String r1 = ""
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                switch(r0) {
                    case 100: goto L7a;
                    case 101: goto L3e;
                    case 102: goto L38;
                    case 103: goto L28;
                    case 104: goto L11;
                    case 105: goto L18;
                    case 106: goto L12;
                    default: goto L11;
                }
            L11:
                goto L79
            L12:
                com.qq.e.ads.immersive.ImmersiveADFlowListener r4 = r3.adListener
                r4.onADPageDestroy()
                return
            L18:
                java.lang.Object r4 = r4.getParam(r2)
                java.lang.String r4 = (java.lang.String) r4
                com.qq.e.ads.immersive.ImmersiveADFlowListener r0 = r3.adListener
                if (r4 != 0) goto L23
                goto L24
            L23:
                r1 = r4
            L24:
                r0.onADClick(r1)
                return
            L28:
                java.lang.Object r4 = r4.getParam(r2)
                java.lang.String r4 = (java.lang.String) r4
                com.qq.e.ads.immersive.ImmersiveADFlowListener r0 = r3.adListener
                if (r4 != 0) goto L33
                goto L34
            L33:
                r1 = r4
            L34:
                r0.onADExpose(r1)
                return
            L38:
                com.qq.e.ads.immersive.ImmersiveADFlowListener r4 = r3.adListener
                r4.onADPageShow()
                return
            L3e:
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                java.lang.Object r4 = r4.getParam(r0)
                java.lang.Integer r4 = (java.lang.Integer) r4
                if (r4 == 0) goto L79
                com.qq.e.ads.immersive.ImmersiveADFlowListener r0 = r3.adListener
                int r1 = r4.intValue()
                com.qq.e.comm.util.AdError r1 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r1)
                r0.onNoAD(r1)
                int r4 = r4.intValue()
                r0 = 6000(0x1770, float:8.408E-42)
                if (r4 != r0) goto L79
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.Class r0 = r3.getClass()
                java.lang.String r0 = r0.getSimpleName()
                r4.append(r0)
                java.lang.String r0 = ":未找到RecyclerView依赖或当前不支持平板设备"
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                com.qq.e.comm.util.GDTLogger.e(r4)
            L79:
                return
            L7a:
                com.qq.e.ads.immersive.ImmersiveADFlowListener r4 = r3.adListener
                r4.onADLoaded()
                return
        }
    }

    public ImmersiveADFlow(android.content.Context r2, java.lang.String r3, com.qq.e.ads.immersive.ImmersiveADFlowListener r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.l = r0
            r1.m = r0
            r1.h = r4
            com.qq.e.ads.immersive.ImmersiveADFlow$ADListenerAdapter r0 = new com.qq.e.ads.immersive.ImmersiveADFlow$ADListenerAdapter
            r0.<init>(r4)
            r1.i = r0
            r1.j = r5
            if (r5 == 0) goto L1e
            java.lang.String r4 = "TOKEN"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L20
        L1e:
            java.lang.String r4 = ""
        L20:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L2a
            r1.a(r2, r3)
            return
        L2a:
            r1.a(r2, r3, r4)
            return
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ com.qq.e.comm.pi.IAFD a(android.content.Context r1, com.qq.e.comm.pi.POFactory r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            com.qq.e.comm.pi.IAFD r1 = r0.b(r1, r2, r3, r4, r5)
            return r1
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    protected void a2(com.qq.e.comm.pi.IAFD r2) {
            r1 = this;
            com.qq.e.ads.cfg.VideoOption r2 = r1.k
            if (r2 == 0) goto Ld
            T r0 = r1.a
            if (r0 == 0) goto Ld
            com.qq.e.comm.pi.IAFD r0 = (com.qq.e.comm.pi.IAFD) r0
            r0.setVideoOption(r2)
        Ld:
            boolean r2 = r1.m
            r0 = 0
            if (r2 == 0) goto L1e
            T r2 = r1.a
            if (r2 == 0) goto L1e
            com.qq.e.comm.pi.IAFD r2 = (com.qq.e.comm.pi.IAFD) r2
            r2.showImmersiveADFlow()
            r1.m = r0
            return
        L1e:
            boolean r2 = r1.l
            if (r2 == 0) goto L2d
            T r2 = r1.a
            if (r2 == 0) goto L2d
            com.qq.e.comm.pi.IAFD r2 = (com.qq.e.comm.pi.IAFD) r2
            r2.preloadImmersiveADFlow()
            r1.l = r0
        L2d:
            return
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ void a(com.qq.e.comm.pi.IAFD r1) {
            r0 = this;
            com.qq.e.comm.pi.IAFD r1 = (com.qq.e.comm.pi.IAFD) r1
            r0.a2(r1)
            return
    }

    protected com.qq.e.comm.pi.IAFD b(android.content.Context r8, com.qq.e.comm.pi.POFactory r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            com.qq.e.ads.immersive.ImmersiveADFlow$ADListenerAdapter r5 = r7.i
            java.util.Map<java.lang.String, java.lang.String> r6 = r7.j
            r1 = r8
            r0 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            com.qq.e.comm.pi.IAFD r8 = r0.getImmersiveADFlowDelegate(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int r2) {
            r1 = this;
            com.qq.e.ads.immersive.ImmersiveADFlowListener r0 = r1.h
            if (r0 == 0) goto Lb
            com.qq.e.comm.util.AdError r2 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r2)
            r0.onNoAD(r2)
        Lb:
            return
    }

    @Override // com.qq.e.comm.pi.IAFD
    public java.lang.String getOperationInfo() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.IAFD r0 = (com.qq.e.comm.pi.IAFD) r0
            java.lang.String r0 = r0.getOperationInfo()
            return r0
        Lb:
            java.lang.String r0 = "getOperationInfo"
            r1.a(r0)
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.qq.e.comm.pi.IAFD
    public void preloadImmersiveADFlow() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.IAFD r0 = (com.qq.e.comm.pi.IAFD) r0
            r0.preloadImmersiveADFlow()
            return
        La:
            r0 = 1
            r1.l = r0
            return
    }

    @Override // com.qq.e.comm.pi.IAFD
    public void setVideoOption(com.qq.e.ads.cfg.VideoOption r2) {
            r1 = this;
            r1.k = r2
            T r0 = r1.a
            if (r0 == 0) goto Ld
            if (r2 == 0) goto Ld
            com.qq.e.comm.pi.IAFD r0 = (com.qq.e.comm.pi.IAFD) r0
            r0.setVideoOption(r2)
        Ld:
            return
    }

    @Override // com.qq.e.comm.pi.IAFD
    public void showImmersiveADFlow() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.IAFD r0 = (com.qq.e.comm.pi.IAFD) r0
            r0.showImmersiveADFlow()
            return
        La:
            r0 = 1
            r1.m = r0
            return
    }
}
