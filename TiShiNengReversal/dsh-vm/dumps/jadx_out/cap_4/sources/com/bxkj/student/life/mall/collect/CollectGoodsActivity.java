package com.bxkj.student.life.mall.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CollectGoodsActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.bxkj.student.life.mall.collect.CollectGoodsFragment Y;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsActivity a;

        a(com.bxkj.student.life.mall.collect.CollectGoodsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r1 = this;
                com.bxkj.student.life.mall.collect.CollectGoodsActivity r0 = r1.a
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = com.bxkj.student.life.mall.collect.CollectGoodsActivity.g0(r0)
                r0.Z()
                return
        }
    }

    public CollectGoodsActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment g0(com.bxkj.student.life.mall.collect.CollectGoodsActivity r0) {
            com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r0.Y
            return r0
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492947(0x7f0c0053, float:1.860936E38)
            return r0
    }

    public void R() {
            r3 = this;
            com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment
            r0.<init>()
            r3.Y = r0
            androidx.fragment.app.FragmentManager r0 = r3.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            r1 = 2131298030(0x7f0906ee, float:1.8214022E38)
            com.bxkj.student.life.mall.collect.CollectGoodsFragment r2 = r3.Y
            androidx.fragment.app.FragmentTransaction r0 = r0.add(r1, r2)
            r0.commit()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "我的收藏"
            r2.setTitle(r0)
            com.bxkj.student.life.mall.collect.CollectGoodsActivity$a r0 = new com.bxkj.student.life.mall.collect.CollectGoodsActivity$a
            r0.<init>(r2)
            java.lang.String r1 = "清空"
            r2.b0(r1, r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
