package com.bytedance.msdk.core.j.j.xt.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.msdk.xt.cw {
    private java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> g;
    private volatile boolean jy;
    private com.bytedance.msdk.core.oq.oq oq;
    private com.bytedance.msdk.core.j.j.xt.j qv;
    private com.bytedance.msdk.api.j.xt vl;








    public xt(com.bytedance.msdk.core.j.j.xt.j r2, java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.jy = r0
            r1.g = r3
            r1.qv = r2
            com.bytedance.msdk.core.oq.oq r3 = r2.xt
            r1.oq = r3
            com.bytedance.msdk.api.j.xt r2 = r2.j
            r1.vl = r2
            r1.m12if()
            com.bytedance.msdk.core.oq.oq r2 = r1.oq
            if (r2 == 0) goto L36
            boolean r2 = r2.la()
            if (r2 == 0) goto L27
            double r2 = r1.os()
            r1.j(r2)
            return
        L27:
            com.bytedance.msdk.core.oq.oq r2 = r1.oq
            boolean r2 = r2.rn()
            if (r2 == 0) goto L36
            java.lang.String r2 = r1.so()
            r1.ws(r2)
        L36:
            return
    }

    static /* synthetic */ java.lang.Integer cw(com.bytedance.msdk.core.j.j.xt.j.j.xt r0) {
            java.lang.Integer r0 = r0.xj()
            return r0
    }

    private int ej() {
            r5 = this;
            com.bytedance.msdk.core.j.j.xt.j.j.xt$1 r0 = new com.bytedance.msdk.core.j.j.xt.j.j.xt$1
            r0.<init>(r5)
            java.util.concurrent.Future r0 = com.bytedance.msdk.j.up.m.j(r0)
            r1 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L1b
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = r0.get(r3, r2)     // Catch: java.lang.Exception -> L1b
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L1b
            if (r0 == 0) goto L1d
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L1b
            return r0
        L1b:
            r0 = move-exception
            goto L1e
        L1d:
            return r1
        L1e:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return r1
    }

    private java.lang.String fk() {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.g
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 40004(0x9c44, float:5.6058E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = -99999987(0xfffffffffa0a1f0d, float:-1.7929169E35)
            r0.put(r2, r1)
            r1 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0.put(r1, r2)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r3.g
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r1, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L2e
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L2e:
            r0 = 0
            return r0
    }

    private void fz() {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.g
            if (r0 == 0) goto L23
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 40011(0x9c4b, float:5.6067E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = -99999987(0xfffffffffa0a1f0d, float:-1.7929169E35)
            r0.put(r2, r1)
            r1 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r3.g
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L23:
            return
    }

    private com.bytedance.msdk.api.r.j.j.j id() {
            r1 = this;
            com.bytedance.msdk.j.xt.m r0 = r1.ae
            com.bytedance.msdk.api.r.j.j.j r0 = (com.bytedance.msdk.api.r.j.j.j) r0
            return r0
    }

    /* renamed from: if, reason: not valid java name */
    private void m12if() {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.g
            if (r0 == 0) goto L29
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 40009(0x9c49, float:5.6065E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = -99999987(0xfffffffffa0a1f0d, float:-1.7929169E35)
            r0.put(r2, r1)
            r1 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            r1 = 50009(0xc359, float:7.0078E-41)
            r0.put(r1, r3)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r3.g
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L29:
            return
    }

    static /* synthetic */ int j(com.bytedance.msdk.core.j.j.xt.j.j.xt r0) {
            int r0 = r0.to()
            return r0
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.j.j.xt.j.j.xt r0, int r1) {
            r0.x(r1)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.j.j.xt.j.j.xt r0, java.util.Map r1) {
            r0.m(r1)
            return
    }

    private android.view.View kj() {
            r4 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r4.g
            r1 = 0
            if (r0 == 0) goto L2c
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2 = 40035(0x9c63, float:5.6101E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = -99999987(0xfffffffffa0a1f0d, float:-1.7929169E35)
            r0.put(r3, r2)
            r2 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
            java.lang.Class<android.view.View> r3 = android.view.View.class
            r0.put(r2, r3)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r2 = r4.g
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r2, r0)
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L2c
            android.view.View r0 = (android.view.View) r0
            return r0
        L2c:
            return r1
    }

    private java.lang.String lo() {
            r4 = this;
            com.bytedance.msdk.core.j.j.xt.j.j.xt$7 r0 = new com.bytedance.msdk.core.j.j.xt.j.j.xt$7
            r0.<init>(r4)
            java.util.concurrent.Future r0 = com.bytedance.msdk.j.up.m.j(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L14
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = r0.get(r2, r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r0 = 0
            return r0
    }

    private void m(java.util.Map<java.lang.String, java.lang.Object> r4) {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.g
            if (r0 == 0) goto L29
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 40014(0x9c4e, float:5.6072E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = -99999987(0xfffffffffa0a1f0d, float:-1.7929169E35)
            r0.put(r2, r1)
            r1 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            r1 = 50010(0xc35a, float:7.0079E-41)
            r0.put(r1, r4)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r4 = r3.g
            com.bytedance.msdk.core.ae.a.a(r4, r0)
        L29:
            return
    }

    private double os() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            com.bytedance.msdk.core.j.j.xt.j r0 = r2.qv
            if (r0 == 0) goto L17
            boolean r0 = r0.cw()
            if (r0 == 0) goto L17
            int r0 = r2.ej()
        L15:
            double r0 = (double) r0
            return r0
        L17:
            int r0 = r2.to()
            goto L15
    }

    private java.lang.String ot() {
            r5 = this;
            java.lang.String r0 = ""
            com.bytedance.msdk.core.j.j.xt.j.j.xt$2 r1 = new com.bytedance.msdk.core.j.j.xt.j.j.xt$2
            r1.<init>(r5)
            java.util.concurrent.Future r1 = com.bytedance.msdk.j.up.m.j(r1)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L19
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = r1.get(r3, r2)     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L19
            if (r1 == 0) goto L18
            return r1
        L18:
            return r0
        L19:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            return r0
    }

    static /* synthetic */ void r(com.bytedance.msdk.core.j.j.xt.j.j.xt r0) {
            r0.fz()
            return
    }

    private java.lang.String so() {
            r1 = this;
            com.bytedance.msdk.core.j.j.xt.j r0 = r1.qv
            if (r0 == 0) goto Lf
            boolean r0 = r0.cw()
            if (r0 == 0) goto Lf
            java.lang.String r0 = r1.ot()
            return r0
        Lf:
            java.lang.String r0 = r1.fk()
            return r0
    }

    private int to() {
            r4 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r4.g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2 = 40003(0x9c43, float:5.6056E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = -99999987(0xfffffffffa0a1f0d, float:-1.7929169E35)
            r0.put(r3, r2)
            r2 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            r0.put(r2, r3)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r2 = r4.g
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r2, r0)
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L31
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L32
        L31:
            r0 = 0
        L32:
            r2 = -1
            if (r0 != r2) goto L36
            return r1
        L36:
            return r0
    }

    static /* synthetic */ java.lang.String up(com.bytedance.msdk.core.j.j.xt.j.j.xt r0) {
            java.lang.String r0 = r0.vr()
            return r0
    }

    private java.lang.Integer ve() {
            r5 = this;
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.bytedance.msdk.core.j.j.xt.j.j.xt$3 r1 = new com.bytedance.msdk.core.j.j.xt.j.j.xt$3
            r1.<init>(r5)
            java.util.concurrent.Future r1 = com.bytedance.msdk.j.up.m.j(r1)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L1c
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = r1.get(r3, r2)     // Catch: java.lang.Exception -> L1c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L1b
            return r1
        L1b:
            return r0
        L1c:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            return r0
    }

    private java.lang.String vr() {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.g
            if (r0 == 0) goto L37
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 40015(0x9c4f, float:5.6073E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = -99999987(0xfffffffffa0a1f0d, float:-1.7929169E35)
            r0.put(r2, r1)
            r1 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            r0.put(r1, r2)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r3.g
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r1, r0)
            boolean r1 = r0 instanceof java.util.Map
            if (r1 == 0) goto L37
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "request_id"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L37
            java.lang.String r0 = r0.toString()
            return r0
        L37:
            java.lang.String r0 = ""
            return r0
    }

    private void x(int r4) {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.g
            if (r0 == 0) goto L2d
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 40013(0x9c4d, float:5.607E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = -99999987(0xfffffffffa0a1f0d, float:-1.7929169E35)
            r0.put(r2, r1)
            r1 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            r1 = 50007(0xc357, float:7.0075E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r1, r4)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r4 = r3.g
            com.bytedance.msdk.core.ae.a.a(r4, r0)
        L2d:
            return
    }

    private java.lang.Integer xj() {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.g
            if (r0 == 0) goto L32
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 40010(0x9c4a, float:5.6066E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = -99999987(0xfffffffffa0a1f0d, float:-1.7929169E35)
            r0.put(r2, r1)
            r1 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r3.g
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L32:
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.String xt(com.bytedance.msdk.core.j.j.xt.j.j.xt r0) {
            java.lang.String r0 = r0.so()
            return r0
    }

    public <T> T applyFunction(int r1, com.bykv.vk.openvk.api.proto.PluginValueSet r2, java.lang.Class<T> r3) {
            r0 = this;
            r2 = 60009(0xea69, float:8.409E-41)
            r3 = 0
            if (r1 != r2) goto L14
            com.bytedance.msdk.j.xt.m r1 = r0.ae
            boolean r1 = r1 instanceof com.bytedance.msdk.api.r.j.j.j
            if (r1 == 0) goto L44
            com.bytedance.msdk.api.r.j.j.j r1 = r0.id()
            r1.xt(r3)
            goto L44
        L14:
            r2 = 60006(0xea66, float:8.4086E-41)
            if (r1 != r2) goto L32
            com.bytedance.msdk.j.xt.m r1 = r0.ae
            boolean r1 = r1 instanceof com.bytedance.msdk.api.r.j.j.j
            if (r1 == 0) goto L44
            com.bytedance.msdk.api.j.xt r1 = r0.vl
            if (r1 == 0) goto L2a
            java.lang.String r1 = r1.v()
            com.bytedance.msdk.core.xt.j.j(r1)
        L2a:
            com.bytedance.msdk.api.r.j.j.j r1 = r0.id()
            r1.f_()
            goto L44
        L32:
            r2 = 60004(0xea64, float:8.4084E-41)
            if (r1 != r2) goto L44
            com.bytedance.msdk.j.xt.m r1 = r0.ae
            boolean r1 = r1 instanceof com.bytedance.msdk.api.r.j.j.j
            if (r1 == 0) goto L44
            com.bytedance.msdk.api.r.j.j.j r1 = r0.id()
            r1.j(r3)
        L44:
            return r3
    }

    public android.view.View g() {
            r1 = this;
            android.view.View r0 = r1.kj()
            return r0
    }

    public void j(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            com.bytedance.msdk.core.oq.oq r0 = r1.oq
            if (r0 != 0) goto L5
            goto Le
        L5:
            boolean r0 = r0.la()
            if (r0 != 0) goto Lc
            goto Le
        Lc:
            if (r2 != 0) goto Lf
        Le:
            return
        Lf:
            com.bytedance.msdk.core.j.j.xt.j r0 = r1.qv
            if (r0 == 0) goto L22
            boolean r0 = r0.cw()
            if (r0 == 0) goto L22
            com.bytedance.msdk.core.j.j.xt.j.j.xt$6 r0 = new com.bytedance.msdk.core.j.j.xt.j.j.xt$6
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.r(r0)
            return
        L22:
            r1.m(r2)
            return
    }

    public java.lang.Integer m() {
            r1 = this;
            com.bytedance.msdk.core.j.j.xt.j r0 = r1.qv
            if (r0 == 0) goto Lf
            boolean r0 = r0.cw()
            if (r0 == 0) goto Lf
            java.lang.Integer r0 = r1.ve()
            return r0
        Lf:
            java.lang.Integer r0 = r1.xj()
            return r0
    }

    public java.lang.String o() {
            r1 = this;
            com.bytedance.msdk.core.j.j.xt.j r0 = r1.qv
            if (r0 == 0) goto Lf
            boolean r0 = r0.cw()
            if (r0 == 0) goto Lf
            java.lang.String r0 = r1.lo()
            return r0
        Lf:
            java.lang.String r0 = r1.vr()
            return r0
    }

    public boolean up() {
            r1 = this;
            boolean r0 = r1.jy
            return r0
    }

    public void w() {
            r1 = this;
            super.w()
            r0 = 1
            r1.jy = r0
            com.bytedance.msdk.core.j.j.xt.j.j.xt$4 r0 = new com.bytedance.msdk.core.j.j.xt.j.j.xt$4
            r0.<init>(r1)
            com.bytedance.msdk.j.up.m.cw(r0)
            return
    }

    public void xt(java.util.Map<java.lang.String, java.lang.Object> r3) {
            r2 = this;
            com.bytedance.msdk.core.oq.oq r3 = r2.oq
            if (r3 != 0) goto L5
            goto Lb
        L5:
            boolean r3 = r3.la()
            if (r3 != 0) goto Lc
        Lb:
            return
        Lc:
            double r0 = r2.t()
            int r3 = (int) r0
            com.bytedance.msdk.core.j.j.xt.j r0 = r2.qv
            if (r0 == 0) goto L24
            boolean r0 = r0.cw()
            if (r0 == 0) goto L24
            com.bytedance.msdk.core.j.j.xt.j.j.xt$5 r0 = new com.bytedance.msdk.core.j.j.xt.j.j.xt$5
            r0.<init>(r2, r3)
            com.bytedance.msdk.j.up.m.r(r0)
            return
        L24:
            r2.x(r3)
            return
    }
}
