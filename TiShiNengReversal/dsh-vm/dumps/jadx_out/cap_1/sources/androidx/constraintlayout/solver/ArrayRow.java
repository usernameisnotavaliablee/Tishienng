package androidx.constraintlayout.solver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ArrayRow implements androidx.constraintlayout.solver.LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    float constantValue;
    boolean isSimpleDefinition;
    boolean used;
    androidx.constraintlayout.solver.SolverVariable variable;
    public androidx.constraintlayout.solver.ArrayRow.ArrayRowVariables variables;
    java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> variablesToUpdate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ArrayRowVariables {
        void add(androidx.constraintlayout.solver.SolverVariable r1, float r2, boolean r3);

        void clear();

        boolean contains(androidx.constraintlayout.solver.SolverVariable r1);

        void display();

        void divideByAmount(float r1);

        float get(androidx.constraintlayout.solver.SolverVariable r1);

        int getCurrentSize();

        androidx.constraintlayout.solver.SolverVariable getVariable(int r1);

        float getVariableValue(int r1);

        int indexOf(androidx.constraintlayout.solver.SolverVariable r1);

        void invert();

        void put(androidx.constraintlayout.solver.SolverVariable r1, float r2);

        float remove(androidx.constraintlayout.solver.SolverVariable r1, boolean r2);

        int sizeInBytes();

        float use(androidx.constraintlayout.solver.ArrayRow r1, boolean r2);
    }

    public ArrayRow() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.variable = r0
            r0 = 0
            r2.constantValue = r0
            r0 = 0
            r2.used = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.variablesToUpdate = r1
            r2.isSimpleDefinition = r0
            return
    }

    public ArrayRow(androidx.constraintlayout.solver.Cache r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.variable = r0
            r0 = 0
            r2.constantValue = r0
            r0 = 0
            r2.used = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.variablesToUpdate = r1
            r2.isSimpleDefinition = r0
            androidx.constraintlayout.solver.ArrayLinkedVariables r0 = new androidx.constraintlayout.solver.ArrayLinkedVariables
            r0.<init>(r2, r3)
            r2.variables = r0
            return
    }

    private boolean isNew(androidx.constraintlayout.solver.SolverVariable r1, androidx.constraintlayout.solver.LinearSystem r2) {
            r0 = this;
            int r1 = r1.usageInRowCount
            r2 = 1
            if (r1 > r2) goto L6
            return r2
        L6:
            r1 = 0
            return r1
    }

    private androidx.constraintlayout.solver.SolverVariable pickPivotInVariables(boolean[] r10, androidx.constraintlayout.solver.SolverVariable r11) {
            r9 = this;
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r9.variables
            int r0 = r0.getCurrentSize()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        La:
            if (r3 >= r0) goto L39
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r9.variables
            float r5 = r5.getVariableValue(r3)
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 >= 0) goto L36
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r9.variables
            androidx.constraintlayout.solver.SolverVariable r6 = r6.getVariable(r3)
            if (r10 == 0) goto L24
            int r7 = r6.id
            boolean r7 = r10[r7]
            if (r7 != 0) goto L36
        L24:
            if (r6 == r11) goto L36
            androidx.constraintlayout.solver.SolverVariable$Type r7 = r6.mType
            androidx.constraintlayout.solver.SolverVariable$Type r8 = androidx.constraintlayout.solver.SolverVariable.Type.SLACK
            if (r7 == r8) goto L30
            androidx.constraintlayout.solver.SolverVariable$Type r8 = androidx.constraintlayout.solver.SolverVariable.Type.ERROR
            if (r7 != r8) goto L36
        L30:
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 >= 0) goto L36
            r4 = r5
            r2 = r6
        L36:
            int r3 = r3 + 1
            goto La
        L39:
            return r2
    }

    public androidx.constraintlayout.solver.ArrayRow addError(androidx.constraintlayout.solver.LinearSystem r4, int r5) {
            r3 = this;
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r3.variables
            java.lang.String r1 = "ep"
            androidx.constraintlayout.solver.SolverVariable r1 = r4.createErrorVariable(r5, r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.put(r1, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r3.variables
            java.lang.String r1 = "em"
            androidx.constraintlayout.solver.SolverVariable r4 = r4.createErrorVariable(r5, r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.put(r4, r5)
            return r3
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public void addError(androidx.constraintlayout.solver.SolverVariable r4) {
            r3 = this;
            int r0 = r4.strength
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != r1) goto L8
            goto L22
        L8:
            r1 = 2
            if (r0 != r1) goto Le
            r2 = 1148846080(0x447a0000, float:1000.0)
            goto L22
        Le:
            r1 = 3
            if (r0 != r1) goto L15
            r2 = 1232348160(0x49742400, float:1000000.0)
            goto L22
        L15:
            r1 = 4
            if (r0 != r1) goto L1c
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            goto L22
        L1c:
            r1 = 5
            if (r0 != r1) goto L22
            r2 = 1399379109(0x5368d4a5, float:1.0E12)
        L22:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r3.variables
            r0.put(r4, r2)
            return
    }

    androidx.constraintlayout.solver.ArrayRow addSingleError(androidx.constraintlayout.solver.SolverVariable r2, int r3) {
            r1 = this;
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r1.variables
            float r3 = (float) r3
            r0.put(r2, r3)
            return r1
    }

    boolean chooseSubject(androidx.constraintlayout.solver.LinearSystem r3) {
            r2 = this;
            androidx.constraintlayout.solver.SolverVariable r3 = r2.chooseSubjectInVariables(r3)
            r0 = 1
            if (r3 != 0) goto L9
            r3 = 1
            goto Ld
        L9:
            r2.pivot(r3)
            r3 = 0
        Ld:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r1 = r2.variables
            int r1 = r1.getCurrentSize()
            if (r1 != 0) goto L17
            r2.isSimpleDefinition = r0
        L17:
            return r3
    }

    androidx.constraintlayout.solver.SolverVariable chooseSubjectInVariables(androidx.constraintlayout.solver.LinearSystem r15) {
            r14 = this;
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r14.variables
            int r0 = r0.getCurrentSize()
            r1 = 0
            r2 = 0
            r3 = 0
            r3 = r1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        Lf:
            if (r4 >= r0) goto L6a
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r9 = r14.variables
            float r9 = r9.getVariableValue(r4)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r10 = r14.variables
            androidx.constraintlayout.solver.SolverVariable r10 = r10.getVariable(r4)
            androidx.constraintlayout.solver.SolverVariable$Type r11 = r10.mType
            androidx.constraintlayout.solver.SolverVariable$Type r12 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            r13 = 1
            if (r11 != r12) goto L43
            if (r1 != 0) goto L2e
            boolean r1 = r14.isNew(r10, r15)
        L2a:
            r5 = r1
            r7 = r9
            r1 = r10
            goto L67
        L2e:
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L37
            boolean r1 = r14.isNew(r10, r15)
            goto L2a
        L37:
            if (r5 != 0) goto L67
            boolean r11 = r14.isNew(r10, r15)
            if (r11 == 0) goto L67
            r7 = r9
            r1 = r10
            r5 = 1
            goto L67
        L43:
            if (r1 != 0) goto L67
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 >= 0) goto L67
            if (r3 != 0) goto L53
            boolean r3 = r14.isNew(r10, r15)
        L4f:
            r6 = r3
            r8 = r9
            r3 = r10
            goto L67
        L53:
            int r11 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r11 <= 0) goto L5c
            boolean r3 = r14.isNew(r10, r15)
            goto L4f
        L5c:
            if (r6 != 0) goto L67
            boolean r11 = r14.isNew(r10, r15)
            if (r11 == 0) goto L67
            r8 = r9
            r3 = r10
            r6 = 1
        L67:
            int r4 = r4 + 1
            goto Lf
        L6a:
            if (r1 == 0) goto L6d
            return r1
        L6d:
            return r3
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public void clear() {
            r1 = this;
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r1.variables
            r0.clear()
            r0 = 0
            r1.variable = r0
            r0 = 0
            r1.constantValue = r0
            return
    }

    androidx.constraintlayout.solver.ArrayRow createRowCentering(androidx.constraintlayout.solver.SolverVariable r6, androidx.constraintlayout.solver.SolverVariable r7, int r8, float r9, androidx.constraintlayout.solver.SolverVariable r10, androidx.constraintlayout.solver.SolverVariable r11, int r12) {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r10) goto L16
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r8 = r5.variables
            r8.put(r6, r0)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r11, r0)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r5.variables
            r8 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6.put(r7, r8)
            return r5
        L16:
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto L3c
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r9 = r5.variables
            r9.put(r6, r0)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r7, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r10, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r11, r0)
            if (r8 > 0) goto L36
            if (r12 <= 0) goto L85
        L36:
            int r6 = -r8
            int r6 = r6 + r12
            float r6 = (float) r6
            r5.constantValue = r6
            return r5
        L3c:
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 > 0) goto L4f
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r9 = r5.variables
            r9.put(r6, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r7, r0)
            float r6 = (float) r8
            r5.constantValue = r6
            return r5
        L4f:
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 < 0) goto L62
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r11, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r10, r0)
            int r6 = -r12
            float r6 = (float) r6
            r5.constantValue = r6
            return r5
        L62:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r1 = r5.variables
            float r3 = r0 - r9
            float r4 = r3 * r0
            r1.put(r6, r4)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r5.variables
            float r1 = r3 * r2
            r6.put(r7, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r5.variables
            float r2 = r2 * r9
            r6.put(r10, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r5.variables
            float r0 = r0 * r9
            r6.put(r11, r0)
            if (r8 > 0) goto L86
            if (r12 <= 0) goto L85
            goto L86
        L85:
            return r5
        L86:
            int r6 = -r8
            float r6 = (float) r6
            float r6 = r6 * r3
            float r7 = (float) r12
            float r7 = r7 * r9
            float r6 = r6 + r7
            r5.constantValue = r6
            return r5
    }

    androidx.constraintlayout.solver.ArrayRow createRowDefinition(androidx.constraintlayout.solver.SolverVariable r1, int r2) {
            r0 = this;
            r0.variable = r1
            float r2 = (float) r2
            r1.computedValue = r2
            r0.constantValue = r2
            r1 = 1
            r0.isSimpleDefinition = r1
            return r0
    }

    androidx.constraintlayout.solver.ArrayRow createRowDimensionPercent(androidx.constraintlayout.solver.SolverVariable r3, androidx.constraintlayout.solver.SolverVariable r4, float r5) {
            r2 = this;
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r2.variables
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.put(r3, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r5)
            return r2
    }

    public androidx.constraintlayout.solver.ArrayRow createRowDimensionRatio(androidx.constraintlayout.solver.SolverVariable r3, androidx.constraintlayout.solver.SolverVariable r4, androidx.constraintlayout.solver.SolverVariable r5, androidx.constraintlayout.solver.SolverVariable r6, float r7) {
            r2 = this;
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r2.variables
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.put(r3, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.put(r4, r0)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r5, r7)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            float r4 = -r7
            r3.put(r6, r4)
            return r2
    }

    public androidx.constraintlayout.solver.ArrayRow createRowEqualDimension(float r4, float r5, float r6, androidx.constraintlayout.solver.SolverVariable r7, int r8, androidx.constraintlayout.solver.SolverVariable r9, int r10, androidx.constraintlayout.solver.SolverVariable r11, int r12, androidx.constraintlayout.solver.SolverVariable r13, int r14) {
            r3 = this;
            r0 = 0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L34
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto Le
            goto L34
        Le:
            float r4 = r4 / r5
            float r6 = r6 / r5
            float r4 = r4 / r6
            int r5 = -r8
            int r5 = r5 - r10
            float r5 = (float) r5
            float r6 = (float) r12
            float r6 = r6 * r4
            float r5 = r5 + r6
            float r6 = (float) r14
            float r6 = r6 * r4
            float r5 = r5 + r6
            r3.constantValue = r5
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r3.variables
            r5.put(r7, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r3.variables
            r5.put(r9, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r3.variables
            r5.put(r13, r4)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r3.variables
            float r4 = -r4
            r5.put(r11, r4)
            return r3
        L34:
            int r4 = -r8
            int r4 = r4 - r10
            int r4 = r4 + r12
            int r4 = r4 + r14
            float r4 = (float) r4
            r3.constantValue = r4
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r4 = r3.variables
            r4.put(r7, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r4 = r3.variables
            r4.put(r9, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r4 = r3.variables
            r4.put(r13, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r4 = r3.variables
            r4.put(r11, r1)
            return r3
    }

    public androidx.constraintlayout.solver.ArrayRow createRowEqualMatchDimensions(float r5, float r6, float r7, androidx.constraintlayout.solver.SolverVariable r8, androidx.constraintlayout.solver.SolverVariable r9, androidx.constraintlayout.solver.SolverVariable r10, androidx.constraintlayout.solver.SolverVariable r11) {
            r4 = this;
            r0 = 0
            r4.constantValue = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto L47
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L10
            goto L47
        L10:
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 != 0) goto L1f
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r8, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r9, r1)
            return r4
        L1f:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L2e
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r10, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r11, r1)
            return r4
        L2e:
            float r5 = r5 / r6
            float r7 = r7 / r6
            float r5 = r5 / r7
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r4.variables
            r6.put(r8, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r4.variables
            r6.put(r9, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r4.variables
            r6.put(r11, r5)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r4.variables
            float r5 = -r5
            r6.put(r10, r5)
            return r4
        L47:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r8, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r9, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r11, r2)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r10, r1)
            return r4
    }

    public androidx.constraintlayout.solver.ArrayRow createRowEquals(androidx.constraintlayout.solver.SolverVariable r2, int r3) {
            r1 = this;
            if (r3 >= 0) goto Lf
            int r3 = r3 * (-1)
            float r3 = (float) r3
            r1.constantValue = r3
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r1.variables
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.put(r2, r0)
            return r1
        Lf:
            float r3 = (float) r3
            r1.constantValue = r3
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r1.variables
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.put(r2, r0)
            return r1
    }

    public androidx.constraintlayout.solver.ArrayRow createRowEquals(androidx.constraintlayout.solver.SolverVariable r3, androidx.constraintlayout.solver.SolverVariable r4, int r5) {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto Lb
            if (r5 >= 0) goto L8
            int r5 = r5 * (-1)
            r0 = 1
        L8:
            float r5 = (float) r5
            r2.constantValue = r5
        Lb:
            r5 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L1c
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r5)
            return r2
        L1c:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r5)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r1)
            return r2
    }

    public androidx.constraintlayout.solver.ArrayRow createRowGreaterThan(androidx.constraintlayout.solver.SolverVariable r1, int r2, androidx.constraintlayout.solver.SolverVariable r3) {
            r0 = this;
            float r2 = (float) r2
            r0.constantValue = r2
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r2 = r0.variables
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.put(r1, r3)
            return r0
    }

    public androidx.constraintlayout.solver.ArrayRow createRowGreaterThan(androidx.constraintlayout.solver.SolverVariable r3, androidx.constraintlayout.solver.SolverVariable r4, androidx.constraintlayout.solver.SolverVariable r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.constantValue = r6
        Lb:
            r6 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L21
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r6)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r5, r6)
            return r2
        L21:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r6)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r5, r1)
            return r2
    }

    public androidx.constraintlayout.solver.ArrayRow createRowLowerThan(androidx.constraintlayout.solver.SolverVariable r3, androidx.constraintlayout.solver.SolverVariable r4, androidx.constraintlayout.solver.SolverVariable r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.constantValue = r6
        Lb:
            r6 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L21
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r6)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r5, r1)
            return r2
        L21:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r6)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r5, r6)
            return r2
    }

    public androidx.constraintlayout.solver.ArrayRow createRowWithAngle(androidx.constraintlayout.solver.SolverVariable r3, androidx.constraintlayout.solver.SolverVariable r4, androidx.constraintlayout.solver.SolverVariable r5, androidx.constraintlayout.solver.SolverVariable r6, float r7) {
            r2 = this;
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r2.variables
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.put(r5, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r2.variables
            r5.put(r6, r1)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r2.variables
            r6 = -1090519040(0xffffffffbf000000, float:-0.5)
            r5.put(r3, r6)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r6)
            float r3 = -r7
            r2.constantValue = r3
            return r2
    }

    void ensurePositiveConstant() {
            r2 = this;
            float r0 = r2.constantValue
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L12
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r1
            r2.constantValue = r0
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.invert()
        L12:
            return
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public androidx.constraintlayout.solver.SolverVariable getKey() {
            r1 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r1.variable
            return r0
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public androidx.constraintlayout.solver.SolverVariable getPivotCandidate(androidx.constraintlayout.solver.LinearSystem r1, boolean[] r2) {
            r0 = this;
            r1 = 0
            androidx.constraintlayout.solver.SolverVariable r1 = r0.pickPivotInVariables(r2, r1)
            return r1
    }

    boolean hasKeyVariable() {
            r2 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r2.variable
            if (r0 == 0) goto L13
            androidx.constraintlayout.solver.SolverVariable$Type r0 = r0.mType
            androidx.constraintlayout.solver.SolverVariable$Type r1 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            if (r0 == r1) goto L11
            float r0 = r2.constantValue
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L13
        L11:
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    boolean hasVariable(androidx.constraintlayout.solver.SolverVariable r2) {
            r1 = this;
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r1.variables
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public void initFromRow(androidx.constraintlayout.solver.LinearSystem.Row r6) {
            r5 = this;
            boolean r0 = r6 instanceof androidx.constraintlayout.solver.ArrayRow
            if (r0 == 0) goto L2c
            androidx.constraintlayout.solver.ArrayRow r6 = (androidx.constraintlayout.solver.ArrayRow) r6
            r0 = 0
            r5.variable = r0
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r5.variables
            r0.clear()
            r0 = 0
        Lf:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r1 = r6.variables
            int r1 = r1.getCurrentSize()
            if (r0 >= r1) goto L2c
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r1 = r6.variables
            androidx.constraintlayout.solver.SolverVariable r1 = r1.getVariable(r0)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r2 = r6.variables
            float r2 = r2.getVariableValue(r0)
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r5.variables
            r4 = 1
            r3.add(r1, r2, r4)
            int r0 = r0 + 1
            goto Lf
        L2c:
            return
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public boolean isEmpty() {
            r2 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r2.variable
            if (r0 != 0) goto L15
            float r0 = r2.constantValue
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r2.variables
            int r0 = r0.getCurrentSize()
            if (r0 != 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public androidx.constraintlayout.solver.SolverVariable pickPivot(androidx.constraintlayout.solver.SolverVariable r2) {
            r1 = this;
            r0 = 0
            androidx.constraintlayout.solver.SolverVariable r2 = r1.pickPivotInVariables(r0, r2)
            return r2
    }

    void pivot(androidx.constraintlayout.solver.SolverVariable r4) {
            r3 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r3.variable
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto Le
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r2 = r3.variables
            r2.put(r0, r1)
            r0 = 0
            r3.variable = r0
        Le:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r3.variables
            r2 = 1
            float r0 = r0.remove(r4, r2)
            float r0 = r0 * r1
            r3.variable = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L20
            return
        L20:
            float r4 = r3.constantValue
            float r4 = r4 / r0
            r3.constantValue = r4
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r4 = r3.variables
            r4.divideByAmount(r0)
            return
    }

    public void reset() {
            r1 = this;
            r0 = 0
            r1.variable = r0
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r1.variables
            r0.clear()
            r0 = 0
            r1.constantValue = r0
            r0 = 0
            r1.isSimpleDefinition = r0
            return
    }

    int sizeInBytes() {
            r2 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r2.variable
            if (r0 == 0) goto L6
            r0 = 4
            goto L7
        L6:
            r0 = 0
        L7:
            int r0 = r0 + 8
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r1 = r2.variables
            int r1 = r1.sizeInBytes()
            int r0 = r0 + r1
            return r0
    }

    java.lang.String toReadableString() {
            r10 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r10.variable
            java.lang.String r1 = ""
            if (r0 != 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L29
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            androidx.constraintlayout.solver.SolverVariable r1 = r10.variable
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.constantValue
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L56
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.constantValue
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L57
        L56:
            r1 = 0
        L57:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r5 = r10.variables
            int r5 = r5.getCurrentSize()
        L5d:
            if (r2 >= r5) goto Led
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r6 = r10.variables
            androidx.constraintlayout.solver.SolverVariable r6 = r6.getVariable(r2)
            if (r6 != 0) goto L69
            goto Le9
        L69:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r7 = r10.variables
            float r7 = r7.getVariableValue(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L75
            goto Le9
        L75:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L95
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto Lbb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L92:
            float r7 = r7 * r9
            goto Lbb
        L95:
            if (r8 <= 0) goto La9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lbb
        La9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L92
        Lbb:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Ld1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto Le8
        Ld1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        Le8:
            r1 = 1
        Le9:
            int r2 = r2 + 1
            goto L5d
        Led:
            if (r1 != 0) goto L100
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L100:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toReadableString()
            return r0
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public void updateFromFinalVariable(androidx.constraintlayout.solver.LinearSystem r3, androidx.constraintlayout.solver.SolverVariable r4, boolean r5) {
            r2 = this;
            boolean r3 = r4.isFinalValue
            if (r3 != 0) goto L5
            goto L1e
        L5:
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            float r3 = r3.get(r4)
            float r0 = r2.constantValue
            float r1 = r4.computedValue
            float r1 = r1 * r3
            float r0 = r0 + r1
            r2.constantValue = r0
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.remove(r4, r5)
            if (r5 == 0) goto L1e
            r4.removeFromRow(r2)
        L1e:
            return
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public void updateFromRow(androidx.constraintlayout.solver.ArrayRow r4, boolean r5) {
            r3 = this;
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r0 = r3.variables
            float r0 = r0.use(r4, r5)
            float r1 = r3.constantValue
            float r2 = r4.constantValue
            float r2 = r2 * r0
            float r1 = r1 + r2
            r3.constantValue = r1
            if (r5 == 0) goto L16
            androidx.constraintlayout.solver.SolverVariable r4 = r4.variable
            r4.removeFromRow(r3)
        L16:
            return
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public void updateFromSystem(androidx.constraintlayout.solver.LinearSystem r8) {
            r7 = this;
            androidx.constraintlayout.solver.ArrayRow[] r0 = r8.mRows
            int r0 = r0.length
            if (r0 != 0) goto L6
            goto L5f
        L6:
            r0 = 0
            r1 = 0
        L8:
            if (r1 != 0) goto L5f
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r2 = r7.variables
            int r2 = r2.getCurrentSize()
            r3 = 0
        L11:
            if (r3 >= r2) goto L2a
            androidx.constraintlayout.solver.ArrayRow$ArrayRowVariables r4 = r7.variables
            androidx.constraintlayout.solver.SolverVariable r4 = r4.getVariable(r3)
            int r5 = r4.definitionId
            r6 = -1
            if (r5 != r6) goto L22
            boolean r5 = r4.isFinalValue
            if (r5 == 0) goto L27
        L22:
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r5 = r7.variablesToUpdate
            r5.add(r4)
        L27:
            int r3 = r3 + 1
            goto L11
        L2a:
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r2 = r7.variablesToUpdate
            int r2 = r2.size()
            r3 = 1
            if (r2 <= 0) goto L5d
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r2 = r7.variablesToUpdate
            java.util.Iterator r2 = r2.iterator()
        L39:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L57
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.solver.SolverVariable r4 = (androidx.constraintlayout.solver.SolverVariable) r4
            boolean r5 = r4.isFinalValue
            if (r5 == 0) goto L4d
            r7.updateFromFinalVariable(r8, r4, r3)
            goto L39
        L4d:
            androidx.constraintlayout.solver.ArrayRow[] r5 = r8.mRows
            int r4 = r4.definitionId
            r4 = r5[r4]
            r7.updateFromRow(r4, r3)
            goto L39
        L57:
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r2 = r7.variablesToUpdate
            r2.clear()
            goto L8
        L5d:
            r1 = 1
            goto L8
        L5f:
            return
    }
}
