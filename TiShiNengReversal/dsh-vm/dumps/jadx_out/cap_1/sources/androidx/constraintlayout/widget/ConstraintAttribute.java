package androidx.constraintlayout.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ConstraintAttribute {
    private static final java.lang.String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    java.lang.String mName;
    private java.lang.String mStringValue;
    private androidx.constraintlayout.widget.ConstraintAttribute.AttributeType mType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = null;

        static {
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AttributeType extends java.lang.Enum<androidx.constraintlayout.widget.ConstraintAttribute.AttributeType> {
        private static final /* synthetic */ androidx.constraintlayout.widget.ConstraintAttribute.AttributeType[] $VALUES = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType BOOLEAN_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType COLOR_DRAWABLE_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType COLOR_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType DIMENSION_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType FLOAT_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType INT_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType STRING_TYPE = null;

        static {
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r1 = "INT_TYPE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r3 = "FLOAT_TYPE"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE = r1
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r5 = "COLOR_TYPE"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE = r3
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r5 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r7 = "COLOR_DRAWABLE_TYPE"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE = r5
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r7 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r9 = "STRING_TYPE"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE = r7
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r9 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r11 = "BOOLEAN_TYPE"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE = r9
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r11 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r13 = "DIMENSION_TYPE"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE = r11
                r13 = 7
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r13 = new androidx.constraintlayout.widget.ConstraintAttribute.AttributeType[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.$VALUES = r13
                return
        }

        AttributeType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.widget.ConstraintAttribute.AttributeType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.widget.ConstraintAttribute$AttributeType> r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = (androidx.constraintlayout.widget.ConstraintAttribute.AttributeType) r1
                return r1
        }

        public static androidx.constraintlayout.widget.ConstraintAttribute.AttributeType[] values() {
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = (androidx.constraintlayout.widget.ConstraintAttribute.AttributeType[]) r0
                return r0
        }
    }

    public ConstraintAttribute(androidx.constraintlayout.widget.ConstraintAttribute r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.mName
            r1.mName = r0
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = r2.mType
            r1.mType = r2
            r1.setValue(r3)
            return
    }

    public ConstraintAttribute(java.lang.String r1, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType r2) {
            r0 = this;
            r0.<init>()
            r0.mName = r1
            r0.mType = r2
            return
    }

    public ConstraintAttribute(java.lang.String r1, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.mName = r1
            r0.mType = r2
            r0.setValue(r3)
            return
    }

    private static int clamp(int r1) {
            int r0 = r1 >> 31
            int r0 = ~r0
            r1 = r1 & r0
            int r1 = r1 + (-255)
            int r0 = r1 >> 31
            r1 = r1 & r0
            int r1 = r1 + 255
            return r1
    }

    public static java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> extractAttributes(java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r7, android.view.View r8) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class r1 = r8.getClass()
            java.util.Set r2 = r7.keySet()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r4 = (androidx.constraintlayout.widget.ConstraintAttribute) r4
            java.lang.String r5 = "BackgroundColor"
            boolean r5 = r3.equals(r5)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L44
            android.graphics.drawable.Drawable r5 = r8.getBackground()     // Catch: java.lang.Throwable -> L42
            android.graphics.drawable.ColorDrawable r5 = (android.graphics.drawable.ColorDrawable) r5     // Catch: java.lang.Throwable -> L42
            int r5 = r5.getColor()     // Catch: java.lang.Throwable -> L42
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L42
            androidx.constraintlayout.widget.ConstraintAttribute r6 = new androidx.constraintlayout.widget.ConstraintAttribute     // Catch: java.lang.Throwable -> L42
            r6.<init>(r4, r5)     // Catch: java.lang.Throwable -> L42
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L42
            goto L11
        L42:
            goto L11
        L44:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r5.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = "getMap"
            r5.append(r6)     // Catch: java.lang.Throwable -> L42
            r5.append(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L42
            r6 = 0
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r5 = r5.invoke(r8, r6)     // Catch: java.lang.Throwable -> L42
            androidx.constraintlayout.widget.ConstraintAttribute r6 = new androidx.constraintlayout.widget.ConstraintAttribute     // Catch: java.lang.Throwable -> L42
            r6.<init>(r4, r5)     // Catch: java.lang.Throwable -> L42
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L42
            goto L11
        L67:
            return r0
    }

    public static void parse(android.content.Context r11, org.xmlpull.v1.XmlPullParser r12, java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13) {
            android.util.AttributeSet r12 = android.util.Xml.asAttributeSet(r12)
            int[] r0 = androidx.constraintlayout.widget.R.styleable.CustomAttribute
            android.content.res.TypedArray r12 = r11.obtainStyledAttributes(r12, r0)
            int r0 = r12.getIndexCount()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r3
            r5 = 0
        L13:
            if (r5 >= r0) goto Ld3
            int r6 = r12.getIndex(r5)
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_attributeName
            r8 = 1
            if (r6 != r7) goto L47
            java.lang.String r1 = r12.getString(r6)
            if (r1 == 0) goto Lcf
            int r6 = r1.length()
            if (r6 <= 0) goto Lcf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            char r7 = r1.charAt(r2)
            char r7 = java.lang.Character.toUpperCase(r7)
            r6.append(r7)
            java.lang.String r1 = r1.substring(r8)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            goto Lcf
        L47:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customBoolean
            if (r6 != r7) goto L57
            boolean r3 = r12.getBoolean(r6, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r4 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE
            goto Lcf
        L57:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customColorValue
            if (r6 != r7) goto L69
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE
            int r4 = r12.getColor(r6, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L65:
            r10 = r4
            r4 = r3
            r3 = r10
            goto Lcf
        L69:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customColorDrawableValue
            if (r6 != r7) goto L78
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE
            int r4 = r12.getColor(r6, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L65
        L78:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customPixelDimension
            r9 = 0
            if (r6 != r7) goto L94
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE
            float r4 = r12.getDimension(r6, r9)
            android.content.res.Resources r6 = r11.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r4 = android.util.TypedValue.applyDimension(r8, r4, r6)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L65
        L94:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customDimension
            if (r6 != r7) goto La3
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE
            float r4 = r12.getDimension(r6, r9)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L65
        La3:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customFloatValue
            if (r6 != r7) goto Lb4
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
            r4 = 2143289344(0x7fc00000, float:NaN)
            float r4 = r12.getFloat(r6, r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L65
        Lb4:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customIntegerValue
            if (r6 != r7) goto Lc4
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE
            r4 = -1
            int r4 = r12.getInteger(r6, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L65
        Lc4:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customStringValue
            if (r6 != r7) goto Lcf
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE
            java.lang.String r4 = r12.getString(r6)
            goto L65
        Lcf:
            int r5 = r5 + 1
            goto L13
        Ld3:
            if (r1 == 0) goto Ldf
            if (r3 == 0) goto Ldf
            androidx.constraintlayout.widget.ConstraintAttribute r11 = new androidx.constraintlayout.widget.ConstraintAttribute
            r11.<init>(r1, r4, r3)
            r13.put(r1, r11)
        Ldf:
            r12.recycle()
            return
    }

    public static void setAttributes(android.view.View r9, java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r10) {
            java.lang.Class r0 = r9.getClass()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf1
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r3 = (androidx.constraintlayout.widget.ConstraintAttribute) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "set"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            int[] r4 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r5 = r3.mType     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c
            int r5 = r5.ordinal()     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c
            r4 = r4[r5]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c
            r5 = 0
            r6 = 1
            java.lang.Class r7 = java.lang.Integer.TYPE
            java.lang.Class r8 = java.lang.Float.TYPE
            switch(r4) {
                case 1: goto Ld5;
                case 2: goto Lb8;
                case 3: goto La1;
                case 4: goto L8a;
                case 5: goto L76;
                case 6: goto L5e;
                case 7: goto L43;
                default: goto L42;
            }
        L42:
            goto Lc
        L43:
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4[r5] = r8     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.reflect.Method r2 = r0.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            float r3 = r3.mFloatValue     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4[r5] = r3     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r2.invoke(r9, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            goto Lc
        L59:
            r2 = move-exception
            goto Lec
        L5c:
            goto Lc
        L5e:
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4[r5] = r7     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.reflect.Method r2 = r0.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            boolean r3 = r3.mBooleanValue     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4[r5] = r3     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r2.invoke(r9, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            goto Lc
        L76:
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Class<java.lang.CharSequence> r7 = java.lang.CharSequence.class
            r4[r5] = r7     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.reflect.Method r2 = r0.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.String r3 = r3.mStringValue     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4[r5] = r3     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r2.invoke(r9, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            goto Lc
        L8a:
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4[r5] = r8     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.reflect.Method r2 = r0.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            float r3 = r3.mFloatValue     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4[r5] = r3     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r2.invoke(r9, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            goto Lc
        La1:
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4[r5] = r7     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.reflect.Method r2 = r0.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            int r3 = r3.mIntegerValue     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4[r5] = r3     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r2.invoke(r9, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            goto Lc
        Lb8:
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Class<android.graphics.drawable.Drawable> r7 = android.graphics.drawable.Drawable.class
            r4[r5] = r7     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.reflect.Method r2 = r0.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4.<init>()     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            int r3 = r3.mColorValue     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4.setColor(r3)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r2.invoke(r9, r3)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            goto Lc
        Ld5:
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4[r5] = r7     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.reflect.Method r2 = r0.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            int r3 = r3.mColorValue     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r4[r5] = r3     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            r2.invoke(r9, r4)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.Throwable -> L5c java.lang.Throwable -> L5c
            goto Lc
        Lec:
            r2.getMessage()
            goto Lc
        Lf1:
            return
    }

    public boolean diff(androidx.constraintlayout.widget.ConstraintAttribute r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L4a
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r3.mType
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = r4.mType
            if (r1 == r2) goto La
            goto L4a
        La:
            int[] r2 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            switch(r1) {
                case 1: goto L43;
                case 2: goto L43;
                case 3: goto L3b;
                case 4: goto L31;
                case 5: goto L29;
                case 6: goto L21;
                case 7: goto L17;
                default: goto L16;
            }
        L16:
            return r0
        L17:
            float r1 = r3.mFloatValue
            float r4 = r4.mFloatValue
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L20
            return r2
        L20:
            return r0
        L21:
            boolean r1 = r3.mBooleanValue
            boolean r4 = r4.mBooleanValue
            if (r1 != r4) goto L28
            return r2
        L28:
            return r0
        L29:
            int r1 = r3.mIntegerValue
            int r4 = r4.mIntegerValue
            if (r1 != r4) goto L30
            return r2
        L30:
            return r0
        L31:
            float r1 = r3.mFloatValue
            float r4 = r4.mFloatValue
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L3a
            return r2
        L3a:
            return r0
        L3b:
            int r1 = r3.mIntegerValue
            int r4 = r4.mIntegerValue
            if (r1 != r4) goto L42
            return r2
        L42:
            return r0
        L43:
            int r1 = r3.mColorValue
            int r4 = r4.mColorValue
            if (r1 != r4) goto L4a
            return r2
        L4a:
            return r0
    }

    public androidx.constraintlayout.widget.ConstraintAttribute.AttributeType getType() {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = r1.mType
            return r0
    }

    public float getValueToInterpolate() {
            r2 = this;
            int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2b;
                case 2: goto L2b;
                case 3: goto L27;
                case 4: goto L24;
                case 5: goto L1c;
                case 6: goto L13;
                case 7: goto L10;
                default: goto Ld;
            }
        Ld:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        L10:
            float r0 = r2.mFloatValue
            return r0
        L13:
            boolean r0 = r2.mBooleanValue
            if (r0 == 0) goto L19
            r0 = 0
            return r0
        L19:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L1c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot interpolate String"
            r0.<init>(r1)
            throw r0
        L24:
            float r0 = r2.mFloatValue
            return r0
        L27:
            int r0 = r2.mIntegerValue
            float r0 = (float) r0
            return r0
        L2b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Color does not have a single color to interpolate"
            r0.<init>(r1)
            throw r0
    }

    public void getValuesToInterpolate(float[] r11) {
            r10 = this;
            int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r10.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L32;
                case 2: goto L32;
                case 3: goto L2c;
                case 4: goto L27;
                case 5: goto L1f;
                case 6: goto L14;
                case 7: goto Lf;
                default: goto Le;
            }
        Le:
            return
        Lf:
            float r0 = r10.mFloatValue
            r11[r1] = r0
            return
        L14:
            boolean r0 = r10.mBooleanValue
            if (r0 == 0) goto L1a
            r0 = 0
            goto L1c
        L1a:
            r0 = 1065353216(0x3f800000, float:1.0)
        L1c:
            r11[r1] = r0
            return
        L1f:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Color does not have a single color to interpolate"
            r11.<init>(r0)
            throw r11
        L27:
            float r0 = r10.mFloatValue
            r11[r1] = r0
            return
        L2c:
            int r0 = r10.mIntegerValue
            float r0 = (float) r0
            r11[r1] = r0
            return
        L32:
            int r0 = r10.mColorValue
            int r2 = r0 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            r5 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r5
            double r6 = (double) r3
            r8 = 4612136378390124954(0x400199999999999a, double:2.2)
            double r6 = java.lang.Math.pow(r6, r8)
            float r3 = (float) r6
            float r4 = (float) r4
            float r4 = r4 / r5
            double r6 = (double) r4
            double r6 = java.lang.Math.pow(r6, r8)
            float r4 = (float) r6
            float r0 = (float) r0
            float r0 = r0 / r5
            double r6 = (double) r0
            double r6 = java.lang.Math.pow(r6, r8)
            float r0 = (float) r6
            r11[r1] = r3
            r1 = 1
            r11[r1] = r4
            r1 = 2
            r11[r1] = r0
            float r0 = (float) r2
            float r0 = r0 / r5
            r1 = 3
            r11[r1] = r0
            return
    }

    public int noOfInterpValues() {
            r3 = this;
            int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r3.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L11
            r2 = 2
            if (r0 == r2) goto L11
            return r1
        L11:
            r0 = 4
            return r0
    }

    public void setColorValue(int r1) {
            r0 = this;
            r0.mColorValue = r1
            return
    }

    public void setFloatValue(float r1) {
            r0 = this;
            r0.mFloatValue = r1
            return
    }

    public void setIntValue(int r1) {
            r0 = this;
            r0.mIntegerValue = r1
            return
    }

    public void setInterpolatedValue(android.view.View r13, float[] r14) {
            r12 = this;
            java.lang.Class r0 = r13.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "set"
            r1.append(r2)
            java.lang.String r2 = r12.mName
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            int[] r2 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = r12.mType     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r3 = r3.ordinal()     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r2 = r2[r3]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r3 = 3
            r4 = 2
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Class r6 = java.lang.Float.TYPE
            r7 = 1
            r8 = 4601859982876761367(0x3fdd1745d1745d17, double:0.45454545454545453)
            r10 = 0
            r11 = 1132396544(0x437f0000, float:255.0)
            switch(r2) {
                case 1: goto L10b;
                case 2: goto Lb2;
                case 3: goto L9b;
                case 4: goto L85;
                case 5: goto L6c;
                case 6: goto L4b;
                case 7: goto L35;
                default: goto L33;
            }
        L33:
            goto L165
        L35:
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r2[r10] = r6     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r14 = r14[r10]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.Float r14 = java.lang.Float.valueOf(r14)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r1[r10] = r14     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r0.invoke(r13, r1)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            return
        L4b:
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r2[r10] = r3     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r14 = r14[r10]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r1 = 1056964608(0x3f000000, float:0.5)
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 <= 0) goto L5f
            r14 = 1
            goto L60
        L5f:
            r14 = 0
        L60:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r1[r10] = r14     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r0.invoke(r13, r1)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            return
        L6c:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r0.<init>()     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.String r1 = "unable to interpolate strings "
            r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.String r1 = r12.mName     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.String r0 = r0.toString()     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r14.<init>(r0)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            throw r14     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
        L85:
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r2[r10] = r6     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r14 = r14[r10]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.Float r14 = java.lang.Float.valueOf(r14)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r1[r10] = r14     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r0.invoke(r13, r1)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            return
        L9b:
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r2[r10] = r5     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r14 = r14[r10]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r14 = (int) r14     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r1[r10] = r14     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r0.invoke(r13, r1)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            return
        Lb2:
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.Class<android.graphics.drawable.Drawable> r5 = android.graphics.drawable.Drawable.class
            r2[r10] = r5     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r1 = r14[r10]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r1 = (double) r1     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r1 = java.lang.Math.pow(r1, r8)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r1 = (float) r1     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r1 = r1 * r11
            int r1 = (int) r1     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r1 = clamp(r1)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r2 = r14[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r5 = (double) r2     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r5 = java.lang.Math.pow(r5, r8)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r2 = (float) r5     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r2 = r2 * r11
            int r2 = (int) r2     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r2 = clamp(r2)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r4 = r14[r4]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r4 = (double) r4     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r4 = java.lang.Math.pow(r4, r8)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r4 = (float) r4     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r4 = r4 * r11
            int r4 = (int) r4     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r4 = clamp(r4)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r14 = r14[r3]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r14 = r14 * r11
            int r14 = (int) r14     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r14 = clamp(r14)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r14 = r14 << 24
            int r1 = r1 << 16
            r14 = r14 | r1
            int r1 = r2 << 8
            r14 = r14 | r1
            r14 = r14 | r4
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r1.<init>()     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r1.setColor(r14)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r14[r10] = r1     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r0.invoke(r13, r14)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            return
        L10b:
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r2[r10] = r5     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r1 = r14[r10]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r1 = (double) r1     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r1 = java.lang.Math.pow(r1, r8)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r1 = (float) r1     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r1 = r1 * r11
            int r1 = (int) r1     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r1 = clamp(r1)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r2 = r14[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r5 = (double) r2     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r5 = java.lang.Math.pow(r5, r8)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r2 = (float) r5     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r2 = r2 * r11
            int r2 = (int) r2     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r2 = clamp(r2)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r4 = r14[r4]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r4 = (double) r4     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            double r4 = java.lang.Math.pow(r4, r8)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r4 = (float) r4     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r4 = r4 * r11
            int r4 = (int) r4     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r4 = clamp(r4)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r14 = r14[r3]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            float r14 = r14 * r11
            int r14 = (int) r14     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r14 = clamp(r14)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            int r14 = r14 << 24
            int r1 = r1 << 16
            r14 = r14 | r1
            int r1 = r2 << 8
            r14 = r14 | r1
            r14 = r14 | r4
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r1[r10] = r14     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            r0.invoke(r13, r1)     // Catch: java.lang.IllegalAccessException -> L15e java.lang.NoSuchMethodException -> L162 java.lang.reflect.InvocationTargetException -> L165
            return
        L15e:
            androidx.constraintlayout.motion.widget.Debug.getName(r13)
            goto L165
        L162:
            androidx.constraintlayout.motion.widget.Debug.getName(r13)
        L165:
            return
    }

    public void setStringValue(java.lang.String r1) {
            r0 = this;
            r0.mStringValue = r1
            return
    }

    public void setValue(java.lang.Object r3) {
            r2 = this;
            int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L37;
                case 2: goto L37;
                case 3: goto L2e;
                case 4: goto L25;
                case 5: goto L20;
                case 6: goto L17;
                case 7: goto Le;
                default: goto Ld;
            }
        Ld:
            return
        Le:
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.mFloatValue = r3
            return
        L17:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.mBooleanValue = r3
            return
        L20:
            java.lang.String r3 = (java.lang.String) r3
            r2.mStringValue = r3
            return
        L25:
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.mFloatValue = r3
            return
        L2e:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.mIntegerValue = r3
            return
        L37:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.mColorValue = r3
            return
    }

    public void setValue(float[] r7) {
            r6 = this;
            int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r6.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L34;
                case 2: goto L34;
                case 3: goto L2e;
                case 4: goto L29;
                case 5: goto L21;
                case 6: goto L14;
                case 7: goto Lf;
                default: goto Le;
            }
        Le:
            return
        Lf:
            r7 = r7[r1]
            r6.mFloatValue = r7
            return
        L14:
            r7 = r7[r1]
            double r2 = (double) r7
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L1e
            r1 = 1
        L1e:
            r6.mBooleanValue = r1
            return
        L21:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Color does not have a single color to interpolate"
            r7.<init>(r0)
            throw r7
        L29:
            r7 = r7[r1]
            r6.mFloatValue = r7
            return
        L2e:
            r7 = r7[r1]
            int r7 = (int) r7
            r6.mIntegerValue = r7
            return
        L34:
            int r0 = android.graphics.Color.HSVToColor(r7)
            r6.mColorValue = r0
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            r1 = 3
            r7 = r7[r1]
            r1 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 * r1
            int r7 = (int) r7
            int r7 = clamp(r7)
            int r7 = r7 << 24
            r7 = r7 | r0
            r6.mColorValue = r7
            return
    }
}
