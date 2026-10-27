package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
interface ProxyInterface {
    int designAccess(int r1, java.lang.String r2, java.lang.Object r3, float[] r4, int r5, float[] r6, int r7);

    float getKeyFramePosition(java.lang.Object r1, int r2, float r3, float r4);

    java.lang.Object getKeyframeAtLocation(java.lang.Object r1, float r2, float r3);

    java.lang.Boolean getPositionKeyframe(java.lang.Object r1, java.lang.Object r2, float r3, float r4, java.lang.String[] r5, float[] r6);

    long getTransitionTimeMs();

    void setAttributes(int r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4);

    void setKeyFrame(java.lang.Object r1, int r2, java.lang.String r3, java.lang.Object r4);

    boolean setKeyFramePosition(java.lang.Object r1, int r2, int r3, float r4, float r5);

    void setToolPosition(float r1);
}
