package com.bxkj.student.life.mall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MallHomeActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private androidx.appcompat.widget.Toolbar Y;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.student.life.mall.MallHomeActivity a;

        a(com.bxkj.student.life.mall.MallHomeActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r2 = this;
                com.bxkj.student.life.mall.MallHomeActivity r0 = r2.a
                r1 = 2131298702(0x7f09098e, float:1.8215385E38)
                android.view.View r1 = r0.findViewById(r1)
                androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
                com.bxkj.student.life.mall.MallHomeActivity.h0(r0, r1)
                com.bxkj.student.life.mall.MallHomeActivity r0 = r2.a
                androidx.appcompat.widget.Toolbar r1 = com.bxkj.student.life.mall.MallHomeActivity.g0(r0)
                com.bxkj.student.life.mall.MallHomeActivity.i0(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends com.bxkj.student.common.utils.UniversalItemDecoration {
        final /* synthetic */ com.bxkj.student.life.mall.MallHomeActivity g;

        b(com.bxkj.student.life.mall.MallHomeActivity r1) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.common.utils.UniversalItemDecoration
        public com.bxkj.student.common.utils.UniversalItemDecoration.b a(int r4) {
                r3 = this;
                com.bxkj.student.common.utils.UniversalItemDecoration$a r0 = new com.bxkj.student.common.utils.UniversalItemDecoration$a
                r0.<init>()
                com.bxkj.student.life.mall.MallHomeActivity r1 = r3.g
                android.content.Context r1 = com.bxkj.student.life.mall.MallHomeActivity.j0(r1)
                r2 = 1065353216(0x3f800000, float:1.0)
                int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
                r2 = 2
                if (r4 == r2) goto L19
                r0.d = r1
                r4 = -1
                r0.f = r4
            L19:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.lang.String> {
        final /* synthetic */ com.bxkj.student.life.mall.MallHomeActivity k;

        c(com.bxkj.student.life.mall.MallHomeActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, java.lang.String r5) {
                r3 = this;
                int r0 = r4.f()
                r1 = 2131297182(0x7f09039e, float:1.8212302E38)
                if (r0 != 0) goto L10
                r0 = 2131689950(0x7f0f01de, float:1.900893E38)
                r4.r(r1, r0)
                goto L24
            L10:
                int r0 = r4.f()
                r2 = 1
                if (r0 != r2) goto L1e
                r0 = 2131690095(0x7f0f026f, float:1.9009224E38)
                r4.r(r1, r0)
                goto L24
            L1e:
                r0 = 2131689947(0x7f0f01db, float:1.9008924E38)
                r4.r(r1, r0)
            L24:
                r0 = 2131298986(0x7f090aaa, float:1.821596E38)
                r4.J(r0, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ android.widget.PopupWindow a;
        final /* synthetic */ com.bxkj.student.life.mall.MallHomeActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bxkj.base.auth.a.g {
            final /* synthetic */ int a;
            final /* synthetic */ com.bxkj.student.life.mall.MallHomeActivity.d b;

            a(com.bxkj.student.life.mall.MallHomeActivity.d r1, int r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.a.g
            public void a() {
                    r4 = this;
                    com.bxkj.student.life.mall.MallHomeActivity$d r0 = r4.b
                    android.widget.PopupWindow r0 = r0.a
                    r0.dismiss()
                    int r0 = r4.a
                    if (r0 == 0) goto L40
                    r1 = 1
                    if (r0 == r1) goto L29
                    r1 = 2
                    if (r0 == r1) goto L12
                    return
                L12:
                    com.bxkj.student.life.mall.MallHomeActivity$d r0 = r4.b
                    com.bxkj.student.life.mall.MallHomeActivity r0 = r0.b
                    android.content.Intent r1 = new android.content.Intent
                    com.bxkj.student.life.mall.MallHomeActivity$d r2 = r4.b
                    com.bxkj.student.life.mall.MallHomeActivity r2 = r2.b
                    android.content.Context r2 = com.bxkj.student.life.mall.MallHomeActivity.m0(r2)
                    java.lang.Class<com.bxkj.student.life.mall.address.MyAddressListActivity> r3 = com.bxkj.student.life.mall.address.MyAddressListActivity.class
                    r1.<init>(r2, r3)
                    r0.startActivity(r1)
                    return
                L29:
                    com.bxkj.student.life.mall.MallHomeActivity$d r0 = r4.b
                    com.bxkj.student.life.mall.MallHomeActivity r0 = r0.b
                    android.content.Intent r1 = new android.content.Intent
                    com.bxkj.student.life.mall.MallHomeActivity$d r2 = r4.b
                    com.bxkj.student.life.mall.MallHomeActivity r2 = r2.b
                    android.content.Context r2 = com.bxkj.student.life.mall.MallHomeActivity.l0(r2)
                    java.lang.Class<com.bxkj.student.life.mall.collect.CollectGoodsActivity> r3 = com.bxkj.student.life.mall.collect.CollectGoodsActivity.class
                    r1.<init>(r2, r3)
                    r0.startActivity(r1)
                    return
                L40:
                    com.bxkj.student.life.mall.MallHomeActivity$d r0 = r4.b
                    com.bxkj.student.life.mall.MallHomeActivity r0 = r0.b
                    android.content.Intent r1 = new android.content.Intent
                    com.bxkj.student.life.mall.MallHomeActivity$d r2 = r4.b
                    com.bxkj.student.life.mall.MallHomeActivity r2 = r2.b
                    android.content.Context r2 = com.bxkj.student.life.mall.MallHomeActivity.k0(r2)
                    java.lang.Class<com.bxkj.student.life.mall.order.OrderActivity> r3 = com.bxkj.student.life.mall.order.OrderActivity.class
                    r1.<init>(r2, r3)
                    r0.startActivity(r1)
                    return
            }
        }

        d(com.bxkj.student.life.mall.MallHomeActivity r1, android.widget.PopupWindow r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                com.bxkj.base.auth.a r1 = new com.bxkj.base.auth.a
                com.bxkj.student.life.mall.MallHomeActivity r2 = r0.b
                android.content.Context r2 = com.bxkj.student.life.mall.MallHomeActivity.n0(r2)
                r1.<init>(r2)
                com.bxkj.student.life.mall.MallHomeActivity$d$a r2 = new com.bxkj.student.life.mall.MallHomeActivity$d$a
                r2.<init>(r0, r4)
                com.bxkj.base.auth.a r1 = r1.i(r2)
                com.bxkj.student.life.mall.MallHomeActivity r2 = r0.b
                androidx.fragment.app.FragmentManager r2 = r2.getSupportFragmentManager()
                r3 = 0
                r1.b(r2, r3)
                return
        }
    }

    public MallHomeActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ androidx.appcompat.widget.Toolbar g0(com.bxkj.student.life.mall.MallHomeActivity r0) {
            androidx.appcompat.widget.Toolbar r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void h0(com.bxkj.student.life.mall.MallHomeActivity r0, androidx.appcompat.widget.Toolbar r1) {
            r0.Y = r1
            return
    }

    static /* bridge */ /* synthetic */ android.widget.PopupWindow i0(com.bxkj.student.life.mall.MallHomeActivity r0, android.view.View r1) {
            android.widget.PopupWindow r0 = r0.p0(r1)
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.life.mall.MallHomeActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.student.life.mall.MallHomeActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context l0(com.bxkj.student.life.mall.MallHomeActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.life.mall.MallHomeActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.student.life.mall.MallHomeActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private int[] o0(android.view.View r8, android.view.View r9) {
            r7 = this;
            r0 = 2
            int[] r1 = new int[r0]
            int[] r0 = new int[r0]
            r8.getLocationOnScreen(r0)
            int r8 = r8.getHeight()
            android.content.Context r2 = r7.V
            int[] r2 = cn.bluemobi.dylan.base.utils.u.K(r2)
            r3 = 1
            r2 = r2[r3]
            android.content.Context r4 = r7.V
            int[] r4 = cn.bluemobi.dylan.base.utils.u.K(r4)
            r5 = 0
            r4 = r4[r5]
            r9.measure(r5, r5)
            int r6 = r9.getMeasuredHeight()
            int r9 = r9.getMeasuredWidth()
            r0 = r0[r3]
            int r2 = r2 - r0
            int r2 = r2 - r8
            if (r2 >= r6) goto L36
            int r4 = r4 - r9
            r1[r5] = r4
            int r0 = r0 - r6
            r1[r3] = r0
            return r1
        L36:
            int r4 = r4 - r9
            r1[r5] = r4
            int r0 = r0 + r8
            r1[r3] = r0
            return r1
    }

    private android.widget.PopupWindow p0(android.view.View r7) {
            r6 = this;
            android.content.Context r0 = r6.V
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131493631(0x7f0c02ff, float:1.8610748E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r1 = 2131298098(0x7f090732, float:1.821416E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r6.V
            r2.<init>(r3)
            r1.setLayoutManager(r2)
            com.bxkj.student.life.mall.MallHomeActivity$b r2 = new com.bxkj.student.life.mall.MallHomeActivity$b
            r2.<init>(r6)
            r1.addItemDecoration(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "我的订单"
            r2.add(r3)
            java.lang.String r3 = "我的收藏"
            r2.add(r3)
            java.lang.String r3 = "收货地址"
            r2.add(r3)
            com.bxkj.student.life.mall.MallHomeActivity$c r3 = new com.bxkj.student.life.mall.MallHomeActivity$c
            android.content.Context r4 = r6.V
            r5 = 2131493239(0x7f0c0177, float:1.8609953E38)
            r3.<init>(r6, r4, r5, r2)
            r1.setAdapter(r3)
            android.widget.PopupWindow r1 = new android.widget.PopupWindow
            r2 = 1123024896(0x42f00000, float:120.0)
            android.content.Context r4 = r6.V
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r4)
            r4 = -2
            r1.<init>(r0, r2, r4)
            r0 = 1
            r1.setOutsideTouchable(r0)
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>()
            r1.setBackgroundDrawable(r2)
            r1.setFocusable(r0)
            androidx.appcompat.widget.Toolbar r2 = r6.Y
            int[] r2 = r6.o0(r7, r2)
            r0 = r2[r0]
            r2 = 53
            r4 = 0
            r1.showAtLocation(r7, r2, r4, r0)
            com.bxkj.student.life.mall.MallHomeActivity$d r7 = new com.bxkj.student.life.mall.MallHomeActivity$d
            r7.<init>(r6, r1)
            r3.k(r7)
            return r1
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492973(0x7f0c006d, float:1.8609413E38)
            return r0
    }

    public void R() {
            r0 = this;
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "商城"
            r2.setTitle(r0)
            com.bxkj.student.life.mall.MallHomeActivity$a r0 = new com.bxkj.student.life.mall.MallHomeActivity$a
            r0.<init>(r2)
            r1 = 2131689955(0x7f0f01e3, float:1.900894E38)
            r2.Z(r1, r0)
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
