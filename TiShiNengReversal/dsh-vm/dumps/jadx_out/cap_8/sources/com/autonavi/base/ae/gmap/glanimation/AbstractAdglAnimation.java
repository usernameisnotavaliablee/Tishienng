package com.autonavi.base.ae.gmap.glanimation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class AbstractAdglAnimation {
    public static final int DEFAULT_DURATION = 250;
    public static final int INTERPOLATOR_ACCELERATE = 1;
    public static final int INTERPOLATOR_ACCELERATE_DECELERATE = 3;
    public static final int INTERPOLATOR_BOUNCE = 4;
    public static final int INTERPOLATOR_DECELERATE = 2;
    public static final int INTERPOLATOR_DOUBLE_RAISE = 6;
    public static final int INTERPOLATOR_LINEAR = 0;
    public static final int INTERPOLATOR_OVERSHOOT = 5;
    public static final int INVALIDE_VALUE = -9999;
    protected int duration;
    protected boolean isOver;
    protected long offsetTime;
    protected long startTime;

    public AbstractAdglAnimation() {
            r2 = this;
            r2.<init>()
            r0 = 300(0x12c, float:4.2E-43)
            r2.duration = r0
            r0 = 0
            r2.isOver = r0
            r0 = -1
            r2.startTime = r0
            r0 = 0
            r2.offsetTime = r0
            return
    }

    public abstract void doAnimation(java.lang.Object r1);

    public boolean isOver() {
            r1 = this;
            boolean r0 = r1.isOver
            return r0
    }

    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
