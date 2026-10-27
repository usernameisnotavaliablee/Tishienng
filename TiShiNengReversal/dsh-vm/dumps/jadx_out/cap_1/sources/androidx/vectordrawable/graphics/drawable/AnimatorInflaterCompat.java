package androidx.vectordrawable.graphics.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AnimatorInflaterCompat {
    private static final boolean DBG_ANIMATOR_INFLATER = false;
    private static final int MAX_NUM_POINTS = 100;
    private static final java.lang.String TAG = "AnimatorInflater";
    private static final int TOGETHER = 0;
    private static final int VALUE_TYPE_COLOR = 3;
    private static final int VALUE_TYPE_FLOAT = 0;
    private static final int VALUE_TYPE_INT = 1;
    private static final int VALUE_TYPE_PATH = 2;
    private static final int VALUE_TYPE_UNDEFINED = 4;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class PathDataEvaluator implements android.animation.TypeEvaluator<androidx.core.graphics.PathParser.PathDataNode[]> {
        private androidx.core.graphics.PathParser.PathDataNode[] mNodeArray;

        PathDataEvaluator() {
                r0 = this;
                r0.<init>()
                return
        }

        PathDataEvaluator(androidx.core.graphics.PathParser.PathDataNode[] r1) {
                r0 = this;
                r0.<init>()
                r0.mNodeArray = r1
                return
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ androidx.core.graphics.PathParser.PathDataNode[] evaluate(float r1, androidx.core.graphics.PathParser.PathDataNode[] r2, androidx.core.graphics.PathParser.PathDataNode[] r3) {
                r0 = this;
                androidx.core.graphics.PathParser$PathDataNode[] r2 = (androidx.core.graphics.PathParser.PathDataNode[]) r2
                androidx.core.graphics.PathParser$PathDataNode[] r3 = (androidx.core.graphics.PathParser.PathDataNode[]) r3
                androidx.core.graphics.PathParser$PathDataNode[] r1 = r0.evaluate2(r1, r2, r3)
                return r1
        }

        /* renamed from: evaluate, reason: avoid collision after fix types in other method */
        public androidx.core.graphics.PathParser.PathDataNode[] evaluate2(float r5, androidx.core.graphics.PathParser.PathDataNode[] r6, androidx.core.graphics.PathParser.PathDataNode[] r7) {
                r4 = this;
                boolean r0 = androidx.core.graphics.PathParser.canMorph(r6, r7)
                if (r0 == 0) goto L29
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r4.mNodeArray
                boolean r0 = androidx.core.graphics.PathParser.canMorph(r0, r6)
                if (r0 != 0) goto L14
                androidx.core.graphics.PathParser$PathDataNode[] r0 = androidx.core.graphics.PathParser.deepCopyNodes(r6)
                r4.mNodeArray = r0
            L14:
                r0 = 0
            L15:
                int r1 = r6.length
                if (r0 >= r1) goto L26
                androidx.core.graphics.PathParser$PathDataNode[] r1 = r4.mNodeArray
                r1 = r1[r0]
                r2 = r6[r0]
                r3 = r7[r0]
                r1.interpolatePathDataNode(r2, r3, r5)
                int r0 = r0 + 1
                goto L15
            L26:
                androidx.core.graphics.PathParser$PathDataNode[] r5 = r4.mNodeArray
                return r5
            L29:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Can't interpolate between two incompatible pathData"
                r5.<init>(r6)
                throw r5
        }
    }

    private AnimatorInflaterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.animation.Animator createAnimatorFromXml(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, org.xmlpull.v1.XmlPullParser r11, float r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r11)
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r12
            android.animation.Animator r8 = createAnimatorFromXml(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    private static android.animation.Animator createAnimatorFromXml(android.content.Context r13, android.content.res.Resources r14, android.content.res.Resources.Theme r15, org.xmlpull.v1.XmlPullParser r16, android.util.AttributeSet r17, android.animation.AnimatorSet r18, int r19, float r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r8 = r18
            int r9 = r16.getDepth()
            r0 = 0
            r6 = r0
            r10 = r6
        L9:
            int r0 = r16.next()
            r1 = 3
            r11 = 0
            if (r0 != r1) goto L17
            int r1 = r16.getDepth()
            if (r1 <= r9) goto Lc6
        L17:
            r7 = 1
            if (r0 == r7) goto Lc6
            r1 = 2
            if (r0 == r1) goto L1e
            goto L9
        L1e:
            java.lang.String r12 = r16.getName()
            java.lang.String r0 = "objectAnimator"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L3b
            r0 = r13
            r1 = r14
            r2 = r15
            r5 = r16
            r3 = r17
            r4 = r20
            android.animation.ObjectAnimator r6 = loadObjectAnimator(r0, r1, r2, r3, r4, r5)
            r3 = r16
            goto L9b
        L3b:
            java.lang.String r0 = "animator"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L54
            r4 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r6 = r16
            r3 = r17
            r5 = r20
            android.animation.ValueAnimator r4 = loadAnimator(r0, r1, r2, r3, r4, r5, r6)
            r3 = r6
            r6 = r4
            goto L9b
        L54:
            r3 = r16
            java.lang.String r0 = "set"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L7e
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATOR_SET
            r4 = r17
            android.content.res.TypedArray r12 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r14, r15, r4, r0)
            java.lang.String r0 = "ordering"
            int r6 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r3, r0, r11, r11)
            r0 = r13
            r1 = r14
            r2 = r15
            r7 = r20
            createAnimatorFromXml(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.recycle()
            r6 = r5
            goto L9b
        L7e:
            java.lang.String r4 = "propertyValuesHolder"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto Lab
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r3)
            android.animation.PropertyValuesHolder[] r4 = loadValues(r13, r14, r15, r3, r4)
            if (r4 == 0) goto L9a
            boolean r5 = r6 instanceof android.animation.ValueAnimator
            if (r5 == 0) goto L9a
            r5 = r6
            android.animation.ValueAnimator r5 = (android.animation.ValueAnimator) r5
            r5.setValues(r4)
        L9a:
            r11 = 1
        L9b:
            if (r8 == 0) goto L9
            if (r11 != 0) goto L9
            if (r10 != 0) goto La6
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        La6:
            r10.add(r6)
            goto L9
        Lab:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Unknown animator name: "
            r14.append(r15)
            java.lang.String r15 = r3.getName()
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        Lc6:
            if (r8 == 0) goto Lef
            if (r10 == 0) goto Lef
            int r13 = r10.size()
            android.animation.Animator[] r13 = new android.animation.Animator[r13]
            java.util.Iterator r14 = r10.iterator()
        Ld4:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto Le6
            java.lang.Object r15 = r14.next()
            android.animation.Animator r15 = (android.animation.Animator) r15
            int r0 = r11 + 1
            r13[r11] = r15
            r11 = r0
            goto Ld4
        Le6:
            if (r19 != 0) goto Lec
            r8.playTogether(r13)
            return r6
        Lec:
            r8.playSequentially(r13)
        Lef:
            return r6
    }

    private static android.animation.Keyframe createNewKeyframe(android.animation.Keyframe r2, float r3) {
            java.lang.Class r0 = r2.getType()
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto Ld
            android.animation.Keyframe r2 = android.animation.Keyframe.ofFloat(r3)
            return r2
        Ld:
            java.lang.Class r2 = r2.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto L1a
            android.animation.Keyframe r2 = android.animation.Keyframe.ofInt(r3)
            return r2
        L1a:
            android.animation.Keyframe r2 = android.animation.Keyframe.ofObject(r3)
            return r2
    }

    private static void distributeKeyframes(android.animation.Keyframe[] r2, float r3, int r4, int r5) {
            int r0 = r5 - r4
            int r0 = r0 + 2
            float r0 = (float) r0
            float r3 = r3 / r0
        L6:
            if (r4 > r5) goto L19
            r0 = r2[r4]
            int r1 = r4 + (-1)
            r1 = r2[r1]
            float r1 = r1.getFraction()
            float r1 = r1 + r3
            r0.setFraction(r1)
            int r4 = r4 + 1
            goto L6
        L19:
            return
    }

    private static void dumpKeyframes(java.lang.Object[] r5, java.lang.String r6) {
            if (r5 == 0) goto L36
            int r6 = r5.length
            if (r6 != 0) goto L6
            goto L36
        L6:
            int r6 = r5.length
            r0 = 0
        L8:
            if (r0 >= r6) goto L36
            r1 = r5[r0]
            android.animation.Keyframe r1 = (android.animation.Keyframe) r1
            float r2 = r1.getFraction()
            r3 = 0
            java.lang.String r4 = "null"
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L1b
            r2 = r4
            goto L23
        L1b:
            float r2 = r1.getFraction()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L23:
            r2.toString()
            boolean r2 = r1.hasValue()
            if (r2 == 0) goto L30
            java.lang.Object r4 = r1.getValue()
        L30:
            java.util.Objects.toString(r4)
            int r0 = r0 + 1
            goto L8
        L36:
            return
    }

    private static android.animation.PropertyValuesHolder getPVH(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r3 = 1
            goto Lb
        La:
            r3 = 0
        Lb:
            if (r3 == 0) goto L10
            int r0 = r0.type
            goto L11
        L10:
            r0 = 0
        L11:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r5 == 0) goto L1f
            int r4 = r4.type
            goto L20
        L1f:
            r4 = 0
        L20:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L37
            if (r3 == 0) goto L2c
            boolean r12 = isColorType(r0)
            if (r12 != 0) goto L34
        L2c:
            if (r5 == 0) goto L36
            boolean r12 = isColorType(r4)
            if (r12 == 0) goto L36
        L34:
            r12 = 3
            goto L37
        L36:
            r12 = 0
        L37:
            if (r12 != 0) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r8 = 2
            r9 = 0
            if (r12 != r8) goto La7
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            androidx.core.graphics.PathParser$PathDataNode[] r13 = androidx.core.graphics.PathParser.createNodesFromPathData(r12)
            androidx.core.graphics.PathParser$PathDataNode[] r14 = androidx.core.graphics.PathParser.createNodesFromPathData(r11)
            if (r13 != 0) goto L54
            if (r14 == 0) goto La6
        L54:
            if (r13 == 0) goto L96
            androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator r0 = new androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator
            r0.<init>()
            if (r14 == 0) goto L8d
            boolean r3 = androidx.core.graphics.PathParser.canMorph(r13, r14)
            if (r3 == 0) goto L6e
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            return r11
        L6e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L8d:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            return r11
        L96:
            if (r14 == 0) goto La6
            androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator r11 = new androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            return r11
        La6:
            return r9
        La7:
            if (r12 != r7) goto Lae
            androidx.vectordrawable.graphics.drawable.ArgbEvaluator r12 = androidx.vectordrawable.graphics.drawable.ArgbEvaluator.getInstance()
            goto Laf
        Lae:
            r12 = r9
        Laf:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto Lf7
            if (r3 == 0) goto Le3
            if (r0 != r7) goto Lbc
            float r13 = r11.getDimension(r13, r10)
            goto Lc0
        Lbc:
            float r13 = r11.getFloat(r13, r10)
        Lc0:
            if (r5 == 0) goto Lda
            if (r4 != r7) goto Lc9
            float r11 = r11.getDimension(r14, r10)
            goto Lcd
        Lc9:
            float r11 = r11.getFloat(r14, r10)
        Lcd:
            float[] r14 = new float[r8]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
        Ld7:
            r9 = r11
            goto L15c
        Lda:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto Ld7
        Le3:
            if (r4 != r7) goto Lea
            float r11 = r11.getDimension(r14, r10)
            goto Lee
        Lea:
            float r11 = r11.getFloat(r14, r10)
        Lee:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto Ld7
        Lf7:
            if (r3 == 0) goto L13b
            if (r0 != r7) goto L101
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L110
        L101:
            boolean r0 = isColorType(r0)
            if (r0 == 0) goto L10c
            int r13 = r11.getColor(r13, r2)
            goto L110
        L10c:
            int r13 = r11.getInt(r13, r2)
        L110:
            if (r5 == 0) goto L132
            if (r4 != r7) goto L11a
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L129
        L11a:
            boolean r0 = isColorType(r4)
            if (r0 == 0) goto L125
            int r11 = r11.getColor(r14, r2)
            goto L129
        L125:
            int r11 = r11.getInt(r14, r2)
        L129:
            int[] r11 = new int[]{r13, r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L15c
        L132:
            int[] r11 = new int[]{r13}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L15c
        L13b:
            if (r5 == 0) goto L15c
            if (r4 != r7) goto L145
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L154
        L145:
            boolean r13 = isColorType(r4)
            if (r13 == 0) goto L150
            int r11 = r11.getColor(r14, r2)
            goto L154
        L150:
            int r11 = r11.getInt(r14, r2)
        L154:
            int[] r11 = new int[]{r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
        L15c:
            if (r9 == 0) goto L163
            if (r12 == 0) goto L163
            r9.setEvaluator(r12)
        L163:
            return r9
    }

    private static int inferValueTypeFromValues(android.content.res.TypedArray r3, int r4, int r5) {
            android.util.TypedValue r4 = r3.peekValue(r4)
            r0 = 1
            r1 = 0
            if (r4 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            if (r2 == 0) goto L10
            int r4 = r4.type
            goto L11
        L10:
            r4 = 0
        L11:
            android.util.TypedValue r3 = r3.peekValue(r5)
            if (r3 == 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L1e
            int r3 = r3.type
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r2 == 0) goto L27
            boolean r4 = isColorType(r4)
            if (r4 != 0) goto L2f
        L27:
            if (r0 == 0) goto L31
            boolean r3 = isColorType(r3)
            if (r3 == 0) goto L31
        L2f:
            r3 = 3
            return r3
        L31:
            return r1
    }

    private static int inferValueTypeOfKeyframe(android.content.res.Resources r1, android.content.res.Resources.Theme r2, android.util.AttributeSet r3, org.xmlpull.v1.XmlPullParser r4) {
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_KEYFRAME
            android.content.res.TypedArray r1 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r1, r2, r3, r0)
            java.lang.String r2 = "value"
            r3 = 0
            android.util.TypedValue r2 = androidx.core.content.res.TypedArrayUtils.peekNamedValue(r1, r4, r2, r3)
            if (r2 == 0) goto L19
            int r2 = r2.type
            boolean r2 = isColorType(r2)
            if (r2 == 0) goto L19
            r3 = 3
        L19:
            r1.recycle()
            return r3
    }

    private static boolean isColorType(int r1) {
            r0 = 28
            if (r1 < r0) goto La
            r0 = 31
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static android.animation.Animator loadAnimator(android.content.Context r2, @androidx.annotation.AnimatorRes int r3) throws android.content.res.Resources.NotFoundException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            android.animation.Animator r2 = android.animation.AnimatorInflater.loadAnimator(r2, r3)
            return r2
        Lb:
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Resources$Theme r1 = r2.getTheme()
            android.animation.Animator r2 = loadAnimator(r2, r0, r1, r3)
            return r2
    }

    public static android.animation.Animator loadAnimator(android.content.Context r1, android.content.res.Resources r2, android.content.res.Resources.Theme r3, @androidx.annotation.AnimatorRes int r4) throws android.content.res.Resources.NotFoundException {
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.Animator r1 = loadAnimator(r1, r2, r3, r4, r0)
            return r1
    }

    public static android.animation.Animator loadAnimator(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, @androidx.annotation.AnimatorRes int r5, float r6) throws android.content.res.Resources.NotFoundException {
            java.lang.String r0 = "Can't load animation resource ID #0x"
            r1 = 0
            android.content.res.XmlResourceParser r1 = r3.getAnimation(r5)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L15
            android.animation.Animator r2 = createAnimatorFromXml(r2, r3, r4, r1, r6)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L15
            if (r1 == 0) goto L10
            r1.close()
        L10:
            return r2
        L11:
            r2 = move-exception
            goto L4f
        L13:
            r2 = move-exception
            goto L17
        L15:
            r2 = move-exception
            goto L33
        L17:
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r4.<init>()     // Catch: java.lang.Throwable -> L11
            r4.append(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L11
            r4.append(r5)     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L11
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L11
            r3.initCause(r2)     // Catch: java.lang.Throwable -> L11
            throw r3     // Catch: java.lang.Throwable -> L11
        L33:
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r4.<init>()     // Catch: java.lang.Throwable -> L11
            r4.append(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L11
            r4.append(r5)     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L11
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L11
            r3.initCause(r2)     // Catch: java.lang.Throwable -> L11
            throw r3     // Catch: java.lang.Throwable -> L11
        L4f:
            if (r1 == 0) goto L54
            r1.close()
        L54:
            throw r2
    }

    private static android.animation.ValueAnimator loadAnimator(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, android.util.AttributeSet r5, android.animation.ValueAnimator r6, float r7, org.xmlpull.v1.XmlPullParser r8) throws android.content.res.Resources.NotFoundException {
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATOR
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r3, r4, r5, r0)
            int[] r1 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_PROPERTY_ANIMATOR
            android.content.res.TypedArray r3 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r3, r4, r5, r1)
            if (r6 != 0) goto L13
            android.animation.ValueAnimator r6 = new android.animation.ValueAnimator
            r6.<init>()
        L13:
            parseAnimatorFromTypeArray(r6, r0, r3, r7, r8)
            java.lang.String r4 = "interpolator"
            r5 = 0
            int r4 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r0, r8, r4, r5, r5)
            if (r4 <= 0) goto L26
            android.view.animation.Interpolator r2 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r2, r4)
            r6.setInterpolator(r2)
        L26:
            r0.recycle()
            if (r3 == 0) goto L2e
            r3.recycle()
        L2e:
            return r6
    }

    private static android.animation.Keyframe loadKeyframe(android.content.Context r6, android.content.res.Resources r7, android.content.res.Resources.Theme r8, android.util.AttributeSet r9, int r10, org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_KEYFRAME
            android.content.res.TypedArray r7 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r7, r8, r9, r0)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r9 = "fraction"
            r0 = 3
            float r8 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r7, r11, r9, r0, r8)
            java.lang.String r9 = "value"
            r1 = 0
            android.util.TypedValue r2 = androidx.core.content.res.TypedArrayUtils.peekNamedValue(r7, r11, r9, r1)
            r3 = 1
            if (r2 == 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            r5 = 4
            if (r10 != r5) goto L2d
            if (r4 == 0) goto L2c
            int r10 = r2.type
            boolean r10 = isColorType(r10)
            if (r10 == 0) goto L2c
            r10 = 3
            goto L2d
        L2c:
            r10 = 0
        L2d:
            if (r4 == 0) goto L4a
            if (r10 == 0) goto L40
            if (r10 == r3) goto L37
            if (r10 == r0) goto L37
            r8 = 0
            goto L55
        L37:
            int r9 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r7, r11, r9, r1, r1)
            android.animation.Keyframe r8 = android.animation.Keyframe.ofInt(r8, r9)
            goto L55
        L40:
            r10 = 0
            float r9 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r7, r11, r9, r1, r10)
            android.animation.Keyframe r8 = android.animation.Keyframe.ofFloat(r8, r9)
            goto L55
        L4a:
            if (r10 != 0) goto L51
            android.animation.Keyframe r8 = android.animation.Keyframe.ofFloat(r8)
            goto L55
        L51:
            android.animation.Keyframe r8 = android.animation.Keyframe.ofInt(r8)
        L55:
            java.lang.String r9 = "interpolator"
            int r9 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r7, r11, r9, r3, r1)
            if (r9 <= 0) goto L64
            android.view.animation.Interpolator r6 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r6, r9)
            r8.setInterpolator(r6)
        L64:
            r7.recycle()
            return r8
    }

    private static android.animation.ObjectAnimator loadObjectAnimator(android.content.Context r7, android.content.res.Resources r8, android.content.res.Resources.Theme r9, android.util.AttributeSet r10, float r11, org.xmlpull.v1.XmlPullParser r12) throws android.content.res.Resources.NotFoundException {
            android.animation.ObjectAnimator r4 = new android.animation.ObjectAnimator
            r4.<init>()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            loadAnimator(r0, r1, r2, r3, r4, r5, r6)
            return r4
    }

    private static android.animation.PropertyValuesHolder loadPvh(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L48
            r4 = 1
            if (r2 == r4) goto L48
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L41
            r2 = 4
            if (r14 != r2) goto L23
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r12)
            int r14 = inferValueTypeOfKeyframe(r10, r11, r14, r12)
        L23:
            r6 = r14
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r7 = r12
            android.animation.Keyframe r9 = loadKeyframe(r2, r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3c
            if (r1 != 0) goto L39
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L39:
            r1.add(r9)
        L3c:
            r7.next()
            r14 = r6
            goto L44
        L41:
            r2 = r9
            r4 = r11
            r7 = r12
        L44:
            r9 = r2
            r11 = r4
            r12 = r7
            goto L2
        L48:
            if (r1 == 0) goto Lf2
            int r9 = r1.size()
            if (r9 <= 0) goto Lf2
            r10 = 0
            java.lang.Object r11 = r1.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + (-1)
            java.lang.Object r12 = r1.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L7f
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L72
            r12.setFraction(r2)
            goto L7f
        L72:
            int r0 = r1.size()
            android.animation.Keyframe r12 = createNewKeyframe(r12, r2)
            r1.add(r0, r12)
            int r9 = r9 + 1
        L7f:
            float r12 = r11.getFraction()
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L98
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L8f
            r11.setFraction(r4)
            goto L98
        L8f:
            android.animation.Keyframe r11 = createNewKeyframe(r11, r4)
            r1.add(r10, r11)
            int r9 = r9 + 1
        L98:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r1.toArray(r11)
        L9d:
            if (r10 >= r9) goto Le4
            r12 = r11[r10]
            float r0 = r12.getFraction()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto Le1
            if (r10 != 0) goto Laf
            r12.setFraction(r4)
            goto Le1
        Laf:
            int r0 = r9 + (-1)
            if (r10 != r0) goto Lb7
            r12.setFraction(r2)
            goto Le1
        Lb7:
            int r12 = r10 + 1
            r1 = r10
        Lba:
            if (r12 >= r0) goto Lcd
            r5 = r11[r12]
            float r5 = r5.getFraction()
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 < 0) goto Lc7
            goto Lcd
        Lc7:
            int r1 = r12 + 1
            r8 = r1
            r1 = r12
            r12 = r8
            goto Lba
        Lcd:
            int r12 = r1 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r0 = r10 + (-1)
            r0 = r11[r0]
            float r0 = r0.getFraction()
            float r12 = r12 - r0
            distributeKeyframes(r11, r12, r10, r1)
        Le1:
            int r10 = r10 + 1
            goto L9d
        Le4:
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r14 != r3) goto Lf1
            androidx.vectordrawable.graphics.drawable.ArgbEvaluator r10 = androidx.vectordrawable.graphics.drawable.ArgbEvaluator.getInstance()
            r9.setEvaluator(r10)
        Lf1:
            return r9
        Lf2:
            return r0
    }

    private static android.animation.PropertyValuesHolder[] loadValues(android.content.Context r13, android.content.res.Resources r14, android.content.res.Resources.Theme r15, org.xmlpull.v1.XmlPullParser r16, android.util.AttributeSet r17) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r3 = r16
            r6 = 0
            r7 = r6
        L4:
            int r0 = r3.getEventType()
            r8 = 0
            r1 = 3
            if (r0 == r1) goto L5d
            r9 = 1
            if (r0 == r9) goto L5d
            r2 = 2
            if (r0 == r2) goto L16
            r3.next()
            goto L4
        L16:
            java.lang.String r0 = r3.getName()
            java.lang.String r4 = "propertyValuesHolder"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L55
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER
            r10 = r17
            android.content.res.TypedArray r11 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r14, r15, r10, r0)
            java.lang.String r0 = "propertyName"
            java.lang.String r4 = androidx.core.content.res.TypedArrayUtils.getNamedString(r11, r3, r0, r1)
            java.lang.String r0 = "valueType"
            r1 = 4
            int r5 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r11, r3, r0, r2, r1)
            r0 = r13
            r1 = r14
            r2 = r15
            android.animation.PropertyValuesHolder r12 = loadPvh(r0, r1, r2, r3, r4, r5)
            if (r12 != 0) goto L45
            android.animation.PropertyValuesHolder r12 = getPVH(r11, r5, r8, r9, r4)
        L45:
            if (r12 == 0) goto L51
            if (r7 != 0) goto L4e
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L4e:
            r7.add(r12)
        L51:
            r11.recycle()
            goto L57
        L55:
            r10 = r17
        L57:
            r16.next()
            r3 = r16
            goto L4
        L5d:
            if (r7 == 0) goto L73
            int r13 = r7.size()
            android.animation.PropertyValuesHolder[] r14 = new android.animation.PropertyValuesHolder[r13]
        L65:
            if (r8 >= r13) goto L72
            java.lang.Object r15 = r7.get(r8)
            android.animation.PropertyValuesHolder r15 = (android.animation.PropertyValuesHolder) r15
            r14[r8] = r15
            int r8 = r8 + 1
            goto L65
        L72:
            return r14
        L73:
            return r6
    }

    private static void parseAnimatorFromTypeArray(android.animation.ValueAnimator r11, android.content.res.TypedArray r12, android.content.res.TypedArray r13, float r14, org.xmlpull.v1.XmlPullParser r15) {
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r1 = "duration"
            r2 = 1
            int r0 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r1, r2, r0)
            long r0 = (long) r0
            java.lang.String r3 = "startOffset"
            r4 = 2
            r5 = 0
            int r3 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r3, r4, r5)
            long r3 = (long) r3
            java.lang.String r6 = "valueType"
            r7 = 7
            r8 = 4
            int r6 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r6, r7, r8)
            java.lang.String r7 = "valueFrom"
            boolean r7 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r15, r7)
            if (r7 == 0) goto L45
            java.lang.String r7 = "valueTo"
            boolean r7 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r15, r7)
            if (r7 == 0) goto L45
            r7 = 6
            r9 = 5
            if (r6 != r8) goto L36
            int r6 = inferValueTypeFromValues(r12, r9, r7)
        L36:
            java.lang.String r10 = ""
            android.animation.PropertyValuesHolder r7 = getPVH(r12, r6, r9, r7, r10)
            if (r7 == 0) goto L45
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[r2]
            r9[r5] = r7
            r11.setValues(r9)
        L45:
            r11.setDuration(r0)
            r11.setStartDelay(r3)
            java.lang.String r0 = "repeatCount"
            r1 = 3
            int r0 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r0, r1, r5)
            r11.setRepeatCount(r0)
            java.lang.String r0 = "repeatMode"
            int r12 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r0, r8, r2)
            r11.setRepeatMode(r12)
            if (r13 == 0) goto L63
            setupObjectAnimator(r11, r13, r6, r14, r15)
        L63:
            return
    }

    private static void setupObjectAnimator(android.animation.ValueAnimator r5, android.content.res.TypedArray r6, int r7, float r8, org.xmlpull.v1.XmlPullParser r9) {
            android.animation.ObjectAnimator r5 = (android.animation.ObjectAnimator) r5
            java.lang.String r0 = "pathData"
            r1 = 1
            java.lang.String r0 = androidx.core.content.res.TypedArrayUtils.getNamedString(r6, r9, r0, r1)
            if (r0 == 0) goto L48
            java.lang.String r1 = "propertyXName"
            r2 = 2
            java.lang.String r1 = androidx.core.content.res.TypedArrayUtils.getNamedString(r6, r9, r1, r2)
            java.lang.String r3 = "propertyYName"
            r4 = 3
            java.lang.String r9 = androidx.core.content.res.TypedArrayUtils.getNamedString(r6, r9, r3, r4)
            if (r7 == r2) goto L1c
            r2 = 4
        L1c:
            if (r1 != 0) goto L3c
            if (r9 == 0) goto L21
            goto L3c
        L21:
            android.view.InflateException r5 = new android.view.InflateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            r7.append(r6)
            java.lang.String r6 = " propertyXName or propertyYName is needed for PathData"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L3c:
            android.graphics.Path r6 = androidx.core.graphics.PathParser.createPathFromPathData(r0)
            r7 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r7
            setupPathMotion(r6, r5, r8, r1, r9)
            return
        L48:
            java.lang.String r7 = "propertyName"
            r8 = 0
            java.lang.String r6 = androidx.core.content.res.TypedArrayUtils.getNamedString(r6, r9, r7, r8)
            r5.setPropertyName(r6)
            return
    }

    private static void setupPathMotion(android.graphics.Path r18, android.animation.ObjectAnimator r19, float r20, java.lang.String r21, java.lang.String r22) {
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r22
            android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
            r5 = 0
            r4.<init>(r0, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            r6.add(r8)
            r8 = 0
        L1c:
            float r9 = r4.getLength()
            float r8 = r8 + r9
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            r6.add(r9)
            boolean r9 = r4.nextContour()
            if (r9 != 0) goto L1c
            android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
            r4.<init>(r0, r5)
            float r0 = r8 / r20
            int r0 = (int) r0
            r9 = 1
            int r0 = r0 + r9
            r10 = 100
            int r0 = java.lang.Math.min(r10, r0)
            float[] r10 = new float[r0]
            float[] r11 = new float[r0]
            r12 = 2
            float[] r13 = new float[r12]
            int r14 = r0 + (-1)
            float r14 = (float) r14
            float r8 = r8 / r14
            r14 = 0
            r15 = 0
            r16 = 0
        L4d:
            r5 = 0
            if (r14 >= r0) goto L86
            java.lang.Object r17 = r6.get(r15)
            java.lang.Float r17 = (java.lang.Float) r17
            float r17 = r17.floatValue()
            float r12 = r7 - r17
            r4.getPosTan(r12, r13, r5)
            r5 = r13[r16]
            r10[r14] = r5
            r5 = r13[r9]
            r11[r14] = r5
            float r7 = r7 + r8
            int r5 = r15 + 1
            int r12 = r6.size()
            if (r5 >= r12) goto L82
            java.lang.Object r12 = r6.get(r5)
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 <= 0) goto L82
            r4.nextContour()
            r15 = r5
        L82:
            int r14 = r14 + 1
            r12 = 2
            goto L4d
        L86:
            if (r2 == 0) goto L8d
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r2, r10)
            goto L8e
        L8d:
            r0 = r5
        L8e:
            if (r3 == 0) goto L94
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r3, r11)
        L94:
            if (r0 != 0) goto L9e
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r9]
            r0[r16] = r5
            r1.setValues(r0)
            return
        L9e:
            if (r5 != 0) goto La8
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r9]
            r2[r16] = r0
            r1.setValues(r2)
            return
        La8:
            r2 = 2
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r2]
            r2[r16] = r0
            r2[r9] = r5
            r1.setValues(r2)
            return
    }
}
