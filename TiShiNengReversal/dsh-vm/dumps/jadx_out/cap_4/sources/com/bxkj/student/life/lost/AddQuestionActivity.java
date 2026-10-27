package com.bxkj.student.life.lost;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AddQuestionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.EditText Y;
    private android.widget.EditText Z;
    private android.widget.Button a0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.life.lost.AddQuestionActivity a;

        a(com.bxkj.student.life.lost.AddQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.bxkj.student.life.lost.AddQuestionActivity r1 = r0.a
                com.bxkj.student.life.lost.AddQuestionActivity.g0(r1)
                return
        }
    }

    public AddQuestionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ void g0(com.bxkj.student.life.lost.AddQuestionActivity r0) {
            r0.h0()
            return
    }

    private void h0() {
            r4 = this;
            android.widget.EditText r0 = r4.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            android.widget.EditText r1 = r4.Z
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L28
            java.lang.String r0 = "请填写问题"
            r4.f0(r0)
            return
        L28:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L34
            java.lang.String r0 = "请填写答案"
            r4.f0(r0)
            return
        L34:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "question"
            r2.putExtra(r3, r0)
            java.lang.String r0 = "answer"
            r2.putExtra(r0, r1)
            r0 = -1
            r4.setResult(r0, r2)
            r4.finish()
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.a0
            com.bxkj.student.life.lost.AddQuestionActivity$a r1 = new com.bxkj.student.life.lost.AddQuestionActivity$a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492894(0x7f0c001e, float:1.8609253E38)
            return r0
    }

    public void R() {
            r0 = this;
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "添加问题"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131296945(0x7f0902b1, float:1.821182E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.Y = r1
            r1 = 2131296927(0x7f09029f, float:1.8211784E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.Z = r1
            r1 = 2131296642(0x7f090182, float:1.8211206E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.a0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
