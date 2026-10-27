package com.bxkj.student.run.app.set.brandset;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class OtherSetFramgment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView j;

    public OtherSetFramgment() {
            r0 = this;
            r0.<init>()
            return
    }

    private void N(android.text.SpannableString r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = r4.toString()
            int r0 = r0.indexOf(r5)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r2 = 1
            r1.<init>(r2)
            int r5 = r5.length()
            int r5 = r5 + r0
            r2 = 33
            r4.setSpan(r1, r0, r5, r2)
            return
    }

    private void O(android.text.SpannableString r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = r4.toString()
            int r0 = r0.lastIndexOf(r5)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r2 = 1
            r1.<init>(r2)
            int r5 = r5.length()
            int r5 = r5 + r0
            r2 = 33
            r4.setSpan(r1, r0, r5, r2)
            return
    }

    public void b() {
            r0 = this;
            return
    }

    protected void e() {
            r5 = this;
            android.text.SpannableString r0 = new android.text.SpannableString
            r1 = 2131952378(0x7f1302fa, float:1.9541197E38)
            java.lang.String r1 = r5.getString(r1)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "【"
            r1.append(r2)
            r3 = 2131951695(0x7f13004f, float:1.9539812E38)
            java.lang.String r4 = r5.getString(r3)
            r1.append(r4)
            java.lang.String r4 = "】"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r5.N(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = r5.getString(r3)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r5.O(r0, r1)
            java.lang.String r1 = "【后台运行】"
            r5.N(r0, r1)
            java.lang.String r1 = "【自启动】"
            r5.N(r0, r1)
            java.lang.String r1 = "【后台定位】"
            r5.N(r0, r1)
            java.lang.String r1 = "【后台联网】"
            r5.N(r0, r1)
            android.widget.TextView r1 = r5.j
            r1.setText(r0)
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131299097(0x7f090b19, float:1.8216186E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.j = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493197(0x7f0c014d, float:1.8609867E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
