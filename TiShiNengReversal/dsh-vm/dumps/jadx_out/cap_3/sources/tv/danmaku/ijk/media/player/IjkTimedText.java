package tv.danmaku.ijk.media.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class IjkTimedText {
    private android.graphics.Rect mTextBounds;
    private java.lang.String mTextChars;

    public IjkTimedText(android.graphics.Rect r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.mTextBounds = r1
            r0.mTextChars = r2
            return
    }

    public android.graphics.Rect getBounds() {
            r1 = this;
            android.graphics.Rect r0 = r1.mTextBounds
            return r0
    }

    public java.lang.String getText() {
            r1 = this;
            java.lang.String r0 = r1.mTextChars
            return r0
    }
}
