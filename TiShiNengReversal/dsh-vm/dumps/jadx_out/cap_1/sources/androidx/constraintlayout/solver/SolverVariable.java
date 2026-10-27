package androidx.constraintlayout.solver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SolverVariable {
    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    int definitionId;
    float[] goalStrengthVector;
    public int id;
    public boolean inGoal;
    java.util.HashSet<androidx.constraintlayout.solver.ArrayRow> inRows;
    public boolean isFinalValue;
    androidx.constraintlayout.solver.ArrayRow[] mClientEquations;
    int mClientEquationsCount;
    private java.lang.String mName;
    androidx.constraintlayout.solver.SolverVariable.Type mType;
    public int strength;
    float[] strengthVector;
    public int usageInRowCount;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.solver.SolverVariable$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type = null;

        static {
                androidx.constraintlayout.solver.SolverVariable$Type[] r0 = androidx.constraintlayout.solver.SolverVariable.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type = r0
                androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.solver.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.CONSTANT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.solver.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.SLACK     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.solver.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.ERROR     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.solver.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.UNKNOWN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Type extends java.lang.Enum<androidx.constraintlayout.solver.SolverVariable.Type> {
        private static final /* synthetic */ androidx.constraintlayout.solver.SolverVariable.Type[] $VALUES = null;
        public static final androidx.constraintlayout.solver.SolverVariable.Type CONSTANT = null;
        public static final androidx.constraintlayout.solver.SolverVariable.Type ERROR = null;
        public static final androidx.constraintlayout.solver.SolverVariable.Type SLACK = null;
        public static final androidx.constraintlayout.solver.SolverVariable.Type UNKNOWN = null;
        public static final androidx.constraintlayout.solver.SolverVariable.Type UNRESTRICTED = null;

        static {
                androidx.constraintlayout.solver.SolverVariable$Type r0 = new androidx.constraintlayout.solver.SolverVariable$Type
                java.lang.String r1 = "UNRESTRICTED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED = r0
                androidx.constraintlayout.solver.SolverVariable$Type r1 = new androidx.constraintlayout.solver.SolverVariable$Type
                java.lang.String r3 = "CONSTANT"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.solver.SolverVariable.Type.CONSTANT = r1
                androidx.constraintlayout.solver.SolverVariable$Type r3 = new androidx.constraintlayout.solver.SolverVariable$Type
                java.lang.String r5 = "SLACK"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.solver.SolverVariable.Type.SLACK = r3
                androidx.constraintlayout.solver.SolverVariable$Type r5 = new androidx.constraintlayout.solver.SolverVariable$Type
                java.lang.String r7 = "ERROR"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.solver.SolverVariable.Type.ERROR = r5
                androidx.constraintlayout.solver.SolverVariable$Type r7 = new androidx.constraintlayout.solver.SolverVariable$Type
                java.lang.String r9 = "UNKNOWN"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.solver.SolverVariable.Type.UNKNOWN = r7
                r9 = 5
                androidx.constraintlayout.solver.SolverVariable$Type[] r9 = new androidx.constraintlayout.solver.SolverVariable.Type[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                androidx.constraintlayout.solver.SolverVariable.Type.$VALUES = r9
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.solver.SolverVariable.Type valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.solver.SolverVariable$Type> r0 = androidx.constraintlayout.solver.SolverVariable.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.solver.SolverVariable$Type r1 = (androidx.constraintlayout.solver.SolverVariable.Type) r1
                return r1
        }

        public static androidx.constraintlayout.solver.SolverVariable.Type[] values() {
                androidx.constraintlayout.solver.SolverVariable$Type[] r0 = androidx.constraintlayout.solver.SolverVariable.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.solver.SolverVariable$Type[] r0 = (androidx.constraintlayout.solver.SolverVariable.Type[]) r0
                return r0
        }
    }

    static {
            return
    }

    public SolverVariable(androidx.constraintlayout.solver.SolverVariable.Type r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r4 = -1
            r2.id = r4
            r2.definitionId = r4
            r4 = 0
            r2.strength = r4
            r2.isFinalValue = r4
            r0 = 9
            float[] r1 = new float[r0]
            r2.strengthVector = r1
            float[] r0 = new float[r0]
            r2.goalStrengthVector = r0
            r0 = 16
            androidx.constraintlayout.solver.ArrayRow[] r0 = new androidx.constraintlayout.solver.ArrayRow[r0]
            r2.mClientEquations = r0
            r2.mClientEquationsCount = r4
            r2.usageInRowCount = r4
            r4 = 0
            r2.inRows = r4
            r2.mType = r3
            return
    }

    public SolverVariable(java.lang.String r4, androidx.constraintlayout.solver.SolverVariable.Type r5) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.id = r0
            r3.definitionId = r0
            r0 = 0
            r3.strength = r0
            r3.isFinalValue = r0
            r1 = 9
            float[] r2 = new float[r1]
            r3.strengthVector = r2
            float[] r1 = new float[r1]
            r3.goalStrengthVector = r1
            r1 = 16
            androidx.constraintlayout.solver.ArrayRow[] r1 = new androidx.constraintlayout.solver.ArrayRow[r1]
            r3.mClientEquations = r1
            r3.mClientEquationsCount = r0
            r3.usageInRowCount = r0
            r0 = 0
            r3.inRows = r0
            r3.mName = r4
            r3.mType = r5
            return
    }

    private static java.lang.String getUniqueName(androidx.constraintlayout.solver.SolverVariable.Type r2, java.lang.String r3) {
            if (r3 == 0) goto L14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            int r3 = androidx.constraintlayout.solver.SolverVariable.uniqueErrorId
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L14:
            int[] r3 = androidx.constraintlayout.solver.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type
            int r0 = r2.ordinal()
            r3 = r3[r0]
            r0 = 1
            if (r3 == r0) goto L91
            r1 = 2
            if (r3 == r1) goto L7a
            r1 = 3
            if (r3 == r1) goto L63
            r1 = 4
            if (r3 == r1) goto L4c
            r1 = 5
            if (r3 != r1) goto L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "V"
            r2.append(r3)
            int r3 = androidx.constraintlayout.solver.SolverVariable.uniqueId
            int r3 = r3 + r0
            androidx.constraintlayout.solver.SolverVariable.uniqueId = r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L42:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r2 = r2.name()
            r3.<init>(r2)
            throw r3
        L4c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "e"
            r2.append(r3)
            int r3 = androidx.constraintlayout.solver.SolverVariable.uniqueErrorId
            int r3 = r3 + r0
            androidx.constraintlayout.solver.SolverVariable.uniqueErrorId = r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L63:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "S"
            r2.append(r3)
            int r3 = androidx.constraintlayout.solver.SolverVariable.uniqueSlackId
            int r3 = r3 + r0
            androidx.constraintlayout.solver.SolverVariable.uniqueSlackId = r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L7a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "C"
            r2.append(r3)
            int r3 = androidx.constraintlayout.solver.SolverVariable.uniqueConstantId
            int r3 = r3 + r0
            androidx.constraintlayout.solver.SolverVariable.uniqueConstantId = r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L91:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "U"
            r2.append(r3)
            int r3 = androidx.constraintlayout.solver.SolverVariable.uniqueUnrestrictedId
            int r3 = r3 + r0
            androidx.constraintlayout.solver.SolverVariable.uniqueUnrestrictedId = r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    static void increaseErrorId() {
            int r0 = androidx.constraintlayout.solver.SolverVariable.uniqueErrorId
            int r0 = r0 + 1
            androidx.constraintlayout.solver.SolverVariable.uniqueErrorId = r0
            return
    }

    public final void addToRow(androidx.constraintlayout.solver.ArrayRow r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.mClientEquationsCount
            if (r0 >= r1) goto Lf
            androidx.constraintlayout.solver.ArrayRow[] r1 = r3.mClientEquations
            r1 = r1[r0]
            if (r1 != r4) goto Lc
            return
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            androidx.constraintlayout.solver.ArrayRow[] r0 = r3.mClientEquations
            int r2 = r0.length
            if (r1 < r2) goto L1f
            int r1 = r0.length
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            androidx.constraintlayout.solver.ArrayRow[] r0 = (androidx.constraintlayout.solver.ArrayRow[]) r0
            r3.mClientEquations = r0
        L1f:
            androidx.constraintlayout.solver.ArrayRow[] r0 = r3.mClientEquations
            int r1 = r3.mClientEquationsCount
            r0[r1] = r4
            int r1 = r1 + 1
            r3.mClientEquationsCount = r1
            return
    }

    void clearStrengths() {
            r3 = this;
            r0 = 0
        L1:
            r1 = 9
            if (r0 >= r1) goto Ld
            float[] r1 = r3.strengthVector
            r2 = 0
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1
        Ld:
            return
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public final void removeFromRow(androidx.constraintlayout.solver.ArrayRow r5) {
            r4 = this;
            int r0 = r4.mClientEquationsCount
            r1 = 0
        L3:
            if (r1 >= r0) goto L23
            androidx.constraintlayout.solver.ArrayRow[] r2 = r4.mClientEquations
            r2 = r2[r1]
            if (r2 != r5) goto L20
        Lb:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L19
            androidx.constraintlayout.solver.ArrayRow[] r5 = r4.mClientEquations
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto Lb
        L19:
            int r5 = r4.mClientEquationsCount
            int r5 = r5 + (-1)
            r4.mClientEquationsCount = r5
            return
        L20:
            int r1 = r1 + 1
            goto L3
        L23:
            return
    }

    public void reset() {
            r6 = this;
            r0 = 0
            r6.mName = r0
            androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.UNKNOWN
            r6.mType = r1
            r1 = 0
            r6.strength = r1
            r2 = -1
            r6.id = r2
            r6.definitionId = r2
            r2 = 0
            r6.computedValue = r2
            r6.isFinalValue = r1
            int r3 = r6.mClientEquationsCount
            r4 = 0
        L17:
            if (r4 >= r3) goto L20
            androidx.constraintlayout.solver.ArrayRow[] r5 = r6.mClientEquations
            r5[r4] = r0
            int r4 = r4 + 1
            goto L17
        L20:
            r6.mClientEquationsCount = r1
            r6.usageInRowCount = r1
            r6.inGoal = r1
            float[] r0 = r6.goalStrengthVector
            java.util.Arrays.fill(r0, r2)
            return
    }

    public void setFinalValue(androidx.constraintlayout.solver.LinearSystem r4, float r5) {
            r3 = this;
            r3.computedValue = r5
            r5 = 1
            r3.isFinalValue = r5
            int r5 = r3.mClientEquationsCount
            r0 = 0
            r1 = 0
        L9:
            if (r1 >= r5) goto L15
            androidx.constraintlayout.solver.ArrayRow[] r2 = r3.mClientEquations
            r2 = r2[r1]
            r2.updateFromFinalVariable(r4, r3, r0)
            int r1 = r1 + 1
            goto L9
        L15:
            r3.mClientEquationsCount = r0
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.mName = r1
            return
    }

    public void setType(androidx.constraintlayout.solver.SolverVariable.Type r1, java.lang.String r2) {
            r0 = this;
            r0.mType = r1
            return
    }

    java.lang.String strengthsToString() {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
        L16:
            float[] r6 = r10.strengthVector
            int r6 = r6.length
            if (r3 >= r6) goto L6d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            float[] r0 = r10.strengthVector
            r0 = r0[r3]
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            float[] r6 = r10.strengthVector
            r7 = r6[r3]
            r8 = 0
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 <= 0) goto L39
            r4 = 0
            goto L3e
        L39:
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 >= 0) goto L3e
            r4 = 1
        L3e:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L43
            r5 = 0
        L43:
            int r6 = r6.length
            int r6 = r6 - r2
            if (r3 >= r6) goto L59
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            goto L6a
        L59:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r0 = "] "
            r6.append(r0)
            java.lang.String r0 = r6.toString()
        L6a:
            int r3 = r3 + 1
            goto L16
        L6d:
            if (r4 == 0) goto L80
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " (-)"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L80:
            if (r5 == 0) goto L93
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " (*)"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L93:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.mName
            java.lang.String r1 = ""
            if (r0 == 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = r2.mName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            int r1 = r2.id
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void updateReferencesWithNewDefinition(androidx.constraintlayout.solver.ArrayRow r5) {
            r4 = this;
            int r0 = r4.mClientEquationsCount
            r1 = 0
            r2 = 0
        L4:
            if (r2 >= r0) goto L10
            androidx.constraintlayout.solver.ArrayRow[] r3 = r4.mClientEquations
            r3 = r3[r2]
            r3.updateFromRow(r5, r1)
            int r2 = r2 + 1
            goto L4
        L10:
            r4.mClientEquationsCount = r1
            return
    }
}
