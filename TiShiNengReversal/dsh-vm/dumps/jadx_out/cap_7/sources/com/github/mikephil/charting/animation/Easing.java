package com.github.mikephil.charting.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(11)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class Easing {
    private static final float DOUBLE_PI = 6.2831855f;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInBack = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInBounce = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInCirc = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInCubic = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInElastic = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInExpo = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutBack = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutBounce = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutCirc = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutCubic = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutElastic = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutExpo = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutQuad = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutQuart = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutSine = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInQuad = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInQuart = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInSine = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutBack = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutBounce = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutCirc = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutCubic = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutElastic = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutExpo = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutQuad = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutQuart = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutSine = null;
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction Linear = null;





























    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface EasingFunction extends android.animation.TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        float getInterpolation(float r1);
    }

    static {
            com.github.mikephil.charting.animation.Easing$1 r0 = new com.github.mikephil.charting.animation.Easing$1
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.Linear = r0
            com.github.mikephil.charting.animation.Easing$2 r0 = new com.github.mikephil.charting.animation.Easing$2
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInQuad = r0
            com.github.mikephil.charting.animation.Easing$3 r0 = new com.github.mikephil.charting.animation.Easing$3
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseOutQuad = r0
            com.github.mikephil.charting.animation.Easing$4 r0 = new com.github.mikephil.charting.animation.Easing$4
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInOutQuad = r0
            com.github.mikephil.charting.animation.Easing$5 r0 = new com.github.mikephil.charting.animation.Easing$5
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInCubic = r0
            com.github.mikephil.charting.animation.Easing$6 r0 = new com.github.mikephil.charting.animation.Easing$6
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseOutCubic = r0
            com.github.mikephil.charting.animation.Easing$7 r0 = new com.github.mikephil.charting.animation.Easing$7
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInOutCubic = r0
            com.github.mikephil.charting.animation.Easing$8 r0 = new com.github.mikephil.charting.animation.Easing$8
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInQuart = r0
            com.github.mikephil.charting.animation.Easing$9 r0 = new com.github.mikephil.charting.animation.Easing$9
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseOutQuart = r0
            com.github.mikephil.charting.animation.Easing$10 r0 = new com.github.mikephil.charting.animation.Easing$10
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInOutQuart = r0
            com.github.mikephil.charting.animation.Easing$11 r0 = new com.github.mikephil.charting.animation.Easing$11
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInSine = r0
            com.github.mikephil.charting.animation.Easing$12 r0 = new com.github.mikephil.charting.animation.Easing$12
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseOutSine = r0
            com.github.mikephil.charting.animation.Easing$13 r0 = new com.github.mikephil.charting.animation.Easing$13
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInOutSine = r0
            com.github.mikephil.charting.animation.Easing$14 r0 = new com.github.mikephil.charting.animation.Easing$14
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInExpo = r0
            com.github.mikephil.charting.animation.Easing$15 r0 = new com.github.mikephil.charting.animation.Easing$15
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseOutExpo = r0
            com.github.mikephil.charting.animation.Easing$16 r0 = new com.github.mikephil.charting.animation.Easing$16
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInOutExpo = r0
            com.github.mikephil.charting.animation.Easing$17 r0 = new com.github.mikephil.charting.animation.Easing$17
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInCirc = r0
            com.github.mikephil.charting.animation.Easing$18 r0 = new com.github.mikephil.charting.animation.Easing$18
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseOutCirc = r0
            com.github.mikephil.charting.animation.Easing$19 r0 = new com.github.mikephil.charting.animation.Easing$19
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInOutCirc = r0
            com.github.mikephil.charting.animation.Easing$20 r0 = new com.github.mikephil.charting.animation.Easing$20
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInElastic = r0
            com.github.mikephil.charting.animation.Easing$21 r0 = new com.github.mikephil.charting.animation.Easing$21
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseOutElastic = r0
            com.github.mikephil.charting.animation.Easing$22 r0 = new com.github.mikephil.charting.animation.Easing$22
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInOutElastic = r0
            com.github.mikephil.charting.animation.Easing$23 r0 = new com.github.mikephil.charting.animation.Easing$23
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInBack = r0
            com.github.mikephil.charting.animation.Easing$24 r0 = new com.github.mikephil.charting.animation.Easing$24
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseOutBack = r0
            com.github.mikephil.charting.animation.Easing$25 r0 = new com.github.mikephil.charting.animation.Easing$25
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInOutBack = r0
            com.github.mikephil.charting.animation.Easing$26 r0 = new com.github.mikephil.charting.animation.Easing$26
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInBounce = r0
            com.github.mikephil.charting.animation.Easing$27 r0 = new com.github.mikephil.charting.animation.Easing$27
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseOutBounce = r0
            com.github.mikephil.charting.animation.Easing$28 r0 = new com.github.mikephil.charting.animation.Easing$28
            r0.<init>()
            com.github.mikephil.charting.animation.Easing.EaseInOutBounce = r0
            return
    }

    public Easing() {
            r0 = this;
            r0.<init>()
            return
    }
}
