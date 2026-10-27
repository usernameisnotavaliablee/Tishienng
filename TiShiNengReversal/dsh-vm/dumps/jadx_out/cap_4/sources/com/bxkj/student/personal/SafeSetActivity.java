package com.bxkj.student.personal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SafeSetActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView Y;
    private android.widget.TextView Z;

    public SafeSetActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public void L() {
            r1 = this;
            android.widget.TextView r0 = r1.Y
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r1.Z
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493019(0x7f0c009b, float:1.8609506E38)
            return r0
    }

    public void R() {
            r0 = this;
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "安全设置"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131299174(0x7f090b66, float:1.8216342E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131298915(0x7f090a63, float:1.8215817E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131298915(0x7f090a63, float:1.8215817E38)
            if (r3 == r0) goto L1c
            r0 = 2131299174(0x7f090b66, float:1.8216342E38)
            if (r3 == r0) goto Lf
            return
        Lf:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.personal.password.UpdatePasswordActivity> r1 = com.bxkj.student.personal.password.UpdatePasswordActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
        L1c:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.personal.password.forget.FindPasswordTypeActivity> r1 = com.bxkj.student.personal.password.forget.FindPasswordTypeActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }
}
