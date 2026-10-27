package androidx.constraintlayout.solver.widgets.analyzer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ChainRun extends androidx.constraintlayout.solver.widgets.analyzer.WidgetRun {
    private int chainStyle;
    java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> widgets;

    public ChainRun(androidx.constraintlayout.solver.widgets.ConstraintWidget r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.widgets = r1
            r0.orientation = r2
            r0.build()
            return
    }

    private void build() {
            r5 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            int r1 = r5.orientation
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.getPreviousChainMember(r1)
        L8:
            r4 = r1
            r1 = r0
            r0 = r4
            if (r0 == 0) goto L14
            int r1 = r5.orientation
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.getPreviousChainMember(r1)
            goto L8
        L14:
            r5.widget = r1
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r2 = r5.orientation
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = r1.getRun(r2)
            r0.add(r2)
            int r0 = r5.orientation
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.getNextChainMember(r0)
        L27:
            if (r0 == 0) goto L3b
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r1 = r5.widgets
            int r2 = r5.orientation
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = r0.getRun(r2)
            r1.add(r2)
            int r1 = r5.orientation
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getNextChainMember(r1)
            goto L27
        L3b:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r5.widgets
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r1
            int r3 = r5.orientation
            if (r3 != 0) goto L57
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.widget
            r1.horizontalChainRun = r5
            goto L41
        L57:
            if (r3 != r2) goto L41
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.widget
            r1.verticalChainRun = r5
            goto L41
        L5e:
            int r0 = r5.orientation
            if (r0 != 0) goto L89
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r0
            boolean r0 = r0.isRtl()
            if (r0 == 0) goto L89
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r0 = r0.size()
            if (r0 <= r2) goto L89
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r1 = r0.size()
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r0 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.widget
            r5.widget = r0
        L89:
            int r0 = r5.orientation
            if (r0 != 0) goto L94
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            int r0 = r0.getHorizontalChainStyle()
            goto L9a
        L94:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            int r0 = r0.getVerticalChainStyle()
        L9a:
            r5.chainStyle = r0
            return
    }

    private androidx.constraintlayout.solver.widgets.ConstraintWidget getFirstVisibleWidget() {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r1 = r4.widgets
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r1 = r4.widgets
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r1.widget
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1e
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.widget
            return r0
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            r0 = 0
            return r0
    }

    private androidx.constraintlayout.solver.widgets.ConstraintWidget getLastVisibleWidget() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r4.widgets
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L22
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r1 = r4.widgets
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r1.widget
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.widget
            return r0
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void apply() {
            r5 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r5.widgets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r1
            r1.apply()
            goto L6
        L16:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r2 = r5.widgets
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.widget
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r5.widgets
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r0 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.widget
            int r4 = r5.orientation
            if (r4 != 0) goto L76
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r5.getTarget(r1, r3)
            int r1 = r1.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r5.getFirstVisibleWidget()
            if (r4 == 0) goto L52
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r4.mLeft
            int r1 = r1.getMargin()
        L52:
            if (r2 == 0) goto L59
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r5.start
            r5.addTarget(r4, r2, r1)
        L59:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r5.getTarget(r0, r3)
            int r0 = r0.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r5.getLastVisibleWidget()
            if (r2 == 0) goto L6d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mRight
            int r0 = r0.getMargin()
        L6d:
            if (r1 == 0) goto Lb1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r5.end
            int r0 = -r0
            r5.addTarget(r2, r1, r0)
            goto Lb1
        L76:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r5.getTarget(r2, r1)
            int r2 = r2.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r5.getFirstVisibleWidget()
            if (r4 == 0) goto L8e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r4.mTop
            int r2 = r2.getMargin()
        L8e:
            if (r3 == 0) goto L95
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r5.start
            r5.addTarget(r4, r3, r2)
        L95:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r5.getTarget(r0, r1)
            int r0 = r0.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r5.getLastVisibleWidget()
            if (r2 == 0) goto La9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mBottom
            int r0 = r0.getMargin()
        La9:
            if (r1 == 0) goto Lb1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r5.end
            int r0 = -r0
            r5.addTarget(r2, r1, r0)
        Lb1:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            r0.updateDelegate = r5
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.end
            r0.updateDelegate = r5
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void applyToWidget() {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r1 = r2.widgets
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r1 = r2.widgets
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r1
            r1.applyToWidget()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void clear() {
            r2 = this;
            r0 = 0
            r2.runGroup = r0
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r2.widgets
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r1
            r1.clear()
            goto L9
        L19:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
            r7 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r7.widgets
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L27
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r7.widgets
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r4
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r4.start
            int r5 = r5.margin
            long r5 = (long) r5
            long r1 = r1 + r5
            long r5 = r4.getWrapDimension()
            long r1 = r1 + r5
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r4.end
            int r4 = r4.margin
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L9
        L27:
            return r1
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void reset() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r2.start
            r1 = 0
            r0.resolved = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r2.end
            r0.resolved = r1
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    boolean supportsWrapComputation() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r4.widgets
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1c
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r3 = r4.widgets
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r3
            boolean r3 = r3.supportsWrapComputation()
            if (r3 != 0) goto L19
            return r1
        L19:
            int r2 = r2 + 1
            goto L8
        L1c:
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ChainRun "
            r0.append(r1)
            int r1 = r4.orientation
            if (r1 != 0) goto L11
            java.lang.String r1 = "horizontal : "
            goto L14
        L11:
            java.lang.String r1 = "vertical : "
        L14:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r1 = r4.widgets
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "<"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "> "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L21
        L5f:
            return r0
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.solver.widgets.analyzer.Dependency r27) {
            r26 = this;
            r0 = r26
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r1 = r1.resolved
            if (r1 == 0) goto L43d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.end
            boolean r1 = r1.resolved
            if (r1 != 0) goto L10
            goto L43d
        L10:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.getParent()
            if (r1 == 0) goto L23
            boolean r3 = r1 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r3 == 0) goto L23
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r1
            boolean r1 = r1.isRtl()
            goto L24
        L23:
            r1 = 0
        L24:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r0.end
            int r3 = r3.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r0.start
            int r4 = r4.value
            int r3 = r3 - r4
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r0.widgets
            int r4 = r4.size()
            r5 = 0
        L34:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L4c
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r8 = r0.widgets
            java.lang.Object r8 = r8.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r8.widget
            int r8 = r8.getVisibility()
            if (r8 != r7) goto L4d
            int r5 = r5 + 1
            goto L34
        L4c:
            r5 = -1
        L4d:
            int r8 = r4 + (-1)
            r9 = r8
        L50:
            if (r9 < 0) goto L66
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r10 = r0.widgets
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r10.widget
            int r10 = r10.getVisibility()
            if (r10 != r7) goto L65
            int r9 = r9 + (-1)
            goto L50
        L65:
            r6 = r9
        L66:
            r9 = 0
        L67:
            r11 = 2
            if (r9 >= r11) goto L114
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L71:
            if (r13 >= r4) goto L100
            r27 = 0
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r10 = r0.widgets
            java.lang.Object r10 = r10.get(r13)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            int r2 = r2.getVisibility()
            if (r2 != r7) goto L89
            r20 = r1
            goto Lf7
        L89:
            int r16 = r16 + 1
            if (r13 <= 0) goto L94
            if (r13 < r5) goto L94
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.start
            int r2 = r2.margin
            int r14 = r14 + r2
        L94:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.dimension
            int r11 = r2.value
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = r10.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 == r12) goto La0
            r7 = 1
            goto La1
        La0:
            r7 = 0
        La1:
            if (r7 == 0) goto Lc5
            int r2 = r0.orientation
            if (r2 != 0) goto Lb3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = r10.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r12 = r12.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r12 = r12.dimension
            boolean r12 = r12.resolved
            if (r12 != 0) goto Lb3
            goto L43d
        Lb3:
            r12 = 1
            if (r2 != r12) goto Lc2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r2.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            boolean r2 = r2.resolved
            if (r2 != 0) goto Lc2
            goto L43d
        Lc2:
            r20 = r1
            goto Ld9
        Lc5:
            r20 = r1
            r12 = 1
            int r1 = r10.matchConstraintsType
            if (r1 != r12) goto Ld4
            if (r9 != 0) goto Ld4
            int r11 = r2.wrapValue
            int r15 = r15 + 1
        Ld2:
            r7 = 1
            goto Ld9
        Ld4:
            boolean r1 = r2.resolved
            if (r1 == 0) goto Ld9
            goto Ld2
        Ld9:
            if (r7 != 0) goto Lec
            int r15 = r15 + 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.widget
            float[] r1 = r1.mWeight
            int r2 = r0.orientation
            r1 = r1[r2]
            int r2 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r2 < 0) goto Led
            float r17 = r17 + r1
            goto Led
        Lec:
            int r14 = r14 + r11
        Led:
            if (r13 >= r8) goto Lf7
            if (r13 >= r6) goto Lf7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.end
            int r1 = r1.margin
            int r1 = -r1
            int r14 = r14 + r1
        Lf7:
            int r13 = r13 + 1
            r1 = r20
            r7 = 8
            r11 = 2
            goto L71
        L100:
            r20 = r1
            r27 = 0
            if (r14 < r3) goto L111
            if (r15 != 0) goto L109
            goto L111
        L109:
            int r9 = r9 + 1
            r1 = r20
            r7 = 8
            goto L67
        L111:
            r1 = r16
            goto L11d
        L114:
            r20 = r1
            r27 = 0
            r1 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L11d:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r0.start
            int r2 = r2.value
            if (r20 == 0) goto L127
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r0.end
            int r2 = r2.value
        L127:
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L13e
            r9 = 1073741824(0x40000000, float:2.0)
            if (r20 == 0) goto L137
            int r10 = r14 - r3
            float r10 = (float) r10
            float r10 = r10 / r9
            float r10 = r10 + r7
            int r9 = (int) r10
            int r2 = r2 + r9
            goto L13e
        L137:
            int r10 = r14 - r3
            float r10 = (float) r10
            float r10 = r10 / r9
            float r10 = r10 + r7
            int r9 = (int) r10
            int r2 = r2 - r9
        L13e:
            if (r15 <= 0) goto L244
            int r9 = r3 - r14
            float r9 = (float) r9
            float r10 = (float) r15
            float r10 = r9 / r10
            float r10 = r10 + r7
            int r10 = (int) r10
            r11 = 0
            r12 = 0
        L14a:
            if (r11 >= r4) goto L1fb
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r13 = r0.widgets
            java.lang.Object r13 = r13.get(r11)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r13 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r13
            r16 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r13.widget
            int r7 = r7.getVisibility()
            r21 = r2
            r2 = 8
            if (r7 != r2) goto L16c
        L162:
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            goto L1ed
        L16c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r13.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r7) goto L162
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r13.dimension
            boolean r7 = r2.resolved
            if (r7 != 0) goto L162
            int r7 = (r17 > r27 ? 1 : (r17 == r27 ? 0 : -1))
            if (r7 <= 0) goto L190
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r13.widget
            float[] r7 = r7.mWeight
            r22 = r7
            int r7 = r0.orientation
            r7 = r22[r7]
            float r7 = r7 * r9
            float r7 = r7 / r17
            float r7 = r7 + r16
            int r7 = (int) r7
        L18d:
            r22 = r9
            goto L192
        L190:
            r7 = r10
            goto L18d
        L192:
            int r9 = r0.orientation
            if (r9 != 0) goto L1bc
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r13.widget
            r23 = r10
            int r10 = r9.mMatchConstraintMaxWidth
            int r9 = r9.mMatchConstraintMinWidth
            r24 = r11
            int r11 = r13.matchConstraintsType
            r25 = r12
            r12 = 1
            if (r11 != r12) goto L1ae
            int r2 = r2.wrapValue
            int r2 = java.lang.Math.min(r7, r2)
            goto L1af
        L1ae:
            r2 = r7
        L1af:
            int r2 = java.lang.Math.max(r9, r2)
            if (r10 <= 0) goto L1b9
            int r2 = java.lang.Math.min(r10, r2)
        L1b9:
            if (r2 == r7) goto L1e5
            goto L1e1
        L1bc:
            r23 = r10
            r24 = r11
            r25 = r12
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r13.widget
            int r10 = r9.mMatchConstraintMaxHeight
            int r9 = r9.mMatchConstraintMinHeight
            int r11 = r13.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L1d4
            int r2 = r2.wrapValue
            int r2 = java.lang.Math.min(r7, r2)
            goto L1d5
        L1d4:
            r2 = r7
        L1d5:
            int r2 = java.lang.Math.max(r9, r2)
            if (r10 <= 0) goto L1df
            int r2 = java.lang.Math.min(r10, r2)
        L1df:
            if (r2 == r7) goto L1e5
        L1e1:
            int r12 = r25 + 1
            r7 = r2
            goto L1e7
        L1e5:
            r12 = r25
        L1e7:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r13.dimension
            r2.resolve(r7)
            goto L1ef
        L1ed:
            r12 = r25
        L1ef:
            int r11 = r24 + 1
            r2 = r21
            r9 = r22
            r10 = r23
            r7 = 1056964608(0x3f000000, float:0.5)
            goto L14a
        L1fb:
            r21 = r2
            r25 = r12
            r16 = 1056964608(0x3f000000, float:0.5)
            if (r25 <= 0) goto L237
            int r15 = r15 - r25
            r2 = 0
            r14 = 0
        L207:
            if (r2 >= r4) goto L237
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r7 = r0.widgets
            java.lang.Object r7 = r7.get(r2)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r7.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L21c
            goto L234
        L21c:
            if (r2 <= 0) goto L225
            if (r2 < r5) goto L225
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            int r9 = r9.margin
            int r14 = r14 + r9
        L225:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r9 = r7.dimension
            int r9 = r9.value
            int r14 = r14 + r9
            if (r2 >= r8) goto L234
            if (r2 >= r6) goto L234
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.end
            int r7 = r7.margin
            int r7 = -r7
            int r14 = r14 + r7
        L234:
            int r2 = r2 + 1
            goto L207
        L237:
            int r2 = r0.chainStyle
            r7 = 2
            if (r2 != r7) goto L242
            if (r25 != 0) goto L242
            r2 = 0
            r0.chainStyle = r2
            goto L24a
        L242:
            r2 = 0
            goto L24a
        L244:
            r21 = r2
            r2 = 0
            r7 = 2
            r16 = 1056964608(0x3f000000, float:0.5)
        L24a:
            if (r14 <= r3) goto L24e
            r0.chainStyle = r7
        L24e:
            if (r1 <= 0) goto L256
            if (r15 != 0) goto L256
            if (r5 != r6) goto L256
            r0.chainStyle = r7
        L256:
            int r7 = r0.chainStyle
            r12 = 1
            if (r7 != r12) goto L2f9
            if (r1 <= r12) goto L261
            int r3 = r3 - r14
            int r1 = r1 - r12
            int r3 = r3 / r1
            goto L26a
        L261:
            if (r1 != r12) goto L269
            int r3 = r3 - r14
            r18 = 2
            int r3 = r3 / 2
            goto L26a
        L269:
            r3 = 0
        L26a:
            if (r15 <= 0) goto L26d
            r3 = 0
        L26d:
            r1 = r21
        L26f:
            if (r2 >= r4) goto L43d
            if (r20 == 0) goto L278
            int r7 = r2 + 1
            int r7 = r4 - r7
            goto L279
        L278:
            r7 = r2
        L279:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r7 = r9.get(r7)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r7.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L296
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            r9.resolve(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.end
            r7.resolve(r1)
            goto L2f5
        L296:
            if (r2 <= 0) goto L29d
            if (r20 == 0) goto L29c
            int r1 = r1 - r3
            goto L29d
        L29c:
            int r1 = r1 + r3
        L29d:
            if (r2 <= 0) goto L2ae
            if (r2 < r5) goto L2ae
            if (r20 == 0) goto L2a9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            int r9 = r9.margin
            int r1 = r1 - r9
            goto L2ae
        L2a9:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            int r9 = r9.margin
            int r1 = r1 + r9
        L2ae:
            if (r20 == 0) goto L2b6
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.end
            r9.resolve(r1)
            goto L2bb
        L2b6:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            r9.resolve(r1)
        L2bb:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r9 = r7.dimension
            int r10 = r9.value
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r7.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L2cc
            int r11 = r7.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L2cc
            int r10 = r9.wrapValue
        L2cc:
            if (r20 == 0) goto L2d0
            int r1 = r1 - r10
            goto L2d1
        L2d0:
            int r1 = r1 + r10
        L2d1:
            if (r20 == 0) goto L2da
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            r9.resolve(r1)
        L2d8:
            r12 = 1
            goto L2e0
        L2da:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.end
            r9.resolve(r1)
            goto L2d8
        L2e0:
            r7.resolved = r12
            if (r2 >= r8) goto L2f5
            if (r2 >= r6) goto L2f5
            if (r20 == 0) goto L2ef
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.end
            int r7 = r7.margin
            int r7 = -r7
            int r1 = r1 - r7
            goto L2f5
        L2ef:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.end
            int r7 = r7.margin
            int r7 = -r7
            int r1 = r1 + r7
        L2f5:
            int r2 = r2 + 1
            goto L26f
        L2f9:
            if (r7 != 0) goto L38e
            int r3 = r3 - r14
            r19 = 1
            int r1 = r1 + 1
            int r3 = r3 / r1
            if (r15 <= 0) goto L304
            r3 = 0
        L304:
            r1 = r21
        L306:
            if (r2 >= r4) goto L43d
            if (r20 == 0) goto L30f
            int r7 = r2 + 1
            int r7 = r4 - r7
            goto L310
        L30f:
            r7 = r2
        L310:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r7 = r9.get(r7)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r7.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L32d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            r9.resolve(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.end
            r7.resolve(r1)
            goto L38a
        L32d:
            if (r20 == 0) goto L331
            int r1 = r1 - r3
            goto L332
        L331:
            int r1 = r1 + r3
        L332:
            if (r2 <= 0) goto L343
            if (r2 < r5) goto L343
            if (r20 == 0) goto L33e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            int r9 = r9.margin
            int r1 = r1 - r9
            goto L343
        L33e:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            int r9 = r9.margin
            int r1 = r1 + r9
        L343:
            if (r20 == 0) goto L34b
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.end
            r9.resolve(r1)
            goto L350
        L34b:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            r9.resolve(r1)
        L350:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r9 = r7.dimension
            int r10 = r9.value
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r7.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L365
            int r11 = r7.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L365
            int r9 = r9.wrapValue
            int r10 = java.lang.Math.min(r10, r9)
        L365:
            if (r20 == 0) goto L369
            int r1 = r1 - r10
            goto L36a
        L369:
            int r1 = r1 + r10
        L36a:
            if (r20 == 0) goto L372
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            r9.resolve(r1)
            goto L377
        L372:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.end
            r9.resolve(r1)
        L377:
            if (r2 >= r8) goto L38a
            if (r2 >= r6) goto L38a
            if (r20 == 0) goto L384
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.end
            int r7 = r7.margin
            int r7 = -r7
            int r1 = r1 - r7
            goto L38a
        L384:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.end
            int r7 = r7.margin
            int r7 = -r7
            int r1 = r1 + r7
        L38a:
            int r2 = r2 + 1
            goto L306
        L38e:
            r1 = 2
            if (r7 != r1) goto L43d
            int r1 = r0.orientation
            if (r1 != 0) goto L39c
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.widget
            float r1 = r1.getHorizontalBiasPercent()
            goto L3a2
        L39c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.widget
            float r1 = r1.getVerticalBiasPercent()
        L3a2:
            if (r20 == 0) goto L3a8
            r7 = 1065353216(0x3f800000, float:1.0)
            float r1 = r7 - r1
        L3a8:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r1
            float r3 = r3 + r16
            int r1 = (int) r3
            if (r1 < 0) goto L3b3
            if (r15 <= 0) goto L3b4
        L3b3:
            r1 = 0
        L3b4:
            if (r20 == 0) goto L3b9
            int r1 = r21 - r1
            goto L3bb
        L3b9:
            int r1 = r21 + r1
        L3bb:
            if (r2 >= r4) goto L43d
            if (r20 == 0) goto L3c4
            int r3 = r2 + 1
            int r3 = r4 - r3
            goto L3c5
        L3c4:
            r3 = r2
        L3c5:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r7 = r0.widgets
            java.lang.Object r3 = r7.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r3.widget
            int r7 = r7.getVisibility()
            r10 = 8
            if (r7 != r10) goto L3e3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r3.start
            r7.resolve(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.end
            r3.resolve(r1)
            r12 = 1
            goto L439
        L3e3:
            if (r2 <= 0) goto L3f4
            if (r2 < r5) goto L3f4
            if (r20 == 0) goto L3ef
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r3.start
            int r7 = r7.margin
            int r1 = r1 - r7
            goto L3f4
        L3ef:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r3.start
            int r7 = r7.margin
            int r1 = r1 + r7
        L3f4:
            if (r20 == 0) goto L3fc
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r3.end
            r7.resolve(r1)
            goto L401
        L3fc:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r3.start
            r7.resolve(r1)
        L401:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r3.dimension
            int r9 = r7.value
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r3.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L413
            int r11 = r3.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L414
            int r9 = r7.wrapValue
            goto L414
        L413:
            r12 = 1
        L414:
            if (r20 == 0) goto L418
            int r1 = r1 - r9
            goto L419
        L418:
            int r1 = r1 + r9
        L419:
            if (r20 == 0) goto L421
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r3.start
            r7.resolve(r1)
            goto L426
        L421:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r3.end
            r7.resolve(r1)
        L426:
            if (r2 >= r8) goto L439
            if (r2 >= r6) goto L439
            if (r20 == 0) goto L433
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.end
            int r3 = r3.margin
            int r3 = -r3
            int r1 = r1 - r3
            goto L439
        L433:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.end
            int r3 = r3.margin
            int r3 = -r3
            int r1 = r1 + r3
        L439:
            int r2 = r2 + 1
            goto L3bb
        L43d:
            return
    }
}
