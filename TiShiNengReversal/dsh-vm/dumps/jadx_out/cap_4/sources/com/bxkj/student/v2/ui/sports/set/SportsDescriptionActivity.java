package com.bxkj.student.v2.ui.sports.set;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SportsDescriptionActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV2SportsDescriptionBinding, com.bxkj.student.v2.vm.sports.SportsDescriptionVM> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends android.os.CountDownTimer {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity a;

        a(com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r3, long r4) {
                r2 = this;
                r2.a = r3
                r0 = 1000(0x3e8, double:4.94E-321)
                r2.<init>(r4, r0)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r2 = this;
                com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r0 = r2.a
                androidx.databinding.ViewDataBinding r0 = r0.K()
                com.bxkj.student.databinding.AcV2SportsDescriptionBinding r0 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r0
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.setStartButtonEnable(r1)
                com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r0 = r2.a
                androidx.databinding.ViewDataBinding r0 = r0.K()
                com.bxkj.student.databinding.AcV2SportsDescriptionBinding r0 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r0
                android.widget.Button r0 = r0.btStart
                java.lang.String r1 = "开始锻炼"
                r0.setText(r1)
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r4) {
                r3 = this;
                com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r0 = r3.a
                androidx.databinding.ViewDataBinding r0 = r0.K()
                com.bxkj.student.databinding.AcV2SportsDescriptionBinding r0 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r0
                android.widget.Button r0 = r0.btStart
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r4 = r4 / r1
                r1 = 1
                long r4 = r4 + r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "开始锻炼("
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = "秒)"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.setText(r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements androidx.lifecycle.Observer, kotlin.jvm.internal.b0 {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        b(kotlin.jvm.functions.Function1 r2) {
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

    public SportsDescriptionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = f(r0, r1)
            return r0
    }

    private static final kotlin.n1 f(com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r4, java.util.Map r5) {
            if (r5 == 0) goto L6d
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "showBottom"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L25
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r0 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r0
            android.content.Intent r2 = r4.getIntent()
            r3 = 1
            boolean r1 = r2.getBooleanExtra(r1, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setShowBottom(r1)
            goto L30
        L25:
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r0 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setShowBottom(r1)
        L30:
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r0 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.swv
            android.webkit.WebView r0 = r0.getWebView()
            android.webkit.WebSettings r0 = r0.getSettings()
            android.webkit.WebSettings$TextSize r1 = android.webkit.WebSettings.TextSize.LARGEST
            r0.setTextSize(r1)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "content"
            java.lang.String r1 = r0.t(r5, r1)
            androidx.databinding.ViewDataBinding r2 = r4.K()
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r2 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r2
            cn.bluemobi.dylan.smartwebview.SmartWebView r2 = r2.swv
            r2.h(r1)
            java.lang.String r1 = "countdownTime"
            r2 = 10
            long r0 = r0.p(r5, r1, r2)
            r5 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r5
            long r0 = r0 * r2
            com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity$a r5 = new com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity$a
            r5.<init>(r4, r0)
            r5.start()
        L6d:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    public final void L() {
            r3 = this;
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            androidx.databinding.ViewDataBinding r1 = r3.K()
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r1 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r1
            android.widget.CheckBox r1 = r1.cbIgnore
            boolean r1 = r1.isChecked()
            r0.E0(r1)
            android.content.Intent r0 = r3.getIntent()
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.V4SportActivity> r2 = com.bxkj.student.v2.ui.sports.v3.V4SportActivity.class
            android.content.Intent r0 = r0.setClass(r1, r2)
            r3.startActivity(r0)
            r3.finish()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r3 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r3.C()
            com.bxkj.student.v2.vm.sports.SportsDescriptionVM r0 = (com.bxkj.student.v2.vm.sports.SportsDescriptionVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.v()
            com.bxkj.student.v2.ui.sports.set.c r1 = new com.bxkj.student.v2.ui.sports.set.c
            r1.<init>(r3)
            com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity$b r2 = new com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity$b
            r2.<init>(r1)
            r0.observe(r3, r2)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r2 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.sports.SportsDescriptionVM r0 = (com.bxkj.student.v2.vm.sports.SportsDescriptionVM) r0
            r0.w()
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r0 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setStartButtonEnable(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r0 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r0
            r0.setMActivity(r2)
            return
    }
}
