package com.github.mikephil.charting.data.filter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Approximator {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class Line {
        private float dx;
        private float dy;
        private float exsy;
        private float length;
        private float[] points;
        private float sxey;
        final /* synthetic */ com.github.mikephil.charting.data.filter.Approximator this$0;

        public Line(com.github.mikephil.charting.data.filter.Approximator r3, float r4, float r5, float r6, float r7) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                float r3 = r4 - r6
                r2.dx = r3
                float r0 = r5 - r7
                r2.dy = r0
                float r1 = r4 * r7
                r2.sxey = r1
                float r1 = r6 * r5
                r2.exsy = r1
                float r3 = r3 * r3
                float r0 = r0 * r0
                float r3 = r3 + r0
                double r0 = (double) r3
                double r0 = java.lang.Math.sqrt(r0)
                float r3 = (float) r0
                r2.length = r3
                r3 = 4
                float[] r3 = new float[r3]
                r0 = 0
                r3[r0] = r4
                r4 = 1
                r3[r4] = r5
                r4 = 2
                r3[r4] = r6
                r4 = 3
                r3[r4] = r7
                r2.points = r3
                return
        }

        public float distance(float r2, float r3) {
                r1 = this;
                float r0 = r1.dy
                float r0 = r0 * r2
                float r2 = r1.dx
                float r2 = r2 * r3
                float r0 = r0 - r2
                float r2 = r1.sxey
                float r0 = r0 + r2
                float r2 = r1.exsy
                float r0 = r0 - r2
                float r2 = java.lang.Math.abs(r0)
                float r3 = r1.length
                float r2 = r2 / r3
                return r2
        }

        public float[] getPoints() {
                r1 = this;
                float[] r0 = r1.points
                return r0
        }
    }

    public Approximator() {
            r0 = this;
            r0.<init>()
            return
    }

    float[] concat(float[]... r10) {
            r9 = this;
            int r0 = r10.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto Ld
            r4 = r10[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Ld:
            float[] r0 = new float[r3]
            int r2 = r10.length
            r3 = 0
            r4 = 0
        L12:
            if (r3 >= r2) goto L26
            r5 = r10[r3]
            int r6 = r5.length
            r7 = 0
        L18:
            if (r7 >= r6) goto L23
            r8 = r5[r7]
            r0[r4] = r8
            int r4 = r4 + 1
            int r7 = r7 + 1
            goto L18
        L23:
            int r3 = r3 + 1
            goto L12
        L26:
            return r0
    }

    @android.annotation.TargetApi(9)
    public float[] reduceWithDouglasPeucker(float[] r11, float r12) {
            r10 = this;
            com.github.mikephil.charting.data.filter.Approximator$Line r0 = new com.github.mikephil.charting.data.filter.Approximator$Line
            r6 = 0
            r2 = r11[r6]
            r7 = 1
            r3 = r11[r7]
            int r1 = r11.length
            r8 = 2
            int r1 = r1 - r8
            r4 = r11[r1]
            int r1 = r11.length
            int r1 = r1 - r7
            r5 = r11[r1]
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = 0
            r3 = 2
            r4 = 0
        L18:
            int r5 = r11.length
            int r5 = r5 - r8
            if (r3 >= r5) goto L2f
            r5 = r11[r3]
            int r9 = r3 + 1
            r9 = r11[r9]
            float r5 = r0.distance(r5, r9)
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 <= 0) goto L2c
            r4 = r3
            r2 = r5
        L2c:
            int r3 = r3 + 2
            goto L18
        L2f:
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto L56
            int r0 = r4 + 2
            float[] r0 = java.util.Arrays.copyOfRange(r11, r6, r0)
            float[] r0 = r10.reduceWithDouglasPeucker(r0, r12)
            int r2 = r11.length
            float[] r11 = java.util.Arrays.copyOfRange(r11, r4, r2)
            float[] r11 = r10.reduceWithDouglasPeucker(r11, r12)
            int r12 = r11.length
            float[] r11 = java.util.Arrays.copyOfRange(r11, r8, r12)
            float[][] r12 = new float[r8][]
            r12[r6] = r0
            r12[r7] = r11
            float[] r11 = r10.concat(r12)
            return r11
        L56:
            float[] r11 = r0.getPoints()
            return r11
    }
}
