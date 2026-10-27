package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class V3FaceCollectConfirmBindingImpl extends com.bxkj.student.databinding.V3FaceCollectConfirmBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback79;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback80;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;

    @androidx.annotation.NonNull
    private final android.widget.Button mboundView2;

    @androidx.annotation.NonNull
    private final android.widget.Button mboundView3;

    static {
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = new androidx.databinding.ViewDataBinding$IncludedLayouts
            r1 = 8
            r0.<init>(r1)
            com.bxkj.student.databinding.V3FaceCollectConfirmBindingImpl.sIncludes = r0
            java.lang.String r1 = "v3_pub_title"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 4
            int[] r2 = new int[]{r2}
            r3 = 2131493738(0x7f0c036a, float:1.8610965E38)
            int[] r3 = new int[]{r3}
            r4 = 1
            r0.setIncludes(r4, r1, r2, r3)
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.V3FaceCollectConfirmBindingImpl.sViewsWithIds = r0
            r1 = 2131297135(0x7f09036f, float:1.8212206E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131298947(0x7f090a83, float:1.8215882E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131298946(0x7f090a82, float:1.821588E38)
            r2 = 7
            r0.put(r1, r2)
            return
    }

    public V3FaceCollectConfirmBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.V3FaceCollectConfirmBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.V3FaceCollectConfirmBindingImpl.sViewsWithIds
            r2 = 8
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private V3FaceCollectConfirmBindingImpl(androidx.databinding.DataBindingComponent r10, android.view.View r11, java.lang.Object[] r12) {
            r9 = this;
            r0 = 5
            r0 = r12[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 4
            r0 = r12[r0]
            r6 = r0
            com.bxkj.student.databinding.V3PubTitleBinding r6 = (com.bxkj.student.databinding.V3PubTitleBinding) r6
            r0 = 7
            r0 = r12[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r12[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r4 = 1
            r1 = r9
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10 = -1
            r1.mDirtyFlags = r10
            com.bxkj.student.databinding.V3PubTitleBinding r10 = r1.layoutTitle
            r9.setContainedBinding(r10)
            r10 = 0
            r10 = r12[r10]
            androidx.core.widget.NestedScrollView r10 = (androidx.core.widget.NestedScrollView) r10
            r1.mboundView0 = r10
            r11 = 0
            r10.setTag(r11)
            r10 = 1
            r0 = r12[r10]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1.mboundView1 = r0
            r0.setTag(r11)
            r0 = 2
            r2 = r12[r0]
            android.widget.Button r2 = (android.widget.Button) r2
            r1.mboundView2 = r2
            r2.setTag(r11)
            r2 = 3
            r12 = r12[r2]
            android.widget.Button r12 = (android.widget.Button) r12
            r1.mboundView3 = r12
            r12.setTag(r11)
            r9.setRootTag(r3)
            com.bxkj.student.generated.callback.a r11 = new com.bxkj.student.generated.callback.a
            r11.<init>(r9, r10)
            r1.mCallback79 = r11
            com.bxkj.student.generated.callback.a r10 = new com.bxkj.student.generated.callback.a
            r10.<init>(r9, r0)
            r1.mCallback80 = r10
            r9.invalidateAll()
            return
    }

    private boolean onChangeLayoutTitle(com.bxkj.student.databinding.V3PubTitleBinding r3, int r4) {
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
            com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity r1 = r0.mActivity
            if (r1 == 0) goto Le
            r1.L()
        Le:
            return
        Lf:
            com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity r1 = r0.mActivity
            if (r1 == 0) goto L16
            r1.finish()
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
            com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity r4 = r8.mActivity
            r5 = 6
            long r5 = r5 & r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 == 0) goto L16
            com.bxkj.student.databinding.V3PubTitleBinding r5 = r8.layoutTitle
            r5.setActivity(r4)
        L16:
            r4 = 4
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L32
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r8.layoutTitle
            java.lang.String r1 = "人脸信息确认"
            r0.setTitle(r1)
            android.widget.Button r0 = r8.mboundView2
            android.view.View$OnClickListener r1 = r8.mCallback79
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r8.mboundView3
            android.view.View$OnClickListener r1 = r8.mCallback80
            r0.setOnClickListener(r1)
        L32:
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r8.layoutTitle
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
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r6.layoutTitle
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
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r2.layoutTitle
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
            boolean r1 = r0.onChangeLayoutTitle(r2, r3)
            return r1
    }

    @Override // com.bxkj.student.databinding.V3FaceCollectConfirmBinding
    public void setActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity r5) {
            r4 = this;
            r4.mActivity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L13
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            r5 = 1
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L13:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            throw r5
    }

    public void setLifecycleOwner(@androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            super.setLifecycleOwner(r2)
            com.bxkj.student.databinding.V3PubTitleBinding r0 = r1.layoutTitle
            r0.setLifecycleOwner(r2)
            return
    }

    public boolean setVariable(int r2, @androidx.annotation.Nullable java.lang.Object r3) {
            r1 = this;
            r0 = 1
            if (r0 != r2) goto L9
            com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity r3 = (com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity) r3
            r1.setActivity(r3)
            return r0
        L9:
            r2 = 0
            return r2
    }
}
