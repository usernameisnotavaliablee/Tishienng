package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface KParameter extends kotlin.reflect.b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Kind extends java.lang.Enum<kotlin.reflect.KParameter.Kind> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ kotlin.reflect.KParameter.Kind[] $VALUES = null;

        @kotlin.ExperimentalContextParameters
        public static final kotlin.reflect.KParameter.Kind CONTEXT = null;
        public static final kotlin.reflect.KParameter.Kind EXTENSION_RECEIVER = null;
        public static final kotlin.reflect.KParameter.Kind INSTANCE = null;
        public static final kotlin.reflect.KParameter.Kind VALUE = null;

        private static final /* synthetic */ kotlin.reflect.KParameter.Kind[] $values() {
                r0 = 4
                kotlin.reflect.KParameter$Kind[] r0 = new kotlin.reflect.KParameter.Kind[r0]
                kotlin.reflect.KParameter$Kind r1 = kotlin.reflect.KParameter.Kind.INSTANCE
                r2 = 0
                r0[r2] = r1
                kotlin.reflect.KParameter$Kind r1 = kotlin.reflect.KParameter.Kind.CONTEXT
                r2 = 1
                r0[r2] = r1
                kotlin.reflect.KParameter$Kind r1 = kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER
                r2 = 2
                r0[r2] = r1
                kotlin.reflect.KParameter$Kind r1 = kotlin.reflect.KParameter.Kind.VALUE
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.reflect.KParameter$Kind r0 = new kotlin.reflect.KParameter$Kind
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.KParameter.Kind.INSTANCE = r0
                kotlin.reflect.KParameter$Kind r0 = new kotlin.reflect.KParameter$Kind
                java.lang.String r1 = "CONTEXT"
                r2 = 1
                r0.<init>(r1, r2)
                kotlin.reflect.KParameter.Kind.CONTEXT = r0
                kotlin.reflect.KParameter$Kind r0 = new kotlin.reflect.KParameter$Kind
                java.lang.String r1 = "EXTENSION_RECEIVER"
                r2 = 2
                r0.<init>(r1, r2)
                kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER = r0
                kotlin.reflect.KParameter$Kind r0 = new kotlin.reflect.KParameter$Kind
                java.lang.String r1 = "VALUE"
                r2 = 3
                r0.<init>(r1, r2)
                kotlin.reflect.KParameter.Kind.VALUE = r0
                kotlin.reflect.KParameter$Kind[] r0 = $values()
                kotlin.reflect.KParameter.Kind.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.reflect.KParameter.Kind.$ENTRIES = r0
                return
        }

        Kind(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<kotlin.reflect.KParameter.Kind> getEntries() {
                kotlin.enums.a r0 = kotlin.reflect.KParameter.Kind.$ENTRIES
                return r0
        }

        public static kotlin.reflect.KParameter.Kind valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.KParameter$Kind> r0 = kotlin.reflect.KParameter.Kind.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.KParameter$Kind r1 = (kotlin.reflect.KParameter.Kind) r1
                return r1
        }

        public static kotlin.reflect.KParameter.Kind[] values() {
                kotlin.reflect.KParameter$Kind[] r0 = kotlin.reflect.KParameter.Kind.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.KParameter$Kind[] r0 = (kotlin.reflect.KParameter.Kind[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        @kotlin.SinceKotlin(version = "1.1")
        public static /* synthetic */ void a() {
                return
        }
    }

    boolean a();

    int getIndex();

    @org.jetbrains.annotations.Nullable
    java.lang.String getName();

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.r getType();

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.KParameter.Kind h();

    boolean p();
}
