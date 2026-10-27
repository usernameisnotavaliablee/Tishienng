package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class V3FmBasicBindingImpl extends com.bxkj.student.databinding.V3FmBasicBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback71;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;

    @androidx.annotation.Nullable
    private final com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding mboundView11;

    @androidx.annotation.NonNull
    private final android.widget.ImageView mboundView2;

    static {
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = new androidx.databinding.ViewDataBinding$IncludedLayouts
            r1 = 33
            r0.<init>(r1)
            com.bxkj.student.databinding.V3FmBasicBindingImpl.sIncludes = r0
            java.lang.String r1 = "v3_layout_sport_detail_data_common"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 3
            int[] r2 = new int[]{r2}
            r3 = 2131493735(0x7f0c0367, float:1.8610959E38)
            int[] r3 = new int[]{r3}
            r4 = 1
            r0.setIncludes(r4, r1, r2, r3)
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.V3FmBasicBindingImpl.sViewsWithIds = r0
            r1 = 2131296747(0x7f0901eb, float:1.821142E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131296712(0x7f0901c8, float:1.8211348E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131298083(0x7f090723, float:1.821413E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131297148(0x7f09037c, float:1.8212233E38)
            r2 = 7
            r0.put(r1, r2)
            r1 = 2131298986(0x7f090aaa, float:1.821596E38)
            r2 = 8
            r0.put(r1, r2)
            r1 = 2131298770(0x7f0909d2, float:1.8215523E38)
            r2 = 9
            r0.put(r1, r2)
            r1 = 2131296685(0x7f0901ad, float:1.8211294E38)
            r2 = 10
            r0.put(r1, r2)
            r1 = 2131298711(0x7f090997, float:1.8215403E38)
            r2 = 11
            r0.put(r1, r2)
            r1 = 2131298712(0x7f090998, float:1.8215405E38)
            r2 = 12
            r0.put(r1, r2)
            r1 = 2131298710(0x7f090996, float:1.82154E38)
            r2 = 13
            r0.put(r1, r2)
            r1 = 2131298858(0x7f090a2a, float:1.8215701E38)
            r2 = 14
            r0.put(r1, r2)
            r1 = 2131298859(0x7f090a2b, float:1.8215703E38)
            r2 = 15
            r0.put(r1, r2)
            r1 = 2131298856(0x7f090a28, float:1.8215697E38)
            r2 = 16
            r0.put(r1, r2)
            r1 = 2131298750(0x7f0909be, float:1.8215482E38)
            r2 = 17
            r0.put(r1, r2)
            r1 = 2131296686(0x7f0901ae, float:1.8211296E38)
            r2 = 18
            r0.put(r1, r2)
            r1 = 2131299063(0x7f090af7, float:1.8216117E38)
            r2 = 19
            r0.put(r1, r2)
            r1 = 2131296706(0x7f0901c2, float:1.8211336E38)
            r2 = 20
            r0.put(r1, r2)
            r1 = 2131299076(0x7f090b04, float:1.8216143E38)
            r2 = 21
            r0.put(r1, r2)
            r1 = 2131299062(0x7f090af6, float:1.8216115E38)
            r2 = 22
            r0.put(r1, r2)
            r1 = 2131299064(0x7f090af8, float:1.8216119E38)
            r2 = 23
            r0.put(r1, r2)
            r1 = 2131299075(0x7f090b03, float:1.8216141E38)
            r2 = 24
            r0.put(r1, r2)
            r1 = 2131296687(0x7f0901af, float:1.8211298E38)
            r2 = 25
            r0.put(r1, r2)
            r1 = 2131298834(0x7f090a12, float:1.8215652E38)
            r2 = 26
            r0.put(r1, r2)
            r1 = 2131296695(0x7f0901b7, float:1.8211314E38)
            r2 = 27
            r0.put(r1, r2)
            r1 = 2131298833(0x7f090a11, float:1.821565E38)
            r2 = 28
            r0.put(r1, r2)
            r1 = 2131297164(0x7f09038c, float:1.8212265E38)
            r2 = 29
            r0.put(r1, r2)
            r1 = 2131297165(0x7f09038d, float:1.8212267E38)
            r2 = 30
            r0.put(r1, r2)
            r1 = 2131297166(0x7f09038e, float:1.821227E38)
            r2 = 31
            r0.put(r1, r2)
            r1 = 2131298030(0x7f0906ee, float:1.8214022E38)
            r2 = 32
            r0.put(r1, r2)
            return
    }

    public V3FmBasicBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.V3FmBasicBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.V3FmBasicBindingImpl.sViewsWithIds
            r2 = 33
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private V3FmBasicBindingImpl(androidx.databinding.DataBindingComponent r34, android.view.View r35, java.lang.Object[] r36) {
            r33 = this;
            r0 = 10
            r0 = r36[r0]
            r4 = r0
            com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
            r0 = 18
            r0 = r36[r0]
            r5 = r0
            com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
            r0 = 25
            r0 = r36[r0]
            r6 = r0
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r0 = 27
            r0 = r36[r0]
            r7 = r0
            com.google.android.material.card.MaterialCardView r7 = (com.google.android.material.card.MaterialCardView) r7
            r0 = 20
            r0 = r36[r0]
            r8 = r0
            com.google.android.material.card.MaterialCardView r8 = (com.google.android.material.card.MaterialCardView) r8
            r0 = 5
            r0 = r36[r0]
            r9 = r0
            com.google.android.material.card.MaterialCardView r9 = (com.google.android.material.card.MaterialCardView) r9
            r0 = 4
            r0 = r36[r0]
            r10 = r0
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r0 = 7
            r0 = r36[r0]
            r11 = r0
            com.google.android.material.imageview.ShapeableImageView r11 = (com.google.android.material.imageview.ShapeableImageView) r11
            r0 = 29
            r0 = r36[r0]
            r12 = r0
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 30
            r0 = r36[r0]
            r13 = r0
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r0 = 31
            r0 = r36[r0]
            r14 = r0
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0 = 32
            r0 = r36[r0]
            r15 = r0
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            r0 = 6
            r0 = r36[r0]
            r16 = r0
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            r0 = 13
            r0 = r36[r0]
            r17 = r0
            com.bxkj.student.v2.common.view.TrackProgressView r17 = (com.bxkj.student.v2.common.view.TrackProgressView) r17
            r0 = 11
            r0 = r36[r0]
            r18 = r0
            com.bxkj.student.v2.common.view.TrackProgressView r18 = (com.bxkj.student.v2.common.view.TrackProgressView) r18
            r0 = 12
            r0 = r36[r0]
            r19 = r0
            com.bxkj.student.v2.common.view.TrackProgressView r19 = (com.bxkj.student.v2.common.view.TrackProgressView) r19
            r0 = 17
            r0 = r36[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 9
            r0 = r36[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 28
            r0 = r36[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 26
            r0 = r36[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 16
            r0 = r36[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 14
            r0 = r36[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 15
            r0 = r36[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 8
            r0 = r36[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 22
            r0 = r36[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 19
            r0 = r36[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 23
            r0 = r36[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 24
            r0 = r36[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 21
            r0 = r36[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r3 = 0
            r0 = r33
            r1 = r34
            r2 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r1 = -1
            r0.mDirtyFlags = r1
            r1 = 0
            r1 = r36[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r0.mboundView0 = r1
            r2 = 0
            r1.setTag(r2)
            r1 = 1
            r3 = r36[r1]
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r0.mboundView1 = r3
            r3.setTag(r2)
            r3 = 3
            r3 = r36[r3]
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r3 = (com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding) r3
            r0.mboundView11 = r3
            r0.setContainedBinding(r3)
            r3 = 2
            r3 = r36[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.mboundView2 = r3
            r3.setTag(r2)
            r2 = r35
            r0.setRootTag(r2)
            com.bxkj.student.generated.callback.a r2 = new com.bxkj.student.generated.callback.a
            r2.<init>(r0, r1)
            r0.mCallback71 = r2
            r0.invalidateAll()
            return
    }

    @Override // com.bxkj.student.generated.callback.a.InterfaceC0073a
    public final void _internalCallbackOnClick(int r1, android.view.View r2) {
            r0 = this;
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r1 = r0.mMActivity
            if (r1 == 0) goto L7
            r1.T()
        L7:
            return
    }

    protected void executeBindings() {
            r10 = this;
            monitor-enter(r10)
            long r0 = r10.mDirtyFlags     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r10.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L38
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L38
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r4 = r10.mMActivity
            java.util.Map<java.lang.String, java.lang.Object> r5 = r10.mMap
            r6 = 5
            long r6 = r6 & r0
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r6 = 6
            long r6 = r6 & r0
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L1d
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r6 = r10.mboundView11
            r6.setMActivity(r4)
        L1d:
            if (r9 == 0) goto L24
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r4 = r10.mboundView11
            r4.setMap(r5)
        L24:
            r4 = 4
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L32
            android.widget.ImageView r0 = r10.mboundView2
            android.view.View$OnClickListener r1 = r10.mCallback71
            r0.setOnClickListener(r1)
        L32:
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r0 = r10.mboundView11
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        L38:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L38
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
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r0 = r6.mboundView11
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
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r0 = r2.mboundView11
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
            r1 = 0
            return r1
    }

    public void setLifecycleOwner(@androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            super.setLifecycleOwner(r2)
            com.bxkj.student.databinding.V3LayoutSportDetailDataCommonBinding r0 = r1.mboundView11
            r0.setLifecycleOwner(r2)
            return
    }

    @Override // com.bxkj.student.databinding.V3FmBasicBinding
    public void setMActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r5) {
            r4 = this;
            r4.mMActivity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 1
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

    @Override // com.bxkj.student.databinding.V3FmBasicBinding
    public void setMap(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r5) {
            r4 = this;
            r4.mMap = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 20
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    public boolean setVariable(int r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r2 = this;
            r0 = 17
            r1 = 1
            if (r0 != r3) goto Lb
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r4 = (com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity) r4
            r2.setMActivity(r4)
            return r1
        Lb:
            r0 = 20
            if (r0 != r3) goto L15
            java.util.Map r4 = (java.util.Map) r4
            r2.setMap(r4)
            return r1
        L15:
            r3 = 0
            return r3
    }
}
