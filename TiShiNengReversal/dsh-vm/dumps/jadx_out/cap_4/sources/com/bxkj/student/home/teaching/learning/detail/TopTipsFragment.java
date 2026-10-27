package com.bxkj.student.home.teaching.learning.detail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TopTipsFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView j;

    public TopTipsFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String N(long r4) {
            r3 = this;
            r0 = 60
            long r4 = r4 / r0
            r0 = 10
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "0"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L1b:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
    }

    public java.lang.String O(long r4) {
            r3 = this;
            r0 = 60
            long r4 = r4 % r0
            r0 = 10
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "0"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L1b:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
    }

    public void b() {
            r0 = this;
            return
    }

    protected void e() {
            r5 = this;
            android.os.Bundle r0 = r5.getArguments()
            java.lang.String r1 = "duration"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L59
            android.os.Bundle r0 = r5.getArguments()
            java.lang.String r0 = r0.getString(r1)
            android.os.Bundle r1 = r5.getArguments()
            java.lang.String r2 = "integral"
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "本资源时长"
            r2.append(r3)
            long r3 = java.lang.Long.parseLong(r0)
            java.lang.String r3 = r5.N(r3)
            r2.append(r3)
            java.lang.String r3 = "分"
            r2.append(r3)
            long r3 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = r5.O(r3)
            r2.append(r0)
            java.lang.String r0 = "秒，积分"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "分，底部倒计时结束后，方可积分。提前退出资源观看页面，不积分，不显示进度条。只有第一次积分。"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.widget.TextView r1 = r5.j
            r1.setText(r0)
        L59:
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131298879(0x7f090a3f, float:1.8215744E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.j = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493190(0x7f0c0146, float:1.8609853E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
