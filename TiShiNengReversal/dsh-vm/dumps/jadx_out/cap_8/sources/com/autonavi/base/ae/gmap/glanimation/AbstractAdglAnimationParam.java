package com.autonavi.base.ae.gmap.glanimation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class AbstractAdglAnimationParam {
    protected float factor;
    protected boolean hasCheckedParam;
    protected boolean hasFromValue;
    protected boolean hasToValue;
    protected int interpolationType;
    protected float mult;
    protected boolean needToCaculate;
    protected float normalizedTime;

    public AbstractAdglAnimationParam() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.interpolationType = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.factor = r1
            r2.hasCheckedParam = r0
            r2.needToCaculate = r0
            r2.hasFromValue = r0
            r2.hasToValue = r0
            return
    }

    static float bounce(float r1) {
            float r1 = r1 * r1
            r0 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 * r0
            return r1
    }

    public abstract void checkParam();

    public float getCurMult() {
            r1 = this;
            float r0 = r1.mult
            return r0
    }

    public int getInterpolatorType() {
            r1 = this;
            int r0 = r1.interpolationType
            return r0
    }

    public boolean needToCaculate() {
            r1 = this;
            boolean r0 = r1.hasCheckedParam
            if (r0 != 0) goto L7
            r1.checkParam()
        L7:
            boolean r0 = r1.hasCheckedParam
            if (r0 == 0) goto L11
            boolean r0 = r1.needToCaculate
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.interpolationType = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.factor = r1
            r2.hasCheckedParam = r0
            r2.needToCaculate = r0
            r2.hasFromValue = r0
            r2.hasToValue = r0
            return
    }

    public void setInterpolatorType(int r1, float r2) {
            r0 = this;
            r0.interpolationType = r1
            r0.factor = r2
            return
    }

    public void setNormalizedTime(float r6) {
            r5 = this;
            r5.normalizedTime = r6
            int r0 = r5.interpolationType
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            switch(r0) {
                case 0: goto Lcf;
                case 1: goto Lc4;
                case 2: goto La9;
                case 3: goto L94;
                case 4: goto L4f;
                case 5: goto L41;
                case 6: goto Lf;
                default: goto Lc;
            }
        Lc:
            r6 = 0
            goto Lcf
        Lf:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L14
            goto Lc
        L14:
            r0 = 1048576000(0x3e800000, float:0.25)
            r4 = 1082130432(0x40800000, float:4.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L20
            float r6 = r6 * r4
            goto Lcf
        L20:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2c
            float r6 = r6 * r4
            float r6 = r1 - r6
            goto Lcf
        L2c:
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L37
            float r6 = r6 * r4
            float r6 = r6 - r1
            goto Lcf
        L37:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto Lc
            float r6 = r6 * r4
            float r6 = r4 - r6
            goto Lcf
        L41:
            float r6 = r6 - r2
            float r0 = r6 * r6
            r3 = 1077936128(0x40400000, float:3.0)
            float r6 = r6 * r3
            float r6 = r6 + r1
            float r0 = r0 * r6
            float r6 = r0 + r2
            goto Lcf
        L4f:
            r0 = 1066381659(0x3f8fb15b, float:1.1226)
            float r6 = r6 * r0
            r0 = 1052048884(0x3eb4fdf4, float:0.3535)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L61
            float r6 = bounce(r6)
            goto Lcf
        L61:
            r0 = 1061004562(0x3f3da512, float:0.7408)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L75
            r0 = 1057756325(0x3f0c14a5, float:0.54719)
            float r6 = r6 - r0
            float r6 = bounce(r6)
            r0 = 1060320051(0x3f333333, float:0.7)
        L73:
            float r6 = r6 + r0
            goto Lcf
        L75:
            r0 = 1064755947(0x3f76e2eb, float:0.9644)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L88
            r0 = 1062880254(0x3f5a43fe, float:0.8526)
            float r6 = r6 - r0
            float r6 = bounce(r6)
            r0 = 1063675494(0x3f666666, float:0.9)
            goto L73
        L88:
            r0 = 1065718120(0x3f859168, float:1.0435)
            float r6 = r6 - r0
            float r6 = bounce(r6)
            r0 = 1064514355(0x3f733333, float:0.95)
            goto L73
        L94:
            float r6 = r6 + r2
            double r0 = (double) r6
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r0 = r0 * r2
            double r0 = java.lang.Math.cos(r0)
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r2
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 + r2
        La7:
            float r6 = (float) r0
            goto Lcf
        La9:
            float r0 = r5.factor
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto Lb6
            float r6 = r2 - r6
            float r6 = r6 * r6
            float r6 = r2 - r6
            goto Lcf
        Lb6:
            float r2 = r2 - r6
            double r2 = (double) r2
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r2, r0)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r0
            float r6 = (float) r2
            goto Lcf
        Lc4:
            double r2 = (double) r6
            float r6 = r5.factor
            float r6 = r6 * r1
            double r0 = (double) r6
            double r0 = java.lang.Math.pow(r2, r0)
            goto La7
        Lcf:
            r5.mult = r6
            return
    }
}
