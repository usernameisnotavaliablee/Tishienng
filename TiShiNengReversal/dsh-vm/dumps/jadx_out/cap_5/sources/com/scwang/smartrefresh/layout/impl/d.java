package com.scwang.smartrefresh.layout.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d implements l2.i {
    protected android.view.MotionEvent a;
    protected l2.i b;
    protected boolean c;

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean a(android.view.View r2) {
            r1 = this;
            l2.i r0 = r1.b
            if (r0 == 0) goto L9
            boolean r2 = r0.a(r2)
            return r2
        L9:
            boolean r0 = r1.c
            if (r0 == 0) goto L16
            android.view.MotionEvent r0 = r1.a
            boolean r2 = com.scwang.smartrefresh.layout.util.d.d(r2, r0)
            r2 = r2 ^ 1
            return r2
        L16:
            android.view.MotionEvent r0 = r1.a
            boolean r2 = com.scwang.smartrefresh.layout.util.d.a(r2, r0)
            return r2
    }

    public boolean b(android.view.View r2) {
            r1 = this;
            l2.i r0 = r1.b
            if (r0 == 0) goto L9
            boolean r2 = r0.b(r2)
            return r2
        L9:
            android.view.MotionEvent r0 = r1.a
            boolean r2 = com.scwang.smartrefresh.layout.util.d.b(r2, r0)
            return r2
    }

    void c(android.view.MotionEvent r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void d(boolean r1) {
            r0 = this;
            r0.c = r1
            return
    }

    void e(l2.i r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
