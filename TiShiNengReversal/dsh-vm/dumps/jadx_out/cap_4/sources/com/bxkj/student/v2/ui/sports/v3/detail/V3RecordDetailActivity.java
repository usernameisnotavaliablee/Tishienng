package com.bxkj.student.v2.ui.sports.v3.detail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3RecordDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3RecordDetailActivity.kt\ncom/bxkj/student/v2/ui/sports/v3/detail/V3RecordDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3RecordDetailActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV3RecordDetailBinding, com.bxkj.student.v2.vm.sports.record.RecordDetailVM> {

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment W;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment X;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment Y;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment Z;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] a0;

    public V3RecordDetailActivity() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "图表"
            java.lang.String r1 = "数据"
            java.lang.String r2 = "概况"
            java.lang.String r3 = "轨迹"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            r4.a0 = r0
            return
    }

    private static final void M(com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r0) {
            r0.N()
            return
    }

    private final void N() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r1 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment
            r1.<init>()
            r4.W = r1
            com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment r1 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment
            r1.<init>()
            r4.X = r1
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r1 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment
            r1.<init>()
            r4.Y = r1
            com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment r1 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment
            r1.<init>()
            r4.Z = r1
            com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment r1 = r4.X
            kotlin.jvm.internal.g0.m(r1)
            r0.add(r1)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r1 = r4.W
            kotlin.jvm.internal.g0.m(r1)
            r0.add(r1)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r1 = r4.Y
            kotlin.jvm.internal.g0.m(r1)
            r0.add(r1)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment r1 = r4.Z
            kotlin.jvm.internal.g0.m(r1)
            r0.add(r1)
            androidx.databinding.ViewDataBinding r1 = r4.K()
            com.bxkj.student.databinding.AcV3RecordDetailBinding r1 = (com.bxkj.student.databinding.AcV3RecordDetailBinding) r1
            cn.bluemobi.dylan.base.view.NoSlidingViewPager r1 = r1.viewPager
            androidx.fragment.app.FragmentManager r2 = r4.getSupportFragmentManager()
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity$setData$1 r3 = new com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity$setData$1
            r3.<init>(r4, r0, r2)
            r1.setAdapter(r3)
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.AcV3RecordDetailBinding r0 = (com.bxkj.student.databinding.AcV3RecordDetailBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.tb
            androidx.databinding.ViewDataBinding r1 = r4.K()
            com.bxkj.student.databinding.AcV3RecordDetailBinding r1 = (com.bxkj.student.databinding.AcV3RecordDetailBinding) r1
            cn.bluemobi.dylan.base.view.NoSlidingViewPager r1 = r1.viewPager
            r0.setupWithViewPager(r1)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "exerciseRecordId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L85
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.I(r1)
        L85:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "identify"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto La2
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.J(r1)
        La2:
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            r0.B()
            r4.L()
            return
    }

    private static final void Q(com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r2, android.graphics.Bitmap r3, com.umeng.socialize.shareboard.SnsPlatform r4, com.umeng.socialize.bean.SHARE_MEDIA r5) {
            com.umeng.socialize.media.UMImage r0 = new com.umeng.socialize.media.UMImage
            android.content.Context r1 = r2.G()
            r0.<init>(r1, r3)
            java.lang.String r4 = r4.mKeyword
            java.lang.String r1 = "tsnCircle"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L22
            com.bxkj.base.v2.base.BaseViewModel r4 = r2.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r4 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r4
            com.bxkj.student.v2.ui.sports.v3.detail.a r5 = new com.bxkj.student.v2.ui.sports.v3.detail.a
            r5.<init>(r2, r3)
            r4.D(r5)
            return
        L22:
            com.umeng.socialize.ShareAction r3 = new com.umeng.socialize.ShareAction
            androidx.fragment.app.FragmentActivity r4 = r2.q()
            r3.<init>(r4)
            com.umeng.socialize.ShareAction r3 = r3.setPlatform(r5)
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity$shareImage$1$2 r4 = new com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity$shareImage$1$2
            r4.<init>(r2)
            com.umeng.socialize.ShareAction r2 = r3.setCallback(r4)
            com.umeng.socialize.ShareAction r2 = r2.withMedia(r0)
            r2.share()
            return
    }

    private static final kotlin.n1 R(com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r4, android.graphics.Bitmap r5, java.util.Map r6) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r6, r0)
            com.bxkj.student.v2.common.utils.c$a r0 = com.bxkj.student.v2.common.utils.c.a
            android.content.Context r1 = r4.G()
            java.io.File r5 = r0.a(r1, r5)
            if (r5 == 0) goto L4a
            com.bxkj.student.v2.common.utils.h r0 = com.bxkj.student.v2.common.utils.h.a
            android.content.Context r4 = r4.G()
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "name"
            java.lang.String r3 = r1.t(r6, r2)
            kotlin.Pair r2 = kotlin.o0.a(r2, r3)
            java.lang.String r3 = "linkUrl"
            java.lang.String r6 = r1.t(r6, r3)
            kotlin.Pair r6 = kotlin.o0.a(r3, r6)
            java.lang.String r1 = "imagePath"
            java.lang.String r5 = r5.getPath()
            kotlin.Pair r5 = kotlin.o0.a(r1, r5)
            r1 = 3
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r6
            r6 = 2
            r1[r6] = r5
            java.util.Map r5 = kotlin.collections.i1.j0(r1)
            r0.b(r4, r5)
        L4a:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r0, android.graphics.Bitmap r1, java.util.Map r2) {
            kotlin.n1 r0 = R(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ void f(com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r0) {
            M(r0)
            return
    }

    public static /* synthetic */ void g(com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r0, android.graphics.Bitmap r1, com.umeng.socialize.shareboard.SnsPlatform r2, com.umeng.socialize.bean.SHARE_MEDIA r3) {
            Q(r0, r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.String[] h(com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r0) {
            java.lang.String[] r0 = r0.a0
            return r0
    }

    public final void L() {
            r1 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r1.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            java.lang.String r0 = r0.A()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1a
            com.bxkj.base.v2.base.BaseViewModel r0 = r1.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            r0.y()
            return
        L1a:
            com.bxkj.base.v2.base.BaseViewModel r0 = r1.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            r0.x()
            return
    }

    public final void O() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV3RecordDetailBinding r0 = (com.bxkj.student.databinding.AcV3RecordDetailBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.tb
            int r0 = r0.getSelectedTabPosition()
            if (r0 != 0) goto L1a
            com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment r0 = r2.X
            if (r0 == 0) goto L66
            android.graphics.Bitmap r0 = r0.h()
            r2.P(r0)
            return
        L1a:
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV3RecordDetailBinding r0 = (com.bxkj.student.databinding.AcV3RecordDetailBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.tb
            int r0 = r0.getSelectedTabPosition()
            r1 = 1
            if (r0 != r1) goto L31
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0 = r2.W
            if (r0 == 0) goto L66
            r0.W()
            return
        L31:
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV3RecordDetailBinding r0 = (com.bxkj.student.databinding.AcV3RecordDetailBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.tb
            int r0 = r0.getSelectedTabPosition()
            r1 = 2
            if (r0 != r1) goto L4c
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r0 = r2.Y
            if (r0 == 0) goto L66
            android.graphics.Bitmap r0 = r0.i()
            r2.P(r0)
            return
        L4c:
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV3RecordDetailBinding r0 = (com.bxkj.student.databinding.AcV3RecordDetailBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.tb
            int r0 = r0.getSelectedTabPosition()
            r1 = 3
            if (r0 != r1) goto L66
            com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment r0 = r2.Z
            if (r0 == 0) goto L66
            android.graphics.Bitmap r0 = r0.g()
            r2.P(r0)
        L66:
            return
    }

    public final void P(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r5) {
            r4 = this;
            java.lang.String r0 = "bitmap"
            kotlin.jvm.internal.g0.p(r5, r0)
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            r0.<init>(r1)
            r1 = 4
            com.umeng.socialize.bean.SHARE_MEDIA[] r1 = new com.umeng.socialize.bean.SHARE_MEDIA[r1]
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r3 = 0
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            r3 = 1
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r3 = 2
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            r3 = 3
            r1[r3] = r2
            com.umeng.socialize.ShareAction r0 = r0.setDisplayList(r1)
            java.lang.String r1 = "tsnCircle"
            java.lang.String r2 = "circle_icon"
            java.lang.String r3 = "圈子"
            com.umeng.socialize.ShareAction r0 = r0.addButton(r3, r1, r2, r2)
            com.bxkj.student.v2.ui.sports.v3.detail.b r1 = new com.bxkj.student.v2.ui.sports.v3.detail.b
            r1.<init>(r4, r5)
            com.umeng.socialize.ShareAction r5 = r0.setShareboardclickCallback(r1)
            r5.open()
            return
    }

    public final void S() {
            r3 = this;
            com.bxkj.student.v2.ui.sports.v3.detail.V3ExceptionDialog r0 = new com.bxkj.student.v2.ui.sports.v3.detail.V3ExceptionDialog
            r0.<init>()
            androidx.fragment.app.FragmentManager r1 = r3.I()
            java.lang.String r2 = "V3ExceptionDialog"
            r0.show(r1, r2)
            return
    }

    public final void T() {
            r3 = this;
            com.bxkj.student.v2.ui.sports.v3.detail.V3RankTipsDialog r0 = new com.bxkj.student.v2.ui.sports.v3.detail.V3RankTipsDialog
            r0.<init>()
            androidx.fragment.app.FragmentManager r1 = r3.I()
            java.lang.String r2 = "showRankTipsDialog"
            r0.show(r1, r2)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r3 = this;
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV3RecordDetailBinding r0 = (com.bxkj.student.databinding.AcV3RecordDetailBinding) r0
            r0.setMActivity(r3)
            androidx.fragment.app.FragmentActivity r0 = r3.q()
            android.content.Context r1 = r3.G()
            r2 = 2131100712(0x7f060428, float:1.7813813E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            com.bxkj.student.common.utils.k.g(r0, r1)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV3RecordDetailBinding r0 = (com.bxkj.student.databinding.AcV3RecordDetailBinding) r0
            r0.setMActivity(r3)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            com.bxkj.student.v2.ui.sports.v3.detail.c r1 = new com.bxkj.student.v2.ui.sports.v3.detail.c
            r1.<init>(r3)
            r0.post(r1)
            return
    }
}
