package androidx.activity.contextaware;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ContextAware {
    void addOnContextAvailableListener(@org.jetbrains.annotations.NotNull androidx.activity.contextaware.OnContextAvailableListener r1);

    @org.jetbrains.annotations.Nullable
    android.content.Context peekAvailableContext();

    void removeOnContextAvailableListener(@org.jetbrains.annotations.NotNull androidx.activity.contextaware.OnContextAvailableListener r1);
}
