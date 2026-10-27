package com.bxkj.student.run.punchcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RecorderListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.RadioGroup Y;
    private java.lang.String Z;

    public RecorderListActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493004(0x7f0c008c, float:1.8609476E38)
            return r0
    }

    public void R() {
            r6 = this;
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "termId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r6.Z = r0
        L16:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bxkj.student.run.punchcard.RecordListFragment r2 = new com.bxkj.student.run.punchcard.RecordListFragment
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "effective"
            java.lang.String r5 = "type"
            r3.putString(r5, r4)
            java.lang.String r4 = r6.Z
            r3.putString(r1, r4)
            r2.setArguments(r3)
            r0.add(r2)
            com.bxkj.student.run.punchcard.RecordListFragment r2 = new com.bxkj.student.run.punchcard.RecordListFragment
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "all"
            r3.putString(r5, r4)
            java.lang.String r4 = r6.Z
            r3.putString(r1, r4)
            r2.setArguments(r3)
            r0.add(r2)
            cn.bluemobi.dylan.base.adapter.a r1 = new cn.bluemobi.dylan.base.adapter.a
            androidx.fragment.app.FragmentManager r2 = r6.getSupportFragmentManager()
            r3 = 2131298030(0x7f0906ee, float:1.8214022E38)
            android.widget.RadioGroup r4 = r6.Y
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "刷脸统计"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298361(0x7f090839, float:1.8214693E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RadioGroup r1 = (android.widget.RadioGroup) r1
            r0.Y = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
