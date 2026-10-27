package com.google.android.material.bottomappbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class BottomAppBarTopEdgeTreatment extends com.google.android.material.shape.EdgeTreatment implements java.lang.Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float r2, float r3, float r4) {
            r1 = this;
            r1.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.fabCornerSize = r0
            r1.fabMargin = r2
            r1.roundedCornerRadius = r3
            r1.setCradleVerticalOffset(r4)
            r2 = 0
            r1.horizontalOffset = r2
            return
    }

    float getCradleVerticalOffset() {
            r1 = this;
            float r0 = r1.cradleVerticalOffset
            return r0
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float r23, float r24, float r25, @androidx.annotation.NonNull com.google.android.material.shape.ShapePath r26) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r26
            float r3 = r0.fabDiameter
            r9 = 0
            int r4 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r4 != 0) goto L11
            r2.lineTo(r1, r9)
            return
        L11:
            float r4 = r0.fabMargin
            r10 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r10
            float r4 = r4 + r3
            float r11 = r4 / r10
            float r4 = r0.roundedCornerRadius
            float r12 = r25 * r4
            float r4 = r0.horizontalOffset
            float r13 = r24 + r4
            float r4 = r0.cradleVerticalOffset
            float r4 = r4 * r25
            r5 = 1065353216(0x3f800000, float:1.0)
            float r6 = r5 - r25
            float r6 = r6 * r11
            float r4 = r4 + r6
            float r6 = r4 / r11
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 < 0) goto L37
            r2.lineTo(r1, r9)
            return
        L37:
            float r5 = r0.fabCornerSize
            float r14 = r5 * r25
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L53
            float r5 = r5 * r10
            float r5 = r5 - r3
            float r3 = java.lang.Math.abs(r5)
            r5 = 1036831949(0x3dcccccd, float:0.1)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L50
            goto L53
        L50:
            r3 = 0
            r15 = 0
            goto L55
        L53:
            r3 = 1
            r15 = 1
        L55:
            if (r15 != 0) goto L5c
            r3 = 1071644672(0x3fe00000, float:1.75)
            r16 = 0
            goto L5f
        L5c:
            r16 = r4
            r3 = 0
        L5f:
            float r4 = r11 + r12
            float r4 = r4 * r4
            float r5 = r16 + r12
            float r6 = r5 * r5
            float r4 = r4 - r6
            double r6 = (double) r4
            double r6 = java.lang.Math.sqrt(r6)
            float r4 = (float) r6
            float r6 = r13 - r4
            float r17 = r13 + r4
            float r4 = r4 / r5
            double r4 = (double) r4
            double r4 = java.lang.Math.atan(r4)
            double r4 = java.lang.Math.toDegrees(r4)
            float r8 = (float) r4
            r4 = 1119092736(0x42b40000, float:90.0)
            float r4 = r4 - r8
            float r18 = r4 + r3
            r2.lineTo(r6, r9)
            float r3 = r6 - r12
            float r5 = r6 + r12
            float r6 = r12 * r10
            r7 = 1132920832(0x43870000, float:270.0)
            r4 = 0
            r2.addArc(r3, r4, r5, r6, r7, r8)
            r20 = r6
            r19 = r8
            r2 = 1127481344(0x43340000, float:180.0)
            if (r15 == 0) goto Lae
            float r3 = r13 - r11
            float r4 = -r11
            float r4 = r4 - r16
            float r5 = r13 + r11
            float r6 = r11 - r16
            float r7 = r2 - r18
            float r18 = r18 * r10
            float r8 = r18 - r2
            r2 = r26
            r2.addArc(r3, r4, r5, r6, r7, r8)
            goto Lf0
        Lae:
            float r3 = r0.fabMargin
            float r15 = r14 * r10
            float r4 = r3 + r15
            r5 = r3
            float r3 = r13 - r11
            float r6 = r14 + r5
            float r6 = -r6
            float r4 = r4 + r3
            float r5 = r5 + r14
            float r7 = r2 - r18
            float r8 = r18 * r10
            float r8 = r8 - r2
            float r8 = r8 / r10
            r2 = r5
            r5 = r4
            r4 = r6
            r6 = r2
            r2 = r26
            r2.addArc(r3, r4, r5, r6, r7, r8)
            float r5 = r13 + r11
            float r3 = r0.fabMargin
            float r4 = r3 / r10
            float r4 = r4 + r14
            float r4 = r5 - r4
            float r3 = r3 + r14
            r2.lineTo(r4, r3)
            float r3 = r0.fabMargin
            float r15 = r15 + r3
            float r4 = r5 - r15
            float r6 = r14 + r3
            float r6 = -r6
            float r3 = r3 + r14
            r7 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r8 = r18 + r7
            r7 = 1119092736(0x42b40000, float:90.0)
            r21 = r6
            r6 = r3
            r3 = r4
            r4 = r21
            r2.addArc(r3, r4, r5, r6, r7, r8)
        Lf0:
            float r3 = r17 - r12
            float r5 = r17 + r12
            r2 = 1132920832(0x43870000, float:270.0)
            float r7 = r2 - r19
            r4 = 0
            r2 = r26
            r8 = r19
            r6 = r20
            r2.addArc(r3, r4, r5, r6, r7, r8)
            r2.lineTo(r1, r9)
            return
    }

    public float getFabCornerRadius() {
            r1 = this;
            float r0 = r1.fabCornerSize
            return r0
    }

    float getFabCradleMargin() {
            r1 = this;
            float r0 = r1.fabMargin
            return r0
    }

    float getFabCradleRoundedCornerRadius() {
            r1 = this;
            float r0 = r1.roundedCornerRadius
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public float getFabDiameter() {
            r1 = this;
            float r0 = r1.fabDiameter
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public float getHorizontalOffset() {
            r1 = this;
            float r0 = r1.horizontalOffset
            return r0
    }

    void setCradleVerticalOffset(@androidx.annotation.FloatRange(from = 0.0d) float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L8
            r1.cradleVerticalOffset = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cradleVerticalOffset must be positive."
            r2.<init>(r0)
            throw r2
    }

    public void setFabCornerSize(float r1) {
            r0 = this;
            r0.fabCornerSize = r1
            return
    }

    void setFabCradleMargin(float r1) {
            r0 = this;
            r0.fabMargin = r1
            return
    }

    void setFabCradleRoundedCornerRadius(float r1) {
            r0 = this;
            r0.roundedCornerRadius = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setFabDiameter(float r1) {
            r0 = this;
            r0.fabDiameter = r1
            return
    }

    void setHorizontalOffset(float r1) {
            r0 = this;
            r0.horizontalOffset = r1
            return
    }
}
