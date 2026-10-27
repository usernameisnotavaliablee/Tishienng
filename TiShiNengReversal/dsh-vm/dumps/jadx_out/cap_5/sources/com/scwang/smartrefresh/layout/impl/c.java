package com.scwang.smartrefresh.layout.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c implements l2.e {
    private android.view.View a;
    private com.scwang.smartrefresh.layout.constant.SpinnerStyle b;

    public c(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            android.view.View r2 = r0.a
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r3 = r2 instanceof com.scwang.smartrefresh.layout.SmartRefreshLayout.o
            if (r3 == 0) goto L11
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout.o) r2
            int r2 = r2.a
            r1.f(r2)
        L11:
            return
    }

    public void g(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @androidx.annotation.NonNull
    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r2.b
            if (r0 == 0) goto L5
            return r0
        L5:
            android.view.View r0 = r2.a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof com.scwang.smartrefresh.layout.SmartRefreshLayout.o
            if (r1 == 0) goto L19
            r1 = r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout.o) r1
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r1 = r1.b
            r2.b = r1
            if (r1 == 0) goto L19
            return r1
        L19:
            if (r0 == 0) goto L25
            int r0 = r0.height
            r1 = -1
            if (r0 != r1) goto L25
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            r2.b = r0
            return r0
        L25:
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            r2.b = r0
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r1 = this;
            android.view.View r0 = r1.a
            return r0
    }

    public void i(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void j(float r1, int r2, int r3) {
            r0 = this;
            return
    }

    public boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r1) {
            r0 = this;
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public int w(l2.h r1, boolean r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void x(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }
}
