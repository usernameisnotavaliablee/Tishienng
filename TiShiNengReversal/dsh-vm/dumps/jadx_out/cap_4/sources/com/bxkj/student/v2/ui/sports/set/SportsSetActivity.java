package com.bxkj.student.v2.ui.sports.set;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SportsSetActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV2SportsSetBinding, com.bxkj.student.v2.vm.sports.set.SportsSetVM> {
    public SportsSetActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final kotlin.n1 N(com.bxkj.student.v2.ui.sports.set.SportsSetActivity r5, java.util.Map r6) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r6, r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "name"
            java.lang.String r2 = r0.t(r6, r1)
            java.lang.String r3 = "linkUrl"
            java.lang.String r6 = r0.t(r6, r3)
            com.bxkj.student.v2.common.utils.h r0 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r5 = r5.q()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r4.put(r1, r2)
            r4.put(r3, r6)
            kotlin.n1 r6 = kotlin.n1.a
            r0.b(r5, r4)
            return r6
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.set.SportsSetActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = N(r0, r1)
            return r0
    }

    public final void L() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity> r2 = com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity.class
            android.content.Intent r0 = r0.setClass(r1, r2)
            java.lang.String r1 = "showBottom"
            r2 = 0
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r3.startActivity(r0)
            return
    }

    public final void M() {
            r2 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.sports.set.SportsSetVM r0 = (com.bxkj.student.v2.vm.sports.set.SportsSetVM) r0
            com.bxkj.student.v2.ui.sports.set.e r1 = new com.bxkj.student.v2.ui.sports.set.e
            r1.<init>(r2)
            r0.x(r1)
            return
    }

    public final void O() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity> r2 = com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity.class
            android.content.Intent r0 = r0.setClass(r1, r2)
            r3.startActivity(r0)
            return
    }

    public final void P() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity> r2 = com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity.class
            android.content.Intent r0 = r0.setClass(r1, r2)
            r3.startActivity(r0)
            return
    }

    public final void Q() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.set.V3StatisticsActivity> r2 = com.bxkj.student.v2.ui.sports.v3.set.V3StatisticsActivity.class
            android.content.Intent r0 = r0.setClass(r1, r2)
            r3.startActivity(r0)
            return
    }

    public final void R() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.set.PermissionSetActivity> r2 = com.bxkj.student.v2.ui.sports.set.PermissionSetActivity.class
            android.content.Intent r0 = r0.setClass(r1, r2)
            r3.startActivity(r0)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV2SportsSetBinding r0 = (com.bxkj.student.databinding.AcV2SportsSetBinding) r0
            r0.setMSportsSetActivity(r2)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            com.bxkj.base.v2.data.UserType r0 = r0.T()
            com.bxkj.base.v2.data.UserType r1 = com.bxkj.base.v2.data.UserType.TEACHER
            if (r0 != r1) goto L24
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV2SportsSetBinding r0 = (com.bxkj.student.databinding.AcV2SportsSetBinding) r0
            android.widget.TextView r0 = r0.tvRank
            r1 = 8
            r0.setVisibility(r1)
        L24:
            return
    }
}
