package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface MutableConfig extends androidx.camera.core.impl.Config {
    <ValueT> void insertOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r1, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionPriority r2, @androidx.annotation.Nullable ValueT r3);

    <ValueT> void insertOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r1, @androidx.annotation.Nullable ValueT r2);

    @androidx.annotation.Nullable
    <ValueT> ValueT removeOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r1);
}
