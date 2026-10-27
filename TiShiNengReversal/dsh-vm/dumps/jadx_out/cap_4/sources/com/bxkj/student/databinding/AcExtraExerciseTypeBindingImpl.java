package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AcExtraExerciseTypeBindingImpl extends com.bxkj.student.databinding.AcExtraExerciseTypeBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback2;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback3;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final android.widget.LinearLayout mboundView0;

    static {
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = new androidx.databinding.ViewDataBinding$IncludedLayouts
            r1 = 4
            r0.<init>(r1)
            com.bxkj.student.databinding.AcExtraExerciseTypeBindingImpl.sIncludes = r0
            java.lang.String r1 = "new_pub_title"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 3
            int[] r2 = new int[]{r2}
            r3 = 2131493609(0x7f0c02e9, float:1.8610703E38)
            int[] r3 = new int[]{r3}
            r4 = 0
            r0.setIncludes(r4, r1, r2, r3)
            r0 = 0
            com.bxkj.student.databinding.AcExtraExerciseTypeBindingImpl.sViewsWithIds = r0
            return
    }

    public AcExtraExerciseTypeBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.AcExtraExerciseTypeBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.AcExtraExerciseTypeBindingImpl.sViewsWithIds
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private AcExtraExerciseTypeBindingImpl(androidx.databinding.DataBindingComponent r10, android.view.View r11, java.lang.Object[] r12) {
            r9 = this;
            r0 = 1
            r1 = r12[r0]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 2
            r2 = r12[r1]
            r7 = r2
            android.widget.Button r7 = (android.widget.Button) r7
            r2 = 3
            r2 = r12[r2]
            r8 = r2
            com.bxkj.base.databinding.NewPubTitleBinding r8 = (com.bxkj.base.databinding.NewPubTitleBinding) r8
            r5 = 1
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = -1
            r2.mDirtyFlags = r10
            android.widget.Button r10 = r2.btIn
            r11 = 0
            r10.setTag(r11)
            android.widget.Button r10 = r2.btOut
            r10.setTag(r11)
            r10 = 0
            r10 = r12[r10]
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r2.mboundView0 = r10
            r10.setTag(r11)
            com.bxkj.base.databinding.NewPubTitleBinding r10 = r2.toolbar
            r9.setContainedBinding(r10)
            r9.setRootTag(r4)
            com.bxkj.student.generated.callback.a r10 = new com.bxkj.student.generated.callback.a
            r10.<init>(r9, r1)
            r2.mCallback3 = r10
            com.bxkj.student.generated.callback.a r10 = new com.bxkj.student.generated.callback.a
            r10.<init>(r9, r0)
            r2.mCallback2 = r10
            r9.invalidateAll()
            return
    }

    private boolean onChangeToolbar(com.bxkj.base.databinding.NewPubTitleBinding r3, int r4) {
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
            r2 = 1
            if (r1 == r2) goto Lf
            r2 = 2
            if (r1 == r2) goto L7
            return
        L7:
            com.bxkj.student.run.extraclass.SignTypeActivity r1 = r0.mSignTypeActivity
            if (r1 == 0) goto Le
            r1.M()
        Le:
            return
        Lf:
            com.bxkj.student.run.extraclass.SignTypeActivity r1 = r0.mSignTypeActivity
            if (r1 == 0) goto L16
            r1.L()
        L16:
            return
    }

    protected void executeBindings() {
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.mDirtyFlags     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r8.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L38
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L38
            com.bxkj.student.run.extraclass.SignTypeActivity r4 = r8.mSignTypeActivity
            r5 = 6
            long r5 = r5 & r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r5 = 4
            long r0 = r0 & r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L2b
            android.widget.Button r0 = r8.btIn
            android.view.View$OnClickListener r1 = r8.mCallback2
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r8.btOut
            android.view.View$OnClickListener r1 = r8.mCallback3
            r0.setOnClickListener(r1)
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r8.toolbar
            java.lang.String r1 = "选择签到类型"
            r0.setTitle(r1)
        L2b:
            if (r7 == 0) goto L32
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r8.toolbar
            r0.setActivity(r4)
        L32:
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r8.toolbar
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        L38:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L38
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
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r6.toolbar
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
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r2.toolbar
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
            com.bxkj.base.databinding.NewPubTitleBinding r2 = (com.bxkj.base.databinding.NewPubTitleBinding) r2
            boolean r1 = r0.onChangeToolbar(r2, r3)
            return r1
    }

    public void setLifecycleOwner(@androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            super.setLifecycleOwner(r2)
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r1.toolbar
            r0.setLifecycleOwner(r2)
            return
    }

    @Override // com.bxkj.student.databinding.AcExtraExerciseTypeBinding
    public void setSignTypeActivity(@androidx.annotation.Nullable com.bxkj.student.run.extraclass.SignTypeActivity r5) {
            r4 = this;
            r4.mSignTypeActivity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 25
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
            r0 = 25
            if (r0 != r2) goto Lb
            com.bxkj.student.run.extraclass.SignTypeActivity r3 = (com.bxkj.student.run.extraclass.SignTypeActivity) r3
            r1.setSignTypeActivity(r3)
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
