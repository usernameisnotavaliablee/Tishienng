package com.qq.e.ads.nativ;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class NativeUnifiedAD extends com.qq.e.ads.NativeAbstractAD<com.qq.e.comm.pi.NUADI> {
    private com.qq.e.ads.nativ.NativeUnifiedAD.AdListenerAdapter h;
    private com.qq.e.ads.nativ.NativeADUnifiedListener i;
    private java.util.List<java.lang.Integer> j;
    private java.util.List<java.lang.String> k;
    private volatile int l;
    private volatile int m;
    private java.lang.String n;
    private com.qq.e.comm.constants.LoadAdParams o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AdListenerAdapter implements com.qq.e.comm.adevent.ADListener {
        private com.qq.e.ads.nativ.NativeADUnifiedListener a;

        public AdListenerAdapter(com.qq.e.ads.nativ.NativeADUnifiedListener r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(com.qq.e.comm.adevent.ADEvent r4) {
                r3 = this;
                com.qq.e.ads.nativ.NativeADUnifiedListener r0 = r3.a
                if (r0 == 0) goto L5c
                int r0 = r4.getType()
                r1 = 100
                if (r0 == r1) goto L29
                r1 = 101(0x65, float:1.42E-43)
                if (r0 == r1) goto L11
                goto L5c
            L11:
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                java.lang.Object r4 = r4.getParam(r0)
                java.lang.Integer r4 = (java.lang.Integer) r4
                if (r4 == 0) goto L5c
                com.qq.e.ads.nativ.NativeADUnifiedListener r0 = r3.a
                int r4 = r4.intValue()
                com.qq.e.comm.util.AdError r4 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r4)
                r0.onNoAD(r4)
                return
            L29:
                java.lang.Class<java.util.List> r0 = java.util.List.class
                java.lang.Object r4 = r4.getParam(r0)
                java.util.List r4 = (java.util.List) r4
                if (r4 == 0) goto L5c
                int r0 = r4.size()
                if (r0 <= 0) goto L5c
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r4 = r4.iterator()
            L42:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L57
                java.lang.Object r1 = r4.next()
                com.qq.e.ads.nativ.NativeUnifiedADData r1 = (com.qq.e.ads.nativ.NativeUnifiedADData) r1
                com.qq.e.ads.nativ.NativeUnifiedADDataAdapter r2 = new com.qq.e.ads.nativ.NativeUnifiedADDataAdapter
                r2.<init>(r1)
                r0.add(r2)
                goto L42
            L57:
                com.qq.e.ads.nativ.NativeADUnifiedListener r4 = r3.a
                r4.onADLoaded(r0)
            L5c:
                return
        }
    }

    public NativeUnifiedAD(android.content.Context r2, java.lang.String r3, com.qq.e.ads.nativ.NativeADUnifiedListener r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.j = r0
            r1.i = r4
            com.qq.e.ads.nativ.NativeUnifiedAD$AdListenerAdapter r0 = new com.qq.e.ads.nativ.NativeUnifiedAD$AdListenerAdapter
            r0.<init>(r4)
            r1.h = r0
            r1.a(r2, r3)
            return
    }

    public NativeUnifiedAD(android.content.Context r2, java.lang.String r3, com.qq.e.ads.nativ.NativeADUnifiedListener r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.j = r0
            r1.i = r4
            com.qq.e.ads.nativ.NativeUnifiedAD$AdListenerAdapter r0 = new com.qq.e.ads.nativ.NativeUnifiedAD$AdListenerAdapter
            r0.<init>(r4)
            r1.h = r0
            r1.a(r2, r3, r5)
            return
    }

    private void a(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 != 0) goto L7
            goto L2a
        L7:
            boolean r0 = r1.b()
            if (r0 == 0) goto L1f
            T r3 = r1.a
            if (r3 == 0) goto L2a
            com.qq.e.comm.constants.LoadAdParams r0 = r1.o
            com.qq.e.comm.pi.NUADI r3 = (com.qq.e.comm.pi.NUADI) r3
            if (r0 == 0) goto L1b
            r3.loadData(r2, r0)
            return
        L1b:
            r3.loadData(r2)
            return
        L1f:
            if (r3 == 0) goto L2a
            java.util.List<java.lang.Integer> r3 = r1.j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L2a:
            return
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ java.lang.Object a(android.content.Context r1, com.qq.e.comm.pi.POFactory r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            com.qq.e.comm.pi.NUADI r1 = r0.b(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // com.qq.e.ads.NativeAbstractAD
    protected /* bridge */ /* synthetic */ void a(com.qq.e.comm.pi.NUADI r1) {
            r0 = this;
            com.qq.e.comm.pi.NUADI r1 = (com.qq.e.comm.pi.NUADI) r1
            r0.a2(r1)
            return
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    protected void a2(com.qq.e.comm.pi.NUADI r3) {
            r2 = this;
            super.a(r3)
            int r0 = r2.l
            r3.setMinVideoDuration(r0)
            int r0 = r2.m
            r3.setMaxVideoDuration(r0)
            java.lang.String r0 = r2.n
            r3.setVastClassName(r0)
            java.util.List<java.lang.String> r3 = r2.k
            if (r3 == 0) goto L19
            r2.setCategories(r3)
        L19:
            java.util.List<java.lang.Integer> r3 = r2.j
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r3.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 0
            r2.a(r0, r1)
            goto L1f
        L34:
            return
    }

    @Override // com.qq.e.ads.NativeAbstractAD, com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
            r0 = this;
            com.qq.e.comm.pi.NUADI r1 = (com.qq.e.comm.pi.NUADI) r1
            r0.a2(r1)
            return
    }

    protected com.qq.e.comm.pi.NUADI b(android.content.Context r7, com.qq.e.comm.pi.POFactory r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r6 = this;
            com.qq.e.ads.nativ.NativeUnifiedAD$AdListenerAdapter r5 = r6.h
            r1 = r7
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            com.qq.e.comm.pi.NUADI r7 = r0.getNativeAdManagerDelegate(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int r2) {
            r1 = this;
            com.qq.e.ads.nativ.NativeADUnifiedListener r0 = r1.i
            if (r0 == 0) goto Lb
            com.qq.e.comm.util.AdError r2 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r2)
            r0.onNoAD(r2)
        Lb:
            return
    }

    public java.lang.String getAdNetWorkName() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.NUADI r0 = (com.qq.e.comm.pi.NUADI) r0
            java.lang.String r0 = r0.getAdNetWorkName()
            return r0
        Lb:
            java.lang.String r0 = "getAdNetWorkName"
            r1.a(r0)
            r0 = 0
            return r0
    }

    public void loadData(int r2) {
            r1 = this;
            r0 = 1
            r1.a(r2, r0)
            return
    }

    public void loadData(int r1, com.qq.e.comm.constants.LoadAdParams r2) {
            r0 = this;
            r0.o = r2
            r0.loadData(r1)
            return
    }

    public void setCategories(java.util.List<java.lang.String> r2) {
            r1 = this;
            r1.k = r2
            T r0 = r1.a
            if (r0 == 0) goto Ld
            if (r2 == 0) goto Ld
            com.qq.e.comm.pi.NUADI r0 = (com.qq.e.comm.pi.NUADI) r0
            r0.setCategories(r2)
        Ld:
            return
    }

    public void setMaxVideoDuration(int r2) {
            r1 = this;
            r1.m = r2
            int r2 = r1.m
            if (r2 <= 0) goto L11
            int r2 = r1.l
            int r0 = r1.m
            if (r2 <= r0) goto L11
            java.lang.String r2 = "maxVideoDuration 设置值非法，不得小于minVideoDuration"
            com.qq.e.comm.util.GDTLogger.e(r2)
        L11:
            T r2 = r1.a
            if (r2 == 0) goto L1c
            com.qq.e.comm.pi.NUADI r2 = (com.qq.e.comm.pi.NUADI) r2
            int r0 = r1.m
            r2.setMaxVideoDuration(r0)
        L1c:
            return
    }

    public void setMinVideoDuration(int r2) {
            r1 = this;
            r1.l = r2
            int r2 = r1.m
            if (r2 <= 0) goto L11
            int r2 = r1.l
            int r0 = r1.m
            if (r2 <= r0) goto L11
            java.lang.String r2 = "minVideoDuration 设置值非法，不得大于maxVideoDuration"
            com.qq.e.comm.util.GDTLogger.e(r2)
        L11:
            T r2 = r1.a
            if (r2 == 0) goto L1c
            com.qq.e.comm.pi.NUADI r2 = (com.qq.e.comm.pi.NUADI) r2
            int r0 = r1.l
            r2.setMinVideoDuration(r0)
        L1c:
            return
    }

    public void setVastClassName(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lc
            java.lang.String r2 = "Vast class name 不能为空"
            com.qq.e.comm.util.GDTLogger.e(r2)
            return
        Lc:
            r1.n = r2
            T r0 = r1.a
            if (r0 == 0) goto L17
            com.qq.e.comm.pi.NUADI r0 = (com.qq.e.comm.pi.NUADI) r0
            r0.setVastClassName(r2)
        L17:
            return
    }
}
