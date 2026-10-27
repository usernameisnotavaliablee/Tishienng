package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SavedStateHandlesVM extends androidx.lifecycle.ViewModel {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle> handles;

    public SavedStateHandlesVM() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.handles = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle> getHandles() {
            r1 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle> r0 = r1.handles
            return r0
    }
}
