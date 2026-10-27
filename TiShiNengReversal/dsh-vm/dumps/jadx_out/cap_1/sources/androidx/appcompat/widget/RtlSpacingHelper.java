package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class RtlSpacingHelper {
    public static final int UNDEFINED = Integer.MIN_VALUE;
    private int mEnd;
    private int mExplicitLeft;
    private int mExplicitRight;
    private boolean mIsRelative;
    private boolean mIsRtl;
    private int mLeft;
    private int mRight;
    private int mStart;

    RtlSpacingHelper() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mLeft = r0
            r2.mRight = r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mStart = r1
            r2.mEnd = r1
            r2.mExplicitLeft = r0
            r2.mExplicitRight = r0
            r2.mIsRtl = r0
            r2.mIsRelative = r0
            return
    }

    public int getEnd() {
            r1 = this;
            boolean r0 = r1.mIsRtl
            if (r0 == 0) goto L7
            int r0 = r1.mLeft
            return r0
        L7:
            int r0 = r1.mRight
            return r0
    }

    public int getLeft() {
            r1 = this;
            int r0 = r1.mLeft
            return r0
    }

    public int getRight() {
            r1 = this;
            int r0 = r1.mRight
            return r0
    }

    public int getStart() {
            r1 = this;
            boolean r0 = r1.mIsRtl
            if (r0 == 0) goto L7
            int r0 = r1.mRight
            return r0
        L7:
            int r0 = r1.mLeft
            return r0
    }

    public void setAbsolute(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.mIsRelative = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto Lb
            r1.mExplicitLeft = r2
            r1.mLeft = r2
        Lb:
            if (r3 == r0) goto L11
            r1.mExplicitRight = r3
            r1.mRight = r3
        L11:
            return
    }

    public void setDirection(boolean r2) {
            r1 = this;
            boolean r0 = r1.mIsRtl
            if (r2 != r0) goto L5
            return
        L5:
            r1.mIsRtl = r2
            boolean r0 = r1.mIsRelative
            if (r0 == 0) goto L35
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L22
            int r2 = r1.mEnd
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.mExplicitLeft
        L16:
            r1.mLeft = r2
            int r2 = r1.mStart
            if (r2 == r0) goto L1d
            goto L1f
        L1d:
            int r2 = r1.mExplicitRight
        L1f:
            r1.mRight = r2
            return
        L22:
            int r2 = r1.mStart
            if (r2 == r0) goto L27
            goto L29
        L27:
            int r2 = r1.mExplicitLeft
        L29:
            r1.mLeft = r2
            int r2 = r1.mEnd
            if (r2 == r0) goto L30
            goto L32
        L30:
            int r2 = r1.mExplicitRight
        L32:
            r1.mRight = r2
            return
        L35:
            int r2 = r1.mExplicitLeft
            r1.mLeft = r2
            int r2 = r1.mExplicitRight
            r1.mRight = r2
            return
    }

    public void setRelative(int r3, int r4) {
            r2 = this;
            r2.mStart = r3
            r2.mEnd = r4
            r0 = 1
            r2.mIsRelative = r0
            boolean r0 = r2.mIsRtl
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L16
            if (r4 == r1) goto L11
            r2.mLeft = r4
        L11:
            if (r3 == r1) goto L1e
            r2.mRight = r3
            return
        L16:
            if (r3 == r1) goto L1a
            r2.mLeft = r3
        L1a:
            if (r4 == r1) goto L1e
            r2.mRight = r4
        L1e:
            return
    }
}
