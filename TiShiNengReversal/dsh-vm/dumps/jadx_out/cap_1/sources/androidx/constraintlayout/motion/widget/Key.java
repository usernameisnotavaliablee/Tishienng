package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class Key {
    static final java.lang.String ALPHA = "alpha";
    static final java.lang.String CUSTOM = "CUSTOM";
    static final java.lang.String ELEVATION = "elevation";
    static final java.lang.String PIVOT_X = "transformPivotX";
    static final java.lang.String PIVOT_Y = "transformPivotY";
    static final java.lang.String PROGRESS = "progress";
    static final java.lang.String ROTATION = "rotation";
    static final java.lang.String ROTATION_X = "rotationX";
    static final java.lang.String ROTATION_Y = "rotationY";
    static final java.lang.String SCALE_X = "scaleX";
    static final java.lang.String SCALE_Y = "scaleY";
    static final java.lang.String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    static final java.lang.String TRANSLATION_X = "translationX";
    static final java.lang.String TRANSLATION_Y = "translationY";
    static final java.lang.String TRANSLATION_Z = "translationZ";
    public static int UNSET = -1;
    static final java.lang.String WAVE_OFFSET = "waveOffset";
    static final java.lang.String WAVE_PERIOD = "wavePeriod";
    static final java.lang.String WAVE_VARIES_BY = "waveVariesBy";
    java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mCustomConstraints;
    int mFramePosition;
    int mTargetId;
    java.lang.String mTargetString;
    protected int mType;

    static {
            return
    }

    public Key() {
            r1 = this;
            r1.<init>()
            int r0 = androidx.constraintlayout.motion.widget.Key.UNSET
            r1.mFramePosition = r0
            r1.mTargetId = r0
            r0 = 0
            r1.mTargetString = r0
            return
    }

    public abstract void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r1);

    abstract void getAttributeNames(java.util.HashSet<java.lang.String> r1);

    abstract void load(android.content.Context r1, android.util.AttributeSet r2);

    boolean matches(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.mTargetString
            if (r0 == 0) goto Lc
            if (r2 != 0) goto L7
            goto Lc
        L7:
            boolean r2 = r2.matches(r0)
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> r1) {
            r0 = this;
            return
    }

    public abstract void setValue(java.lang.String r1, java.lang.Object r2);

    boolean toBoolean(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto Lb
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        Lb:
            java.lang.String r2 = r2.toString()
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            return r2
    }

    float toFloat(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto Lb
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            return r2
        Lb:
            java.lang.String r2 = r2.toString()
            float r2 = java.lang.Float.parseFloat(r2)
            return r2
    }

    int toInt(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto Lb
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
        Lb:
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
            return r2
    }
}
