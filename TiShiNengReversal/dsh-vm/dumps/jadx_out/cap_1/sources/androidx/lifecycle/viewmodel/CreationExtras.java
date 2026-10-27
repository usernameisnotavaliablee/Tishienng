package androidx.lifecycle.viewmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class CreationExtras {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<androidx.lifecycle.viewmodel.CreationExtras.Key<?>, java.lang.Object> map;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Empty extends androidx.lifecycle.viewmodel.CreationExtras {

        @org.jetbrains.annotations.NotNull
        public static final androidx.lifecycle.viewmodel.CreationExtras.Empty INSTANCE = null;

        static {
                androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = new androidx.lifecycle.viewmodel.CreationExtras$Empty
                r0.<init>()
                androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE = r0
                return
        }

        private Empty() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        @org.jetbrains.annotations.Nullable
        public <T> T get(@org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras.Key<T> r2) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Key<T> {
    }

    public CreationExtras() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.map = r0
            return
    }

    @org.jetbrains.annotations.Nullable
    public abstract <T> T get(@org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras.Key<T> r1);

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<androidx.lifecycle.viewmodel.CreationExtras.Key<?>, java.lang.Object> getMap$lifecycle_viewmodel_release() {
            r1 = this;
            java.util.Map<androidx.lifecycle.viewmodel.CreationExtras$Key<?>, java.lang.Object> r0 = r1.map
            return r0
    }
}
