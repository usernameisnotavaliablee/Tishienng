package com.bxkj.student.v2.ui.sports.set;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SportsRankActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV2SportsRankBinding, com.bxkj.student.v2.vm.sports.set.SportsRankVM> {

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

    public SportsRankActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.set.SportsRankActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = f(r0, r1)
            return r0
    }

    private static final kotlin.n1 f(com.bxkj.student.v2.ui.sports.set.SportsRankActivity r0, java.util.Map r1) {
            androidx.databinding.ViewDataBinding r0 = r0.K()
            com.bxkj.student.databinding.AcV2SportsRankBinding r0 = (com.bxkj.student.databinding.AcV2SportsRankBinding) r0
            r0.setDataMap(r1)
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r4 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.set.SportsRankVM r0 = (com.bxkj.student.v2.vm.sports.set.SportsRankVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.t()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.sports.set.d r2 = new com.bxkj.student.v2.ui.sports.set.d
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.set.SportsRankActivity$a r3 = new com.bxkj.student.v2.ui.sports.set.SportsRankActivity$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r1 = this;
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.AcV2SportsRankBinding r0 = (com.bxkj.student.databinding.AcV2SportsRankBinding) r0
            r0.setMActvity(r1)
            com.bxkj.base.v2.base.BaseViewModel r0 = r1.C()
            com.bxkj.student.v2.vm.sports.set.SportsRankVM r0 = (com.bxkj.student.v2.vm.sports.set.SportsRankVM) r0
            r0.u()
            return
    }
}
