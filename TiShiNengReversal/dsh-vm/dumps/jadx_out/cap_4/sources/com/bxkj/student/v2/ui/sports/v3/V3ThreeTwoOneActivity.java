package com.bxkj.student.v2.ui.sports.v3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3ThreeTwoOneActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.V3AcThreetwooneBinding, com.bxkj.base.v2.base.BaseViewModel> {
    private int W;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity a;

        a(com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                java.lang.String r0 = "animation"
                kotlin.jvm.internal.g0.p(r2, r0)
                super.onAnimationEnd(r2)
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.v2.ui.sports.v3.V4SportActivity> r0 = com.bxkj.student.v2.ui.sports.v3.V4SportActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r2 = (com.bxkj.student.v2.ui.sports.v3.V4SportActivity) r2
                if (r2 == 0) goto L19
                r2.S()
            L19:
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r2 = r1.a
                r2.finish()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r3) {
                r2 = this;
                java.lang.String r0 = "animation"
                kotlin.jvm.internal.g0.p(r3, r0)
                super.onAnimationRepeat(r3)
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r3 = r2.a
                int r3 = com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity.e(r3)
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r0 = r2.a
                int r3 = r3 + (-1)
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity.f(r0, r3)
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r3 = r2.a
                int r3 = com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity.e(r3)
                if (r3 == 0) goto L68
                r0 = 1
                if (r3 == r0) goto L46
                r0 = 2
                if (r3 == r0) goto L24
                return
            L24:
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r3 = r2.a
                androidx.databinding.ViewDataBinding r3 = r3.K()
                com.bxkj.student.databinding.V3AcThreetwooneBinding r3 = (com.bxkj.student.databinding.V3AcThreetwooneBinding) r3
                android.widget.TextView r3 = r3.tvNumber
                java.lang.String r0 = "2"
                r3.setText(r0)
                m0.a$a r3 = m0.a.a
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r0 = r2.a
                android.content.Context r0 = r0.G()
                r1 = 2131886084(0x7f120004, float:1.9406737E38)
                int[] r1 = new int[]{r1}
                r3.b(r0, r1)
                return
            L46:
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r3 = r2.a
                androidx.databinding.ViewDataBinding r3 = r3.K()
                com.bxkj.student.databinding.V3AcThreetwooneBinding r3 = (com.bxkj.student.databinding.V3AcThreetwooneBinding) r3
                android.widget.TextView r3 = r3.tvNumber
                java.lang.String r0 = "1"
                r3.setText(r0)
                m0.a$a r3 = m0.a.a
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r0 = r2.a
                android.content.Context r0 = r0.G()
                r1 = 2131886083(0x7f120003, float:1.9406735E38)
                int[] r1 = new int[]{r1}
                r3.b(r0, r1)
                return
            L68:
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r3 = r2.a
                androidx.databinding.ViewDataBinding r3 = r3.K()
                com.bxkj.student.databinding.V3AcThreetwooneBinding r3 = (com.bxkj.student.databinding.V3AcThreetwooneBinding) r3
                android.widget.TextView r3 = r3.tvNumber
                java.lang.String r0 = "GO"
                r3.setText(r0)
                m0.a$a r3 = m0.a.a
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r0 = r2.a
                android.content.Context r0 = r0.G()
                r1 = 2131886096(0x7f120010, float:1.9406761E38)
                int[] r1 = new int[]{r1}
                r3.b(r0, r1)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                java.lang.String r0 = "animation"
                kotlin.jvm.internal.g0.p(r3, r0)
                super.onAnimationStart(r3)
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r3 = r2.a
                androidx.databinding.ViewDataBinding r3 = r3.K()
                com.bxkj.student.databinding.V3AcThreetwooneBinding r3 = (com.bxkj.student.databinding.V3AcThreetwooneBinding) r3
                android.widget.TextView r3 = r3.tvNumber
                java.lang.String r0 = "3"
                r3.setText(r0)
                m0.a$a r3 = m0.a.a
                com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r0 = r2.a
                android.content.Context r0 = r0.G()
                r1 = 2131886085(0x7f120005, float:1.9406739E38)
                int[] r1 = new int[]{r1}
                r3.b(r0, r1)
                return
        }
    }

    public V3ThreeTwoOneActivity() {
            r1 = this;
            r1.<init>()
            r0 = 4
            r1.W = r0
            return
    }

    private final void L() {
            r8 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0054: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r2 = "scaleX"
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r2, r1)
            float[] r2 = new float[r0]
            r2 = {x005c: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r3 = "scaleY"
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r3, r2)
            float[] r3 = new float[r0]
            r3 = {x0064: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r4 = "alpha"
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r4, r3)
            androidx.databinding.ViewDataBinding r4 = r8.K()
            com.bxkj.student.databinding.V3AcThreetwooneBinding r4 = (com.bxkj.student.databinding.V3AcThreetwooneBinding) r4
            android.widget.TextView r4 = r4.tvNumber
            r5 = 3
            android.animation.PropertyValuesHolder[] r6 = new android.animation.PropertyValuesHolder[r5]
            r7 = 0
            r6[r7] = r1
            r1 = 1
            r6[r1] = r2
            r6[r0] = r3
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r4, r6)
            java.lang.String r1 = "ofPropertyValuesHolder(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.setDuration(r1)
            r0.setRepeatCount(r5)
            r8.W = r5
            com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity$a r1 = new com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity$a
            r1.<init>(r8)
            r0.addListener(r1)
            r0.start()
            return
    }

    public static final /* synthetic */ int e(com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r0) {
            int r0 = r0.W
            return r0
    }

    public static final /* synthetic */ void f(com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity r0, int r1) {
            r0.W = r1
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.common.view.b
    public void onBackPressed() {
            r0 = this;
            return
    }

    protected void onResume() {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            r0.L()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r3 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r1 = r1.B()
            java.lang.String r2 = "runType"
            int r0 = r0.k(r1, r2)
            if (r0 == 0) goto L1b
            r1 = 2
            if (r0 == r1) goto L17
            r0 = 2131100711(0x7f060427, float:1.7813811E38)
            goto L1e
        L17:
            r0 = 2131100709(0x7f060425, float:1.7813807E38)
            goto L1e
        L1b:
            r0 = 2131100713(0x7f060429, float:1.7813815E38)
        L1e:
            androidx.databinding.ViewDataBinding r1 = r3.K()
            com.bxkj.student.databinding.V3AcThreetwooneBinding r1 = (com.bxkj.student.databinding.V3AcThreetwooneBinding) r1
            android.widget.RelativeLayout r1 = r1.rlThreetwoone
            r1.setBackgroundResource(r0)
            android.content.Context r1 = r3.G()
            int r0 = androidx.core.content.ContextCompat.getColor(r1, r0)
            com.bxkj.student.common.utils.k.g(r3, r0)
            return
    }
}
