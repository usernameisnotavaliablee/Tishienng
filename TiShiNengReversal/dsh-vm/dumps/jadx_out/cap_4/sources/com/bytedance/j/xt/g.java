package com.bytedance.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g {
    private java.util.Map<com.bytedance.j.xt.cw, java.util.List<com.bytedance.j.xt.b>> a;
    private java.util.Map<java.lang.String, java.lang.String> b;
    private final java.util.List<java.lang.Object> c;
    private final java.util.List<java.lang.Object> d;
    private final java.util.List<java.lang.Object> e;
    private final java.util.List<java.lang.Object> f;
    private com.bytedance.j.xt.c g;

    public g() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.c = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.d = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.e = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f = r0
            r0 = 0
            r1.g = r0
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<java.lang.Object> a() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.f
            return r0
    }

    @androidx.annotation.Nullable
    public java.util.List<com.bytedance.j.xt.b> b(com.bytedance.j.xt.cw r2) {
            r1 = this;
            java.util.Map<com.bytedance.j.xt.cw, java.util.List<com.bytedance.j.xt.b>> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public java.util.Map<java.lang.String, java.lang.String> c() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.b
            return r0
    }

    void d(com.bytedance.j.xt.c r1) {
            r0 = this;
            r0.g = r1
            return
    }

    void e(java.util.Map<? extends java.lang.String, ? extends java.lang.String> r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.b
            r0.putAll(r2)
            return
    }

    @androidx.annotation.Nullable
    public com.bytedance.j.xt.c f() {
            r1 = this;
            com.bytedance.j.xt.c r0 = r1.g
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<java.lang.Object> g() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.d
            return r0
    }
}
