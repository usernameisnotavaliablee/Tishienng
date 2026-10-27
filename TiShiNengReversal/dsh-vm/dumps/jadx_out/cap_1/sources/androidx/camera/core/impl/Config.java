package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface Config {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class Option<T> {
        Option() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static <T> androidx.camera.core.impl.Config.Option<T> create(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<?> r2) {
                r0 = 0
                androidx.camera.core.impl.Config$Option r1 = create(r1, r2, r0)
                return r1
        }

        @androidx.annotation.NonNull
        public static <T> androidx.camera.core.impl.Config.Option<T> create(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<?> r2, @androidx.annotation.Nullable java.lang.Object r3) {
                androidx.camera.core.impl.AutoValue_Config_Option r0 = new androidx.camera.core.impl.AutoValue_Config_Option
                r0.<init>(r1, r2, r3)
                return r0
        }

        @androidx.annotation.NonNull
        public abstract java.lang.String getId();

        @androidx.annotation.Nullable
        public abstract java.lang.Object getToken();

        @androidx.annotation.NonNull
        public abstract java.lang.Class<T> getValueClass();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OptionMatcher {
        boolean onOptionMatched(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum OptionPriority extends java.lang.Enum<androidx.camera.core.impl.Config.OptionPriority> {
        private static final /* synthetic */ androidx.camera.core.impl.Config.OptionPriority[] $VALUES = null;
        public static final androidx.camera.core.impl.Config.OptionPriority ALWAYS_OVERRIDE = null;
        public static final androidx.camera.core.impl.Config.OptionPriority OPTIONAL = null;
        public static final androidx.camera.core.impl.Config.OptionPriority REQUIRED = null;

        private static /* synthetic */ androidx.camera.core.impl.Config.OptionPriority[] $values() {
                r0 = 3
                androidx.camera.core.impl.Config$OptionPriority[] r0 = new androidx.camera.core.impl.Config.OptionPriority[r0]
                androidx.camera.core.impl.Config$OptionPriority r1 = androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.Config$OptionPriority r1 = androidx.camera.core.impl.Config.OptionPriority.REQUIRED
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.impl.Config$OptionPriority r1 = androidx.camera.core.impl.Config.OptionPriority.OPTIONAL
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.Config$OptionPriority r0 = new androidx.camera.core.impl.Config$OptionPriority
                java.lang.String r1 = "ALWAYS_OVERRIDE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE = r0
                androidx.camera.core.impl.Config$OptionPriority r0 = new androidx.camera.core.impl.Config$OptionPriority
                java.lang.String r1 = "REQUIRED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.impl.Config.OptionPriority.REQUIRED = r0
                androidx.camera.core.impl.Config$OptionPriority r0 = new androidx.camera.core.impl.Config$OptionPriority
                java.lang.String r1 = "OPTIONAL"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.impl.Config.OptionPriority.OPTIONAL = r0
                androidx.camera.core.impl.Config$OptionPriority[] r0 = $values()
                androidx.camera.core.impl.Config.OptionPriority.$VALUES = r0
                return
        }

        OptionPriority(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.Config.OptionPriority valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.Config$OptionPriority> r0 = androidx.camera.core.impl.Config.OptionPriority.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.Config$OptionPriority r1 = (androidx.camera.core.impl.Config.OptionPriority) r1
                return r1
        }

        public static androidx.camera.core.impl.Config.OptionPriority[] values() {
                androidx.camera.core.impl.Config$OptionPriority[] r0 = androidx.camera.core.impl.Config.OptionPriority.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.Config$OptionPriority[] r0 = (androidx.camera.core.impl.Config.OptionPriority[]) r0
                return r0
        }
    }

    boolean containsOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r1);

    void findOptions(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionMatcher r2);

    @androidx.annotation.NonNull
    androidx.camera.core.impl.Config.OptionPriority getOptionPriority(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r1);

    @androidx.annotation.NonNull
    java.util.Set<androidx.camera.core.impl.Config.OptionPriority> getPriorities(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r1);

    @androidx.annotation.NonNull
    java.util.Set<androidx.camera.core.impl.Config.Option<?>> listOptions();

    @androidx.annotation.Nullable
    <ValueT> ValueT retrieveOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r1);

    @androidx.annotation.Nullable
    <ValueT> ValueT retrieveOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r1, @androidx.annotation.Nullable ValueT r2);

    @androidx.annotation.Nullable
    <ValueT> ValueT retrieveOptionWithPriority(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<ValueT> r1, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionPriority r2);
}
