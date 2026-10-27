package androidx.constraintlayout.solver.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class HelperWidget extends androidx.constraintlayout.solver.widgets.ConstraintWidget implements androidx.constraintlayout.solver.widgets.Helper {
    public androidx.constraintlayout.solver.widgets.ConstraintWidget[] mWidgets;
    public int mWidgetsCount;

    public HelperWidget() {
            r1 = this;
            r1.<init>()
            r0 = 4
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r0]
            r1.mWidgets = r0
            r0 = 0
            r1.mWidgetsCount = r0
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.Helper
    public void add(androidx.constraintlayout.solver.widgets.ConstraintWidget r4) {
            r3 = this;
            if (r4 == r3) goto L23
            if (r4 != 0) goto L5
            goto L23
        L5:
            int r0 = r3.mWidgetsCount
            int r0 = r0 + 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r3.mWidgets
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidget[]) r0
            r3.mWidgets = r0
        L19:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r3.mWidgets
            int r1 = r3.mWidgetsCount
            r0[r1] = r4
            int r1 = r1 + 1
            r3.mWidgetsCount = r1
        L23:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.solver.widgets.ConstraintWidget r4, java.util.HashMap<androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget> r5) {
            r3 = this;
            super.copy(r4, r5)
            androidx.constraintlayout.solver.widgets.HelperWidget r4 = (androidx.constraintlayout.solver.widgets.HelperWidget) r4
            r0 = 0
            r3.mWidgetsCount = r0
            int r1 = r4.mWidgetsCount
        La:
            if (r0 >= r1) goto L1c
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = r4.mWidgets
            r2 = r2[r0]
            java.lang.Object r2 = r5.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
            r3.add(r2)
            int r0 = r0 + 1
            goto La
        L1c:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.Helper
    public void removeAllIds() {
            r2 = this;
            r0 = 0
            r2.mWidgetsCount = r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r2.mWidgets
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.Helper
    public void updateConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1) {
            r0 = this;
            return
    }
}
