package com.bxkj.student.personal.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CollectActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.ImageView Y;
    private com.google.android.material.tabs.TabLayout Z;
    private com.bxkj.student.life.mall.collect.CollectGoodsFragment a0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.student.personal.collect.CollectActivity a;

        a(com.bxkj.student.personal.collect.CollectActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r2 = this;
                com.bxkj.student.personal.collect.CollectActivity r0 = r2.a
                com.google.android.material.tabs.TabLayout r0 = com.bxkj.student.personal.collect.CollectActivity.h0(r0)
                int r0 = r0.getSelectedTabPosition()
                r1 = 2
                if (r0 != r1) goto L1e
                com.bxkj.student.personal.collect.CollectActivity r0 = r2.a
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = com.bxkj.student.personal.collect.CollectActivity.g0(r0)
                if (r0 == 0) goto L1e
                com.bxkj.student.personal.collect.CollectActivity r0 = r2.a
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = com.bxkj.student.personal.collect.CollectActivity.g0(r0)
                r0.Z()
            L1e:
                return
        }
    }

    public CollectActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment g0(com.bxkj.student.personal.collect.CollectActivity r0) {
            com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.material.tabs.TabLayout h0(com.bxkj.student.personal.collect.CollectActivity r0) {
            com.google.android.material.tabs.TabLayout r0 = r0.Z
            return r0
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492920(0x7f0c0038, float:1.8609306E38)
            return r0
    }

    public void R() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bxkj.student.life.InfoFragment r1 = new com.bxkj.student.life.InfoFragment
            r1.<init>()
            r0.add(r1)
            com.bxkj.student.life.InfoFragment r1 = new com.bxkj.student.life.InfoFragment
            r1.<init>()
            r0.add(r1)
            com.bxkj.student.life.mall.collect.CollectGoodsFragment r1 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment
            r1.<init>()
            r5.a0 = r1
            r0.add(r1)
            cn.bluemobi.dylan.base.adapter.b r1 = new cn.bluemobi.dylan.base.adapter.b
            androidx.fragment.app.FragmentManager r2 = r5.getSupportFragmentManager()
            r3 = 2131298030(0x7f0906ee, float:1.8214022E38)
            com.google.android.material.tabs.TabLayout r4 = r5.Z
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "我的收藏"
            r2.setTitle(r0)
            com.bxkj.student.personal.collect.CollectActivity$a r0 = new com.bxkj.student.personal.collect.CollectActivity$a
            r0.<init>(r2)
            java.lang.String r1 = "清空"
            r2.b0(r1, r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131297091(0x7f090343, float:1.8212117E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.Y = r1
            r1 = 2131298632(0x7f090948, float:1.8215243E38)
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
