package androidx.constraintlayout.solver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ArrayLinkedVariables implements androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    static final int NONE = -1;
    private static float epsilon = 0.001f;
    private int ROW_SIZE;
    private androidx.constraintlayout.solver.SolverVariable candidate;
    int currentSize;
    private int[] mArrayIndices;
    private int[] mArrayNextIndices;
    private float[] mArrayValues;
    protected final androidx.constraintlayout.solver.Cache mCache;
    private boolean mDidFillOnce;
    private int mHead;
    private int mLast;
    private final androidx.constraintlayout.solver.ArrayRow mRow;

    static {
            return
    }

    ArrayLinkedVariables(androidx.constraintlayout.solver.ArrayRow r4, androidx.constraintlayout.solver.Cache r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.currentSize = r0
            r1 = 8
            r3.ROW_SIZE = r1
            r2 = 0
            r3.candidate = r2
            int[] r2 = new int[r1]
            r3.mArrayIndices = r2
            int[] r2 = new int[r1]
            r3.mArrayNextIndices = r2
            float[] r1 = new float[r1]
            r3.mArrayValues = r1
            r1 = -1
            r3.mHead = r1
            r3.mLast = r1
            r3.mDidFillOnce = r0
            r3.mRow = r4
            r3.mCache = r5
            return
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public void add(androidx.constraintlayout.solver.SolverVariable r9, float r10, boolean r11) {
            r8 = this;
            float r0 = androidx.constraintlayout.solver.ArrayLinkedVariables.epsilon
            float r1 = -r0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto Ld
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto Ld
            goto L13e
        Ld:
            int r0 = r8.mHead
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != r2) goto L48
            r8.mHead = r1
            float[] r11 = r8.mArrayValues
            r11[r1] = r10
            int[] r10 = r8.mArrayIndices
            int r11 = r9.id
            r10[r1] = r11
            int[] r10 = r8.mArrayNextIndices
            r10[r1] = r2
            int r10 = r9.usageInRowCount
            int r10 = r10 + r3
            r9.usageInRowCount = r10
            androidx.constraintlayout.solver.ArrayRow r10 = r8.mRow
            r9.addToRow(r10)
            int r9 = r8.currentSize
            int r9 = r9 + r3
            r8.currentSize = r9
            boolean r9 = r8.mDidFillOnce
            if (r9 != 0) goto L13e
            int r9 = r8.mLast
            int r9 = r9 + r3
            r8.mLast = r9
            int[] r10 = r8.mArrayIndices
            int r11 = r10.length
            if (r9 < r11) goto L13e
            r8.mDidFillOnce = r3
            int r9 = r10.length
            int r9 = r9 - r3
            r8.mLast = r9
            return
        L48:
            r4 = 0
            r5 = -1
        L4a:
            if (r0 == r2) goto La3
            int r6 = r8.currentSize
            if (r4 >= r6) goto La3
            int[] r6 = r8.mArrayIndices
            r6 = r6[r0]
            int r7 = r9.id
            if (r6 != r7) goto L99
            float[] r1 = r8.mArrayValues
            r2 = r1[r0]
            float r2 = r2 + r10
            float r10 = androidx.constraintlayout.solver.ArrayLinkedVariables.epsilon
            float r4 = -r10
            r6 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L6a
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 >= 0) goto L6a
            r2 = 0
        L6a:
            r1[r0] = r2
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L13e
            int r10 = r8.mHead
            if (r0 != r10) goto L7b
            int[] r10 = r8.mArrayNextIndices
            r10 = r10[r0]
            r8.mHead = r10
            goto L81
        L7b:
            int[] r10 = r8.mArrayNextIndices
            r1 = r10[r0]
            r10[r5] = r1
        L81:
            if (r11 == 0) goto L88
            androidx.constraintlayout.solver.ArrayRow r10 = r8.mRow
            r9.removeFromRow(r10)
        L88:
            boolean r10 = r8.mDidFillOnce
            if (r10 == 0) goto L8e
            r8.mLast = r0
        L8e:
            int r10 = r9.usageInRowCount
            int r10 = r10 - r3
            r9.usageInRowCount = r10
            int r9 = r8.currentSize
            int r9 = r9 - r3
            r8.currentSize = r9
            return
        L99:
            if (r6 >= r7) goto L9c
            r5 = r0
        L9c:
            int[] r6 = r8.mArrayNextIndices
            r0 = r6[r0]
            int r4 = r4 + 1
            goto L4a
        La3:
            int r11 = r8.mLast
            int r0 = r11 + 1
            boolean r4 = r8.mDidFillOnce
            if (r4 == 0) goto Lb4
            int[] r0 = r8.mArrayIndices
            r4 = r0[r11]
            if (r4 != r2) goto Lb2
            goto Lb5
        Lb2:
            int r11 = r0.length
            goto Lb5
        Lb4:
            r11 = r0
        Lb5:
            int[] r0 = r8.mArrayIndices
            int r4 = r0.length
            if (r11 < r4) goto Lce
            int r4 = r8.currentSize
            int r0 = r0.length
            if (r4 >= r0) goto Lce
            r0 = 0
        Lc0:
            int[] r4 = r8.mArrayIndices
            int r6 = r4.length
            if (r0 >= r6) goto Lce
            r4 = r4[r0]
            if (r4 != r2) goto Lcb
            r11 = r0
            goto Lce
        Lcb:
            int r0 = r0 + 1
            goto Lc0
        Lce:
            int[] r0 = r8.mArrayIndices
            int r4 = r0.length
            if (r11 < r4) goto Lfc
            int r11 = r0.length
            int r0 = r8.ROW_SIZE
            int r0 = r0 * 2
            r8.ROW_SIZE = r0
            r8.mDidFillOnce = r1
            int r1 = r11 + (-1)
            r8.mLast = r1
            float[] r1 = r8.mArrayValues
            float[] r0 = java.util.Arrays.copyOf(r1, r0)
            r8.mArrayValues = r0
            int[] r0 = r8.mArrayIndices
            int r1 = r8.ROW_SIZE
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r8.mArrayIndices = r0
            int[] r0 = r8.mArrayNextIndices
            int r1 = r8.ROW_SIZE
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r8.mArrayNextIndices = r0
        Lfc:
            int[] r0 = r8.mArrayIndices
            int r1 = r9.id
            r0[r11] = r1
            float[] r0 = r8.mArrayValues
            r0[r11] = r10
            if (r5 == r2) goto L111
            int[] r10 = r8.mArrayNextIndices
            r0 = r10[r5]
            r10[r11] = r0
            r10[r5] = r11
            goto L119
        L111:
            int[] r10 = r8.mArrayNextIndices
            int r0 = r8.mHead
            r10[r11] = r0
            r8.mHead = r11
        L119:
            int r10 = r9.usageInRowCount
            int r10 = r10 + r3
            r9.usageInRowCount = r10
            androidx.constraintlayout.solver.ArrayRow r10 = r8.mRow
            r9.addToRow(r10)
            int r9 = r8.currentSize
            int r9 = r9 + r3
            r8.currentSize = r9
            boolean r9 = r8.mDidFillOnce
            if (r9 != 0) goto L131
            int r9 = r8.mLast
            int r9 = r9 + r3
            r8.mLast = r9
        L131:
            int r9 = r8.mLast
            int[] r10 = r8.mArrayIndices
            int r11 = r10.length
            if (r9 < r11) goto L13e
            r8.mDidFillOnce = r3
            int r9 = r10.length
            int r9 = r9 - r3
            r8.mLast = r9
        L13e:
            return
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void clear() {
            r5 = this;
            int r0 = r5.mHead
            r1 = 0
            r2 = 0
        L4:
            r3 = -1
            if (r0 == r3) goto L23
            int r4 = r5.currentSize
            if (r2 >= r4) goto L23
            androidx.constraintlayout.solver.Cache r3 = r5.mCache
            androidx.constraintlayout.solver.SolverVariable[] r3 = r3.mIndexedVariables
            int[] r4 = r5.mArrayIndices
            r4 = r4[r0]
            r3 = r3[r4]
            if (r3 == 0) goto L1c
            androidx.constraintlayout.solver.ArrayRow r4 = r5.mRow
            r3.removeFromRow(r4)
        L1c:
            int[] r3 = r5.mArrayNextIndices
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L4
        L23:
            r5.mHead = r3
            r5.mLast = r3
            r5.mDidFillOnce = r1
            r5.currentSize = r1
            return
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public boolean contains(androidx.constraintlayout.solver.SolverVariable r7) {
            r6 = this;
            int r0 = r6.mHead
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L7
            return r1
        L7:
            r3 = 0
        L8:
            if (r0 == r2) goto L1f
            int r4 = r6.currentSize
            if (r3 >= r4) goto L1f
            int[] r4 = r6.mArrayIndices
            r4 = r4[r0]
            int r5 = r7.id
            if (r4 != r5) goto L18
            r7 = 1
            return r7
        L18:
            int[] r4 = r6.mArrayNextIndices
            r0 = r4[r0]
            int r3 = r3 + 1
            goto L8
        L1f:
            return r1
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public void display() {
            r4 = this;
            int r0 = r4.currentSize
            java.io.PrintStream r1 = java.lang.System.out
            r1.getClass()
            r1 = 0
        L8:
            if (r1 >= r0) goto L1f
            androidx.constraintlayout.solver.SolverVariable r2 = r4.getVariable(r1)
            if (r2 != 0) goto L11
            goto L1c
        L11:
            java.io.PrintStream r3 = java.lang.System.out
            r2.toString()
            r4.getVariableValue(r1)
            r3.getClass()
        L1c:
            int r1 = r1 + 1
            goto L8
        L1f:
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public void divideByAmount(float r5) {
            r4 = this;
            int r0 = r4.mHead
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r4.currentSize
            if (r1 >= r2) goto L18
            float[] r2 = r4.mArrayValues
            r3 = r2[r0]
            float r3 = r3 / r5
            r2[r0] = r3
            int[] r2 = r4.mArrayNextIndices
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            return
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float get(androidx.constraintlayout.solver.SolverVariable r5) {
            r4 = this;
            int r0 = r4.mHead
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1e
            int r2 = r4.currentSize
            if (r1 >= r2) goto L1e
            int[] r2 = r4.mArrayIndices
            r2 = r2[r0]
            int r3 = r5.id
            if (r2 != r3) goto L17
            float[] r5 = r4.mArrayValues
            r5 = r5[r0]
            return r5
        L17:
            int[] r2 = r4.mArrayNextIndices
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1e:
            r5 = 0
            return r5
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
            r1 = this;
            int r0 = r1.currentSize
            return r0
    }

    public int getHead() {
            r1 = this;
            int r0 = r1.mHead
            return r0
    }

    public final int getId(int r2) {
            r1 = this;
            int[] r0 = r1.mArrayIndices
            r2 = r0[r2]
            return r2
    }

    public final int getNextIndice(int r2) {
            r1 = this;
            int[] r0 = r1.mArrayNextIndices
            r2 = r0[r2]
            return r2
    }

    androidx.constraintlayout.solver.SolverVariable getPivotCandidate() {
            r6 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r6.candidate
            if (r0 != 0) goto L33
            int r0 = r6.mHead
            r1 = 0
            r2 = 0
        L8:
            r3 = -1
            if (r0 == r3) goto L32
            int r3 = r6.currentSize
            if (r1 >= r3) goto L32
            float[] r3 = r6.mArrayValues
            r3 = r3[r0]
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L2b
            androidx.constraintlayout.solver.Cache r3 = r6.mCache
            androidx.constraintlayout.solver.SolverVariable[] r3 = r3.mIndexedVariables
            int[] r4 = r6.mArrayIndices
            r4 = r4[r0]
            r3 = r3[r4]
            if (r2 == 0) goto L2a
            int r4 = r2.strength
            int r5 = r3.strength
            if (r4 >= r5) goto L2b
        L2a:
            r2 = r3
        L2b:
            int[] r3 = r6.mArrayNextIndices
            r0 = r3[r0]
            int r1 = r1 + 1
            goto L8
        L32:
            return r2
        L33:
            return r0
    }

    public final float getValue(int r2) {
            r1 = this;
            float[] r0 = r1.mArrayValues
            r2 = r0[r2]
            return r2
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public androidx.constraintlayout.solver.SolverVariable getVariable(int r4) {
            r3 = this;
            int r0 = r3.mHead
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1e
            int r2 = r3.currentSize
            if (r1 >= r2) goto L1e
            if (r1 != r4) goto L17
            androidx.constraintlayout.solver.Cache r4 = r3.mCache
            androidx.constraintlayout.solver.SolverVariable[] r4 = r4.mIndexedVariables
            int[] r1 = r3.mArrayIndices
            r0 = r1[r0]
            r4 = r4[r0]
            return r4
        L17:
            int[] r2 = r3.mArrayNextIndices
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1e:
            r4 = 0
            return r4
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public float getVariableValue(int r4) {
            r3 = this;
            int r0 = r3.mHead
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r3.currentSize
            if (r1 >= r2) goto L18
            if (r1 != r4) goto L11
            float[] r4 = r3.mArrayValues
            r4 = r4[r0]
            return r4
        L11:
            int[] r2 = r3.mArrayNextIndices
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            r4 = 0
            return r4
    }

    boolean hasAtLeastOnePositiveVariable() {
            r5 = this;
            int r0 = r5.mHead
            r1 = 0
            r2 = 0
        L4:
            r3 = -1
            if (r0 == r3) goto L1d
            int r3 = r5.currentSize
            if (r2 >= r3) goto L1d
            float[] r3 = r5.mArrayValues
            r3 = r3[r0]
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L16
            r0 = 1
            return r0
        L16:
            int[] r3 = r5.mArrayNextIndices
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L4
        L1d:
            return r1
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public int indexOf(androidx.constraintlayout.solver.SolverVariable r6) {
            r5 = this;
            int r0 = r5.mHead
            r1 = -1
            if (r0 != r1) goto L6
            return r1
        L6:
            r2 = 0
        L7:
            if (r0 == r1) goto L1d
            int r3 = r5.currentSize
            if (r2 >= r3) goto L1d
            int[] r3 = r5.mArrayIndices
            r3 = r3[r0]
            int r4 = r6.id
            if (r3 != r4) goto L16
            return r0
        L16:
            int[] r3 = r5.mArrayNextIndices
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L7
        L1d:
            return r1
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public void invert() {
            r5 = this;
            int r0 = r5.mHead
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1b
            int r2 = r5.currentSize
            if (r1 >= r2) goto L1b
            float[] r2 = r5.mArrayValues
            r3 = r2[r0]
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r4
            r2[r0] = r3
            int[] r2 = r5.mArrayNextIndices
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1b:
            return
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final void put(androidx.constraintlayout.solver.SolverVariable r9, float r10) {
            r8 = this;
            r0 = 0
            r1 = 1
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            r8.remove(r9, r1)
            return
        La:
            int r0 = r8.mHead
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L44
            r8.mHead = r2
            float[] r0 = r8.mArrayValues
            r0[r2] = r10
            int[] r10 = r8.mArrayIndices
            int r0 = r9.id
            r10[r2] = r0
            int[] r10 = r8.mArrayNextIndices
            r10[r2] = r3
            int r10 = r9.usageInRowCount
            int r10 = r10 + r1
            r9.usageInRowCount = r10
            androidx.constraintlayout.solver.ArrayRow r10 = r8.mRow
            r9.addToRow(r10)
            int r9 = r8.currentSize
            int r9 = r9 + r1
            r8.currentSize = r9
            boolean r9 = r8.mDidFillOnce
            if (r9 != 0) goto L103
            int r9 = r8.mLast
            int r9 = r9 + r1
            r8.mLast = r9
            int[] r10 = r8.mArrayIndices
            int r0 = r10.length
            if (r9 < r0) goto L103
            r8.mDidFillOnce = r1
            int r9 = r10.length
            int r9 = r9 - r1
            r8.mLast = r9
            return
        L44:
            r4 = 0
            r5 = -1
        L46:
            if (r0 == r3) goto L63
            int r6 = r8.currentSize
            if (r4 >= r6) goto L63
            int[] r6 = r8.mArrayIndices
            r6 = r6[r0]
            int r7 = r9.id
            if (r6 != r7) goto L59
            float[] r9 = r8.mArrayValues
            r9[r0] = r10
            return
        L59:
            if (r6 >= r7) goto L5c
            r5 = r0
        L5c:
            int[] r6 = r8.mArrayNextIndices
            r0 = r6[r0]
            int r4 = r4 + 1
            goto L46
        L63:
            int r0 = r8.mLast
            int r4 = r0 + 1
            boolean r6 = r8.mDidFillOnce
            if (r6 == 0) goto L74
            int[] r4 = r8.mArrayIndices
            r6 = r4[r0]
            if (r6 != r3) goto L72
            goto L75
        L72:
            int r0 = r4.length
            goto L75
        L74:
            r0 = r4
        L75:
            int[] r4 = r8.mArrayIndices
            int r6 = r4.length
            if (r0 < r6) goto L8e
            int r6 = r8.currentSize
            int r4 = r4.length
            if (r6 >= r4) goto L8e
            r4 = 0
        L80:
            int[] r6 = r8.mArrayIndices
            int r7 = r6.length
            if (r4 >= r7) goto L8e
            r6 = r6[r4]
            if (r6 != r3) goto L8b
            r0 = r4
            goto L8e
        L8b:
            int r4 = r4 + 1
            goto L80
        L8e:
            int[] r4 = r8.mArrayIndices
            int r6 = r4.length
            if (r0 < r6) goto Lbc
            int r0 = r4.length
            int r4 = r8.ROW_SIZE
            int r4 = r4 * 2
            r8.ROW_SIZE = r4
            r8.mDidFillOnce = r2
            int r2 = r0 + (-1)
            r8.mLast = r2
            float[] r2 = r8.mArrayValues
            float[] r2 = java.util.Arrays.copyOf(r2, r4)
            r8.mArrayValues = r2
            int[] r2 = r8.mArrayIndices
            int r4 = r8.ROW_SIZE
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r8.mArrayIndices = r2
            int[] r2 = r8.mArrayNextIndices
            int r4 = r8.ROW_SIZE
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r8.mArrayNextIndices = r2
        Lbc:
            int[] r2 = r8.mArrayIndices
            int r4 = r9.id
            r2[r0] = r4
            float[] r2 = r8.mArrayValues
            r2[r0] = r10
            if (r5 == r3) goto Ld1
            int[] r10 = r8.mArrayNextIndices
            r2 = r10[r5]
            r10[r0] = r2
            r10[r5] = r0
            goto Ld9
        Ld1:
            int[] r10 = r8.mArrayNextIndices
            int r2 = r8.mHead
            r10[r0] = r2
            r8.mHead = r0
        Ld9:
            int r10 = r9.usageInRowCount
            int r10 = r10 + r1
            r9.usageInRowCount = r10
            androidx.constraintlayout.solver.ArrayRow r10 = r8.mRow
            r9.addToRow(r10)
            int r9 = r8.currentSize
            int r9 = r9 + r1
            r8.currentSize = r9
            boolean r10 = r8.mDidFillOnce
            if (r10 != 0) goto Lf1
            int r10 = r8.mLast
            int r10 = r10 + r1
            r8.mLast = r10
        Lf1:
            int[] r10 = r8.mArrayIndices
            int r0 = r10.length
            if (r9 < r0) goto Lf8
            r8.mDidFillOnce = r1
        Lf8:
            int r9 = r8.mLast
            int r0 = r10.length
            if (r9 < r0) goto L103
            r8.mDidFillOnce = r1
            int r9 = r10.length
            int r9 = r9 - r1
            r8.mLast = r9
        L103:
            return
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public final float remove(androidx.constraintlayout.solver.SolverVariable r9, boolean r10) {
            r8 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r8.candidate
            if (r0 != r9) goto L7
            r0 = 0
            r8.candidate = r0
        L7:
            int r0 = r8.mHead
            r1 = 0
            r2 = -1
            if (r0 != r2) goto Le
            return r1
        Le:
            r3 = 0
            r4 = -1
        L10:
            if (r0 == r2) goto L5b
            int r5 = r8.currentSize
            if (r3 >= r5) goto L5b
            int[] r5 = r8.mArrayIndices
            r5 = r5[r0]
            int r6 = r9.id
            if (r5 != r6) goto L51
            int r1 = r8.mHead
            if (r0 != r1) goto L29
            int[] r1 = r8.mArrayNextIndices
            r1 = r1[r0]
            r8.mHead = r1
            goto L2f
        L29:
            int[] r1 = r8.mArrayNextIndices
            r3 = r1[r0]
            r1[r4] = r3
        L2f:
            if (r10 == 0) goto L36
            androidx.constraintlayout.solver.ArrayRow r10 = r8.mRow
            r9.removeFromRow(r10)
        L36:
            int r10 = r9.usageInRowCount
            int r10 = r10 + (-1)
            r9.usageInRowCount = r10
            int r9 = r8.currentSize
            int r9 = r9 + (-1)
            r8.currentSize = r9
            int[] r9 = r8.mArrayIndices
            r9[r0] = r2
            boolean r9 = r8.mDidFillOnce
            if (r9 == 0) goto L4c
            r8.mLast = r0
        L4c:
            float[] r9 = r8.mArrayValues
            r9 = r9[r0]
            return r9
        L51:
            int[] r4 = r8.mArrayNextIndices
            r4 = r4[r0]
            int r3 = r3 + 1
            r7 = r4
            r4 = r0
            r0 = r7
            goto L10
        L5b:
            return r1
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
            r1 = this;
            int[] r0 = r1.mArrayIndices
            int r0 = r0.length
            int r0 = r0 * 12
            int r0 = r0 + 36
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.mHead
            java.lang.String r1 = ""
            r2 = 0
        L5:
            r3 = -1
            if (r0 == r3) goto L55
            int r3 = r5.currentSize
            if (r2 >= r3) goto L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " -> "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            float[] r1 = r5.mArrayValues
            r1 = r1[r0]
            r3.append(r1)
            java.lang.String r1 = " : "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            androidx.constraintlayout.solver.Cache r1 = r5.mCache
            androidx.constraintlayout.solver.SolverVariable[] r1 = r1.mIndexedVariables
            int[] r4 = r5.mArrayIndices
            r4 = r4[r0]
            r1 = r1[r4]
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int[] r3 = r5.mArrayNextIndices
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L5
        L55:
            return r1
    }

    @Override // androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables
    public float use(androidx.constraintlayout.solver.ArrayRow r6, boolean r7) {
            r5 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r6.variable
            float r0 = r5.get(r0)
            androidx.constraintlayout.solver.SolverVariable r1 = r6.variable
            r5.remove(r1, r7)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r6.variables
            int r1 = r6.getCurrentSize()
            r2 = 0
        L12:
            if (r2 >= r1) goto L24
            androidx.constraintlayout.solver.SolverVariable r3 = r6.getVariable(r2)
            float r4 = r6.get(r3)
            float r4 = r4 * r0
            r5.add(r3, r4, r7)
            int r2 = r2 + 1
            goto L12
        L24:
            return r0
    }
}
