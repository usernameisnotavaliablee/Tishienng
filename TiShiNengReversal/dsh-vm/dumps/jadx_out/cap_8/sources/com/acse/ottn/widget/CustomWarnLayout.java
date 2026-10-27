package com.acse.ottn.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CustomWarnLayout extends android.widget.LinearLayout {
    private android.widget.RelativeLayout sncakbar_relativeLayout;
    private android.widget.TextView textView;
    private android.widget.TextView tv_look;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.widget.CustomWarnLayout f2880b;

        public a(com.acse.ottn.widget.CustomWarnLayout r1, android.app.Activity r2) {
                r0 = this;
                r0.f2880b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.app.Activity r2 = r1.a
                r0 = 10010(0x271a, float:1.4027E-41)
                com.acse.ottn.activity.AcseHelpManager.startAccessibilityIntroduceActivityForResult(r2, r0)
                return
        }
    }

    public CustomWarnLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public CustomWarnLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = com.acse.ottn.R.layout.my_seeding_snackbar
            r0 = 1
            r2.inflate(r3, r1, r0)
            int r2 = com.acse.ottn.R.id.tv_content
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.textView = r2
            int r2 = com.acse.ottn.R.id.sncakbar_relativeLayout
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r1.sncakbar_relativeLayout = r2
            int r2 = com.acse.ottn.R.id.tv_look
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.tv_look = r2
            r1.initView()
            r1.invalidate()
            return
    }

    public CustomWarnLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void initView() {
            r2 = this;
            boolean r0 = com.acse.ottn.activity.AcseHelpManager.isOPenPermission()
            if (r0 == 0) goto Ld
            android.widget.RelativeLayout r0 = r2.sncakbar_relativeLayout
            r1 = 8
            r0.setVisibility(r1)
        Ld:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            android.widget.RelativeLayout r0 = r1.sncakbar_relativeLayout
            r0.setBackgroundResource(r2)
            return
    }

    public void setButtonBackgroundResource(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.tv_look
            r0.setBackgroundResource(r2)
            return
    }

    public void setButtonPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.widget.TextView r0 = r1.tv_look
            r0.setPadding(r2, r3, r4, r5)
            return
    }

    public void setButtonText(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.tv_look
            r0.setText(r2)
            return
    }

    public void setButtonTextSize(float r2) {
            r1 = this;
            android.widget.TextView r0 = r1.tv_look
            r0.setTextSize(r2)
            return
    }

    public void setContentText(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setText(r2)
            return
    }

    public void setContentTextSize(float r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setTextSize(r2)
            return
    }

    public void setOnClickListener(android.app.Activity r3) {
            r2 = this;
            android.widget.RelativeLayout r0 = r2.sncakbar_relativeLayout
            com.acse.ottn.widget.CustomWarnLayout$a r1 = new com.acse.ottn.widget.CustomWarnLayout$a
            r1.<init>(r2, r3)
            r0.setOnClickListener(r1)
            r2.invalidate()
            return
    }
}
