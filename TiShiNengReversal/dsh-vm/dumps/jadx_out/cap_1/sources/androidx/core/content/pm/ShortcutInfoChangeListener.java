package androidx.core.content.pm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ShortcutInfoChangeListener {
    public ShortcutInfoChangeListener() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.AnyThread
    public void onAllShortcutsRemoved() {
            r0 = this;
            return
    }

    @androidx.annotation.AnyThread
    public void onShortcutAdded(@androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r1) {
            r0 = this;
            return
    }

    @androidx.annotation.AnyThread
    public void onShortcutRemoved(@androidx.annotation.NonNull java.util.List<java.lang.String> r1) {
            r0 = this;
            return
    }

    @androidx.annotation.AnyThread
    public void onShortcutUpdated(@androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r1) {
            r0 = this;
            return
    }

    @androidx.annotation.AnyThread
    public void onShortcutUsageReported(@androidx.annotation.NonNull java.util.List<java.lang.String> r1) {
            r0 = this;
            return
    }
}
