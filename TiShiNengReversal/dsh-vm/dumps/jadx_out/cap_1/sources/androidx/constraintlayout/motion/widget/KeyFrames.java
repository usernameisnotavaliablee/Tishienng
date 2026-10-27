package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class KeyFrames {
    private static final java.lang.String TAG = "KeyFrames";
    public static final int UNSET = -1;
    static java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> sKeyMakers;
    private java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> mFramesMap;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers = r0
            java.lang.String r1 = "KeyAttribute"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyAttributes> r2 = androidx.constraintlayout.motion.widget.KeyAttributes.class
            r3 = 0
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L47
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L47
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L47
            java.lang.String r1 = "KeyPosition"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyPosition> r2 = androidx.constraintlayout.motion.widget.KeyPosition.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L47
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L47
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L47
            java.lang.String r1 = "KeyCycle"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyCycle> r2 = androidx.constraintlayout.motion.widget.KeyCycle.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L47
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L47
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L47
            java.lang.String r1 = "KeyTimeCycle"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyTimeCycle> r2 = androidx.constraintlayout.motion.widget.KeyTimeCycle.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L47
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L47
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L47
            java.lang.String r1 = "KeyTrigger"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyTrigger> r2 = androidx.constraintlayout.motion.widget.KeyTrigger.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L47
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L47
        L47:
            return
    }

    public KeyFrames(android.content.Context r5, org.xmlpull.v1.XmlPullParser r6) {
            r4 = this;
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.mFramesMap = r0
            int r0 = r6.getEventType()     // Catch: java.lang.Throwable -> L63
            r1 = 0
            r2 = r1
        L10:
            r3 = 1
            if (r0 == r3) goto L63
            r3 = 2
            if (r0 == r3) goto L27
            r3 = 3
            if (r0 == r3) goto L1a
            goto L5e
        L1a:
            java.lang.String r0 = "KeyFrameSet"
            java.lang.String r3 = r6.getName()     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L5e
            goto L63
        L27:
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Throwable -> L63
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r3 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.Throwable -> L63
            boolean r3 = r3.containsKey(r0)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L4d
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r3 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.Exception -> L5e
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Exception -> L5e
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.lang.Exception -> L5e
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L5e
            androidx.constraintlayout.motion.widget.Key r0 = (androidx.constraintlayout.motion.widget.Key) r0     // Catch: java.lang.Exception -> L5e
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r6)     // Catch: java.lang.Exception -> L4b
            r0.load(r5, r2)     // Catch: java.lang.Exception -> L4b
            r4.addKey(r0)     // Catch: java.lang.Exception -> L4b
        L4b:
            r2 = r0
            goto L5e
        L4d:
            java.lang.String r3 = "CustomAttribute"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L63
            if (r0 == 0) goto L5e
            if (r2 == 0) goto L5e
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.mCustomConstraints     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L63
            if (r0 == 0) goto L5e
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r5, r6, r0)     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L63
        L5e:
            int r0 = r6.next()     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L63
            goto L10
        L63:
            return
    }

    private void addKey(androidx.constraintlayout.motion.widget.Key r4) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            int r1 = r4.mTargetId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1e
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            int r1 = r4.mTargetId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.put(r1, r2)
        L1e:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            int r1 = r4.mTargetId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            return
    }

    static java.lang.String name(int r0, android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r0 = r1.getResourceEntryName(r0)
            return r0
    }

    public void addFrames(androidx.constraintlayout.motion.widget.MotionController r4) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            int r1 = r4.mId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L13
            r4.addKeys(r0)
        L13:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L46
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.Key r1 = (androidx.constraintlayout.motion.widget.Key) r1
            android.view.View r2 = r4.mView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            java.lang.String r2 = r2.constraintTag
            boolean r2 = r1.matches(r2)
            if (r2 == 0) goto L26
            r4.addKey(r1)
            goto L26
        L46:
            return
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> getKeyFramesForView(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r1.mFramesMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            return r2
    }

    public java.util.Set<java.lang.Integer> getKeys() {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r1.mFramesMap
            java.util.Set r0 = r0.keySet()
            return r0
    }
}
