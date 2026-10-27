package androidx.constraintlayout.solver.widgets.analyzer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int direction;
    public boolean dual;
    androidx.constraintlayout.solver.widgets.analyzer.WidgetRun firstRun;
    int groupIndex;
    androidx.constraintlayout.solver.widgets.analyzer.WidgetRun lastRun;
    public int position;
    java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> runs;

    public RunGroup(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.position = r0
            r1.dual = r0
            r0 = 0
            r1.firstRun = r0
            r1.lastRun = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.runs = r0
            int r0 = androidx.constraintlayout.solver.widgets.analyzer.RunGroup.index
            r1.groupIndex = r0
            int r0 = r0 + 1
            androidx.constraintlayout.solver.widgets.analyzer.RunGroup.index = r0
            r1.firstRun = r2
            r1.lastRun = r2
            r1.direction = r3
            return
    }

    private boolean defineTerminalWidget(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r6, int r7) {
            r5 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r6.widget
            boolean[] r0 = r0.isTerminalWidget
            boolean r0 = r0[r7]
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r6.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r2 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r3 == 0) goto L12
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r3 = r2.run
            if (r3 != r6) goto L29
            goto L12
        L29:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.start
            if (r2 != r3) goto L12
            boolean r3 = r6 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            if (r3 == 0) goto L4a
            r3 = r6
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r3 = (androidx.constraintlayout.solver.widgets.analyzer.ChainRun) r3
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r3 = r3.widgets
            java.util.Iterator r3 = r3.iterator()
        L3a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L54
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r4
            r5.defineTerminalWidget(r4, r7)
            goto L3a
        L4a:
            boolean r3 = r6 instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences
            if (r3 != 0) goto L54
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r6.widget
            boolean[] r3 = r3.isTerminalWidget
            r3[r7] = r1
        L54:
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = r2.run
            r5.defineTerminalWidget(r2, r7)
            goto L12
        L5a:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r6.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r0 = r0.iterator()
        L62:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r2 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r3 == 0) goto L62
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r3 = r2.run
            if (r3 != r6) goto L79
            goto L62
        L79:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.start
            if (r2 != r3) goto L62
            boolean r3 = r6 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            if (r3 == 0) goto L9a
            r3 = r6
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r3 = (androidx.constraintlayout.solver.widgets.analyzer.ChainRun) r3
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r3 = r3.widgets
            java.util.Iterator r3 = r3.iterator()
        L8a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La4
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r4
            r5.defineTerminalWidget(r4, r7)
            goto L8a
        L9a:
            boolean r3 = r6 instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences
            if (r3 != 0) goto La4
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r6.widget
            boolean[] r3 = r3.isTerminalWidget
            r3[r7] = r1
        La4:
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = r2.run
            r5.defineTerminalWidget(r2, r7)
            goto L62
        Laa:
            return r1
    }

    private long traverseEnd(androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9, long r10) {
            r8 = this;
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r0 = r9.run
            boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r1 = r9.dependencies
            int r1 = r1.size()
            r2 = 0
            r3 = r10
        Lf:
            if (r2 >= r1) goto L33
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r5 = r9.dependencies
            java.lang.Object r5 = r5.get(r2)
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r5 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r6 == 0) goto L30
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r5
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r6 = r5.run
            if (r6 != r0) goto L24
            goto L30
        L24:
            int r6 = r5.margin
            long r6 = (long) r6
            long r6 = r6 + r10
            long r5 = r8.traverseEnd(r5, r6)
            long r3 = java.lang.Math.min(r3, r5)
        L30:
            int r2 = r2 + 1
            goto Lf
        L33:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.end
            if (r9 != r1) goto L51
            long r1 = r0.getWrapDimension()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r0.start
            long r10 = r10 - r1
            long r1 = r8.traverseEnd(r9, r10)
            long r1 = java.lang.Math.min(r3, r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r0.start
            int r9 = r9.margin
            long r3 = (long) r9
            long r10 = r10 - r3
            long r9 = java.lang.Math.min(r1, r10)
            return r9
        L51:
            return r3
    }

    private long traverseStart(androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9, long r10) {
            r8 = this;
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r0 = r9.run
            boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r1 = r9.dependencies
            int r1 = r1.size()
            r2 = 0
            r3 = r10
        Lf:
            if (r2 >= r1) goto L33
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r5 = r9.dependencies
            java.lang.Object r5 = r5.get(r2)
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r5 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r6 == 0) goto L30
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r5
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r6 = r5.run
            if (r6 != r0) goto L24
            goto L30
        L24:
            int r6 = r5.margin
            long r6 = (long) r6
            long r6 = r6 + r10
            long r5 = r8.traverseStart(r5, r6)
            long r3 = java.lang.Math.max(r3, r5)
        L30:
            int r2 = r2 + 1
            goto Lf
        L33:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.start
            if (r9 != r1) goto L51
            long r1 = r0.getWrapDimension()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r0.end
            long r10 = r10 + r1
            long r1 = r8.traverseStart(r9, r10)
            long r1 = java.lang.Math.max(r3, r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r0.end
            int r9 = r9.margin
            long r3 = (long) r9
            long r10 = r10 - r3
            long r9 = java.lang.Math.max(r1, r10)
            return r9
        L51:
            return r3
    }

    public void add(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r1.runs
            r0.add(r2)
            r1.lastRun = r2
            return
    }

    public long computeWrapSize(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r13, int r14) {
            r12 = this;
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r0 = r12.firstRun
            boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            r2 = 0
            if (r1 == 0) goto L10
            r1 = r0
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.ChainRun) r1
            int r1 = r1.orientation
            if (r1 == r14) goto L1c
            return r2
        L10:
            if (r14 != 0) goto L17
            boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun
            if (r1 != 0) goto L1c
            return r2
        L17:
            boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            if (r1 != 0) goto L1c
            return r2
        L1c:
            if (r14 != 0) goto L23
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r13.horizontalRun
        L20:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.start
            goto L26
        L23:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r13.verticalRun
            goto L20
        L26:
            if (r14 != 0) goto L2d
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r13 = r13.horizontalRun
        L2a:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r13 = r13.end
            goto L30
        L2d:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r13 = r13.verticalRun
            goto L2a
        L30:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            boolean r0 = r0.contains(r1)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = r12.firstRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            boolean r13 = r1.contains(r13)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = r12.firstRun
            long r4 = r1.getWrapDimension()
            if (r0 == 0) goto Lac
            if (r13 == 0) goto Lac
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r13 = r12.firstRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r13 = r13.start
            long r0 = r12.traverseStart(r13, r2)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r13 = r12.firstRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r13 = r13.end
            long r6 = r12.traverseEnd(r13, r2)
            long r0 = r0 - r4
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r13 = r12.firstRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = r13.end
            int r8 = r8.margin
            int r9 = -r8
            long r9 = (long) r9
            int r11 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r11 < 0) goto L6b
            long r8 = (long) r8
            long r0 = r0 + r8
        L6b:
            long r6 = -r6
            long r6 = r6 - r4
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = r13.start
            int r8 = r8.margin
            long r9 = (long) r8
            long r6 = r6 - r9
            long r9 = (long) r8
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L7a
            long r8 = (long) r8
            long r6 = r6 - r8
        L7a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = r13.widget
            float r13 = r13.getBiasPercent(r14)
            r14 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 <= 0) goto L8f
            float r14 = (float) r6
            float r14 = r14 / r13
            float r0 = (float) r0
            float r1 = r8 - r13
            float r0 = r0 / r1
            float r14 = r14 + r0
            long r2 = (long) r14
        L8f:
            float r14 = (float) r2
            float r0 = r14 * r13
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            long r2 = (long) r0
            float r8 = r8 - r13
            float r14 = r14 * r8
            float r14 = r14 + r1
            long r13 = (long) r14
            long r2 = r2 + r4
            long r2 = r2 + r13
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r13 = r12.firstRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r14 = r13.start
            int r14 = r14.margin
            long r0 = (long) r14
            long r0 = r0 + r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r13 = r13.end
            int r13 = r13.margin
        La9:
            long r13 = (long) r13
            long r0 = r0 - r13
            return r0
        Lac:
            if (r0 == 0) goto Lc6
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r13 = r12.firstRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r13 = r13.start
            int r14 = r13.margin
            long r0 = (long) r14
            long r13 = r12.traverseStart(r13, r0)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r0 = r12.firstRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.margin
            long r0 = (long) r0
            long r0 = r0 + r4
            long r13 = java.lang.Math.max(r13, r0)
            return r13
        Lc6:
            if (r13 == 0) goto Le2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r13 = r12.firstRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r13 = r13.end
            int r14 = r13.margin
            long r0 = (long) r14
            long r13 = r12.traverseEnd(r13, r0)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r0 = r12.firstRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.margin
            int r0 = -r0
            long r0 = (long) r0
            long r0 = r0 + r4
            long r13 = -r13
            long r13 = java.lang.Math.max(r13, r0)
            return r13
        Le2:
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r13 = r12.firstRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r14 = r13.start
            int r14 = r14.margin
            long r0 = (long) r14
            long r13 = r13.getWrapDimension()
            long r0 = r0 + r13
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r13 = r12.firstRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r13 = r13.end
            int r13 = r13.margin
            goto La9
    }

    public void defineTerminalWidgets(boolean r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = r1.firstRun
            boolean r0 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun
            if (r0 == 0) goto Lc
            r0 = 0
            r1.defineTerminalWidget(r2, r0)
        Lc:
            if (r3 == 0) goto L18
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = r1.firstRun
            boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            if (r3 == 0) goto L18
            r3 = 1
            r1.defineTerminalWidget(r2, r3)
        L18:
            return
    }
}
