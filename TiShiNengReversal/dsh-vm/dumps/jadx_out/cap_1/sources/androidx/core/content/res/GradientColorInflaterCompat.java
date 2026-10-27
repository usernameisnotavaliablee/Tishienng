package androidx.core.content.res;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class GradientColorInflaterCompat {
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ColorStops {
        final int[] mColors;
        final float[] mOffsets;

        ColorStops(@androidx.annotation.ColorInt int r1, @androidx.annotation.ColorInt int r2) {
                r0 = this;
                r0.<init>()
                int[] r1 = new int[]{r1, r2}
                r0.mColors = r1
                r1 = 2
                float[] r1 = new float[r1]
                r1 = {x0012: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                r0.mOffsets = r1
                return
        }

        ColorStops(@androidx.annotation.ColorInt int r1, @androidx.annotation.ColorInt int r2, @androidx.annotation.ColorInt int r3) {
                r0 = this;
                r0.<init>()
                int[] r1 = new int[]{r1, r2, r3}
                r0.mColors = r1
                r1 = 3
                float[] r1 = new float[r1]
                r1 = {x0012: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
                r0.mOffsets = r1
                return
        }

        ColorStops(@androidx.annotation.NonNull java.util.List<java.lang.Integer> r5, @androidx.annotation.NonNull java.util.List<java.lang.Float> r6) {
                r4 = this;
                r4.<init>()
                int r0 = r5.size()
                int[] r1 = new int[r0]
                r4.mColors = r1
                float[] r1 = new float[r0]
                r4.mOffsets = r1
                r1 = 0
            L10:
                if (r1 >= r0) goto L31
                int[] r2 = r4.mColors
                java.lang.Object r3 = r5.get(r1)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2[r1] = r3
                float[] r2 = r4.mOffsets
                java.lang.Object r3 = r6.get(r1)
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r2[r1] = r3
                int r1 = r1 + 1
                goto L10
            L31:
                return
        }
    }

    private GradientColorInflaterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.core.content.res.GradientColorInflaterCompat.ColorStops checkColors(@androidx.annotation.Nullable androidx.core.content.res.GradientColorInflaterCompat.ColorStops r0, @androidx.annotation.ColorInt int r1, @androidx.annotation.ColorInt int r2, boolean r3, @androidx.annotation.ColorInt int r4) {
            if (r0 == 0) goto L3
            return r0
        L3:
            if (r3 == 0) goto Lb
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r0 = new androidx.core.content.res.GradientColorInflaterCompat$ColorStops
            r0.<init>(r1, r4, r2)
            return r0
        Lb:
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r0 = new androidx.core.content.res.GradientColorInflaterCompat$ColorStops
            r0.<init>(r1, r2)
            return r0
    }

    static android.graphics.Shader createFromXml(@androidx.annotation.NonNull android.content.res.Resources r4, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r5, @androidx.annotation.Nullable android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L4:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto Lf
            r3 = 1
            if (r1 == r3) goto Lf
            goto L4
        Lf:
            if (r1 != r2) goto L16
            android.graphics.Shader r4 = createFromXmlInner(r4, r5, r0, r6)
            return r4
        L16:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
    }

    static android.graphics.Shader createFromXmlInner(@androidx.annotation.NonNull android.content.res.Resources r20, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r21, @androidx.annotation.NonNull android.util.AttributeSet r22, @androidx.annotation.Nullable android.content.res.Resources.Theme r23) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r0 = r21
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lce
            int[] r1 = androidx.core.R.styleable.GradientColor
            r2 = r20
            r3 = r22
            r4 = r23
            android.content.res.TypedArray r1 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r2, r4, r3, r1)
            java.lang.String r5 = "startX"
            int r6 = androidx.core.R.styleable.GradientColor_android_startX
            r7 = 0
            float r9 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r1, r0, r5, r6, r7)
            java.lang.String r5 = "startY"
            int r6 = androidx.core.R.styleable.GradientColor_android_startY
            float r10 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r1, r0, r5, r6, r7)
            java.lang.String r5 = "endX"
            int r6 = androidx.core.R.styleable.GradientColor_android_endX
            float r11 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r1, r0, r5, r6, r7)
            java.lang.String r5 = "endY"
            int r6 = androidx.core.R.styleable.GradientColor_android_endY
            float r12 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r1, r0, r5, r6, r7)
            java.lang.String r5 = "centerX"
            int r6 = androidx.core.R.styleable.GradientColor_android_centerX
            float r14 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r1, r0, r5, r6, r7)
            java.lang.String r5 = "centerY"
            int r6 = androidx.core.R.styleable.GradientColor_android_centerY
            float r15 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r1, r0, r5, r6, r7)
            java.lang.String r5 = "type"
            int r6 = androidx.core.R.styleable.GradientColor_android_type
            r8 = 0
            int r5 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r1, r0, r5, r6, r8)
            java.lang.String r6 = "startColor"
            int r13 = androidx.core.R.styleable.GradientColor_android_startColor
            int r6 = androidx.core.content.res.TypedArrayUtils.getNamedColor(r1, r0, r6, r13, r8)
            java.lang.String r13 = "centerColor"
            boolean r7 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r0, r13)
            int r2 = androidx.core.R.styleable.GradientColor_android_centerColor
            int r2 = androidx.core.content.res.TypedArrayUtils.getNamedColor(r1, r0, r13, r2, r8)
            java.lang.String r13 = "endColor"
            int r3 = androidx.core.R.styleable.GradientColor_android_endColor
            int r3 = androidx.core.content.res.TypedArrayUtils.getNamedColor(r1, r0, r13, r3, r8)
            java.lang.String r13 = "tileMode"
            int r4 = androidx.core.R.styleable.GradientColor_android_tileMode
            int r4 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r1, r0, r13, r4, r8)
            java.lang.String r8 = "gradientRadius"
            int r13 = androidx.core.R.styleable.GradientColor_android_gradientRadius
            r17 = r4
            r4 = 0
            float r8 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r1, r0, r8, r13, r4)
            r1.recycle()
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r0 = inflateChildElements(r20, r21, r22, r23)
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r0 = checkColors(r0, r6, r3, r7, r2)
            r1 = 1
            if (r5 == r1) goto Lac
            r1 = 2
            if (r5 == r1) goto La2
            android.graphics.LinearGradient r8 = new android.graphics.LinearGradient
            int[] r13 = r0.mColors
            float[] r14 = r0.mOffsets
            android.graphics.Shader$TileMode r15 = parseTileMode(r17)
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        La2:
            android.graphics.SweepGradient r1 = new android.graphics.SweepGradient
            int[] r2 = r0.mColors
            float[] r0 = r0.mOffsets
            r1.<init>(r14, r15, r2, r0)
            return r1
        Lac:
            r16 = 0
            int r1 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r1 <= 0) goto Lc6
            android.graphics.RadialGradient r13 = new android.graphics.RadialGradient
            int[] r1 = r0.mColors
            float[] r0 = r0.mOffsets
            android.graphics.Shader$TileMode r19 = parseTileMode(r17)
            r18 = r0
            r17 = r1
            r16 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19)
            return r13
        Lc6:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        Lce:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r0.getPositionDescription()
            r3.append(r0)
            java.lang.String r0 = ": invalid gradient color tag "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    private static androidx.core.content.res.GradientColorInflaterCompat.ColorStops inflateChildElements(@androidx.annotation.NonNull android.content.res.Resources r9, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r10, @androidx.annotation.NonNull android.util.AttributeSet r11, @androidx.annotation.Nullable android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = androidx.core.R.styleable.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r9, r12, r11, r3)
            int r5 = androidx.core.R.styleable.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r5)
            int r7 = androidx.core.R.styleable.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r9 = new androidx.core.content.res.GradientColorInflaterCompat$ColorStops
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
    }

    private static android.graphics.Shader.TileMode parseTileMode(int r1) {
            r0 = 1
            if (r1 == r0) goto Lc
            r0 = 2
            if (r1 == r0) goto L9
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            return r1
        L9:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            return r1
        Lc:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            return r1
    }
}
