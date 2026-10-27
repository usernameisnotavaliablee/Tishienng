package com.bxkj.student.v2.ui.sports.v3.detail.tab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBasicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicFragment.kt\ncom/bxkj/student/v2/ui/sports/v3/detail/tab/BasicFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class BasicFragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.V3FmBasicBinding, com.bxkj.student.v2.vm.sports.record.RecordDetailVM> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a implements androidx.lifecycle.Observer, kotlin.jvm.internal.b0 {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        a(kotlin.jvm.functions.Function1 r2) {
                r1 = this;
                java.lang.String r0 = "function"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                return
        }

        public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.lifecycle.Observer
                r1 = 0
                if (r0 == 0) goto L18
                boolean r0 = r3 instanceof kotlin.jvm.internal.b0
                if (r0 == 0) goto L18
                kotlin.n r0 = r2.getFunctionDelegate()
                kotlin.jvm.internal.b0 r3 = (kotlin.jvm.internal.b0) r3
                kotlin.n r3 = r3.getFunctionDelegate()
                boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
                return r3
            L18:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.n<?> getFunctionDelegate() {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                return r0
        }

        public final int hashCode() {
                r1 = this;
                kotlin.n r0 = r1.getFunctionDelegate()
                int r0 = r0.hashCode()
                return r0
        }

        public final /* synthetic */ void onChanged(java.lang.Object r2) {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                r0.invoke(r2)
                return
        }
    }

    public BasicFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment r0) {
            i(r0)
            return
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment r0, java.util.Map r1) {
            kotlin.n1 r0 = k(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 g(com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment r0, java.util.Map r1) {
            kotlin.n1 r0 = l(r0, r1)
            return r0
    }

    private static final void i(com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment r3) {
            androidx.fragment.app.FragmentManager r0 = r3.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r1 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment
            r1.<init>()
            r2 = 2131298030(0x7f0906ee, float:1.8214022E38)
            androidx.fragment.app.FragmentTransaction r0 = r0.add(r2, r1)
            r0.commitAllowingStateLoss()
            r3.j()
            return
    }

    private final void j() {
            r4 = this;
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            java.lang.String r2 = "requireActivity(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r1)
            java.lang.Class<com.bxkj.student.v2.vm.sports.record.RecordDetailVM> r1 = com.bxkj.student.v2.vm.sports.record.RecordDetailVM.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            com.bxkj.base.v2.base.BaseViewModel r0 = (com.bxkj.base.v2.base.BaseViewModel) r0
            r4.w(r0)
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.V3FmBasicBinding r0 = (com.bxkj.student.databinding.V3FmBasicBinding) r0
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            java.lang.String r2 = "null cannot be cast to non-null type com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity"
            kotlin.jvm.internal.g0.n(r1, r2)
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r1 = (com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity) r1
            r0.setMActivity(r1)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.w()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.bxkj.student.v2.ui.sports.v3.detail.tab.b r2 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.b
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment$a r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.F()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.bxkj.student.v2.ui.sports.v3.detail.tab.c r2 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.c
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment$a r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    private static final kotlin.n1 k(com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment r10, java.util.Map r11) {
            androidx.databinding.ViewDataBinding r0 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r0 = (com.bxkj.student.databinding.V3FmBasicBinding) r0
            r0.setMap(r11)
            com.bxkj.base.v2.base.BaseViewModel r0 = r10.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            java.lang.String r0 = r0.z()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L33
            androidx.databinding.ViewDataBinding r0 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r0 = (com.bxkj.student.databinding.V3FmBasicBinding) r0
            com.google.android.material.card.MaterialCardView r0 = r0.card2
            r0.setVisibility(r2)
            androidx.databinding.ViewDataBinding r0 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r0 = (com.bxkj.student.databinding.V3FmBasicBinding) r0
            com.google.android.material.card.MaterialCardView r0 = r0.card3
            r0.setVisibility(r2)
            goto L9e
        L33:
            androidx.databinding.ViewDataBinding r0 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r0 = (com.bxkj.student.databinding.V3FmBasicBinding) r0
            android.widget.TextView r0 = r0.tvResult
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = "exerciseStatistics"
            java.lang.String r4 = r3.t(r11, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "NO."
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.setText(r4)
            androidx.databinding.ViewDataBinding r0 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r0 = (com.bxkj.student.databinding.V3FmBasicBinding) r0
            android.widget.TextView r0 = r0.tvRank
            com.bxkj.base.v2.common.utils.h r4 = com.bxkj.base.v2.common.utils.h.a
            java.lang.String r5 = "totalRange"
            double r5 = r3.f(r11, r5)
            java.lang.String r4 = r4.a(r5)
            r0.setText(r4)
            androidx.databinding.ViewDataBinding r0 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r0 = (com.bxkj.student.databinding.V3FmBasicBinding) r0
            com.google.android.material.card.MaterialCardView r0 = r0.card2
            r0.setVisibility(r1)
            androidx.databinding.ViewDataBinding r0 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r0 = (com.bxkj.student.databinding.V3FmBasicBinding) r0
            android.widget.TextView r0 = r0.tvCj
            java.lang.String r4 = "recordBreaking"
            java.lang.String r4 = r3.t(r11, r4)
            r0.setText(r4)
            androidx.databinding.ViewDataBinding r0 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r0 = (com.bxkj.student.databinding.V3FmBasicBinding) r0
            com.google.android.material.card.MaterialCardView r0 = r0.card3
            java.lang.String r4 = "isMax"
            boolean r3 = r3.d(r11, r4)
            if (r3 == 0) goto L9b
            r2 = 0
        L9b:
            r0.setVisibility(r2)
        L9e:
            androidx.databinding.ViewDataBinding r0 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r0 = (com.bxkj.student.databinding.V3FmBasicBinding) r0
            com.bxkj.student.v2.common.view.TrackProgressView r0 = r0.tpStep
            com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = "stepSetting"
            int r4 = r2.k(r11, r3)
            r0.setMaxProgress(r4)
            androidx.databinding.ViewDataBinding r0 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r0 = (com.bxkj.student.databinding.V3FmBasicBinding) r0
            com.bxkj.student.v2.common.view.TrackProgressView r0 = r0.tpStep
            java.lang.String r4 = "stepNumbers"
            java.lang.String r4 = r2.t(r11, r4)
            int r4 = com.bxkj.student.run.app.utils.i.t(r4)
            r0.setProgress(r4)
            r0 = 0
            r4 = 100
            if (r11 == 0) goto Lec
            int r3 = r2.k(r11, r3)
            if (r3 != 0) goto Ld3
            r3 = r11
            goto Ld4
        Ld3:
            r3 = r0
        Ld4:
            if (r3 == 0) goto Lec
            androidx.databinding.ViewDataBinding r3 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r3 = (com.bxkj.student.databinding.V3FmBasicBinding) r3
            com.bxkj.student.v2.common.view.TrackProgressView r3 = r3.tpStep
            r3.setMaxProgress(r4)
            androidx.databinding.ViewDataBinding r3 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r3 = (com.bxkj.student.databinding.V3FmBasicBinding) r3
            com.bxkj.student.v2.common.view.TrackProgressView r3 = r3.tpStep
            r3.setProgress(r4)
        Lec:
            androidx.databinding.ViewDataBinding r3 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r3 = (com.bxkj.student.databinding.V3FmBasicBinding) r3
            com.bxkj.student.v2.common.view.TrackProgressView r3 = r3.tpDistance
            java.lang.String r5 = "rangeSetting"
            double r6 = r2.f(r11, r5)
            r8 = 1000(0x3e8, float:1.401E-42)
            double r8 = (double) r8
            double r6 = r6 * r8
            int r6 = (int) r6
            r3.setMaxProgress(r6)
            androidx.databinding.ViewDataBinding r3 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r3 = (com.bxkj.student.databinding.V3FmBasicBinding) r3
            com.bxkj.student.v2.common.view.TrackProgressView r3 = r3.tpDistance
            java.lang.String r6 = "sportRange"
            double r6 = r2.f(r11, r6)
            double r6 = r6 * r8
            int r6 = (int) r6
            r3.setProgress(r6)
            if (r11 == 0) goto L13d
            double r5 = r2.f(r11, r5)
            double r5 = r5 * r8
            int r3 = (int) r5
            if (r3 != 0) goto L124
            r3 = r11
            goto L125
        L124:
            r3 = r0
        L125:
            if (r3 == 0) goto L13d
            androidx.databinding.ViewDataBinding r3 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r3 = (com.bxkj.student.databinding.V3FmBasicBinding) r3
            com.bxkj.student.v2.common.view.TrackProgressView r3 = r3.tpDistance
            r3.setMaxProgress(r4)
            androidx.databinding.ViewDataBinding r3 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r3 = (com.bxkj.student.databinding.V3FmBasicBinding) r3
            com.bxkj.student.v2.common.view.TrackProgressView r3 = r3.tpDistance
            r3.setProgress(r4)
        L13d:
            androidx.databinding.ViewDataBinding r3 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r3 = (com.bxkj.student.databinding.V3FmBasicBinding) r3
            com.bxkj.student.v2.common.view.TrackProgressView r3 = r3.tpTime
            java.lang.String r5 = "startQualifiedTimeSetting"
            int r6 = r2.k(r11, r5)
            int r6 = r6 * 60
            r3.setMaxProgress(r6)
            androidx.databinding.ViewDataBinding r3 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r3 = (com.bxkj.student.databinding.V3FmBasicBinding) r3
            com.bxkj.student.v2.common.view.TrackProgressView r3 = r3.tpTime
            java.lang.String r6 = "sportTime"
            int r7 = r2.k(r11, r6)
            r3.setProgress(r7)
            int r3 = r2.k(r11, r6)
            java.lang.String r6 = "endQualifiedTimeSetting"
            int r6 = r2.k(r11, r6)
            int r6 = r6 * 60
            if (r3 <= r6) goto L17a
            androidx.databinding.ViewDataBinding r3 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r3 = (com.bxkj.student.databinding.V3FmBasicBinding) r3
            com.bxkj.student.v2.common.view.TrackProgressView r3 = r3.tpTime
            r3.setProgress(r1)
        L17a:
            if (r11 == 0) goto L19c
            int r1 = r2.k(r11, r5)
            if (r1 != 0) goto L183
            goto L184
        L183:
            r11 = r0
        L184:
            if (r11 == 0) goto L19c
            androidx.databinding.ViewDataBinding r11 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r11 = (com.bxkj.student.databinding.V3FmBasicBinding) r11
            com.bxkj.student.v2.common.view.TrackProgressView r11 = r11.tpTime
            r11.setMaxProgress(r4)
            androidx.databinding.ViewDataBinding r10 = r10.K()
            com.bxkj.student.databinding.V3FmBasicBinding r10 = (com.bxkj.student.databinding.V3FmBasicBinding) r10
            com.bxkj.student.v2.common.view.TrackProgressView r10 = r10.tpTime
            r10.setProgress(r4)
        L19c:
            kotlin.n1 r10 = kotlin.n1.a
            return r10
    }

    private static final kotlin.n1 l(com.bxkj.student.v2.ui.sports.v3.detail.tab.BasicFragment r5, java.util.Map r6) {
            android.content.Context r0 = r5.G()
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "imageRouteUrl"
            java.lang.String r2 = r1.t(r6, r2)
            androidx.databinding.ViewDataBinding r3 = r5.K()
            com.bxkj.student.databinding.V3FmBasicBinding r3 = (com.bxkj.student.databinding.V3FmBasicBinding) r3
            com.google.android.material.imageview.ShapeableImageView r3 = r3.ivHead
            r4 = 2131690190(0x7f0f02ce, float:1.9009417E38)
            cn.bluemobi.dylan.base.utils.o.f(r0, r2, r3, r4, r4)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r0.a()
            java.lang.String r3 = "nickName"
            java.lang.String r6 = r1.t(r6, r3)
            r2.X0(r6)
            androidx.databinding.ViewDataBinding r6 = r5.K()
            com.bxkj.student.databinding.V3FmBasicBinding r6 = (com.bxkj.student.databinding.V3FmBasicBinding) r6
            android.widget.TextView r6 = r6.tvName
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r1 = r1.U()
            r6.setText(r1)
            androidx.databinding.ViewDataBinding r5 = r5.K()
            com.bxkj.student.databinding.V3FmBasicBinding r5 = (com.bxkj.student.databinding.V3FmBasicBinding) r5
            android.widget.TextView r5 = r5.tvAccount
            com.bxkj.base.v2.data.b r6 = r0.a()
            java.lang.String r6 = r6.S()
            r5.setText(r6)
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap h() {
            r4 = this;
            com.bxkj.student.v2.common.utils.q r0 = com.bxkj.student.v2.common.utils.q.a
            android.content.Context r1 = r4.G()
            androidx.databinding.ViewDataBinding r2 = r4.K()
            com.bxkj.student.databinding.V3FmBasicBinding r2 = (com.bxkj.student.databinding.V3FmBasicBinding) r2
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.clRoot
            java.lang.String r3 = "clRoot"
            kotlin.jvm.internal.g0.o(r2, r3)
            android.graphics.Bitmap r0 = r0.a(r1, r2)
            return r0
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r2 = this;
            androidx.fragment.app.FragmentActivity r0 = r2.q()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            com.bxkj.student.v2.ui.sports.v3.detail.tab.a r1 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.a
            r1.<init>(r2)
            r0.post(r1)
            return
    }
}
