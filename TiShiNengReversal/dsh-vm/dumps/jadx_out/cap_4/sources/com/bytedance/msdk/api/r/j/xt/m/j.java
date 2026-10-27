package com.bytedance.msdk.api.r.j.xt.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j extends com.bytedance.sdk.openadsdk.core.wq.r {
    private static final java.lang.String cw = null;
    protected long j;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.msdk.api.r.j.xt.cw.xt f2168r;
    private final java.util.concurrent.atomic.AtomicBoolean up;
    protected int xt;

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TTMediationSDK_"
            r0.<init>(r1)
            java.lang.Class<com.bytedance.msdk.api.r.j.xt.m.j> r1 = com.bytedance.msdk.api.r.j.xt.m.j.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.api.r.j.xt.m.j.cw = r0
            return
    }

    public j() {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r4.up = r0
            r2 = 0
            r4.j = r2
            r4.xt = r1
            return
    }

    public void ae() {
            r2 = this;
            r0 = 0
            r2.xt = r0
            r0 = 0
            r2.j = r0
            return
    }

    public final void cw() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.up
            r1 = 1
            r0.set(r1)
            return
    }

    public abstract java.lang.String j();

    @androidx.annotation.Nullable
    public java.lang.String j(android.content.Context r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public abstract void j(android.content.Context r1, com.bytedance.msdk.api.r.j.xt.cw.xt r2, java.util.Map<java.lang.String, java.lang.Object> r3);

    public int m() {
            r1 = this;
            int r0 = r1.xt
            return r0
    }

    public final boolean r() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.up
            boolean r0 = r0.get()
            return r0
    }

    public long up() {
            r2 = this;
            long r0 = r2.j
            return r0
    }

    public abstract java.lang.String xt();

    @androidx.annotation.Nullable
    public java.lang.String xt(android.content.Context r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public final void xt(android.content.Context r3, com.bytedance.msdk.api.r.j.xt.cw.xt r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.up
            r1 = 0
            r0.set(r1)
            r2.f2168r = r4
            r2.j(r3, r4, r5)
            return
    }
}
