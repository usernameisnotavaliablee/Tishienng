package com.bxkj.base.v2.h5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ErrorPageView extends android.widget.LinearLayout {
    public ErrorPageView(@org.jetbrains.annotations.Nullable android.content.Context r2, @org.jetbrains.annotations.NotNull cn.bluemobi.dylan.smartwebview.SmartWebView r3) {
            r1 = this;
            java.lang.String r0 = "smartWebView"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r0 = com.bxkj.base.R.layout.ac_error_page
            android.view.View r2 = r2.inflate(r0, r1)
            int r0 = com.bxkj.base.R.id.bt_refresh
            android.view.View r2 = r2.findViewById(r0)
            android.widget.Button r2 = (android.widget.Button) r2
            com.bxkj.base.v2.h5.f r0 = new com.bxkj.base.v2.h5.f
            r0.<init>(r3)
            r2.setOnClickListener(r0)
            return
    }

    public static /* synthetic */ void a(cn.bluemobi.dylan.smartwebview.SmartWebView r0, android.view.View r1) {
            b(r0, r1)
            return
    }

    private static final void b(cn.bluemobi.dylan.smartwebview.SmartWebView r0, android.view.View r1) {
            r0.l()
            return
    }
}
