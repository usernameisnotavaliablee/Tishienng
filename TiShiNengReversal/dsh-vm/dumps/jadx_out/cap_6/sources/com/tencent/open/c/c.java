package com.tencent.open.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends android.widget.FrameLayout {
    public c(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void a(android.view.WindowInsets r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L7
            goto L42
        L7:
            if (r5 != 0) goto La
            goto L42
        La:
            android.view.DisplayCutout r5 = androidx.core.view.x1.a(r5)
            if (r5 != 0) goto L11
            goto L42
        L11:
            java.util.List r0 = com.tencent.open.c.e.a(r5)
            if (r0 == 0) goto L42
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1e
            goto L42
        L1e:
            int r0 = com.bytedance.sdk.openadsdk.core.i.j.e.a(r5)
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            int r2 = com.bytedance.sdk.openadsdk.core.i.j.c.a(r5)
            int r2 = java.lang.Math.max(r2, r1)
            int r3 = com.bytedance.sdk.openadsdk.core.i.j.k.a(r5)
            int r3 = java.lang.Math.max(r3, r1)
            int r5 = com.bytedance.sdk.openadsdk.core.i.j.d.a(r5)
            int r5 = java.lang.Math.max(r5, r1)
            r4.setPadding(r0, r2, r3, r5)
        L42:
            return
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r1) {
            r0 = this;
            r0.a(r1)
            android.view.WindowInsets r1 = super.onApplyWindowInsets(r1)
            return r1
    }
}
