package androidx.constraintlayout.motion.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Easing {
    private static final java.lang.String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final java.lang.String ACCELERATE_NAME = "accelerate";
    private static final java.lang.String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final java.lang.String DECELERATE_NAME = "decelerate";
    private static final java.lang.String LINEAR = "cubic(1, 1, 0, 0)";
    private static final java.lang.String LINEAR_NAME = "linear";
    public static java.lang.String[] NAMED_EASING = null;
    private static final java.lang.String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
    private static final java.lang.String STANDARD_NAME = "standard";
    static androidx.constraintlayout.motion.utils.Easing sDefault;
    java.lang.String str;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CubicEasing extends androidx.constraintlayout.motion.utils.Easing {
        private static double d_error = 1.0E-4d;
        private static double error = 0.01d;
        double x1;
        double x2;
        double y1;
        double y2;

        static {
                return
        }

        public CubicEasing(double r1, double r3, double r5, double r7) {
                r0 = this;
                r0.<init>()
                r0.setup(r1, r3, r5, r7)
                return
        }

        CubicEasing(java.lang.String r6) {
                r5 = this;
                r5.<init>()
                r5.str = r6
                r0 = 40
                int r0 = r6.indexOf(r0)
                r1 = 44
                int r2 = r6.indexOf(r1, r0)
                int r0 = r0 + 1
                java.lang.String r0 = r6.substring(r0, r2)
                java.lang.String r0 = r0.trim()
                double r3 = java.lang.Double.parseDouble(r0)
                r5.x1 = r3
                int r2 = r2 + 1
                int r0 = r6.indexOf(r1, r2)
                java.lang.String r2 = r6.substring(r2, r0)
                java.lang.String r2 = r2.trim()
                double r2 = java.lang.Double.parseDouble(r2)
                r5.y1 = r2
                int r0 = r0 + 1
                int r1 = r6.indexOf(r1, r0)
                java.lang.String r0 = r6.substring(r0, r1)
                java.lang.String r0 = r0.trim()
                double r2 = java.lang.Double.parseDouble(r0)
                r5.x2 = r2
                int r1 = r1 + 1
                r0 = 41
                int r0 = r6.indexOf(r0, r1)
                java.lang.String r6 = r6.substring(r1, r0)
                java.lang.String r6 = r6.trim()
                double r0 = java.lang.Double.parseDouble(r6)
                r5.y2 = r0
                return
        }

        private double getDiffX(double r13) {
                r12 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r2 = r0 - r13
                r4 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r6 = r2 * r4
                double r6 = r6 * r2
                double r8 = r12.x1
                double r6 = r6 * r8
                r10 = 4618441417868443648(0x4018000000000000, double:6.0)
                double r2 = r2 * r10
                double r2 = r2 * r13
                double r10 = r12.x2
                double r8 = r10 - r8
                double r2 = r2 * r8
                double r6 = r6 + r2
                double r4 = r4 * r13
                double r4 = r4 * r13
                double r0 = r0 - r10
                double r4 = r4 * r0
                double r6 = r6 + r4
                return r6
        }

        private double getDiffY(double r13) {
                r12 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r2 = r0 - r13
                r4 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r6 = r2 * r4
                double r6 = r6 * r2
                double r8 = r12.y1
                double r6 = r6 * r8
                r10 = 4618441417868443648(0x4018000000000000, double:6.0)
                double r2 = r2 * r10
                double r2 = r2 * r13
                double r10 = r12.y2
                double r8 = r10 - r8
                double r2 = r2 * r8
                double r6 = r6 + r2
                double r4 = r4 * r13
                double r4 = r4 * r13
                double r0 = r0 - r10
                double r4 = r4 * r0
                double r6 = r6 + r4
                return r6
        }

        private double getX(double r7) {
                r6 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r0 = r0 - r7
                r2 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r2 = r2 * r0
                double r0 = r0 * r2
                double r0 = r0 * r7
                double r2 = r2 * r7
                double r2 = r2 * r7
                double r4 = r7 * r7
                double r4 = r4 * r7
                double r7 = r6.x1
                double r7 = r7 * r0
                double r0 = r6.x2
                double r0 = r0 * r2
                double r7 = r7 + r0
                double r7 = r7 + r4
                return r7
        }

        private double getY(double r7) {
                r6 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r0 = r0 - r7
                r2 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r2 = r2 * r0
                double r0 = r0 * r2
                double r0 = r0 * r7
                double r2 = r2 * r7
                double r2 = r2 * r7
                double r4 = r7 * r7
                double r4 = r4 * r7
                double r7 = r6.y1
                double r7 = r7 * r0
                double r0 = r6.y2
                double r0 = r0 * r2
                double r7 = r7 + r0
                double r7 = r7 + r4
                return r7
        }

        @Override // androidx.constraintlayout.motion.utils.Easing
        public double get(double r10) {
                r9 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 > 0) goto L7
                return r0
            L7:
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto Le
                return r0
            Le:
                r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                r2 = r0
                r4 = r2
            L12:
                double r6 = androidx.constraintlayout.motion.utils.Easing.CubicEasing.error
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 <= 0) goto L26
                double r6 = r9.getX(r4)
                double r2 = r2 * r0
                int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r8 >= 0) goto L24
                double r4 = r4 + r2
                goto L12
            L24:
                double r4 = r4 - r2
                goto L12
            L26:
                double r0 = r4 - r2
                double r6 = r9.getX(r0)
                double r4 = r4 + r2
                double r2 = r9.getX(r4)
                double r0 = r9.getY(r0)
                double r4 = r9.getY(r4)
                double r4 = r4 - r0
                double r10 = r10 - r6
                double r4 = r4 * r10
                double r2 = r2 - r6
                double r4 = r4 / r2
                double r4 = r4 + r0
                return r4
        }

        @Override // androidx.constraintlayout.motion.utils.Easing
        public double getDiff(double r10) {
                r9 = this;
                r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                r2 = r0
                r4 = r2
            L4:
                double r6 = androidx.constraintlayout.motion.utils.Easing.CubicEasing.d_error
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 <= 0) goto L18
                double r6 = r9.getX(r4)
                double r2 = r2 * r0
                int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r8 >= 0) goto L16
                double r4 = r4 + r2
                goto L4
            L16:
                double r4 = r4 - r2
                goto L4
            L18:
                double r10 = r4 - r2
                double r0 = r9.getX(r10)
                double r4 = r4 + r2
                double r2 = r9.getX(r4)
                double r10 = r9.getY(r10)
                double r4 = r9.getY(r4)
                double r4 = r4 - r10
                double r2 = r2 - r0
                double r4 = r4 / r2
                return r4
        }

        void setup(double r1, double r3, double r5, double r7) {
                r0 = this;
                r0.x1 = r1
                r0.y1 = r3
                r0.x2 = r5
                r0.y2 = r7
                return
        }
    }

    static {
            androidx.constraintlayout.motion.utils.Easing r0 = new androidx.constraintlayout.motion.utils.Easing
            r0.<init>()
            androidx.constraintlayout.motion.utils.Easing.sDefault = r0
            java.lang.String r0 = "decelerate"
            java.lang.String r1 = "linear"
            java.lang.String r2 = "standard"
            java.lang.String r3 = "accelerate"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            androidx.constraintlayout.motion.utils.Easing.NAMED_EASING = r0
            return
    }

    public Easing() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "identity"
            r1.str = r0
            return
    }

    public static androidx.constraintlayout.motion.utils.Easing getInterpolator(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "cubic"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L12
            androidx.constraintlayout.motion.utils.Easing$CubicEasing r0 = new androidx.constraintlayout.motion.utils.Easing$CubicEasing
            r0.<init>(r2)
            return r0
        L12:
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1354466595: goto L3c;
                case -1263948740: goto L31;
                case -1102672091: goto L26;
                case 1312628413: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L46
        L1b:
            java.lang.String r0 = "standard"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L24
            goto L46
        L24:
            r1 = 3
            goto L46
        L26:
            java.lang.String r0 = "linear"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2f
            goto L46
        L2f:
            r1 = 2
            goto L46
        L31:
            java.lang.String r0 = "decelerate"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3a
            goto L46
        L3a:
            r1 = 1
            goto L46
        L3c:
            java.lang.String r0 = "accelerate"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            goto L46
        L45:
            r1 = 0
        L46:
            switch(r1) {
                case 0: goto L69;
                case 1: goto L61;
                case 2: goto L59;
                case 3: goto L51;
                default: goto L49;
            }
        L49:
            java.lang.String[] r2 = androidx.constraintlayout.motion.utils.Easing.NAMED_EASING
            java.util.Arrays.toString(r2)
            androidx.constraintlayout.motion.utils.Easing r2 = androidx.constraintlayout.motion.utils.Easing.sDefault
            return r2
        L51:
            androidx.constraintlayout.motion.utils.Easing$CubicEasing r2 = new androidx.constraintlayout.motion.utils.Easing$CubicEasing
            java.lang.String r0 = "cubic(0.4, 0.0, 0.2, 1)"
            r2.<init>(r0)
            return r2
        L59:
            androidx.constraintlayout.motion.utils.Easing$CubicEasing r2 = new androidx.constraintlayout.motion.utils.Easing$CubicEasing
            java.lang.String r0 = "cubic(1, 1, 0, 0)"
            r2.<init>(r0)
            return r2
        L61:
            androidx.constraintlayout.motion.utils.Easing$CubicEasing r2 = new androidx.constraintlayout.motion.utils.Easing$CubicEasing
            java.lang.String r0 = "cubic(0.0, 0.0, 0.2, 0.95)"
            r2.<init>(r0)
            return r2
        L69:
            androidx.constraintlayout.motion.utils.Easing$CubicEasing r2 = new androidx.constraintlayout.motion.utils.Easing$CubicEasing
            java.lang.String r0 = "cubic(0.4, 0.05, 0.8, 0.7)"
            r2.<init>(r0)
            return r2
    }

    public double get(double r1) {
            r0 = this;
            return r1
    }

    public double getDiff(double r1) {
            r0 = this;
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.str
            return r0
    }
}
