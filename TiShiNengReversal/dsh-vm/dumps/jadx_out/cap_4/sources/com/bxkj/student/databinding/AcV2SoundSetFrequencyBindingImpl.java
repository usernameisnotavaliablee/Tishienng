package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AcV2SoundSetFrequencyBindingImpl extends com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback23;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final android.widget.LinearLayout mboundView0;

    static {
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = new androidx.databinding.ViewDataBinding$IncludedLayouts
            r1 = 4
            r0.<init>(r1)
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBindingImpl.sIncludes = r0
            java.lang.String r1 = "v3_pub_title"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 2
            int[] r2 = new int[]{r2}
            r3 = 2131493738(0x7f0c036a, float:1.8610965E38)
            int[] r3 = new int[]{r3}
            r4 = 0
            r0.setIncludes(r4, r1, r2, r3)
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBindingImpl.sViewsWithIds = r0
            r1 = 2131298361(0x7f090839, float:1.8214693E38)
            r2 = 3
            r0.put(r1, r2)
            return
    }

    public AcV2SoundSetFrequencyBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.AcV2SoundSetFrequencyBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.AcV2SoundSetFrequencyBindingImpl.sViewsWithIds
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private AcV2SoundSetFrequencyBindingImpl(androidx.databinding.DataBindingComponent r10, android.view.View r11, java.lang.Object[] r12) {
            r9 = this;
            r0 = 1
            r1 = r12[r0]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 3
            r1 = r12[r1]
            r7 = r1
            android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7
            r1 = 2
            r1 = r12[r1]
            r8 = r1
            com.bxkj.student.databinding.V3PubTitleBinding r8 = (com.bxkj.student.databinding.V3PubTitleBinding) r8
            r5 = 1
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = -1
            r2.mDirtyFlags = r10
            android.widget.Button r10 = r2.btOk
            r11 = 0
            r10.setTag(r11)
            r10 = 0
            r10 = r12[r10]
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r2.mboundView0 = r10
            r10.setTag(r11)
            com.bxkj.student.databinding.V3PubTitleBinding r10 = r2.titleLayout
            r9.setContainedBinding(r10)
            r9.setRootTag(r4)
            com.bxkj.student.generated.callback.a r10 = new com.bxkj.student.generated.callback.a
            r10.<init>(r9, r0)
            r2.mCallback23 = r10
            r9.invalidateAll()
            return
    }

    private boolean onChangeTitleLayout(com.bxkj.student.databinding.V3PubTitleBinding r3, int r4) {
            r2 = this;
            if (r4 != 0) goto L10
            monitor-enter(r2)
            long r3 = r2.mDirtyFlags     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            long r3 = r3 | r0
            r2.mDirtyFlags = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            r3 = 1
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        L10:
            r3 = 0
            return r3
    }

    @Override // com.bxkj.student.generated.callback.a.InterfaceC0073a
    public final void _internalCallbackOnClick(int r1, android.view.View r2) {
            r0 = this;
            com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity r1 = r0.mMActivity
            if (r1 == 0) goto L7
            r1.finish()
        L7:
            return
    }

    protected void executeBindings() {
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.mDirtyFlags     // Catch: java.lang.Throwable -> L31
            r2 = 0
            r8.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L31
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L31
            com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity r4 = r8.mMActivity
            r5 = 6
            long r5 = r5 & r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r5 = 4
            long r0 = r0 & r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L24
            android.widget.Button r0 = r8.btOk
            android.view.View$OnClickListener r1 = r8.mCallback23
            r0.setOnClickListener(r1)
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r8.titleLayout
            java.lang.String r1 = "播报频率设置"
            r0.setTitle(r1)
        L24:
            if (r7 == 0) goto L2b
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r8.titleLayout
            r0.setActivity(r4)
        L2b:
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r8.titleLayout
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        L31:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L31
            throw r0
    }

    public boolean hasPendingBindings() {
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.mDirtyFlags     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto Le
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            return r4
        Lc:
            r0 = move-exception
            goto L1a
        Le:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r6.titleLayout
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L18
            return r4
        L18:
            r0 = 0
            return r0
        L1a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public void invalidateAll() {
            r2 = this;
            monitor-enter(r2)
            r0 = 4
            r2.mDirtyFlags = r0     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r2.titleLayout
            r0.invalidateAll()
            r2.requestRebind()
            return
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    protected boolean onFieldChange(int r1, java.lang.Object r2, int r3) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 0
            return r1
        L4:
            com.bxkj.student.databinding.V3PubTitleBinding r2 = (com.bxkj.student.databinding.V3PubTitleBinding) r2
            boolean r1 = r0.onChangeTitleLayout(r2, r3)
            return r1
    }

    public void setLifecycleOwner(@androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            super.setLifecycleOwner(r2)
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r1.titleLayout
            r0.setLifecycleOwner(r2)
            return
    }

    @Override // com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding
    public void setMActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity r5) {
            r4 = this;
            r4.mMActivity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 17
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    public boolean setVariable(int r2, @androidx.annotation.Nullable java.lang.Object r3) {
            r1 = this;
            r0 = 17
            if (r0 != r2) goto Lb
            com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity r3 = (com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity) r3
            r1.setMActivity(r3)
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
