package androidx.core.content.res;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    CamColor(float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9) {
            r0 = this;
            r0.<init>()
            r0.mHue = r1
            r0.mChroma = r2
            r0.mJ = r3
            r0.mQ = r4
            r0.mM = r5
            r0.mS = r6
            r0.mJstar = r7
            r0.mAstar = r8
            r0.mBstar = r9
            return
    }

    @androidx.annotation.Nullable
    private static androidx.core.content.res.CamColor findCamByJ(@androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r12, @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r13, @androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r14) {
            r0 = 0
            r1 = 1120403456(0x42c80000, float:100.0)
            r2 = 1148846080(0x447a0000, float:1000.0)
            r3 = 0
            r4 = r3
            r3 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
        La:
            float r6 = r5 - r1
            float r6 = java.lang.Math.abs(r6)
            r7 = 1008981770(0x3c23d70a, float:0.01)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L64
            float r6 = r1 - r5
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            float r6 = r6 + r5
            androidx.core.content.res.CamColor r7 = fromJch(r6, r13, r12)
            int r7 = r7.viewedInSrgb()
            float r8 = androidx.core.content.res.CamUtils.lStarFromInt(r7)
            float r9 = r14 - r8
            float r9 = java.lang.Math.abs(r9)
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 >= 0) goto L53
            androidx.core.content.res.CamColor r7 = fromColor(r7)
            float r10 = r7.getJ()
            float r11 = r7.getChroma()
            androidx.core.content.res.CamColor r10 = fromJch(r10, r11, r12)
            float r10 = r7.distance(r10)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 > 0) goto L53
            r4 = r7
            r2 = r9
            r3 = r10
        L53:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L5c
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 != 0) goto L5c
            return r4
        L5c:
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 >= 0) goto L62
            r5 = r6
            goto La
        L62:
            r1 = r6
            goto La
        L64:
            return r4
    }

    @androidx.annotation.NonNull
    static androidx.core.content.res.CamColor fromColor(@androidx.annotation.ColorInt int r14) {
            r0 = 7
            float[] r0 = new float[r0]
            r1 = 3
            float[] r2 = new float[r1]
            androidx.core.content.res.ViewingConditions r3 = androidx.core.content.res.ViewingConditions.DEFAULT
            fromColorInViewingConditions(r14, r3, r0, r2)
            androidx.core.content.res.CamColor r4 = new androidx.core.content.res.CamColor
            r14 = 0
            r5 = r2[r14]
            r3 = 1
            r6 = r2[r3]
            r7 = r0[r14]
            r8 = r0[r3]
            r14 = 2
            r9 = r0[r14]
            r10 = r0[r1]
            r14 = 4
            r11 = r0[r14]
            r14 = 5
            r12 = r0[r14]
            r14 = 6
            r13 = r0[r14]
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r4
    }

    static void fromColorInViewingConditions(@androidx.annotation.ColorInt int r21, @androidx.annotation.NonNull androidx.core.content.res.ViewingConditions r22, @androidx.annotation.Nullable @androidx.annotation.Size(7) float[] r23, @androidx.annotation.NonNull @androidx.annotation.Size(3) float[] r24) {
            r0 = r21
            r1 = r24
            androidx.core.content.res.CamUtils.xyzFromInt(r0, r1)
            float[][] r0 = androidx.core.content.res.CamUtils.XYZ_TO_CAM16RGB
            r2 = 0
            r3 = r1[r2]
            r4 = r0[r2]
            r5 = r4[r2]
            float r5 = r5 * r3
            r6 = 1
            r7 = r1[r6]
            r8 = r4[r6]
            float r8 = r8 * r7
            float r5 = r5 + r8
            r8 = 2
            r9 = r1[r8]
            r4 = r4[r8]
            float r4 = r4 * r9
            float r5 = r5 + r4
            r4 = r0[r6]
            r10 = r4[r2]
            float r10 = r10 * r3
            r11 = r4[r6]
            float r11 = r11 * r7
            float r10 = r10 + r11
            r4 = r4[r8]
            float r4 = r4 * r9
            float r10 = r10 + r4
            r0 = r0[r8]
            r4 = r0[r2]
            float r3 = r3 * r4
            r4 = r0[r6]
            float r7 = r7 * r4
            float r3 = r3 + r7
            r0 = r0[r8]
            float r9 = r9 * r0
            float r3 = r3 + r9
            float[] r0 = r22.getRgbD()
            r0 = r0[r2]
            float r0 = r0 * r5
            float[] r4 = r22.getRgbD()
            r4 = r4[r6]
            float r4 = r4 * r10
            float[] r5 = r22.getRgbD()
            r5 = r5[r8]
            float r5 = r5 * r3
            float r3 = r22.getFl()
            float r7 = java.lang.Math.abs(r0)
            float r3 = r3 * r7
            double r9 = (double) r3
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 / r11
            r13 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r9 = java.lang.Math.pow(r9, r13)
            float r3 = (float) r9
            float r7 = r22.getFl()
            float r9 = java.lang.Math.abs(r4)
            float r7 = r7 * r9
            double r9 = (double) r7
            double r9 = r9 / r11
            double r9 = java.lang.Math.pow(r9, r13)
            float r7 = (float) r9
            float r9 = r22.getFl()
            float r10 = java.lang.Math.abs(r5)
            float r9 = r9 * r10
            double r9 = (double) r9
            double r9 = r9 / r11
            double r9 = java.lang.Math.pow(r9, r13)
            float r9 = (float) r9
            float r0 = java.lang.Math.signum(r0)
            r10 = 1137180672(0x43c80000, float:400.0)
            float r0 = r0 * r10
            float r0 = r0 * r3
            r13 = 1104742973(0x41d90a3d, float:27.13)
            float r3 = r3 + r13
            float r0 = r0 / r3
            float r3 = java.lang.Math.signum(r4)
            float r3 = r3 * r10
            float r3 = r3 * r7
            float r7 = r7 + r13
            float r3 = r3 / r7
            float r4 = java.lang.Math.signum(r5)
            float r4 = r4 * r10
            float r4 = r4 * r9
            float r9 = r9 + r13
            float r4 = r4 / r9
            r9 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r13 = (double) r0
            double r13 = r13 * r9
            r9 = -4600427019358961664(0xc028000000000000, double:-12.0)
            r21 = 1
            double r6 = (double) r3
            double r6 = r6 * r9
            double r13 = r13 + r6
            double r5 = (double) r4
            double r13 = r13 + r5
            float r7 = (float) r13
            r9 = 1093664768(0x41300000, float:11.0)
            float r7 = r7 / r9
            float r9 = r0 + r3
            double r9 = (double) r9
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r13
            double r9 = r9 - r5
            float r5 = (float) r9
            r6 = 1091567616(0x41100000, float:9.0)
            float r5 = r5 / r6
            r6 = 1101004800(0x41a00000, float:20.0)
            float r9 = r0 * r6
            float r3 = r3 * r6
            float r9 = r9 + r3
            r10 = 1101529088(0x41a80000, float:21.0)
            float r10 = r10 * r4
            float r9 = r9 + r10
            float r9 = r9 / r6
            r10 = 1109393408(0x42200000, float:40.0)
            float r0 = r0 * r10
            float r0 = r0 + r3
            float r0 = r0 + r4
            float r0 = r0 / r6
            double r3 = (double) r5
            r10 = r9
            r6 = 2
            double r8 = (double) r7
            double r3 = java.lang.Math.atan2(r3, r8)
            float r3 = (float) r3
            r4 = 1127481344(0x43340000, float:180.0)
            float r3 = r3 * r4
            r8 = 1078530011(0x40490fdb, float:3.1415927)
            float r3 = r3 / r8
            r9 = 0
            r15 = 1135869952(0x43b40000, float:360.0)
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 >= 0) goto L104
            float r3 = r3 + r15
            goto L109
        L104:
            int r9 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r9 < 0) goto L109
            float r3 = r3 - r15
        L109:
            float r8 = r8 * r3
            float r8 = r8 / r4
            float r4 = r22.getNbb()
            float r0 = r0 * r4
            float r4 = r22.getAw()
            float r0 = r0 / r4
            r4 = r7
            r9 = 2
            double r6 = (double) r0
            float r0 = r22.getC()
            float r16 = r22.getZ()
            float r0 = r0 * r16
            r16 = r10
            r17 = 2
            double r9 = (double) r0
            double r6 = java.lang.Math.pow(r6, r9)
            float r0 = (float) r6
            r6 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r6
            float r7 = r22.getC()
            r9 = 1082130432(0x40800000, float:4.0)
            float r7 = r9 / r7
            float r6 = r0 / r6
            r18 = 1082130432(0x40800000, float:4.0)
            double r9 = (double) r6
            double r9 = java.lang.Math.sqrt(r9)
            float r6 = (float) r9
            float r7 = r7 * r6
            float r6 = r22.getAw()
            float r6 = r6 + r18
            float r7 = r7 * r6
            float r6 = r22.getFlRoot()
            float r7 = r7 * r6
            double r9 = (double) r3
            r19 = 4626362123713081508(0x403423d70a3d70a4, double:20.14)
            int r6 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r6 >= 0) goto L160
            float r15 = r15 + r3
            goto L161
        L160:
            r15 = r3
        L161:
            double r9 = (double) r15
            r19 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r9 = r9 * r19
            r19 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r9 = r9 / r19
            double r9 = r9 + r13
            double r9 = java.lang.Math.cos(r9)
            r13 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r9 = r9 + r13
            float r6 = (float) r9
            r9 = 1048576000(0x3e800000, float:0.25)
            float r6 = r6 * r9
            r9 = 1164993142(0x45706276, float:3846.1538)
            float r6 = r6 * r9
            float r9 = r22.getNc()
            float r6 = r6 * r9
            float r9 = r22.getNcb()
            float r6 = r6 * r9
            float r4 = r4 * r4
            float r5 = r5 * r5
            float r4 = r4 + r5
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r6 = r6 * r4
            r4 = 1050421494(0x3e9c28f6, float:0.305)
            float r9 = r16 + r4
            float r6 = r6 / r9
            float r4 = r22.getN()
            double r4 = (double) r4
            r9 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r4 = java.lang.Math.pow(r9, r4)
            r9 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            double r9 = r9 - r4
            r4 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r4 = java.lang.Math.pow(r9, r4)
            float r4 = (float) r4
            double r5 = (double) r6
            r9 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r5 = java.lang.Math.pow(r5, r9)
            float r5 = (float) r5
            float r4 = r4 * r5
            double r5 = (double) r0
            double r5 = r5 / r11
            double r5 = java.lang.Math.sqrt(r5)
            float r5 = (float) r5
            float r5 = r5 * r4
            float r6 = r22.getFlRoot()
            float r6 = r6 * r5
            float r9 = r22.getC()
            float r4 = r4 * r9
            float r9 = r22.getAw()
            float r9 = r9 + r18
            float r4 = r4 / r9
            double r9 = (double) r4
            double r9 = java.lang.Math.sqrt(r9)
            float r4 = (float) r9
            r9 = 1112014848(0x42480000, float:50.0)
            float r4 = r4 * r9
            r9 = 1071225242(0x3fd9999a, float:1.7)
            float r9 = r9 * r0
            r10 = 1004888130(0x3be56042, float:0.007)
            float r10 = r10 * r0
            r11 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 + r11
            float r9 = r9 / r10
            r10 = 1018873617(0x3cbac711, float:0.0228)
            float r10 = r10 * r6
            float r10 = r10 + r11
            double r10 = (double) r10
            double r10 = java.lang.Math.log(r10)
            float r10 = (float) r10
            r11 = 1110405192(0x422f7048, float:43.85965)
            float r10 = r10 * r11
            double r11 = (double) r8
            double r13 = java.lang.Math.cos(r11)
            float r8 = (float) r13
            float r8 = r8 * r10
            double r11 = java.lang.Math.sin(r11)
            float r11 = (float) r11
            float r10 = r10 * r11
            r1[r2] = r3
            r1[r21] = r5
            if (r23 == 0) goto L23b
            r23[r2] = r0
            r23[r21] = r7
            r23[r17] = r6
            r0 = 3
            r23[r0] = r4
            r0 = 4
            r23[r0] = r9
            r0 = 5
            r23[r0] = r8
            r0 = 6
            r23[r0] = r10
        L23b:
            return
    }

    @androidx.annotation.NonNull
    private static androidx.core.content.res.CamColor fromJch(@androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r1, @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r2, @androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r3) {
            androidx.core.content.res.ViewingConditions r0 = androidx.core.content.res.ViewingConditions.DEFAULT
            androidx.core.content.res.CamColor r1 = fromJchInFrame(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    private static androidx.core.content.res.CamColor fromJchInFrame(@androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r12, @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r13, @androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r14, androidx.core.content.res.ViewingConditions r15) {
            float r0 = r15.getC()
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r1 / r0
            double r4 = (double) r12
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r6
            double r6 = java.lang.Math.sqrt(r4)
            float r2 = (float) r6
            float r0 = r0 * r2
            float r2 = r15.getAw()
            float r2 = r2 + r1
            float r0 = r0 * r2
            float r2 = r15.getFlRoot()
            float r0 = r0 * r2
            float r2 = r15.getFlRoot()
            float r2 = r2 * r13
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r4 = r13 / r4
            float r5 = r15.getC()
            float r4 = r4 * r5
            float r5 = r15.getAw()
            float r5 = r5 + r1
            float r4 = r4 / r5
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r1 = (float) r4
            r4 = 1112014848(0x42480000, float:50.0)
            float r6 = r1 * r4
            r1 = 1078530011(0x40490fdb, float:3.1415927)
            float r1 = r1 * r14
            r4 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 / r4
            r4 = 1071225242(0x3fd9999a, float:1.7)
            float r4 = r4 * r12
            r5 = 1004888130(0x3be56042, float:0.007)
            float r5 = r5 * r12
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r7
            float r7 = r4 / r5
            r4 = 4582228873984682964(0x3f9758e219652bd4, double:0.0228)
            double r8 = (double) r2
            double r8 = r8 * r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r8 + r4
            double r4 = java.lang.Math.log(r8)
            float r4 = (float) r4
            r5 = 1110405192(0x422f7048, float:43.85965)
            float r4 = r4 * r5
            double r8 = (double) r1
            double r10 = java.lang.Math.cos(r8)
            float r1 = (float) r10
            float r1 = r1 * r4
            double r8 = java.lang.Math.sin(r8)
            float r5 = (float) r8
            float r9 = r4 * r5
            r4 = r0
            androidx.core.content.res.CamColor r0 = new androidx.core.content.res.CamColor
            r3 = r12
            r8 = r1
            r5 = r2
            r2 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public static void getM3HCTfromColor(@androidx.annotation.ColorInt int r2, @androidx.annotation.NonNull @androidx.annotation.Size(3) float[] r3) {
            androidx.core.content.res.ViewingConditions r0 = androidx.core.content.res.ViewingConditions.DEFAULT
            r1 = 0
            fromColorInViewingConditions(r2, r0, r1, r3)
            r0 = 2
            float r2 = androidx.core.content.res.CamUtils.lStarFromInt(r2)
            r3[r0] = r2
            return
    }

    public static int toColor(@androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r1, @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r2, @androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r3) {
            androidx.core.content.res.ViewingConditions r0 = androidx.core.content.res.ViewingConditions.DEFAULT
            int r1 = toColor(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.ColorInt
    static int toColor(@androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r6, @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r7, @androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r8, @androidx.annotation.NonNull androidx.core.content.res.ViewingConditions r9) {
            double r0 = (double) r7
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L6a
            int r0 = java.lang.Math.round(r8)
            double r0 = (double) r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L6a
            int r0 = java.lang.Math.round(r8)
            double r0 = (double) r0
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L1e
            goto L6a
        L1e:
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto L25
            r6 = 0
            goto L2b
        L25:
            r1 = 1135869952(0x43b40000, float:360.0)
            float r6 = java.lang.Math.min(r1, r6)
        L2b:
            r1 = 1
            r2 = 0
            r0 = r7
            r3 = r2
            r1 = 0
            r2 = 1
        L31:
            float r4 = r1 - r7
            float r4 = java.lang.Math.abs(r4)
            r5 = 1053609165(0x3ecccccd, float:0.4)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L5e
            androidx.core.content.res.CamColor r4 = findCamByJ(r6, r0, r8)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L53
            if (r4 == 0) goto L4d
            int r6 = r4.viewed(r9)
            return r6
        L4d:
            float r0 = r7 - r1
            float r0 = r0 / r5
            float r0 = r0 + r1
            r2 = 0
            goto L31
        L53:
            if (r4 != 0) goto L57
            r7 = r0
            goto L59
        L57:
            r1 = r0
            r3 = r4
        L59:
            float r0 = r7 - r1
            float r0 = r0 / r5
            float r0 = r0 + r1
            goto L31
        L5e:
            if (r3 != 0) goto L65
            int r6 = androidx.core.content.res.CamUtils.intFromLStar(r8)
            return r6
        L65:
            int r6 = r3.viewed(r9)
            return r6
        L6a:
            int r6 = androidx.core.content.res.CamUtils.intFromLStar(r8)
            return r6
    }

    float distance(@androidx.annotation.NonNull androidx.core.content.res.CamColor r5) {
            r4 = this;
            float r0 = r4.getJStar()
            float r1 = r5.getJStar()
            float r0 = r0 - r1
            float r1 = r4.getAStar()
            float r2 = r5.getAStar()
            float r1 = r1 - r2
            float r2 = r4.getBStar()
            float r5 = r5.getBStar()
            float r2 = r2 - r5
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r2 = r2 * r2
            float r0 = r0 + r2
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            r2 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r0, r2)
            r2 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r2
            float r5 = (float) r0
            return r5
    }

    @androidx.annotation.FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getAStar() {
            r1 = this;
            float r0 = r1.mAstar
            return r0
    }

    @androidx.annotation.FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getBStar() {
            r1 = this;
            float r0 = r1.mBstar
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getChroma() {
            r1 = this;
            float r0 = r1.mChroma
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 360.0d, toInclusive = false)
    float getHue() {
            r1 = this;
            float r0 = r1.mHue
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 100.0d)
    float getJ() {
            r1 = this;
            float r0 = r1.mJ
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 100.0d)
    float getJStar() {
            r1 = this;
            float r0 = r1.mJstar
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getM() {
            r1 = this;
            float r0 = r1.mM
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getQ() {
            r1 = this;
            float r0 = r1.mQ
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getS() {
            r1 = this;
            float r0 = r1.mS
            return r0
    }

    @androidx.annotation.ColorInt
    int viewed(@androidx.annotation.NonNull androidx.core.content.res.ViewingConditions r18) {
            r17 = this;
            float r0 = r17.getChroma()
            double r0 = (double) r0
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L28
            float r0 = r17.getJ()
            double r0 = (double) r0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L17
            goto L28
        L17:
            float r0 = r17.getChroma()
            float r1 = r17.getJ()
            double r6 = (double) r1
            double r6 = r6 / r2
            double r6 = java.lang.Math.sqrt(r6)
            float r1 = (float) r6
            float r0 = r0 / r1
            goto L29
        L28:
            r0 = 0
        L29:
            double r0 = (double) r0
            float r6 = r18.getN()
            double r6 = (double) r6
            r8 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r6 = java.lang.Math.pow(r8, r6)
            r8 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            double r8 = r8 - r6
            r6 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r6 = java.lang.Math.pow(r8, r6)
            double r0 = r0 / r6
            r6 = 4607682818758614130(0x3ff1c71c71c71c72, double:1.1111111111111112)
            double r0 = java.lang.Math.pow(r0, r6)
            float r0 = (float) r0
            float r1 = r17.getHue()
            r6 = 1078530011(0x40490fdb, float:3.1415927)
            float r1 = r1 * r6
            r6 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 / r6
            double r6 = (double) r1
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r8 + r6
            double r8 = java.lang.Math.cos(r8)
            r10 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r8 = r8 + r10
            float r1 = (float) r8
            r8 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r8
            float r8 = r18.getAw()
            float r9 = r17.getJ()
            double r9 = (double) r9
            double r9 = r9 / r2
            float r2 = r18.getC()
            double r2 = (double) r2
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r11 / r2
            float r2 = r18.getZ()
            double r2 = (double) r2
            double r11 = r11 / r2
            double r2 = java.lang.Math.pow(r9, r11)
            float r2 = (float) r2
            float r8 = r8 * r2
            r2 = 1164993142(0x45706276, float:3846.1538)
            float r1 = r1 * r2
            float r2 = r18.getNc()
            float r1 = r1 * r2
            float r2 = r18.getNcb()
            float r1 = r1 * r2
            float r2 = r18.getNbb()
            float r8 = r8 / r2
            double r2 = java.lang.Math.sin(r6)
            float r2 = (float) r2
            double r6 = java.lang.Math.cos(r6)
            float r3 = (float) r6
            r6 = 1050421494(0x3e9c28f6, float:0.305)
            float r6 = r6 + r8
            r7 = 1102577664(0x41b80000, float:23.0)
            float r6 = r6 * r7
            float r6 = r6 * r0
            float r1 = r1 * r7
            r7 = 1093664768(0x41300000, float:11.0)
            float r7 = r7 * r0
            float r7 = r7 * r3
            float r1 = r1 + r7
            r7 = 1121452032(0x42d80000, float:108.0)
            float r0 = r0 * r7
            float r0 = r0 * r2
            float r1 = r1 + r0
            float r6 = r6 / r1
            float r3 = r3 * r6
            float r6 = r6 * r2
            r0 = 1139146752(0x43e60000, float:460.0)
            float r8 = r8 * r0
            r0 = 1138851840(0x43e18000, float:451.0)
            float r0 = r0 * r3
            float r0 = r0 + r8
            r1 = 1133510656(0x43900000, float:288.0)
            float r1 = r1 * r6
            float r0 = r0 + r1
            r1 = 1152344064(0x44af6000, float:1403.0)
            float r0 = r0 / r1
            r2 = 1147060224(0x445ec000, float:891.0)
            float r2 = r2 * r3
            float r2 = r8 - r2
            r7 = 1132625920(0x43828000, float:261.0)
            float r7 = r7 * r6
            float r2 = r2 - r7
            float r2 = r2 / r1
            r7 = 1130102784(0x435c0000, float:220.0)
            float r3 = r3 * r7
            float r8 = r8 - r3
            r3 = 1170530304(0x45c4e000, float:6300.0)
            float r6 = r6 * r3
            float r8 = r8 - r6
            float r8 = r8 / r1
            float r1 = java.lang.Math.abs(r0)
            double r6 = (double) r1
            r9 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r6 = r6 * r9
            float r1 = java.lang.Math.abs(r0)
            double r11 = (double) r1
            r13 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r11 = r13 - r11
            double r6 = r6 / r11
            double r6 = java.lang.Math.max(r4, r6)
            float r1 = (float) r6
            float r0 = java.lang.Math.signum(r0)
            float r3 = r18.getFl()
            r6 = 1120403456(0x42c80000, float:100.0)
            float r3 = r6 / r3
            float r0 = r0 * r3
            double r11 = (double) r1
            r1 = 1120403456(0x42c80000, float:100.0)
            r6 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r11 = java.lang.Math.pow(r11, r6)
            float r3 = (float) r11
            float r0 = r0 * r3
            float r3 = java.lang.Math.abs(r2)
            double r11 = (double) r3
            double r11 = r11 * r9
            float r3 = java.lang.Math.abs(r2)
            r15 = r2
            r16 = 1120403456(0x42c80000, float:100.0)
            double r1 = (double) r3
            double r1 = r13 - r1
            double r11 = r11 / r1
            double r1 = java.lang.Math.max(r4, r11)
            float r1 = (float) r1
            float r2 = java.lang.Math.signum(r15)
            float r3 = r18.getFl()
            float r3 = r16 / r3
            float r2 = r2 * r3
            double r11 = (double) r1
            double r11 = java.lang.Math.pow(r11, r6)
            float r1 = (float) r11
            float r2 = r2 * r1
            float r1 = java.lang.Math.abs(r8)
            double r11 = (double) r1
            double r11 = r11 * r9
            float r1 = java.lang.Math.abs(r8)
            double r9 = (double) r1
            double r13 = r13 - r9
            double r11 = r11 / r13
            double r3 = java.lang.Math.max(r4, r11)
            float r1 = (float) r3
            float r3 = java.lang.Math.signum(r8)
            float r4 = r18.getFl()
            float r4 = r16 / r4
            float r3 = r3 * r4
            double r4 = (double) r1
            double r4 = java.lang.Math.pow(r4, r6)
            float r1 = (float) r4
            float r3 = r3 * r1
            float[] r1 = r18.getRgbD()
            r4 = 0
            r1 = r1[r4]
            float r0 = r0 / r1
            float[] r1 = r18.getRgbD()
            r5 = 1
            r1 = r1[r5]
            float r2 = r2 / r1
            float[] r1 = r18.getRgbD()
            r6 = 2
            r1 = r1[r6]
            float r3 = r3 / r1
            float[][] r1 = androidx.core.content.res.CamUtils.CAM16RGB_TO_XYZ
            r7 = r1[r4]
            r8 = r7[r4]
            float r8 = r8 * r0
            r9 = r7[r5]
            float r9 = r9 * r2
            float r8 = r8 + r9
            r7 = r7[r6]
            float r7 = r7 * r3
            float r8 = r8 + r7
            r7 = r1[r5]
            r9 = r7[r4]
            float r9 = r9 * r0
            r10 = r7[r5]
            float r10 = r10 * r2
            float r9 = r9 + r10
            r7 = r7[r6]
            float r7 = r7 * r3
            float r9 = r9 + r7
            r1 = r1[r6]
            r4 = r1[r4]
            float r0 = r0 * r4
            r4 = r1[r5]
            float r2 = r2 * r4
            float r0 = r0 + r2
            r1 = r1[r6]
            float r3 = r3 * r1
            float r0 = r0 + r3
            double r1 = (double) r8
            double r3 = (double) r9
            double r5 = (double) r0
            int r0 = androidx.core.graphics.ColorUtils.XYZToColor(r1, r3, r5)
            return r0
    }

    @androidx.annotation.ColorInt
    int viewedInSrgb() {
            r1 = this;
            androidx.core.content.res.ViewingConditions r0 = androidx.core.content.res.ViewingConditions.DEFAULT
            int r0 = r1.viewed(r0)
            return r0
    }
}
