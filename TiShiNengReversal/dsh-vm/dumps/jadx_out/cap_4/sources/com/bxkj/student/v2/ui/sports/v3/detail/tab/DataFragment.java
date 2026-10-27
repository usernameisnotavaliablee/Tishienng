package com.bxkj.student.v2.ui.sports.v3.detail.tab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class DataFragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.V3FmDataBinding, com.bxkj.student.v2.vm.sports.record.RecordDetailVM> {

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

    public DataFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment r0, java.util.Map r1) {
            kotlin.n1 r0 = i(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment r0, java.util.Map r1) {
            kotlin.n1 r0 = h(r0, r1)
            return r0
    }

    private static final kotlin.n1 h(com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment r8, java.util.Map r9) {
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            r0.setMap(r9)
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            android.widget.TextView r0 = r0.tvYxlc
            com.bxkj.base.v2.common.utils.h r1 = com.bxkj.base.v2.common.utils.h.a
            com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = "totalRangeZong"
            double r4 = r2.f(r9, r3)
            java.lang.String r1 = r1.a(r4)
            r0.setText(r1)
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            android.widget.TextView r0 = r0.tvDblc
            java.lang.String r1 = "qualifyTotalRange"
            java.lang.String r4 = r2.t(r9, r1)
            r0.setText(r4)
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            android.widget.TextView r0 = r0.tvSylc
            java.lang.String r4 = "leaveTotalRangeZong"
            java.lang.String r4 = r2.t(r9, r4)
            r0.setText(r4)
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            android.widget.ProgressBar r0 = r0.pbDistance
            double r4 = r2.f(r9, r1)
            r1 = 1000(0x3e8, float:1.401E-42)
            double r6 = (double) r1
            double r4 = r4 * r6
            int r1 = (int) r4
            r0.setMax(r1)
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            android.widget.ProgressBar r0 = r0.pbDistance
            double r3 = r2.f(r9, r3)
            double r3 = r3 * r6
            int r1 = (int) r3
            r0.setProgress(r1)
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            android.widget.TextView r0 = r0.tvYxcs
            java.lang.String r1 = "totalCountZong"
            java.lang.String r3 = r2.t(r9, r1)
            r0.setText(r3)
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            android.widget.TextView r0 = r0.tvDbcs
            java.lang.String r3 = "qualifyTotalCount"
            java.lang.String r4 = r2.t(r9, r3)
            r0.setText(r4)
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            android.widget.TextView r0 = r0.tvSycs
            java.lang.String r4 = "leaveTotalCountZong"
            java.lang.String r4 = r2.t(r9, r4)
            r0.setText(r4)
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            android.widget.ProgressBar r0 = r0.pbCount
            int r3 = r2.k(r9, r3)
            r0.setMax(r3)
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            android.widget.ProgressBar r0 = r0.pbCount
            int r1 = r2.k(r9, r1)
            r0.setProgress(r1)
            androidx.databinding.ViewDataBinding r0 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            android.widget.TextView r0 = r0.tvLjsc
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.lang.String r3 = "totalTimeZong"
            double r3 = r2.f(r9, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r3)
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r4 = 60
            r3.<init>(r4)
            java.math.RoundingMode r5 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r1 = r1.divide(r3, r5)
            java.lang.String r3 = "divide(...)"
            kotlin.jvm.internal.g0.o(r1, r3)
            java.math.BigDecimal r6 = new java.math.BigDecimal
            r6.<init>(r4)
            java.math.BigDecimal r1 = r1.divide(r6, r5)
            kotlin.jvm.internal.g0.o(r1, r3)
            r3 = 2
            java.math.BigDecimal r1 = r1.setScale(r3)
            double r3 = r1.doubleValue()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r0.setText(r1)
            androidx.databinding.ViewDataBinding r8 = r8.K()
            com.bxkj.student.databinding.V3FmDataBinding r8 = (com.bxkj.student.databinding.V3FmDataBinding) r8
            android.widget.TextView r8 = r8.tvPbts
            java.lang.String r0 = "totalDay"
            java.lang.String r9 = r2.t(r9, r0)
            r8.setText(r9)
            kotlin.n1 r8 = kotlin.n1.a
            return r8
    }

    private static final kotlin.n1 i(com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment r5, java.util.Map r6) {
            android.content.Context r0 = r5.G()
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "imageRouteUrl"
            java.lang.String r2 = r1.t(r6, r2)
            androidx.databinding.ViewDataBinding r3 = r5.K()
            com.bxkj.student.databinding.V3FmDataBinding r3 = (com.bxkj.student.databinding.V3FmDataBinding) r3
            com.google.android.material.imageview.ShapeableImageView r3 = r3.ivHead
            r4 = 2131690190(0x7f0f02ce, float:1.9009417E38)
            cn.bluemobi.dylan.base.utils.o.f(r0, r2, r3, r4, r4)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r0.a()
            java.lang.String r3 = "nickName"
            java.lang.String r6 = r1.t(r6, r3)
            r2.X0(r6)
            androidx.databinding.ViewDataBinding r6 = r5.K()
            com.bxkj.student.databinding.V3FmDataBinding r6 = (com.bxkj.student.databinding.V3FmDataBinding) r6
            android.widget.TextView r6 = r6.tvName
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r1 = r1.U()
            r6.setText(r1)
            androidx.databinding.ViewDataBinding r5 = r5.K()
            com.bxkj.student.databinding.V3FmDataBinding r5 = (com.bxkj.student.databinding.V3FmDataBinding) r5
            android.widget.TextView r5 = r5.tvAccount
            com.bxkj.base.v2.data.b r6 = r0.a()
            java.lang.String r6 = r6.S()
            r5.setText(r6)
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap g() {
            r4 = this;
            com.bxkj.student.v2.common.utils.q r0 = com.bxkj.student.v2.common.utils.q.a
            android.content.Context r1 = r4.G()
            androidx.databinding.ViewDataBinding r2 = r4.K()
            com.bxkj.student.databinding.V3FmDataBinding r2 = (com.bxkj.student.databinding.V3FmDataBinding) r2
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.clRoot
            java.lang.String r3 = "clRoot"
            kotlin.jvm.internal.g0.o(r2, r3)
            android.graphics.Bitmap r0 = r0.a(r1, r2)
            return r0
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
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
            com.bxkj.student.databinding.V3FmDataBinding r0 = (com.bxkj.student.databinding.V3FmDataBinding) r0
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            java.lang.String r2 = "null cannot be cast to non-null type com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity"
            kotlin.jvm.internal.g0.n(r1, r2)
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r1 = (com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity) r1
            r0.setMActivity(r1)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.w()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.bxkj.student.v2.ui.sports.v3.detail.tab.d r2 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.d
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment$a r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.F()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.bxkj.student.v2.ui.sports.v3.detail.tab.e r2 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.e
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment$a r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.DataFragment$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r0 = this;
            return
    }
}
