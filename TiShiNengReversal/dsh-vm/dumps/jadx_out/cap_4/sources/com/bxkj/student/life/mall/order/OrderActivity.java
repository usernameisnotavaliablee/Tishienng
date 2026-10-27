package com.bxkj.student.life.mall.order;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class OrderActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.google.android.material.tabs.TabLayout Y;

    public OrderActivity() {
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
            r0 = 2131492983(0x7f0c0077, float:1.8609433E38)
            return r0
    }

    public void R() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            r2 = 8
            if (r1 >= r2) goto L22
            com.bxkj.student.life.mall.order.OrderFragment r2 = new com.bxkj.student.life.mall.order.OrderFragment
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "index"
            r3.putInt(r4, r1)
            r2.setArguments(r3)
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L22:
            cn.bluemobi.dylan.base.adapter.b r1 = new cn.bluemobi.dylan.base.adapter.b
            androidx.fragment.app.FragmentManager r2 = r5.getSupportFragmentManager()
            r3 = 2131298030(0x7f0906ee, float:1.8214022E38)
            com.google.android.material.tabs.TabLayout r4 = r5.Y
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "我的订单"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298632(0x7f090948, float:1.8215243E38)
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r0.Y = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
