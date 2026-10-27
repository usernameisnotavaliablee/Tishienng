package androidx.constraintlayout.solver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = true;
    private static int POOL_SIZE = 1000;
    static final boolean SIMPLIFY_SYNONYMS = false;
    private static final boolean USE_SYNONYMS = true;
    public static androidx.constraintlayout.solver.Metrics sMetrics;
    private int TABLE_SIZE;
    public boolean graphOptimizer;
    private boolean[] mAlreadyTestedCandidates;
    final androidx.constraintlayout.solver.Cache mCache;
    private androidx.constraintlayout.solver.LinearSystem.Row mGoal;
    private int mMaxColumns;
    private int mMaxRows;
    int mNumColumns;
    int mNumRows;
    private androidx.constraintlayout.solver.SolverVariable[] mPoolVariables;
    private int mPoolVariablesCount;
    androidx.constraintlayout.solver.ArrayRow[] mRows;
    private androidx.constraintlayout.solver.LinearSystem.Row mTempGoal;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.solver.SolverVariable> mVariables;
    int mVariablesID;
    public boolean newgraphOptimizer;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Row {
        void addError(androidx.constraintlayout.solver.SolverVariable r1);

        void clear();

        androidx.constraintlayout.solver.SolverVariable getKey();

        androidx.constraintlayout.solver.SolverVariable getPivotCandidate(androidx.constraintlayout.solver.LinearSystem r1, boolean[] r2);

        void initFromRow(androidx.constraintlayout.solver.LinearSystem.Row r1);

        boolean isEmpty();

        void updateFromFinalVariable(androidx.constraintlayout.solver.LinearSystem r1, androidx.constraintlayout.solver.SolverVariable r2, boolean r3);

        void updateFromRow(androidx.constraintlayout.solver.ArrayRow r1, boolean r2);

        void updateFromSystem(androidx.constraintlayout.solver.LinearSystem r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class ValuesRow extends androidx.constraintlayout.solver.ArrayRow {
        final /* synthetic */ androidx.constraintlayout.solver.LinearSystem this$0;

        public ValuesRow(androidx.constraintlayout.solver.LinearSystem r1, androidx.constraintlayout.solver.Cache r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                androidx.constraintlayout.solver.SolverVariableValues r1 = new androidx.constraintlayout.solver.SolverVariableValues
                r1.<init>(r0, r2)
                r0.variables = r1
                return
        }
    }

    static {
            return
    }

    public LinearSystem() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mVariablesID = r0
            r1 = 0
            r3.mVariables = r1
            r2 = 32
            r3.TABLE_SIZE = r2
            r3.mMaxColumns = r2
            r3.mRows = r1
            r3.graphOptimizer = r0
            r3.newgraphOptimizer = r0
            boolean[] r1 = new boolean[r2]
            r3.mAlreadyTestedCandidates = r1
            r1 = 1
            r3.mNumColumns = r1
            r3.mNumRows = r0
            r3.mMaxRows = r2
            int r1 = androidx.constraintlayout.solver.LinearSystem.POOL_SIZE
            androidx.constraintlayout.solver.SolverVariable[] r1 = new androidx.constraintlayout.solver.SolverVariable[r1]
            r3.mPoolVariables = r1
            r3.mPoolVariablesCount = r0
            androidx.constraintlayout.solver.ArrayRow[] r0 = new androidx.constraintlayout.solver.ArrayRow[r2]
            r3.mRows = r0
            r3.releaseRows()
            androidx.constraintlayout.solver.Cache r0 = new androidx.constraintlayout.solver.Cache
            r0.<init>()
            r3.mCache = r0
            androidx.constraintlayout.solver.PriorityGoalRow r1 = new androidx.constraintlayout.solver.PriorityGoalRow
            r1.<init>(r0)
            r3.mGoal = r1
            boolean r1 = androidx.constraintlayout.solver.LinearSystem.OPTIMIZED_ENGINE
            if (r1 == 0) goto L49
            androidx.constraintlayout.solver.LinearSystem$ValuesRow r1 = new androidx.constraintlayout.solver.LinearSystem$ValuesRow
            r1.<init>(r3, r0)
            r3.mTempGoal = r1
            return
        L49:
            androidx.constraintlayout.solver.ArrayRow r1 = new androidx.constraintlayout.solver.ArrayRow
            r1.<init>(r0)
            r3.mTempGoal = r1
            return
    }

    private androidx.constraintlayout.solver.SolverVariable acquireSolverVariable(androidx.constraintlayout.solver.SolverVariable.Type r3, java.lang.String r4) {
            r2 = this;
            androidx.constraintlayout.solver.Cache r0 = r2.mCache
            androidx.constraintlayout.solver.Pools$Pool<androidx.constraintlayout.solver.SolverVariable> r0 = r0.solverVariablePool
            java.lang.Object r0 = r0.acquire()
            androidx.constraintlayout.solver.SolverVariable r0 = (androidx.constraintlayout.solver.SolverVariable) r0
            if (r0 != 0) goto L15
            androidx.constraintlayout.solver.SolverVariable r0 = new androidx.constraintlayout.solver.SolverVariable
            r0.<init>(r3, r4)
            r0.setType(r3, r4)
            goto L1b
        L15:
            r0.reset()
            r0.setType(r3, r4)
        L1b:
            int r3 = r2.mPoolVariablesCount
            int r4 = androidx.constraintlayout.solver.LinearSystem.POOL_SIZE
            if (r3 < r4) goto L2f
            int r4 = r4 * 2
            androidx.constraintlayout.solver.LinearSystem.POOL_SIZE = r4
            androidx.constraintlayout.solver.SolverVariable[] r3 = r2.mPoolVariables
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            androidx.constraintlayout.solver.SolverVariable[] r3 = (androidx.constraintlayout.solver.SolverVariable[]) r3
            r2.mPoolVariables = r3
        L2f:
            androidx.constraintlayout.solver.SolverVariable[] r3 = r2.mPoolVariables
            int r4 = r2.mPoolVariablesCount
            int r1 = r4 + 1
            r2.mPoolVariablesCount = r1
            r3[r4] = r0
            return r0
    }

    private void addError(androidx.constraintlayout.solver.ArrayRow r2) {
            r1 = this;
            r0 = 0
            r2.addError(r1, r0)
            return
    }

    private final void addRow(androidx.constraintlayout.solver.ArrayRow r3) {
            r2 = this;
            boolean r0 = androidx.constraintlayout.solver.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L14
            androidx.constraintlayout.solver.ArrayRow[] r0 = r2.mRows
            int r1 = r2.mNumRows
            r0 = r0[r1]
            if (r0 == 0) goto L23
            androidx.constraintlayout.solver.Cache r1 = r2.mCache
            androidx.constraintlayout.solver.Pools$Pool<androidx.constraintlayout.solver.ArrayRow> r1 = r1.optimizedArrayRowPool
            r1.release(r0)
            goto L23
        L14:
            androidx.constraintlayout.solver.ArrayRow[] r0 = r2.mRows
            int r1 = r2.mNumRows
            r0 = r0[r1]
            if (r0 == 0) goto L23
            androidx.constraintlayout.solver.Cache r1 = r2.mCache
            androidx.constraintlayout.solver.Pools$Pool<androidx.constraintlayout.solver.ArrayRow> r1 = r1.arrayRowPool
            r1.release(r0)
        L23:
            androidx.constraintlayout.solver.ArrayRow[] r0 = r2.mRows
            int r1 = r2.mNumRows
            r0[r1] = r3
            androidx.constraintlayout.solver.SolverVariable r0 = r3.variable
            r0.definitionId = r1
            int r1 = r1 + 1
            r2.mNumRows = r1
            r0.updateReferencesWithNewDefinition(r3)
            return
    }

    private void addSingleError(androidx.constraintlayout.solver.ArrayRow r2, int r3) {
            r1 = this;
            r0 = 0
            r1.addSingleError(r2, r3, r0)
            return
    }

    private void computeValues() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.mNumRows
            if (r0 >= r1) goto L12
            androidx.constraintlayout.solver.ArrayRow[] r1 = r3.mRows
            r1 = r1[r0]
            androidx.constraintlayout.solver.SolverVariable r2 = r1.variable
            float r1 = r1.constantValue
            r2.computedValue = r1
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    public static androidx.constraintlayout.solver.ArrayRow createRowDimensionPercent(androidx.constraintlayout.solver.LinearSystem r0, androidx.constraintlayout.solver.SolverVariable r1, androidx.constraintlayout.solver.SolverVariable r2, float r3) {
            androidx.constraintlayout.solver.ArrayRow r0 = r0.createRow()
            androidx.constraintlayout.solver.ArrayRow r0 = r0.createRowDimensionPercent(r1, r2, r3)
            return r0
    }

    private androidx.constraintlayout.solver.SolverVariable createVariable(java.lang.String r6, androidx.constraintlayout.solver.SolverVariable.Type r7) {
            r5 = this;
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.variables
            r3 = 1
            long r1 = r1 + r3
            r0.variables = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            r0 = 0
            androidx.constraintlayout.solver.SolverVariable r7 = r5.acquireSolverVariable(r7, r0)
            r7.setName(r6)
            int r0 = r5.mVariablesID
            int r0 = r0 + 1
            r5.mVariablesID = r0
            int r1 = r5.mNumColumns
            int r1 = r1 + 1
            r5.mNumColumns = r1
            r7.id = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.solver.SolverVariable> r0 = r5.mVariables
            if (r0 != 0) goto L37
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.mVariables = r0
        L37:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.solver.SolverVariable> r0 = r5.mVariables
            r0.put(r6, r7)
            androidx.constraintlayout.solver.Cache r6 = r5.mCache
            androidx.constraintlayout.solver.SolverVariable[] r6 = r6.mIndexedVariables
            int r0 = r5.mVariablesID
            r6[r0] = r7
            return r7
    }

    private void displayRows() {
            r3 = this;
            r3.displaySolverVariables()
            java.lang.String r0 = ""
            r1 = 0
        L6:
            int r2 = r3.mNumRows
            if (r1 >= r2) goto L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            androidx.constraintlayout.solver.ArrayRow[] r0 = r3.mRows
            r0 = r0[r1]
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L6
        L31:
            androidx.constraintlayout.solver.LinearSystem$Row r0 = r3.mGoal
            java.util.Objects.toString(r0)
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    private void displaySolverVariables() {
            r1 = this;
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    private int enforceBFS(androidx.constraintlayout.solver.LinearSystem.Row r20) throws java.lang.Exception {
            r19 = this;
            r0 = r19
            r2 = 0
        L3:
            int r3 = r0.mNumRows
            if (r2 >= r3) goto Lcf
            androidx.constraintlayout.solver.ArrayRow[] r3 = r0.mRows
            r3 = r3[r2]
            androidx.constraintlayout.solver.SolverVariable r4 = r3.variable
            androidx.constraintlayout.solver.SolverVariable$Type r4 = r4.mType
            androidx.constraintlayout.solver.SolverVariable$Type r5 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            if (r4 != r5) goto L17
        L13:
            r20 = 0
            goto Lcb
        L17:
            float r3 = r3.constantValue
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L13
            r2 = 0
            r3 = 0
        L20:
            if (r2 != 0) goto Lca
            androidx.constraintlayout.solver.Metrics r5 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            r6 = 1
            if (r5 == 0) goto L2d
            long r8 = r5.bfs
            long r8 = r8 + r6
            r5.bfs = r8
        L2d:
            int r3 = r3 + 1
            r5 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = 0
            r10 = -1
            r11 = -1
            r12 = 0
        L37:
            int r13 = r0.mNumRows
            r14 = 1
            if (r9 >= r13) goto L96
            androidx.constraintlayout.solver.ArrayRow[] r13 = r0.mRows
            r13 = r13[r9]
            androidx.constraintlayout.solver.SolverVariable r15 = r13.variable
            androidx.constraintlayout.solver.SolverVariable$Type r15 = r15.mType
            r20 = 0
            androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            if (r15 != r1) goto L4b
            goto L8e
        L4b:
            boolean r1 = r13.isSimpleDefinition
            if (r1 == 0) goto L50
            goto L8e
        L50:
            float r1 = r13.constantValue
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L8e
        L56:
            int r1 = r0.mNumColumns
            if (r14 >= r1) goto L8e
            androidx.constraintlayout.solver.Cache r1 = r0.mCache
            androidx.constraintlayout.solver.SolverVariable[] r1 = r1.mIndexedVariables
            r1 = r1[r14]
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r15 = r13.variables
            float r15 = r15.get(r1)
            int r16 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r16 > 0) goto L6d
            r17 = r6
            goto L88
        L6d:
            r17 = r6
            r4 = 0
        L70:
            r6 = 9
            if (r4 >= r6) goto L88
            float[] r6 = r1.strengthVector
            r6 = r6[r4]
            float r6 = r6 / r15
            int r7 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r7 >= 0) goto L7f
            if (r4 == r12) goto L81
        L7f:
            if (r4 <= r12) goto L85
        L81:
            r12 = r4
            r8 = r6
            r10 = r9
            r11 = r14
        L85:
            int r4 = r4 + 1
            goto L70
        L88:
            int r14 = r14 + 1
            r6 = r17
            r4 = 0
            goto L56
        L8e:
            r17 = r6
            int r9 = r9 + 1
            r6 = r17
            r4 = 0
            goto L37
        L96:
            r17 = r6
            r20 = 0
            if (r10 == r5) goto Lbf
            androidx.constraintlayout.solver.ArrayRow[] r1 = r0.mRows
            r1 = r1[r10]
            androidx.constraintlayout.solver.SolverVariable r4 = r1.variable
            r4.definitionId = r5
            androidx.constraintlayout.solver.Metrics r4 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r4 == 0) goto Lae
            long r5 = r4.pivots
            long r5 = r5 + r17
            r4.pivots = r5
        Lae:
            androidx.constraintlayout.solver.Cache r4 = r0.mCache
            androidx.constraintlayout.solver.SolverVariable[] r4 = r4.mIndexedVariables
            r4 = r4[r11]
            r1.pivot(r4)
            androidx.constraintlayout.solver.SolverVariable r4 = r1.variable
            r4.definitionId = r10
            r4.updateReferencesWithNewDefinition(r1)
            goto Lc0
        Lbf:
            r2 = 1
        Lc0:
            int r1 = r0.mNumColumns
            int r1 = r1 / 2
            if (r3 <= r1) goto Lc7
            r2 = 1
        Lc7:
            r4 = 0
            goto L20
        Lca:
            return r3
        Lcb:
            int r2 = r2 + 1
            goto L3
        Lcf:
            r20 = 0
            return r20
    }

    private java.lang.String getDisplaySize(int r4) {
            r3 = this;
            int r4 = r4 * 4
            int r0 = r4 / 1024
            int r1 = r0 / 1024
            java.lang.String r2 = ""
            if (r1 <= 0) goto L1f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r0 = " Mb"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L1f:
            if (r0 <= 0) goto L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = " Kb"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = " bytes"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    private java.lang.String getDisplayStrength(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L6
            java.lang.String r2 = "LOW"
            return r2
        L6:
            r0 = 2
            if (r2 != r0) goto Lc
            java.lang.String r2 = "MEDIUM"
            return r2
        Lc:
            r0 = 3
            if (r2 != r0) goto L12
            java.lang.String r2 = "HIGH"
            return r2
        L12:
            r0 = 4
            if (r2 != r0) goto L18
            java.lang.String r2 = "HIGHEST"
            return r2
        L18:
            r0 = 5
            if (r2 != r0) goto L1e
            java.lang.String r2 = "EQUALITY"
            return r2
        L1e:
            r0 = 8
            if (r2 != r0) goto L25
            java.lang.String r2 = "FIXED"
            return r2
        L25:
            r0 = 6
            if (r2 != r0) goto L2b
            java.lang.String r2 = "BARRIER"
            return r2
        L2b:
            java.lang.String r2 = "NONE"
            return r2
    }

    public static androidx.constraintlayout.solver.Metrics getMetrics() {
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            return r0
    }

    private void increaseTableSize() {
            r6 = this;
            int r0 = r6.TABLE_SIZE
            int r0 = r0 * 2
            r6.TABLE_SIZE = r0
            androidx.constraintlayout.solver.ArrayRow[] r1 = r6.mRows
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            androidx.constraintlayout.solver.ArrayRow[] r0 = (androidx.constraintlayout.solver.ArrayRow[]) r0
            r6.mRows = r0
            androidx.constraintlayout.solver.Cache r0 = r6.mCache
            androidx.constraintlayout.solver.SolverVariable[] r1 = r0.mIndexedVariables
            int r2 = r6.TABLE_SIZE
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            androidx.constraintlayout.solver.SolverVariable[] r1 = (androidx.constraintlayout.solver.SolverVariable[]) r1
            r0.mIndexedVariables = r1
            int r0 = r6.TABLE_SIZE
            boolean[] r1 = new boolean[r0]
            r6.mAlreadyTestedCandidates = r1
            r6.mMaxColumns = r0
            r6.mMaxRows = r0
            androidx.constraintlayout.solver.Metrics r1 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r1 == 0) goto L42
            long r2 = r1.tableSizeIncrease
            r4 = 1
            long r2 = r2 + r4
            r1.tableSizeIncrease = r2
            long r2 = r1.maxTableSize
            long r4 = (long) r0
            long r2 = java.lang.Math.max(r2, r4)
            r1.maxTableSize = r2
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            long r1 = r0.maxTableSize
            r0.lastTableSize = r1
        L42:
            return
    }

    private final int optimize(androidx.constraintlayout.solver.LinearSystem.Row r13, boolean r14) {
            r12 = this;
            androidx.constraintlayout.solver.Metrics r14 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            r0 = 1
            if (r14 == 0) goto Lb
            long r2 = r14.optimize
            long r2 = r2 + r0
            r14.optimize = r2
        Lb:
            r14 = 0
            r2 = 0
        Ld:
            int r3 = r12.mNumColumns
            if (r2 >= r3) goto L18
            boolean[] r3 = r12.mAlreadyTestedCandidates
            r3[r2] = r14
            int r2 = r2 + 1
            goto Ld
        L18:
            r2 = 0
            r3 = 0
        L1a:
            if (r2 != 0) goto Lb0
            androidx.constraintlayout.solver.Metrics r4 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r4 == 0) goto L25
            long r5 = r4.iterations
            long r5 = r5 + r0
            r4.iterations = r5
        L25:
            int r3 = r3 + 1
            int r4 = r12.mNumColumns
            int r4 = r4 * 2
            if (r3 < r4) goto L2e
            goto L4f
        L2e:
            androidx.constraintlayout.solver.SolverVariable r4 = r13.getKey()
            r5 = 1
            if (r4 == 0) goto L3f
            boolean[] r4 = r12.mAlreadyTestedCandidates
            androidx.constraintlayout.solver.SolverVariable r6 = r13.getKey()
            int r6 = r6.id
            r4[r6] = r5
        L3f:
            boolean[] r4 = r12.mAlreadyTestedCandidates
            androidx.constraintlayout.solver.SolverVariable r4 = r13.getPivotCandidate(r12, r4)
            if (r4 == 0) goto L52
            boolean[] r6 = r12.mAlreadyTestedCandidates
            int r7 = r4.id
            boolean r8 = r6[r7]
            if (r8 == 0) goto L50
        L4f:
            return r3
        L50:
            r6[r7] = r5
        L52:
            if (r4 == 0) goto Lad
            r5 = -1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = 0
            r8 = -1
        L5a:
            int r9 = r12.mNumRows
            if (r7 >= r9) goto L8e
            androidx.constraintlayout.solver.ArrayRow[] r9 = r12.mRows
            r9 = r9[r7]
            androidx.constraintlayout.solver.SolverVariable r10 = r9.variable
            androidx.constraintlayout.solver.SolverVariable$Type r10 = r10.mType
            androidx.constraintlayout.solver.SolverVariable$Type r11 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            if (r10 != r11) goto L6b
            goto L8b
        L6b:
            boolean r10 = r9.isSimpleDefinition
            if (r10 == 0) goto L70
            goto L8b
        L70:
            boolean r10 = r9.hasVariable(r4)
            if (r10 == 0) goto L8b
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r10 = r9.variables
            float r10 = r10.get(r4)
            r11 = 0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L8b
            float r9 = r9.constantValue
            float r9 = -r9
            float r9 = r9 / r10
            int r10 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r10 >= 0) goto L8b
            r8 = r7
            r6 = r9
        L8b:
            int r7 = r7 + 1
            goto L5a
        L8e:
            if (r8 <= r5) goto L1a
            androidx.constraintlayout.solver.ArrayRow[] r6 = r12.mRows
            r6 = r6[r8]
            androidx.constraintlayout.solver.SolverVariable r7 = r6.variable
            r7.definitionId = r5
            androidx.constraintlayout.solver.Metrics r5 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r5 == 0) goto La1
            long r9 = r5.pivots
            long r9 = r9 + r0
            r5.pivots = r9
        La1:
            r6.pivot(r4)
            androidx.constraintlayout.solver.SolverVariable r4 = r6.variable
            r4.definitionId = r8
            r4.updateReferencesWithNewDefinition(r6)
            goto L1a
        Lad:
            r2 = 1
            goto L1a
        Lb0:
            return r3
    }

    private void releaseRows() {
            r4 = this;
            boolean r0 = androidx.constraintlayout.solver.LinearSystem.OPTIMIZED_ENGINE
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1d
        L6:
            androidx.constraintlayout.solver.ArrayRow[] r0 = r4.mRows
            int r3 = r0.length
            if (r2 >= r3) goto L34
            r0 = r0[r2]
            if (r0 == 0) goto L16
            androidx.constraintlayout.solver.Cache r3 = r4.mCache
            androidx.constraintlayout.solver.Pools$Pool<androidx.constraintlayout.solver.ArrayRow> r3 = r3.optimizedArrayRowPool
            r3.release(r0)
        L16:
            androidx.constraintlayout.solver.ArrayRow[] r0 = r4.mRows
            r0[r2] = r1
            int r2 = r2 + 1
            goto L6
        L1d:
            androidx.constraintlayout.solver.ArrayRow[] r0 = r4.mRows
            int r3 = r0.length
            if (r2 >= r3) goto L34
            r0 = r0[r2]
            if (r0 == 0) goto L2d
            androidx.constraintlayout.solver.Cache r3 = r4.mCache
            androidx.constraintlayout.solver.Pools$Pool<androidx.constraintlayout.solver.ArrayRow> r3 = r3.arrayRowPool
            r3.release(r0)
        L2d:
            androidx.constraintlayout.solver.ArrayRow[] r0 = r4.mRows
            r0[r2] = r1
            int r2 = r2 + 1
            goto L1d
        L34:
            return
    }

    public void addCenterPoint(androidx.constraintlayout.solver.widgets.ConstraintWidget r17, androidx.constraintlayout.solver.widgets.ConstraintWidget r18, float r19, int r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.getAnchor(r3)
            androidx.constraintlayout.solver.SolverVariable r6 = r0.createObjectVariable(r4)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r1.getAnchor(r4)
            androidx.constraintlayout.solver.SolverVariable r8 = r0.createObjectVariable(r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r1.getAnchor(r5)
            androidx.constraintlayout.solver.SolverVariable r13 = r0.createObjectVariable(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.getAnchor(r7)
            androidx.constraintlayout.solver.SolverVariable r9 = r0.createObjectVariable(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.getAnchor(r3)
            androidx.constraintlayout.solver.SolverVariable r1 = r0.createObjectVariable(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.getAnchor(r4)
            androidx.constraintlayout.solver.SolverVariable r10 = r0.createObjectVariable(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.getAnchor(r5)
            androidx.constraintlayout.solver.SolverVariable r3 = r0.createObjectVariable(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.getAnchor(r7)
            androidx.constraintlayout.solver.SolverVariable r11 = r0.createObjectVariable(r2)
            androidx.constraintlayout.solver.ArrayRow r7 = r0.createRow()
            r2 = r19
            double r4 = (double) r2
            double r14 = java.lang.Math.sin(r4)
            r2 = r20
            r17 = r1
            double r1 = (double) r2
            double r14 = r14 * r1
            float r12 = (float) r14
            r7.createRowWithAngle(r8, r9, r10, r11, r12)
            r0.addConstraint(r7)
            r7 = r4
            androidx.constraintlayout.solver.ArrayRow r5 = r0.createRow()
            double r7 = java.lang.Math.cos(r7)
            double r7 = r7 * r1
            float r10 = (float) r7
            r8 = r17
            r9 = r3
            r7 = r13
            r5.createRowWithAngle(r6, r7, r8, r9, r10)
            r0.addConstraint(r5)
            return
    }

    public void addCentering(androidx.constraintlayout.solver.SolverVariable r10, androidx.constraintlayout.solver.SolverVariable r11, int r12, float r13, androidx.constraintlayout.solver.SolverVariable r14, androidx.constraintlayout.solver.SolverVariable r15, int r16, int r17) {
            r9 = this;
            r0 = r17
            androidx.constraintlayout.solver.ArrayRow r1 = r9.createRow()
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r1.createRowCentering(r2, r3, r4, r5, r6, r7, r8)
            r10 = 8
            if (r0 == r10) goto L18
            r1.addError(r9, r0)
        L18:
            r9.addConstraint(r1)
            return
    }

    public void addConstraint(androidx.constraintlayout.solver.ArrayRow r8) {
            r7 = this;
            if (r8 != 0) goto L4
            goto L8d
        L4:
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            r1 = 1
            if (r0 == 0) goto L18
            long r3 = r0.constraints
            long r3 = r3 + r1
            r0.constraints = r3
            boolean r3 = r8.isSimpleDefinition
            if (r3 == 0) goto L18
            long r3 = r0.simpleconstraints
            long r3 = r3 + r1
            r0.simpleconstraints = r3
        L18:
            int r0 = r7.mNumRows
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.mMaxRows
            if (r0 >= r4) goto L27
            int r0 = r7.mNumColumns
            int r0 = r0 + r3
            int r4 = r7.mMaxColumns
            if (r0 < r4) goto L2a
        L27:
            r7.increaseTableSize()
        L2a:
            boolean r0 = r8.isSimpleDefinition
            r4 = 0
            if (r0 != 0) goto L88
            r8.updateFromSystem(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L39
            goto L8d
        L39:
            r8.ensurePositiveConstant()
            boolean r0 = r8.chooseSubject(r7)
            if (r0 == 0) goto L7f
            androidx.constraintlayout.solver.SolverVariable r0 = r7.createExtraVariable()
            r8.variable = r0
            r7.addRow(r8)
            androidx.constraintlayout.solver.LinearSystem$Row r4 = r7.mTempGoal
            r4.initFromRow(r8)
            androidx.constraintlayout.solver.LinearSystem$Row r4 = r7.mTempGoal
            r7.optimize(r4, r3)
            int r4 = r0.definitionId
            r5 = -1
            if (r4 != r5) goto L80
            androidx.constraintlayout.solver.SolverVariable r4 = r8.variable
            if (r4 != r0) goto L70
            androidx.constraintlayout.solver.SolverVariable r0 = r8.pickPivot(r0)
            if (r0 == 0) goto L70
            androidx.constraintlayout.solver.Metrics r4 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r4 == 0) goto L6d
            long r5 = r4.pivots
            long r5 = r5 + r1
            r4.pivots = r5
        L6d:
            r8.pivot(r0)
        L70:
            boolean r0 = r8.isSimpleDefinition
            if (r0 != 0) goto L79
            androidx.constraintlayout.solver.SolverVariable r0 = r8.variable
            r0.updateReferencesWithNewDefinition(r8)
        L79:
            int r0 = r7.mNumRows
            int r0 = r0 - r3
            r7.mNumRows = r0
            goto L80
        L7f:
            r3 = 0
        L80:
            boolean r0 = r8.hasKeyVariable()
            if (r0 != 0) goto L87
            goto L8d
        L87:
            r4 = r3
        L88:
            if (r4 != 0) goto L8d
            r7.addRow(r8)
        L8d:
            return
    }

    public androidx.constraintlayout.solver.ArrayRow addEquality(androidx.constraintlayout.solver.SolverVariable r4, androidx.constraintlayout.solver.SolverVariable r5, int r6, int r7) {
            r3 = this;
            r0 = 8
            if (r7 != r0) goto L16
            boolean r1 = r5.isFinalValue
            if (r1 == 0) goto L16
            int r1 = r4.definitionId
            r2 = -1
            if (r1 != r2) goto L16
            float r5 = r5.computedValue
            float r6 = (float) r6
            float r5 = r5 + r6
            r4.setFinalValue(r3, r5)
            r4 = 0
            return r4
        L16:
            androidx.constraintlayout.solver.ArrayRow r1 = r3.createRow()
            r1.createRowEquals(r4, r5, r6)
            if (r7 == r0) goto L22
            r1.addError(r3, r7)
        L22:
            r3.addConstraint(r1)
            return r1
    }

    public void addEquality(androidx.constraintlayout.solver.SolverVariable r3, int r4) {
            r2 = this;
            int r0 = r3.definitionId
            r1 = -1
            if (r0 != r1) goto La
            float r4 = (float) r4
            r3.setFinalValue(r2, r4)
            return
        La:
            if (r0 == r1) goto L32
            androidx.constraintlayout.solver.ArrayRow[] r1 = r2.mRows
            r0 = r1[r0]
            boolean r1 = r0.isSimpleDefinition
            if (r1 == 0) goto L18
            float r3 = (float) r4
            r0.constantValue = r3
            return
        L18:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r1 = r0.variables
            int r1 = r1.getCurrentSize()
            if (r1 != 0) goto L27
            r3 = 1
            r0.isSimpleDefinition = r3
            float r3 = (float) r4
            r0.constantValue = r3
            return
        L27:
            androidx.constraintlayout.solver.ArrayRow r0 = r2.createRow()
            r0.createRowEquals(r3, r4)
            r2.addConstraint(r0)
            return
        L32:
            androidx.constraintlayout.solver.ArrayRow r0 = r2.createRow()
            r0.createRowDefinition(r3, r4)
            r2.addConstraint(r0)
            return
    }

    public void addGreaterBarrier(androidx.constraintlayout.solver.SolverVariable r3, androidx.constraintlayout.solver.SolverVariable r4, int r5, boolean r6) {
            r2 = this;
            androidx.constraintlayout.solver.ArrayRow r6 = r2.createRow()
            androidx.constraintlayout.solver.SolverVariable r0 = r2.createSlackVariable()
            r1 = 0
            r0.strength = r1
            r6.createRowGreaterThan(r3, r4, r0, r5)
            r2.addConstraint(r6)
            return
    }

    public void addGreaterThan(androidx.constraintlayout.solver.SolverVariable r4, androidx.constraintlayout.solver.SolverVariable r5, int r6, int r7) {
            r3 = this;
            androidx.constraintlayout.solver.ArrayRow r0 = r3.createRow()
            androidx.constraintlayout.solver.SolverVariable r1 = r3.createSlackVariable()
            r2 = 0
            r1.strength = r2
            r0.createRowGreaterThan(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L20
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r4 = r0.variables
            float r4 = r4.get(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.addSingleError(r0, r4, r7)
        L20:
            r3.addConstraint(r0)
            return
    }

    public void addLowerBarrier(androidx.constraintlayout.solver.SolverVariable r3, androidx.constraintlayout.solver.SolverVariable r4, int r5, boolean r6) {
            r2 = this;
            androidx.constraintlayout.solver.ArrayRow r6 = r2.createRow()
            androidx.constraintlayout.solver.SolverVariable r0 = r2.createSlackVariable()
            r1 = 0
            r0.strength = r1
            r6.createRowLowerThan(r3, r4, r0, r5)
            r2.addConstraint(r6)
            return
    }

    public void addLowerThan(androidx.constraintlayout.solver.SolverVariable r4, androidx.constraintlayout.solver.SolverVariable r5, int r6, int r7) {
            r3 = this;
            androidx.constraintlayout.solver.ArrayRow r0 = r3.createRow()
            androidx.constraintlayout.solver.SolverVariable r1 = r3.createSlackVariable()
            r2 = 0
            r1.strength = r2
            r0.createRowLowerThan(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L20
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r4 = r0.variables
            float r4 = r4.get(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.addSingleError(r0, r4, r7)
        L20:
            r3.addConstraint(r0)
            return
    }

    public void addRatio(androidx.constraintlayout.solver.SolverVariable r7, androidx.constraintlayout.solver.SolverVariable r8, androidx.constraintlayout.solver.SolverVariable r9, androidx.constraintlayout.solver.SolverVariable r10, float r11, int r12) {
            r6 = this;
            androidx.constraintlayout.solver.ArrayRow r0 = r6.createRow()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.createRowDimensionRatio(r1, r2, r3, r4, r5)
            r7 = 8
            if (r12 == r7) goto L13
            r0.addError(r6, r12)
        L13:
            r6.addConstraint(r0)
            return
    }

    void addSingleError(androidx.constraintlayout.solver.ArrayRow r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            androidx.constraintlayout.solver.SolverVariable r4 = r1.createErrorVariable(r4, r0)
            r2.addSingleError(r4, r3)
            return
    }

    final void cleanupRows() {
            r6 = this;
            r0 = 0
        L1:
            int r1 = r6.mNumRows
            if (r0 >= r1) goto L41
            androidx.constraintlayout.solver.ArrayRow[] r1 = r6.mRows
            r1 = r1[r0]
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r2 = r1.variables
            int r2 = r2.getCurrentSize()
            r3 = 1
            if (r2 != 0) goto L14
            r1.isSimpleDefinition = r3
        L14:
            boolean r2 = r1.isSimpleDefinition
            if (r2 == 0) goto L3f
            androidx.constraintlayout.solver.SolverVariable r2 = r1.variable
            float r4 = r1.constantValue
            r2.computedValue = r4
            r2.removeFromRow(r1)
            r1 = r0
        L22:
            int r2 = r6.mNumRows
            int r4 = r2 + (-1)
            if (r1 >= r4) goto L32
            androidx.constraintlayout.solver.ArrayRow[] r2 = r6.mRows
            int r4 = r1 + 1
            r5 = r2[r4]
            r2[r1] = r5
            r1 = r4
            goto L22
        L32:
            androidx.constraintlayout.solver.ArrayRow[] r1 = r6.mRows
            int r4 = r2 + (-1)
            r5 = 0
            r1[r4] = r5
            int r2 = r2 + (-1)
            r6.mNumRows = r2
            int r0 = r0 + (-1)
        L3f:
            int r0 = r0 + r3
            goto L1
        L41:
            return
    }

    public androidx.constraintlayout.solver.SolverVariable createErrorVariable(int r6, java.lang.String r7) {
            r5 = this;
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.errors
            r3 = 1
            long r1 = r1 + r3
            r0.errors = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            androidx.constraintlayout.solver.SolverVariable$Type r0 = androidx.constraintlayout.solver.SolverVariable.Type.ERROR
            androidx.constraintlayout.solver.SolverVariable r7 = r5.acquireSolverVariable(r0, r7)
            int r0 = r5.mVariablesID
            int r0 = r0 + 1
            r5.mVariablesID = r0
            int r1 = r5.mNumColumns
            int r1 = r1 + 1
            r5.mNumColumns = r1
            r7.id = r0
            r7.strength = r6
            androidx.constraintlayout.solver.Cache r6 = r5.mCache
            androidx.constraintlayout.solver.SolverVariable[] r6 = r6.mIndexedVariables
            r6[r0] = r7
            androidx.constraintlayout.solver.LinearSystem$Row r6 = r5.mGoal
            r6.addError(r7)
            return r7
    }

    public androidx.constraintlayout.solver.SolverVariable createExtraVariable() {
            r5 = this;
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.extravariables
            r3 = 1
            long r1 = r1 + r3
            r0.extravariables = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            androidx.constraintlayout.solver.SolverVariable$Type r0 = androidx.constraintlayout.solver.SolverVariable.Type.SLACK
            r1 = 0
            androidx.constraintlayout.solver.SolverVariable r0 = r5.acquireSolverVariable(r0, r1)
            int r1 = r5.mVariablesID
            int r1 = r1 + 1
            r5.mVariablesID = r1
            int r2 = r5.mNumColumns
            int r2 = r2 + 1
            r5.mNumColumns = r2
            r0.id = r1
            androidx.constraintlayout.solver.Cache r2 = r5.mCache
            androidx.constraintlayout.solver.SolverVariable[] r2 = r2.mIndexedVariables
            r2[r1] = r0
            return r0
    }

    public androidx.constraintlayout.solver.SolverVariable createObjectVariable(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.mNumColumns
            int r1 = r1 + 1
            int r2 = r3.mMaxColumns
            if (r1 < r2) goto Lf
            r3.increaseTableSize()
        Lf:
            boolean r1 = r4 instanceof androidx.constraintlayout.solver.widgets.ConstraintAnchor
            if (r1 == 0) goto L54
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r4
            androidx.constraintlayout.solver.SolverVariable r0 = r4.getSolverVariable()
            if (r0 != 0) goto L24
            androidx.constraintlayout.solver.Cache r0 = r3.mCache
            r4.resetSolverVariable(r0)
            androidx.constraintlayout.solver.SolverVariable r0 = r4.getSolverVariable()
        L24:
            int r4 = r0.id
            r1 = -1
            if (r4 == r1) goto L37
            int r2 = r3.mVariablesID
            if (r4 > r2) goto L37
            androidx.constraintlayout.solver.Cache r2 = r3.mCache
            androidx.constraintlayout.solver.SolverVariable[] r2 = r2.mIndexedVariables
            r2 = r2[r4]
            if (r2 != 0) goto L36
            goto L37
        L36:
            return r0
        L37:
            if (r4 == r1) goto L3c
            r0.reset()
        L3c:
            int r4 = r3.mVariablesID
            int r4 = r4 + 1
            r3.mVariablesID = r4
            int r1 = r3.mNumColumns
            int r1 = r1 + 1
            r3.mNumColumns = r1
            r0.id = r4
            androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            r0.mType = r1
            androidx.constraintlayout.solver.Cache r1 = r3.mCache
            androidx.constraintlayout.solver.SolverVariable[] r1 = r1.mIndexedVariables
            r1[r4] = r0
        L54:
            return r0
    }

    public androidx.constraintlayout.solver.ArrayRow createRow() {
            r5 = this;
            boolean r0 = androidx.constraintlayout.solver.LinearSystem.OPTIMIZED_ENGINE
            r1 = 1
            if (r0 == 0) goto L23
            androidx.constraintlayout.solver.Cache r0 = r5.mCache
            androidx.constraintlayout.solver.Pools$Pool<androidx.constraintlayout.solver.ArrayRow> r0 = r0.optimizedArrayRowPool
            java.lang.Object r0 = r0.acquire()
            androidx.constraintlayout.solver.ArrayRow r0 = (androidx.constraintlayout.solver.ArrayRow) r0
            if (r0 != 0) goto L1f
            androidx.constraintlayout.solver.LinearSystem$ValuesRow r0 = new androidx.constraintlayout.solver.LinearSystem$ValuesRow
            androidx.constraintlayout.solver.Cache r3 = r5.mCache
            r0.<init>(r5, r3)
            long r3 = androidx.constraintlayout.solver.LinearSystem.OPTIMIZED_ARRAY_ROW_CREATION
            long r3 = r3 + r1
            androidx.constraintlayout.solver.LinearSystem.OPTIMIZED_ARRAY_ROW_CREATION = r3
            goto L3f
        L1f:
            r0.reset()
            goto L3f
        L23:
            androidx.constraintlayout.solver.Cache r0 = r5.mCache
            androidx.constraintlayout.solver.Pools$Pool<androidx.constraintlayout.solver.ArrayRow> r0 = r0.arrayRowPool
            java.lang.Object r0 = r0.acquire()
            androidx.constraintlayout.solver.ArrayRow r0 = (androidx.constraintlayout.solver.ArrayRow) r0
            if (r0 != 0) goto L3c
            androidx.constraintlayout.solver.ArrayRow r0 = new androidx.constraintlayout.solver.ArrayRow
            androidx.constraintlayout.solver.Cache r3 = r5.mCache
            r0.<init>(r3)
            long r3 = androidx.constraintlayout.solver.LinearSystem.ARRAY_ROW_CREATION
            long r3 = r3 + r1
            androidx.constraintlayout.solver.LinearSystem.ARRAY_ROW_CREATION = r3
            goto L3f
        L3c:
            r0.reset()
        L3f:
            androidx.constraintlayout.solver.SolverVariable.increaseErrorId()
            return r0
    }

    public androidx.constraintlayout.solver.SolverVariable createSlackVariable() {
            r5 = this;
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.slackvariables
            r3 = 1
            long r1 = r1 + r3
            r0.slackvariables = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            androidx.constraintlayout.solver.SolverVariable$Type r0 = androidx.constraintlayout.solver.SolverVariable.Type.SLACK
            r1 = 0
            androidx.constraintlayout.solver.SolverVariable r0 = r5.acquireSolverVariable(r0, r1)
            int r1 = r5.mVariablesID
            int r1 = r1 + 1
            r5.mVariablesID = r1
            int r2 = r5.mNumColumns
            int r2 = r2 + 1
            r5.mNumColumns = r2
            r0.id = r1
            androidx.constraintlayout.solver.Cache r2 = r5.mCache
            androidx.constraintlayout.solver.SolverVariable[] r2 = r2.mIndexedVariables
            r2[r1] = r0
            return r0
    }

    public void displayReadableRows() {
            r5 = this;
            r5.displaySolverVariables()
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
        L7:
            int r3 = r5.mVariablesID
            if (r2 >= r3) goto L45
            androidx.constraintlayout.solver.Cache r3 = r5.mCache
            androidx.constraintlayout.solver.SolverVariable[] r3 = r3.mIndexedVariables
            r3 = r3[r2]
            if (r3 == 0) goto L42
            boolean r4 = r3.isFinalValue
            if (r4 == 0) goto L42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = " $["
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = "] => "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = " = "
            r4.append(r0)
            float r0 = r3.computedValue
            r4.append(r0)
            java.lang.String r0 = "\n"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L42:
            int r2 = r2 + 1
            goto L7
        L45:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "\n\n #  "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L56:
            int r2 = r5.mNumRows
            if (r1 >= r2) goto L85
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            androidx.constraintlayout.solver.ArrayRow[] r0 = r5.mRows
            r0 = r0[r1]
            java.lang.String r0 = r0.toReadableString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "\n #  "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L56
        L85:
            androidx.constraintlayout.solver.LinearSystem$Row r0 = r5.mGoal
            if (r0 == 0) goto L8e
            androidx.constraintlayout.solver.LinearSystem$Row r0 = r5.mGoal
            java.util.Objects.toString(r0)
        L8e:
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    void displaySystemInformations() {
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r5.TABLE_SIZE
            if (r1 >= r3) goto L15
            androidx.constraintlayout.solver.ArrayRow[] r3 = r5.mRows
            r3 = r3[r1]
            if (r3 == 0) goto L12
            int r3 = r3.sizeInBytes()
            int r2 = r2 + r3
        L12:
            int r1 = r1 + 1
            goto L3
        L15:
            r1 = 0
            r3 = 0
        L17:
            int r4 = r5.mNumRows
            if (r1 >= r4) goto L29
            androidx.constraintlayout.solver.ArrayRow[] r4 = r5.mRows
            r4 = r4[r1]
            if (r4 == 0) goto L26
            int r4 = r4.sizeInBytes()
            int r3 = r3 + r4
        L26:
            int r1 = r1 + 1
            goto L17
        L29:
            java.io.PrintStream r1 = java.lang.System.out
            int r4 = r5.TABLE_SIZE
            int r4 = r4 * r4
            r5.getDisplaySize(r4)
            r5.getDisplaySize(r2)
            r5.getDisplaySize(r3)
            r5.getDisplaySize(r0)
            r1.getClass()
            return
    }

    public void displayVariablesReadableRows() {
            r4 = this;
            r4.displaySolverVariables()
            java.lang.String r0 = ""
            r1 = 0
        L6:
            int r2 = r4.mNumRows
            if (r1 >= r2) goto L41
            androidx.constraintlayout.solver.ArrayRow[] r2 = r4.mRows
            r2 = r2[r1]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.variable
            androidx.constraintlayout.solver.SolverVariable$Type r2 = r2.mType
            androidx.constraintlayout.solver.SolverVariable$Type r3 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            if (r2 != r3) goto L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            androidx.constraintlayout.solver.ArrayRow[] r0 = r4.mRows
            r0 = r0[r1]
            java.lang.String r0 = r0.toReadableString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L3e:
            int r1 = r1 + 1
            goto L6
        L41:
            androidx.constraintlayout.solver.LinearSystem$Row r0 = r4.mGoal
            java.util.Objects.toString(r0)
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    public void fillMetrics(androidx.constraintlayout.solver.Metrics r1) {
            r0 = this;
            androidx.constraintlayout.solver.LinearSystem.sMetrics = r1
            return
    }

    public androidx.constraintlayout.solver.Cache getCache() {
            r1 = this;
            androidx.constraintlayout.solver.Cache r0 = r1.mCache
            return r0
    }

    androidx.constraintlayout.solver.LinearSystem.Row getGoal() {
            r1 = this;
            androidx.constraintlayout.solver.LinearSystem$Row r0 = r1.mGoal
            return r0
    }

    public int getMemoryUsed() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.mNumRows
            if (r0 >= r2) goto L14
            androidx.constraintlayout.solver.ArrayRow[] r2 = r3.mRows
            r2 = r2[r0]
            if (r2 == 0) goto L11
            int r2 = r2.sizeInBytes()
            int r1 = r1 + r2
        L11:
            int r0 = r0 + 1
            goto L2
        L14:
            return r1
    }

    public int getNumEquations() {
            r1 = this;
            int r0 = r1.mNumRows
            return r0
    }

    public int getNumVariables() {
            r1 = this;
            int r0 = r1.mVariablesID
            return r0
    }

    public int getObjectVariableValue(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r2
            androidx.constraintlayout.solver.SolverVariable r2 = r2.getSolverVariable()
            if (r2 == 0) goto Lf
            float r2 = r2.computedValue
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
        Lf:
            r2 = 0
            return r2
    }

    androidx.constraintlayout.solver.ArrayRow getRow(int r2) {
            r1 = this;
            androidx.constraintlayout.solver.ArrayRow[] r0 = r1.mRows
            r2 = r0[r2]
            return r2
    }

    float getValueFor(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.solver.SolverVariable$Type r0 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            androidx.constraintlayout.solver.SolverVariable r2 = r1.getVariable(r2, r0)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            float r2 = r2.computedValue
            return r2
    }

    androidx.constraintlayout.solver.SolverVariable getVariable(java.lang.String r2, androidx.constraintlayout.solver.SolverVariable.Type r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.solver.SolverVariable> r0 = r1.mVariables
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mVariables = r0
        Lb:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.solver.SolverVariable> r0 = r1.mVariables
            java.lang.Object r0 = r0.get(r2)
            androidx.constraintlayout.solver.SolverVariable r0 = (androidx.constraintlayout.solver.SolverVariable) r0
            if (r0 != 0) goto L1a
            androidx.constraintlayout.solver.SolverVariable r2 = r1.createVariable(r2, r3)
            return r2
        L1a:
            return r0
    }

    public void minimize() throws java.lang.Exception {
            r5 = this;
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            r1 = 1
            if (r0 == 0) goto Lb
            long r3 = r0.minimize
            long r3 = r3 + r1
            r0.minimize = r3
        Lb:
            boolean r3 = r5.graphOptimizer
            if (r3 != 0) goto L1a
            boolean r3 = r5.newgraphOptimizer
            if (r3 == 0) goto L14
            goto L1a
        L14:
            androidx.constraintlayout.solver.LinearSystem$Row r0 = r5.mGoal
            r5.minimizeGoal(r0)
            return
        L1a:
            if (r0 == 0) goto L21
            long r3 = r0.graphOptimizer
            long r3 = r3 + r1
            r0.graphOptimizer = r3
        L21:
            r0 = 0
        L22:
            int r3 = r5.mNumRows
            if (r0 >= r3) goto L37
            androidx.constraintlayout.solver.ArrayRow[] r3 = r5.mRows
            r3 = r3[r0]
            boolean r3 = r3.isSimpleDefinition
            if (r3 != 0) goto L34
            androidx.constraintlayout.solver.LinearSystem$Row r0 = r5.mGoal
            r5.minimizeGoal(r0)
            return
        L34:
            int r0 = r0 + 1
            goto L22
        L37:
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r0 == 0) goto L40
            long r3 = r0.fullySolved
            long r3 = r3 + r1
            r0.fullySolved = r3
        L40:
            r5.computeValues()
            return
    }

    void minimizeGoal(androidx.constraintlayout.solver.LinearSystem.Row r6) throws java.lang.Exception {
            r5 = this;
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r0 == 0) goto L23
            long r1 = r0.minimizeGoal
            r3 = 1
            long r1 = r1 + r3
            r0.minimizeGoal = r1
            long r1 = r0.maxVariables
            int r3 = r5.mNumColumns
            long r3 = (long) r3
            long r1 = java.lang.Math.max(r1, r3)
            r0.maxVariables = r1
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            long r1 = r0.maxRows
            int r3 = r5.mNumRows
            long r3 = (long) r3
            long r1 = java.lang.Math.max(r1, r3)
            r0.maxRows = r1
        L23:
            r5.enforceBFS(r6)
            r0 = 0
            r5.optimize(r6, r0)
            r5.computeValues()
            return
    }

    public void removeRow(androidx.constraintlayout.solver.ArrayRow r5) {
            r4 = this;
            boolean r0 = r5.isSimpleDefinition
            if (r0 == 0) goto L28
            androidx.constraintlayout.solver.SolverVariable r0 = r5.variable
            if (r0 == 0) goto L28
            int r0 = r0.definitionId
            r1 = -1
            if (r0 == r1) goto L21
        Ld:
            int r1 = r4.mNumRows
            int r2 = r1 + (-1)
            if (r0 >= r2) goto L1d
            androidx.constraintlayout.solver.ArrayRow[] r1 = r4.mRows
            int r2 = r0 + 1
            r3 = r1[r2]
            r1[r0] = r3
            r0 = r2
            goto Ld
        L1d:
            int r1 = r1 + (-1)
            r4.mNumRows = r1
        L21:
            androidx.constraintlayout.solver.SolverVariable r0 = r5.variable
            float r5 = r5.constantValue
            r0.setFinalValue(r4, r5)
        L28:
            return
    }

    public void reset() {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            androidx.constraintlayout.solver.Cache r2 = r5.mCache
            androidx.constraintlayout.solver.SolverVariable[] r3 = r2.mIndexedVariables
            int r4 = r3.length
            if (r1 >= r4) goto L13
            r2 = r3[r1]
            if (r2 == 0) goto L10
            r2.reset()
        L10:
            int r1 = r1 + 1
            goto L2
        L13:
            androidx.constraintlayout.solver.Pools$Pool<androidx.constraintlayout.solver.SolverVariable> r1 = r2.solverVariablePool
            androidx.constraintlayout.solver.SolverVariable[] r2 = r5.mPoolVariables
            int r3 = r5.mPoolVariablesCount
            r1.releaseAll(r2, r3)
            r5.mPoolVariablesCount = r0
            androidx.constraintlayout.solver.Cache r1 = r5.mCache
            androidx.constraintlayout.solver.SolverVariable[] r1 = r1.mIndexedVariables
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.solver.SolverVariable> r1 = r5.mVariables
            if (r1 == 0) goto L2d
            r1.clear()
        L2d:
            r5.mVariablesID = r0
            androidx.constraintlayout.solver.LinearSystem$Row r1 = r5.mGoal
            r1.clear()
            r1 = 1
            r5.mNumColumns = r1
            r1 = 0
        L38:
            int r2 = r5.mNumRows
            if (r1 >= r2) goto L45
            androidx.constraintlayout.solver.ArrayRow[] r2 = r5.mRows
            r2 = r2[r1]
            r2.used = r0
            int r1 = r1 + 1
            goto L38
        L45:
            r5.releaseRows()
            r5.mNumRows = r0
            boolean r0 = androidx.constraintlayout.solver.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L58
            androidx.constraintlayout.solver.LinearSystem$ValuesRow r0 = new androidx.constraintlayout.solver.LinearSystem$ValuesRow
            androidx.constraintlayout.solver.Cache r1 = r5.mCache
            r0.<init>(r5, r1)
            r5.mTempGoal = r0
            return
        L58:
            androidx.constraintlayout.solver.ArrayRow r0 = new androidx.constraintlayout.solver.ArrayRow
            androidx.constraintlayout.solver.Cache r1 = r5.mCache
            r0.<init>(r1)
            r5.mTempGoal = r0
            return
    }
}
