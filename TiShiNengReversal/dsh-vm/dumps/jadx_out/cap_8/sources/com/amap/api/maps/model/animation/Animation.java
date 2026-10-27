package com.amap.api.maps.model.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class Animation {
    public static final int FILL_MODE_BACKWARDS = 1;
    public static final int FILL_MODE_FORWARDS = 0;
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    protected java.lang.String animationType;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private long duration;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int fillMode;
    public com.autonavi.amap.mapcore.animation.GLAnimation glAnimation;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private android.view.animation.Interpolator interpolator;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean mFillAfter;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean mFillBefore;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean mFillEnabled;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.animation.Animation.AnimationListener mListener;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int mRepeatCount;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int mRepeatMode;
    private com.amap.api.maps.model.animation.Animation.AnimationUpdateFlags updateFlags;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public interface AnimationListener {
        @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
        void onAnimationEnd();

        @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
        void onAnimationStart();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    protected static class AnimationUpdateFlags extends com.amap.api.maps.model.BaseOptions.BaseUpdateFlags {
        protected boolean durationUpdate;
        protected boolean fillModeUpdate;
        protected boolean interpolatorUpdate;
        protected boolean mFillAfterUpdate;
        protected boolean mFillBeforeUpdate;
        protected boolean mFillEnabledUpdate;
        protected boolean mListenerUpdate;
        protected boolean mRepeatCountUpdate;
        protected boolean mRepeatModeUpdate;

        protected AnimationUpdateFlags() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mListenerUpdate = r0
                r1.durationUpdate = r0
                r1.interpolatorUpdate = r0
                r1.fillModeUpdate = r0
                r1.mFillEnabledUpdate = r0
                r1.mFillAfterUpdate = r0
                r1.mFillBeforeUpdate = r0
                r1.mRepeatCountUpdate = r0
                r1.mRepeatModeUpdate = r0
                return
        }

        @Override // com.amap.api.maps.model.BaseOptions.BaseUpdateFlags
        public void reset() {
                r1 = this;
                super.reset()
                r0 = 0
                r1.mListenerUpdate = r0
                r1.durationUpdate = r0
                r1.interpolatorUpdate = r0
                r1.fillModeUpdate = r0
                r1.mFillEnabledUpdate = r0
                r1.mFillAfterUpdate = r0
                r1.mFillBeforeUpdate = r0
                r1.mRepeatCountUpdate = r0
                r1.mRepeatModeUpdate = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements com.amap.api.maps.model.animation.Animation.AnimationListener {
        final /* synthetic */ com.amap.api.maps.model.animation.Animation a;

        /* renamed from: b, reason: collision with root package name */
        private final com.amap.api.col.p0003l.c8 f5009b;

        /* renamed from: c, reason: collision with root package name */
        private final com.amap.api.col.p0003l.c8 f5010c;



        private a(com.amap.api.maps.model.animation.Animation r2, com.amap.api.maps.model.animation.Animation.AnimationListener r3) {
                r1 = this;
                r1.a = r2
                r1.<init>()
                com.amap.api.maps.model.animation.Animation$a$1 r0 = new com.amap.api.maps.model.animation.Animation$a$1
                r0.<init>(r1, r2, r3)
                r1.f5009b = r0
                com.amap.api.maps.model.animation.Animation$a$2 r0 = new com.amap.api.maps.model.animation.Animation$a$2
                r0.<init>(r1, r2, r3)
                r1.f5010c = r0
                return
        }

        /* synthetic */ a(com.amap.api.maps.model.animation.Animation r1, com.amap.api.maps.model.animation.Animation.AnimationListener r2, byte r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public final void onAnimationEnd() {
                r2 = this;
                com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.a()
                com.amap.api.col.3l.c8 r1 = r2.f5010c
                r0.b(r1)
                return
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public final void onAnimationStart() {
                r2 = this;
                com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.a()
                com.amap.api.col.3l.c8 r1 = r2.f5009b
                r0.b(r1)
                return
        }
    }

    public Animation() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.fillMode = r0
            r1 = 500(0x1f4, double:2.47E-321)
            r3.duration = r1
            r1 = 0
            r3.interpolator = r1
            java.lang.String r2 = "typeAnimtionBase"
            r3.animationType = r2
            r2 = 1
            r3.mFillBefore = r2
            r3.mFillAfter = r0
            r3.mFillEnabled = r0
            r3.mRepeatCount = r0
            r3.mRepeatMode = r2
            r3.glAnimation = r1
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r0 = new com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags
            r0.<init>()
            r3.updateFlags = r0
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = new com.autonavi.amap.mapcore.animation.GLAnimation
            r0.<init>()
            r3.glAnimation = r0
            java.lang.String r0 = r3.getAnimationType()
            r3.animationType = r0
            return
    }

    private void a(boolean r2) {
            r1 = this;
            r1.mFillEnabled = r2
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.glAnimation
            if (r0 == 0) goto L9
            r0.setFillEnabled(r2)
        L9:
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r2 = r1.updateFlags
            r0 = 1
            r2.mFillEnabledUpdate = r0
            return
    }

    private void b(boolean r2) {
            r1 = this;
            r1.mFillAfter = r2
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.glAnimation
            if (r0 == 0) goto L9
            r0.setFillAfter(r2)
        L9:
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r2 = r1.updateFlags
            r0 = 1
            r2.mFillAfterUpdate = r0
            return
    }

    private void c(boolean r2) {
            r1 = this;
            r1.mFillBefore = r2
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.glAnimation
            if (r0 == 0) goto L9
            r0.setFillBefore(r2)
        L9:
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r2 = r1.updateFlags
            r0 = 1
            r2.mFillBeforeUpdate = r0
            return
    }

    protected abstract java.lang.String getAnimationType();

    public int getFillMode() {
            r1 = this;
            int r0 = r1.fillMode
            return r0
    }

    public int getRepeatCount() {
            r1 = this;
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.glAnimation
            if (r0 == 0) goto L9
            int r0 = r0.getRepeatCount()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getRepeatMode() {
            r1 = this;
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.glAnimation
            if (r0 == 0) goto L9
            int r0 = r0.getRepeatMode()
            return r0
        L9:
            r0 = 1
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public com.amap.api.maps.model.animation.Animation.AnimationUpdateFlags getUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r0 = r1.updateFlags
            return r0
    }

    public void resetUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r0 = r1.updateFlags
            r0.reset()
            return
    }

    public void setAnimationListener(com.amap.api.maps.model.animation.Animation.AnimationListener r3) {
            r2 = this;
            com.amap.api.maps.model.animation.Animation$a r0 = new com.amap.api.maps.model.animation.Animation$a
            r1 = 0
            r0.<init>(r2, r3, r1)
            r2.mListener = r0
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r2.glAnimation
            r0.setAnimationListener(r3)
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r3 = r2.updateFlags
            r0 = 1
            r3.mListenerUpdate = r0
            return
    }

    public void setDuration(long r2) {
            r1 = this;
            r1.duration = r2
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.glAnimation
            if (r0 == 0) goto L9
            r0.setDuration(r2)
        L9:
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r2 = r1.updateFlags
            r3 = 1
            r2.durationUpdate = r3
            return
    }

    public void setFillMode(int r3) {
            r2 = this;
            r2.fillMode = r3
            r0 = 0
            r1 = 1
            if (r3 != 0) goto L10
            r2.b(r1)
            r2.c(r0)
            r2.a(r0)
            goto L19
        L10:
            r2.b(r0)
            r2.a(r1)
            r2.c(r1)
        L19:
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r3 = r2.updateFlags
            r3.fillModeUpdate = r1
            return
    }

    public void setInterpolator(android.view.animation.Interpolator r2) {
            r1 = this;
            r1.interpolator = r2
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.glAnimation
            if (r0 == 0) goto L9
            r0.setInterpolator(r2)
        L9:
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r2 = r1.updateFlags
            r0 = 1
            r2.interpolatorUpdate = r0
            return
    }

    public void setRepeatCount(int r2) {
            r1 = this;
            r1.mRepeatCount = r2
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.glAnimation
            if (r0 == 0) goto L9
            r0.setRepeatCount(r2)
        L9:
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r2 = r1.updateFlags
            r0 = 1
            r2.mRepeatCountUpdate = r0
            return
    }

    public void setRepeatMode(int r2) {
            r1 = this;
            r1.mRepeatMode = r2
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.glAnimation
            if (r0 == 0) goto L9
            r0.setRepeatMode(r2)
        L9:
            com.amap.api.maps.model.animation.Animation$AnimationUpdateFlags r2 = r1.updateFlags
            r0 = 1
            r2.mRepeatModeUpdate = r0
            return
    }
}
