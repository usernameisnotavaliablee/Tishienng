package com.bxkj.student.v2.ui.sports.set;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SoundFrequencyActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding, com.bxkj.student.v2.vm.sports.set.SoundFrequencySetVM> {
    public SoundFrequencyActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity r0, android.widget.RadioGroup r1, int r2) {
            f(r0, r1, r2)
            return
    }

    private static final void f(com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity r1, android.widget.RadioGroup r2, int r3) {
            com.bxkj.base.v2.data.b$a r2 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r2.a()
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding r0 = (com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding) r0
            android.widget.RadioGroup r0 = r0.rg
            androidx.databinding.ViewDataBinding r1 = r1.K()
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding r1 = (com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding) r1
            android.widget.RadioGroup r1 = r1.rg
            android.view.View r1 = r1.findViewById(r3)
            int r1 = r0.indexOfChild(r1)
            r2.m0(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding r0 = (com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding) r0
            android.widget.RadioGroup r0 = r0.rg
            com.bxkj.student.v2.ui.sports.set.b r1 = new com.bxkj.student.v2.ui.sports.set.b
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding r0 = (com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding) r0
            r0.setMActivity(r2)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding r0 = (com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding) r0
            android.widget.RadioGroup r0 = r0.rg
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            int r1 = r1.o()
            android.view.View r0 = r0.getChildAt(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.RadioButton"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r1 = 1
            r0.setChecked(r1)
            return
    }
}
