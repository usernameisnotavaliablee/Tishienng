package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class QuantizerWu implements com.google.android.material.color.utilities.Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    com.google.android.material.color.utilities.QuantizerWu.Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = null;

        static {
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r0 = com.google.android.material.color.utilities.QuantizerWu.Direction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = r0
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = com.google.android.material.color.utilities.QuantizerWu.Direction.RED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Box {
        int b0;
        int b1;
        int g0;

        /* renamed from: g1, reason: collision with root package name */
        int f2g1;

        /* renamed from: r0, reason: collision with root package name */
        int f3r0;
        int r1;
        int vol;

        private Box() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f3r0 = r0
                r1.r1 = r0
                r1.g0 = r0
                r1.f2g1 = r0
                r1.b0 = r0
                r1.b1 = r0
                r1.vol = r0
                return
        }

        /* synthetic */ Box(com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CreateBoxesResult {
        int resultCount;

        CreateBoxesResult(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.resultCount = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum Direction extends java.lang.Enum<com.google.android.material.color.utilities.QuantizerWu.Direction> {
        private static final /* synthetic */ com.google.android.material.color.utilities.QuantizerWu.Direction[] $VALUES = null;
        public static final com.google.android.material.color.utilities.QuantizerWu.Direction BLUE = null;
        public static final com.google.android.material.color.utilities.QuantizerWu.Direction GREEN = null;
        public static final com.google.android.material.color.utilities.QuantizerWu.Direction RED = null;

        static {
                com.google.android.material.color.utilities.QuantizerWu$Direction r0 = new com.google.android.material.color.utilities.QuantizerWu$Direction
                java.lang.String r1 = "RED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.material.color.utilities.QuantizerWu.Direction.RED = r0
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = new com.google.android.material.color.utilities.QuantizerWu$Direction
                java.lang.String r3 = "GREEN"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN = r1
                com.google.android.material.color.utilities.QuantizerWu$Direction r3 = new com.google.android.material.color.utilities.QuantizerWu$Direction
                java.lang.String r5 = "BLUE"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE = r3
                r5 = 3
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r5 = new com.google.android.material.color.utilities.QuantizerWu.Direction[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.android.material.color.utilities.QuantizerWu.Direction.$VALUES = r5
                return
        }

        Direction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.material.color.utilities.QuantizerWu.Direction valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.material.color.utilities.QuantizerWu$Direction> r0 = com.google.android.material.color.utilities.QuantizerWu.Direction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = (com.google.android.material.color.utilities.QuantizerWu.Direction) r1
                return r1
        }

        public static com.google.android.material.color.utilities.QuantizerWu.Direction[] values() {
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r0 = com.google.android.material.color.utilities.QuantizerWu.Direction.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r0 = (com.google.android.material.color.utilities.QuantizerWu.Direction[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class MaximizeResult {
        int cutLocation;
        double maximum;

        MaximizeResult(int r1, double r2) {
                r0 = this;
                r0.<init>()
                r0.cutLocation = r1
                r0.maximum = r2
                return
        }
    }

    public QuantizerWu() {
            r0 = this;
            r0.<init>()
            return
    }

    static int bottom(com.google.android.material.color.utilities.QuantizerWu.Box r3, com.google.android.material.color.utilities.QuantizerWu.Direction r4, int[] r5) {
            int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L91
            r1 = 2
            if (r0 == r1) goto L5d
            r1 = 3
            if (r0 != r1) goto L46
            int r4 = r3.r1
            int r0 = r3.f2g1
            int r1 = r3.b0
            int r4 = getIndex(r4, r0, r1)
            r4 = r5[r4]
            int r4 = -r4
            int r0 = r3.r1
            int r1 = r3.g0
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.f3r0
            int r1 = r3.f2g1
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.f3r0
            int r1 = r3.g0
            int r3 = r3.b0
            int r3 = getIndex(r0, r1, r3)
            r3 = r5[r3]
        L44:
            int r4 = r4 - r3
            return r4
        L46:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "unexpected direction "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L5d:
            int r4 = r3.r1
            int r0 = r3.g0
            int r1 = r3.b1
            int r4 = getIndex(r4, r0, r1)
            r4 = r5[r4]
            int r4 = -r4
            int r0 = r3.r1
            int r1 = r3.g0
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.f3r0
            int r1 = r3.g0
            int r2 = r3.b1
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.f3r0
            int r1 = r3.g0
            int r3 = r3.b0
            int r3 = getIndex(r0, r1, r3)
            r3 = r5[r3]
            goto L44
        L91:
            int r4 = r3.f3r0
            int r0 = r3.f2g1
            int r1 = r3.b1
            int r4 = getIndex(r4, r0, r1)
            r4 = r5[r4]
            int r4 = -r4
            int r0 = r3.f3r0
            int r1 = r3.f2g1
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.f3r0
            int r1 = r3.g0
            int r2 = r3.b1
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.f3r0
            int r1 = r3.g0
            int r3 = r3.b0
            int r3 = getIndex(r0, r1, r3)
            r3 = r5[r3]
            goto L44
    }

    static int getIndex(int r2, int r3, int r4) {
            int r0 = r2 << 10
            int r1 = r2 << 6
            int r0 = r0 + r1
            int r0 = r0 + r2
            int r2 = r3 << 5
            int r0 = r0 + r2
            int r0 = r0 + r3
            int r0 = r0 + r4
            return r0
    }

    static int top(com.google.android.material.color.utilities.QuantizerWu.Box r2, com.google.android.material.color.utilities.QuantizerWu.Direction r3, int r4, int[] r5) {
            int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L7f
            r1 = 2
            if (r0 == r1) goto L54
            r1 = 3
            if (r0 != r1) goto L3d
            int r3 = r2.r1
            int r0 = r2.f2g1
            int r3 = getIndex(r3, r0, r4)
            r3 = r5[r3]
            int r0 = r2.r1
            int r1 = r2.g0
            int r0 = getIndex(r0, r1, r4)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.f3r0
            int r1 = r2.f2g1
            int r0 = getIndex(r0, r1, r4)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.f3r0
            int r2 = r2.g0
            int r2 = getIndex(r0, r2, r4)
            r2 = r5[r2]
        L3b:
            int r3 = r3 + r2
            return r3
        L3d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "unexpected direction "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L54:
            int r3 = r2.r1
            int r0 = r2.b1
            int r3 = getIndex(r3, r4, r0)
            r3 = r5[r3]
            int r0 = r2.r1
            int r1 = r2.b0
            int r0 = getIndex(r0, r4, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.f3r0
            int r1 = r2.b1
            int r0 = getIndex(r0, r4, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.f3r0
            int r2 = r2.b0
            int r2 = getIndex(r0, r4, r2)
            r2 = r5[r2]
            goto L3b
        L7f:
            int r3 = r2.f2g1
            int r0 = r2.b1
            int r3 = getIndex(r4, r3, r0)
            r3 = r5[r3]
            int r0 = r2.f2g1
            int r1 = r2.b0
            int r0 = getIndex(r4, r0, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.g0
            int r1 = r2.b1
            int r0 = getIndex(r4, r0, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.g0
            int r2 = r2.b0
            int r2 = getIndex(r4, r0, r2)
            r2 = r5[r2]
            goto L3b
    }

    static int volume(com.google.android.material.color.utilities.QuantizerWu.Box r4, int[] r5) {
            int r0 = r4.r1
            int r1 = r4.f2g1
            int r2 = r4.b1
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r1 = r4.r1
            int r2 = r4.f2g1
            int r3 = r4.b0
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 - r1
            int r1 = r4.r1
            int r2 = r4.g0
            int r3 = r4.b1
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 - r1
            int r1 = r4.r1
            int r2 = r4.g0
            int r3 = r4.b0
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 + r1
            int r1 = r4.f3r0
            int r2 = r4.f2g1
            int r3 = r4.b1
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 - r1
            int r1 = r4.f3r0
            int r2 = r4.f2g1
            int r3 = r4.b0
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 + r1
            int r1 = r4.f3r0
            int r2 = r4.g0
            int r3 = r4.b1
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 + r1
            int r1 = r4.f3r0
            int r2 = r4.g0
            int r4 = r4.b0
            int r4 = getIndex(r1, r2, r4)
            r4 = r5[r4]
            int r0 = r0 - r4
            return r0
    }

    void constructHistogram(java.util.Map<java.lang.Integer, java.lang.Integer> r9) {
            r8 = this;
            r0 = 35937(0x8c61, float:5.0358E-41)
            int[] r1 = new int[r0]
            r8.weights = r1
            int[] r1 = new int[r0]
            r8.momentsR = r1
            int[] r1 = new int[r0]
            r8.momentsG = r1
            int[] r1 = new int[r0]
            r8.momentsB = r1
            double[] r0 = new double[r0]
            r8.moments = r0
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L1f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r2 = com.google.android.material.color.utilities.ColorUtils.redFromArgb(r1)
            int r3 = com.google.android.material.color.utilities.ColorUtils.greenFromArgb(r1)
            int r1 = com.google.android.material.color.utilities.ColorUtils.blueFromArgb(r1)
            int r4 = r2 >> 3
            int r4 = r4 + 1
            int r5 = r3 >> 3
            int r5 = r5 + 1
            int r6 = r1 >> 3
            int r6 = r6 + 1
            int r4 = getIndex(r4, r5, r6)
            int[] r5 = r8.weights
            r6 = r5[r4]
            int r6 = r6 + r0
            r5[r4] = r6
            int[] r5 = r8.momentsR
            r6 = r5[r4]
            int r7 = r2 * r0
            int r6 = r6 + r7
            r5[r4] = r6
            int[] r5 = r8.momentsG
            r6 = r5[r4]
            int r7 = r3 * r0
            int r6 = r6 + r7
            r5[r4] = r6
            int[] r5 = r8.momentsB
            r6 = r5[r4]
            int r7 = r1 * r0
            int r6 = r6 + r7
            r5[r4] = r6
            double[] r5 = r8.moments
            r6 = r5[r4]
            int r2 = r2 * r2
            int r3 = r3 * r3
            int r2 = r2 + r3
            int r1 = r1 * r1
            int r2 = r2 + r1
            int r0 = r0 * r2
            double r0 = (double) r0
            double r6 = r6 + r0
            r5[r4] = r6
            goto L1f
        L90:
            return
    }

    com.google.android.material.color.utilities.QuantizerWu.CreateBoxesResult createBoxes(int r14) {
            r13 = this;
            com.google.android.material.color.utilities.QuantizerWu$Box[] r0 = new com.google.android.material.color.utilities.QuantizerWu.Box[r14]
            r13.cubes = r0
            r0 = 0
            r1 = 0
        L6:
            if (r1 >= r14) goto L15
            com.google.android.material.color.utilities.QuantizerWu$Box[] r2 = r13.cubes
            com.google.android.material.color.utilities.QuantizerWu$Box r3 = new com.google.android.material.color.utilities.QuantizerWu$Box
            r4 = 0
            r3.<init>(r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L6
        L15:
            double[] r1 = new double[r14]
            com.google.android.material.color.utilities.QuantizerWu$Box[] r2 = r13.cubes
            r2 = r2[r0]
            r3 = 32
            r2.r1 = r3
            r2.f2g1 = r3
            r2.b1 = r3
            r2 = 1
            r3 = 1
            r4 = 0
        L26:
            if (r3 >= r14) goto L7a
            com.google.android.material.color.utilities.QuantizerWu$Box[] r5 = r13.cubes
            r6 = r5[r4]
            r5 = r5[r3]
            java.lang.Boolean r5 = r13.cut(r6, r5)
            boolean r5 = r5.booleanValue()
            r6 = 0
            if (r5 == 0) goto L5b
            com.google.android.material.color.utilities.QuantizerWu$Box[] r5 = r13.cubes
            r5 = r5[r4]
            int r8 = r5.vol
            if (r8 <= r2) goto L47
            double r8 = r13.variance(r5)
            goto L48
        L47:
            r8 = r6
        L48:
            r1[r4] = r8
            com.google.android.material.color.utilities.QuantizerWu$Box[] r4 = r13.cubes
            r4 = r4[r3]
            int r5 = r4.vol
            if (r5 <= r2) goto L57
            double r4 = r13.variance(r4)
            goto L58
        L57:
            r4 = r6
        L58:
            r1[r3] = r4
            goto L5f
        L5b:
            r1[r4] = r6
            int r3 = r3 + (-1)
        L5f:
            r4 = r1[r0]
            r8 = 0
            r9 = 1
        L63:
            if (r9 > r3) goto L70
            r10 = r1[r9]
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 <= 0) goto L6d
            r8 = r9
            r4 = r10
        L6d:
            int r9 = r9 + 1
            goto L63
        L70:
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L76
            int r3 = r3 + r2
            goto L7b
        L76:
            int r3 = r3 + 1
            r4 = r8
            goto L26
        L7a:
            r3 = r14
        L7b:
            com.google.android.material.color.utilities.QuantizerWu$CreateBoxesResult r0 = new com.google.android.material.color.utilities.QuantizerWu$CreateBoxesResult
            r0.<init>(r14, r3)
            return r0
    }

    void createMoments() {
            r22 = this;
            r0 = r22
            r2 = 1
        L3:
            r3 = 33
            if (r2 >= r3) goto L9f
            int[] r4 = new int[r3]
            int[] r5 = new int[r3]
            int[] r6 = new int[r3]
            int[] r7 = new int[r3]
            double[] r8 = new double[r3]
            r9 = 1
        L12:
            if (r9 >= r3) goto L9b
            r10 = 0
            r11 = 0
            r14 = r11
            r1 = 1
            r11 = 0
            r12 = 0
            r13 = 0
        L1c:
            if (r1 >= r3) goto L95
            int r16 = getIndex(r2, r9, r1)
            int[] r3 = r0.weights
            r3 = r3[r16]
            int r10 = r10 + r3
            int[] r3 = r0.momentsR
            r3 = r3[r16]
            int r11 = r11 + r3
            int[] r3 = r0.momentsG
            r3 = r3[r16]
            int r12 = r12 + r3
            int[] r3 = r0.momentsB
            r3 = r3[r16]
            int r13 = r13 + r3
            double[] r3 = r0.moments
            r17 = r3[r16]
            double r14 = r14 + r17
            r3 = r4[r1]
            int r3 = r3 + r10
            r4[r1] = r3
            r3 = r5[r1]
            int r3 = r3 + r11
            r5[r1] = r3
            r3 = r6[r1]
            int r3 = r3 + r12
            r6[r1] = r3
            r3 = r7[r1]
            int r3 = r3 + r13
            r7[r1] = r3
            r17 = r8[r1]
            double r17 = r17 + r14
            r8[r1] = r17
            int r3 = r2 + (-1)
            int r3 = getIndex(r3, r9, r1)
            r17 = r1
            int[] r1 = r0.weights
            r18 = r1[r3]
            r19 = r4[r17]
            int r18 = r18 + r19
            r1[r16] = r18
            int[] r1 = r0.momentsR
            r18 = r1[r3]
            r19 = r5[r17]
            int r18 = r18 + r19
            r1[r16] = r18
            int[] r1 = r0.momentsG
            r18 = r1[r3]
            r19 = r6[r17]
            int r18 = r18 + r19
            r1[r16] = r18
            int[] r1 = r0.momentsB
            r18 = r1[r3]
            r19 = r7[r17]
            int r18 = r18 + r19
            r1[r16] = r18
            double[] r1 = r0.moments
            r18 = r1[r3]
            r20 = r8[r17]
            double r18 = r18 + r20
            r1[r16] = r18
            int r1 = r17 + 1
            r3 = 33
            goto L1c
        L95:
            int r9 = r9 + 1
            r3 = 33
            goto L12
        L9b:
            int r2 = r2 + 1
            goto L3
        L9f:
            return
    }

    java.util.List<java.lang.Integer> createResult(int r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            if (r1 >= r8) goto L42
            com.google.android.material.color.utilities.QuantizerWu$Box[] r2 = r7.cubes
            r2 = r2[r1]
            int[] r3 = r7.weights
            int r3 = volume(r2, r3)
            if (r3 <= 0) goto L3f
            int[] r4 = r7.momentsR
            int r4 = volume(r2, r4)
            int r4 = r4 / r3
            int[] r5 = r7.momentsG
            int r5 = volume(r2, r5)
            int r5 = r5 / r3
            int[] r6 = r7.momentsB
            int r2 = volume(r2, r6)
            int r2 = r2 / r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 | r4
            r4 = r5 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r3 = r3 | r4
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        L3f:
            int r1 = r1 + 1
            goto L6
        L42:
            return r0
    }

    java.lang.Boolean cut(com.google.android.material.color.utilities.QuantizerWu.Box r17, com.google.android.material.color.utilities.QuantizerWu.Box r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r9 = r18
            int[] r2 = r0.momentsR
            int r5 = volume(r1, r2)
            int[] r2 = r0.momentsG
            int r6 = volume(r1, r2)
            int[] r2 = r0.momentsB
            int r7 = volume(r1, r2)
            int[] r2 = r0.weights
            int r8 = volume(r1, r2)
            com.google.android.material.color.utilities.QuantizerWu$Direction r2 = com.google.android.material.color.utilities.QuantizerWu.Direction.RED
            int r3 = r1.f3r0
            r10 = 1
            int r3 = r3 + r10
            int r4 = r1.r1
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r11 = r0.maximize(r1, r2, r3, r4, r5, r6, r7, r8)
            r12 = r2
            com.google.android.material.color.utilities.QuantizerWu$Direction r2 = com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN
            int r0 = r1.g0
            int r3 = r0 + 1
            int r4 = r1.f2g1
            r0 = r16
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r13 = r0.maximize(r1, r2, r3, r4, r5, r6, r7, r8)
            r14 = r2
            com.google.android.material.color.utilities.QuantizerWu$Direction r2 = com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE
            int r0 = r1.b0
            int r3 = r0 + 1
            int r4 = r1.b1
            r0 = r16
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r3 = r0.maximize(r1, r2, r3, r4, r5, r6, r7, r8)
            double r4 = r11.maximum
            double r6 = r13.maximum
            r8 = r11
            double r10 = r3.maximum
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 < 0) goto L60
            int r15 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r15 < 0) goto L60
            int r2 = r8.cutLocation
            if (r2 >= 0) goto L5e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L5e:
            r2 = r12
            goto L69
        L60:
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 < 0) goto L69
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 < 0) goto L69
            r2 = r14
        L69:
            int r4 = r1.r1
            r9.r1 = r4
            int r4 = r1.f2g1
            r9.f2g1 = r4
            int r4 = r1.b1
            r9.b1 = r4
            int[] r4 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction
            int r2 = r2.ordinal()
            r2 = r4[r2]
            r0 = 1
            if (r2 == r0) goto La5
            r0 = 2
            if (r2 == r0) goto L96
            r0 = 3
            if (r2 == r0) goto L87
            goto Lb3
        L87:
            int r0 = r3.cutLocation
            r1.b1 = r0
            int r2 = r1.f3r0
            r9.f3r0 = r2
            int r2 = r1.g0
            r9.g0 = r2
            r9.b0 = r0
            goto Lb3
        L96:
            int r0 = r13.cutLocation
            r1.f2g1 = r0
            int r2 = r1.f3r0
            r9.f3r0 = r2
            r9.g0 = r0
            int r0 = r1.b0
            r9.b0 = r0
            goto Lb3
        La5:
            int r0 = r8.cutLocation
            r1.r1 = r0
            r9.f3r0 = r0
            int r0 = r1.g0
            r9.g0 = r0
            int r0 = r1.b0
            r9.b0 = r0
        Lb3:
            int r0 = r1.r1
            int r2 = r1.f3r0
            int r0 = r0 - r2
            int r2 = r1.f2g1
            int r3 = r1.g0
            int r2 = r2 - r3
            int r0 = r0 * r2
            int r2 = r1.b1
            int r3 = r1.b0
            int r2 = r2 - r3
            int r0 = r0 * r2
            r1.vol = r0
            int r0 = r9.r1
            int r1 = r9.f3r0
            int r0 = r0 - r1
            int r1 = r9.f2g1
            int r2 = r9.g0
            int r1 = r1 - r2
            int r0 = r0 * r1
            int r1 = r9.b1
            int r2 = r9.b0
            int r1 = r1 - r2
            int r0 = r0 * r1
            r9.vol = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    com.google.android.material.color.utilities.QuantizerWu.MaximizeResult maximize(com.google.android.material.color.utilities.QuantizerWu.Box r19, com.google.android.material.color.utilities.QuantizerWu.Direction r20, int r21, int r22, int r23, int r24, int r25, int r26) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            int[] r3 = r0.momentsR
            int r3 = bottom(r1, r2, r3)
            int[] r4 = r0.momentsG
            int r4 = bottom(r1, r2, r4)
            int[] r5 = r0.momentsB
            int r5 = bottom(r1, r2, r5)
            int[] r6 = r0.weights
            int r6 = bottom(r1, r2, r6)
            r7 = 0
            r9 = -1
            r11 = r22
            r8 = r7
            r10 = -1
            r7 = r21
        L27:
            if (r7 >= r11) goto L7c
            int[] r12 = r0.momentsR
            int r12 = top(r1, r2, r7, r12)
            int r12 = r12 + r3
            int[] r13 = r0.momentsG
            int r13 = top(r1, r2, r7, r13)
            int r13 = r13 + r4
            int[] r14 = r0.momentsB
            int r14 = top(r1, r2, r7, r14)
            int r14 = r14 + r5
            int[] r15 = r0.weights
            int r15 = top(r1, r2, r7, r15)
            int r15 = r15 + r6
            if (r15 != 0) goto L48
            goto L75
        L48:
            int r16 = r12 * r12
            int r17 = r13 * r13
            int r16 = r16 + r17
            int r17 = r14 * r14
            int r0 = r16 + r17
            double r0 = (double) r0
            r16 = r0
            double r0 = (double) r15
            double r0 = r16 / r0
            int r12 = r23 - r12
            int r13 = r24 - r13
            int r14 = r25 - r14
            int r15 = r26 - r15
            if (r15 != 0) goto L63
            goto L75
        L63:
            int r12 = r12 * r12
            int r13 = r13 * r13
            int r12 = r12 + r13
            int r14 = r14 * r14
            int r12 = r12 + r14
            double r12 = (double) r12
            double r14 = (double) r15
            double r12 = r12 / r14
            double r0 = r0 + r12
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r12 <= 0) goto L75
            r8 = r0
            r10 = r7
        L75:
            int r7 = r7 + 1
            r0 = r18
            r1 = r19
            goto L27
        L7c:
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r0 = new com.google.android.material.color.utilities.QuantizerWu$MaximizeResult
            r0.<init>(r10, r8)
            return r0
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public com.google.android.material.color.utilities.QuantizerResult quantize(int[] r3, int r4) {
            r2 = this;
            com.google.android.material.color.utilities.QuantizerMap r0 = new com.google.android.material.color.utilities.QuantizerMap
            r0.<init>()
            com.google.android.material.color.utilities.QuantizerResult r3 = r0.quantize(r3, r4)
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r3.colorToCount
            r2.constructHistogram(r3)
            r2.createMoments()
            com.google.android.material.color.utilities.QuantizerWu$CreateBoxesResult r3 = r2.createBoxes(r4)
            int r3 = r3.resultCount
            java.util.List r3 = r2.createResult(r3)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r3.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.put(r0, r1)
            goto L24
        L3c:
            com.google.android.material.color.utilities.QuantizerResult r3 = new com.google.android.material.color.utilities.QuantizerResult
            r3.<init>(r4)
            return r3
    }

    double variance(com.google.android.material.color.utilities.QuantizerWu.Box r10) {
            r9 = this;
            int[] r0 = r9.momentsR
            int r0 = volume(r10, r0)
            int[] r1 = r9.momentsG
            int r1 = volume(r10, r1)
            int[] r2 = r9.momentsB
            int r2 = volume(r10, r2)
            double[] r3 = r9.moments
            int r4 = r10.r1
            int r5 = r10.f2g1
            int r6 = r10.b1
            int r4 = getIndex(r4, r5, r6)
            r4 = r3[r4]
            double[] r3 = r9.moments
            int r6 = r10.r1
            int r7 = r10.f2g1
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            double[] r3 = r9.moments
            int r6 = r10.r1
            int r7 = r10.g0
            int r8 = r10.b1
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            double[] r3 = r9.moments
            int r6 = r10.r1
            int r7 = r10.g0
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 + r6
            double[] r3 = r9.moments
            int r6 = r10.f3r0
            int r7 = r10.f2g1
            int r8 = r10.b1
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            double[] r3 = r9.moments
            int r6 = r10.f3r0
            int r7 = r10.f2g1
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 + r6
            double[] r3 = r9.moments
            int r6 = r10.f3r0
            int r7 = r10.g0
            int r8 = r10.b1
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 + r6
            double[] r3 = r9.moments
            int r6 = r10.f3r0
            int r7 = r10.g0
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            int r0 = r0 * r0
            int r1 = r1 * r1
            int r0 = r0 + r1
            int r2 = r2 * r2
            int r0 = r0 + r2
            int[] r1 = r9.weights
            int r10 = volume(r10, r1)
            double r0 = (double) r0
            double r2 = (double) r10
            double r0 = r0 / r2
            double r4 = r4 - r0
            return r4
    }
}
