package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TintInfo {
    public boolean mHasTintList;
    public boolean mHasTintMode;
    public android.content.res.ColorStateList mTintList;
    public android.graphics.PorterDuff.Mode mTintMode;

    public TintInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    void clear() {
            r2 = this;
            r0 = 0
            r2.mTintList = r0
            r1 = 0
            r2.mHasTintList = r1
            r2.mTintMode = r0
            r2.mHasTintMode = r1
            return
    }
}
