package androidx.constraintlayout.solver.state;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class State {
    static final int CONSTRAINT_RATIO = 2;
    static final int CONSTRAINT_SPREAD = 0;
    static final int CONSTRAINT_WRAP = 1;
    public static final java.lang.Integer PARENT = null;
    static final int UNKNOWN = -1;
    protected java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.HelperReference> mHelperReferences;
    public final androidx.constraintlayout.solver.state.ConstraintReference mParent;
    protected java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> mReferences;
    private int numHelpers;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.solver.state.State$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$state$State$Helper = null;

        static {
                androidx.constraintlayout.solver.state.State$Helper[] r0 = androidx.constraintlayout.solver.state.State.Helper.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Helper = r0
                androidx.constraintlayout.solver.state.State$Helper r1 = androidx.constraintlayout.solver.state.State.Helper.HORIZONTAL_CHAIN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.solver.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Helper     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.solver.state.State$Helper r1 = androidx.constraintlayout.solver.state.State.Helper.VERTICAL_CHAIN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.solver.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Helper     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.solver.state.State$Helper r1 = androidx.constraintlayout.solver.state.State.Helper.ALIGN_HORIZONTALLY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.solver.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Helper     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.solver.state.State$Helper r1 = androidx.constraintlayout.solver.state.State.Helper.ALIGN_VERTICALLY     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.solver.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Helper     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.solver.state.State$Helper r1 = androidx.constraintlayout.solver.state.State.Helper.BARRIER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Chain extends java.lang.Enum<androidx.constraintlayout.solver.state.State.Chain> {
        private static final /* synthetic */ androidx.constraintlayout.solver.state.State.Chain[] $VALUES = null;
        public static final androidx.constraintlayout.solver.state.State.Chain PACKED = null;
        public static final androidx.constraintlayout.solver.state.State.Chain SPREAD = null;
        public static final androidx.constraintlayout.solver.state.State.Chain SPREAD_INSIDE = null;

        static {
                androidx.constraintlayout.solver.state.State$Chain r0 = new androidx.constraintlayout.solver.state.State$Chain
                java.lang.String r1 = "SPREAD"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.solver.state.State.Chain.SPREAD = r0
                androidx.constraintlayout.solver.state.State$Chain r1 = new androidx.constraintlayout.solver.state.State$Chain
                java.lang.String r3 = "SPREAD_INSIDE"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.solver.state.State.Chain.SPREAD_INSIDE = r1
                androidx.constraintlayout.solver.state.State$Chain r3 = new androidx.constraintlayout.solver.state.State$Chain
                java.lang.String r5 = "PACKED"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.solver.state.State.Chain.PACKED = r3
                r5 = 3
                androidx.constraintlayout.solver.state.State$Chain[] r5 = new androidx.constraintlayout.solver.state.State.Chain[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                androidx.constraintlayout.solver.state.State.Chain.$VALUES = r5
                return
        }

        Chain(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.solver.state.State.Chain valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.solver.state.State$Chain> r0 = androidx.constraintlayout.solver.state.State.Chain.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.solver.state.State$Chain r1 = (androidx.constraintlayout.solver.state.State.Chain) r1
                return r1
        }

        public static androidx.constraintlayout.solver.state.State.Chain[] values() {
                androidx.constraintlayout.solver.state.State$Chain[] r0 = androidx.constraintlayout.solver.state.State.Chain.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.solver.state.State$Chain[] r0 = (androidx.constraintlayout.solver.state.State.Chain[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Constraint extends java.lang.Enum<androidx.constraintlayout.solver.state.State.Constraint> {
        private static final /* synthetic */ androidx.constraintlayout.solver.state.State.Constraint[] $VALUES = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint BASELINE_TO_BASELINE = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint BOTTOM_TO_BOTTOM = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint BOTTOM_TO_TOP = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint CENTER_HORIZONTALLY = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint CENTER_VERTICALLY = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint END_TO_END = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint END_TO_START = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint LEFT_TO_LEFT = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint LEFT_TO_RIGHT = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint RIGHT_TO_LEFT = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint RIGHT_TO_RIGHT = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint START_TO_END = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint START_TO_START = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint TOP_TO_BOTTOM = null;
        public static final androidx.constraintlayout.solver.state.State.Constraint TOP_TO_TOP = null;

        static {
                androidx.constraintlayout.solver.state.State$Constraint r0 = new androidx.constraintlayout.solver.state.State$Constraint
                java.lang.String r1 = "LEFT_TO_LEFT"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_LEFT = r0
                androidx.constraintlayout.solver.state.State$Constraint r1 = new androidx.constraintlayout.solver.state.State$Constraint
                java.lang.String r3 = "LEFT_TO_RIGHT"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_RIGHT = r1
                androidx.constraintlayout.solver.state.State$Constraint r3 = new androidx.constraintlayout.solver.state.State$Constraint
                java.lang.String r5 = "RIGHT_TO_LEFT"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_LEFT = r3
                androidx.constraintlayout.solver.state.State$Constraint r5 = new androidx.constraintlayout.solver.state.State$Constraint
                java.lang.String r7 = "RIGHT_TO_RIGHT"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_RIGHT = r5
                androidx.constraintlayout.solver.state.State$Constraint r7 = new androidx.constraintlayout.solver.state.State$Constraint
                java.lang.String r9 = "START_TO_START"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.solver.state.State.Constraint.START_TO_START = r7
                androidx.constraintlayout.solver.state.State$Constraint r9 = new androidx.constraintlayout.solver.state.State$Constraint
                java.lang.String r11 = "START_TO_END"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.constraintlayout.solver.state.State.Constraint.START_TO_END = r9
                androidx.constraintlayout.solver.state.State$Constraint r11 = new androidx.constraintlayout.solver.state.State$Constraint
                java.lang.String r13 = "END_TO_START"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.constraintlayout.solver.state.State.Constraint.END_TO_START = r11
                androidx.constraintlayout.solver.state.State$Constraint r13 = new androidx.constraintlayout.solver.state.State$Constraint
                java.lang.String r15 = "END_TO_END"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                androidx.constraintlayout.solver.state.State.Constraint.END_TO_END = r13
                androidx.constraintlayout.solver.state.State$Constraint r15 = new androidx.constraintlayout.solver.state.State$Constraint
                r17 = 7
                java.lang.String r2 = "TOP_TO_TOP"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_TOP = r15
                androidx.constraintlayout.solver.state.State$Constraint r2 = new androidx.constraintlayout.solver.state.State$Constraint
                r19 = 8
                java.lang.String r4 = "TOP_TO_BOTTOM"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_BOTTOM = r2
                androidx.constraintlayout.solver.state.State$Constraint r4 = new androidx.constraintlayout.solver.state.State$Constraint
                r21 = 9
                java.lang.String r6 = "BOTTOM_TO_TOP"
                r22 = 3
                r8 = 10
                r4.<init>(r6, r8)
                androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_TOP = r4
                androidx.constraintlayout.solver.state.State$Constraint r6 = new androidx.constraintlayout.solver.state.State$Constraint
                r23 = 10
                java.lang.String r8 = "BOTTOM_TO_BOTTOM"
                r24 = 4
                r10 = 11
                r6.<init>(r8, r10)
                androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_BOTTOM = r6
                androidx.constraintlayout.solver.state.State$Constraint r8 = new androidx.constraintlayout.solver.state.State$Constraint
                r25 = 11
                java.lang.String r10 = "BASELINE_TO_BASELINE"
                r26 = 5
                r12 = 12
                r8.<init>(r10, r12)
                androidx.constraintlayout.solver.state.State.Constraint.BASELINE_TO_BASELINE = r8
                androidx.constraintlayout.solver.state.State$Constraint r10 = new androidx.constraintlayout.solver.state.State$Constraint
                r27 = 12
                java.lang.String r12 = "CENTER_HORIZONTALLY"
                r28 = 6
                r14 = 13
                r10.<init>(r12, r14)
                androidx.constraintlayout.solver.state.State.Constraint.CENTER_HORIZONTALLY = r10
                androidx.constraintlayout.solver.state.State$Constraint r12 = new androidx.constraintlayout.solver.state.State$Constraint
                r29 = 13
                java.lang.String r14 = "CENTER_VERTICALLY"
                r30 = r0
                r0 = 14
                r12.<init>(r14, r0)
                androidx.constraintlayout.solver.state.State.Constraint.CENTER_VERTICALLY = r12
                r14 = 15
                androidx.constraintlayout.solver.state.State$Constraint[] r14 = new androidx.constraintlayout.solver.state.State.Constraint[r14]
                r14[r16] = r30
                r14[r18] = r1
                r14[r20] = r3
                r14[r22] = r5
                r14[r24] = r7
                r14[r26] = r9
                r14[r28] = r11
                r14[r17] = r13
                r14[r19] = r15
                r14[r21] = r2
                r14[r23] = r4
                r14[r25] = r6
                r14[r27] = r8
                r14[r29] = r10
                r14[r0] = r12
                androidx.constraintlayout.solver.state.State.Constraint.$VALUES = r14
                return
        }

        Constraint(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.solver.state.State.Constraint valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.solver.state.State$Constraint> r0 = androidx.constraintlayout.solver.state.State.Constraint.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.solver.state.State$Constraint r1 = (androidx.constraintlayout.solver.state.State.Constraint) r1
                return r1
        }

        public static androidx.constraintlayout.solver.state.State.Constraint[] values() {
                androidx.constraintlayout.solver.state.State$Constraint[] r0 = androidx.constraintlayout.solver.state.State.Constraint.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.solver.state.State$Constraint[] r0 = (androidx.constraintlayout.solver.state.State.Constraint[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Direction extends java.lang.Enum<androidx.constraintlayout.solver.state.State.Direction> {
        private static final /* synthetic */ androidx.constraintlayout.solver.state.State.Direction[] $VALUES = null;
        public static final androidx.constraintlayout.solver.state.State.Direction BOTTOM = null;
        public static final androidx.constraintlayout.solver.state.State.Direction END = null;
        public static final androidx.constraintlayout.solver.state.State.Direction LEFT = null;
        public static final androidx.constraintlayout.solver.state.State.Direction RIGHT = null;
        public static final androidx.constraintlayout.solver.state.State.Direction START = null;
        public static final androidx.constraintlayout.solver.state.State.Direction TOP = null;

        static {
                androidx.constraintlayout.solver.state.State$Direction r0 = new androidx.constraintlayout.solver.state.State$Direction
                java.lang.String r1 = "LEFT"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.solver.state.State.Direction.LEFT = r0
                androidx.constraintlayout.solver.state.State$Direction r1 = new androidx.constraintlayout.solver.state.State$Direction
                java.lang.String r3 = "RIGHT"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.solver.state.State.Direction.RIGHT = r1
                androidx.constraintlayout.solver.state.State$Direction r3 = new androidx.constraintlayout.solver.state.State$Direction
                java.lang.String r5 = "START"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.solver.state.State.Direction.START = r3
                androidx.constraintlayout.solver.state.State$Direction r5 = new androidx.constraintlayout.solver.state.State$Direction
                java.lang.String r7 = "END"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.solver.state.State.Direction.END = r5
                androidx.constraintlayout.solver.state.State$Direction r7 = new androidx.constraintlayout.solver.state.State$Direction
                java.lang.String r9 = "TOP"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.solver.state.State.Direction.TOP = r7
                androidx.constraintlayout.solver.state.State$Direction r9 = new androidx.constraintlayout.solver.state.State$Direction
                java.lang.String r11 = "BOTTOM"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.constraintlayout.solver.state.State.Direction.BOTTOM = r9
                r11 = 6
                androidx.constraintlayout.solver.state.State$Direction[] r11 = new androidx.constraintlayout.solver.state.State.Direction[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                androidx.constraintlayout.solver.state.State.Direction.$VALUES = r11
                return
        }

        Direction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.solver.state.State.Direction valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.solver.state.State$Direction> r0 = androidx.constraintlayout.solver.state.State.Direction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.solver.state.State$Direction r1 = (androidx.constraintlayout.solver.state.State.Direction) r1
                return r1
        }

        public static androidx.constraintlayout.solver.state.State.Direction[] values() {
                androidx.constraintlayout.solver.state.State$Direction[] r0 = androidx.constraintlayout.solver.state.State.Direction.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.solver.state.State$Direction[] r0 = (androidx.constraintlayout.solver.state.State.Direction[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Helper extends java.lang.Enum<androidx.constraintlayout.solver.state.State.Helper> {
        private static final /* synthetic */ androidx.constraintlayout.solver.state.State.Helper[] $VALUES = null;
        public static final androidx.constraintlayout.solver.state.State.Helper ALIGN_HORIZONTALLY = null;
        public static final androidx.constraintlayout.solver.state.State.Helper ALIGN_VERTICALLY = null;
        public static final androidx.constraintlayout.solver.state.State.Helper BARRIER = null;
        public static final androidx.constraintlayout.solver.state.State.Helper FLOW = null;
        public static final androidx.constraintlayout.solver.state.State.Helper HORIZONTAL_CHAIN = null;
        public static final androidx.constraintlayout.solver.state.State.Helper LAYER = null;
        public static final androidx.constraintlayout.solver.state.State.Helper VERTICAL_CHAIN = null;

        static {
                androidx.constraintlayout.solver.state.State$Helper r0 = new androidx.constraintlayout.solver.state.State$Helper
                java.lang.String r1 = "HORIZONTAL_CHAIN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.solver.state.State.Helper.HORIZONTAL_CHAIN = r0
                androidx.constraintlayout.solver.state.State$Helper r1 = new androidx.constraintlayout.solver.state.State$Helper
                java.lang.String r3 = "VERTICAL_CHAIN"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.solver.state.State.Helper.VERTICAL_CHAIN = r1
                androidx.constraintlayout.solver.state.State$Helper r3 = new androidx.constraintlayout.solver.state.State$Helper
                java.lang.String r5 = "ALIGN_HORIZONTALLY"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.solver.state.State.Helper.ALIGN_HORIZONTALLY = r3
                androidx.constraintlayout.solver.state.State$Helper r5 = new androidx.constraintlayout.solver.state.State$Helper
                java.lang.String r7 = "ALIGN_VERTICALLY"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.solver.state.State.Helper.ALIGN_VERTICALLY = r5
                androidx.constraintlayout.solver.state.State$Helper r7 = new androidx.constraintlayout.solver.state.State$Helper
                java.lang.String r9 = "BARRIER"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.solver.state.State.Helper.BARRIER = r7
                androidx.constraintlayout.solver.state.State$Helper r9 = new androidx.constraintlayout.solver.state.State$Helper
                java.lang.String r11 = "LAYER"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.constraintlayout.solver.state.State.Helper.LAYER = r9
                androidx.constraintlayout.solver.state.State$Helper r11 = new androidx.constraintlayout.solver.state.State$Helper
                java.lang.String r13 = "FLOW"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.constraintlayout.solver.state.State.Helper.FLOW = r11
                r13 = 7
                androidx.constraintlayout.solver.state.State$Helper[] r13 = new androidx.constraintlayout.solver.state.State.Helper[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                androidx.constraintlayout.solver.state.State.Helper.$VALUES = r13
                return
        }

        Helper(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.solver.state.State.Helper valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.solver.state.State$Helper> r0 = androidx.constraintlayout.solver.state.State.Helper.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.solver.state.State$Helper r1 = (androidx.constraintlayout.solver.state.State.Helper) r1
                return r1
        }

        public static androidx.constraintlayout.solver.state.State.Helper[] values() {
                androidx.constraintlayout.solver.state.State$Helper[] r0 = androidx.constraintlayout.solver.state.State.Helper.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.solver.state.State$Helper[] r0 = (androidx.constraintlayout.solver.state.State.Helper[]) r0
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.constraintlayout.solver.state.State.PARENT = r0
            return
    }

    public State() {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mReferences = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mHelperReferences = r0
            androidx.constraintlayout.solver.state.ConstraintReference r0 = new androidx.constraintlayout.solver.state.ConstraintReference
            r0.<init>(r3)
            r3.mParent = r0
            r1 = 0
            r3.numHelpers = r1
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r1 = r3.mReferences
            java.lang.Integer r2 = androidx.constraintlayout.solver.state.State.PARENT
            r1.put(r2, r0)
            return
    }

    private java.lang.String createHelperKey() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "__HELPER_KEY_"
            r0.append(r1)
            int r1 = r3.numHelpers
            int r2 = r1 + 1
            r3.numHelpers = r2
            r0.append(r1)
            java.lang.String r1 = "__"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void apply(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5) {
            r4 = this;
            r5.removeAllChildren()
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r4.mParent
            androidx.constraintlayout.solver.state.Dimension r0 = r0.getWidth()
            r1 = 0
            r0.apply(r4, r5, r1)
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r4.mParent
            androidx.constraintlayout.solver.state.Dimension r0 = r0.getHeight()
            r1 = 1
            r0.apply(r4, r5, r1)
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.HelperReference> r0 = r4.mHelperReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.HelperReference> r2 = r4.mHelperReferences
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.solver.state.HelperReference r2 = (androidx.constraintlayout.solver.state.HelperReference) r2
            androidx.constraintlayout.solver.widgets.HelperWidget r2 = r2.getHelperWidget()
            if (r2 == 0) goto L21
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r3 = r4.mReferences
            java.lang.Object r3 = r3.get(r1)
            androidx.constraintlayout.solver.state.Reference r3 = (androidx.constraintlayout.solver.state.Reference) r3
            if (r3 != 0) goto L47
            androidx.constraintlayout.solver.state.ConstraintReference r3 = r4.constraints(r1)
        L47:
            r3.setConstraintWidget(r2)
            goto L21
        L4b:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r0 = r4.mReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L55:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r2 = r4.mReferences
            java.lang.Object r1 = r2.get(r1)
            androidx.constraintlayout.solver.state.Reference r1 = (androidx.constraintlayout.solver.state.Reference) r1
            androidx.constraintlayout.solver.state.ConstraintReference r2 = r4.mParent
            if (r1 == r2) goto L7e
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r1.getConstraintWidget()
            r3 = 0
            r2.setParent(r3)
            boolean r3 = r1 instanceof androidx.constraintlayout.solver.state.helpers.GuidelineReference
            if (r3 == 0) goto L7a
            r1.apply()
        L7a:
            r5.add(r2)
            goto L55
        L7e:
            r1.setConstraintWidget(r5)
            goto L55
        L82:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.HelperReference> r5 = r4.mHelperReferences
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L8c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lcc
            java.lang.Object r0 = r5.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.HelperReference> r1 = r4.mHelperReferences
            java.lang.Object r0 = r1.get(r0)
            androidx.constraintlayout.solver.state.HelperReference r0 = (androidx.constraintlayout.solver.state.HelperReference) r0
            androidx.constraintlayout.solver.widgets.HelperWidget r1 = r0.getHelperWidget()
            if (r1 == 0) goto L8c
            java.util.ArrayList<java.lang.Object> r1 = r0.mReferences
            java.util.Iterator r1 = r1.iterator()
        Laa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc8
            java.lang.Object r2 = r1.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r3 = r4.mReferences
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.solver.state.Reference r2 = (androidx.constraintlayout.solver.state.Reference) r2
            androidx.constraintlayout.solver.widgets.HelperWidget r3 = r0.getHelperWidget()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.getConstraintWidget()
            r3.add(r2)
            goto Laa
        Lc8:
            r0.apply()
            goto L8c
        Lcc:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r5 = r4.mReferences
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        Ld6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lec
            java.lang.Object r0 = r5.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r1 = r4.mReferences
            java.lang.Object r0 = r1.get(r0)
            androidx.constraintlayout.solver.state.Reference r0 = (androidx.constraintlayout.solver.state.Reference) r0
            r0.apply()
            goto Ld6
        Lec:
            return
    }

    public androidx.constraintlayout.solver.state.helpers.BarrierReference barrier(java.lang.Object r2, androidx.constraintlayout.solver.state.State.Direction r3) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Helper r0 = androidx.constraintlayout.solver.state.State.Helper.BARRIER
            androidx.constraintlayout.solver.state.HelperReference r2 = r1.helper(r2, r0)
            androidx.constraintlayout.solver.state.helpers.BarrierReference r2 = (androidx.constraintlayout.solver.state.helpers.BarrierReference) r2
            r2.setBarrierDirection(r3)
            return r2
    }

    public androidx.constraintlayout.solver.state.helpers.AlignHorizontallyReference centerHorizontally(java.lang.Object... r3) {
            r2 = this;
            r0 = 0
            androidx.constraintlayout.solver.state.State$Helper r1 = androidx.constraintlayout.solver.state.State.Helper.ALIGN_HORIZONTALLY
            androidx.constraintlayout.solver.state.HelperReference r0 = r2.helper(r0, r1)
            androidx.constraintlayout.solver.state.helpers.AlignHorizontallyReference r0 = (androidx.constraintlayout.solver.state.helpers.AlignHorizontallyReference) r0
            r0.add(r3)
            return r0
    }

    public androidx.constraintlayout.solver.state.helpers.AlignVerticallyReference centerVertically(java.lang.Object... r3) {
            r2 = this;
            r0 = 0
            androidx.constraintlayout.solver.state.State$Helper r1 = androidx.constraintlayout.solver.state.State.Helper.ALIGN_VERTICALLY
            androidx.constraintlayout.solver.state.HelperReference r0 = r2.helper(r0, r1)
            androidx.constraintlayout.solver.state.helpers.AlignVerticallyReference r0 = (androidx.constraintlayout.solver.state.helpers.AlignVerticallyReference) r0
            r0.add(r3)
            return r0
    }

    public androidx.constraintlayout.solver.state.ConstraintReference constraints(java.lang.Object r3) {
            r2 = this;
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r0 = r2.mReferences
            java.lang.Object r0 = r0.get(r3)
            androidx.constraintlayout.solver.state.Reference r0 = (androidx.constraintlayout.solver.state.Reference) r0
            if (r0 != 0) goto L16
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r2.createConstraintReference(r3)
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r1 = r2.mReferences
            r1.put(r3, r0)
            r0.setKey(r3)
        L16:
            boolean r3 = r0 instanceof androidx.constraintlayout.solver.state.ConstraintReference
            if (r3 == 0) goto L1d
            androidx.constraintlayout.solver.state.ConstraintReference r0 = (androidx.constraintlayout.solver.state.ConstraintReference) r0
            return r0
        L1d:
            r3 = 0
            return r3
    }

    public int convertDimension(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto Lb
            java.lang.Float r2 = (java.lang.Float) r2
            int r2 = r2.intValue()
            return r2
        Lb:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L16
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
        L16:
            r2 = 0
            return r2
    }

    public androidx.constraintlayout.solver.state.ConstraintReference createConstraintReference(java.lang.Object r1) {
            r0 = this;
            androidx.constraintlayout.solver.state.ConstraintReference r1 = new androidx.constraintlayout.solver.state.ConstraintReference
            r1.<init>(r0)
            return r1
    }

    public void directMapping() {
            r3 = this;
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r0 = r3.mReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.state.ConstraintReference r2 = r3.constraints(r1)
            r2.setView(r1)
            goto La
        L1c:
            return
    }

    public androidx.constraintlayout.solver.state.helpers.GuidelineReference guideline(java.lang.Object r2, int r3) {
            r1 = this;
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r0 = r1.mReferences
            java.lang.Object r0 = r0.get(r2)
            androidx.constraintlayout.solver.state.Reference r0 = (androidx.constraintlayout.solver.state.Reference) r0
            if (r0 != 0) goto L1a
            androidx.constraintlayout.solver.state.helpers.GuidelineReference r0 = new androidx.constraintlayout.solver.state.helpers.GuidelineReference
            r0.<init>(r1)
            r0.setOrientation(r3)
            r0.setKey(r2)
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r3 = r1.mReferences
            r3.put(r2, r0)
        L1a:
            androidx.constraintlayout.solver.state.helpers.GuidelineReference r0 = (androidx.constraintlayout.solver.state.helpers.GuidelineReference) r0
            return r0
    }

    public androidx.constraintlayout.solver.state.State height(androidx.constraintlayout.solver.state.Dimension r1) {
            r0 = this;
            androidx.constraintlayout.solver.state.State r1 = r0.setHeight(r1)
            return r1
    }

    public androidx.constraintlayout.solver.state.HelperReference helper(java.lang.Object r3, androidx.constraintlayout.solver.state.State.Helper r4) {
            r2 = this;
            if (r3 != 0) goto L6
            java.lang.String r3 = r2.createHelperKey()
        L6:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.HelperReference> r0 = r2.mHelperReferences
            java.lang.Object r0 = r0.get(r3)
            androidx.constraintlayout.solver.state.HelperReference r0 = (androidx.constraintlayout.solver.state.HelperReference) r0
            if (r0 != 0) goto L4f
            int[] r0 = androidx.constraintlayout.solver.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Helper
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L45
            r1 = 2
            if (r0 == r1) goto L3f
            r1 = 3
            if (r0 == r1) goto L39
            r1 = 4
            if (r0 == r1) goto L33
            r1 = 5
            if (r0 == r1) goto L2d
            androidx.constraintlayout.solver.state.HelperReference r0 = new androidx.constraintlayout.solver.state.HelperReference
            r0.<init>(r2, r4)
            goto L4a
        L2d:
            androidx.constraintlayout.solver.state.helpers.BarrierReference r0 = new androidx.constraintlayout.solver.state.helpers.BarrierReference
            r0.<init>(r2)
            goto L4a
        L33:
            androidx.constraintlayout.solver.state.helpers.AlignVerticallyReference r0 = new androidx.constraintlayout.solver.state.helpers.AlignVerticallyReference
            r0.<init>(r2)
            goto L4a
        L39:
            androidx.constraintlayout.solver.state.helpers.AlignHorizontallyReference r0 = new androidx.constraintlayout.solver.state.helpers.AlignHorizontallyReference
            r0.<init>(r2)
            goto L4a
        L3f:
            androidx.constraintlayout.solver.state.helpers.VerticalChainReference r0 = new androidx.constraintlayout.solver.state.helpers.VerticalChainReference
            r0.<init>(r2)
            goto L4a
        L45:
            androidx.constraintlayout.solver.state.helpers.HorizontalChainReference r0 = new androidx.constraintlayout.solver.state.helpers.HorizontalChainReference
            r0.<init>(r2)
        L4a:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.HelperReference> r4 = r2.mHelperReferences
            r4.put(r3, r0)
        L4f:
            return r0
    }

    public androidx.constraintlayout.solver.state.helpers.HorizontalChainReference horizontalChain(java.lang.Object... r3) {
            r2 = this;
            r0 = 0
            androidx.constraintlayout.solver.state.State$Helper r1 = androidx.constraintlayout.solver.state.State.Helper.HORIZONTAL_CHAIN
            androidx.constraintlayout.solver.state.HelperReference r0 = r2.helper(r0, r1)
            androidx.constraintlayout.solver.state.helpers.HorizontalChainReference r0 = (androidx.constraintlayout.solver.state.helpers.HorizontalChainReference) r0
            r0.add(r3)
            return r0
    }

    public androidx.constraintlayout.solver.state.helpers.GuidelineReference horizontalGuideline(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            androidx.constraintlayout.solver.state.helpers.GuidelineReference r2 = r1.guideline(r2, r0)
            return r2
    }

    public void map(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            androidx.constraintlayout.solver.state.ConstraintReference r1 = r0.constraints(r1)
            r1.setView(r2)
            return
    }

    androidx.constraintlayout.solver.state.Reference reference(java.lang.Object r2) {
            r1 = this;
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.Reference> r0 = r1.mReferences
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.solver.state.Reference r2 = (androidx.constraintlayout.solver.state.Reference) r2
            return r2
    }

    public void reset() {
            r1 = this;
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.solver.state.HelperReference> r0 = r1.mHelperReferences
            r0.clear()
            return
    }

    public androidx.constraintlayout.solver.state.State setHeight(androidx.constraintlayout.solver.state.Dimension r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r1.mParent
            r0.setHeight(r2)
            return r1
    }

    public androidx.constraintlayout.solver.state.State setWidth(androidx.constraintlayout.solver.state.Dimension r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r1.mParent
            r0.setWidth(r2)
            return r1
    }

    public androidx.constraintlayout.solver.state.helpers.VerticalChainReference verticalChain(java.lang.Object... r3) {
            r2 = this;
            r0 = 0
            androidx.constraintlayout.solver.state.State$Helper r1 = androidx.constraintlayout.solver.state.State.Helper.VERTICAL_CHAIN
            androidx.constraintlayout.solver.state.HelperReference r0 = r2.helper(r0, r1)
            androidx.constraintlayout.solver.state.helpers.VerticalChainReference r0 = (androidx.constraintlayout.solver.state.helpers.VerticalChainReference) r0
            r0.add(r3)
            return r0
    }

    public androidx.constraintlayout.solver.state.helpers.GuidelineReference verticalGuideline(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            androidx.constraintlayout.solver.state.helpers.GuidelineReference r2 = r1.guideline(r2, r0)
            return r2
    }

    public androidx.constraintlayout.solver.state.State width(androidx.constraintlayout.solver.state.Dimension r1) {
            r0 = this;
            androidx.constraintlayout.solver.state.State r1 = r0.setWidth(r1)
            return r1
    }
}
