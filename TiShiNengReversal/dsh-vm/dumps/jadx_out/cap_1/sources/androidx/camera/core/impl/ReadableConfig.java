package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ReadableConfig extends androidx.camera.core.impl.Config {
    @Override // androidx.camera.core.impl.Config
    boolean containsOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r1);

    @Override // androidx.camera.core.impl.Config
    void findOptions(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionMatcher r2);

    @androidx.annotation.NonNull
    androidx.camera.core.impl.Config getConfig();

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.NonNull
    androidx.camera.core.impl.Config.OptionPriority getOptionPriority(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r1);

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.NonNull
    java.util.Set<androidx.camera.core.impl.Config.OptionPriority> getPriorities(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r1);

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.NonNull
    java.util.Set<androidx.camera.core.impl.Config.Option<?>> listOptions();

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.Nullable
    <ValueT> ValueT retrieveOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r1);

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.Nullable
    <ValueT> ValueT retrieveOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r1, @androidx.annotation.Nullable ValueT r2);

    @Override // androidx.camera.core.impl.Config
    @androidx.annotation.Nullable
    <ValueT> ValueT retrieveOptionWithPriority(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r1, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionPriority r2);
}
