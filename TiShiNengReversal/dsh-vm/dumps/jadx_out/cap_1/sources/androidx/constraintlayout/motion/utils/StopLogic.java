package androidx.constraintlayout.motion.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class StopLogic extends androidx.constraintlayout.motion.widget.MotionInterpolator {
    private boolean mBackwards;
    private float mLastPosition;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private java.lang.String mType;

    public StopLogic() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mBackwards = r0
            return
    }

    private float calcY(float r6) {
            r5 = this;
            float r0 = r5.mStage1Duration
            r1 = 1073741824(0x40000000, float:2.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto L18
            float r2 = r5.mStage1Velocity
            float r3 = r2 * r6
            float r4 = r5.mStage2Velocity
            float r4 = r4 - r2
            float r4 = r4 * r6
            float r4 = r4 * r6
            float r0 = r0 * r1
            float r4 = r4 / r0
            float r3 = r3 + r4
            return r3
        L18:
            int r2 = r5.mNumberOfStages
            r3 = 1
            if (r2 != r3) goto L20
            float r6 = r5.mStage1EndPosition
            return r6
        L20:
            float r6 = r6 - r0
            float r0 = r5.mStage2Duration
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 >= 0) goto L3a
            float r2 = r5.mStage1EndPosition
            float r3 = r5.mStage2Velocity
            float r4 = r3 * r6
            float r2 = r2 + r4
            float r4 = r5.mStage3Velocity
            float r4 = r4 - r3
            float r4 = r4 * r6
            float r4 = r4 * r6
            float r0 = r0 * r1
            float r4 = r4 / r0
            float r2 = r2 + r4
            return r2
        L3a:
            r3 = 2
            if (r2 != r3) goto L40
            float r6 = r5.mStage2EndPosition
            return r6
        L40:
            float r6 = r6 - r0
            float r0 = r5.mStage3Duration
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L57
            float r2 = r5.mStage2EndPosition
            float r3 = r5.mStage3Velocity
            float r4 = r3 * r6
            float r2 = r2 + r4
            float r3 = r3 * r6
            float r3 = r3 * r6
            float r0 = r0 * r1
            float r3 = r3 / r0
            float r2 = r2 - r3
            return r2
        L57:
            float r6 = r5.mStage3EndPosition
            return r6
    }

    private void setup(float r9, float r10, float r11, float r12, float r13) {
            r8 = this;
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 != 0) goto L8
            r9 = 953267991(0x38d1b717, float:1.0E-4)
        L8:
            r8.mStage1Velocity = r9
            float r1 = r9 / r11
            float r2 = r1 * r9
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            r4 = 3
            r5 = 2
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 >= 0) goto L75
            float r13 = -r9
            float r13 = r13 / r11
            float r13 = r13 * r9
            float r13 = r13 / r3
            float r13 = r10 - r13
            float r13 = r13 * r11
            double r1 = (double) r13
            double r1 = java.lang.Math.sqrt(r1)
            float r13 = (float) r1
            int r1 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r1 >= 0) goto L4a
            java.lang.String r12 = "backward accelerate, decelerate"
            r8.mType = r12
            r8.mNumberOfStages = r5
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r13
            r8.mStage3Velocity = r0
            float r12 = r13 - r9
            float r12 = r12 / r11
            r8.mStage1Duration = r12
            float r11 = r13 / r11
            r8.mStage2Duration = r11
            float r9 = r9 + r13
            float r9 = r9 * r12
            float r9 = r9 / r3
            r8.mStage1EndPosition = r9
            r8.mStage2EndPosition = r10
            r8.mStage3EndPosition = r10
            return
        L4a:
            java.lang.String r13 = "backward accelerate cruse decelerate"
            r8.mType = r13
            r8.mNumberOfStages = r4
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r12
            r8.mStage3Velocity = r12
            float r13 = r12 - r9
            float r13 = r13 / r11
            r8.mStage1Duration = r13
            float r11 = r12 / r11
            r8.mStage3Duration = r11
            float r9 = r9 + r12
            float r9 = r9 * r13
            float r9 = r9 / r3
            float r11 = r11 * r12
            float r11 = r11 / r3
            float r13 = r10 - r9
            float r13 = r13 - r11
            float r13 = r13 / r12
            r8.mStage2Duration = r13
            r8.mStage1EndPosition = r9
            float r9 = r10 - r11
            r8.mStage2EndPosition = r9
            r8.mStage3EndPosition = r10
            return
        L75:
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 < 0) goto L8c
            java.lang.String r11 = "hard stop"
            r8.mType = r11
            float r3 = r3 * r10
            float r3 = r3 / r9
            r11 = 1
            r8.mNumberOfStages = r11
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r0
            r8.mStage1EndPosition = r10
            r8.mStage1Duration = r3
            return
        L8c:
            float r2 = r10 - r2
            float r6 = r2 / r9
            float r7 = r6 + r1
            int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r13 >= 0) goto Lab
            java.lang.String r11 = "cruse decelerate"
            r8.mType = r11
            r8.mNumberOfStages = r5
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r9
            r8.mStage3Velocity = r0
            r8.mStage1EndPosition = r2
            r8.mStage2EndPosition = r10
            r8.mStage1Duration = r6
            r8.mStage2Duration = r1
            return
        Lab:
            float r13 = r11 * r10
            float r1 = r9 * r9
            float r1 = r1 / r3
            float r13 = r13 + r1
            double r1 = (double) r13
            double r1 = java.lang.Math.sqrt(r1)
            float r13 = (float) r1
            float r1 = r13 - r9
            float r1 = r1 / r11
            r8.mStage1Duration = r1
            float r2 = r13 / r11
            r8.mStage2Duration = r2
            int r6 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r6 >= 0) goto Ldd
            java.lang.String r11 = "accelerate decelerate"
            r8.mType = r11
            r8.mNumberOfStages = r5
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r13
            r8.mStage3Velocity = r0
            r8.mStage1Duration = r1
            r8.mStage2Duration = r2
            float r9 = r9 + r13
            float r9 = r9 * r1
            float r9 = r9 / r3
            r8.mStage1EndPosition = r9
            r8.mStage2EndPosition = r10
            return
        Ldd:
            java.lang.String r13 = "accelerate cruse decelerate"
            r8.mType = r13
            r8.mNumberOfStages = r4
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r12
            r8.mStage3Velocity = r12
            float r13 = r12 - r9
            float r13 = r13 / r11
            r8.mStage1Duration = r13
            float r11 = r12 / r11
            r8.mStage3Duration = r11
            float r9 = r9 + r12
            float r9 = r9 * r13
            float r9 = r9 / r3
            float r11 = r11 * r12
            float r11 = r11 / r3
            float r13 = r10 - r9
            float r13 = r13 - r11
            float r13 = r13 / r12
            r8.mStage2Duration = r13
            r8.mStage1EndPosition = r9
            float r9 = r10 - r11
            r8.mStage2EndPosition = r9
            r8.mStage3EndPosition = r10
            return
    }

    public void config(float r7, float r8, float r9, float r10, float r11, float r12) {
            r6 = this;
            r6.mStartPosition = r7
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r6.mBackwards = r0
            if (r0 == 0) goto L1a
            r0 = r8
            float r8 = -r9
            float r9 = r7 - r0
            r7 = r12
            r12 = r10
            r10 = r11
            r11 = r7
            r7 = r6
            r7.setup(r8, r9, r10, r11, r12)
            return
        L1a:
            r0 = r12
            r12 = r10
            r10 = r11
            r11 = r0
            r0 = r8
            float r2 = r0 - r7
            r0 = r6
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.setup(r1, r2, r3, r4, r5)
            return
    }

    public void debug(java.lang.String r1, java.lang.String r2, float r3) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float r2) {
            r1 = this;
            float r0 = r1.calcY(r2)
            r1.mLastPosition = r2
            boolean r2 = r1.mBackwards
            if (r2 == 0) goto Le
            float r2 = r1.mStartPosition
            float r2 = r2 - r0
            return r2
        Le:
            float r2 = r1.mStartPosition
            float r2 = r2 + r0
            return r2
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getVelocity() {
            r1 = this;
            boolean r0 = r1.mBackwards
            if (r0 == 0) goto Lc
            float r0 = r1.mLastPosition
            float r0 = r1.getVelocity(r0)
            float r0 = -r0
            return r0
        Lc:
            float r0 = r1.mLastPosition
            float r0 = r1.getVelocity(r0)
            return r0
    }

    public float getVelocity(float r4) {
            r3 = this;
            float r0 = r3.mStage1Duration
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 > 0) goto L10
            float r1 = r3.mStage1Velocity
            float r2 = r3.mStage2Velocity
            float r2 = r2 - r1
            float r2 = r2 * r4
            float r2 = r2 / r0
            float r1 = r1 + r2
            return r1
        L10:
            int r1 = r3.mNumberOfStages
            r2 = 1
            if (r1 != r2) goto L17
            r4 = 0
            return r4
        L17:
            float r4 = r4 - r0
            float r0 = r3.mStage2Duration
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L28
            float r1 = r3.mStage2Velocity
            float r2 = r3.mStage3Velocity
            float r2 = r2 - r1
            float r2 = r2 * r4
            float r2 = r2 / r0
            float r1 = r1 + r2
            return r1
        L28:
            r2 = 2
            if (r1 != r2) goto L2e
            float r4 = r3.mStage2EndPosition
            return r4
        L2e:
            float r4 = r4 - r0
            float r0 = r3.mStage3Duration
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L3c
            float r1 = r3.mStage3Velocity
            float r4 = r4 * r1
            float r4 = r4 / r0
            float r1 = r1 - r4
            return r1
        L3c:
            float r4 = r3.mStage3EndPosition
            return r4
    }
}
