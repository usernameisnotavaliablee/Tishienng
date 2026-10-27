package com.autonavi.amap.mapcore.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLAnimationSet extends com.autonavi.amap.mapcore.animation.GLAnimation {
    private static final int PROPERTY_CHANGE_BOUNDS_MASK = 128;
    private static final int PROPERTY_DURATION_MASK = 32;
    private static final int PROPERTY_FILL_AFTER_MASK = 1;
    private static final int PROPERTY_FILL_BEFORE_MASK = 2;
    private static final int PROPERTY_MORPH_MATRIX_MASK = 64;
    private static final int PROPERTY_REPEAT_MODE_MASK = 4;
    private static final int PROPERTY_SHARE_INTERPOLATOR_MASK = 16;
    private static final int PROPERTY_START_OFFSET_MASK = 8;
    private java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> mAnimations;
    private boolean mDirty;
    private int mFlags;
    private boolean mHasAlpha;
    private long mLastEnd;
    private com.autonavi.amap.mapcore.animation.GLTransformation mTempTransformation;

    public GLAnimationSet(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mFlags = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAnimations = r0
            com.autonavi.amap.mapcore.animation.GLTransformation r0 = new com.autonavi.amap.mapcore.animation.GLTransformation
            r0.<init>()
            r1.mTempTransformation = r0
            r0 = 16
            r1.setFlag(r0, r2)
            r1.init()
            return
    }

    private void init() {
            r2 = this;
            r0 = 0
            r2.mStartTime = r0
            return
    }

    private void setFlag(int r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L8
            int r2 = r0.mFlags
            r1 = r1 | r2
            r0.mFlags = r1
            return
        L8:
            int r2 = r0.mFlags
            int r1 = ~r1
            r1 = r1 & r2
            r0.mFlags = r1
            return
    }

    public void addAnimation(com.amap.api.maps.model.animation.Animation r8) {
            r7 = this;
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r0 = r7.mAnimations
            com.autonavi.amap.mapcore.animation.GLAnimation r1 = r8.glAnimation
            r0.add(r1)
            int r0 = r7.mFlags
            r0 = r0 & 64
            if (r0 != 0) goto L1b
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r8.glAnimation
            boolean r0 = r0.willChangeTransformationMatrix()
            if (r0 == 0) goto L1b
            int r0 = r7.mFlags
            r0 = r0 | 64
            r7.mFlags = r0
        L1b:
            int r0 = r7.mFlags
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 != 0) goto L2f
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r8.glAnimation
            boolean r0 = r0.willChangeBounds()
            if (r0 == 0) goto L2f
            int r0 = r7.mFlags
            r0 = r0 | 128(0x80, float:1.8E-43)
            r7.mFlags = r0
        L2f:
            int r0 = r7.mFlags
            r1 = 32
            r0 = r0 & r1
            r2 = 1
            if (r0 != r1) goto L3f
            long r0 = r7.mStartOffset
            long r3 = r7.mDuration
            long r0 = r0 + r3
            r7.mLastEnd = r0
            goto L76
        L3f:
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r0 = r7.mAnimations
            int r0 = r0.size()
            if (r0 != r2) goto L5c
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r8.glAnimation
            long r0 = r0.getStartOffset()
            com.autonavi.amap.mapcore.animation.GLAnimation r8 = r8.glAnimation
            long r3 = r8.getDuration()
            long r0 = r0 + r3
            r7.mDuration = r0
            long r3 = r7.mStartOffset
            long r3 = r3 + r0
            r7.mLastEnd = r3
            goto L76
        L5c:
            long r0 = r7.mLastEnd
            com.autonavi.amap.mapcore.animation.GLAnimation r3 = r8.glAnimation
            long r3 = r3.getStartOffset()
            com.autonavi.amap.mapcore.animation.GLAnimation r8 = r8.glAnimation
            long r5 = r8.getDuration()
            long r3 = r3 + r5
            long r0 = java.lang.Math.max(r0, r3)
            r7.mLastEnd = r0
            long r3 = r7.mStartOffset
            long r0 = r0 - r3
            r7.mDuration = r0
        L76:
            r7.mDirty = r2
            return
    }

    public void cleanAnimation() {
            r1 = this;
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r0 = r1.mAnimations
            r0.clear()
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public /* bridge */ /* synthetic */ com.autonavi.amap.mapcore.animation.GLAnimation clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.autonavi.amap.mapcore.animation.GLAnimationSet r0 = r1.clone()
            return r0
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public com.autonavi.amap.mapcore.animation.GLAnimationSet clone() throws java.lang.CloneNotSupportedException {
            r6 = this;
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = super.clone()
            com.autonavi.amap.mapcore.animation.GLAnimationSet r0 = (com.autonavi.amap.mapcore.animation.GLAnimationSet) r0
            com.autonavi.amap.mapcore.animation.GLTransformation r1 = new com.autonavi.amap.mapcore.animation.GLTransformation
            r1.<init>()
            r0.mTempTransformation = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mAnimations = r1
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r1 = r6.mAnimations
            int r1 = r1.size()
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r2 = r6.mAnimations
            r3 = 0
        L1d:
            if (r3 >= r1) goto L31
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r4 = r0.mAnimations
            java.lang.Object r5 = r2.get(r3)
            com.autonavi.amap.mapcore.animation.GLAnimation r5 = (com.autonavi.amap.mapcore.animation.GLAnimation) r5
            com.autonavi.amap.mapcore.animation.GLAnimation r5 = r5.clone()
            r4.add(r5)
            int r3 = r3 + 1
            goto L1d
        L31:
            return r0
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo43clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.autonavi.amap.mapcore.animation.GLAnimationSet r0 = r1.clone()
            return r0
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public long computeDurationHint() {
            r7 = this;
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r0 = r7.mAnimations
            int r0 = r0.size()
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r1 = r7.mAnimations
            int r0 = r0 + (-1)
            r2 = 0
        Lc:
            if (r0 < 0) goto L20
            java.lang.Object r4 = r1.get(r0)
            com.autonavi.amap.mapcore.animation.GLAnimation r4 = (com.autonavi.amap.mapcore.animation.GLAnimation) r4
            long r4 = r4.computeDurationHint()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L1d
            r2 = r4
        L1d:
            int r0 = r0 + (-1)
            goto Lc
        L20:
            return r2
    }

    public java.util.List<com.autonavi.amap.mapcore.animation.GLAnimation> getAnimations() {
            r1 = this;
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r0 = r1.mAnimations
            return r0
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public long getDuration() {
            r7 = this;
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r0 = r7.mAnimations
            int r1 = r0.size()
            int r2 = r7.mFlags
            r3 = 32
            r2 = r2 & r3
            if (r2 != r3) goto L10
            long r0 = r7.mDuration
            return r0
        L10:
            r2 = 0
            r4 = 0
        L13:
            if (r4 >= r1) goto L26
            java.lang.Object r5 = r0.get(r4)
            com.autonavi.amap.mapcore.animation.GLAnimation r5 = (com.autonavi.amap.mapcore.animation.GLAnimation) r5
            long r5 = r5.getDuration()
            long r2 = java.lang.Math.max(r2, r5)
            int r4 = r4 + 1
            goto L13
        L26:
            return r2
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public long getStartTime() {
            r7 = this;
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r0 = r7.mAnimations
            int r0 = r0.size()
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r1 = r7.mAnimations
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
        Le:
            if (r4 >= r0) goto L21
            java.lang.Object r5 = r1.get(r4)
            com.autonavi.amap.mapcore.animation.GLAnimation r5 = (com.autonavi.amap.mapcore.animation.GLAnimation) r5
            long r5 = r5.getStartTime()
            long r2 = java.lang.Math.min(r2, r5)
            int r4 = r4 + 1
            goto Le
        L21:
            return r2
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public boolean getTransformation(long r11, com.autonavi.amap.mapcore.animation.GLTransformation r13) {
            r10 = this;
            boolean r0 = r10.mInitialized
            if (r0 != 0) goto L7
            r10.initialize()
        L7:
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r0 = r10.mAnimations
            int r0 = r0.size()
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r1 = r10.mAnimations
            com.autonavi.amap.mapcore.animation.GLTransformation r2 = r10.mTempTransformation
            r13.clear()
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
        L1a:
            if (r0 < 0) goto L4f
            java.lang.Object r8 = r1.get(r0)
            com.autonavi.amap.mapcore.animation.GLAnimation r8 = (com.autonavi.amap.mapcore.animation.GLAnimation) r8
            r2.clear()
            float r9 = r10.getScaleFactor()
            boolean r9 = r8.getTransformation(r11, r13, r9)
            if (r9 != 0) goto L34
            if (r6 == 0) goto L32
            goto L34
        L32:
            r6 = 0
            goto L35
        L34:
            r6 = 1
        L35:
            if (r5 != 0) goto L40
            boolean r5 = r8.hasStarted()
            if (r5 == 0) goto L3e
            goto L40
        L3e:
            r5 = 0
            goto L41
        L40:
            r5 = 1
        L41:
            boolean r8 = r8.hasEnded()
            if (r8 == 0) goto L4b
            if (r7 == 0) goto L4b
            r7 = 1
            goto L4c
        L4b:
            r7 = 0
        L4c:
            int r0 = r0 + (-1)
            goto L1a
        L4f:
            if (r5 == 0) goto L5e
            boolean r11 = r10.mStarted     // Catch: java.lang.Throwable -> L6b
            if (r11 != 0) goto L5e
            com.amap.api.maps.model.animation.Animation$AnimationListener r11 = r10.mListener     // Catch: java.lang.Throwable -> L6b
            if (r11 == 0) goto L5c
            r11.onAnimationStart()     // Catch: java.lang.Throwable -> L6b
        L5c:
            r10.mStarted = r3     // Catch: java.lang.Throwable -> L6b
        L5e:
            boolean r11 = r10.mEnded     // Catch: java.lang.Throwable -> L6b
            if (r7 == r11) goto L6b
            com.amap.api.maps.model.animation.Animation$AnimationListener r11 = r10.mListener     // Catch: java.lang.Throwable -> L6b
            if (r11 == 0) goto L69
            r11.onAnimationEnd()     // Catch: java.lang.Throwable -> L6b
        L69:
            r10.mEnded = r7     // Catch: java.lang.Throwable -> L6b
        L6b:
            return r6
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public boolean hasAlpha() {
            r4 = this;
            boolean r0 = r4.mDirty
            if (r0 == 0) goto L26
            r0 = 0
            r4.mHasAlpha = r0
            r4.mDirty = r0
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r1 = r4.mAnimations
            int r1 = r1.size()
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r2 = r4.mAnimations
        L11:
            if (r0 >= r1) goto L26
            java.lang.Object r3 = r2.get(r0)
            com.autonavi.amap.mapcore.animation.GLAnimation r3 = (com.autonavi.amap.mapcore.animation.GLAnimation) r3
            boolean r3 = r3.hasAlpha()
            if (r3 == 0) goto L23
            r0 = 1
            r4.mHasAlpha = r0
            goto L26
        L23:
            int r0 = r0 + 1
            goto L11
        L26:
            boolean r0 = r4.mHasAlpha
            return r0
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void initialize() {
            r22 = this;
            r0 = r22
            super.initialize()
            int r1 = r0.mFlags
            r2 = r1 & 32
            r4 = 1
            r5 = 32
            if (r2 != r5) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            r5 = r1 & 1
            if (r5 != r4) goto L17
            r5 = 1
            goto L18
        L17:
            r5 = 0
        L18:
            r6 = r1 & 2
            r7 = 2
            if (r6 != r7) goto L1f
            r6 = 1
            goto L20
        L1f:
            r6 = 0
        L20:
            r7 = r1 & 4
            r8 = 4
            if (r7 != r8) goto L27
            r7 = 1
            goto L28
        L27:
            r7 = 0
        L28:
            r8 = r1 & 16
            r9 = 16
            if (r8 != r9) goto L30
            r8 = 1
            goto L31
        L30:
            r8 = 0
        L31:
            r9 = 8
            r1 = r1 & r9
            if (r1 != r9) goto L37
            goto L38
        L37:
            r4 = 0
        L38:
            if (r8 == 0) goto L3d
            r0.ensureInterpolator()
        L3d:
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r1 = r0.mAnimations
            int r9 = r1.size()
            long r10 = r0.mDuration
            boolean r12 = r0.mFillAfter
            boolean r13 = r0.mFillBefore
            int r14 = r0.mRepeatMode
            android.view.animation.Interpolator r15 = r0.mInterpolator
            r17 = r4
            long r3 = r0.mStartOffset
            r0 = 0
        L52:
            if (r0 >= r9) goto L95
            java.lang.Object r16 = r1.get(r0)
            r18 = r0
            r0 = r16
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = (com.autonavi.amap.mapcore.animation.GLAnimation) r0
            if (r2 == 0) goto L63
            r0.setDuration(r10)
        L63:
            if (r5 == 0) goto L68
            r0.setFillAfter(r12)
        L68:
            if (r6 == 0) goto L6d
            r0.setFillBefore(r13)
        L6d:
            if (r7 == 0) goto L72
            r0.setRepeatMode(r14)
        L72:
            if (r8 == 0) goto L77
            r0.setInterpolator(r15)
        L77:
            if (r17 == 0) goto L87
            long r19 = r0.getStartOffset()
            r21 = r1
            r16 = r2
            long r1 = r19 + r3
            r0.setStartOffset(r1)
            goto L8b
        L87:
            r21 = r1
            r16 = r2
        L8b:
            r0.initialize()
            int r0 = r18 + 1
            r2 = r16
            r1 = r21
            goto L52
        L95:
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void reset() {
            r0 = this;
            super.reset()
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void restrictDuration(long r5) {
            r4 = this;
            super.restrictDuration(r5)
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r0 = r4.mAnimations
            int r1 = r0.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L18
            java.lang.Object r3 = r0.get(r2)
            com.autonavi.amap.mapcore.animation.GLAnimation r3 = (com.autonavi.amap.mapcore.animation.GLAnimation) r3
            r3.restrictDuration(r5)
            int r2 = r2 + 1
            goto La
        L18:
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void scaleCurrentDuration(float r5) {
            r4 = this;
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r0 = r4.mAnimations
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            java.lang.Object r3 = r0.get(r2)
            com.autonavi.amap.mapcore.animation.GLAnimation r3 = (com.autonavi.amap.mapcore.animation.GLAnimation) r3
            r3.scaleCurrentDuration(r5)
            int r2 = r2 + 1
            goto L7
        L15:
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setDuration(long r3) {
            r2 = this;
            int r0 = r2.mFlags
            r0 = r0 | 32
            r2.mFlags = r0
            super.setDuration(r3)
            long r3 = r2.mStartOffset
            long r0 = r2.mDuration
            long r3 = r3 + r0
            r2.mLastEnd = r3
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setFillAfter(boolean r2) {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 | 1
            r1.mFlags = r0
            super.setFillAfter(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setFillBefore(boolean r2) {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 | 2
            r1.mFlags = r0
            super.setFillBefore(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setRepeatMode(int r2) {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 | 4
            r1.mFlags = r0
            super.setRepeatMode(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setStartOffset(long r2) {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 | 8
            r1.mFlags = r0
            super.setStartOffset(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setStartTime(long r5) {
            r4 = this;
            super.setStartTime(r5)
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r0 = r4.mAnimations
            int r0 = r0.size()
            java.util.ArrayList<com.autonavi.amap.mapcore.animation.GLAnimation> r1 = r4.mAnimations
            r2 = 0
        Lc:
            if (r2 >= r0) goto L1a
            java.lang.Object r3 = r1.get(r2)
            com.autonavi.amap.mapcore.animation.GLAnimation r3 = (com.autonavi.amap.mapcore.animation.GLAnimation) r3
            r3.setStartTime(r5)
            int r2 = r2 + 1
            goto Lc
        L1a:
            return
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public boolean willChangeBounds() {
            r2 = this;
            int r0 = r2.mFlags
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public boolean willChangeTransformationMatrix() {
            r2 = this;
            int r0 = r2.mFlags
            r1 = 64
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }
}
