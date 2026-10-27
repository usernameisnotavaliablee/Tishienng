package com.kwad.components.core.page.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends android.app.Dialog {
    private final com.kwad.components.core.page.widget.a.InterfaceC0088a VC;
    private final java.lang.String VD;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.page.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0088a {
        void a(android.content.DialogInterface r1);

        void b(android.content.DialogInterface r1);

        void c(android.content.DialogInterface r1);
    }

    public a(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.kwad.components.core.page.widget.a.InterfaceC0088a r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public a(@androidx.annotation.NonNull android.content.Context r2, java.lang.String r3, @androidx.annotation.NonNull com.kwad.components.core.page.widget.a.InterfaceC0088a r4) {
            r1 = this;
            r1.<init>(r2)
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto Lc
            android.app.Activity r2 = (android.app.Activity) r2
            r1.setOwnerActivity(r2)
        Lc:
            r1.VC = r4
            r1.VD = r3
            return
    }

    static /* synthetic */ com.kwad.components.core.page.widget.a.InterfaceC0088a a(com.kwad.components.core.page.widget.a r0) {
            com.kwad.components.core.page.widget.a$a r0 = r0.VC
            return r0
    }

    private android.view.View rO() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int r1 = com.kwad.sdk.R.layout.ksad_web_exit_intercept_content_layout
            r2 = 0
            android.view.View r0 = com.kwad.sdk.o.m.inflate(r0, r1, r2)
            int r1 = com.kwad.sdk.R.id.ksad_exit_intercept_dialog_layout
            android.view.View r1 = r0.findViewById(r1)
            com.kwad.components.core.page.widget.a$1 r2 = new com.kwad.components.core.page.widget.a$1
            r2.<init>(r3)
            r1.setOnClickListener(r2)
            int r1 = com.kwad.sdk.R.id.ksad_exit_intercept_content_layout
            android.view.View r1 = r0.findViewById(r1)
            com.kwad.components.core.page.widget.a$2 r2 = new com.kwad.components.core.page.widget.a$2
            r2.<init>(r3)
            r1.setOnClickListener(r2)
            int r1 = com.kwad.sdk.R.id.ksad_web_exit_intercept_positive_btn
            android.view.View r1 = r0.findViewById(r1)
            com.kwad.components.core.page.widget.a$3 r2 = new com.kwad.components.core.page.widget.a$3
            r2.<init>(r3)
            r1.setOnClickListener(r2)
            int r1 = com.kwad.sdk.R.id.ksad_web_exit_intercept_negative_btn
            android.view.View r1 = r0.findViewById(r1)
            com.kwad.components.core.page.widget.a$4 r2 = new com.kwad.components.core.page.widget.a$4
            r2.<init>(r3)
            r1.setOnClickListener(r2)
            int r1 = com.kwad.sdk.R.id.ksad_exit_intercept_content
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r3.VD
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L58
            java.lang.String r2 = r3.VD
            r1.setText(r2)
        L58:
            return r0
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            r3 = 1
            r2.requestWindowFeature(r3)     // Catch: java.lang.Exception -> L7
        L7:
            android.view.View r3 = r2.rO()
            r2.setContentView(r3)
            r3 = 0
            r2.setCanceledOnTouchOutside(r3)
            android.view.Window r0 = r2.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r3)
            r0.setBackgroundDrawable(r1)
            android.view.Window r0 = r2.getWindow()
            r1 = -1
            r0.setLayout(r1, r1)
            r2.setCancelable(r3)
            return
    }
}
