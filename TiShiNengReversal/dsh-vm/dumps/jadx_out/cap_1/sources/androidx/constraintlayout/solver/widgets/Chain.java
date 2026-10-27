package androidx.constraintlayout.solver.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class Chain {
    private static final boolean DEBUG = false;

    Chain() {
            r0 = this;
            r0.<init>()
            return
    }

    static void applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5, androidx.constraintlayout.solver.LinearSystem r6, int r7) {
            r0 = 0
            if (r7 != 0) goto L9
            int r1 = r5.mHorizontalChainsSize
            androidx.constraintlayout.solver.widgets.ChainHead[] r2 = r5.mHorizontalChainsArray
            r3 = 0
            goto Le
        L9:
            int r1 = r5.mVerticalChainsSize
            androidx.constraintlayout.solver.widgets.ChainHead[] r2 = r5.mVerticalChainsArray
            r3 = 2
        Le:
            if (r0 >= r1) goto L1b
            r4 = r2[r0]
            r4.define()
            applyChainConstraints(r5, r6, r7, r3, r4)
            int r0 = r0 + 1
            goto Le
        L1b:
            return
    }

    static void applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r36, androidx.constraintlayout.solver.LinearSystem r37, int r38, int r39, androidx.constraintlayout.solver.widgets.ChainHead r40) {
            r0 = r36
            r1 = r37
            r2 = r40
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r2.mFirst
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r2.mLast
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r2.mFirstVisibleWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = r2.mLastVisibleWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r2.mHead
            float r4 = r2.mTotalWeight
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r0.mListDimensionBehaviors
            r5 = r5[r38]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r13 = 1
            if (r5 != r6) goto L1d
            r5 = 1
            goto L1e
        L1d:
            r5 = 0
        L1e:
            r6 = 2
            if (r38 != 0) goto L35
            int r8 = r3.mHorizontalChainStyle
            if (r8 != 0) goto L27
            r14 = 1
            goto L28
        L27:
            r14 = 0
        L28:
            if (r8 != r13) goto L2c
            r15 = 1
            goto L2d
        L2c:
            r15 = 0
        L2d:
            if (r8 != r6) goto L31
        L2f:
            r6 = 1
            goto L32
        L31:
            r6 = 0
        L32:
            r13 = r9
            r8 = 0
            goto L44
        L35:
            int r8 = r3.mVerticalChainStyle
            if (r8 != 0) goto L3b
            r14 = 1
            goto L3c
        L3b:
            r14 = 0
        L3c:
            if (r8 != r13) goto L40
            r15 = 1
            goto L41
        L40:
            r15 = 0
        L41:
            if (r8 != r6) goto L31
            goto L2f
        L44:
            r18 = r4
            r21 = 0
            if (r8 != 0) goto L11e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r13.mListAnchors
            r4 = r4[r39]
            if (r6 == 0) goto L53
            r19 = 1
            goto L55
        L53:
            r19 = 4
        L55:
            int r22 = r4.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r13.mListDimensionBehaviors
            r7 = r7[r38]
            r23 = r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r5) goto L6d
            int[] r7 = r13.mResolvedMatchConstraintDefault
            r7 = r7[r38]
            if (r7 != 0) goto L6d
            r7 = 1
        L6a:
            r24 = r6
            goto L6f
        L6d:
            r7 = 0
            goto L6a
        L6f:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r4.mTarget
            if (r6 == 0) goto L7b
            if (r13 == r9) goto L7b
            int r6 = r6.getMargin()
            int r22 = r22 + r6
        L7b:
            r6 = r22
            if (r24 == 0) goto L85
            if (r13 == r9) goto L85
            if (r13 == r11) goto L85
            r19 = 5
        L85:
            r22 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r4.mTarget
            if (r7 == 0) goto Lb9
            if (r13 != r11) goto L9a
            r25 = r8
            androidx.constraintlayout.solver.SolverVariable r8 = r4.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
            r26 = r14
            r14 = 6
            r1.addGreaterThan(r8, r7, r6, r14)
            goto La7
        L9a:
            r25 = r8
            r26 = r14
            androidx.constraintlayout.solver.SolverVariable r8 = r4.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
            r14 = 8
            r1.addGreaterThan(r8, r7, r6, r14)
        La7:
            if (r22 == 0) goto Lad
            if (r24 != 0) goto Lad
            r7 = 5
            goto Laf
        Lad:
            r7 = r19
        Laf:
            androidx.constraintlayout.solver.SolverVariable r8 = r4.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            r1.addEquality(r8, r4, r6, r7)
            goto Lbd
        Lb9:
            r25 = r8
            r26 = r14
        Lbd:
            if (r23 == 0) goto Lf1
            int r4 = r13.getVisibility()
            r14 = 8
            if (r4 == r14) goto Ldf
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r13.mListDimensionBehaviors
            r4 = r4[r38]
            if (r4 != r5) goto Ldf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r13.mListAnchors
            int r5 = r39 + 1
            r5 = r4[r5]
            androidx.constraintlayout.solver.SolverVariable r5 = r5.mSolverVariable
            r4 = r4[r39]
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            r6 = 5
            r7 = 0
            r1.addGreaterThan(r5, r4, r7, r6)
            goto Le0
        Ldf:
            r7 = 0
        Le0:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r13.mListAnchors
            r4 = r4[r39]
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r0.mListAnchors
            r5 = r5[r39]
            androidx.constraintlayout.solver.SolverVariable r5 = r5.mSolverVariable
            r14 = 8
            r1.addGreaterThan(r4, r5, r7, r14)
        Lf1:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r13.mListAnchors
            int r5 = r39 + 1
            r4 = r4[r5]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L10c
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r4.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r4.mListAnchors
            r5 = r5[r39]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L10c
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.mOwner
            if (r5 == r13) goto L10a
            goto L10c
        L10a:
            r21 = r4
        L10c:
            if (r21 == 0) goto L113
            r13 = r21
            r8 = r25
            goto L114
        L113:
            r8 = 1
        L114:
            r4 = r18
            r5 = r23
            r6 = r24
            r14 = r26
            goto L44
        L11e:
            r23 = r5
            r24 = r6
            r26 = r14
            if (r12 == 0) goto L182
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r10.mListAnchors
            int r5 = r39 + 1
            r4 = r4[r5]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L182
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r12.mListAnchors
            r4 = r4[r5]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r12.mListDimensionBehaviors
            r6 = r6[r38]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r7) goto L158
            int[] r6 = r12.mResolvedMatchConstraintDefault
            r6 = r6[r38]
            if (r6 != 0) goto L158
            if (r24 != 0) goto L158
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r4.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.mOwner
            if (r7 != r0) goto L158
            androidx.constraintlayout.solver.SolverVariable r7 = r4.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            int r8 = r4.getMargin()
            int r8 = -r8
            r14 = 5
            r1.addEquality(r7, r6, r8, r14)
            goto L16e
        L158:
            r14 = 5
            if (r24 == 0) goto L16e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r4.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.mOwner
            if (r7 != r0) goto L16e
            androidx.constraintlayout.solver.SolverVariable r7 = r4.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            int r8 = r4.getMargin()
            int r8 = -r8
            r13 = 4
            r1.addEquality(r7, r6, r8, r13)
        L16e:
            androidx.constraintlayout.solver.SolverVariable r6 = r4.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r10.mListAnchors
            r5 = r7[r5]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            androidx.constraintlayout.solver.SolverVariable r5 = r5.mSolverVariable
            int r4 = r4.getMargin()
            int r4 = -r4
            r7 = 6
            r1.addLowerThan(r6, r5, r4, r7)
            goto L183
        L182:
            r14 = 5
        L183:
            if (r23 == 0) goto L19c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            int r4 = r39 + 1
            r0 = r0[r4]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r10.mListAnchors
            r4 = r5[r4]
            androidx.constraintlayout.solver.SolverVariable r5 = r4.mSolverVariable
            int r4 = r4.getMargin()
            r6 = 8
            r1.addGreaterThan(r0, r5, r4, r6)
        L19c:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r2.mWeightedMatchConstraintsWidgets
            if (r0 == 0) goto L249
            int r4 = r0.size()
            r5 = 1
            if (r4 <= r5) goto L249
            boolean r5 = r2.mHasUndefinedWeights
            if (r5 == 0) goto L1b5
            boolean r5 = r2.mHasComplexMatchWeights
            if (r5 != 0) goto L1b5
            int r5 = r2.mWidgetsMatchCount
            float r5 = (float) r5
            r29 = r5
            goto L1b7
        L1b5:
            r29 = r18
        L1b7:
            r5 = 0
            r6 = r21
            r7 = 0
            r28 = 0
        L1bd:
            if (r7 >= r4) goto L249
            java.lang.Object r8 = r0.get(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r8
            float[] r13 = r8.mWeight
            r13 = r13[r38]
            int r18 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r18 >= 0) goto L1ee
            boolean r13 = r2.mHasComplexMatchWeights
            if (r13 == 0) goto L1e6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r8.mListAnchors
            int r13 = r39 + 1
            r13 = r8[r13]
            androidx.constraintlayout.solver.SolverVariable r13 = r13.mSolverVariable
            r8 = r8[r39]
            androidx.constraintlayout.solver.SolverVariable r8 = r8.mSolverVariable
            r36 = 0
            r5 = 4
            r14 = 0
            r1.addEquality(r13, r8, r14, r5)
            r5 = 0
            goto L209
        L1e6:
            r36 = 0
            r5 = 4
            r13 = 1065353216(0x3f800000, float:1.0)
            r30 = 1065353216(0x3f800000, float:1.0)
            goto L1f3
        L1ee:
            r36 = 0
            r5 = 4
            r30 = r13
        L1f3:
            int r13 = (r30 > r36 ? 1 : (r30 == r36 ? 0 : -1))
            if (r13 != 0) goto L20c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r8.mListAnchors
            int r13 = r39 + 1
            r13 = r8[r13]
            androidx.constraintlayout.solver.SolverVariable r13 = r13.mSolverVariable
            r8 = r8[r39]
            androidx.constraintlayout.solver.SolverVariable r8 = r8.mSolverVariable
            r5 = 0
            r14 = 8
            r1.addEquality(r13, r8, r5, r14)
        L209:
            r18 = r0
            goto L241
        L20c:
            r5 = 0
            if (r6 == 0) goto L23c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r6.mListAnchors
            r13 = r6[r39]
            androidx.constraintlayout.solver.SolverVariable r13 = r13.mSolverVariable
            int r14 = r39 + 1
            r6 = r6[r14]
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r8.mListAnchors
            r18 = r0
            r0 = r5[r39]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            r5 = r5[r14]
            androidx.constraintlayout.solver.SolverVariable r5 = r5.mSolverVariable
            androidx.constraintlayout.solver.ArrayRow r27 = r1.createRow()
            r33 = r0
            r34 = r5
            r32 = r6
            r31 = r13
            r27.createRowEqualMatchDimensions(r28, r29, r30, r31, r32, r33, r34)
            r0 = r27
            r1.addConstraint(r0)
            goto L23e
        L23c:
            r18 = r0
        L23e:
            r6 = r8
            r28 = r30
        L241:
            int r7 = r7 + 1
            r0 = r18
            r5 = 0
            r14 = 5
            goto L1bd
        L249:
            if (r11 == 0) goto L29f
            if (r11 == r12) goto L24f
            if (r24 == 0) goto L29f
        L24f:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r9.mListAnchors
            r0 = r0[r39]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r10.mListAnchors
            int r4 = r39 + 1
            r2 = r2[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L260
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            goto L262
        L260:
            r0 = r21
        L262:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L26a
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            r5 = r2
            goto L26c
        L26a:
            r5 = r21
        L26c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r11.mListAnchors
            r2 = r2[r39]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r12.mListAnchors
            r4 = r6[r4]
            if (r0 == 0) goto L29b
            if (r5 == 0) goto L29b
            if (r38 != 0) goto L27d
            float r3 = r3.mHorizontalBiasPercent
            goto L27f
        L27d:
            float r3 = r3.mVerticalBiasPercent
        L27f:
            int r6 = r2.getMargin()
            int r7 = r4.getMargin()
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            r8 = 7
            r35 = r2
            r2 = r0
            r0 = r1
            r1 = r35
            r35 = r4
            r4 = r3
            r3 = r6
            r6 = r35
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L29b:
            r0 = r37
            goto L4a1
        L29f:
            if (r26 == 0) goto L38b
            if (r11 == 0) goto L38b
            int r0 = r2.mWidgetsMatchCount
            if (r0 <= 0) goto L2ae
            int r1 = r2.mWidgetsCount
            if (r1 != r0) goto L2ae
            r17 = 1
            goto L2b0
        L2ae:
            r17 = 0
        L2b0:
            r13 = r11
            r14 = r13
        L2b2:
            if (r13 == 0) goto L29b
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r13.mNextChainWidget
            r0 = r0[r38]
        L2b8:
            if (r0 == 0) goto L2c7
            int r1 = r0.getVisibility()
            r6 = 8
            if (r1 != r6) goto L2c9
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r0.mNextChainWidget
            r0 = r0[r38]
            goto L2b8
        L2c7:
            r6 = 8
        L2c9:
            if (r0 != 0) goto L2d8
            if (r13 != r12) goto L2ce
            goto L2d8
        L2ce:
            r18 = r0
            r36 = r13
            r13 = 8
            r20 = 5
            goto L37f
        L2d8:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r13.mListAnchors
            r1 = r1[r39]
            androidx.constraintlayout.solver.SolverVariable r2 = r1.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r1.mTarget
            if (r3 == 0) goto L2e5
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            goto L2e7
        L2e5:
            r3 = r21
        L2e7:
            if (r14 == r13) goto L2f2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r14.mListAnchors
            int r4 = r39 + 1
            r3 = r3[r4]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            goto L303
        L2f2:
            if (r13 != r11) goto L303
            if (r14 != r13) goto L303
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r9.mListAnchors
            r3 = r3[r39]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L301
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            goto L303
        L301:
            r3 = r21
        L303:
            int r1 = r1.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r13.mListAnchors
            int r5 = r39 + 1
            r4 = r4[r5]
            int r4 = r4.getMargin()
            if (r0 == 0) goto L320
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r0.mListAnchors
            r7 = r7[r39]
            androidx.constraintlayout.solver.SolverVariable r8 = r7.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r13.mListAnchors
            r6 = r6[r5]
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            goto L334
        L320:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r10.mListAnchors
            r6 = r6[r5]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r6.mTarget
            if (r7 == 0) goto L32c
            androidx.constraintlayout.solver.SolverVariable r6 = r7.mSolverVariable
            r8 = r6
            goto L32e
        L32c:
            r8 = r21
        L32e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r13.mListAnchors
            r6 = r6[r5]
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
        L334:
            if (r7 == 0) goto L33b
            int r7 = r7.getMargin()
            int r4 = r4 + r7
        L33b:
            if (r14 == 0) goto L346
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r14.mListAnchors
            r7 = r7[r5]
            int r7 = r7.getMargin()
            int r1 = r1 + r7
        L346:
            if (r2 == 0) goto L2ce
            if (r3 == 0) goto L2ce
            if (r8 == 0) goto L2ce
            if (r6 == 0) goto L2ce
            if (r13 != r11) goto L358
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r11.mListAnchors
            r1 = r1[r39]
            int r1 = r1.getMargin()
        L358:
            if (r13 != r12) goto L362
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r12.mListAnchors
            r4 = r4[r5]
            int r4 = r4.getMargin()
        L362:
            r7 = r4
            r5 = r8
            if (r17 == 0) goto L369
            r8 = 8
            goto L36a
        L369:
            r8 = 5
        L36a:
            r4 = 1056964608(0x3f000000, float:0.5)
            r36 = r3
            r3 = r1
            r1 = r2
            r2 = r36
            r18 = r0
            r36 = r13
            r13 = 8
            r20 = 5
            r0 = r37
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L37f:
            int r0 = r36.getVisibility()
            if (r0 == r13) goto L387
            r14 = r36
        L387:
            r13 = r18
            goto L2b2
        L38b:
            r13 = 8
            if (r15 == 0) goto L29b
            if (r11 == 0) goto L29b
            int r0 = r2.mWidgetsMatchCount
            if (r0 <= 0) goto L39c
            int r1 = r2.mWidgetsCount
            if (r1 != r0) goto L39c
            r17 = 1
            goto L39e
        L39c:
            r17 = 0
        L39e:
            r0 = r11
            r14 = r0
        L3a0:
            if (r14 == 0) goto L450
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r14.mNextChainWidget
            r1 = r1[r38]
        L3a6:
            if (r1 == 0) goto L3b3
            int r2 = r1.getVisibility()
            if (r2 != r13) goto L3b3
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r1.mNextChainWidget
            r1 = r1[r38]
            goto L3a6
        L3b3:
            if (r14 == r11) goto L43c
            if (r14 == r12) goto L43c
            if (r1 == 0) goto L43c
            if (r1 != r12) goto L3bd
            r1 = r21
        L3bd:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r14.mListAnchors
            r2 = r2[r39]
            androidx.constraintlayout.solver.SolverVariable r3 = r2.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r2.mTarget
            if (r4 == 0) goto L3c9
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
        L3c9:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r0.mListAnchors
            int r5 = r39 + 1
            r4 = r4[r5]
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            int r2 = r2.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r14.mListAnchors
            r6 = r6[r5]
            int r6 = r6.getMargin()
            if (r1 == 0) goto L3ef
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r1.mListAnchors
            r7 = r7[r39]
            androidx.constraintlayout.solver.SolverVariable r8 = r7.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r7.mTarget
            if (r13 == 0) goto L3ec
            androidx.constraintlayout.solver.SolverVariable r13 = r13.mSolverVariable
            goto L400
        L3ec:
            r13 = r21
            goto L400
        L3ef:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r12.mListAnchors
            r7 = r7[r39]
            if (r7 == 0) goto L3f8
            androidx.constraintlayout.solver.SolverVariable r8 = r7.mSolverVariable
            goto L3fa
        L3f8:
            r8 = r21
        L3fa:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r13 = r14.mListAnchors
            r13 = r13[r5]
            androidx.constraintlayout.solver.SolverVariable r13 = r13.mSolverVariable
        L400:
            if (r7 == 0) goto L407
            int r7 = r7.getMargin()
            int r6 = r6 + r7
        L407:
            r7 = r6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r0.mListAnchors
            r5 = r6[r5]
            int r5 = r5.getMargin()
            int r2 = r2 + r5
            r5 = r8
            if (r17 == 0) goto L417
            r8 = 8
            goto L418
        L417:
            r8 = 4
        L418:
            if (r3 == 0) goto L432
            if (r4 == 0) goto L432
            if (r5 == 0) goto L432
            if (r13 == 0) goto L432
            r6 = r1
            r1 = r3
            r3 = r2
            r2 = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            r18 = r6
            r6 = r13
            r19 = 4
            r13 = r0
            r0 = r37
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L439
        L432:
            r13 = r0
            r18 = r1
            r19 = 4
            r0 = r37
        L439:
            r1 = r18
            goto L441
        L43c:
            r13 = r0
            r19 = 4
            r0 = r37
        L441:
            int r2 = r14.getVisibility()
            r6 = 8
            if (r2 == r6) goto L44a
            r13 = r14
        L44a:
            r14 = r1
            r0 = r13
            r13 = 8
            goto L3a0
        L450:
            r0 = r37
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r11.mListAnchors
            r1 = r1[r39]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r9.mListAnchors
            r2 = r2[r39]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r12.mListAnchors
            int r4 = r39 + 1
            r9 = r3[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r10.mListAnchors
            r3 = r3[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r3.mTarget
            r8 = 5
            if (r2 == 0) goto L491
            if (r11 == r12) goto L479
            androidx.constraintlayout.solver.SolverVariable r3 = r1.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            int r1 = r1.getMargin()
            r0.addEquality(r3, r2, r1, r8)
            goto L491
        L479:
            if (r13 == 0) goto L491
            r3 = r1
            androidx.constraintlayout.solver.SolverVariable r1 = r3.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            int r3 = r3.getMargin()
            androidx.constraintlayout.solver.SolverVariable r5 = r9.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r6 = r13.mSolverVariable
            int r7 = r9.getMargin()
            r4 = 1056964608(0x3f000000, float:0.5)
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L491:
            if (r13 == 0) goto L4a1
            if (r11 == r12) goto L4a1
            androidx.constraintlayout.solver.SolverVariable r1 = r9.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r2 = r13.mSolverVariable
            int r3 = r9.getMargin()
            int r3 = -r3
            r0.addEquality(r1, r2, r3, r8)
        L4a1:
            if (r26 != 0) goto L4a5
            if (r15 == 0) goto L4fd
        L4a5:
            if (r11 == 0) goto L4fd
            if (r11 == r12) goto L4fd
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r11.mListAnchors
            r2 = r1[r39]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r12.mListAnchors
            r16 = 1
            int r4 = r39 + 1
            r3 = r3[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r2.mTarget
            if (r5 == 0) goto L4bc
            androidx.constraintlayout.solver.SolverVariable r5 = r5.mSolverVariable
            goto L4be
        L4bc:
            r5 = r21
        L4be:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r3.mTarget
            if (r6 == 0) goto L4c5
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            goto L4c7
        L4c5:
            r6 = r21
        L4c7:
            if (r10 == r12) goto L4d7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r10.mListAnchors
            r6 = r6[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            if (r6 == 0) goto L4d5
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            r21 = r6
        L4d5:
            r6 = r21
        L4d7:
            if (r11 != r12) goto L4db
            r3 = r1[r4]
        L4db:
            if (r5 == 0) goto L4fd
            if (r6 == 0) goto L4fd
            int r1 = r2.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r12.mListAnchors
            r4 = r7[r4]
            int r7 = r4.getMargin()
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r8 = 5
            r4 = 1056964608(0x3f000000, float:0.5)
            r35 = r3
            r3 = r1
            r1 = r2
            r2 = r5
            r5 = r6
            r6 = r35
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L4fd:
            return
    }
}
